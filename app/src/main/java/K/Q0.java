package k;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7538a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ int a(int i5, int i6) {
        if (i5 == 0 || i6 == 0) {
            throw null;
        }
        return i5 - i6;
    }

    public static /* synthetic */ boolean b(int i5, int i6) {
        if (i5 != 0) {
            return i5 == i6;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i5) {
        if (i5 != 0) {
            return i5 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i5) {
        int[] iArr = new int[i5];
        System.arraycopy(f7538a, 0, iArr, 0, i5);
        return iArr;
    }
}
