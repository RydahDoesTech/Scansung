package h0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f6846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6847b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6848c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6849d;

    public h(int i5, int i6, long j5, long j6) {
        this.f6846a = i5;
        this.f6847b = i6;
        this.f6848c = j5;
        this.f6849d = j6;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6846a);
            dataOutputStream.writeInt(this.f6847b);
            dataOutputStream.writeLong(this.f6848c);
            dataOutputStream.writeLong(this.f6849d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6847b == hVar.f6847b && this.f6848c == hVar.f6848c && this.f6846a == hVar.f6846a && this.f6849d == hVar.f6849d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6847b), Long.valueOf(this.f6848c), Integer.valueOf(this.f6846a), Long.valueOf(this.f6849d));
    }
}
