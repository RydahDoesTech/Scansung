package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.DummyFileCreater;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageConstants;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Locale;

/* loaded from: classes.dex */
public class Memoryfull extends HiddenCommand {
    public static final String[] DUMMY_FILE_LIST = {"/cache/dummyfile.dat", "/data/fota/dummyfile.dat", "/cache/recovery/dummyfile.dat"};
    private final FileManager fileManager;

    public enum MemoryType {
        CACHE_MEMORY("Cache Memory", StorageType.CACHE.type()),
        INTERNAL_MEMORY("Internal Memory", StorageType.DATA.type()),
        CACHE_RECOVERY_MEMORY("Cache Recovery Memory", 2);

        private final String description;
        private final int type;

        MemoryType(String str, int i5) {
            this.description = str;
            this.type = i5;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }

        public int type() {
            return this.type;
        }
    }

    public Memoryfull(Context context) {
        super(context);
        this.fileManager = new FileManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Enum r5) {
        try {
            if (r5.ordinal() == StorageType.CACHE.type() || r5.ordinal() == StorageType.DATA.type()) {
                Log.I("Cache or Internal memory : " + r5);
                long availableBytes = this.fileManager.getAvailableBytes(r5.ordinal());
                Log.I("nAvailableSize : " + availableBytes);
                new DummyFileCreater(this.context, DUMMY_FILE_LIST[r5.ordinal()], availableBytes).start();
            } else {
                Log.I("Cache Recovery memory");
                showDialogForCreatingSpecificSize();
            }
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialogForCreatingSpecificSize$1(EditText editText, int i5, DialogInterface dialogInterface, int i6) {
        long availableBytesAtCache = (int) (this.fileManager.getAvailableBytesAtCache() / StorageConstants.MEGA_BYTES);
        long j5 = GeneralUtils.parseInt(editText.getText().toString(), i5);
        Log.I("remain size : " + j5);
        if (j5 < 0 || j5 > availableBytesAtCache) {
            showToast("wrong input");
            return;
        }
        long availableBytesAtCache2 = this.fileManager.getAvailableBytesAtCache() - (j5 * StorageConstants.MEGA_BYTES);
        Log.I("nAvailableSize : " + availableBytesAtCache2);
        if (availableBytesAtCache2 > 0) {
            new DummyFileCreater(this.context, DUMMY_FILE_LIST[MemoryType.CACHE_RECOVERY_MEMORY.ordinal()], availableBytesAtCache2).start();
        } else {
            showToast("wrong input cannot proceed");
        }
    }

    private void showDialogForCreatingSpecificSize() {
        Log.I("");
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.dialog_input, (ViewGroup) null);
        EditText editText = (EditText) viewInflate.findViewById(R.id.input_edit);
        AlertDialog.Builder title = new AlertDialog.Builder(this.context).setTitle("Input size");
        Locale locale = Locale.US;
        title.setMessage("Input remain size in /cache/recovery (Default size is 250Mb)").setView(viewInflate).setPositiveButton(R.string.STR_BTN_OK, new b(this, 3, editText)).show();
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        showDialog("Select memory type", MemoryType.values(), MemoryType.CACHE_MEMORY, new A2.c(10, this));
    }
}
