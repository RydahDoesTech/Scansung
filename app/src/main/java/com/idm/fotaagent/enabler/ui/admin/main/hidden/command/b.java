package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.DialogInterface;
import android.widget.EditText;
import com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingModel;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog;
import com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6307e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(Object obj, int i5, Object obj2) {
        this.f6306d = i5;
        this.f6307e = obj;
        this.f = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f6306d) {
            case 0:
                ((Getlog) this.f6307e).lambda$execute$1((ArrayList) this.f, dialogInterface, i5);
                break;
            case 1:
                HiddenCommand.lambda$showDialog$1((Consumer) this.f6307e, (Enum[]) this.f, dialogInterface, i5);
                break;
            case 2:
                ((Localtest) this.f6307e).lambda$execute$1((List) this.f, dialogInterface, i5);
                break;
            case 3:
                ((Memoryfull) this.f6307e).lambda$showDialogForCreatingSpecificSize$1((EditText) this.f, 250, dialogInterface, i5);
                break;
            case 4:
                ((IDMUIDialogFragmentForDialog) this.f6307e).lambda$setButtonOf$0((ButtonStrategy) this.f, dialogInterface, i5);
                break;
            default:
                ((AdminSettingModel) this.f6307e).lambda$createProfilePreferenceUsing$2((ArrayList) this.f, dialogInterface, i5);
                break;
        }
    }
}
