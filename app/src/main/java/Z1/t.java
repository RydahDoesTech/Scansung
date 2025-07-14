package Z1;

import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class t extends AbstractC0224a implements X1.n {
    public static final Parcelable.Creator<t> CREATOR = new b(5);

    /* renamed from: d, reason: collision with root package name */
    public C0382z4 f2896d;

    /* renamed from: e, reason: collision with root package name */
    public r f2897e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2898g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2899h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f2900i;

    /* renamed from: j, reason: collision with root package name */
    public String f2901j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f2902k;

    /* renamed from: l, reason: collision with root package name */
    public u f2903l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2904m;
    public X1.r n;

    /* renamed from: o, reason: collision with root package name */
    public f f2905o;

    public t(V1.g gVar, ArrayList arrayList) {
        AbstractC0203C.e(gVar);
        gVar.a();
        this.f = gVar.f2611b;
        this.f2898g = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f2901j = "2";
        f(arrayList);
    }

    @Override // X1.n
    public final String c() {
        return this.f2897e.f2890e;
    }

    public final String d() {
        String str;
        Map map;
        C0382z4 c0382z4 = this.f2896d;
        if (c0382z4 == null || (str = c0382z4.f5703e) == null || (map = (Map) ((Map) d.a(str).f95e).get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final boolean e() {
        String str;
        Boolean bool = this.f2902k;
        if (bool == null || bool.booleanValue()) {
            C0382z4 c0382z4 = this.f2896d;
            if (c0382z4 != null) {
                Map map = (Map) ((Map) d.a(c0382z4.f5703e).f95e).get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z4 = false;
            if (this.f2899h.size() <= 1 && (str == null || !str.equals("custom"))) {
                z4 = true;
            }
            this.f2902k = Boolean.valueOf(z4);
        }
        return this.f2902k.booleanValue();
    }

    public final t f(ArrayList arrayList) {
        AbstractC0203C.e(arrayList);
        this.f2899h = new ArrayList(arrayList.size());
        this.f2900i = new ArrayList(arrayList.size());
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            X1.n nVar = (X1.n) arrayList.get(i5);
            if (nVar.c().equals("firebase")) {
                this.f2897e = (r) nVar;
            } else {
                this.f2900i.add(nVar.c());
            }
            this.f2899h.add((r) nVar);
        }
        if (this.f2897e == null) {
            this.f2897e = (r) this.f2899h.get(0);
        }
        return this;
    }

    public final void g(ArrayList arrayList) {
        f fVar;
        if (arrayList.isEmpty()) {
            fVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                X1.k kVar = (X1.k) it.next();
                if (kVar instanceof X1.k) {
                    arrayList2.add(kVar);
                }
            }
            fVar = new f(arrayList2);
        }
        this.f2905o = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iE0 = AbstractC0415a.e0(parcel, 20293);
        AbstractC0415a.Z(parcel, 1, this.f2896d, i5);
        AbstractC0415a.Z(parcel, 2, this.f2897e, i5);
        AbstractC0415a.a0(parcel, 3, this.f);
        AbstractC0415a.a0(parcel, 4, this.f2898g);
        AbstractC0415a.d0(parcel, 5, this.f2899h);
        AbstractC0415a.b0(parcel, 6, this.f2900i);
        AbstractC0415a.a0(parcel, 7, this.f2901j);
        boolean zE = e();
        AbstractC0415a.h0(parcel, 8, 4);
        parcel.writeInt(zE ? 1 : 0);
        AbstractC0415a.Z(parcel, 9, this.f2903l, i5);
        boolean z4 = this.f2904m;
        AbstractC0415a.h0(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC0415a.Z(parcel, 11, this.n, i5);
        AbstractC0415a.Z(parcel, 12, this.f2905o, i5);
        AbstractC0415a.g0(parcel, iE0);
    }

    public t(C0382z4 c0382z4, r rVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, u uVar, boolean z4, X1.r rVar2, f fVar) {
        this.f2896d = c0382z4;
        this.f2897e = rVar;
        this.f = str;
        this.f2898g = str2;
        this.f2899h = arrayList;
        this.f2900i = arrayList2;
        this.f2901j = str3;
        this.f2902k = bool;
        this.f2903l = uVar;
        this.f2904m = z4;
        this.n = rVar2;
        this.f2905o = fVar;
    }
}
