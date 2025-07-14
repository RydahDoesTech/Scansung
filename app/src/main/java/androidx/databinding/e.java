package androidx.databinding;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public List collectDependencies() {
        return Collections.emptyList();
    }

    public abstract v getDataBinder(f fVar, View view, int i5);

    public abstract v getDataBinder(f fVar, View[] viewArr, int i5);

    public abstract int getLayoutId(String str);
}
