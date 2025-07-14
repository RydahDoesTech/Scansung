package A1;

import androidx.appcompat.widget.ActionMenuView;
import e.K;
import j.InterfaceC0503t;
import j.MenuC0492i;
import k.C0618f;
import k.C0633k;

/* loaded from: classes.dex */
public final class c implements InterfaceC0503t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53e;
    public Object f;

    @Override // j.InterfaceC0503t
    public void a(MenuC0492i menuC0492i, boolean z4) {
        C0633k c0633k;
        if (this.f53e) {
            return;
        }
        this.f53e = true;
        K k5 = (K) this.f;
        ActionMenuView actionMenuView = k5.f6498a.f7507a.f3495d;
        if (actionMenuView != null && (c0633k = actionMenuView.f3297w) != null) {
            c0633k.i();
            C0618f c0618f = c0633k.f7708w;
            if (c0618f != null && c0618f.b()) {
                c0618f.f7024i.dismiss();
            }
        }
        k5.f6499b.onPanelClosed(108, menuC0492i);
        this.f53e = false;
    }

    @Override // j.InterfaceC0503t
    public boolean b(MenuC0492i menuC0492i) {
        ((K) this.f).f6499b.onMenuOpened(108, menuC0492i);
        return true;
    }

    public boolean c() {
        return this.f53e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto L44
            if (r8 < 0) goto L44
            int r1 = r7.length()
            int r1 = r1 - r8
            if (r1 < 0) goto L44
            java.lang.Object r1 = r6.f
            H.f r1 = (H.f) r1
            if (r1 != 0) goto L17
            boolean r6 = r6.c()
            return r6
        L17:
            r1 = 0
            r2 = 2
            r3 = r1
            r4 = r2
        L1b:
            if (r3 >= r8) goto L39
            if (r4 != r2) goto L39
            char r4 = r7.charAt(r3)
            byte r4 = java.lang.Character.getDirectionality(r4)
            A1.c r5 = H.g.f800a
            if (r4 == 0) goto L36
            if (r4 == r0) goto L34
            if (r4 == r2) goto L34
            switch(r4) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r4 = r2
            goto L37
        L34:
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            int r3 = r3 + r0
            goto L1b
        L39:
            if (r4 == 0) goto L43
            if (r4 == r0) goto L42
            boolean r0 = r6.c()
            goto L43
        L42:
            r0 = r1
        L43:
            return r0
        L44:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.c.d(java.lang.CharSequence, int):boolean");
    }

    public String toString() {
        switch (this.f52d) {
            case 4:
                return this.f53e ? "FALL_THROUGH" : String.valueOf(this.f);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(int i5, Object obj) {
        this.f52d = i5;
        this.f = obj;
    }

    public /* synthetic */ c(Object obj, boolean z4, int i5) {
        this.f52d = i5;
        this.f = obj;
        this.f53e = z4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(H.f fVar, boolean z4) {
        this(2, fVar);
        this.f52d = 2;
        this.f53e = z4;
    }
}
