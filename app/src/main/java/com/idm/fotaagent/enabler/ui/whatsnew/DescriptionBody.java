package com.idm.fotaagent.enabler.ui.whatsnew;

import android.content.Context;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.fotaagent.enabler.ui.whatsnew.Description;

/* loaded from: classes.dex */
public interface DescriptionBody {
    public static final DescriptionBody FOR_NEW = new com.idm.fotaagent.enabler.ui.notification.manager.a(4);
    public static final DescriptionBody FOR_LAST = new com.idm.fotaagent.enabler.ui.notification.manager.a(5);
    public static final DescriptionBody FOR_TWO_DEPTH = new com.idm.fotaagent.enabler.ui.notification.manager.a(6);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ CharSequence lambda$static$0(Context context, DescriptionContent descriptionContent) {
        return MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(context) ? new Description.ForSummary(descriptionContent).get(context) : new Description.ForMain(descriptionContent).get(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ CharSequence lambda$static$1(Context context, DescriptionContent descriptionContent) {
        return MajorUpdate.FOR_LAST_UPDATE.isMajorUpdate(context) ? new Description.ForSummary(descriptionContent).get(context) : new Description.ForMain(descriptionContent).get(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ CharSequence lambda$static$2(Context context, DescriptionContent descriptionContent) {
        return new Description.ForMain(descriptionContent).get(context);
    }

    CharSequence get(Context context, DescriptionContent descriptionContent);
}
