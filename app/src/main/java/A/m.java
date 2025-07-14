package A;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f25a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f26b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27c;

    public m(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f25a = colorStateList;
        this.f26b = new Configuration(configuration);
        this.f27c = theme == null ? 0 : theme.hashCode();
    }
}
