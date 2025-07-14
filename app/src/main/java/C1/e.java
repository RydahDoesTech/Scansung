package C1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f347c;

    public e(int i5) {
        this.f345a = i5;
    }

    public final int a() {
        switch (this.f346b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f347c;
                if (carouselLayoutManager.C0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager, int i5) {
        this(1);
        this.f346b = i5;
        switch (i5) {
            case 1:
                this.f347c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f347c = carouselLayoutManager;
                break;
        }
    }
}
