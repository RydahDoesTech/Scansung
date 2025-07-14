package A2;

import com.idm.fotaagent.enabler.feature.Operator;
import com.idm.fotaagent.restapi.exception.XmlParseException;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75a;

    public /* synthetic */ b(int i5) {
        this.f75a = i5;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f75a) {
            case 0:
                return new XmlParseException();
            case 1:
                return Operator.getOperator();
            default:
                return FotaTelephonyManager.lambda$getDataSimSlotId$2();
        }
    }
}
