package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import androidx.fragment.app.Fragment;
import com.samsung.android.knox.ex.KnoxContract;
import e.C0404g;
import e.C0407j;
import e.DialogInterfaceC0408k;

/* loaded from: classes.dex */
public abstract class s extends DialogInterfaceOnCancelListenerC0130s implements DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public DialogPreference f4675d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4676e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f4677g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f4678h;

    /* renamed from: i, reason: collision with root package name */
    public int f4679i;

    /* renamed from: j, reason: collision with root package name */
    public BitmapDrawable f4680j;

    /* renamed from: k, reason: collision with root package name */
    public int f4681k;

    public final DialogPreference g() {
        if (this.f4675d == null) {
            this.f4675d = (DialogPreference) ((z) getTargetFragment()).findPreference(requireArguments().getString(KnoxContract.KEY));
        }
        return this.f4675d;
    }

    public void h(View view) {
        int i5;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f4678h;
            if (TextUtils.isEmpty(charSequence)) {
                i5 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i5 = 0;
            }
            if (viewFindViewById.getVisibility() != i5) {
                viewFindViewById.setVisibility(i5);
            }
        }
    }

    public abstract void i(boolean z4);

    public void j(C0407j c0407j) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        this.f4681k = i5;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof z)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        z zVar = (z) targetFragment;
        String string = requireArguments().getString(KnoxContract.KEY);
        if (bundle != null) {
            this.f4676e = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f4677g = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f4678h = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f4679i = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f4680j = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) zVar.findPreference(string);
        this.f4675d = dialogPreference;
        this.f4676e = dialogPreference.f4524Z;
        this.f = dialogPreference.f4527c0;
        this.f4677g = dialogPreference.f4528d0;
        this.f4678h = dialogPreference.f4525a0;
        this.f4679i = dialogPreference.f4529e0;
        Drawable drawable = dialogPreference.f4526b0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f4680j = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f4680j = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f4681k = -2;
        C0407j c0407j = new C0407j(requireContext());
        CharSequence charSequence = this.f4676e;
        C0404g c0404g = c0407j.f6601a;
        c0404g.f6552d = charSequence;
        c0404g.f6551c = this.f4680j;
        c0404g.f6554g = this.f;
        c0404g.f6555h = this;
        c0404g.f6556i = this.f4677g;
        c0404g.f6557j = this;
        requireContext();
        int i5 = this.f4679i;
        View viewInflate = i5 != 0 ? getLayoutInflater().inflate(i5, (ViewGroup) null) : null;
        if (viewInflate != null) {
            h(viewInflate);
            c0404g.f6563q = viewInflate;
        } else {
            c0404g.f = this.f4678h;
        }
        j(c0407j);
        DialogInterfaceC0408k dialogInterfaceC0408kA = c0407j.a();
        if (this instanceof C0185d) {
            r.a(dialogInterfaceC0408kA.getWindow());
        }
        return dialogInterfaceC0408kA;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        i(this.f4681k == -1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f4676e);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f4677g);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f4678h);
        bundle.putInt("PreferenceDialogFragment.layout", this.f4679i);
        BitmapDrawable bitmapDrawable = this.f4680j;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
