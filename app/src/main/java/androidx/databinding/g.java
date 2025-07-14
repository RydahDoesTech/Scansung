package androidx.databinding;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f3629a = new DataBinderMapperImpl();

    public static v a(View view) {
        v binding = v.getBinding(view);
        if (binding != null) {
            return binding;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        DataBinderMapperImpl dataBinderMapperImpl = f3629a;
        int layoutId = dataBinderMapperImpl.getLayoutId((String) tag);
        if (layoutId != 0) {
            return dataBinderMapperImpl.getDataBinder((f) null, view, layoutId);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    public static v b(ViewGroup viewGroup, int i5, int i6) {
        int childCount = viewGroup.getChildCount();
        int i7 = childCount - i5;
        DataBinderMapperImpl dataBinderMapperImpl = f3629a;
        if (i7 == 1) {
            return dataBinderMapperImpl.getDataBinder((f) null, viewGroup.getChildAt(childCount - 1), i6);
        }
        View[] viewArr = new View[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            viewArr[i8] = viewGroup.getChildAt(i8 + i5);
        }
        return dataBinderMapperImpl.getDataBinder((f) null, viewArr, i6);
    }

    public static v c(LayoutInflater layoutInflater, int i5, ViewGroup viewGroup, boolean z4) {
        boolean z5 = viewGroup != null && z4;
        return z5 ? b(viewGroup, z5 ? viewGroup.getChildCount() : 0, i5) : f3629a.getDataBinder((f) null, layoutInflater.inflate(i5, viewGroup, z4), i5);
    }

    public static v d(WindowInsetsBaseActivity windowInsetsBaseActivity, int i5) {
        windowInsetsBaseActivity.setContentView(i5);
        return b((ViewGroup) windowInsetsBaseActivity.getWindow().getDecorView().findViewById(R.id.content), 0, i5);
    }
}
