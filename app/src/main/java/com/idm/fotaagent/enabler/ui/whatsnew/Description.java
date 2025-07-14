package com.idm.fotaagent.enabler.ui.whatsnew;

import android.content.Context;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.fotaagent.enabler.ui.whatsnew.Linkifier;

/* loaded from: classes.dex */
public abstract class Description {
    protected final DescriptionContent content;

    public static class ForMain extends Description {
        public ForMain(DescriptionContent descriptionContent) {
            super(descriptionContent);
        }

        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Description
        public CharSequence get(Context context) {
            return Linkifier.get(context, new Linkifier.ActivityLinkifier.NoLink(), this.content.type()).addLinks(this.content.description());
        }
    }

    public static class ForSummary extends Description {
        public ForSummary(DescriptionContent descriptionContent) {
            super(descriptionContent);
        }

        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Description
        public CharSequence get(Context context) {
            return Linkifier.get(context, new Linkifier.ActivityLinkifier.ApplyLink(), this.content.type()).addLinks(this.content.summaryDescription());
        }
    }

    public Description(DescriptionContent descriptionContent) {
        this.content = descriptionContent;
    }

    public abstract CharSequence get(Context context);
}
