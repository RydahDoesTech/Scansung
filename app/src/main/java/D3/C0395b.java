package d3;

import b3.AbstractC0219i;
import com.google.android.gms.internal.p000firebaseauthapi.C0348u0;
import java.util.Random;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395b extends AbstractC0394a {
    public final C0348u0 f = new C0348u0(6);

    @Override // d3.AbstractC0394a
    public final Random b() {
        Object obj = this.f.get();
        AbstractC0219i.d("implStorage.get()", obj);
        return (Random) obj;
    }
}
