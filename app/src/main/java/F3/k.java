package F3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class k extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f651e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i5, String str, String str2) {
        super(1);
        this.f650d = i5;
        this.f651e = str;
        this.f = str2;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f650d) {
            case 0:
                o oVar = (o) obj;
                AbstractC0219i.e("$this$function", oVar);
                e eVar = l.f653b;
                String str = this.f651e;
                oVar.a(str, eVar);
                e eVar2 = l.f652a;
                oVar.a(this.f, eVar, eVar, eVar2, eVar2);
                oVar.c(str, eVar2);
                break;
            case 1:
                o oVar2 = (o) obj;
                AbstractC0219i.e("$this$function", oVar2);
                e eVar3 = l.f653b;
                String str2 = this.f651e;
                oVar2.a(str2, eVar3);
                oVar2.a(this.f, eVar3, eVar3, eVar3);
                oVar2.c(str2, eVar3);
                break;
            case 2:
                o oVar3 = (o) obj;
                AbstractC0219i.e("$this$function", oVar3);
                e eVar4 = l.f653b;
                String str3 = this.f651e;
                oVar3.a(str3, eVar4);
                e eVar5 = l.f654c;
                e eVar6 = l.f652a;
                oVar3.a(this.f, eVar4, eVar4, eVar5, eVar6);
                oVar3.c(str3, eVar6);
                break;
            case 3:
                o oVar4 = (o) obj;
                AbstractC0219i.e("$this$function", oVar4);
                e eVar7 = l.f653b;
                String str4 = this.f651e;
                oVar4.a(str4, eVar7);
                e eVar8 = l.f654c;
                oVar4.a(str4, eVar8);
                e eVar9 = l.f652a;
                oVar4.a(this.f, eVar7, eVar8, eVar8, eVar9);
                oVar4.c(str4, eVar9);
                break;
            case 4:
                o oVar5 = (o) obj;
                AbstractC0219i.e("$this$function", oVar5);
                e eVar10 = l.f654c;
                oVar5.a(this.f651e, eVar10);
                oVar5.c(this.f, l.f653b, eVar10);
                break;
            default:
                o oVar6 = (o) obj;
                AbstractC0219i.e("$this$function", oVar6);
                oVar6.a(this.f651e, l.f652a);
                oVar6.c(this.f, l.f653b, l.f654c);
                break;
        }
        return O2.l.f2016a;
    }
}
