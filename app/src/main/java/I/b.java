package I;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class b extends Writer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f843d;

    /* renamed from: e, reason: collision with root package name */
    public final String f844e;
    public final StringBuilder f;

    public b(int i5) {
        this.f843d = i5;
        switch (i5) {
            case 1:
                this.f = new StringBuilder(128);
                this.f844e = "FragmentManager";
                break;
            default:
                this.f = new StringBuilder(128);
                this.f844e = "FragmentManager";
                break;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f843d) {
            case 0:
                g();
                break;
            default:
                g();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f843d) {
            case 0:
                g();
                break;
            default:
                g();
                break;
        }
    }

    public final void g() {
        switch (this.f843d) {
            case 0:
                StringBuilder sb = this.f;
                if (sb.length() > 0) {
                    Log.d(this.f844e, sb.toString());
                    sb.delete(0, sb.length());
                    break;
                }
                break;
            default:
                StringBuilder sb2 = this.f;
                if (sb2.length() > 0) {
                    Log.d(this.f844e, sb2.toString());
                    sb2.delete(0, sb2.length());
                    break;
                }
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i6) {
        switch (this.f843d) {
            case 0:
                for (int i7 = 0; i7 < i6; i7++) {
                    char c2 = cArr[i5 + i7];
                    if (c2 == '\n') {
                        g();
                    } else {
                        this.f.append(c2);
                    }
                }
                break;
            default:
                for (int i8 = 0; i8 < i6; i8++) {
                    char c5 = cArr[i5 + i8];
                    if (c5 == '\n') {
                        g();
                    } else {
                        this.f.append(c5);
                    }
                }
                break;
        }
    }
}
