package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.Memoryfull;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageConstants;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class Deletememory extends HiddenCommand {
    private final FileManager fileManager;

    public Deletememory(Context context) {
        super(context);
        this.fileManager = new FileManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Enum r22) {
        deleteDummyFile(Memoryfull.DUMMY_FILE_LIST[r22.ordinal()]);
    }

    public void deleteDummyFile(String str) {
        Log.I("filename : " + str);
        try {
            long deltaFileSize = this.fileManager.getDeltaFileSize(str);
            Locale locale = Locale.US;
            Log.I(" Dummy file exist. and Size is " + deltaFileSize + " (" + ((int) (deltaFileSize / StorageConstants.MEGA_BYTES)) + ")MB");
            this.fileManager.deleteFile(str);
            showToast("Dummy file deleted");
        } catch (IDMExceptionFileNotFound unused) {
            Log.E("IDMExceptionFileNotFound fail");
            Log.E("file is not exist. nothing to delete");
            showToast("No File to delete");
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        showDialog("Delete selected memory type", Memoryfull.MemoryType.values(), Memoryfull.MemoryType.CACHE_MEMORY, new A2.c(8, this));
    }
}
