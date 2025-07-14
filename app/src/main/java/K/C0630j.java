package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import r0.AbstractC0808b;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630j extends AppCompatTextView {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0633k f7678k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630j(C0633k c0633k, Context context) throws NoSuchMethodException, SecurityException {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f7678k = c0633k;
        setClickable(true);
        setFocusable(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC0220a.f5120j, 0, 0);
        setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(26, 0));
        typedArrayObtainStyledAttributes.recycle();
        setText(getResources().getString(R.string.sesl_more_item_label));
        boolean zI = J2.b.I(context);
        c0633k.getClass();
        if (zI) {
            setBackgroundResource(R.drawable.sesl_action_bar_item_text_background_light);
        } else {
            setBackgroundResource(R.drawable.sesl_action_bar_item_text_background_dark);
        }
        AbstractC0808b.k(this, true);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f7678k.l();
        return true;
    }
}
