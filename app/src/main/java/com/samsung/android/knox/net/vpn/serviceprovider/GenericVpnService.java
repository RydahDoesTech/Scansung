package com.samsung.android.knox.net.vpn.serviceprovider;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/* loaded from: classes.dex */
public class GenericVpnService extends Service {
    public static final String SERVICE_INTERFACE = "android.net.VpnService";

    public class Builder {
        public Builder() {
            throw new RuntimeException("Stub!");
        }

        public Builder addAddress(InetAddress inetAddress, int i5) {
            throw new RuntimeException("Stub!");
        }

        public Builder addDnsServer(InetAddress inetAddress) {
            throw new RuntimeException("Stub!");
        }

        public Builder addRoute(InetAddress inetAddress, int i5) {
            throw new RuntimeException("Stub!");
        }

        public Builder addSearchDomain(String str) {
            throw new RuntimeException("Stub!");
        }

        public ParcelFileDescriptor establish() {
            throw new RuntimeException("Stub!");
        }

        public Builder setConfigureIntent(PendingIntent pendingIntent) {
            throw new RuntimeException("Stub!");
        }

        public Builder setMtu(int i5) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSession(String str) {
            throw new RuntimeException("Stub!");
        }

        public Builder addAddress(String str, int i5) {
            throw new RuntimeException("Stub!");
        }

        public Builder addDnsServer(String str) {
            throw new RuntimeException("Stub!");
        }

        public Builder addRoute(String str, int i5) {
            throw new RuntimeException("Stub!");
        }
    }

    public GenericVpnService() {
        throw new RuntimeException("Stub!");
    }

    public static Intent prepare(Context context, String str, boolean z4, boolean z5) {
        throw new RuntimeException("Stub!");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public void onRevoke() {
        throw new RuntimeException("Stub!");
    }

    public boolean protect(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean protect(Socket socket) {
        throw new RuntimeException("Stub!");
    }

    public boolean protect(DatagramSocket datagramSocket) {
        throw new RuntimeException("Stub!");
    }
}
