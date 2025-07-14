package B1;

import J.C0045b;
import K.g;
import K.h;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.preference.D;
import androidx.preference.G;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import j0.AbstractC0510A;
import j0.b0;

/* loaded from: classes.dex */
public final class e extends C0045b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f210e;

    public /* synthetic */ e(int i5, Object obj) {
        this.f209d = i5;
        this.f210e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // J.C0045b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        /*
            r1 = this;
            int r0 = r1.f209d
            switch(r0) {
                case 1: goto L16;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            java.lang.Object r1 = r1.f210e
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r1 = r1.f5936h
            r3.setChecked(r1)
            return
        L16:
            super.c(r2, r3)
            java.lang.String r2 = "androidx.viewpager.widget.ViewPager"
            r3.setClassName(r2)
            java.lang.Object r1 = r1.f210e
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            E0.a r2 = r1.f4956h
            if (r2 == 0) goto L2e
            int r2 = r2.b()
            r0 = 1
            if (r2 <= r0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            r3.setScrollable(r0)
            int r2 = r3.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L4f
            E0.a r2 = r1.f4956h
            if (r2 == 0) goto L4f
            int r2 = r2.b()
            r3.setItemCount(r2)
            int r2 = r1.f4957i
            r3.setFromIndex(r2)
            int r1 = r1.f4957i
            r3.setToIndex(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.e.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // J.C0045b
    public final void d(View view, h hVar) {
        RecyclerView recyclerView;
        boolean z4 = false;
        int iR = -1;
        View.AccessibilityDelegate accessibilityDelegate = this.f1437a;
        Object obj = this.f210e;
        switch (this.f209d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
                int i5 = MaterialButtonToggleGroup.n;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i6) == view) {
                                iR = i7;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.c(i6)) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                    }
                }
                hVar.h(g.a(((MaterialButton) view).f5804s, 0, 1, iR, 1));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, hVar.f1615a);
                hVar.g("androidx.viewpager.widget.ViewPager");
                ViewPager viewPager = (ViewPager) obj;
                E0.a aVar = viewPager.f4956h;
                if (aVar != null && aVar.b() > 1) {
                    z4 = true;
                }
                hVar.i(z4);
                if (viewPager.canScrollHorizontally(1)) {
                    hVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    hVar.a(8192);
                    break;
                }
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = hVar.f1615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f5937i);
                accessibilityNodeInfo.setChecked(checkableImageButton.f5936h);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = hVar.f1615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f5940A);
                break;
            default:
                G g5 = (G) obj;
                g5.f4545g.d(view, hVar);
                RecyclerView recyclerView2 = g5.f;
                recyclerView2.getClass();
                b0 b0VarV = RecyclerView.V(view);
                if (b0VarV != null && (recyclerView = b0VarV.f7143r) != null) {
                    iR = recyclerView.R(b0VarV);
                }
                AbstractC0510A adapter = recyclerView2.getAdapter();
                if (adapter instanceof D) {
                    ((D) adapter).k(iR);
                    break;
                }
                break;
        }
    }

    @Override // J.C0045b
    public boolean g(View view, int i5, Bundle bundle) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        switch (this.f209d) {
            case 1:
                if (super.g(view, i5, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.f210e;
                if (i5 != 4096) {
                    if (i5 == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f4957i - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f4957i + 1);
                    return true;
                }
                return false;
            case 4:
                return ((G) this.f210e).f4545g.g(view, i5, bundle);
            default:
                return super.g(view, i5, bundle);
        }
    }
}
