package a1;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0203C;
import b1.t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.p000firebaseauthapi.R1;
import com.google.android.gms.internal.p000firebaseauthapi.Z;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import q1.AbstractC0785b;
import r1.C0810a;
import r1.C0812c;
import r1.C0813d;
import r1.C0814e;

/* loaded from: classes.dex */
public final class p extends Z implements Z0.d, Z0.e {

    /* renamed from: i, reason: collision with root package name */
    public static final U0.b f2968i = AbstractC0785b.f8446a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2969b;

    /* renamed from: c, reason: collision with root package name */
    public final R1 f2970c;

    /* renamed from: d, reason: collision with root package name */
    public final U0.b f2971d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f2972e;
    public final G3.d f;

    /* renamed from: g, reason: collision with root package name */
    public C0810a f2973g;

    /* renamed from: h, reason: collision with root package name */
    public C0097e f2974h;

    public p(Context context, R1 r12, G3.d dVar) {
        U0.b bVar = f2968i;
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f2969b = context;
        this.f2970c = r12;
        this.f = dVar;
        this.f2972e = (Set) dVar.f746d;
        this.f2971d = bVar;
    }

    @Override // Z0.e
    public final void f(Y0.a aVar) {
        this.f2974h.b(aVar);
    }

    @Override // Z0.d
    public final void g() {
        this.f2973g.d();
    }

    @Override // Z0.d
    public final void p() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountD;
        C0810a c0810a = this.f2973g;
        c0810a.getClass();
        try {
            c0810a.f8564x.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = c0810a.f5033b;
                ReentrantLock reentrantLock = W0.a.f2644c;
                AbstractC0203C.e(context);
                ReentrantLock reentrantLock2 = W0.a.f2644c;
                reentrantLock2.lock();
                try {
                    if (W0.a.f2645d == null) {
                        W0.a.f2645d = new W0.a(context.getApplicationContext());
                    }
                    W0.a aVar = W0.a.f2645d;
                    reentrantLock2.unlock();
                    String strA = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 20);
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = aVar.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountD = GoogleSignInAccount.d(strA2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountD = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountD = null;
            }
            ((C0812c) c0810a.h()).f(new C0813d(1, new t(2, account, c0810a.f8566z.intValue(), googleSignInAccountD)), this);
        } catch (RemoteException e5) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f2970c.post(new G.a(this, new C0814e(1, new Y0.a(8, null), null), 6, false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e5);
            }
        }
    }
}
