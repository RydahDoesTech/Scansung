package androidx.databinding;

/* loaded from: classes.dex */
public final class o extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3631a;

    public /* synthetic */ o(int i5) {
        this.f3631a = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.b
    public final void a(Object obj, a aVar, int i5) {
        switch (this.f3631a) {
            case 0:
                w wVar = ((u) ((i) obj)).f3637a;
                v vVar = (v) wVar.get();
                if (vVar == null) {
                    wVar.a();
                }
                if (vVar != null && ((j) wVar.f3640c) == aVar) {
                    vVar.handleFieldChange(wVar.f3639b, aVar, i5);
                    return;
                }
                return;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    throw null;
                }
                return;
        }
    }
}
