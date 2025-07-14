package f1;

import Y0.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iS = j.S(parcel);
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        boolean zH = false;
        long J4 = 0;
        long J5 = 0;
        long J6 = 0;
        String strU = null;
        ArrayList arrayListV = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        String strU5 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < iS) {
            int i5 = parcel.readInt();
            switch (65535 & i5) {
                case 1:
                    I4 = j.I(parcel, i5);
                    break;
                case 2:
                    J4 = j.J(parcel, i5);
                    break;
                case 3:
                case 7:
                case 9:
                default:
                    j.R(parcel, i5);
                    break;
                case 4:
                    strU = j.u(parcel, i5);
                    break;
                case 5:
                    I6 = j.I(parcel, i5);
                    break;
                case 6:
                    arrayListV = j.v(parcel, i5);
                    break;
                case 8:
                    J5 = j.J(parcel, i5);
                    break;
                case 10:
                    strU3 = j.u(parcel, i5);
                    break;
                case 11:
                    I5 = j.I(parcel, i5);
                    break;
                case 12:
                    strU2 = j.u(parcel, i5);
                    break;
                case 13:
                    strU4 = j.u(parcel, i5);
                    break;
                case 14:
                    I7 = j.I(parcel, i5);
                    break;
                case 15:
                    j.U(parcel, i5, 4);
                    f = parcel.readFloat();
                    break;
                case 16:
                    J6 = j.J(parcel, i5);
                    break;
                case 17:
                    strU5 = j.u(parcel, i5);
                    break;
                case 18:
                    zH = j.H(parcel, i5);
                    break;
            }
        }
        j.z(parcel, iS);
        return new WakeLockEvent(I4, J4, I5, strU, I6, arrayListV, strU2, J5, I7, strU3, strU4, f, J6, strU5, zH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new WakeLockEvent[i5];
    }
}
