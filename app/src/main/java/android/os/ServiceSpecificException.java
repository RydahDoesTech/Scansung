package android.os;

/* loaded from: classes.dex */
public class ServiceSpecificException extends RuntimeException {
    public final int errorCode;

    public ServiceSpecificException(int i5, String str) {
        super(str);
        this.errorCode = i5;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + " (code " + this.errorCode + ")";
    }

    public ServiceSpecificException(int i5) {
        this.errorCode = i5;
    }
}
