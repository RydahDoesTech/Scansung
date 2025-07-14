package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.wssyncmldm.R;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627i extends FrameLayout implements InterfaceC0636l {

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f7672d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f7673e;
    public final View f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f7674g;

    /* renamed from: h, reason: collision with root package name */
    public String f7675h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0633k f7676i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0627i(C0633k c0633k, Context context) throws Resources.NotFoundException {
        super(context);
        this.f7676i = c0633k;
        View c0630j = c0633k.f7689A ? new C0630j(c0633k, context) : new C0624h(c0633k, context);
        this.f = c0630j;
        addView(c0630j, new FrameLayout.LayoutParams(-2, -2));
        Resources resources = getResources();
        if (c0630j instanceof C0624h) {
            this.f7674g = c0630j.getContentDescription();
            this.f7675h = ((Object) this.f7674g) + " , " + resources.getString(R.string.sesl_action_menu_overflow_badge_description);
        }
        if (TextUtils.isEmpty(this.f7674g)) {
            CharSequence string = resources.getString(R.string.sesl_action_menu_overflow_description);
            this.f7674g = string;
            c0630j.setContentDescription(string);
        }
        ViewGroup viewGroup = (ViewGroup) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.sesl_action_menu_item_badge, (ViewGroup) this, false);
        this.f7672d = viewGroup;
        this.f7673e = (TextView) viewGroup.getChildAt(0);
        addView(viewGroup);
    }

    @Override // k.InterfaceC0636l
    public final boolean a() {
        return false;
    }

    @Override // k.InterfaceC0636l
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        float dimension;
        super.onConfigurationChanged(configuration);
        Resources resources = getResources();
        float dimension2 = (int) resources.getDimension(R.dimen.sesl_menu_item_badge_text_size);
        TextView textView = this.f7673e;
        textView.setTextSize(0, dimension2);
        ViewGroup viewGroup = this.f7672d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        CharSequence text = textView.getText();
        if (text == null || text.toString() == null) {
            float dimension3 = resources.getDimension(R.dimen.sesl_badge_default_width);
            if (text != null) {
                dimension = resources.getDimension(R.dimen.sesl_badge_additional_width) * text.length();
            } else {
                dimension = 0.0f;
            }
            marginLayoutParams.width = (int) (dimension3 + dimension);
            marginLayoutParams.height = (int) (resources.getDimension(R.dimen.sesl_badge_additional_width) + resources.getDimension(R.dimen.sesl_badge_default_width));
            marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.sesl_menu_item_number_badge_top_margin);
            marginLayoutParams.setMarginEnd((int) resources.getDimension(R.dimen.sesl_menu_item_number_badge_end_margin));
        } else {
            marginLayoutParams.width = (int) resources.getDimension(R.dimen.sesl_menu_item_badge_size);
            marginLayoutParams.height = (int) resources.getDimension(R.dimen.sesl_menu_item_badge_size);
        }
        viewGroup.setLayoutParams(marginLayoutParams);
        View view = this.f;
        boolean z4 = view instanceof C0624h;
        if (z4) {
            this.f7674g = getContentDescription();
            this.f7675h = ((Object) this.f7674g) + " , " + resources.getString(R.string.sesl_action_menu_overflow_badge_description);
        }
        if (TextUtils.isEmpty(this.f7674g)) {
            this.f7674g = resources.getString(R.string.sesl_action_menu_overflow_description);
            this.f7675h = ((Object) this.f7674g) + " , " + resources.getString(R.string.sesl_action_menu_overflow_badge_description);
        }
        if (viewGroup.getVisibility() == 0) {
            if (z4) {
                view.setContentDescription(this.f7675h);
            }
        } else if (z4) {
            view.setContentDescription(this.f7674g);
        }
    }
}
