package O1;

import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import androidx.databinding.v;
import androidx.databinding.w;
import androidx.lifecycle.a0;
import b3.AbstractC0219i;
import c0.C0222b;
import com.google.firebase.messaging.C0388e;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import e4.AbstractC0438v;
import e4.N;
import e4.O;
import e4.X;
import j.InterfaceC0503t;
import j.MenuC0492i;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import k.Q0;
import n3.C0699d;
import n3.EnumC0700e;
import p3.InterfaceC0755Q;

/* loaded from: classes.dex */
public class e implements M0.b, androidx.databinding.d, a0, InterfaceC0503t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1915d;

    public /* synthetic */ e(int i5) {
        this.f1915d = i5;
    }

    public static N e(InterfaceC0755Q interfaceC0755Q, D3.a aVar, C0388e c0388e, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("typeAttr", aVar);
        AbstractC0219i.e("typeParameterUpperBoundEraser", c0388e);
        AbstractC0219i.e("erasedUpperBound", abstractC0438v);
        if (!aVar.f498c) {
            aVar = aVar.b(1);
        }
        int iC = Q0.c(aVar.f497b);
        if (iC != 0 && iC != 1) {
            if (iC == 2) {
                return new O(1, abstractC0438v);
            }
            throw new O2.d();
        }
        int iB = interfaceC0755Q.B();
        boolean z4 = true;
        if (iB != 1) {
            if (iB == 2) {
                z4 = false;
            } else if (iB != 3) {
                throw null;
            }
        }
        if (!z4) {
            return new O(1, U3.f.e(interfaceC0755Q).m());
        }
        List listK = abstractC0438v.I0().k();
        AbstractC0219i.d("erasedUpperBound.constructor.parameters", listK);
        return !listK.isEmpty() ? new O(3, abstractC0438v) : X.k(interfaceC0755Q, aVar);
    }

    public static Font f(FontFamily fontFamily, int i5) {
        FontStyle fontStyle = new FontStyle((i5 & 1) != 0 ? KnoxEnterpriseLicenseManager.ERROR_LICENSE_DEACTIVATED : 400, (i5 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iG = g(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int iG2 = g(fontStyle, font2.getStyle());
            if (iG2 < iG) {
                font = font2;
                iG = iG2;
            }
        }
        return font;
    }

    public static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:91:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(X.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.e.h(X.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static C0699d i(String str, N3.c cVar) {
        EnumC0700e enumC0700e;
        Integer numValueOf;
        AbstractC0219i.e("packageFqName", cVar);
        EnumC0700e[] enumC0700eArrValues = EnumC0700e.values();
        int length = enumC0700eArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                enumC0700e = null;
                break;
            }
            enumC0700e = enumC0700eArrValues[i5];
            if (AbstractC0219i.a(enumC0700e.f8186d, cVar) && p4.h.o0(str, enumC0700e.f8187e)) {
                break;
            }
            i5++;
        }
        if (enumC0700e == null) {
            return null;
        }
        String strSubstring = str.substring(enumC0700e.f8187e.length());
        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
        if (strSubstring.length() == 0) {
            numValueOf = null;
            break;
        }
        int length2 = strSubstring.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length2; i7++) {
            int iCharAt = strSubstring.charAt(i7) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                numValueOf = null;
                break;
            }
            i6 = (i6 * 10) + iCharAt;
        }
        numValueOf = Integer.valueOf(i6);
        if (numValueOf != null) {
            return new C0699d(enumC0700e, numValueOf.intValue());
        }
        return null;
    }

    @Override // j.InterfaceC0503t
    public void a(MenuC0492i menuC0492i, boolean z4) {
    }

    @Override // j.InterfaceC0503t
    public boolean b(MenuC0492i menuC0492i) {
        return false;
    }

    @Override // androidx.lifecycle.a0
    public androidx.lifecycle.X c(Class cls) {
        return new C0222b();
    }

    @Override // androidx.databinding.d
    public w d(v vVar, int i5, ReferenceQueue referenceQueue) {
        return new androidx.databinding.t(vVar, i5, referenceQueue, 1).f3636b;
    }

    @Override // N2.a
    public Object get() {
        return new K0.h(Executors.newSingleThreadExecutor());
    }

    public e() {
        this.f1915d = 1;
        new ConcurrentHashMap();
    }
}
