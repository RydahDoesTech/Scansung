package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6171d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6172e;

    public /* synthetic */ r(int i5) {
        this.f6171d = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6171d) {
            case 0:
                B3.g gVar = (B3.g) this.f6172e;
                synchronized (((ArrayDeque) gVar.f257h)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) gVar.f255e).edit();
                    String str = (String) gVar.f;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) gVar.f257h).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) gVar.f256g);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                }
                return;
            default:
                D d5 = (D) this.f6172e;
                String action = d5.f6116a.getAction();
                StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
                sb2.append("Service took too long to process intent: ");
                sb2.append(action);
                sb2.append(" App may get closed.");
                Log.w("FirebaseMessaging", sb2.toString());
                d5.f6117b.d(null);
                return;
        }
    }
}
