package J;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class C extends E {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1413e;

    public C(int i5, Class cls, int i6, int i7, int i8) {
        this.f1413e = i8;
        this.f1415a = i5;
        this.f1418d = cls;
        this.f1417c = i6;
        this.f1416b = i7;
    }

    @Override // J.E
    public final Object b(View view) {
        switch (this.f1413e) {
            case 0:
                return L.b(view);
            case 1:
                return N.b(view);
            default:
                return Boolean.valueOf(L.c(view));
        }
    }

    @Override // J.E
    public final void c(View view, Object obj) {
        switch (this.f1413e) {
            case 0:
                L.h(view, (CharSequence) obj);
                break;
            case 1:
                N.e(view, (CharSequence) obj);
                break;
            default:
                L.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // J.E
    public final boolean e(Object obj, Object obj2) {
        switch (this.f1413e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return true ^ ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}
