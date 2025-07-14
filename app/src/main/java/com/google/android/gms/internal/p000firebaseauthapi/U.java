package com.google.android.gms.internal.p000firebaseauthapi;

import V1.g;
import V1.h;
import X1.f;
import X1.k;
import Y0.j;
import Z1.t;
import a4.v;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import t1.i;

/* loaded from: classes.dex */
public class U implements InterfaceC0257e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5392d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5393e;
    public final Object f;

    public U(v vVar, Class cls) {
        this.f5392d = 0;
        if (((Map) vVar.f3094c).keySet().contains(cls) || Void.class.equals(cls)) {
            this.f = vVar;
            this.f5393e = cls;
            return;
        }
        throw new IllegalArgumentException("Given internalKeyMananger " + vVar.toString() + " does not support primitive class " + cls.getName());
    }

    public T1 a(Z4 z4) throws GeneralSecurityException {
        v vVar = (v) this.f;
        try {
            X xN = vVar.n();
            U4 u4A = xN.a(z4);
            xN.d(u4A);
            U4 u4 = (U4) xN.b(u4A);
            S1 s1M = T1.m();
            String strR = vVar.r();
            if (s1M.f) {
                s1M.d();
                s1M.f = false;
            }
            ((T1) s1M.f5558e).zze = strR;
            Y4 y4B = u4.b();
            if (s1M.f) {
                s1M.d();
                s1M.f = false;
            }
            ((T1) s1M.f5558e).zzf = y4B;
            int iO = vVar.o();
            if (s1M.f) {
                s1M.d();
                s1M.f = false;
            }
            T1.t((T1) s1M.f5558e, iO);
            return (T1) s1M.b();
        } catch (C0258f e5) {
            throw new GeneralSecurityException("Unexpected proto", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void b(String str) {
        int i5 = this.f5392d;
        Object obj = this.f;
        switch (i5) {
            case 3:
                ((A2) obj).b(str);
                break;
            default:
                ((C0345t3) obj).b(str);
                break;
        }
    }

    public void c(Object obj, Status status) {
        h fVar;
        i iVar = (i) this.f5393e;
        AbstractC0203C.f("completion source cannot be null", iVar);
        if (status == null) {
            iVar.b(obj);
            return;
        }
        AbstractC0251d4 abstractC0251d4 = (AbstractC0251d4) this.f;
        if (abstractC0251d4.f5464j == null) {
            if (abstractC0251d4.f5463i == null) {
                iVar.a(K3.a(status));
                return;
            }
            SparseArray sparseArray = K3.f5328a;
            int i5 = status.f5238e;
            if (i5 == 17012 || i5 == 17007 || i5 == 17025) {
                Pair pair = (Pair) K3.f5328a.get(i5);
                fVar = new f(K3.b(i5), K3.c(pair != null ? (String) pair.second : "An internal error has occurred.", status));
            } else {
                fVar = K3.a(status);
            }
            iVar.a(fVar);
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(abstractC0251d4.f5458c);
        C0328q3 c0328q3 = abstractC0251d4.f5464j;
        if ("reauthenticateWithCredential".equals(abstractC0251d4.b()) || "reauthenticateWithCredentialWithData".equals(abstractC0251d4.b())) {
            t tVar = abstractC0251d4.f5459d;
        }
        SparseArray sparseArray2 = K3.f5328a;
        firebaseAuth.getClass();
        c0328q3.getClass();
        Pair pair2 = (Pair) K3.f5328a.get(17078);
        String str = (String) pair2.first;
        String str2 = (String) pair2.second;
        ArrayList arrayList = c0328q3.f5602e;
        ArrayList arrayListW = j.W(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListW.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar instanceof k) {
                arrayList2.add(kVar);
            }
        }
        ArrayList arrayListW2 = j.W(arrayList);
        AbstractC0203C.c(c0328q3.f5601d);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayListW2.iterator();
        while (it2.hasNext()) {
            k kVar2 = (k) it2.next();
            if (kVar2 instanceof k) {
                arrayList3.add(kVar2);
            }
        }
        g gVar = firebaseAuth.f6086a;
        gVar.a();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            k kVar3 = (k) it3.next();
            if (kVar3 instanceof k) {
                arrayList4.add(kVar3);
            }
        }
        AbstractC0203C.c(gVar.f2611b);
        iVar.a(new f(str, str2));
    }

    public U4 d(Z4 z4) throws GeneralSecurityException {
        v vVar = (v) this.f;
        try {
            X xN = vVar.n();
            U4 u4A = xN.a(z4);
            xN.d(u4A);
            return (U4) xN.b(u4A);
        } catch (C0258f e5) {
            String name = vVar.n().f5405a.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public void e(Z3 z32) {
        switch (this.f5392d) {
            case 3:
                if (z32 != 0) {
                    throw new ClassCastException();
                }
                Object obj = ((A2) this.f5393e).f5257g;
                throw null;
            default:
                H3 h3 = ((C0345t3) this.f5393e).f5639e;
                try {
                    h3.f5313a.u();
                    return;
                } catch (RemoteException e5) {
                    h3.f5314b.d("RemoteException when sending delete account response.", e5, new Object[0]);
                    return;
                }
        }
    }

    public List f(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f).get(new C0247d0(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public U(Q q5) {
        this.f5392d = 2;
        this.f = q5;
        this.f5393e = null;
    }

    public U(S s2) {
        this.f5392d = 2;
        this.f = null;
        this.f5393e = s2;
    }

    public U(AbstractC0251d4 abstractC0251d4, i iVar) {
        this.f5392d = 5;
        this.f = abstractC0251d4;
        this.f5393e = iVar;
    }

    public /* synthetic */ U(InterfaceC0257e4 interfaceC0257e4, InterfaceC0257e4 interfaceC0257e42, int i5) {
        this.f5392d = i5;
        this.f5393e = interfaceC0257e4;
        this.f = interfaceC0257e42;
    }

    public U(Class cls) {
        this.f5392d = 1;
        this.f = new ConcurrentHashMap();
        this.f5393e = cls;
    }
}
