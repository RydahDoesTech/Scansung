package I0;

import A3.f;
import J0.i;
import J0.m;
import P0.k;
import Q0.h;
import a2.s;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b0.C0198c;
import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressContractor;
import com.idm.network.IDMNetworkInterface;
import d2.C0393b;
import e1.AbstractC0415a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements R0.b, a2.e, ButtonOnClickListener.ButtonAction {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f854e;

    public /* synthetic */ b(int i5, Object obj) {
        this.f853d = i5;
        this.f854e = obj;
    }

    public d a(Object obj) throws IOException {
        c cVar = (c) obj;
        e eVar = (e) this.f854e;
        AbstractC0415a.h("CctTransportBackend", "Making request to: %s", cVar.f855a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) cVar.f855a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(eVar.f866g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(IDMNetworkInterface.IDM_HTTP_METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.0.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = cVar.f857c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C0198c c0198c = eVar.f861a;
                    i iVar = cVar.f856b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    f2.d dVar = (f2.d) c0198c.f5001d;
                    f2.e eVar2 = new f2.e(bufferedWriter, dVar.f6720a, dVar.f6721b, dVar.f6722c, dVar.f6723d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.f6725b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), f.l(responseCode, "Status Code: "));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField(IDMNetworkInterface.IDM_HTTP_HEADER_CONTENT_TYPE));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new d(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new d(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            d dVar2 = new d(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1559a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return dVar2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (C0393b | IOException e5) {
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e5);
            return new d(400, null, 0L);
        } catch (ConnectException | UnknownHostException e6) {
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e6);
            return new d(500, null, 0L);
        }
    }

    @Override // R0.b
    public Object execute() {
        switch (this.f853d) {
            case 1:
                h hVar = (h) ((Q0.c) this.f854e);
                long jA = hVar.f2289e.a() - hVar.f2290g.f2277d;
                SQLiteDatabase sQLiteDatabaseG = hVar.g();
                sQLiteDatabaseG.beginTransaction();
                try {
                    int iDelete = sQLiteDatabaseG.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(jA)});
                    sQLiteDatabaseG.setTransactionSuccessful();
                    sQLiteDatabaseG.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th) {
                    sQLiteDatabaseG.endTransaction();
                    throw th;
                }
            default:
                k kVar = (k) this.f854e;
                Iterator it = ((Iterable) ((h) kVar.f2139b).l(new C2.a(9))).iterator();
                while (it.hasNext()) {
                    kVar.f2140c.a((K0.b) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // a2.e
    public Object j(s sVar) {
        int i5 = this.f853d;
        Object obj = this.f854e;
        switch (i5) {
            case 4:
                return (r2.a) obj;
            default:
                return obj;
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener.ButtonAction
    public void onClick() {
        ((DownloadProgressContractor.Presenter) this.f854e).downloadOrPause();
    }
}
