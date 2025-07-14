package com.google.firebase.messaging;

import android.util.Log;
import com.idm.network.IDMNetworkInterface;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class l implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final URL f6155d;

    /* renamed from: e, reason: collision with root package name */
    public t1.n f6156e;
    public volatile InputStream f;

    public l(URL url) {
        this.f6155d = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            InputStream inputStream = this.f;
            Logger logger = p1.h.f8365a;
            if (inputStream == null) {
                return;
            }
            try {
                inputStream.close();
            } catch (IOException e5) {
                try {
                    p1.h.f8365a.logp(Level.WARNING, "com.google.common.io.Closeables", IDMNetworkInterface.IDM_HTTP_CLOSE, "IOException thrown while closing Closeable.", (Throwable) e5);
                } catch (IOException e6) {
                    throw new AssertionError(e6);
                }
            }
        } catch (NullPointerException e7) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e7);
        }
    }
}
