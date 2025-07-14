package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class O implements LayoutInflater.Factory2 {

    /* renamed from: d, reason: collision with root package name */
    public final a0 f3732d;

    public O(a0 a0Var) {
        this.f3732d = a0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        h0 h0VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        a0 a0Var = this.f3732d;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, a0Var);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f2803a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(U.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentA = resourceId != -1 ? a0Var.A(resourceId) : null;
                if (fragmentA == null && string != null) {
                    fragmentA = a0Var.B(string);
                }
                if (fragmentA == null && id != -1) {
                    fragmentA = a0Var.A(id);
                }
                if (fragmentA == null) {
                    U uD = a0Var.D();
                    context.getClassLoader();
                    fragmentA = uD.a(attributeValue);
                    fragmentA.mFromLayout = true;
                    fragmentA.mFragmentId = resourceId != 0 ? resourceId : id;
                    fragmentA.mContainerId = id;
                    fragmentA.mTag = string;
                    fragmentA.mInLayout = true;
                    fragmentA.mFragmentManager = a0Var;
                    M m4 = a0Var.f3782t;
                    fragmentA.mHost = m4;
                    fragmentA.onInflate((Context) m4.f3728e, attributeSet, fragmentA.mSavedFragmentState);
                    h0VarF = a0Var.a(fragmentA);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + fragmentA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (fragmentA.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentA.mInLayout = true;
                    fragmentA.mFragmentManager = a0Var;
                    M m5 = a0Var.f3782t;
                    fragmentA.mHost = m5;
                    fragmentA.onInflate((Context) m5.f3728e, attributeSet, fragmentA.mSavedFragmentState);
                    h0VarF = a0Var.f(fragmentA);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragmentA + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Z.c cVar = Z.d.f2849a;
                Z.d.b(new Z.e(fragmentA, viewGroup, 0));
                Z.d.a(fragmentA).getClass();
                fragmentA.mContainer = viewGroup;
                h0VarF.k();
                h0VarF.j();
                View view2 = fragmentA.mView;
                if (view2 == null) {
                    throw new IllegalStateException(A3.f.o("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentA.mView.getTag() == null) {
                    fragmentA.mView.setTag(string);
                }
                fragmentA.mView.addOnAttachStateChangeListener(new N(this, h0VarF));
                return fragmentA.mView;
            }
        }
        return null;
    }
}
