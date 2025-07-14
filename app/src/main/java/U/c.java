package u;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import s.C0822d;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: d, reason: collision with root package name */
    public int[] f8986d;

    /* renamed from: e, reason: collision with root package name */
    public int f8987e;
    public Context f;

    /* renamed from: g, reason: collision with root package name */
    public s.i f8988g;

    /* renamed from: h, reason: collision with root package name */
    public String f8989h;

    /* renamed from: i, reason: collision with root package name */
    public String f8990i;

    /* renamed from: j, reason: collision with root package name */
    public HashMap f8991j;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto La5
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La5
        La:
            android.content.Context r0 = r5.f
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L59
            if (r1 == 0) goto L59
            if (r6 == 0) goto L4d
            java.util.HashMap r3 = r1.f3538p
            if (r3 == 0) goto L4d
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4d
            java.util.HashMap r3 = r1.f3538p
            java.lang.Object r3 = r3.get(r6)
            goto L4e
        L4d:
            r3 = r2
        L4e:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L59
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5a
        L59:
            r3 = 0
        L5a:
            if (r3 != 0) goto L62
            if (r1 == 0) goto L62
            int r3 = r5.e(r1, r6)
        L62:
            if (r3 != 0) goto L6e
            java.lang.Class<u.n> r1 = u.n.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6e
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6e
        L6e:
            if (r3 != 0) goto L7e
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7e:
            if (r3 == 0) goto L8d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f8991j
            r1.put(r0, r6)
            r5.b(r3)
            goto La5
        L8d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.a(java.lang.String):void");
    }

    public final void b(int i5) {
        if (i5 == getId()) {
            return;
        }
        int i6 = this.f8987e + 1;
        int[] iArr = this.f8986d;
        if (i6 > iArr.length) {
            this.f8986d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f8986d;
        int i7 = this.f8987e;
        iArr2[i7] = i5;
        this.f8987e = i7 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && strTrim.equals(((e) layoutParams).f9012U)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i5 = 0; i5 < this.f8987e; i5++) {
            View view = (View) constraintLayout.f3528d.get(this.f8986d[i5]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void f(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f9146b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8989h = string;
                    setIds(string);
                } else if (index == 20) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f8990i = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void g(C0822d c0822d, boolean z4);

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f8986d, this.f8987e);
    }

    public final void h() {
        if (this.f8988g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).k0 = this.f8988g;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f8989h;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f8990i;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f8989h = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f8987e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i5);
            if (iIndexOf == -1) {
                a(str.substring(i5));
                return;
            } else {
                a(str.substring(i5, iIndexOf));
                i5 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f8990i = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f8987e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i5);
            if (iIndexOf == -1) {
                c(str.substring(i5));
                return;
            } else {
                c(str.substring(i5, iIndexOf));
                i5 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f8989h = null;
        this.f8987e = 0;
        for (int i5 : iArr) {
            b(i5);
        }
    }

    @Override // android.view.View
    public final void setTag(int i5, Object obj) {
        super.setTag(i5, obj);
        if (obj == null && this.f8989h == null) {
            b(i5);
        }
    }
}
