package p1;

import com.samsung.android.knox.ex.KnoxContract;
import d2.C0393b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements d2.e {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final d2.c f8373g;

    /* renamed from: h, reason: collision with root package name */
    public static final d2.c f8374h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f8375i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f8376a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8377b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8378c;

    /* renamed from: d, reason: collision with root package name */
    public final n f8379d;

    /* renamed from: e, reason: collision with root package name */
    public final p f8380e = new p(this);

    static {
        i iVar = new i(1);
        HashMap map = new HashMap();
        map.put(m.class, iVar);
        f8373g = new d2.c(KnoxContract.KEY, Collections.unmodifiableMap(new HashMap(map)));
        i iVar2 = new i(2);
        HashMap map2 = new HashMap();
        map2.put(m.class, iVar2);
        f8374h = new d2.c("value", Collections.unmodifiableMap(new HashMap(map2)));
        f8375i = n.f8370b;
    }

    public o(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, n nVar) {
        this.f8376a = byteArrayOutputStream;
        this.f8377b = map;
        this.f8378c = map2;
        this.f8379d = nVar;
    }

    public static int f(d2.c cVar) {
        m mVar = (m) ((Annotation) cVar.f6400b.get(m.class));
        if (mVar != null) {
            return ((i) mVar).f8366a;
        }
        throw new C0393b("Field has no @Protobuf config");
    }

    public final void a(d2.c cVar, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return;
            }
            h((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            h(bytes.length);
            this.f8376a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                a(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(f8375i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z4 && dDoubleValue == 0.0d) {
                return;
            }
            h((f(cVar) << 3) | 1);
            this.f8376a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z4 && fFloatValue == 0.0f) {
                return;
            }
            h((f(cVar) << 3) | 5);
            this.f8376a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z4 && jLongValue == 0) {
                return;
            }
            m mVar = (m) ((Annotation) cVar.f6400b.get(m.class));
            if (mVar == null) {
                throw new C0393b("Field has no @Protobuf config");
            }
            h(((i) mVar).f8366a << 3);
            i(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            h((f(cVar) << 3) | 2);
            h(bArr.length);
            this.f8376a.write(bArr);
            return;
        }
        d2.d dVar = (d2.d) this.f8377b.get(obj.getClass());
        if (dVar != null) {
            g(dVar, cVar, obj, z4);
            return;
        }
        d2.f fVar = (d2.f) this.f8378c.get(obj.getClass());
        if (fVar != null) {
            p pVar = this.f8380e;
            pVar.f8381a = false;
            pVar.f8383c = cVar;
            pVar.f8382b = z4;
            fVar.a(obj, pVar);
            return;
        }
        if (obj instanceof k) {
            b(cVar, ((k) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            g(this.f8379d, cVar, obj, z4);
        }
    }

    public final void b(d2.c cVar, int i5, boolean z4) {
        if (z4 && i5 == 0) {
            return;
        }
        m mVar = (m) ((Annotation) cVar.f6400b.get(m.class));
        if (mVar == null) {
            throw new C0393b("Field has no @Protobuf config");
        }
        h(((i) mVar).f8366a << 3);
        h(i5);
    }

    @Override // d2.e
    public final d2.e c(d2.c cVar, long j5) throws IOException {
        if (j5 != 0) {
            m mVar = (m) ((Annotation) cVar.f6400b.get(m.class));
            if (mVar == null) {
                throw new C0393b("Field has no @Protobuf config");
            }
            h(((i) mVar).f8366a << 3);
            i(j5);
        }
        return this;
    }

    @Override // d2.e
    public final /* synthetic */ d2.e d(d2.c cVar, int i5) {
        b(cVar, i5, true);
        return this;
    }

    @Override // d2.e
    public final d2.e e(d2.c cVar, Object obj) {
        a(cVar, obj, true);
        return this;
    }

    public final void g(d2.d dVar, d2.c cVar, Object obj, boolean z4) throws IOException {
        j jVar = new j();
        jVar.f8367d = 0L;
        try {
            OutputStream outputStream = this.f8376a;
            this.f8376a = jVar;
            try {
                dVar.a(obj, this);
                this.f8376a = outputStream;
                long j5 = jVar.f8367d;
                jVar.close();
                if (z4 && j5 == 0) {
                    return;
                }
                h((f(cVar) << 3) | 2);
                i(j5);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f8376a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                jVar.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void h(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            this.f8376a.write((i5 & 127) | 128);
            i5 >>>= 7;
        }
        this.f8376a.write(i5 & 127);
    }

    public final void i(long j5) throws IOException {
        while (((-128) & j5) != 0) {
            this.f8376a.write((((int) j5) & 127) | 128);
            j5 >>>= 7;
        }
        this.f8376a.write(((int) j5) & 127);
    }
}
