package O2;

import android.os.Parcel;

/* loaded from: classes.dex */
public class d extends RuntimeException {
    public /* synthetic */ d() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public d(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(iDataPosition);
        sb.append(" size=");
        sb.append(iDataSize);
        super(sb.toString());
    }
}
