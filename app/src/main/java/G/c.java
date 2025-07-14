package G;

import android.app.ActivityManager;
import com.idm.fotaagent.utils.GeneralUtils;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f678a;

    public /* synthetic */ c(int i5) {
        this.f678a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f678a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b2 = bArr[i5];
                    byte b5 = bArr2[i5];
                    if (b2 != b5) {
                        return b2 - b5;
                    }
                }
                return 0;
            default:
                return GeneralUtils.lambda$printProcessInfo$0((ActivityManager.RunningAppProcessInfo) obj, (ActivityManager.RunningAppProcessInfo) obj2);
        }
    }
}
