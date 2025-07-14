package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.agent.dm.IDMDmInterface;
import java.io.File;

/* loaded from: classes.dex */
public class Getwbxml extends HiddenCommand {
    public Getwbxml(Context context) {
        super(context);
    }

    private boolean copyToSDcard(File[] fileArr) {
        if (fileArr == null) {
            return false;
        }
        int i5 = 0;
        for (File file : fileArr) {
            if (saveFileToSDcard(this.context, file.getPath(), getDestFileName(file.getName()))) {
                i5++;
            }
        }
        return i5 > 0 && i5 == fileArr.length;
    }

    private String getDestFileName(String str) {
        return getExternalPath().concat("/").concat(str);
    }

    private File[] getWbxmlFiles() {
        return this.context.getFilesDir().listFiles(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getWbxmlFiles$0(File file, String str) {
        return str.endsWith(IDMDmInterface.IDM_FILE_EXTENSION_WBXML);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        if (copyToSDcard(getWbxmlFiles())) {
            showToast("wbxml file was copied to sdcard successfully");
        }
    }
}
