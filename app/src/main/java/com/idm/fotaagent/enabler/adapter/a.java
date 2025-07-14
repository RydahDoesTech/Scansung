package com.idm.fotaagent.enabler.adapter;

import android.app.AlarmManager;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.common.BaseActivity;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTimer;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.restapi.request.RequestPropertiesForOsp;
import com.idm.fotaagent.utils.storage.FileManager;
import e.AbstractActivityC0411n;
import java.io.File;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6279e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, int i5, Object obj2) {
        this.f6278d = i5;
        this.f6279e = obj;
        this.f = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6278d) {
            case 0:
                ((IDMAdapterNetworkImpl) this.f6279e).lambda$idmMakeHttpHeader$0((Map) this.f, (String) obj);
                break;
            case 1:
                ((BaseActivity.Inflater.Container) this.f6279e).lambda$tryDataBinding$0((AbstractActivityC0411n) this.f, (v) obj);
                break;
            case 2:
                ((NotificationTimer) this.f6279e).lambda$start$0((NotificationType) this.f, (AlarmManager) obj);
                break;
            case 3:
                ((RequestPropertiesForOsp.WithAuth) this.f6279e).lambda$new$0((Map) this.f, (String) obj);
                break;
            case 4:
                ((RequestPropertiesForOsp.WithoutAuth) this.f6279e).lambda$new$0((Map) this.f, (String) obj);
                break;
            default:
                ((FileManager) this.f6279e).lambda$clearDirectory$1((String[]) this.f, (File) obj);
                break;
        }
    }
}
