package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f6185b;

    /* renamed from: a, reason: collision with root package name */
    public B3.g f6186a;

    public final synchronized v a() {
        String str;
        v vVar;
        B3.g gVar = this.f6186a;
        synchronized (((ArrayDeque) gVar.f257h)) {
            str = (String) ((ArrayDeque) gVar.f257h).peek();
        }
        Pattern pattern = v.f6181d;
        vVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                vVar = new v(strArrSplit[0], strArrSplit[1]);
            }
        }
        return vVar;
    }
}
