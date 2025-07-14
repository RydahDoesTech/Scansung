package w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.idm.providers.mo.IDMMoInterface;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import v.AbstractC0885a;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0899a f9270a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9272c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9273d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9274e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9275g;

    /* renamed from: h, reason: collision with root package name */
    public int f9276h;

    /* renamed from: i, reason: collision with root package name */
    public int f9277i;

    /* renamed from: j, reason: collision with root package name */
    public int f9278j;

    /* renamed from: k, reason: collision with root package name */
    public View f9279k;

    /* renamed from: l, reason: collision with root package name */
    public View f9280l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9281m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f9282o;

    public d() {
        super(-2, -2);
        this.f9271b = false;
        this.f9272c = 0;
        this.f9273d = 0;
        this.f9274e = -1;
        this.f = -1;
        this.f9275g = 0;
        this.f9276h = 0;
        this.f9282o = new Rect();
    }

    public final boolean a(int i5) {
        if (i5 == 0) {
            return this.f9281m;
        }
        if (i5 != 1) {
            return false;
        }
        return this.n;
    }

    public d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        AbstractC0899a abstractC0899a;
        super(context, attributeSet);
        this.f9271b = false;
        this.f9272c = 0;
        this.f9273d = 0;
        this.f9274e = -1;
        this.f = -1;
        this.f9275g = 0;
        this.f9276h = 0;
        this.f9282o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0885a.f9196b);
        this.f9272c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f9273d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f9274e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f9275g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f9276h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f9271b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f3545x;
            if (TextUtils.isEmpty(string)) {
                abstractC0899a = null;
            } else {
                if (string.startsWith(IDMMoInterface.IDM_MO_ROOT_PATH)) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f3545x;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f3547z;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3546y);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0899a = (AbstractC0899a) constructor.newInstance(context, attributeSet);
                } catch (Exception e5) {
                    throw new RuntimeException(g4.f.d("Could not inflate Behavior subclass ", string), e5);
                }
            }
            this.f9270a = abstractC0899a;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC0899a abstractC0899a2 = this.f9270a;
        if (abstractC0899a2 != null) {
            abstractC0899a2.d(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f9271b = false;
        this.f9272c = 0;
        this.f9273d = 0;
        this.f9274e = -1;
        this.f = -1;
        this.f9275g = 0;
        this.f9276h = 0;
        this.f9282o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9271b = false;
        this.f9272c = 0;
        this.f9273d = 0;
        this.f9274e = -1;
        this.f = -1;
        this.f9275g = 0;
        this.f9276h = 0;
        this.f9282o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9271b = false;
        this.f9272c = 0;
        this.f9273d = 0;
        this.f9274e = -1;
        this.f = -1;
        this.f9275g = 0;
        this.f9276h = 0;
        this.f9282o = new Rect();
    }
}
