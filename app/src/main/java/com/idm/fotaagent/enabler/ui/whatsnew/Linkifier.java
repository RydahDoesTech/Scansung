package com.idm.fotaagent.enabler.ui.whatsnew;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.idm.fotaagent.enabler.ui.whatsnew.AbstractClickableSpan;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Linkifier {
    static final String TYPE_HTML = "html";
    protected final Context activityContext;
    protected ActivityLinkifier activityLinkifier;

    public interface ActivityLinkifier {

        public static class ApplyLink implements ActivityLinkifier {
            @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier.ActivityLinkifier
            public void addLinks(Spannable spannable, AbstractClickableSpan abstractClickableSpan) {
                try {
                    spannable.setSpan(abstractClickableSpan, abstractClickableSpan.start(), abstractClickableSpan.end(), 33);
                } catch (RuntimeException e5) {
                    Log.printStackTrace(e5);
                }
            }

            @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier.ActivityLinkifier
            public String addTextForLink(Context context, String str, String str2) {
                return str + str2 + context.getString(R.string.STR_WHATS_NEW_ALL_CHANGES);
            }
        }

        public static class NoLink implements ActivityLinkifier {
            @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier.ActivityLinkifier
            public void addLinks(Spannable spannable, AbstractClickableSpan abstractClickableSpan) {
            }

            @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier.ActivityLinkifier
            public String addTextForLink(Context context, String str, String str2) {
                return str;
            }
        }

        void addLinks(Spannable spannable, AbstractClickableSpan abstractClickableSpan);

        String addTextForLink(Context context, String str, String str2);
    }

    public static class ForHtml extends Linkifier {
        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier
        public void applyUrlSpan(Spannable spannable) {
            try {
                List<URLSpec> listExtractFrom = URLSpec.extractFrom(spannable);
                Log.V("html url specs: " + listExtractFrom);
                Linkify.addLinks(spannable, 1);
                List<URLSpec> listExtractFrom2 = URLSpec.extractFrom(spannable);
                Log.V("WEB_URLS url specs: " + listExtractFrom2);
                for (URLSpec uRLSpec : listExtractFrom) {
                    for (URLSpec uRLSpec2 : listExtractFrom2) {
                        int i5 = uRLSpec.end;
                        int i6 = uRLSpec2.start;
                        if (i5 <= i6) {
                            break;
                        }
                        int i7 = uRLSpec.start;
                        if (i7 > i6 && i7 >= uRLSpec2.end) {
                        }
                    }
                    Log.V("restore html url spec: " + uRLSpec);
                    spannable.setSpan(new URLSpan(uRLSpec.url), uRLSpec.start, uRLSpec.end, 33);
                }
                Log.V("final url specs: " + URLSpec.extractFrom(spannable));
            } catch (ClassCastException e5) {
                Log.printStackTrace(e5);
            }
        }

        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier
        public String getLineSeparators() {
            return "<br><br>";
        }

        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier
        public Spannable getSpannableDescription(String str) {
            return (Spannable) Html.fromHtml(str, 63);
        }

        private ForHtml(Context context, ActivityLinkifier activityLinkifier) {
            super(context, activityLinkifier);
        }
    }

    public static class ForPlain extends Linkifier {
        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier
        public void applyUrlSpan(Spannable spannable) {
            Linkify.addLinks(spannable, 1);
        }

        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier
        public String getLineSeparators() {
            return "\n\n";
        }

        @Override // com.idm.fotaagent.enabler.ui.whatsnew.Linkifier
        public Spannable getSpannableDescription(String str) {
            return new SpannableString(str);
        }

        private ForPlain(Context context, ActivityLinkifier activityLinkifier) {
            super(context, activityLinkifier);
        }
    }

    public static class URLSpec implements Comparable<URLSpec> {
        final int end;
        final int start;
        final String url;

        private URLSpec(String str, int i5, int i6) {
            this.url = str;
            this.start = i5;
            this.end = i6;
        }

        public static List<URLSpec> extractFrom(Spannable spannable) {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            ArrayList arrayList = new ArrayList();
            for (URLSpan uRLSpan : uRLSpanArr) {
                arrayList.add(new URLSpec(uRLSpan.getURL(), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan)));
            }
            Collections.sort(arrayList);
            return arrayList;
        }

        public String toString() {
            return "URLSpec{url='" + this.url + "', start=" + this.start + ", end=" + this.end + '}';
        }

        @Override // java.lang.Comparable
        public int compareTo(URLSpec uRLSpec) {
            return this.start - uRLSpec.start;
        }
    }

    public Linkifier(Context context, ActivityLinkifier activityLinkifier) {
        this.activityContext = context;
        this.activityLinkifier = activityLinkifier;
    }

    public static Linkifier get(Context context, ActivityLinkifier activityLinkifier, String str) {
        return TYPE_HTML.equals(str) ? new ForHtml(context, activityLinkifier) : new ForPlain(context, activityLinkifier);
    }

    public CharSequence addLinks(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Spannable spannableDescription = getSpannableDescription(this.activityLinkifier.addTextForLink(this.activityContext, str, getLineSeparators()));
        this.activityLinkifier.addLinks(spannableDescription, new AbstractClickableSpan.ForMainDescription(this.activityContext, spannableDescription));
        applyUrlSpan(spannableDescription);
        return spannableDescription;
    }

    public abstract void applyUrlSpan(Spannable spannable);

    public abstract String getLineSeparators();

    public abstract Spannable getSpannableDescription(String str);
}
