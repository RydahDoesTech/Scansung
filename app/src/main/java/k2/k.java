package k2;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l2.C0682a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f7899b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7900c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f7901d;

    /* renamed from: a, reason: collision with root package name */
    public final b4.d f7902a;

    public k(b4.d dVar) {
        this.f7902a = dVar;
    }

    public final boolean a(C0682a c0682a) {
        if (TextUtils.isEmpty(c0682a.f8016c)) {
            return true;
        }
        long j5 = c0682a.f + c0682a.f8018e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f7902a.getClass();
        return j5 < timeUnit.toSeconds(System.currentTimeMillis()) + f7899b;
    }
}
