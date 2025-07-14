package j0;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public int f7100a;

    /* renamed from: b, reason: collision with root package name */
    public int f7101b;

    /* renamed from: c, reason: collision with root package name */
    public int f7102c;

    /* renamed from: d, reason: collision with root package name */
    public int f7103d;

    /* renamed from: e, reason: collision with root package name */
    public int f7104e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7105g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7106h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7107i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7108j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7109k;

    /* renamed from: l, reason: collision with root package name */
    public int f7110l;

    /* renamed from: m, reason: collision with root package name */
    public long f7111m;
    public int n;

    public final void a(int i5) {
        if ((this.f7103d & i5) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i5) + " but it is " + Integer.toBinaryString(this.f7103d));
    }

    public final int b() {
        return this.f7105g ? this.f7101b - this.f7102c : this.f7104e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f7100a + ", mData=null, mItemCount=" + this.f7104e + ", mIsMeasuring=" + this.f7107i + ", mPreviousLayoutItemCount=" + this.f7101b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7102c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f7105g + ", mRunSimpleAnimations=" + this.f7108j + ", mRunPredictiveAnimations=" + this.f7109k + '}';
    }
}
