package com.idm.fotaagent.restapi.restclient;

import com.idm.network.IDMNetworkHttpAdapter;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6349a;

    public /* synthetic */ a(int i5) {
        this.f6349a = i5;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.f6349a) {
            case 0:
                return BaseRestClient.lambda$setHostNameIfSslDisabled$0(str, sSLSession);
            default:
                return IDMNetworkHttpAdapter.lambda$idmCreateHttpUrlConnection$1(str, sSLSession);
        }
    }
}
