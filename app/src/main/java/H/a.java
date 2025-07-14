package H;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f785e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f787b;

    /* renamed from: c, reason: collision with root package name */
    public int f788c;

    /* renamed from: d, reason: collision with root package name */
    public char f789d;

    static {
        for (int i5 = 0; i5 < 1792; i5++) {
            f785e[i5] = Character.getDirectionality(i5);
        }
    }

    public a(CharSequence charSequence) {
        this.f786a = charSequence;
        this.f787b = charSequence.length();
    }

    public final byte a() {
        int i5 = this.f788c - 1;
        CharSequence charSequence = this.f786a;
        char cCharAt = charSequence.charAt(i5);
        this.f789d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f788c);
            this.f788c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f788c--;
        char c2 = this.f789d;
        return c2 < 1792 ? f785e[c2] : Character.getDirectionality(c2);
    }
}
