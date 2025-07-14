package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.p000firebaseauthapi.a5;
import com.google.firebase.messaging.C0388e;
import com.idm.fotaagent.enabler.interfaces.IDMEnablerInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import r.c;
import s.C0822d;
import s.e;
import s.h;
import u.d;
import u.l;
import u.m;
import u.o;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f3528d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3529e;
    public final e f;

    /* renamed from: g, reason: collision with root package name */
    public int f3530g;

    /* renamed from: h, reason: collision with root package name */
    public int f3531h;

    /* renamed from: i, reason: collision with root package name */
    public int f3532i;

    /* renamed from: j, reason: collision with root package name */
    public int f3533j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3534k;

    /* renamed from: l, reason: collision with root package name */
    public int f3535l;

    /* renamed from: m, reason: collision with root package name */
    public l f3536m;
    public C0388e n;

    /* renamed from: o, reason: collision with root package name */
    public int f3537o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f3538p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f3539q;

    /* renamed from: r, reason: collision with root package name */
    public final a5 f3540r;

    /* renamed from: s, reason: collision with root package name */
    public int f3541s;

    /* renamed from: t, reason: collision with root package name */
    public int f3542t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f3528d = new SparseArray();
        this.f3529e = new ArrayList(4);
        this.f = new e();
        this.f3530g = 0;
        this.f3531h = 0;
        this.f3532i = Integer.MAX_VALUE;
        this.f3533j = Integer.MAX_VALUE;
        this.f3534k = true;
        this.f3535l = 257;
        this.f3536m = null;
        this.n = null;
        this.f3537o = -1;
        this.f3538p = new HashMap();
        this.f3539q = new SparseArray();
        this.f3540r = new a5(this, this);
        this.f3541s = 0;
        this.f3542t = 0;
        c(attributeSet, 0);
    }

    public static u.e a() {
        u.e eVar = new u.e(-2, -2);
        eVar.f9018a = -1;
        eVar.f9020b = -1;
        eVar.f9022c = -1.0f;
        eVar.f9024d = -1;
        eVar.f9026e = -1;
        eVar.f = -1;
        eVar.f9029g = -1;
        eVar.f9030h = -1;
        eVar.f9032i = -1;
        eVar.f9034j = -1;
        eVar.f9036k = -1;
        eVar.f9037l = -1;
        eVar.f9038m = -1;
        eVar.n = 0;
        eVar.f9039o = 0.0f;
        eVar.f9040p = -1;
        eVar.f9041q = -1;
        eVar.f9042r = -1;
        eVar.f9043s = -1;
        eVar.f9044t = -1;
        eVar.f9045u = -1;
        eVar.f9046v = -1;
        eVar.f9047w = -1;
        eVar.f9048x = -1;
        eVar.f9049y = -1;
        eVar.f9050z = 0.5f;
        eVar.f8993A = 0.5f;
        eVar.f8994B = null;
        eVar.f8995C = 1;
        eVar.f8996D = -1.0f;
        eVar.E = -1.0f;
        eVar.f8997F = 0;
        eVar.f8998G = 0;
        eVar.f8999H = 0;
        eVar.f9000I = 0;
        eVar.f9001J = 0;
        eVar.f9002K = 0;
        eVar.f9003L = 0;
        eVar.f9004M = 0;
        eVar.f9005N = 1.0f;
        eVar.f9006O = 1.0f;
        eVar.f9007P = -1;
        eVar.f9008Q = -1;
        eVar.f9009R = -1;
        eVar.f9010S = false;
        eVar.f9011T = false;
        eVar.f9012U = null;
        eVar.f9013V = true;
        eVar.f9014W = true;
        eVar.f9015X = false;
        eVar.f9016Y = false;
        eVar.f9017Z = false;
        eVar.f9019a0 = -1;
        eVar.f9021b0 = -1;
        eVar.f9023c0 = -1;
        eVar.f9025d0 = -1;
        eVar.f9027e0 = -1;
        eVar.f9028f0 = -1;
        eVar.g0 = 0.5f;
        eVar.k0 = new C0822d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public final C0822d b(View view) {
        if (view == this) {
            return this.f;
        }
        if (view == null) {
            return null;
        }
        return ((u.e) view.getLayoutParams()).k0;
    }

    public final void c(AttributeSet attributeSet, int i5) throws XmlPullParserException, IOException, NumberFormatException {
        e eVar = this.f;
        eVar.f8633Z = this;
        a5 a5Var = this.f3540r;
        eVar.n0 = a5Var;
        eVar.m0.f = a5Var;
        this.f3528d.put(getId(), this);
        this.f3536m = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f9146b, i5, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == 9) {
                    this.f3530g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3530g);
                } else if (index == 10) {
                    this.f3531h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3531h);
                } else if (index == 7) {
                    this.f3532i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3532i);
                } else if (index == 8) {
                    this.f3533j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3533j);
                } else if (index == 90) {
                    this.f3535l = typedArrayObtainStyledAttributes.getInt(index, this.f3535l);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.n = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        l lVar = new l();
                        this.f3536m = lVar;
                        lVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3536m = null;
                    }
                    this.f3537o = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.f8674w0 = this.f3535l;
        c.f8530p = eVar.Q(512);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof u.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r9 = this;
            com.google.firebase.messaging.e r0 = new com.google.firebase.messaging.e
            android.content.Context r1 = r9.getContext()
            r2 = 17
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f6142e = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r3 = 0
        L27:
            r4 = 1
            if (r2 == r4) goto Lcb
            if (r2 == 0) goto Lbb
            r5 = 2
            if (r2 == r5) goto L31
            goto Lbe
        L31:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6d;
                case 80204913: goto L63;
                case 1382829617: goto L59;
                case 1657696882: goto L4f;
                case 1901439077: goto L3f;
                default: goto L3e;
            }     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
        L3e:
            goto L77
        L3f:
            java.lang.String r6 = "Variant"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            if (r6 == 0) goto L77
            r6 = r8
            goto L78
        L49:
            r10 = move-exception
            goto Lc4
        L4c:
            r10 = move-exception
            goto Lc8
        L4f:
            java.lang.String r6 = "layoutDescription"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            if (r6 == 0) goto L77
            r6 = 0
            goto L78
        L59:
            java.lang.String r6 = "StateSet"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            if (r6 == 0) goto L77
            r6 = r4
            goto L78
        L63:
            java.lang.String r6 = "State"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            if (r6 == 0) goto L77
            r6 = r5
            goto L78
        L6d:
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            if (r6 == 0) goto L77
            r6 = r7
            goto L78
        L77:
            r6 = -1
        L78:
            if (r6 == 0) goto Lbe
            if (r6 == r4) goto Lbe
            if (r6 == r5) goto Lac
            if (r6 == r8) goto L9d
            if (r6 == r7) goto L99
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r5.<init>()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r5.append(r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.String r2 = r5.toString()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            android.util.Log.v(r4, r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            goto Lbe
        L99:
            r0.z(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            goto Lbe
        L9d:
            u.f r2 = new u.f     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            if (r3 == 0) goto Lbe
            java.lang.Object r4 = r3.f2701c     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r4.add(r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            goto Lbe
        Lac:
            X0.k r3 = new X0.k     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            java.lang.Object r2 = r0.f6142e     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            int r4 = r3.f2699a     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            r2.put(r4, r3)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            goto Lbe
        Lbb:
            r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
        Lbe:
            int r2 = r10.next()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4c
            goto L27
        Lc4:
            r10.printStackTrace()
            goto Lcb
        Lc8:
            r10.printStackTrace()
        Lcb:
            r9.n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f3529e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                ((u.c) arrayList.get(i5)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i7 = Integer.parseInt(strArrSplit[0]);
                        int i8 = Integer.parseInt(strArrSplit[1]);
                        int i9 = Integer.parseInt(strArrSplit[2]);
                        int i10 = (int) ((i7 / 1080.0f) * width);
                        int i11 = (int) ((i8 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i10;
                        float f5 = i11;
                        float f6 = i10 + ((int) ((i9 / 1080.0f) * width));
                        canvas.drawLine(f, f5, f6, f5, paint);
                        float f7 = i11 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f6, f5, f6, f7, paint);
                        canvas.drawLine(f6, f7, f, f7, paint);
                        canvas.drawLine(f, f7, f, f5, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f5, f6, f7, paint);
                        canvas.drawLine(f, f7, f6, f5, paint);
                    }
                }
            }
        }
    }

    public final void e(int i5, int i6, int i7, int i8, boolean z4, boolean z5) {
        a5 a5Var = this.f3540r;
        int i9 = a5Var.f5427d;
        int iResolveSizeAndState = View.resolveSizeAndState(i7 + a5Var.f5426c, i5, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i8 + i9, i6, 0) & 16777215;
        int iMin = Math.min(this.f3532i, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f3533j, iResolveSizeAndState2);
        if (z4) {
            iMin |= IDMEnablerInterface.FLAG_RECEIVER_INCLUDE_BACKGROUND;
        }
        if (z5) {
            iMin2 |= IDMEnablerInterface.FLAG_RECEIVER_INCLUDE_BACKGROUND;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x04d1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(s.e r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.f(s.e, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f3534k = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        int i5;
        Context context = getContext();
        u.e eVar = new u.e(context, attributeSet);
        eVar.f9018a = -1;
        eVar.f9020b = -1;
        eVar.f9022c = -1.0f;
        eVar.f9024d = -1;
        eVar.f9026e = -1;
        eVar.f = -1;
        eVar.f9029g = -1;
        eVar.f9030h = -1;
        eVar.f9032i = -1;
        eVar.f9034j = -1;
        eVar.f9036k = -1;
        eVar.f9037l = -1;
        eVar.f9038m = -1;
        eVar.n = 0;
        eVar.f9039o = 0.0f;
        eVar.f9040p = -1;
        eVar.f9041q = -1;
        eVar.f9042r = -1;
        eVar.f9043s = -1;
        eVar.f9044t = -1;
        eVar.f9045u = -1;
        eVar.f9046v = -1;
        eVar.f9047w = -1;
        eVar.f9048x = -1;
        eVar.f9049y = -1;
        eVar.f9050z = 0.5f;
        eVar.f8993A = 0.5f;
        eVar.f8994B = null;
        eVar.f8995C = 1;
        eVar.f8996D = -1.0f;
        eVar.E = -1.0f;
        eVar.f8997F = 0;
        eVar.f8998G = 0;
        eVar.f8999H = 0;
        eVar.f9000I = 0;
        eVar.f9001J = 0;
        eVar.f9002K = 0;
        eVar.f9003L = 0;
        eVar.f9004M = 0;
        eVar.f9005N = 1.0f;
        eVar.f9006O = 1.0f;
        eVar.f9007P = -1;
        eVar.f9008Q = -1;
        eVar.f9009R = -1;
        eVar.f9010S = false;
        eVar.f9011T = false;
        eVar.f9012U = null;
        eVar.f9013V = true;
        eVar.f9014W = true;
        eVar.f9015X = false;
        eVar.f9016Y = false;
        eVar.f9017Z = false;
        eVar.f9019a0 = -1;
        eVar.f9021b0 = -1;
        eVar.f9023c0 = -1;
        eVar.f9025d0 = -1;
        eVar.f9027e0 = -1;
        eVar.f9028f0 = -1;
        eVar.g0 = 0.5f;
        eVar.k0 = new C0822d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f9146b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            int i7 = d.f8992a.get(index);
            switch (i7) {
                case 1:
                    eVar.f9009R = typedArrayObtainStyledAttributes.getInt(index, eVar.f9009R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9038m);
                    eVar.f9038m = resourceId;
                    if (resourceId == -1) {
                        eVar.f9038m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    eVar.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.n);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f9039o) % 360.0f;
                    eVar.f9039o = f;
                    if (f < 0.0f) {
                        eVar.f9039o = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    eVar.f9018a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f9018a);
                    break;
                case 6:
                    eVar.f9020b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f9020b);
                    break;
                case 7:
                    eVar.f9022c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f9022c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9024d);
                    eVar.f9024d = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f9024d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9026e);
                    eVar.f9026e = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f9026e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f);
                    eVar.f = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9029g);
                    eVar.f9029g = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f9029g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9030h);
                    eVar.f9030h = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f9030h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9032i);
                    eVar.f9032i = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f9032i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9034j);
                    eVar.f9034j = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f9034j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9036k);
                    eVar.f9036k = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f9036k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9037l);
                    eVar.f9037l = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f9037l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9040p);
                    eVar.f9040p = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f9040p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9041q);
                    eVar.f9041q = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f9041q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9042r);
                    eVar.f9042r = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f9042r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f9043s);
                    eVar.f9043s = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f9043s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    eVar.f9044t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9044t);
                    break;
                case 22:
                    eVar.f9045u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9045u);
                    break;
                case 23:
                    eVar.f9046v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9046v);
                    break;
                case 24:
                    eVar.f9047w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9047w);
                    break;
                case 25:
                    eVar.f9048x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9048x);
                    break;
                case 26:
                    eVar.f9049y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9049y);
                    break;
                case 27:
                    eVar.f9010S = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f9010S);
                    break;
                case 28:
                    eVar.f9011T = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f9011T);
                    break;
                case 29:
                    eVar.f9050z = typedArrayObtainStyledAttributes.getFloat(index, eVar.f9050z);
                    break;
                case 30:
                    eVar.f8993A = typedArrayObtainStyledAttributes.getFloat(index, eVar.f8993A);
                    break;
                case 31:
                    int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.f8999H = i8;
                    if (i8 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i9 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.f9000I = i9;
                    if (i9 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        eVar.f9001J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9001J);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f9001J) == -2) {
                            eVar.f9001J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        eVar.f9003L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9003L);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f9003L) == -2) {
                            eVar.f9003L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    eVar.f9005N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f9005N));
                    eVar.f8999H = 2;
                    break;
                case 36:
                    try {
                        eVar.f9002K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9002K);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f9002K) == -2) {
                            eVar.f9002K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        eVar.f9004M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f9004M);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.f9004M) == -2) {
                            eVar.f9004M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    eVar.f9006O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.f9006O));
                    eVar.f9000I = 2;
                    break;
                default:
                    switch (i7) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            eVar.f8994B = string;
                            eVar.f8995C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = eVar.f8994B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i5 = 0;
                                } else {
                                    String strSubstring = eVar.f8994B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        eVar.f8995C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        eVar.f8995C = 1;
                                    }
                                    i5 = iIndexOf + 1;
                                }
                                int iIndexOf2 = eVar.f8994B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = eVar.f8994B.substring(i5);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String strSubstring3 = eVar.f8994B.substring(i5, iIndexOf2);
                                    String strSubstring4 = eVar.f8994B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        break;
                                    } else {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 <= 0.0f || f6 <= 0.0f) {
                                                break;
                                            } else if (eVar.f8995C == 1) {
                                                Math.abs(f6 / f5);
                                                break;
                                            } else {
                                                Math.abs(f5 / f6);
                                                break;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            eVar.f8996D = typedArrayObtainStyledAttributes.getFloat(index, eVar.f8996D);
                            break;
                        case 46:
                            eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                            break;
                        case 47:
                            eVar.f8997F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.f8998G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.f9007P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f9007P);
                            break;
                        case 50:
                            eVar.f9008Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f9008Q);
                            break;
                        case 51:
                            eVar.f9012U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f3533j;
    }

    public int getMaxWidth() {
        return this.f3532i;
    }

    public int getMinHeight() {
        return this.f3531h;
    }

    public int getMinWidth() {
        return this.f3530g;
    }

    public int getOptimizationLevel() {
        return this.f.f8674w0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            u.e eVar = (u.e) childAt.getLayoutParams();
            C0822d c0822d = eVar.k0;
            if (childAt.getVisibility() != 8 || eVar.f9016Y || eVar.f9017Z || zIsInEditMode) {
                int iO = c0822d.o();
                int iP = c0822d.p();
                childAt.layout(iO, iP, c0822d.n() + iO, c0822d.k() + iP);
            }
        }
        ArrayList arrayList = this.f3529e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((u.c) arrayList.get(i10)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r25, int r26) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0822d c0822dB = b(view);
        if ((view instanceof Guideline) && !(c0822dB instanceof h)) {
            u.e eVar = (u.e) view.getLayoutParams();
            h hVar = new h();
            eVar.k0 = hVar;
            eVar.f9016Y = true;
            hVar.L(eVar.f9009R);
        }
        if (view instanceof u.c) {
            u.c cVar = (u.c) view;
            cVar.h();
            ((u.e) view.getLayoutParams()).f9017Z = true;
            ArrayList arrayList = this.f3529e;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f3528d.put(view.getId(), view);
        this.f3534k = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3528d.remove(view.getId());
        C0822d c0822dB = b(view);
        this.f.k0.remove(c0822dB);
        c0822dB.y();
        this.f3529e.remove(view);
        this.f3534k = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3534k = true;
        super.requestLayout();
    }

    public void setConstraintSet(l lVar) {
        this.f3536m = lVar;
    }

    @Override // android.view.View
    public void setId(int i5) {
        int id = getId();
        SparseArray sparseArray = this.f3528d;
        sparseArray.remove(id);
        super.setId(i5);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i5) {
        if (i5 == this.f3533j) {
            return;
        }
        this.f3533j = i5;
        requestLayout();
    }

    public void setMaxWidth(int i5) {
        if (i5 == this.f3532i) {
            return;
        }
        this.f3532i = i5;
        requestLayout();
    }

    public void setMinHeight(int i5) {
        if (i5 == this.f3531h) {
            return;
        }
        this.f3531h = i5;
        requestLayout();
    }

    public void setMinWidth(int i5) {
        if (i5 == this.f3530g) {
            return;
        }
        this.f3530g = i5;
        requestLayout();
    }

    public void setOnConstraintsChanged(m mVar) {
        C0388e c0388e = this.n;
        if (c0388e != null) {
            c0388e.getClass();
        }
    }

    public void setOptimizationLevel(int i5) {
        this.f3535l = i5;
        e eVar = this.f;
        eVar.f8674w0 = i5;
        c.f8530p = eVar.Q(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i5) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i5);
        this.f3528d = new SparseArray();
        this.f3529e = new ArrayList(4);
        this.f = new e();
        this.f3530g = 0;
        this.f3531h = 0;
        this.f3532i = Integer.MAX_VALUE;
        this.f3533j = Integer.MAX_VALUE;
        this.f3534k = true;
        this.f3535l = 257;
        this.f3536m = null;
        this.n = null;
        this.f3537o = -1;
        this.f3538p = new HashMap();
        this.f3539q = new SparseArray();
        this.f3540r = new a5(this, this);
        this.f3541s = 0;
        this.f3542t = 0;
        c(attributeSet, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        u.e eVar = new u.e(layoutParams);
        eVar.f9018a = -1;
        eVar.f9020b = -1;
        eVar.f9022c = -1.0f;
        eVar.f9024d = -1;
        eVar.f9026e = -1;
        eVar.f = -1;
        eVar.f9029g = -1;
        eVar.f9030h = -1;
        eVar.f9032i = -1;
        eVar.f9034j = -1;
        eVar.f9036k = -1;
        eVar.f9037l = -1;
        eVar.f9038m = -1;
        eVar.n = 0;
        eVar.f9039o = 0.0f;
        eVar.f9040p = -1;
        eVar.f9041q = -1;
        eVar.f9042r = -1;
        eVar.f9043s = -1;
        eVar.f9044t = -1;
        eVar.f9045u = -1;
        eVar.f9046v = -1;
        eVar.f9047w = -1;
        eVar.f9048x = -1;
        eVar.f9049y = -1;
        eVar.f9050z = 0.5f;
        eVar.f8993A = 0.5f;
        eVar.f8994B = null;
        eVar.f8995C = 1;
        eVar.f8996D = -1.0f;
        eVar.E = -1.0f;
        eVar.f8997F = 0;
        eVar.f8998G = 0;
        eVar.f8999H = 0;
        eVar.f9000I = 0;
        eVar.f9001J = 0;
        eVar.f9002K = 0;
        eVar.f9003L = 0;
        eVar.f9004M = 0;
        eVar.f9005N = 1.0f;
        eVar.f9006O = 1.0f;
        eVar.f9007P = -1;
        eVar.f9008Q = -1;
        eVar.f9009R = -1;
        eVar.f9010S = false;
        eVar.f9011T = false;
        eVar.f9012U = null;
        eVar.f9013V = true;
        eVar.f9014W = true;
        eVar.f9015X = false;
        eVar.f9016Y = false;
        eVar.f9017Z = false;
        eVar.f9019a0 = -1;
        eVar.f9021b0 = -1;
        eVar.f9023c0 = -1;
        eVar.f9025d0 = -1;
        eVar.f9027e0 = -1;
        eVar.f9028f0 = -1;
        eVar.g0 = 0.5f;
        eVar.k0 = new C0822d();
        return eVar;
    }
}
