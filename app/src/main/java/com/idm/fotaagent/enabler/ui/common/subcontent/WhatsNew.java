package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.idm.fotaagent.enabler.ui.DescriptionContent;
import com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector;
import com.idm.fotaagent.enabler.ui.whatsnew.DescriptionBody;
import com.samsung.android.fotaagent.common.view.ViewReinflatingLayout;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class WhatsNew extends ContentInjector.Model {
    protected final DescriptionBody descriptionBody;

    public static class Last extends WhatsNew {
        public Last(Context context) {
            this(context, DescriptionBody.FOR_LAST);
        }

        private static DescriptionContent makeContent() {
            IDMUpdateHistoryInfo lastSuccessUpdateHistoryInfo = new UpdateHistoryInfoDao().getLastSuccessUpdateHistoryInfo();
            return new DescriptionContent(lastSuccessUpdateHistoryInfo.description(), lastSuccessUpdateHistoryInfo.summaryDescription(), lastSuccessUpdateHistoryInfo.descriptionType());
        }

        public Last(Context context, DescriptionBody descriptionBody) {
            super(descriptionBody.get(context, makeContent()), descriptionBody);
        }
    }

    public static class New extends WhatsNew {
        public New(Context context) {
            this(context, DescriptionBody.FOR_NEW);
        }

        private static DescriptionContent makeContent(Context context) {
            return new FotaJobRepository(context).descriptionContent().orElse(new DescriptionContent("", ""));
        }

        public New(Context context, DescriptionBody descriptionBody) {
            super(descriptionBody.get(context, makeContent(WhatsNew.getContext())), descriptionBody);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
    public int getLayoutId() {
        return R.layout.whats_new_content;
    }

    @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
    public void populateTo(View view) {
        TextView textView = (TextView) view.findViewById(R.id.tv_content_body);
        textView.setText(getBody());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.descriptionBody == DescriptionBody.FOR_TWO_DEPTH) {
            ((ViewReinflatingLayout) view.findViewById(R.id.layout_whats_new_header)).setVisibility(8);
        }
    }

    private WhatsNew(CharSequence charSequence, DescriptionBody descriptionBody) {
        super(charSequence);
        this.descriptionBody = descriptionBody;
    }
}
