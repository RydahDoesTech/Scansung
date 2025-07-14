package R1;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i5) {
        super(oVar);
        this.f2379e = i5;
    }

    @Override // R1.p
    public void r() {
        switch (this.f2379e) {
            case 0:
                o oVar = this.f2424b;
                oVar.f2415r = null;
                CheckableImageButton checkableImageButton = oVar.f2408j;
                checkableImageButton.setOnLongClickListener(null);
                Y0.j.P(checkableImageButton, null);
                break;
        }
    }
}
