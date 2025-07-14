package k3;

import b0.C0198c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: k3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675g extends t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0675g(Member member, Type type, Class cls, Type[] typeArr, int i5) {
        super(member, type, cls, typeArr);
        this.f7916e = i5;
    }

    @Override // k3.InterfaceC0673e
    public final Object i(Object[] objArr) {
        switch (this.f7916e) {
            case 0:
                Y0.j.d(this, objArr);
                Constructor constructor = (Constructor) this.f7925a;
                C0198c c0198c = new C0198c(2);
                c0198c.Q(objArr);
                c0198c.P(null);
                ArrayList arrayList = (ArrayList) c0198c.f5001d;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                Y0.j.d(this, objArr);
                return ((Constructor) this.f7925a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
