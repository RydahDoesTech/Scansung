package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.idm.adapter.filesystem.IDMFileSystemAdapter;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Getlog extends HiddenCommand {
    private IDMFileSystemAdapter fileAdapter;

    public Getlog(Context context) {
        super(context);
        this.fileAdapter = new IDMFileSystemAdapter();
    }

    private void copyFotaLog(List<File> list) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            Log.E("not available internalSD and externalSD, Copy Failed");
            showToast("not available internalSD and externalSD, Copy Failed");
            return;
        }
        String str = StorageType.DATA.path() + "/fota_log/";
        Log.I("fotaLogFolderPath= " + str);
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            Log.E("mkdirs is failed");
            showToast("failed to make a directory");
            return;
        }
        try {
            for (File file2 : list) {
                this.fileAdapter.idmFileCopy(file2, new File(str + file2.getName()));
            }
            Log.I("Copy Success");
            showToast("Copy Success");
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            showToast("Copy Failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$execute$0(File file) {
        return file.isFile() && file.getName().contains("recovery");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$1(List list, DialogInterface dialogInterface, int i5) {
        copyFotaLog(list);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(FileManager.PATH_FOTA_STATUS);
            if (file.exists()) {
                arrayList.add(file);
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
        try {
            arrayList.addAll(Arrays.asList(new File(getExternalPath() + "/log/").listFiles(new a(0))));
        } catch (Exception e6) {
            Log.printStackTrace(e6);
        }
        if (arrayList.size() == 0) {
            Log.E("Not Found Path or Read Permission Denied");
            new AlertDialog.Builder(this.context).setMessage("Fota Log File Not Found\n").setPositiveButton(R.string.STR_BTN_OK, (DialogInterface.OnClickListener) null).setCancelable(false).show();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((File) it.next()).getName());
        }
        new AlertDialog.Builder(this.context).setTitle("FotaLogList\n").setItems((CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]), (DialogInterface.OnClickListener) null).setPositiveButton(R.string.STR_BTN_OK, new b(this, 0, arrayList)).setNegativeButton(R.string.STR_BTN_CANCEL, (DialogInterface.OnClickListener) null).show();
    }
}
