package com.google.firebase.messaging;

import C3.C0012d;
import J.C0059p;
import J.F;
import J.P;
import J.Z;
import a3.InterfaceC0107b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import b3.AbstractC0219i;
import c.AbstractC0220a;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.G;
import e4.M;
import g3.InterfaceC0453c;
import i.AbstractC0476b;
import i.InterfaceC0475a;
import j.MenuC0492i;
import j0.C0517H;
import j0.b0;
import j0.i0;
import j0.l0;
import j0.m0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import k.W;
import o.C0704b;
import o.C0707e;
import o.C0713k;
import p3.InterfaceC0755Q;
import t1.InterfaceC0873a;
import x0.InterfaceC0907b;
import y0.C0924f;
import y3.InterfaceC0927A;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0388e implements InterfaceC0873a, InterfaceC0475a, W, InterfaceC0907b, InterfaceC0927A {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6141d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6142e;
    public Object f;

    public /* synthetic */ C0388e(int i5, boolean z4) {
        this.f6141d = i5;
    }

    public static C0388e e(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C0388e(channel, 15, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e5) {
                    e = e5;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e6) {
                e = e6;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e7) {
            e = e7;
            channel = null;
            fileLockLock = null;
        }
    }

    public static G l(List list) {
        return list.isEmpty() ? G.f : new G(list);
    }

    public static int s(int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            i7++;
            if (i7 == i6) {
                i8++;
                i7 = 0;
            } else if (i7 > i6) {
                i8++;
                i7 = 1;
            }
        }
        return i7 + 1 > i6 ? i8 + 1 : i8;
    }

    public C0059p A(b0 b0Var, int i5) {
        m0 m0Var;
        C0059p c0059p;
        C0713k c0713k = (C0713k) this.f6142e;
        int iE = c0713k.e(b0Var);
        if (iE >= 0 && (m0Var = (m0) c0713k.j(iE)) != null) {
            int i6 = m0Var.f7256a;
            if ((i6 & i5) != 0) {
                int i7 = i6 & (~i5);
                m0Var.f7256a = i7;
                if (i5 == 4) {
                    c0059p = m0Var.f7257b;
                } else {
                    if (i5 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0059p = m0Var.f7258c;
                }
                if ((i7 & 12) == 0) {
                    c0713k.i(iE);
                    m0Var.f7256a = 0;
                    m0Var.f7257b = null;
                    m0Var.f7258c = null;
                    m0.f7255d.c(m0Var);
                }
                return c0059p;
            }
        }
        return null;
    }

    public void B() throws IOException {
        try {
            ((FileLock) this.f).release();
            ((FileChannel) this.f6142e).close();
        } catch (IOException e5) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e5);
        }
    }

    public void C(b0 b0Var) {
        m0 m0Var = (m0) ((C0713k) this.f6142e).getOrDefault(b0Var, null);
        if (m0Var == null) {
            return;
        }
        m0Var.f7256a &= -2;
    }

    public void D(b0 b0Var) {
        C0707e c0707e = (C0707e) this.f;
        int iE = c0707e.e() - 1;
        while (true) {
            if (iE < 0) {
                break;
            }
            if (b0Var == c0707e.f(iE)) {
                Object[] objArr = c0707e.f;
                Object obj = objArr[iE];
                Object obj2 = C0707e.f8213h;
                if (obj != obj2) {
                    objArr[iE] = obj2;
                    c0707e.f8214d = true;
                }
            } else {
                iE--;
            }
        }
        m0 m0Var = (m0) ((C0713k) this.f6142e).remove(b0Var);
        if (m0Var != null) {
            m0Var.f7256a = 0;
            m0Var.f7257b = null;
            m0Var.f7258c = null;
            m0.f7255d.c(m0Var);
        }
    }

    public void E(boolean z4) {
        X.i iVar = (X.i) ((E0.d) ((B.g) this.f).f95e).f;
        if (iVar.f != z4) {
            if (iVar.f2666e != null) {
                androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
                X.h hVar = iVar.f2666e;
                iVarA.getClass();
                g3.y.h("initCallback cannot be null", hVar);
                ReentrantReadWriteLock reentrantReadWriteLock = iVarA.f3655a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    iVarA.f3656b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f = z4;
            if (z4) {
                X.i.a(iVar.f2665d, androidx.emoji2.text.i.a().b());
            }
        }
    }

    public void F(View view) {
        d.c cVar;
        if (view.isClickable()) {
            ArrayList arrayList = (ArrayList) this.f;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            cVar = new d.c(view, (Context) this.f6142e);
                            arrayList.add(cVar);
                            break;
                        } else {
                            cVar = (d.c) it2.next();
                            if (!cVar.b()) {
                                cVar.f6389a = view;
                                break;
                            }
                        }
                    }
                } else {
                    cVar = (d.c) it.next();
                    if (cVar.f6389a == view) {
                        break;
                    }
                }
            }
            View view2 = cVar.f6389a;
            if (view2 instanceof ViewGroup) {
                cVar.f6391c = true;
            } else {
                cVar.f6391c = false;
            }
            float width = view2.getWidth();
            cVar.f6390b = (width - (cVar.f.getResources().getDisplayMetrics().density * 3.0f)) / width;
            if (cVar.f6393e) {
                return;
            }
            cVar.f6393e = true;
            ValueAnimator valueAnimator = cVar.f6392d;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue == 0.0f) {
                fFloatValue = 1.0f;
            }
            valueAnimator.setFloatValues(fFloatValue, cVar.f6390b);
            valueAnimator.setDuration(100L);
            valueAnimator.setInterpolator(d.c.f6387g);
            valueAnimator.start();
        }
    }

    public void G() {
        ((ArrayList) this.f).forEach(new com.idm.adapter.filesystem.c(25));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Q2.h H(e4.V r17, java.util.List r18, D3.a r19) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C0388e.H(e4.V, java.util.List, D3.a):Q2.h");
    }

    @Override // k.W
    public void a(int i5) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i5);
    }

    @Override // k.W
    public void b(int i5) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i5);
    }

    @Override // i.InterfaceC0475a
    public boolean c(AbstractC0476b abstractC0476b, MenuItem menuItem) {
        return ((InterfaceC0475a) this.f6142e).c(abstractC0476b, menuItem);
    }

    @Override // i.InterfaceC0475a
    public boolean d(AbstractC0476b abstractC0476b, MenuC0492i menuC0492i) {
        return ((InterfaceC0475a) this.f6142e).d(abstractC0476b, menuC0492i);
    }

    @Override // i.InterfaceC0475a
    public boolean f(AbstractC0476b abstractC0476b, MenuC0492i menuC0492i) {
        ViewGroup viewGroup = ((e.B) this.f).f6437B;
        WeakHashMap weakHashMap = P.f1421a;
        F.c(viewGroup);
        return ((InterfaceC0475a) this.f6142e).f(abstractC0476b, menuC0492i);
    }

    @Override // x0.InterfaceC0907b
    public void g(C0924f c0924f) {
        Object[] objArr = (Object[]) this.f;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i5 = 0;
        while (i5 < length) {
            Object obj = objArr[i5];
            i5++;
            if (obj == null) {
                c0924f.m(i5);
            } else if (obj instanceof byte[]) {
                c0924f.g(i5, (byte[]) obj);
            } else if (obj instanceof Float) {
                c0924f.h(i5, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                c0924f.h(i5, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                c0924f.l(i5, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                c0924f.l(i5, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                c0924f.l(i5, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                c0924f.l(i5, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                c0924f.n(i5, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i5 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
                c0924f.l(i5, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    @Override // x0.InterfaceC0907b
    public String h() {
        return (String) this.f6142e;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [e.o, java.lang.Object] */
    @Override // i.InterfaceC0475a
    public void i(AbstractC0476b abstractC0476b) {
        ((InterfaceC0475a) this.f6142e).i(abstractC0476b);
        e.B b2 = (e.B) this.f;
        if (b2.f6480x != null) {
            b2.f6470m.getDecorView().removeCallbacks(b2.f6481y);
        }
        if (b2.f6479w != null) {
            Z z4 = b2.f6482z;
            if (z4 != null) {
                z4.b();
            }
            Z zA = P.a(b2.f6479w);
            zA.a(0.0f);
            b2.f6482z = zA;
            zA.d(new e.u(2, this));
        }
        b2.f6471o.onSupportActionModeFinished(b2.f6478v);
        b2.f6478v = null;
        ViewGroup viewGroup = b2.f6437B;
        WeakHashMap weakHashMap = P.f1421a;
        F.c(viewGroup);
        b2.J();
    }

    public void j(b0 b0Var, C0059p c0059p) {
        C0713k c0713k = (C0713k) this.f6142e;
        m0 m0VarA = (m0) c0713k.getOrDefault(b0Var, null);
        if (m0VarA == null) {
            m0VarA = m0.a();
            c0713k.put(b0Var, m0VarA);
        }
        m0VarA.f7258c = c0059p;
        m0VarA.f7256a |= 8;
    }

    public void k() {
        int[] iArr = (int[]) this.f6142e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f = null;
    }

    public void m(int i5) {
        int[] iArr = (int[]) this.f6142e;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i5, 10) + 1];
            this.f6142e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i5 >= iArr.length) {
            int length = iArr.length;
            while (length <= i5) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f6142e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f6142e;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View n(int i5, int i6, int i7, int i8) {
        View viewU;
        C0517H c0517h = (C0517H) this.f6142e;
        int iD = c0517h.d();
        int iC = c0517h.c();
        int i9 = i6 > i5 ? 1 : -1;
        View view = null;
        while (i5 != i6) {
            switch (c0517h.f7056a) {
                case 0:
                    viewU = c0517h.f7057b.u(i5);
                    break;
                default:
                    viewU = c0517h.f7057b.u(i5);
                    break;
            }
            int iB = c0517h.b(viewU);
            int iA = c0517h.a(viewU);
            l0 l0Var = (l0) this.f;
            l0Var.f7223b = iD;
            l0Var.f7224c = iC;
            l0Var.f7225d = iB;
            l0Var.f7226e = iA;
            if (i7 != 0) {
                l0Var.f7222a = i7;
                if (l0Var.a()) {
                    return viewU;
                }
            }
            if (i8 != 0) {
                l0Var.f7222a = i8;
                if (l0Var.a()) {
                    view = viewU;
                }
            }
            i5 += i9;
        }
        return view;
    }

    @Override // t1.InterfaceC0873a
    public Object n0(t1.h hVar) {
        switch (this.f6141d) {
            case 0:
                return ((Integer) hVar.e()).intValue() != 402 ? hVar : h.a((Context) this.f6142e, (Intent) this.f).g(ExecutorC0386c.f, f.f);
            default:
                C0388e c0388e = (C0388e) this.f6142e;
                String str = (String) this.f;
                synchronized (c0388e) {
                    ((C0704b) c0388e.f).remove(str);
                }
                return hVar;
        }
    }

    public e4.Z o(D3.a aVar) {
        e4.Z zK0;
        AbstractC0442z abstractC0442z = aVar.f;
        return (abstractC0442z == null || (zK0 = V1.a.k0(abstractC0442z)) == null) ? (g4.g) ((O2.i) this.f6142e).getValue() : zK0;
    }

    public AbstractC0438v p(InterfaceC0755Q interfaceC0755Q, D3.a aVar) {
        AbstractC0219i.e("typeParameter", interfaceC0755Q);
        AbstractC0219i.e("typeAttr", aVar);
        return (AbstractC0438v) ((d4.e) this.f).d(new M(interfaceC0755Q, aVar));
    }

    public int q(InterfaceC0453c interfaceC0453c) {
        int iIntValue;
        AbstractC0219i.e("kClass", interfaceC0453c);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6142e;
        String strL = interfaceC0453c.l();
        AbstractC0219i.b(strL);
        AbstractC0219i.e("<this>", concurrentHashMap);
        Integer num = (Integer) concurrentHashMap.get(strL);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer numValueOf = (Integer) concurrentHashMap.get(strL);
                if (numValueOf == null) {
                    int andIncrement = ((AtomicInteger) this.f).getAndIncrement();
                    numValueOf = Integer.valueOf(andIncrement);
                    concurrentHashMap.putIfAbsent(strL, Integer.valueOf(andIncrement));
                }
                iIntValue = numValueOf.intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public KeyListener r(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((E0.d) ((B.g) this.f).f95e).getClass();
        if (keyListener instanceof X.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new X.e(keyListener);
    }

    public void t() {
        ((SparseIntArray) this.f6142e).clear();
    }

    public boolean u(View view) {
        C0517H c0517h = (C0517H) this.f6142e;
        int iD = c0517h.d();
        int iC = c0517h.c();
        int iB = c0517h.b(view);
        int iA = c0517h.a(view);
        l0 l0Var = (l0) this.f;
        l0Var.f7223b = iD;
        l0Var.f7224c = iC;
        l0Var.f7225d = iB;
        l0Var.f7226e = iA;
        l0Var.f7222a = 24579;
        return l0Var.a();
    }

    public void v(AttributeSet attributeSet, int i5) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f6142e).getContext().obtainStyledAttributes(attributeSet, AbstractC0220a.f5119i, i5, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            E(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void w(int i5, int i6) {
        int[] iArr = (int[]) this.f6142e;
        if (iArr == null || i5 >= iArr.length) {
            return;
        }
        int i7 = i5 + i6;
        m(i7);
        int[] iArr2 = (int[]) this.f6142e;
        System.arraycopy(iArr2, i5, iArr2, i7, (iArr2.length - i5) - i6);
        Arrays.fill((int[]) this.f6142e, i5, i7, -1);
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i0 i0Var = (i0) ((ArrayList) this.f).get(size);
            int i8 = i0Var.f7186d;
            if (i8 >= i5) {
                i0Var.f7186d = i8 + i6;
            }
        }
    }

    public void x(int i5, int i6) {
        int[] iArr = (int[]) this.f6142e;
        if (iArr == null || i5 >= iArr.length) {
            return;
        }
        int i7 = i5 + i6;
        m(i7);
        int[] iArr2 = (int[]) this.f6142e;
        System.arraycopy(iArr2, i7, iArr2, i5, (iArr2.length - i5) - i6);
        int[] iArr3 = (int[]) this.f6142e;
        Arrays.fill(iArr3, iArr3.length - i6, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i0 i0Var = (i0) ((ArrayList) this.f).get(size);
            int i8 = i0Var.f7186d;
            if (i8 >= i5) {
                if (i8 < i7) {
                    ((ArrayList) this.f).remove(size);
                } else {
                    i0Var.f7186d = i8 - i6;
                }
            }
        }
    }

    public X.b y(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        B.g gVar = (B.g) this.f;
        if (inputConnection == null) {
            gVar.getClass();
            inputConnection2 = null;
        } else {
            E0.d dVar = (E0.d) gVar.f95e;
            dVar.getClass();
            if (!(inputConnection instanceof X.b)) {
                inputConnection = new X.b((EditText) dVar.f520e, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (X.b) inputConnection2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(android.content.Context r13, android.content.res.XmlResourceParser r14) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C0388e.z(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public /* synthetic */ C0388e(Object obj, int i5, Object obj2) {
        this.f6141d = i5;
        this.f6142e = obj;
        this.f = obj2;
    }

    public C0388e(ExecutorService executorService) {
        this.f6141d = 2;
        this.f = new C0704b();
        this.f6142e = executorService;
    }

    public C0388e(O1.e eVar) {
        this.f6141d = 7;
        d4.l lVar = new d4.l("Type parameter upper bound erasure results");
        this.f6142e = new O2.i(new C0012d(17, this));
        this.f = lVar.b(new B3.d(18, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0388e(InterfaceC0107b interfaceC0107b) {
        this.f6141d = 12;
        this.f6142e = (b3.k) interfaceC0107b;
        this.f = new ConcurrentHashMap();
    }

    public C0388e(Object obj) {
        this.f6141d = 4;
        this.f6142e = obj;
        this.f = Thread.currentThread();
    }

    public C0388e(EditText editText) {
        this.f6141d = 13;
        this.f6142e = editText;
        this.f = new B.g(editText);
    }

    public C0388e(int i5) {
        this.f6141d = i5;
        switch (i5) {
            case 8:
                this.f6142e = new SparseIntArray();
                this.f = new SparseIntArray();
                break;
            case 11:
                this.f6142e = new C0713k();
                this.f = new C0707e();
                break;
            default:
                this.f6142e = new ConcurrentHashMap();
                this.f = new AtomicInteger(0);
                break;
        }
    }

    public C0388e(Map map) {
        this.f6141d = 19;
        this.f6142e = map;
        this.f = new d4.l("Java nullability annotation states").c(new B3.d(25, this));
    }

    public C0388e(C0517H c0517h) {
        this.f6141d = 10;
        this.f6142e = c0517h;
        l0 l0Var = new l0();
        l0Var.f7222a = 0;
        this.f = l0Var;
    }

    public C0388e(Context context) {
        this.f6141d = 3;
        this.f = new ArrayList();
        this.f6142e = context;
    }

    public C0388e(Matcher matcher, CharSequence charSequence) {
        this.f6141d = 16;
        AbstractC0219i.e("input", charSequence);
        this.f6142e = matcher;
    }

    public C0388e(AppCompatTextView appCompatTextView) {
        this.f6141d = 14;
        this.f = appCompatTextView;
        this.f6141d = 14;
        this.f6142e = appCompatTextView;
    }

    public C0388e(e.B b2, InterfaceC0475a interfaceC0475a) {
        this.f6141d = 5;
        this.f = b2;
        this.f6142e = interfaceC0475a;
    }
}
