package e;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import j.DialogInterfaceOnKeyListenerC0493j;

/* renamed from: e.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407j {

    /* renamed from: a, reason: collision with root package name */
    public final C0404g f6601a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6602b;

    public C0407j(Context context) {
        int iG = DialogInterfaceC0408k.g(context, 0);
        this.f6601a = new C0404g(new ContextThemeWrapper(context, DialogInterfaceC0408k.g(context, iG)));
        this.f6602b = iG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    public final DialogInterfaceC0408k a() {
        ?? c0405h;
        C0404g c0404g = this.f6601a;
        DialogInterfaceC0408k dialogInterfaceC0408k = new DialogInterfaceC0408k(c0404g.f6549a, this.f6602b);
        View view = c0404g.f6553e;
        C0406i c0406i = dialogInterfaceC0408k.f6605i;
        if (view != null) {
            c0406i.f6597w = view;
        } else {
            CharSequence charSequence = c0404g.f6552d;
            if (charSequence != null) {
                c0406i.f6580d = charSequence;
                TextView textView = c0406i.f6595u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0404g.f6551c;
            if (drawable != null) {
                c0406i.f6593s = drawable;
                ImageView imageView = c0406i.f6594t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0406i.f6594t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0404g.f;
        if (charSequence2 != null) {
            c0406i.f6581e = charSequence2;
            TextView textView2 = c0406i.f6596v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0404g.f6554g;
        if (charSequence3 != null) {
            c0406i.d(-1, charSequence3, c0404g.f6555h);
        }
        CharSequence charSequence4 = c0404g.f6556i;
        if (charSequence4 != null) {
            c0406i.d(-2, charSequence4, c0404g.f6557j);
        }
        String str = c0404g.f6558k;
        if (str != null) {
            c0406i.d(-3, str, c0404g.f6559l);
        }
        if (c0404g.n != null || c0404g.f6561o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0404g.f6550b.inflate(c0406i.f6569A, (ViewGroup) null);
            boolean z4 = c0404g.f6565s;
            ContextThemeWrapper contextThemeWrapper = c0404g.f6549a;
            if (z4) {
                c0405h = new C0401d(c0404g, contextThemeWrapper, c0406i.f6570B, c0404g.n, alertController$RecycleListView);
            } else {
                int i5 = c0404g.f6566t ? c0406i.f6571C : c0406i.f6572D;
                Object obj = c0404g.f6561o;
                c0405h = obj;
                if (obj == null) {
                    c0405h = new C0405h(contextThemeWrapper, i5, R.id.text1, c0404g.n);
                }
            }
            c0406i.f6598x = c0405h;
            c0406i.f6599y = c0404g.f6567u;
            if (c0404g.f6562p != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0402e(c0404g, c0406i));
            } else if (c0404g.f6568v != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0403f(c0404g, alertController$RecycleListView, c0406i));
            }
            if (c0404g.f6566t) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c0404g.f6565s) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c0406i.f = alertController$RecycleListView;
        }
        View view2 = c0404g.f6563q;
        if (view2 != null) {
            c0406i.f6582g = view2;
            c0406i.f6583h = false;
        }
        dialogInterfaceC0408k.setCancelable(true);
        dialogInterfaceC0408k.setCanceledOnTouchOutside(true);
        dialogInterfaceC0408k.setOnCancelListener(null);
        dialogInterfaceC0408k.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0493j dialogInterfaceOnKeyListenerC0493j = c0404g.f6560m;
        if (dialogInterfaceOnKeyListenerC0493j != null) {
            dialogInterfaceC0408k.setOnKeyListener(dialogInterfaceOnKeyListenerC0493j);
        }
        return dialogInterfaceC0408k;
    }
}
