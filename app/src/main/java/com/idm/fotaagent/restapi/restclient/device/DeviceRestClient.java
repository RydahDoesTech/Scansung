package com.idm.fotaagent.restapi.restclient.device;

import android.content.Context;
import com.idm.fotaagent.restapi.parser.XmlParser;
import com.idm.fotaagent.restapi.request.DeviceInfo;
import com.idm.fotaagent.restapi.request.FOTABody;
import com.idm.fotaagent.restapi.request.ObjectRequest;
import com.idm.fotaagent.restapi.request.RequestPropertiesForOsp;
import com.idm.fotaagent.restapi.request.TimestampForAuth;
import com.idm.fotaagent.restapi.response.Response;
import com.idm.fotaagent.restapi.response.Result;
import com.idm.fotaagent.restapi.restclient.BaseRestClient;

/* loaded from: classes.dex */
public class DeviceRestClient extends BaseRestClient<Response.WithAttributes> {
    static final String URL_DEVICE_REGISTRATION = "/device/fumo/device";
    private final DeviceInfo.ForDeviceRegistration deviceInfo;

    public DeviceRestClient(Context context, DeviceInfo.ForDeviceRegistration forDeviceRegistration) {
        super(context, new Response.WithAttributes(), new XmlParser.Device(), new DeviceStrategyFactory());
        this.deviceInfo = forDeviceRegistration;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public boolean allowsRoaming() {
        return true;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String generateBody() {
        return new FOTABody.ForDeviceRegistration().generate(this.deviceInfo);
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getHttpMethod() {
        return ObjectRequest.HttpMethod.POST.toString();
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public RequestPropertiesForOsp getRequestProperties(ObjectRequest objectRequest) {
        return new RequestPropertiesForOsp.WithAuth.ByServerTime(objectRequest.getMethod(), objectRequest.getUrl().toString(), objectRequest.getBody());
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public String getUrl() {
        return getHostUrl(this.context) + URL_DEVICE_REGISTRATION;
    }

    @Override // com.idm.fotaagent.restapi.restclient.BaseRestClient
    public boolean onRetry() {
        if (!Result.ERROR_TYPE_INVALID_TIMESTAMP.equals(((Response.WithAttributes) this.response).getErrorCode())) {
            return false;
        }
        new TimestampForAuth(this.context).clear();
        return false;
    }
}
