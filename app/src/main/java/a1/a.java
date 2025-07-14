package A1;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f48e;
    public final /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f49g;

    public /* synthetic */ a(androidx.activity.g gVar, int i5, Object obj, int i6) {
        this.f47d = i6;
        this.f49g = gVar;
        this.f48e = i5;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b bVar;
        switch (this.f47d) {
            case 0:
                ((BottomSheetBehavior) this.f49g).F((View) this.f, this.f48e, false);
                break;
            case 1:
                Object obj = ((M0.c) this.f).f1811d;
                androidx.activity.g gVar = (androidx.activity.g) this.f49g;
                String str = (String) gVar.f3156a.get(Integer.valueOf(this.f48e));
                if (str != null) {
                    androidx.activity.result.f fVar = (androidx.activity.result.f) gVar.f3160e.get(str);
                    if (fVar != null && (bVar = fVar.f3152a) != null) {
                        if (gVar.f3159d.remove(str)) {
                            bVar.a(obj);
                            break;
                        }
                    } else {
                        gVar.f3161g.remove(str);
                        gVar.f.put(str, obj);
                        break;
                    }
                }
                break;
            case 2:
                ((androidx.activity.g) this.f49g).a(this.f48e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f));
                break;
            default:
                ((TextView) this.f).setTypeface((Typeface) this.f49g, this.f48e);
                break;
        }
    }

    public a(TextView textView, Typeface typeface, int i5) {
        this.f47d = 3;
        this.f = textView;
        this.f49g = typeface;
        this.f48e = i5;
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i5) {
        this.f47d = 0;
        this.f49g = bottomSheetBehavior;
        this.f = view;
        this.f48e = i5;
    }
}
