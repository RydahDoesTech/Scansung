package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import android.os.Environment;
import java.util.Calendar;

/* loaded from: classes.dex */
public class Getdb extends HiddenCommand {
    public Getdb(Context context) {
        super(context);
    }

    private String getCurrentDateForDatabase() {
        Calendar calendar = Calendar.getInstance();
        return String.format("%04d%02d%02d_%02d%02d%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)));
    }

    private String getDestFileNameForEnablerDatabase(String str) {
        return Environment.getExternalStorageDirectory().getPath() + "/dm_copy_" + str + ".db";
    }

    private String getDestFileNameForSdkDatabase(String str) {
        return Environment.getExternalStorageDirectory().getPath() + "/idmsdk_copy_" + str + ".db";
    }

    private String getSrcFileNameForEnablerDatabase() {
        return this.context.getDatabasePath("idm").getPath() + ".db";
    }

    private String getSrcFileNameForSdkDatabase() {
        return this.context.getDatabasePath("idmsdk").getPath() + ".db";
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        String currentDateForDatabase = getCurrentDateForDatabase();
        if (saveFileToSDcard(this.context, getSrcFileNameForEnablerDatabase(), getDestFileNameForEnablerDatabase(currentDateForDatabase))) {
            showToast("dm database was copied to sdcard successfully");
        }
        if (saveFileToSDcard(this.context, getSrcFileNameForSdkDatabase(), getDestFileNameForSdkDatabase(currentDateForDatabase))) {
            showToast("dm database was copied to sdcard successfully");
        }
    }
}
