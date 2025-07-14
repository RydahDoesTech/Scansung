package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class ContentInjector {
    private final ViewGroup container;
    private final Model model;

    public static abstract class Model {
        private final CharSequence body;

        public static abstract class TitleAndBullets extends Model {

            public static abstract class WithTitleImage extends TitleAndBullets {
                public WithTitleImage(CharSequence[] charSequenceArr) {
                    super(charSequenceArr);
                }

                @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model.TitleAndBullets, com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
                public final int getLayoutId() {
                    return R.layout.sub_title_and_image_and_body_content;
                }
            }

            public TitleAndBullets(CharSequence[] charSequenceArr) {
                super(makeBody(charSequenceArr));
            }

            private static CharSequence makeBody(CharSequence[] charSequenceArr) {
                StringBuilder sb = new StringBuilder();
                boolean z4 = false;
                for (CharSequence charSequence : charSequenceArr) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        if (z4) {
                            sb.append('\n');
                        }
                        sb.append(charSequence);
                        z4 = true;
                    }
                }
                if (TextUtils.isEmpty(sb)) {
                    return null;
                }
                return CharBulletSpan.applyTo(sb);
            }

            @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
            public int getLayoutId() {
                return R.layout.sub_title_and_body_content;
            }

            public abstract int getTitleId();

            @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
            public void populateTo(View view) {
                ((TextView) view.findViewById(R.id.tv_content_title)).setText(getTitleId());
                TextView textView = (TextView) view.findViewById(R.id.tv_content_body);
                CharSequence body = getBody();
                CharBulletSpan.setPaintIfNeeded(body, textView.getPaint());
                textView.setText(body);
            }
        }

        public static class TopMargin extends Model {
            @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
            public int getLayoutId() {
                return R.layout.top_margin_content;
            }

            @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model
            public void populateTo(View view) {
            }

            private TopMargin() {
                super(null);
            }
        }

        public Model(CharSequence charSequence) {
            this.body = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void inflateTo(ViewGroup viewGroup) {
            try {
                View.inflate(viewGroup.getContext(), getLayoutId(), viewGroup);
                populateTo(viewGroup.getChildAt(viewGroup.getChildCount() - 1));
            } catch (NullPointerException e5) {
                Log.printStackTrace(e5, "contentView should not be null (container.getChildCount(): " + viewGroup.getChildCount() + ")");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isEmpty() {
            return TextUtils.isEmpty(getBody());
        }

        public final CharSequence getBody() {
            return this.body;
        }

        public abstract int getLayoutId();

        public abstract void populateTo(View view);
    }

    private ContentInjector(Model model, ViewGroup viewGroup) {
        this.container = viewGroup;
        this.model = model;
    }

    public static void inject(ViewGroup viewGroup, Model... modelArr) {
        Model.TopMargin topMargin = new Model.TopMargin();
        boolean z4 = false;
        for (Model model : modelArr) {
            if (!model.isEmpty()) {
                if (z4) {
                    new ContentInjector(topMargin, viewGroup).inject();
                }
                new ContentInjector(model, viewGroup).inject();
                z4 = true;
            }
        }
    }

    private void inject() {
        this.model.inflateTo(this.container);
    }
}
