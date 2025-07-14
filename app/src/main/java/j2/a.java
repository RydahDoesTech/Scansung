package J2;

import android.content.Context;
import android.util.Log;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1570a;

    /* renamed from: c, reason: collision with root package name */
    public final String f1572c;

    /* renamed from: g, reason: collision with root package name */
    public final A1.c f1575g;

    /* renamed from: b, reason: collision with root package name */
    public String f1571b = "";

    /* renamed from: d, reason: collision with root package name */
    public String f1573d = "";
    public String f = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f1574e = false;

    public a(Context context) {
        this.f1572c = "";
        this.f1570a = context;
        this.f1572c = AbstractC0415a.y(context);
        if (L2.a.a(context) == 1) {
            A1.c cVar = new A1.c();
            cVar.f53e = false;
            cVar.f = "";
            this.f1575g = cVar;
        }
    }

    public final void a() {
        this.f1573d = "S";
        if (L2.a.a(this.f1570a) != 1) {
            if (IDMDmUICInterface.IDM_UIC_OPTION_IT_D.equals(this.f1573d) || "S".equals(this.f1573d)) {
                this.f1574e = true;
                return;
            } else {
                this.f1574e = false;
                return;
            }
        }
        String str = this.f1573d;
        A1.c cVar = this.f1575g;
        cVar.f = str;
        if ("S".equals(str)) {
            cVar.f = "Y";
        }
        if (((String) cVar.f).isEmpty()) {
            Log.w(L2.a.f1731a, "Empty agreement");
            cVar.f53e = false;
        } else if ("Y".equals((String) cVar.f) || IDMDmUICInterface.IDM_UIC_OPTION_IT_D.equals((String) cVar.f)) {
            cVar.f53e = true;
        } else {
            Log.w(L2.a.f1731a, "Wrong agreement : ".concat(str));
            cVar.f53e = false;
        }
    }
}
