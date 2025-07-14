package E1;

import com.google.android.material.chip.SeslExpandableContainer;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SeslExpandableContainer f605e;

    public /* synthetic */ s(SeslExpandableContainer seslExpandableContainer, int i5) {
        this.f604d = i5;
        this.f605e = seslExpandableContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f604d) {
            case 0:
                SeslExpandableContainer seslExpandableContainer = this.f605e;
                seslExpandableContainer.f.setExpanded(seslExpandableContainer.f5848h);
                break;
            default:
                SeslExpandableContainer seslExpandableContainer2 = this.f605e;
                seslExpandableContainer2.f.setExpanded(seslExpandableContainer2.f5848h);
                break;
        }
    }
}
