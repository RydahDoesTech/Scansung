package u;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f9056a;

    /* renamed from: b, reason: collision with root package name */
    public final j f9057b;

    /* renamed from: c, reason: collision with root package name */
    public final i f9058c;

    /* renamed from: d, reason: collision with root package name */
    public final h f9059d;

    /* renamed from: e, reason: collision with root package name */
    public final k f9060e;
    public HashMap f;

    public g() {
        j jVar = new j();
        jVar.f9124a = 0;
        jVar.f9125b = 0;
        jVar.f9126c = 1.0f;
        jVar.f9127d = Float.NaN;
        this.f9057b = jVar;
        i iVar = new i();
        iVar.f9120a = -1;
        iVar.f9121b = -1;
        iVar.f9122c = Float.NaN;
        iVar.f9123d = Float.NaN;
        this.f9058c = iVar;
        h hVar = new h();
        hVar.f9087a = false;
        hVar.f9093d = -1;
        hVar.f9095e = -1;
        hVar.f = -1.0f;
        hVar.f9098g = -1;
        hVar.f9099h = -1;
        hVar.f9101i = -1;
        hVar.f9103j = -1;
        hVar.f9104k = -1;
        hVar.f9105l = -1;
        hVar.f9106m = -1;
        hVar.n = -1;
        hVar.f9107o = -1;
        hVar.f9108p = -1;
        hVar.f9109q = -1;
        hVar.f9110r = -1;
        hVar.f9111s = -1;
        hVar.f9112t = 0.5f;
        hVar.f9113u = 0.5f;
        hVar.f9114v = null;
        hVar.f9115w = -1;
        hVar.f9116x = 0;
        hVar.f9117y = 0.0f;
        hVar.f9118z = -1;
        hVar.f9062A = -1;
        hVar.f9063B = -1;
        hVar.f9064C = -1;
        hVar.f9065D = -1;
        hVar.E = -1;
        hVar.f9066F = -1;
        hVar.f9067G = -1;
        hVar.f9068H = -1;
        hVar.f9069I = -1;
        hVar.f9070J = -1;
        hVar.f9071K = -1;
        hVar.f9072L = -1;
        hVar.f9073M = -1;
        hVar.f9074N = -1;
        hVar.f9075O = -1.0f;
        hVar.f9076P = -1.0f;
        hVar.f9077Q = 0;
        hVar.f9078R = 0;
        hVar.f9079S = 0;
        hVar.f9080T = 0;
        hVar.f9081U = -1;
        hVar.f9082V = -1;
        hVar.f9083W = -1;
        hVar.f9084X = -1;
        hVar.f9085Y = 1.0f;
        hVar.f9086Z = 1.0f;
        hVar.f9088a0 = -1;
        hVar.f9090b0 = 0;
        hVar.f9092c0 = -1;
        hVar.g0 = false;
        hVar.f9100h0 = false;
        hVar.f9102i0 = true;
        this.f9059d = hVar;
        k kVar = new k();
        kVar.f9129a = 0.0f;
        kVar.f9130b = 0.0f;
        kVar.f9131c = 0.0f;
        kVar.f9132d = 1.0f;
        kVar.f9133e = 1.0f;
        kVar.f = Float.NaN;
        kVar.f9134g = Float.NaN;
        kVar.f9135h = 0.0f;
        kVar.f9136i = 0.0f;
        kVar.f9137j = 0.0f;
        kVar.f9138k = false;
        kVar.f9139l = 0.0f;
        this.f9060e = kVar;
        this.f = new HashMap();
    }

    public final void a(e eVar) {
        h hVar = this.f9059d;
        eVar.f9024d = hVar.f9098g;
        eVar.f9026e = hVar.f9099h;
        eVar.f = hVar.f9101i;
        eVar.f9029g = hVar.f9103j;
        eVar.f9030h = hVar.f9104k;
        eVar.f9032i = hVar.f9105l;
        eVar.f9034j = hVar.f9106m;
        eVar.f9036k = hVar.n;
        eVar.f9037l = hVar.f9107o;
        eVar.f9040p = hVar.f9108p;
        eVar.f9041q = hVar.f9109q;
        eVar.f9042r = hVar.f9110r;
        eVar.f9043s = hVar.f9111s;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = hVar.f9064C;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = hVar.f9065D;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = hVar.E;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = hVar.f9066F;
        eVar.f9048x = hVar.f9074N;
        eVar.f9049y = hVar.f9073M;
        eVar.f9045u = hVar.f9070J;
        eVar.f9047w = hVar.f9072L;
        eVar.f9050z = hVar.f9112t;
        eVar.f8993A = hVar.f9113u;
        eVar.f9038m = hVar.f9115w;
        eVar.n = hVar.f9116x;
        eVar.f9039o = hVar.f9117y;
        eVar.f8994B = hVar.f9114v;
        eVar.f9007P = hVar.f9118z;
        eVar.f9008Q = hVar.f9062A;
        eVar.E = hVar.f9075O;
        eVar.f8996D = hVar.f9076P;
        eVar.f8998G = hVar.f9078R;
        eVar.f8997F = hVar.f9077Q;
        eVar.f9010S = hVar.g0;
        eVar.f9011T = hVar.f9100h0;
        eVar.f8999H = hVar.f9079S;
        eVar.f9000I = hVar.f9080T;
        eVar.f9003L = hVar.f9081U;
        eVar.f9004M = hVar.f9082V;
        eVar.f9001J = hVar.f9083W;
        eVar.f9002K = hVar.f9084X;
        eVar.f9005N = hVar.f9085Y;
        eVar.f9006O = hVar.f9086Z;
        eVar.f9009R = hVar.f9063B;
        eVar.f9022c = hVar.f;
        eVar.f9018a = hVar.f9093d;
        eVar.f9020b = hVar.f9095e;
        ((ViewGroup.MarginLayoutParams) eVar).width = hVar.f9089b;
        ((ViewGroup.MarginLayoutParams) eVar).height = hVar.f9091c;
        String str = hVar.f9097f0;
        if (str != null) {
            eVar.f9012U = str;
        }
        eVar.setMarginStart(hVar.f9068H);
        eVar.setMarginEnd(hVar.f9067G);
        eVar.a();
    }

    public final Object clone() {
        g gVar = new g();
        h hVar = gVar.f9059d;
        hVar.getClass();
        h hVar2 = this.f9059d;
        hVar.f9087a = hVar2.f9087a;
        hVar.f9089b = hVar2.f9089b;
        hVar.f9091c = hVar2.f9091c;
        hVar.f9093d = hVar2.f9093d;
        hVar.f9095e = hVar2.f9095e;
        hVar.f = hVar2.f;
        hVar.f9098g = hVar2.f9098g;
        hVar.f9099h = hVar2.f9099h;
        hVar.f9101i = hVar2.f9101i;
        hVar.f9103j = hVar2.f9103j;
        hVar.f9104k = hVar2.f9104k;
        hVar.f9105l = hVar2.f9105l;
        hVar.f9106m = hVar2.f9106m;
        hVar.n = hVar2.n;
        hVar.f9107o = hVar2.f9107o;
        hVar.f9108p = hVar2.f9108p;
        hVar.f9109q = hVar2.f9109q;
        hVar.f9110r = hVar2.f9110r;
        hVar.f9111s = hVar2.f9111s;
        hVar.f9112t = hVar2.f9112t;
        hVar.f9113u = hVar2.f9113u;
        hVar.f9114v = hVar2.f9114v;
        hVar.f9115w = hVar2.f9115w;
        hVar.f9116x = hVar2.f9116x;
        hVar.f9117y = hVar2.f9117y;
        hVar.f9118z = hVar2.f9118z;
        hVar.f9062A = hVar2.f9062A;
        hVar.f9063B = hVar2.f9063B;
        hVar.f9064C = hVar2.f9064C;
        hVar.f9065D = hVar2.f9065D;
        hVar.E = hVar2.E;
        hVar.f9066F = hVar2.f9066F;
        hVar.f9067G = hVar2.f9067G;
        hVar.f9068H = hVar2.f9068H;
        hVar.f9069I = hVar2.f9069I;
        hVar.f9070J = hVar2.f9070J;
        hVar.f9071K = hVar2.f9071K;
        hVar.f9072L = hVar2.f9072L;
        hVar.f9073M = hVar2.f9073M;
        hVar.f9074N = hVar2.f9074N;
        hVar.f9075O = hVar2.f9075O;
        hVar.f9076P = hVar2.f9076P;
        hVar.f9077Q = hVar2.f9077Q;
        hVar.f9078R = hVar2.f9078R;
        hVar.f9079S = hVar2.f9079S;
        hVar.f9080T = hVar2.f9080T;
        hVar.f9081U = hVar2.f9081U;
        hVar.f9082V = hVar2.f9082V;
        hVar.f9083W = hVar2.f9083W;
        hVar.f9084X = hVar2.f9084X;
        hVar.f9085Y = hVar2.f9085Y;
        hVar.f9086Z = hVar2.f9086Z;
        hVar.f9088a0 = hVar2.f9088a0;
        hVar.f9090b0 = hVar2.f9090b0;
        hVar.f9092c0 = hVar2.f9092c0;
        hVar.f9097f0 = hVar2.f9097f0;
        int[] iArr = hVar2.f9094d0;
        if (iArr != null) {
            hVar.f9094d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            hVar.f9094d0 = null;
        }
        hVar.f9096e0 = hVar2.f9096e0;
        hVar.g0 = hVar2.g0;
        hVar.f9100h0 = hVar2.f9100h0;
        hVar.f9102i0 = hVar2.f9102i0;
        i iVar = gVar.f9058c;
        iVar.getClass();
        i iVar2 = this.f9058c;
        iVar2.getClass();
        iVar.f9120a = iVar2.f9120a;
        iVar.f9121b = iVar2.f9121b;
        iVar.f9123d = iVar2.f9123d;
        iVar.f9122c = iVar2.f9122c;
        j jVar = gVar.f9057b;
        j jVar2 = this.f9057b;
        jVar.f9124a = jVar2.f9124a;
        jVar.f9126c = jVar2.f9126c;
        jVar.f9127d = jVar2.f9127d;
        jVar.f9125b = jVar2.f9125b;
        k kVar = gVar.f9060e;
        kVar.getClass();
        k kVar2 = this.f9060e;
        kVar2.getClass();
        kVar.f9129a = kVar2.f9129a;
        kVar.f9130b = kVar2.f9130b;
        kVar.f9131c = kVar2.f9131c;
        kVar.f9132d = kVar2.f9132d;
        kVar.f9133e = kVar2.f9133e;
        kVar.f = kVar2.f;
        kVar.f9134g = kVar2.f9134g;
        kVar.f9135h = kVar2.f9135h;
        kVar.f9136i = kVar2.f9136i;
        kVar.f9137j = kVar2.f9137j;
        kVar.f9138k = kVar2.f9138k;
        kVar.f9139l = kVar2.f9139l;
        gVar.f9056a = this.f9056a;
        return gVar;
    }
}
