package b4;

import J.C0068z;
import Q0.j;
import a1.k;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.databinding.t;
import androidx.databinding.v;
import androidx.databinding.w;
import androidx.fragment.app.d0;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.q;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import d4.l;
import d4.o;
import e.InterfaceC0399b;
import h0.InterfaceC0471b;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l1.AbstractC0679b;
import l1.C0680c;
import l1.e;
import l1.f;
import t1.i;

/* loaded from: classes.dex */
public final class d implements M0.b, S0.a, androidx.databinding.d, a0, q, InterfaceC0399b, InterfaceC0471b, k {

    /* renamed from: d, reason: collision with root package name */
    public static d f5106d;

    /* renamed from: e, reason: collision with root package name */
    public static d f5107e;

    public d(o oVar) {
        AbstractC0219i.e("storageManager", oVar);
        String str = l.f6417d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static InputStream e(String str) throws IOException {
        AbstractC0219i.e("path", str);
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }

    @Override // S0.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // a1.k
    public void accept(Object obj, Object obj2) {
        C0680c c0680c = (C0680c) ((e) obj).h();
        f fVar = new f((i) obj2);
        c0680c.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i5 = AbstractC0679b.f8011a;
        parcelObtain.writeStrongBinder(fVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            c0680c.f8012a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // androidx.preference.q
    public CharSequence b(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.D()) ? listPreference.f4601d.getString(R.string.not_set) : listPreference.D();
    }

    @Override // androidx.lifecycle.a0
    public X c(Class cls) {
        return new d0(true);
    }

    @Override // androidx.databinding.d
    public w d(v vVar, int i5, ReferenceQueue referenceQueue) {
        return new t(vVar, i5, referenceQueue, 0).f3636b;
    }

    @Override // N2.a
    public Object get() {
        List list = j.f;
        return 4;
    }

    @Override // h0.InterfaceC0471b
    public void j(int i5, Serializable serializable) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public d() {
    }

    public d(View view) {
        new C0068z(view).f1500d = view;
    }
}
