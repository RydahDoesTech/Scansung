package d4;

import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import b0.C0198c;
import b3.AbstractC0219i;
import com.idm.providers.mo.IDMMoInterface;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class l implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6417d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f6418e;

    /* renamed from: a, reason: collision with root package name */
    public final n f6419a;

    /* renamed from: b, reason: collision with root package name */
    public final a f6420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6421c;

    static {
        String strSubstring;
        String canonicalName = l.class.getCanonicalName();
        AbstractC0219i.e("<this>", canonicalName);
        int iH0 = p4.h.h0(canonicalName);
        AbstractC0219i.e("<this>", canonicalName);
        int iLastIndexOf = canonicalName.lastIndexOf(IDMMoInterface.IDM_MO_ROOT_PATH, iH0);
        if (iLastIndexOf == -1) {
            strSubstring = "";
        } else {
            strSubstring = canonicalName.substring(0, iLastIndexOf);
            AbstractC0219i.d("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        }
        f6417d = strSubstring;
        f6418e = new b("NO_LOCKS", a.f6403d);
    }

    public l(String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        AbstractC0219i.e("lock", reentrantLock);
        C0198c c0198c = new C0198c();
        c0198c.f5001d = reentrantLock;
        this(str, c0198c);
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            } else if (!stackTrace[i5].getClassName().startsWith(f6417d)) {
                break;
            } else {
                i5++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i5, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    public final i a(InterfaceC0106a interfaceC0106a) {
        return new i(this, interfaceC0106a);
    }

    public final e b(InterfaceC0107b interfaceC0107b) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC0107b, 1);
    }

    public final j c(InterfaceC0107b interfaceC0107b) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC0107b);
    }

    public A1.c d(String str, Object obj) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return A3.f.p(sb, this.f6421c, ")");
    }

    public l(String str, n nVar) {
        a aVar = a.f6404e;
        this.f6419a = nVar;
        this.f6420b = aVar;
        this.f6421c = str;
    }
}
