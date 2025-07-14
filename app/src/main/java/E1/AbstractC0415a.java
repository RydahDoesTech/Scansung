package e1;

import J.a0;
import J2.b;
import N3.f;
import O1.e;
import O3.AbstractC0081m;
import O3.C;
import O3.C0078j;
import O3.C0082n;
import O3.C0083o;
import P2.o;
import P2.u;
import P2.v;
import P2.z;
import S3.g;
import S3.k;
import X1.c;
import X1.i;
import X1.l;
import Y0.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.AdapterView;
import b1.AbstractC0203C;
import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.N4;
import com.idm.providers.mo.IDMMoInterface;
import com.samsung.android.knox.custom.CustomDeviceManager;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.J;
import e4.N;
import e4.V;
import e4.X;
import g3.InterfaceC0452b;
import g3.InterfaceC0456f;
import g3.InterfaceC0457g;
import g3.InterfaceC0460j;
import g3.InterfaceC0463m;
import g3.InterfaceC0466p;
import j3.r;
import j3.x0;
import j4.d;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.D0;
import k.Q0;
import k3.InterfaceC0673e;
import m3.AbstractC0695h;
import m3.m;
import m3.n;
import n3.C0699d;
import n3.EnumC0700e;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p4.h;
import q3.C0797g;
import q3.C0799i;
import q3.C0800j;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;
import u3.C0880b;
import u3.C0881c;
import z.AbstractC0939b;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0415a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static e f6634a;

    /* renamed from: b, reason: collision with root package name */
    public static String f6635b;

    /* renamed from: c, reason: collision with root package name */
    public static PackageInfo f6636c;

    public static PackageInfo A(Context context) {
        if (f6636c == null) {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    f6636c = packageManager.getPackageInfo(packageName, 4096);
                } catch (PackageManager.NameNotFoundException unused) {
                    b.l(packageName + " is not found");
                }
            }
        }
        return f6636c;
    }

    public static String B(String str) throws NoSuchMethodException, SecurityException {
        Method methodS = b.s("android.os.SemSystemProperties", "get", String.class);
        if (methodS != null) {
            Object objE = b.E(null, methodS, str);
            if (objE instanceof String) {
                return (String) objE;
            }
        }
        return null;
    }

    public static final List C(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        E(abstractC0438v);
        List listS0 = abstractC0438v.s0();
        return listS0.subList(((!E(abstractC0438v) || abstractC0438v.s().h(m.f8131p) == null) ? 0 : 1) + f(abstractC0438v), listS0.size() - 1);
    }

    public static final boolean D(InterfaceC0452b interfaceC0452b) {
        InterfaceC0673e interfaceC0673eG;
        InterfaceC0673e interfaceC0673eK;
        AbstractC0219i.e("<this>", interfaceC0452b);
        if (interfaceC0452b instanceof InterfaceC0460j) {
            InterfaceC0466p interfaceC0466p = (InterfaceC0466p) interfaceC0452b;
            Field fieldW = b.w(interfaceC0466p);
            if (!(fieldW != null ? fieldW.isAccessible() : true)) {
                return false;
            }
            Method methodX = b.x(interfaceC0466p.f());
            if (!(methodX != null ? methodX.isAccessible() : true)) {
                return false;
            }
            Method methodX2 = b.x(((InterfaceC0460j) interfaceC0452b).e());
            if (!(methodX2 != null ? methodX2.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC0452b instanceof InterfaceC0466p) {
            InterfaceC0466p interfaceC0466p2 = (InterfaceC0466p) interfaceC0452b;
            Field fieldW2 = b.w(interfaceC0466p2);
            if (!(fieldW2 != null ? fieldW2.isAccessible() : true)) {
                return false;
            }
            Method methodX3 = b.x(interfaceC0466p2.f());
            if (!(methodX3 != null ? methodX3.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC0452b instanceof InterfaceC0463m) {
            Field fieldW3 = b.w(((InterfaceC0463m) interfaceC0452b).getProperty());
            if (!(fieldW3 != null ? fieldW3.isAccessible() : true)) {
                return false;
            }
            Method methodX4 = b.x((InterfaceC0456f) interfaceC0452b);
            if (!(methodX4 != null ? methodX4.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC0452b instanceof InterfaceC0457g) {
            Field fieldW4 = b.w(((InterfaceC0457g) interfaceC0452b).getProperty());
            if (!(fieldW4 != null ? fieldW4.isAccessible() : true)) {
                return false;
            }
            Method methodX5 = b.x((InterfaceC0456f) interfaceC0452b);
            if (!(methodX5 != null ? methodX5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(interfaceC0452b instanceof InterfaceC0456f)) {
                throw new UnsupportedOperationException("Unknown callable: " + interfaceC0452b + " (" + interfaceC0452b.getClass() + ')');
            }
            InterfaceC0456f interfaceC0456f = (InterfaceC0456f) interfaceC0452b;
            Method methodX6 = b.x(interfaceC0456f);
            if (!(methodX6 != null ? methodX6.isAccessible() : true)) {
                return false;
            }
            r rVarA = x0.a(interfaceC0452b);
            Object objQ = (rVarA == null || (interfaceC0673eK = rVarA.k()) == null) ? null : interfaceC0673eK.q();
            AccessibleObject accessibleObject = objQ instanceof AccessibleObject ? (AccessibleObject) objQ : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            r rVarA2 = x0.a(interfaceC0456f);
            Object objQ2 = (rVarA2 == null || (interfaceC0673eG = rVarA2.g()) == null) ? null : interfaceC0673eG.q();
            Constructor constructor = objQ2 instanceof Constructor ? (Constructor) objQ2 : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean E(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (interfaceC0763gI == null) {
            return false;
        }
        EnumC0700e enumC0700eW = w(interfaceC0763gI);
        return enumC0700eW == EnumC0700e.f8181g || enumC0700eW == EnumC0700e.f8182h;
    }

    public static boolean F(int i5) {
        boolean z4;
        if (i5 != 0) {
            ThreadLocal threadLocal = B.a.f85a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i5);
            int iGreen = Color.green(i5);
            int iBlue = Color.blue(i5);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d5 = iRed / 255.0d;
            double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            double d6 = iGreen / 255.0d;
            double dPow2 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            double d7 = iBlue / 255.0d;
            double dPow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            z4 = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d8 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d8;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d8 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z4 = false;
        }
        return z4;
    }

    public static final boolean H(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        return (interfaceC0763gI != null ? w(interfaceC0763gI) : null) == EnumC0700e.f8182h;
    }

    public static int I(int i5, float f, int i6) {
        return J(i5, B.a.c(i6, Math.round(Color.alpha(i6) * f)));
    }

    public static int J(int i5, int i6) {
        ThreadLocal threadLocal = B.a.f85a;
        int iAlpha = Color.alpha(i5);
        int iAlpha2 = Color.alpha(i6);
        int i7 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / CustomDeviceManager.CALL_SCREEN_ALL);
        return Color.argb(i7, B.a.b(Color.red(i6), iAlpha2, Color.red(i5), iAlpha, i7), B.a.b(Color.green(i6), iAlpha2, Color.green(i5), iAlpha, i7), B.a.b(Color.blue(i6), iAlpha2, Color.blue(i5), iAlpha, i7));
    }

    public static Typeface K(Configuration configuration, Typeface typeface) {
        int i5 = configuration.fontWeightAdjustment;
        if (i5 == Integer.MAX_VALUE || i5 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, j.g(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static MappedByteBuffer L(Context context, Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static W.b M(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j5;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i5 = byteBufferDuplicate.getShort() & 65535;
        if (i5 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                j5 = -1;
                break;
            }
            int i7 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j5 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i7) {
                break;
            }
            i6++;
        }
        if (j5 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j5 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j6 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i8 = 0; i8 < j6; i8++) {
                int i9 = byteBufferDuplicate.getInt();
                long j7 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i9 || 1701669481 == i9) {
                    byteBufferDuplicate.position((int) (j7 + j5));
                    W.b bVar = new W.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f1418d = byteBufferDuplicate;
                    bVar.f1415a = iPosition;
                    int i10 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f1416b = i10;
                    bVar.f1417c = ((ByteBuffer) bVar.f1418d).getShort(i10);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final String N(f fVar) {
        AbstractC0219i.e("<this>", fVar);
        String strB = fVar.b();
        AbstractC0219i.d("asString()", strB);
        if (!P3.m.f2263a.contains(strB)) {
            for (int i5 = 0; i5 < strB.length(); i5++) {
                char cCharAt = strB.charAt(i5);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strB2 = fVar.b();
            AbstractC0219i.d("asString()", strB2);
            return strB2;
        }
        StringBuilder sb = new StringBuilder();
        String strB3 = fVar.b();
        AbstractC0219i.d("asString()", strB3);
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final String O(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (sb.length() > 0) {
                sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
            }
            sb.append(N(fVar));
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public static final String P(String str, String str2, String str3, String str4, String str5) {
        AbstractC0219i.e("lowerRendered", str);
        AbstractC0219i.e("lowerPrefix", str2);
        AbstractC0219i.e("upperRendered", str3);
        AbstractC0219i.e("upperPrefix", str4);
        AbstractC0219i.e("foldedPrefix", str5);
        if (!h.o0(str, str2) || !h.o0(str3, str4)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring);
        String strSubstring2 = str3.substring(str4.length());
        AbstractC0219i.d("this as java.lang.String).substring(startIndex)", strSubstring2);
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!W(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e4.AbstractC0438v Q(e4.AbstractC0438v r9, java.util.ArrayList r10) {
        /*
            java.util.List r0 = r9.s0()
            r0.size()
            r10.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = P2.o.l0(r10)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L17:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L94
            java.lang.Object r1 = r10.next()
            j4.d r1 = (j4.d) r1
            r1.getClass()
            f4.l r3 = f4.d.f6737a
            e4.v r4 = r1.f7465b
            e4.v r5 = r1.f7466c
            r3.b(r4, r5)
            boolean r3 = b3.AbstractC0219i.a(r4, r5)
            if (r3 != 0) goto L8b
            p3.Q r1 = r1.f7464a
            int r3 = r1.B()
            r6 = 2
            if (r3 != r6) goto L40
            goto L8b
        L40:
            boolean r3 = m3.AbstractC0695h.D(r4)
            r7 = 1
            r8 = 3
            if (r3 == 0) goto L5c
            int r3 = r1.B()
            if (r3 == r6) goto L5c
            e4.O r2 = new e4.O
            int r1 = r1.B()
            if (r8 != r1) goto L57
            goto L58
        L57:
            r7 = r8
        L58:
            r2.<init>(r7, r5)
            goto L90
        L5c:
            if (r5 == 0) goto L85
            boolean r2 = m3.AbstractC0695h.w(r5)
            if (r2 == 0) goto L77
            boolean r2 = r5.J0()
            if (r2 == 0) goto L77
            e4.O r2 = new e4.O
            int r1 = r1.B()
            if (r6 != r1) goto L73
            r6 = r7
        L73:
            r2.<init>(r6, r4)
            goto L90
        L77:
            e4.O r2 = new e4.O
            int r1 = r1.B()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r7 = r8
        L81:
            r2.<init>(r7, r5)
            goto L90
        L85:
            r9 = 140(0x8c, float:1.96E-43)
            m3.AbstractC0695h.a(r9)
            throw r2
        L8b:
            e4.O r2 = new e4.O
            r2.<init>(r4)
        L90:
            r0.add(r2)
            goto L17
        L94:
            r10 = 6
            e4.v r9 = e4.AbstractC0420c.o(r9, r0, r2, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.AbstractC0415a.Q(e4.v, java.util.ArrayList):e4.v");
    }

    public static int R(int i5) throws NoSuchMethodException, SecurityException {
        Method methodR = b.r(HapticFeedbackConstants.class, "hidden_semGetVibrationIndex", Integer.TYPE);
        if (methodR == null) {
            return -1;
        }
        Object objE = b.E(null, methodR, Integer.valueOf(i5));
        if (objE instanceof Integer) {
            return ((Integer) objE).intValue();
        }
        return -1;
    }

    public static void U(AdapterView adapterView, T.a aVar, androidx.databinding.h hVar) {
        if (aVar == null && hVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new T.b(aVar, hVar));
        }
    }

    public static void V(Drawable drawable, int i5) {
        C.a.g(drawable, i5);
    }

    public static final boolean W(String str, String str2) {
        AbstractC0219i.e("lower", str);
        AbstractC0219i.e("upper", str2);
        if (!str.equals(h.n0(str2, "?", "")) && (!str2.endsWith("?") || !AbstractC0219i.a(str.concat("?"), str2))) {
            if (!AbstractC0219i.a("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }

    public static void Y(Parcel parcel, int i5, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iE0 = e0(parcel, i5);
        parcel.writeBundle(bundle);
        g0(parcel, iE0);
    }

    public static void Z(Parcel parcel, int i5, Parcelable parcelable, int i6) {
        if (parcelable == null) {
            return;
        }
        int iE0 = e0(parcel, i5);
        parcelable.writeToParcel(parcel, i6);
        g0(parcel, iE0);
    }

    public static void a0(Parcel parcel, int i5, String str) {
        if (str == null) {
            return;
        }
        int iE0 = e0(parcel, i5);
        parcel.writeString(str);
        g0(parcel, iE0);
    }

    public static void b0(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int iE0 = e0(parcel, i5);
        parcel.writeStringList(list);
        g0(parcel, iE0);
    }

    public static void c0(Parcel parcel, int i5, Parcelable[] parcelableArr, int i6) {
        if (parcelableArr == null) {
            return;
        }
        int iE0 = e0(parcel, i5);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i6);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        g0(parcel, iE0);
    }

    public static final j4.a d(AbstractC0438v abstractC0438v) {
        d dVar;
        AbstractC0219i.e("type", abstractC0438v);
        if (AbstractC0420c.j(abstractC0438v)) {
            j4.a aVarD = d(AbstractC0420c.k(abstractC0438v));
            j4.a aVarD2 = d(AbstractC0420c.y(abstractC0438v));
            return new j4.a(AbstractC0420c.g(C0421d.j(AbstractC0420c.k((AbstractC0438v) aVarD.f7461a), AbstractC0420c.y((AbstractC0438v) aVarD2.f7461a)), abstractC0438v), AbstractC0420c.g(C0421d.j(AbstractC0420c.k((AbstractC0438v) aVarD.f7462b), AbstractC0420c.y((AbstractC0438v) aVarD2.f7462b)), abstractC0438v));
        }
        J jI0 = abstractC0438v.I0();
        boolean z4 = true;
        if (abstractC0438v.I0() instanceof R3.b) {
            AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor", jI0);
            N nA = ((R3.b) jI0).a();
            AbstractC0438v abstractC0438vB = nA.b();
            AbstractC0219i.d("typeProjection.type", abstractC0438vB);
            AbstractC0438v abstractC0438vH = X.h(abstractC0438vB, abstractC0438v.J0());
            int iC = Q0.c(nA.a());
            if (iC == 1) {
                return new j4.a(abstractC0438vH, V1.a.x(abstractC0438v).n());
            }
            if (iC == 2) {
                return new j4.a(X.h(V1.a.x(abstractC0438v).m(), abstractC0438v.J0()), abstractC0438vH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + nA);
        }
        if (abstractC0438v.s0().isEmpty() || abstractC0438v.s0().size() != jI0.k().size()) {
            return new j4.a(abstractC0438v, abstractC0438v);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listS0 = abstractC0438v.s0();
        List listK = jI0.k();
        AbstractC0219i.d("typeConstructor.parameters", listK);
        Iterator it = P2.m.T0(listS0, listK).iterator();
        while (it.hasNext()) {
            O2.f fVar = (O2.f) it.next();
            N n = (N) fVar.f2006d;
            InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) fVar.f2007e;
            AbstractC0219i.d("typeParameter", interfaceC0755Q);
            int iB = interfaceC0755Q.B();
            if (iB == 0) {
                V.a(35);
                throw null;
            }
            if (n == null) {
                V.a(36);
                throw null;
            }
            V v2 = V.f6667b;
            int iC2 = Q0.c(n.c() ? 3 : V.b(iB, n.a()));
            if (iC2 == 0) {
                AbstractC0438v abstractC0438vB2 = n.b();
                AbstractC0219i.d("type", abstractC0438vB2);
                AbstractC0438v abstractC0438vB3 = n.b();
                AbstractC0219i.d("type", abstractC0438vB3);
                dVar = new d(interfaceC0755Q, abstractC0438vB2, abstractC0438vB3);
            } else if (iC2 == 1) {
                AbstractC0438v abstractC0438vB4 = n.b();
                AbstractC0219i.d("type", abstractC0438vB4);
                dVar = new d(interfaceC0755Q, abstractC0438vB4, U3.f.e(interfaceC0755Q).n());
            } else {
                if (iC2 != 2) {
                    throw new O2.d();
                }
                AbstractC0442z abstractC0442zM = U3.f.e(interfaceC0755Q).m();
                AbstractC0438v abstractC0438vB5 = n.b();
                AbstractC0219i.d("type", abstractC0438vB5);
                dVar = new d(interfaceC0755Q, abstractC0442zM, abstractC0438vB5);
            }
            if (n.c()) {
                arrayList.add(dVar);
                arrayList2.add(dVar);
            } else {
                j4.a aVarD3 = d(dVar.f7465b);
                AbstractC0438v abstractC0438v2 = (AbstractC0438v) aVarD3.f7461a;
                AbstractC0438v abstractC0438v3 = (AbstractC0438v) aVarD3.f7462b;
                j4.a aVarD4 = d(dVar.f7466c);
                AbstractC0438v abstractC0438v4 = (AbstractC0438v) aVarD4.f7461a;
                AbstractC0438v abstractC0438v5 = (AbstractC0438v) aVarD4.f7462b;
                InterfaceC0755Q interfaceC0755Q2 = dVar.f7464a;
                d dVar2 = new d(interfaceC0755Q2, abstractC0438v3, abstractC0438v4);
                d dVar3 = new d(interfaceC0755Q2, abstractC0438v2, abstractC0438v5);
                arrayList.add(dVar2);
                arrayList2.add(dVar3);
            }
        }
        if (arrayList.isEmpty()) {
            z4 = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                d dVar4 = (d) it2.next();
                dVar4.getClass();
                if (!f4.d.f6737a.b(dVar4.f7465b, dVar4.f7466c)) {
                    break;
                }
            }
            z4 = false;
        }
        return new j4.a(z4 ? V1.a.x(abstractC0438v).m() : Q(abstractC0438v, arrayList), Q(abstractC0438v, arrayList2));
    }

    public static void d0(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int iE0 = e0(parcel, i5);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            Parcelable parcelable = (Parcelable) list.get(i6);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        g0(parcel, iE0);
    }

    public static int e(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int e0(Parcel parcel, int i5) {
        parcel.writeInt(i5 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final int f(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        InterfaceC0792b interfaceC0792bH = abstractC0438v.s().h(m.f8132q);
        if (interfaceC0792bH == null) {
            return 0;
        }
        g gVar = (g) z.f0(interfaceC0792bH.b(), n.f8145d);
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue", gVar);
        return ((Number) ((k) gVar).f2531a).intValue();
    }

    public static N4 f0(c cVar, String str) {
        AbstractC0203C.e(cVar);
        if (i.class.isAssignableFrom(cVar.getClass())) {
            i iVar = (i) cVar;
            return new N4(iVar.f2723d, iVar.f2724e, "google.com", null, null, str, null, null);
        }
        if (X1.e.class.isAssignableFrom(cVar.getClass())) {
            return new N4(null, ((X1.e) cVar).f2721d, "facebook.com", null, null, str, null, null);
        }
        if (X1.m.class.isAssignableFrom(cVar.getClass())) {
            X1.m mVar = (X1.m) cVar;
            return new N4(null, mVar.f2735d, "twitter.com", mVar.f2736e, null, str, null, null);
        }
        if (X1.h.class.isAssignableFrom(cVar.getClass())) {
            return new N4(null, ((X1.h) cVar).f2722d, "github.com", null, null, str, null, null);
        }
        if (l.class.isAssignableFrom(cVar.getClass())) {
            return new N4(null, null, "playgames.google.com", null, ((l) cVar).f2734d, str, null, null);
        }
        if (!X1.r.class.isAssignableFrom(cVar.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        X1.r rVar = (X1.r) cVar;
        N4 n42 = rVar.f2744g;
        if (n42 != null) {
            return n42;
        }
        return new N4(rVar.f2743e, rVar.f, rVar.f2742d, rVar.f2746i, null, str, rVar.f2745h, rVar.f2747j);
    }

    public static final AbstractC0442z g(AbstractC0695h abstractC0695h, InterfaceC0798h interfaceC0798h, AbstractC0438v abstractC0438v, List list, ArrayList arrayList, AbstractC0438v abstractC0438v2, boolean z4) {
        InterfaceC0761e interfaceC0761eJ;
        int i5 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC0438v != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(V1.a.a((AbstractC0438v) it.next()));
        }
        arrayList2.addAll(arrayList3);
        n4.k.a(arrayList2, abstractC0438v != null ? V1.a.a(abstractC0438v) : null);
        Iterator it2 = arrayList.iterator();
        int i6 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            InterfaceC0798h c0799i = C0797g.f8481a;
            if (!zHasNext) {
                arrayList2.add(V1.a.a(abstractC0438v2));
                int size = list.size() + arrayList.size() + (abstractC0438v == null ? 0 : 1);
                if (z4) {
                    interfaceC0761eJ = abstractC0695h.u(size);
                } else {
                    f fVar = n.f8142a;
                    interfaceC0761eJ = abstractC0695h.j("Function" + size);
                }
                if (abstractC0438v != null) {
                    N3.c cVar = m.f8131p;
                    if (!interfaceC0798h.e(cVar)) {
                        ArrayList arrayListF0 = P2.m.F0(interfaceC0798h, new C0800j(abstractC0695h, cVar, v.f2164d));
                        interfaceC0798h = arrayListF0.isEmpty() ? c0799i : new C0799i(i5, arrayListF0);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    N3.c cVar2 = m.f8132q;
                    if (!interfaceC0798h.e(cVar2)) {
                        ArrayList arrayListF02 = P2.m.F0(interfaceC0798h, new C0800j(abstractC0695h, cVar2, z.h0(new O2.f(n.f8145d, new k(size2)))));
                        if (!arrayListF02.isEmpty()) {
                            c0799i = new C0799i(i5, arrayListF02);
                        }
                        interfaceC0798h = c0799i;
                    }
                }
                return C0421d.q(AbstractC0420c.w(interfaceC0798h), interfaceC0761eJ, arrayList2);
            }
            Object next = it2.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                P2.n.k0();
                throw null;
            }
            arrayList2.add(V1.a.a((AbstractC0438v) next));
            i6 = i7;
        }
    }

    public static void g0(Parcel parcel, int i5) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(iDataPosition - i5);
        parcel.setDataPosition(iDataPosition);
    }

    public static void h(String str, String str2, Object obj) {
        Log.d("TransportRuntime.".concat(str), String.format(str2, obj));
    }

    public static void h0(Parcel parcel, int i5, int i6) {
        if (i6 < 65535) {
            parcel.writeInt(i5 | (i6 << 16));
        } else {
            parcel.writeInt(i5 | (-65536));
            parcel.writeInt(i6);
        }
    }

    public static final boolean i(char c2, char c5, boolean z4) {
        if (c2 == c5) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final f j(AbstractC0438v abstractC0438v) {
        String str;
        InterfaceC0792b interfaceC0792bH = abstractC0438v.s().h(m.f8133r);
        if (interfaceC0792bH == null) {
            return null;
        }
        Object objK0 = P2.m.K0(interfaceC0792bH.b().values());
        S3.v vVar = objK0 instanceof S3.v ? (S3.v) objK0 : null;
        if (vVar != null && (str = (String) vVar.f2531a) != null) {
            if (!f.f(str)) {
                str = null;
            }
            if (str != null) {
                return f.e(str);
            }
        }
        return null;
    }

    public static final C0881c k(C0880b c0880b, N3.b bVar, M3.f fVar) {
        AbstractC0219i.e("<this>", c0880b);
        AbstractC0219i.e("classId", bVar);
        AbstractC0219i.e("jvmMetadataVersion", fVar);
        B.g gVarA = c0880b.a(bVar, fVar);
        if (gVarA != null) {
            return (C0881c) gVarA.f95e;
        }
        return null;
    }

    public static final int l(InterfaceC0673e interfaceC0673e) {
        AbstractC0219i.e("<this>", interfaceC0673e);
        return interfaceC0673e.p().size();
    }

    public static final N3.b m(K3.f fVar, int i5) {
        AbstractC0219i.e("<this>", fVar);
        return N3.b.e(fVar.s0(i5), fVar.P(i5));
    }

    public static int n(int i5, View view) {
        Context context = view.getContext();
        TypedValue typedValueV = b.V(view.getContext(), i5, view.getClass().getCanonicalName());
        int i6 = typedValueV.resourceId;
        return i6 != 0 ? AbstractC0939b.a(context, i6) : typedValueV.data;
    }

    public static int o(Context context, int i5, int i6) {
        Integer numValueOf;
        TypedValue typedValueR = b.R(context, i5);
        if (typedValueR != null) {
            int i7 = typedValueR.resourceId;
            numValueOf = Integer.valueOf(i7 != 0 ? AbstractC0939b.a(context, i7) : typedValueR.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i6;
    }

    public static final List p(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        E(abstractC0438v);
        int iF = f(abstractC0438v);
        if (iF == 0) {
            return u.f2163d;
        }
        List listSubList = abstractC0438v.s0().subList(0, iF);
        ArrayList arrayList = new ArrayList(o.l0(listSubList));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC0438v abstractC0438vB = ((N) it.next()).b();
            AbstractC0219i.d("it.type", abstractC0438vB);
            arrayList.add(abstractC0438vB);
        }
        return arrayList;
    }

    public static int q(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.sec.android.diagmonagent", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            b.l("DMA Client is not exist");
            return 0;
        }
    }

    public static Drawable r(Context context, int i5) {
        return D0.a().c(context, i5);
    }

    public static final Object s(AbstractC0081m abstractC0081m, C0083o c0083o) {
        AbstractC0219i.e("<this>", abstractC0081m);
        AbstractC0219i.e("extension", c0083o);
        if (abstractC0081m.l(c0083o)) {
            return abstractC0081m.k(c0083o);
        }
        return null;
    }

    public static final Object t(AbstractC0081m abstractC0081m, C0083o c0083o, int i5) {
        AbstractC0219i.e("<this>", abstractC0081m);
        AbstractC0219i.e("extension", c0083o);
        abstractC0081m.o(c0083o);
        C0078j c0078j = abstractC0081m.f2083d;
        c0078j.getClass();
        C0082n c0082n = c0083o.f2089d;
        if (!c0082n.f) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        C c2 = c0078j.f2079a;
        Object obj = c2.get(c0082n);
        if (i5 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC0081m.o(c0083o);
        if (!c0082n.f) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c2.get(c0082n);
        if (obj2 != null) {
            return c0083o.a(((List) obj2).get(i5));
        }
        throw new IndexOutOfBoundsException();
    }

    public static float u(Resources resources) throws NoSuchFieldException {
        Object objE;
        Method methodZ = b.z(Resources.class, "getCompatibilityInfo", new Class[0]);
        Field field = null;
        if (methodZ == null || (objE = b.E(resources, methodZ, new Object[0])) == null || !objE.getClass().getName().equals("android.content.res.CompatibilityInfo")) {
            objE = null;
        }
        if (objE == null) {
            return 1.0f;
        }
        Class clsO = b.o("android.content.res.CompatibilityInfo");
        if (clsO != null) {
            try {
                field = clsO.getField("applicationScale");
            } catch (NoSuchFieldException unused) {
                Log.w("SeslBaseReflector", "Reflector did not find field = ".concat("applicationScale"));
            }
        }
        if (field == null) {
            return 1.0f;
        }
        if (b.n(objE, field) instanceof Integer) {
            return ((Integer) r5).intValue();
        }
        return 1.0f;
    }

    public static final EnumC0700e w(InterfaceC0763g interfaceC0763g) {
        if (!(interfaceC0763g instanceof InterfaceC0761e) || !AbstractC0695h.G(interfaceC0763g)) {
            return null;
        }
        N3.e eVarH = U3.f.h(interfaceC0763g);
        if (!eVarH.d() || eVarH.f1838a.isEmpty()) {
            return null;
        }
        e eVar = EnumC0700e.f;
        String strB = eVarH.f().b();
        AbstractC0219i.d("shortName().asString()", strB);
        N3.c cVarE = eVarH.g().e();
        AbstractC0219i.d("toSafe().parent()", cVarE);
        eVar.getClass();
        C0699d c0699dI = e.i(strB, cVarE);
        if (c0699dI != null) {
            return c0699dI.f8179a;
        }
        return null;
    }

    public static final f x(K3.f fVar, int i5) {
        AbstractC0219i.e("<this>", fVar);
        return f.d(fVar.s(i5));
    }

    public static String y(Context context) {
        if (f6635b == null) {
            PackageInfo packageInfoA = A(context);
            if (packageInfoA != null) {
                f6635b = packageInfoA.versionName;
            } else {
                f6635b = "";
            }
        }
        return f6635b;
    }

    public static final AbstractC0438v z(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        E(abstractC0438v);
        if (abstractC0438v.s().h(m.f8131p) == null) {
            return null;
        }
        return ((N) abstractC0438v.s0().get(f(abstractC0438v))).b();
    }

    public abstract boolean G();

    public abstract void S(boolean z4);

    public abstract void T(boolean z4);

    public abstract TransformationMethod X(TransformationMethod transformationMethod);

    @Override // J.a0
    public void b() {
    }

    @Override // J.a0
    public void c() {
    }

    public abstract InputFilter[] v(InputFilter[] inputFilterArr);
}
