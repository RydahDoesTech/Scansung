package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f3736b;

    public /* synthetic */ Q(a0 a0Var, int i5) {
        this.f3735a = i5;
        this.f3736b = a0Var;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        switch (this.f3735a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    iArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue() ? 0 : -1;
                }
                a0 a0Var = this.f3736b;
                X x4 = (X) a0Var.f3755C.pollFirst();
                if (x4 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    i0 i0Var = a0Var.f3767c;
                    String str = x4.f3746d;
                    Fragment fragmentC = i0Var.c(str);
                    if (fragmentC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        fragmentC.onRequestPermissionsResult(x4.f3747e, strArr, iArr);
                        break;
                    }
                }
            case 1:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                a0 a0Var2 = this.f3736b;
                X x5 = (X) a0Var2.f3755C.pollLast();
                if (x5 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    i0 i0Var2 = a0Var2.f3767c;
                    String str2 = x5.f3746d;
                    Fragment fragmentC2 = i0Var2.c(str2);
                    if (fragmentC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        fragmentC2.onActivityResult(x5.f3747e, aVar.f3147d, aVar.f3148e);
                        break;
                    }
                }
            default:
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                a0 a0Var3 = this.f3736b;
                X x6 = (X) a0Var3.f3755C.pollFirst();
                if (x6 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    i0 i0Var3 = a0Var3.f3767c;
                    String str3 = x6.f3746d;
                    Fragment fragmentC3 = i0Var3.c(str3);
                    if (fragmentC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        fragmentC3.onActivityResult(x6.f3747e, aVar2.f3147d, aVar2.f3148e);
                        break;
                    }
                }
        }
    }
}
