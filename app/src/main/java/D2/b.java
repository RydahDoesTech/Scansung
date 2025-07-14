package D2;

import com.idm.core.ddf.DDFNode;
import com.idm.core.ddf.DDFTag;
import com.idm.fotaagent.tool.ddf.DDFManager;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f495b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f494a = i5;
        this.f495b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i5 = this.f494a;
        Object obj2 = this.f495b;
        switch (i5) {
            case 0:
                return ((DDFManager) obj2).getFilePaths((String) obj);
            default:
                return ((DDFNode) obj2).lambda$getPath$0((DDFTag) obj);
        }
    }
}
