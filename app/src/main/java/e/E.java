package e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import k.C0587B;
import k.C0644o;
import k.C0646p;
import o.C0713k;

/* loaded from: classes.dex */
public class E {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f6487b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6488c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f6489d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final C0713k f6490e = new C0713k();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f6491a = new Object[2];

    public C0644o a(Context context, AttributeSet attributeSet) {
        return new C0644o(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public C0646p c(Context context, AttributeSet attributeSet) {
        return new C0646p(context, attributeSet, com.wssyncmldm.R.attr.checkboxStyle);
    }

    public C0587B d(Context context, AttributeSet attributeSet) {
        return new C0587B(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        C0713k c0713k = f6490e;
        Constructor constructor = (Constructor) c0713k.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6487b);
            c0713k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6491a);
    }
}
