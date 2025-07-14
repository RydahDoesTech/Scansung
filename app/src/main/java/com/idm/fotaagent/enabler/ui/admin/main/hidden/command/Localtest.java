package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.idm.adapter.common.IDMCommonUtils;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.InitExecutor;
import com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory.InsufficientMemoryToAllocateException;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseProfile;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.IDMDatabaseMoNodeManager;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.interfaces.IntentActions;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.exception.LocalTestDoNothingException;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.exception.LocalTestResetRequiredException;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.CopyAndUpdateTrigger;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageConstants;
import com.idm.fotaagent.utils.storage.StorageType;
import com.idm.providers.mo.exception.IDMMoExceptionNotFound;
import com.idm.service.actioninfo.IDMActionInfo;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.NativeUtils;
import com.wssyncmldm.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Localtest extends HiddenCommand {
    public Localtest(Context context) {
        super(context);
    }

    private List<String> getDeltaList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IDMApplication.idmGetContext().getApplicationInfo().dataDir);
        arrayList.add("/data/fota/");
        arrayList.add(getExternalPath() + "/fota/");
        arrayList.add(getExternalPath() + "/");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Log.I("path : " + str);
            File file = new File(str);
            if (file.exists()) {
                try {
                    File[] fileArrListFiles = file.listFiles(new a(1));
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file2 : fileArrListFiles) {
                            arrayList2.add(str + file2.getName());
                            Log.I(file2.getName());
                        }
                    }
                } catch (Exception e5) {
                    Log.printStackTrace(e5, "file list error!! return...");
                }
            }
        }
        return arrayList2;
    }

    private boolean isF2FSTypeOfData() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return false;
                    }
                    String[] strArrSplit = line.split(" ");
                    String str = strArrSplit[1];
                    String str2 = strArrSplit[2];
                    if ("/data".equals(str) && "f2fs".equals(str2)) {
                        bufferedReader.close();
                        return true;
                    }
                } finally {
                }
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkMemory$2(DialogInterface dialogInterface, int i5) {
        try {
            Intent intent = new Intent(IntentActions.IDM_INTENT_STORAGE_ANALYSIS);
            intent.setClassName("com.android.settings", "com.samsung.android.settings.analyzestorage.ui.MainActivity");
            intent.setFlags(268468224);
            this.context.startActivity(intent);
        } catch (ActivityNotFoundException e5) {
            Log.printStackTrace(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$1(List list, DialogInterface dialogInterface, int i5) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        Log.I("item is... " + checkedItemPosition + "\nDelta File Name is " + ((String) list.get(checkedItemPosition)));
        try {
            startLocalTest((String) list.get(checkedItemPosition));
        } catch (LocalTestDoNothingException e5) {
            Log.printStackTrace(e5);
        } catch (LocalTestResetRequiredException e6) {
            Log.printStackTrace(e6);
            showToast("FAIL_VERIFY");
            IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
        }
    }

    private void startLocalTest(String str) throws LocalTestResetRequiredException, LocalTestDoNothingException {
        Log.I("");
        check(str);
        String strCreateDatabase = createDatabase();
        prepare(strCreateDatabase, str);
        checkMemory(strCreateDatabase);
        executeLocalTest(strCreateDatabase, str);
    }

    public void check(String str) throws LocalTestDoNothingException {
        if (InitExecutor.get().isDmInitialized()) {
            return;
        }
        showToast("Now initializing. Try again later");
        Log.I("Initializing or failed");
        throw new LocalTestDoNothingException();
    }

    public void checkMemory(String str) throws LocalTestResetRequiredException {
        try {
            MemoryHandler.createInstance(str, FumoMemoryHandler.CheckStatus.DOWNLOADABLE).check();
        } catch (InsufficientMemoryException | InvalidStateException e5) {
            if (e5 instanceof InsufficientMemoryToAllocateException) {
                new AlertDialog.Builder(this.context).setTitle(this.context.getString(R.string.STR_INSUFFICIENT_MEMORY_TITLE) + "\n").setMessage(String.format(this.context.getString(ResourceGenerator.get().getInsufficientMemoryMessageId()), new DecimalFormat("###0").format(((InsufficientMemoryToAllocateException) e5).getRequiredBytes() / StorageConstants.MEGA_BYTES) + this.context.getString(R.string.STR_COMMON_MEGA_BYTE))).setPositiveButton(R.string.STR_BTN_GO_STORAGE, new d(0, this)).setNegativeButton(R.string.STR_BTN_CANCEL, (DialogInterface.OnClickListener) null).show();
            } else {
                showToast("Memory full");
            }
            throw new LocalTestResetRequiredException(str, e5);
        }
    }

    public IDMActionInfo createAndSaveActionInfo() {
        IDMDatabaseProfile releaseProfile = IDMDatabaseManager.getInstance().getReleaseProfile();
        IDMActionInfo iDMActionInfo = new IDMActionInfo();
        iDMActionInfo.idmSetInitType(1);
        iDMActionInfo.idmSetServerId(releaseProfile.idmGetServerId());
        iDMActionInfo.idmSetAppId(0);
        iDMActionInfo.idmSetSessionId(IDMCommonUtils.idmAgentLibMakeSessionID());
        String strIdmMoGetxFumo = IDMDatabaseMoNodeManager.getInstance().idmGetMoDatabaseManager().idmMoGetDBAdapter().idmMoGetXnodeInfo(releaseProfile.idmGetServerId()).idmMoGetxFumo();
        if (!TextUtils.isEmpty(strIdmMoGetxFumo)) {
            iDMActionInfo.idmSetAlertCommandNode(strIdmMoGetxFumo + IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH);
        }
        new ActionInfoDao().replaceEntity(iDMActionInfo);
        return iDMActionInfo;
    }

    public String createDatabase() throws LocalTestResetRequiredException, LocalTestDoNothingException {
        try {
            return createAndSaveActionInfo().idmGetSessionId();
        } catch (IDMMoExceptionNotFound e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new LocalTestDoNothingException(e);
        } catch (RuntimeException e6) {
            e = e6;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new LocalTestResetRequiredException("Failed to save FumoInfo", e);
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        List<String> deltaList = getDeltaList();
        if (deltaList.size() > 0) {
            new AlertDialog.Builder(this.context).setTitle("Delta File List\n").setSingleChoiceItems((CharSequence[]) deltaList.toArray(new String[0]), 0, new e()).setPositiveButton(R.string.STR_BTN_OK, new b(this, 2, deltaList)).setNegativeButton(R.string.STR_BTN_CANCEL, (DialogInterface.OnClickListener) null).show();
        } else {
            Log.W("Not found or read permission denied");
            new AlertDialog.Builder(this.context).setTitle("Delta File List\n").setMessage("Delta File Not Found\n").setPositiveButton(R.string.STR_BTN_OK, (DialogInterface.OnClickListener) null).setCancelable(false).show();
        }
    }

    public void executeLocalTest(String str, String str2) {
        ActionInfoDao actionInfoDao = new ActionInfoDao(str);
        String downloadPath = actionInfoDao.getDownloadPath();
        Log.I("download path : " + downloadPath);
        new FileManager().deleteDeltaAndMetadataFiles();
        if (actionInfoDao.getDeltaIndex() == StorageType.DATA.type() && isF2FSTypeOfData()) {
            Log.I("ret : " + NativeUtils.setPinAndFallocate(downloadPath, 0L, actionInfoDao.getObjectSize()));
        }
        new CopyAndUpdateTrigger(this.context, str2, downloadPath, str, false).start();
    }

    public void prepare(String str, String str2) throws LocalTestResetRequiredException {
        try {
            long deltaFileSize = new FileManager().getDeltaFileSize(str2);
            ActionInfoDao actionInfoDao = new ActionInfoDao(str);
            actionInfoDao.setObjectSize(deltaFileSize);
            actionInfoDao.setObjectUrl(ActionInfoDao.FILE_PROTOCOL + str2);
            savePreviousFirmwareVersion();
        } catch (IDMExceptionFileNotFound e5) {
            showToast("The file that you selected doesn't exist");
            throw new LocalTestResetRequiredException(str, e5);
        }
    }
}
