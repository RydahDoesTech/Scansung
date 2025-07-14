package k2;

import com.google.firebase.messaging.C0388e;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import l2.C0682a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f7879e;

    public /* synthetic */ b(d dVar, int i5) {
        this.f7878d = i5;
        this.f7879e = dVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        C0682a c0682aB;
        C0682a c0682aG;
        switch (this.f7878d) {
            case 0:
                this.f7879e.a();
                return;
            case 1:
                this.f7879e.a();
                return;
            default:
                d dVar = this.f7879e;
                dVar.getClass();
                Object obj = d.f7882m;
                synchronized (obj) {
                    try {
                        V1.g gVar = dVar.f7883a;
                        gVar.a();
                        C0388e c0388eE = C0388e.e(gVar.f2610a);
                        try {
                            c0682aB = dVar.f7885c.b();
                            if (c0388eE != null) {
                                c0388eE.B();
                            }
                        } catch (Throwable th) {
                            if (c0388eE != null) {
                                c0388eE.B();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i5 = c0682aB.f8015b;
                    if (i5 == 5) {
                        c0682aG = dVar.g(c0682aB);
                    } else {
                        if (i5 == 3) {
                            c0682aG = dVar.g(c0682aB);
                        } else if (!dVar.f7886d.a(c0682aB)) {
                            return;
                        } else {
                            c0682aG = dVar.b(c0682aB);
                        }
                    }
                    synchronized (obj) {
                        try {
                            V1.g gVar2 = dVar.f7883a;
                            gVar2.a();
                            C0388e c0388eE2 = C0388e.e(gVar2.f2610a);
                            try {
                                dVar.f7885c.a(c0682aG);
                                if (c0388eE2 != null) {
                                    c0388eE2.B();
                                }
                            } catch (Throwable th2) {
                                if (c0388eE2 != null) {
                                    c0388eE2.B();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (dVar) {
                        try {
                            if (dVar.f7892k.size() != 0 && !c0682aB.f8014a.equals(c0682aG.f8014a)) {
                                Iterator it = dVar.f7892k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (c0682aG.f8015b == 4) {
                        String str = c0682aG.f8014a;
                        synchronized (dVar) {
                            dVar.f7891j = str;
                        }
                    }
                    int i6 = c0682aG.f8015b;
                    if (i6 == 5) {
                        dVar.h(new f());
                        return;
                    } else if (i6 == 2 || i6 == 1) {
                        dVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        dVar.i(c0682aG);
                        return;
                    }
                } catch (f e5) {
                    dVar.h(e5);
                    return;
                }
        }
    }
}
