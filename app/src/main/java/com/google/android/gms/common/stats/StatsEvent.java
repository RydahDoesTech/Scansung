package com.google.android.gms.common.stats;

import android.text.TextUtils;
import c1.AbstractC0224a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractC0224a implements ReflectedParcelable {
    public final String toString() {
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        List list = wakeLockEvent.f5246k;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        String str = wakeLockEvent.f5243h;
        if (str == null) {
            str = "";
        }
        String str2 = wakeLockEvent.f5249o;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = wakeLockEvent.f5244i;
        String str4 = str3 != null ? str3 : "";
        String str5 = wakeLockEvent.f5242g;
        StringBuilder sb = new StringBuilder(str4.length() + str2.length() + str.length() + String.valueOf(strJoin).length() + String.valueOf(str5).length() + 51);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(wakeLockEvent.f5245j);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(wakeLockEvent.n);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(wakeLockEvent.f5250p);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(wakeLockEvent.f5252r);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 53);
        sb2.append(wakeLockEvent.f5241e);
        sb2.append("\t");
        sb2.append(wakeLockEvent.f);
        sb2.append("\t");
        sb2.append(wakeLockEvent.f5253s);
        sb2.append(string);
        return sb2.toString();
    }
}
