package B3;

import G3.m;
import G3.n;
import J.H;
import J.M;
import J.P;
import a4.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import c.AbstractC0220a;
import com.google.android.gms.internal.p000firebaseauthapi.A2;
import com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s;
import com.google.android.gms.internal.p000firebaseauthapi.C0239b4;
import com.google.android.gms.internal.p000firebaseauthapi.C0306n;
import com.google.android.gms.internal.p000firebaseauthapi.C0358v4;
import com.google.android.gms.internal.p000firebaseauthapi.C0364w4;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import com.google.android.gms.internal.p000firebaseauthapi.H3;
import com.google.android.gms.internal.p000firebaseauthapi.H4;
import com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4;
import com.google.android.gms.internal.p000firebaseauthapi.W3;
import com.google.android.gms.internal.p000firebaseauthapi.Z3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import k.AbstractC0622g0;
import k.C0651s;
import k.x1;
import q3.InterfaceC0792b;

/* loaded from: classes.dex */
public final class g implements m, M0.b, InterfaceC0257e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f255e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public Object f256g;

    /* renamed from: h, reason: collision with root package name */
    public Object f257h;

    /* renamed from: i, reason: collision with root package name */
    public Object f258i;

    public g(k kVar, C0306n c0306n, H3 h3, InterfaceC0257e4 interfaceC0257e4, C0382z4 c0382z4) {
        this.f254d = 4;
        this.f258i = c0306n;
        this.f255e = interfaceC0257e4;
        this.f = h3;
        this.f256g = c0382z4;
        this.f257h = kVar;
    }

    public static g c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        g gVar = new g(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) gVar.f257h)) {
            try {
                ((ArrayDeque) gVar.f257h).clear();
                String string = ((SharedPreferences) gVar.f255e).getString((String) gVar.f, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) gVar.f256g)) {
                    String[] strArrSplit = string.split((String) gVar.f256g, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) gVar.f257h).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return gVar;
    }

    public void a() {
        View view = (View) this.f255e;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((x1) this.f256g) != null) {
                if (((x1) this.f258i) == null) {
                    this.f258i = new x1();
                }
                x1 x1Var = (x1) this.f258i;
                x1Var.f7859a = null;
                x1Var.f7862d = false;
                x1Var.f7860b = null;
                x1Var.f7861c = false;
                WeakHashMap weakHashMap = P.f1421a;
                ColorStateList colorStateListG = H.g(view);
                if (colorStateListG != null) {
                    x1Var.f7862d = true;
                    x1Var.f7859a = colorStateListG;
                }
                PorterDuff.Mode modeH = H.h(view);
                if (modeH != null) {
                    x1Var.f7861c = true;
                    x1Var.f7860b = modeH;
                }
                if (x1Var.f7862d || x1Var.f7861c) {
                    C0651s.d(background, x1Var, view.getDrawableState());
                    return;
                }
            }
            x1 x1Var2 = (x1) this.f257h;
            if (x1Var2 != null) {
                C0651s.d(background, x1Var2, view.getDrawableState());
                return;
            }
            x1 x1Var3 = (x1) this.f256g;
            if (x1Var3 != null) {
                C0651s.d(background, x1Var3, view.getDrawableState());
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void b(String str) {
        ((InterfaceC0257e4) this.f255e).b(str);
    }

    public ColorStateList d() {
        x1 x1Var = (x1) this.f257h;
        if (x1Var != null) {
            return x1Var.f7859a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void e(Z3 z32) throws IOException {
        List list = ((C0358v4) z32).f5656d.f5683d;
        InterfaceC0257e4 interfaceC0257e4 = (InterfaceC0257e4) this.f255e;
        if (list == null || list.isEmpty()) {
            interfaceC0257e4.b("No users");
            return;
        }
        C0364w4 c0364w4 = (C0364w4) list.get(0);
        k kVar = (k) this.f257h;
        H3 h3 = (H3) this.f;
        C0382z4 c0382z4 = (C0382z4) this.f256g;
        AbstractC0203C.e(c0382z4);
        AbstractC0203C.e(c0364w4);
        G3.c cVar = (G3.c) ((C0306n) this.f258i).f5568e;
        A2 a22 = new A2(kVar, c0364w4, h3, c0382z4, interfaceC0257e4);
        W3 w3 = (W3) cVar.f740e;
        AbstractC0335s.l(w3.j("/setAccountInfo", (String) cVar.f744j), kVar, a22, H4.class, (C0239b4) w3.f5381b);
    }

    public PorterDuff.Mode f() {
        x1 x1Var = (x1) this.f257h;
        if (x1Var != null) {
            return x1Var.f7860b;
        }
        return null;
    }

    public void g(AttributeSet attributeSet, int i5) {
        View view = (View) this.f255e;
        Context context = view.getContext();
        int[] iArr = AbstractC0220a.f5111D;
        D3.c cVarL = D3.c.l(context, attributeSet, iArr, i5);
        TypedArray typedArray = (TypedArray) cVarL.f;
        View view2 = (View) this.f255e;
        Context context2 = view2.getContext();
        WeakHashMap weakHashMap = P.f1421a;
        M.d(view2, context2, iArr, attributeSet, (TypedArray) cVarL.f, i5, 0);
        try {
            if (typedArray.hasValue(0)) {
                typedArray.getResourceId(0, -1);
                C0651s c0651s = (C0651s) this.f;
                view.getContext();
                synchronized (c0651s) {
                    synchronized (c0651s.f7796a) {
                    }
                }
            }
            if (typedArray.hasValue(1)) {
                H.q(view, cVarL.f(1));
            }
            if (typedArray.hasValue(2)) {
                H.r(view, AbstractC0622g0.b(typedArray.getInt(2, -1), null));
            }
            cVarL.m();
        } catch (Throwable th) {
            cVarL.m();
            throw th;
        }
    }

    @Override // N2.a
    public Object get() {
        return new O0.c((Executor) ((N2.a) this.f255e).get(), (L0.f) ((N2.a) this.f).get(), (P0.d) ((D3.c) this.f256g).get(), (Q0.c) ((N2.a) this.f257h).get(), (R0.c) ((N2.a) this.f258i).get());
    }

    public void h() {
        j(null);
        a();
    }

    public void i(int i5) {
        C0651s c0651s = (C0651s) this.f;
        if (c0651s != null) {
            ((View) this.f255e).getContext();
            synchronized (c0651s) {
                synchronized (c0651s.f7796a) {
                }
            }
        }
        j(null);
        a();
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((x1) this.f256g) == null) {
                this.f256g = new x1();
            }
            x1 x1Var = (x1) this.f256g;
            x1Var.f7859a = colorStateList;
            x1Var.f7862d = true;
        } else {
            this.f256g = null;
        }
        a();
    }

    public void k(ColorStateList colorStateList) {
        if (((x1) this.f257h) == null) {
            this.f257h = new x1();
        }
        x1 x1Var = (x1) this.f257h;
        x1Var.f7859a = colorStateList;
        x1Var.f7862d = true;
        a();
    }

    public void l(PorterDuff.Mode mode) {
        if (((x1) this.f257h) == null) {
            this.f257h = new x1();
        }
        x1 x1Var = (x1) this.f257h;
        x1Var.f7860b = mode;
        x1Var.f7861c = true;
        a();
    }

    @Override // G3.m
    public void m() {
        ((G3.c) this.f).m();
        S3.a aVar = new S3.a((InterfaceC0792b) P2.m.J0((ArrayList) this.f258i));
        ((HashMap) ((G3.c) this.f256g).f741g).put((N3.f) this.f257h, aVar);
    }

    @Override // G3.m
    public void n(N3.f fVar, Object obj) {
        ((G3.c) this.f255e).n(fVar, obj);
    }

    @Override // G3.m
    public void o(N3.f fVar, S3.f fVar2) {
        ((G3.c) this.f255e).o(fVar, fVar2);
    }

    @Override // G3.m
    public m p(N3.b bVar, N3.f fVar) {
        return ((G3.c) this.f255e).p(bVar, fVar);
    }

    @Override // G3.m
    public void q(N3.f fVar, N3.b bVar, N3.f fVar2) {
        ((G3.c) this.f255e).q(fVar, bVar, fVar2);
    }

    @Override // G3.m
    public n r(N3.f fVar) {
        return ((G3.c) this.f255e).r(fVar);
    }

    public String toString() {
        switch (this.f254d) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f255e) + ", mProviderPackage: " + ((String) this.f) + ", mQuery: " + ((String) this.f256g) + ", mCertificates:");
                int i5 = 0;
                while (true) {
                    List list = (List) this.f257h;
                    if (i5 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i5);
                    for (int i6 = 0; i6 < list2.size(); i6++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i6), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i5++;
                }
            default:
                return super.toString();
        }
    }

    public g(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f254d = 5;
        this.f257h = new ArrayDeque();
        this.f255e = sharedPreferences;
        this.f = "topic_operation_queue";
        this.f256g = ",";
        this.f258i = scheduledThreadPoolExecutor;
    }

    public g(N2.a aVar, N2.a aVar2, D3.c cVar, N2.a aVar3, N2.a aVar4) {
        this.f254d = 3;
        this.f255e = aVar;
        this.f = aVar2;
        this.f256g = cVar;
        this.f257h = aVar3;
        this.f258i = aVar4;
    }

    public g(View view) {
        this.f254d = 6;
        this.f255e = view;
        this.f = C0651s.a();
    }

    public g(String str, String str2, String str3, List list) {
        this.f254d = 1;
        str.getClass();
        this.f255e = str;
        str2.getClass();
        this.f = str2;
        this.f256g = str3;
        list.getClass();
        this.f257h = list;
        this.f258i = str + "-" + str2 + "-" + str3;
    }

    public g(b bVar, i iVar, O2.c cVar) {
        this.f254d = 0;
        AbstractC0219i.e("typeParameterResolver", iVar);
        this.f255e = bVar;
        this.f = iVar;
        this.f256g = cVar;
        this.f257h = cVar;
        this.f258i = new D3.c(this, iVar);
    }

    public g(G3.c cVar, G3.c cVar2, N3.f fVar, ArrayList arrayList) {
        this.f254d = 2;
        this.f = cVar;
        this.f256g = cVar2;
        this.f257h = fVar;
        this.f258i = arrayList;
        this.f255e = cVar;
    }
}
