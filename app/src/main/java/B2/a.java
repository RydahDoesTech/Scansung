package B2;

import com.idm.fotaagent.restapi.registration.context.Registration;
import com.idm.fotaagent.restapi.registration.state.PollingRegistrationState;
import java.io.Serializable;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f217b;

    public /* synthetic */ a(int i5, Serializable serializable) {
        this.f216a = i5;
        this.f217b = serializable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i5 = this.f216a;
        Serializable serializable = this.f217b;
        switch (i5) {
            case 0:
                return ((Registration) serializable).lambda$start$0();
            default:
                return ((PollingRegistrationState) serializable).lambda$onEntry$0();
        }
    }
}
