package w1;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.google.android.material.appbar.SeslImmersiveScrollBehavior;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeslImmersiveScrollBehavior f9296a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SeslImmersiveScrollBehavior seslImmersiveScrollBehavior) {
        super(1);
        this.f9296a = seslImmersiveScrollBehavior;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        super.onEnd(windowInsetsAnimation);
        this.f9296a.getClass();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        return windowInsets;
    }
}
