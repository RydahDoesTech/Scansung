package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ l f6154a;

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        byte[] bArr;
        l lVar = this.f6154a;
        Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(lVar.f6155d)));
        URLConnection uRLConnectionOpenConnection = lVar.f6155d.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            lVar.f = inputStream;
            int i5 = p1.g.f8364a;
            p1.f fVar = new p1.f(inputStream);
            ArrayDeque arrayDeque = new ArrayDeque(20);
            int i6 = 8192;
            int i7 = 0;
            while (true) {
                if (i7 < 2147483639) {
                    int iMin = Math.min(i6, 2147483639 - i7);
                    byte[] bArr2 = new byte[iMin];
                    arrayDeque.add(bArr2);
                    int i8 = 0;
                    while (i8 < iMin) {
                        int i9 = fVar.read(bArr2, i8, iMin - i8);
                        if (i9 == -1) {
                            bArr = new byte[i7];
                            int i10 = i7;
                            while (i10 > 0) {
                                byte[] bArr3 = (byte[]) arrayDeque.remove();
                                int iMin2 = Math.min(i10, bArr3.length);
                                System.arraycopy(bArr3, 0, bArr, i7 - i10, iMin2);
                                i10 -= iMin2;
                            }
                        } else {
                            i8 += i9;
                            i7 += i9;
                        }
                    }
                    long j5 = i6;
                    long j6 = j5 + j5;
                    i6 = j6 > 2147483647L ? Integer.MAX_VALUE : j6 < -2147483648L ? Integer.MIN_VALUE : (int) j6;
                } else {
                    if (fVar.read() != -1) {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                    bArr = new byte[2147483639];
                    int i11 = 2147483639;
                    while (i11 > 0) {
                        byte[] bArr4 = (byte[]) arrayDeque.remove();
                        int iMin3 = Math.min(i11, bArr4.length);
                        System.arraycopy(bArr4, 0, bArr, 2147483639 - i11, iMin3);
                        i11 -= iMin3;
                    }
                }
            }
            inputStream.close();
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String strValueOf = String.valueOf(lVar.f6155d);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(bArr.length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArr.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray == null) {
                throw new IOException("Failed to decode image: ".concat(String.valueOf(lVar.f6155d)));
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(lVar.f6155d)));
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
