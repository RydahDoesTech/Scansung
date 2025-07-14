package com.idm.fotaagent.enabler.ui.whatsnew;

import E2.b;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.ui.ActivityScreenIdMapper;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory;
import com.idm.fotaagent.enabler.ui.maindescription.MainDescriptionActivity;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public abstract class AbstractClickableSpan extends ClickableSpan {
    protected final Context context;
    protected int end;
    protected int start;

    public static class ForAppUpdateInformation extends AbstractClickableSpan {
        public ForAppUpdateInformation(Context context, Spannable spannable) {
            super(context);
            String string = context.getString(R.string.STR_SET_APP_UPDATE);
            int length = spannable.length();
            this.end = length;
            this.start = length - string.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Optional lambda$onClick$0(Map.Entry entry) {
            return Optional.ofNullable(ActivityScreenIdMapper.getScreenIdFrom((Activity) entry.getValue()));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intent = AppFotaFactory.create(this.context).getIntent();
            if (intent == null) {
                Log.E("should not reach here");
            } else {
                IDMUIManager.getInstance().startActivity(intent);
                IDMUIManager.getInstance().getActivityInMapWithoutEntry().flatMap(new b(29)).ifPresent(new c(19));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    public static class ForMainDescription extends AbstractClickableSpan {
        public ForMainDescription(Context context, Spannable spannable) {
            super(context);
            String string = this.context.getString(R.string.STR_WHATS_NEW_ALL_CHANGES);
            int length = spannable.length();
            this.end = length;
            this.start = length - string.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Optional lambda$onClick$0(Map.Entry entry) {
            return Optional.ofNullable(ActivityScreenIdMapper.getScreenIdFrom((Activity) entry.getValue()));
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.context.startActivity(new Intent(this.context, (Class<?>) MainDescriptionActivity.class).putExtra(MainDescriptionActivity.KEY_CALLING_ACTIVITY, this.context.getClass().getSimpleName()));
            IDMUIManager.getInstance().getActivityInMapWithoutEntry().flatMap(new a(0)).ifPresent(new c(20));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    public static class ForSmartSwitchDescription extends AbstractClickableSpan {
        private final String screenId;

        public ForSmartSwitchDescription(Context context, String str, String str2) {
            super(context);
            this.screenId = str2;
            String string = context.getString(R.string.STR_SMART_SWITCH);
            int iIndexOf = str.indexOf(string);
            this.start = iIndexOf;
            this.end = string.length() + iIndexOf;
        }

        private String message(Context context) {
            return ResourceGenerator.get().getSmartSwitchDialogMessage(context);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Optional.ofNullable(this.screenId).ifPresent(new c(21));
            AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
            builder.setTitle(this.context.getString(R.string.STR_UPDATE_USING_SMART_SWITCH_TITLE)).setMessage(message(this.context)).setPositiveButton(this.context.getString(R.string.STR_BTN_OK), (DialogInterface.OnClickListener) null);
            builder.create().show();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(true);
        }
    }

    public AbstractClickableSpan(Context context) {
        this.context = context;
    }

    public int end() {
        return this.end;
    }

    public int start() {
        return this.start;
    }
}
