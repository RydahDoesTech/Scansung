package E1;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends Y0.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, Object obj) {
        super(8);
        this.f534c = i5;
        this.f535d = obj;
    }

    private final void X(int i5) {
    }

    @Override // Y0.j
    public final void E(int i5) {
        switch (this.f534c) {
            case 0:
                break;
            default:
                I1.k kVar = (I1.k) this.f535d;
                kVar.f945d = true;
                I1.j jVar = (I1.j) kVar.f946e.get();
                if (jVar != null) {
                    f fVar = (f) jVar;
                    fVar.t();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // Y0.j
    public final void F(Typeface typeface, boolean z4) {
        switch (this.f534c) {
            case 0:
                Chip chip = (Chip) this.f535d;
                f fVar = chip.f5821h;
                chip.setText(fVar.f549F0 ? fVar.f548F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z4) {
                    I1.k kVar = (I1.k) this.f535d;
                    kVar.f945d = true;
                    I1.j jVar = (I1.j) kVar.f946e.get();
                    if (jVar != null) {
                        f fVar2 = (f) jVar;
                        fVar2.t();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
