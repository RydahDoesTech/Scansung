package com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy;

import android.content.Context;
import android.content.DialogInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogContractor;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
abstract class AbstractButtonStrategy implements ButtonStrategy {
    private final int id;
    private final String text;

    public AbstractButtonStrategy(String str, int i5) {
        this.text = str;
        this.id = i5;
    }

    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static String getString(int i5) {
        return getContext().getString(i5);
    }

    public abstract void doOnClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter);

    @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy
    public final int getId() {
        return this.id;
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy
    public final String getText() {
        return this.text;
    }

    @Override // com.idm.fotaagent.enabler.ui.dialog.model.buttonstrategy.ButtonStrategy
    public void onClick(DialogInterface dialogInterface, IDMUIDialogContractor.Presenter presenter) {
        Log.I(getClass().getSimpleName() + " - getText(): " + getText() + ", getId(): " + getId());
        doOnClick(dialogInterface, presenter);
    }
}
