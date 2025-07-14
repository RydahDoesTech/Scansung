package C0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.samsung.android.knox.custom.CustomDeviceManager;
import o.C0704b;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f304p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f305a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f306b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f307c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f308d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f309e;
    public PathMeasure f;

    /* renamed from: g, reason: collision with root package name */
    public final j f310g;

    /* renamed from: h, reason: collision with root package name */
    public float f311h;

    /* renamed from: i, reason: collision with root package name */
    public float f312i;

    /* renamed from: j, reason: collision with root package name */
    public float f313j;

    /* renamed from: k, reason: collision with root package name */
    public float f314k;

    /* renamed from: l, reason: collision with root package name */
    public int f315l;

    /* renamed from: m, reason: collision with root package name */
    public String f316m;
    public Boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final C0704b f317o;

    public m() {
        this.f307c = new Matrix();
        this.f311h = 0.0f;
        this.f312i = 0.0f;
        this.f313j = 0.0f;
        this.f314k = 0.0f;
        this.f315l = CustomDeviceManager.CALL_SCREEN_ALL;
        this.f316m = null;
        this.n = null;
        this.f317o = new C0704b();
        this.f310g = new j();
        this.f305a = new Path();
        this.f306b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(C0.j r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.m.a(C0.j, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f315l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i5) {
        this.f315l = i5;
    }

    public m(m mVar) {
        this.f307c = new Matrix();
        this.f311h = 0.0f;
        this.f312i = 0.0f;
        this.f313j = 0.0f;
        this.f314k = 0.0f;
        this.f315l = CustomDeviceManager.CALL_SCREEN_ALL;
        this.f316m = null;
        this.n = null;
        C0704b c0704b = new C0704b();
        this.f317o = c0704b;
        this.f310g = new j(mVar.f310g, c0704b);
        this.f305a = new Path(mVar.f305a);
        this.f306b = new Path(mVar.f306b);
        this.f311h = mVar.f311h;
        this.f312i = mVar.f312i;
        this.f313j = mVar.f313j;
        this.f314k = mVar.f314k;
        this.f315l = mVar.f315l;
        this.f316m = mVar.f316m;
        String str = mVar.f316m;
        if (str != null) {
            c0704b.put(str, this);
        }
        this.n = mVar.n;
    }
}
