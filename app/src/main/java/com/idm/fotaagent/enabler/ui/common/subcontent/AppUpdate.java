package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector;
import com.idm.fotaagent.enabler.ui.whatsnew.AbstractClickableSpan;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class AppUpdate {

    public static class Link extends ContentInjector.Model {
        public Link(Context context) {
            super(makeBody(context));
        }

        private static String addTextForLink() {
            return AppUpdate.getContext().getString(R.string.STR_APP_UPDATES_SUB) + "\n\n" + AppUpdate.getContext().getString(R.string.STR_SET_APP_UPDATE);
        }

        private static CharSequence makeBody(Context context) {
            SpannableString spannableString = new SpannableString(addTextForLink());
            AbstractClickableSpan.ForAppUpdateInformation forAppUpdateInformation = new AbstractClickableSpan.ForAppUpdateInformation(context, spannableString);
            spannableString.setSpan(forAppUpdateInformation, forAppUpdateInformation.start(), forAppUpdateInformation.end(), 33);
            return spannableString;
        }

        @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
        public final int getLayoutId() {
            return R.layout.sub_title_and_body_content;
        }

        @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
        public void populateTo(View view) {
            ((TextView) view.findViewById(R.id.tv_content_title)).setText(R.string.STR_APP_UPDATES);
            TextView textView = (TextView) view.findViewById(R.id.tv_content_body);
            textView.setText(getBody());
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static class Nothing extends ContentInjector.Model {
        public Nothing() {
            super(null);
        }

        @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
        public int getLayoutId() {
            return -1;
        }

        @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
        public void populateTo(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }
}
