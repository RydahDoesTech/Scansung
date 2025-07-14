package t;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements InterfaceC0872d {

    /* renamed from: d, reason: collision with root package name */
    public final o f8930d;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f8932g;

    /* renamed from: a, reason: collision with root package name */
    public o f8927a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8928b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8929c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f8931e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f8933h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f8934i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8935j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8936k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f8937l = new ArrayList();

    public f(o oVar) {
        this.f8930d = oVar;
    }

    @Override // t.InterfaceC0872d
    public final void a(InterfaceC0872d interfaceC0872d) {
        ArrayList arrayList = this.f8937l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f8935j) {
                return;
            }
        }
        this.f8929c = true;
        o oVar = this.f8927a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f8928b) {
            this.f8930d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i5 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i5++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i5 == 1 && fVar.f8935j) {
            g gVar = this.f8934i;
            if (gVar != null) {
                if (!gVar.f8935j) {
                    return;
                } else {
                    this.f = this.f8933h * gVar.f8932g;
                }
            }
            d(fVar.f8932g + this.f);
        }
        o oVar2 = this.f8927a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f8936k.add(oVar);
        if (this.f8935j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f8937l.clear();
        this.f8936k.clear();
        this.f8935j = false;
        this.f8932g = 0;
        this.f8929c = false;
        this.f8928b = false;
    }

    public void d(int i5) {
        if (this.f8935j) {
            return;
        }
        this.f8935j = true;
        this.f8932g = i5;
        Iterator it = this.f8936k.iterator();
        while (it.hasNext()) {
            InterfaceC0872d interfaceC0872d = (InterfaceC0872d) it.next();
            interfaceC0872d.a(interfaceC0872d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8930d.f8951b.f8637b0);
        sb.append(":");
        switch (this.f8931e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f8935j ? Integer.valueOf(this.f8932g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8937l.size());
        sb.append(":d=");
        sb.append(this.f8936k.size());
        sb.append(">");
        return sb.toString();
    }
}
