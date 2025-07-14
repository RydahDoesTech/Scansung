package H1;

import J2.b;
import android.content.Context;
import com.wssyncmldm.R;
import e1.AbstractC0415a;

/* loaded from: classes.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f810b;

    /* renamed from: c, reason: collision with root package name */
    public final int f811c;

    /* renamed from: d, reason: collision with root package name */
    public final int f812d;

    /* renamed from: e, reason: collision with root package name */
    public final float f813e;

    public a(Context context) {
        boolean zS = b.S(context, R.attr.elevationOverlayEnabled, false);
        int iO = AbstractC0415a.o(context, R.attr.elevationOverlayColor, 0);
        int iO2 = AbstractC0415a.o(context, R.attr.elevationOverlayAccentColor, 0);
        int iO3 = AbstractC0415a.o(context, R.attr.colorSurface, 0);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f809a = zS;
        this.f810b = iO;
        this.f811c = iO2;
        this.f812d = iO3;
        this.f813e = f5;
    }
}
