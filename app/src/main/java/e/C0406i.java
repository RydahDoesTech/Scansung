package e;

import J.C0062t;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import c.AbstractC0220a;
import com.wssyncmldm.R;
import java.lang.ref.WeakReference;

/* renamed from: e.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406i {

    /* renamed from: A, reason: collision with root package name */
    public final int f6569A;

    /* renamed from: B, reason: collision with root package name */
    public final int f6570B;

    /* renamed from: C, reason: collision with root package name */
    public final int f6571C;

    /* renamed from: D, reason: collision with root package name */
    public final int f6572D;
    public int E;

    /* renamed from: F, reason: collision with root package name */
    public C0062t f6573F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f6574G;

    /* renamed from: H, reason: collision with root package name */
    public final O.l f6575H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6577a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0408k f6578b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f6579c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f6580d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f6581e;
    public AlertController$RecycleListView f;

    /* renamed from: g, reason: collision with root package name */
    public View f6582g;

    /* renamed from: i, reason: collision with root package name */
    public Button f6584i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f6585j;

    /* renamed from: k, reason: collision with root package name */
    public Message f6586k;

    /* renamed from: l, reason: collision with root package name */
    public Button f6587l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6588m;
    public Message n;

    /* renamed from: o, reason: collision with root package name */
    public Button f6589o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f6590p;

    /* renamed from: q, reason: collision with root package name */
    public Message f6591q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f6592r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f6593s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f6594t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f6595u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f6596v;

    /* renamed from: w, reason: collision with root package name */
    public View f6597w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f6598x;

    /* renamed from: z, reason: collision with root package name */
    public final int f6600z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6583h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f6599y = -1;

    /* renamed from: I, reason: collision with root package name */
    public final com.google.android.material.datepicker.k f6576I = new com.google.android.material.datepicker.k(1, this);

    public C0406i(Context context, DialogInterfaceC0408k dialogInterfaceC0408k, Window window) {
        this.f6577a = context;
        this.f6578b = dialogInterfaceC0408k;
        this.f6579c = window;
        O.l lVar = new O.l();
        lVar.f1899b = new WeakReference(dialogInterfaceC0408k);
        this.f6575H = lVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0220a.f5116e, R.attr.alertDialogStyle, 0);
        this.f6600z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f6569A = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6570B = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        this.f6571C = typedArrayObtainStyledAttributes.getResourceId(9, 0);
        this.f6572D = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f6574G = typedArrayObtainStyledAttributes.getBoolean(8, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0408k.e().j(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(TextView textView, int i5) {
        float f = this.f6577a.getResources().getConfiguration().fontScale;
        if (f > 1.3f) {
            textView.setTextSize(0, (i5 / f) * 1.3f);
        }
    }

    public final void d(int i5, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f6575H.obtainMessage(i5, onClickListener) : null;
        if (i5 == -3) {
            this.f6590p = charSequence;
            this.f6591q = messageObtainMessage;
        } else if (i5 == -2) {
            this.f6588m = charSequence;
            this.n = messageObtainMessage;
        } else {
            if (i5 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f6585j = charSequence;
            this.f6586k = messageObtainMessage;
        }
    }
}
