package C1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.wssyncmldm.R;
import j0.AbstractC0516G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends AbstractC0516G {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f343a;

    /* renamed from: b, reason: collision with root package name */
    public final List f344b;

    public d() {
        Paint paint = new Paint();
        this.f343a = paint;
        this.f344b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // j0.AbstractC0516G
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int iE;
        int iB;
        int iC;
        int iD;
        Paint paint = this.f343a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f344b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = B.a.f85a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).B0()) {
                e eVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5816p;
                switch (eVar.f346b) {
                    case 0:
                        iE = 0;
                        break;
                    default:
                        iE = eVar.f347c.E();
                        break;
                }
                float f5 = iE;
                e eVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5816p;
                switch (eVar2.f346b) {
                    case 0:
                        iB = eVar2.f347c.f7074o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = eVar2.f347c;
                        iB = carouselLayoutManager.f7074o - carouselLayoutManager.B();
                        break;
                }
                canvas.drawLine(0.0f, f5, 0.0f, iB, paint);
            } else {
                e eVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5816p;
                switch (eVar3.f346b) {
                    case 0:
                        iC = eVar3.f347c.C();
                        break;
                    default:
                        iC = 0;
                        break;
                }
                float f6 = iC;
                e eVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f5816p;
                switch (eVar4.f346b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = eVar4.f347c;
                        iD = carouselLayoutManager2.n - carouselLayoutManager2.D();
                        break;
                    default:
                        iD = eVar4.f347c.n;
                        break;
                }
                canvas.drawLine(f6, 0.0f, iD, 0.0f, paint);
            }
        }
    }
}
