package androidx.databinding.library.baseAdapters;

import U.a;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f3630a = new SparseIntArray(0);

    @Override // androidx.databinding.e
    public final List collectDependencies() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.e
    public final v getDataBinder(f fVar, View view, int i5) {
        if (f3630a.get(i5) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public final int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) a.f2557a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.e
    public final v getDataBinder(f fVar, View[] viewArr, int i5) {
        if (viewArr.length != 0 && f3630a.get(i5) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
