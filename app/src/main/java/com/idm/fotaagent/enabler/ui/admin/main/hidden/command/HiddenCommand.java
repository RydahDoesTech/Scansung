package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.fotaagent.utils.storage.FileManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class HiddenCommand {
    protected final Context context;

    public HiddenCommand(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$showDialog$0(int i5) {
        return new String[i5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showDialog$1(Consumer consumer, Enum[] enumArr, DialogInterface dialogInterface, int i5) {
        consumer.accept(enumArr[((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()]);
    }

    public abstract void execute();

    public String getExternalPath() {
        return Environment.getExternalStorageDirectory().getPath();
    }

    public boolean saveFileToSDcard(Context context, String str, String str2) throws IOException {
        Log.I("Src File Name [" + str + "], Dest File Name [" + str2 + "]");
        new FileManager().deleteFile(str2);
        byte[] bArr = new byte[1000000];
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(str));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                while (true) {
                    try {
                        int i5 = dataInputStream.read(bArr, 0, 1000000);
                        if (i5 == -1) {
                            fileOutputStream.close();
                            dataInputStream.close();
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i5);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public void savePreviousFirmwareVersion() {
        new GeneralRepository(this.context).setPreviousFirmwareVersion(DeviceUtils.readFirmwareVersion());
    }

    public <T extends Enum<T>> void showDialog(String str, Enum<T>[] enumArr, Enum<T> r5, Consumer<Enum<T>> consumer) {
        new AlertDialog.Builder(this.context).setTitle(str).setSingleChoiceItems((CharSequence[]) Arrays.stream(enumArr).map(new E2.b(23)).toArray(new com.idm.fotaagent.database.sqlite.database.mo.b(1)), r5.ordinal(), (DialogInterface.OnClickListener) null).setPositiveButton(R.string.STR_BTN_OK, new b(consumer, 1, enumArr)).show();
    }

    public void showToast(String str) {
        ToastHelper.showLongToast(this.context, str);
    }
}
