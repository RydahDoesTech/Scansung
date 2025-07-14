package F3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;

/* loaded from: classes.dex */
public final class j extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i5) {
        super(1);
        this.f648d = i5;
        this.f649e = str;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f648d) {
            case 0:
                o oVar = (o) obj;
                AbstractC0219i.e("$this$function", oVar);
                e eVar = l.f653b;
                oVar.a(this.f649e, eVar, eVar);
                break;
            case 1:
                o oVar2 = (o) obj;
                AbstractC0219i.e("$this$function", oVar2);
                oVar2.a(this.f649e, l.f653b);
                break;
            case 2:
                o oVar3 = (o) obj;
                AbstractC0219i.e("$this$function", oVar3);
                e eVar2 = l.f653b;
                String str = this.f649e;
                oVar3.a(str, eVar2);
                oVar3.a(str, eVar2);
                break;
            case 3:
                o oVar4 = (o) obj;
                AbstractC0219i.e("$this$function", oVar4);
                e eVar3 = l.f653b;
                String str2 = this.f649e;
                oVar4.a(str2, eVar3);
                oVar4.c(str2, eVar3);
                break;
            case 4:
                o oVar5 = (o) obj;
                AbstractC0219i.e("$this$function", oVar5);
                e eVar4 = l.f653b;
                String str3 = this.f649e;
                oVar5.a(str3, eVar4);
                oVar5.a(str3, eVar4);
                oVar5.c(str3, eVar4);
                break;
            case 5:
                o oVar6 = (o) obj;
                AbstractC0219i.e("$this$function", oVar6);
                oVar6.c(this.f649e, l.f653b);
                break;
            case 6:
                o oVar7 = (o) obj;
                AbstractC0219i.e("$this$function", oVar7);
                e eVar5 = l.f653b;
                oVar7.a(this.f649e, eVar5, eVar5);
                oVar7.b(V3.c.BOOLEAN);
                break;
            case 7:
                o oVar8 = (o) obj;
                AbstractC0219i.e("$this$function", oVar8);
                e eVar6 = l.f653b;
                oVar8.c(this.f649e, eVar6, eVar6);
                break;
            case 8:
                o oVar9 = (o) obj;
                AbstractC0219i.e("$this$function", oVar9);
                e eVar7 = l.f653b;
                oVar9.c(this.f649e, eVar7, eVar7);
                break;
            case 9:
                o oVar10 = (o) obj;
                AbstractC0219i.e("$this$function", oVar10);
                e eVar8 = l.f653b;
                oVar10.a(this.f649e, eVar8, eVar8);
                break;
            case 10:
                o oVar11 = (o) obj;
                AbstractC0219i.e("$this$function", oVar11);
                e eVar9 = l.f653b;
                oVar11.a(this.f649e, eVar9, eVar9, eVar9);
                break;
            case 11:
                o oVar12 = (o) obj;
                AbstractC0219i.e("$this$function", oVar12);
                e eVar10 = l.f653b;
                String str4 = this.f649e;
                oVar12.a(str4, eVar10);
                oVar12.a(str4, eVar10);
                oVar12.c(str4, l.f652a);
                break;
            case 12:
                o oVar13 = (o) obj;
                AbstractC0219i.e("$this$function", oVar13);
                e eVar11 = l.f653b;
                String str5 = this.f649e;
                oVar13.a(str5, eVar11);
                oVar13.a(str5, eVar11);
                oVar13.c(str5, l.f652a);
                break;
            case 13:
                o oVar14 = (o) obj;
                AbstractC0219i.e("$this$function", oVar14);
                e eVar12 = l.f653b;
                String str6 = this.f649e;
                oVar14.a(str6, eVar12);
                oVar14.a(str6, eVar12);
                oVar14.a(str6, eVar12);
                oVar14.b(V3.c.BOOLEAN);
                break;
            case 14:
                o oVar15 = (o) obj;
                AbstractC0219i.e("$this$function", oVar15);
                e eVar13 = l.f653b;
                oVar15.a(this.f649e, eVar13, eVar13, eVar13, eVar13);
                break;
            case 15:
                o oVar16 = (o) obj;
                AbstractC0219i.e("$this$function", oVar16);
                oVar16.c(this.f649e, l.f653b, l.f654c);
                break;
            case 16:
                o oVar17 = (o) obj;
                AbstractC0219i.e("$this$function", oVar17);
                oVar17.c(this.f649e, l.f654c);
                break;
            case 17:
                o oVar18 = (o) obj;
                AbstractC0219i.e("$this$function", oVar18);
                oVar18.a(this.f649e, l.f653b, l.f654c);
                break;
            case 18:
                o oVar19 = (o) obj;
                AbstractC0219i.e("$this$function", oVar19);
                oVar19.c(this.f649e, l.f652a);
                break;
            case 19:
                o oVar20 = (o) obj;
                AbstractC0219i.e("$this$function", oVar20);
                oVar20.a(this.f649e, l.f653b);
                oVar20.b(V3.c.BOOLEAN);
                break;
            default:
                o oVar21 = (o) obj;
                AbstractC0219i.e("$this$function", oVar21);
                e eVar14 = l.f653b;
                String str7 = this.f649e;
                oVar21.a(str7, eVar14);
                oVar21.a(str7, eVar14);
                oVar21.b(V3.c.BOOLEAN);
                break;
        }
        return O2.l.f2016a;
    }
}
