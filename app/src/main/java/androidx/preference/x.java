package androidx.preference;

import android.graphics.drawable.Drawable;
import j0.AbstractC0516G;

/* loaded from: classes.dex */
public final class x extends AbstractC0516G {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f4688a;

    /* renamed from: b, reason: collision with root package name */
    public int f4689b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4690c = true;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4691d;

    public x(z zVar) {
        this.f4691d = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // j0.AbstractC0516G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r14, androidx.recyclerview.widget.RecyclerView r15) {
        /*
            r13 = this;
            int r0 = r15.getChildCount()
            int r1 = r15.getLeft()
            int r2 = r15.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r15.getRight()
            int r3 = r15.getPaddingRight()
            int r1 = r1 - r3
            r3 = 0
            r4 = r3
        L18:
            androidx.preference.z r5 = r13.f4691d
            if (r4 >= r0) goto Lc0
            android.view.View r6 = r15.getChildAt(r4)
            j0.b0 r7 = r15.U(r6)
            boolean r8 = r7 instanceof androidx.preference.H
            if (r8 == 0) goto L2e
            androidx.preference.H r7 = (androidx.preference.H) r7
            r7.getClass()
            goto L2f
        L2e:
            r7 = 0
        L2f:
            android.content.res.Resources r8 = r5.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            r8.getLayoutDirection()
            float r8 = r6.getY()
            int r8 = (int) r8
            int r9 = r6.getHeight()
            int r9 = r9 + r8
            android.graphics.drawable.Drawable r8 = r13.f4688a
            if (r8 == 0) goto L8a
            j0.b0 r8 = r15.U(r6)
            boolean r10 = r8 instanceof androidx.preference.H
            if (r10 == 0) goto L7a
            androidx.preference.H r8 = (androidx.preference.H) r8
            boolean r8 = r8.f4554z
            if (r8 == 0) goto L7a
            boolean r8 = r13.f4690c
            int r10 = r15.indexOfChild(r6)
            int r11 = r15.getChildCount()
            r12 = 1
            int r11 = r11 - r12
            if (r10 >= r11) goto L7b
            int r10 = r10 + 1
            android.view.View r8 = r15.getChildAt(r10)
            j0.b0 r8 = r15.U(r8)
            boolean r10 = r8 instanceof androidx.preference.H
            if (r10 == 0) goto L7a
            androidx.preference.H r8 = (androidx.preference.H) r8
            boolean r8 = r8.f4553y
            if (r8 == 0) goto L7a
            r8 = r12
            goto L7b
        L7a:
            r8 = r3
        L7b:
            if (r8 == 0) goto L8a
            int r8 = r13.f4689b
            int r8 = r8 + r9
            android.graphics.drawable.Drawable r10 = r13.f4688a
            r10.setBounds(r2, r9, r1, r8)
            android.graphics.drawable.Drawable r8 = r13.f4688a
            r8.draw(r14)
        L8a:
            boolean r8 = androidx.preference.z.access$400(r5)
            if (r8 == 0) goto Lbc
            if (r7 == 0) goto Lbc
            boolean r8 = r7.f4548B
            if (r8 != 0) goto L97
            goto Lbc
        L97:
            boolean r8 = r7.f4549C
            if (r8 == 0) goto Lac
            androidx.appcompat.util.c r8 = androidx.preference.z.access$500(r5)
            int r7 = r7.f4547A
            r8.setRoundedCorners(r7)
            androidx.appcompat.util.c r5 = androidx.preference.z.access$500(r5)
            r5.drawRoundedCorner(r6, r14)
            goto Lbc
        Lac:
            androidx.appcompat.util.b r8 = androidx.preference.z.access$600(r5)
            int r7 = r7.f4547A
            r8.setRoundedCorners(r7)
            androidx.appcompat.util.b r5 = androidx.preference.z.access$600(r5)
            r5.drawRoundedCorner(r6, r14)
        Lbc:
            int r4 = r4 + 1
            goto L18
        Lc0:
            boolean r13 = androidx.preference.z.access$400(r5)
            if (r13 == 0) goto Le1
            androidx.appcompat.util.b r13 = androidx.preference.z.access$1100(r5)
            int r15 = androidx.preference.z.access$700(r5)
            int r0 = androidx.preference.z.access$800(r5)
            int r1 = androidx.preference.z.access$900(r5)
            int r2 = androidx.preference.z.access$1000(r5)
            B.c r15 = B.c.b(r15, r0, r1, r2)
            r13.drawRoundedCorner(r14, r15)
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.x.c(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView):void");
    }
}
