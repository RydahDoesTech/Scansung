package A1;

import J.C0065w;
import J.C0067y;
import J.P;
import a1.C0096d;
import a1.p;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.databinding.v;
import androidx.lifecycle.C;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import b1.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.wssyncmldm.R;
import e.C0406i;
import e.K;
import e.ViewOnLayoutChangeListenerC0400c;
import e.x;
import j.MenuC0492i;
import j0.C0544m;
import java.io.IOException;
import java.util.WeakHashMap;
import s1.C0824a;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f64e;

    public /* synthetic */ h(int i5, Object obj) {
        this.f63d = i5;
        this.f64e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        Object obj;
        switch (this.f63d) {
            case 0:
                i iVar = (i) this.f64e;
                iVar.f67c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) iVar.f69e;
                S.d dVar = bottomSheetBehavior.f5750M;
                if (dVar != null && dVar.f()) {
                    iVar.a(iVar.f66b);
                    return;
                } else {
                    if (bottomSheetBehavior.f5749L == 2) {
                        bottomSheetBehavior.D(iVar.f66b);
                        return;
                    }
                    return;
                }
            case 1:
                ViewPager viewPager = (ViewPager) this.f64e;
                viewPager.setScrollState(0);
                viewPager.o();
                return;
            case 2:
                I2.b bVar = (I2.b) this.f64e;
                bVar.run();
                bVar.onFinish();
                return;
            case 3:
                O.g gVar = (O.g) this.f64e;
                if (gVar.f1890r) {
                    boolean z4 = gVar.f1888p;
                    O.a aVar = gVar.f1878d;
                    if (z4) {
                        gVar.f1888p = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f1873e = jCurrentAnimationTimeMillis;
                        aVar.f1874g = -1L;
                        aVar.f = jCurrentAnimationTimeMillis;
                        aVar.f1875h = 0.5f;
                    }
                    if ((aVar.f1874g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f1874g + aVar.f1876i) || !gVar.e()) {
                        gVar.f1890r = false;
                        return;
                    }
                    boolean z5 = gVar.f1889q;
                    ListView listView = gVar.f;
                    if (z5) {
                        gVar.f1889q = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j5 = jCurrentAnimationTimeMillis2 - aVar.f;
                    aVar.f = jCurrentAnimationTimeMillis2;
                    gVar.f1892t.scrollListBy((int) (j5 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f1872d));
                    WeakHashMap weakHashMap = P.f1421a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                Q1.e eVar = (Q1.e) this.f64e;
                C0067y c0067y = new C0067y(((SnackbarContentLayout) eVar.f2304e).f5975h);
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) eVar.f2304e;
                int measuredHeight = snackbarContentLayout.f5973e.getMeasuredHeight() / 2;
                c0067y.a(snackbarContentLayout.f5973e, C0065w.a(measuredHeight, measuredHeight, measuredHeight, measuredHeight));
                snackbarContentLayout.f5975h.setTouchDelegate(c0067y);
                return;
            case 5:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f64e).f.f2408j;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 6:
                ((S.d) this.f64e).n(0);
                return;
            case 7:
                if (((t1.i) this.f64e).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 8:
                ((k) ((C0096d) ((B.g) this.f64e).f95e).f2934b).d();
                return;
            case 9:
                ((p) this.f64e).f2974h.b(new Y0.a(4));
                return;
            case 10:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e5) {
                    if (!TextUtils.equals(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e5;
                    }
                    return;
                } catch (NullPointerException e6) {
                    if (!TextUtils.equals(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e6;
                    }
                    return;
                }
            case 11:
                synchronized (this) {
                    ((v) this.f64e).mPendingRebind = false;
                }
                v.access$300();
                if (((v) this.f64e).mRoot.isAttachedToWindow()) {
                    ((v) this.f64e).executePendingBindings();
                    return;
                } else {
                    ((v) this.f64e).mRoot.removeOnAttachStateChangeListener(v.ROOT_REATTACHED_LISTENER);
                    ((v) this.f64e).mRoot.addOnAttachStateChangeListener(v.ROOT_REATTACHED_LISTENER);
                    return;
                }
            case 12:
                synchronized (((C) this.f64e).f3950a) {
                    obj = ((C) this.f64e).f;
                    ((C) this.f64e).f = C.f3949k;
                }
                ((C) this.f64e).k(obj);
                return;
            case 13:
                ViewOnLayoutChangeListenerC0400c viewOnLayoutChangeListenerC0400c = (ViewOnLayoutChangeListenerC0400c) this.f64e;
                int i5 = viewOnLayoutChangeListenerC0400c.f6542b.f6577a.getResources().getConfiguration().orientation;
                C0406i c0406i = viewOnLayoutChangeListenerC0400c.f6542b;
                if (i5 != c0406i.E) {
                    View viewFindViewById = c0406i.f6579c.findViewById(R.id.parentPanel);
                    View viewFindViewById2 = viewFindViewById.findViewById(R.id.title_template);
                    View viewFindViewById3 = viewFindViewById.findViewById(R.id.scrollView);
                    View viewFindViewById4 = viewFindViewById.findViewById(R.id.topPanel);
                    View viewFindViewById5 = viewFindViewById.findViewById(R.id.buttonBarLayout);
                    View viewFindViewById6 = viewFindViewById.findViewById(R.id.customPanel);
                    View viewFindViewById7 = viewFindViewById.findViewById(R.id.contentPanel);
                    boolean z6 = (viewFindViewById6 == null || viewFindViewById6.getVisibility() == 8) ? false : true;
                    boolean z7 = (viewFindViewById4 == null || viewFindViewById4.getVisibility() == 8) ? false : true;
                    boolean z8 = (viewFindViewById7 == null || viewFindViewById7.getVisibility() == 8) ? false : true;
                    View view = c0406i.f6597w;
                    boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
                    Resources resources = c0406i.f6577a.getResources();
                    if ((!z6 || z7 || z8) && !z9) {
                        viewFindViewById.setPadding(0, resources.getDimensionPixelSize(R.dimen.sesl_dialog_title_padding_top), 0, 0);
                    } else {
                        viewFindViewById.setPadding(0, 0, 0, 0);
                    }
                    if (viewFindViewById2 != null) {
                        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sesl_dialog_padding_horizontal);
                        if (z6 && z7 && !z8) {
                            viewFindViewById2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                        } else {
                            viewFindViewById2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.sesl_dialog_title_padding_bottom));
                        }
                    }
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setPadding(resources.getDimensionPixelSize(R.dimen.sesl_dialog_body_text_scroll_padding_start), 0, resources.getDimensionPixelSize(R.dimen.sesl_dialog_body_text_scroll_padding_end), resources.getDimensionPixelSize(R.dimen.sesl_dialog_body_text_padding_bottom));
                    }
                    if (viewFindViewById5 != null) {
                        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.sesl_dialog_button_bar_padding_horizontal);
                        viewFindViewById5.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, resources.getDimensionPixelSize(R.dimen.sesl_dialog_button_bar_padding_bottom));
                    }
                    viewOnLayoutChangeListenerC0400c.f6541a.requestLayout();
                }
                C0406i c0406i2 = viewOnLayoutChangeListenerC0400c.f6542b;
                c0406i2.E = c0406i2.f6577a.getResources().getConfiguration().orientation;
                return;
            case 14:
                K k5 = (K) this.f64e;
                x xVar = k5.f6499b;
                Menu menuQ = k5.q();
                MenuC0492i menuC0492i = menuQ instanceof MenuC0492i ? (MenuC0492i) menuQ : null;
                if (menuC0492i != null) {
                    menuC0492i.w();
                }
                try {
                    menuQ.clear();
                    if (!xVar.onCreatePanelMenu(0, menuQ) || !xVar.onPreparePanel(0, null, menuQ)) {
                        menuQ.clear();
                    }
                    if (menuC0492i != null) {
                        menuC0492i.v();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (menuC0492i != null) {
                        menuC0492i.v();
                    }
                    throw th;
                }
            case 15:
                C0544m c0544m = (C0544m) this.f64e;
                int i6 = c0544m.f7229A;
                ValueAnimator valueAnimator = c0544m.f7254z;
                if (i6 == 1) {
                    valueAnimator.cancel();
                } else if (i6 != 2) {
                    return;
                }
                c0544m.f7229A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 16:
                ((StaggeredGridLayoutManager) this.f64e).C0();
                return;
            default:
                ((C0824a) this.f64e).d();
                return;
        }
    }
}
