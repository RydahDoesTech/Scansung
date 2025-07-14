package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress.PauseConfirmDialog;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((PauseConfirmDialog.PauseListener) obj).pauseIfPossible();
    }
}
