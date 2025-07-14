package D2;

import com.idm.fotaagent.analytics.diagmon.DiagMon;
import com.idm.fotaagent.tool.ddf.DDFManager;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f493b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f492a = i5;
        this.f493b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i5 = this.f492a;
        Object obj2 = this.f493b;
        switch (i5) {
            case 0:
                return ((DDFManager) obj2).isCandidateDirectory((String) obj);
            case 1:
                return ((DDFManager) obj2).isTableCreatedSuccessfully((String) obj);
            default:
                return ((DiagMon.Reporter) obj2).lambda$report$0((String) obj);
        }
    }
}
