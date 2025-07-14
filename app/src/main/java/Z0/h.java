package Z0;

/* loaded from: classes.dex */
public final class h extends UnsupportedOperationException {

    /* renamed from: d, reason: collision with root package name */
    public final Y0.c f2860d;

    public h(Y0.c cVar) {
        this.f2860d = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strValueOf = String.valueOf(this.f2860d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
        sb.append("Missing ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
