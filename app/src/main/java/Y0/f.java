package Y0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import b1.y;
import com.idm.fotaagent.restapi.restclient.push.campaign.button.Action;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import g1.AbstractC0449a;
import i1.C0480a;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2817a;

    static {
        int i5 = g.f2820c;
        f2817a = 12451000;
    }

    public Intent a(Context context, int i5, String str) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return null;
            }
            int i6 = y.f5078a;
            Uri uriFromParts = Uri.fromParts(Action.KEY_PACKAGENAME, "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null) {
            AbstractC0449a.d(context);
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f2817a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                K0.c cVarA = C0480a.a(context);
                sb.append(cVarA.f1626a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i7 = y.f5078a;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent2.setData(builderAppendQueryParameter.build());
        intent2.setPackage("com.android.vending");
        intent2.addFlags(NetworkAnalyticsConstants.DataPoints.FLAG_INTERFACE_NAME);
        return intent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a9 A[EDGE_INSN: B:114:0x01a9->B:124:0x01e2 BREAK  A[LOOP:0: B:118:0x01bd->B:147:?]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(android.content.Context r11, int r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.f.b(android.content.Context, int):int");
    }
}
