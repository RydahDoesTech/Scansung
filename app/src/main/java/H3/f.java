package H3;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f833e;
    public final /* synthetic */ e f;

    public /* synthetic */ f(e eVar, int i5) {
        this.f833e = i5;
        this.f = eVar;
    }

    @Override // H3.c
    public final void L0(String[] strArr) {
        switch (this.f833e) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.f.f832e.f839d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.f.f832e.f840e = strArr;
                return;
        }
    }
}
