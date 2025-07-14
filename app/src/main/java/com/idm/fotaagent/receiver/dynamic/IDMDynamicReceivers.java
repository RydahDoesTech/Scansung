package com.idm.fotaagent.receiver.dynamic;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.interfaces.IntentActions;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.idm.fotaagent.enabler.ui.whatsnew.a;
import com.idm.fotaagent.receiver.dynamic.ReceiverToBeSpecifiedFlag;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.samsung.android.fotaagent.common.feature.InRoaming;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public class IDMDynamicReceivers {
    private static final IDMDynamicReceivers INSTANCE = new IDMDynamicReceivers();
    final Map<Class<? extends ReceiverWithIntentFilter>, ReceiverWithIntentFilter> receivers = new HashMap();
    private State state = State.UNREGISTERED;

    /* renamed from: com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$receiver$dynamic$ReceiverToBeSpecifiedFlag$Property;

        static {
            int[] iArr = new int[ReceiverToBeSpecifiedFlag.Property.values().length];
            $SwitchMap$com$idm$fotaagent$receiver$dynamic$ReceiverToBeSpecifiedFlag$Property = iArr;
            try {
                iArr[ReceiverToBeSpecifiedFlag.Property.EXPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$receiver$dynamic$ReceiverToBeSpecifiedFlag$Property[ReceiverToBeSpecifiedFlag.Property.NOT_EXPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$receiver$dynamic$ReceiverToBeSpecifiedFlag$Property[ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @ReceiverToBeAutoRegistered
    @ReceiverToBeSpecifiedFlag(property = ReceiverToBeSpecifiedFlag.Property.EXPORT)
    public static class CarrierFeatureChangeReceiver extends ReceiverWithIntentFilter {
        @Override // com.idm.fotaagent.receiver.dynamic.ReceiverWithIntentFilter
        public IntentFilter getIntentFilter() {
            return new IntentFilter(IntentActions.IDM_INTENT_CARRIER_CHANGED);
        }

        @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
        public void handle() {
            Log.I("Carrier Feature Changed Receive");
            IDMDynamicReceivers.resetNetworkFeatures();
        }
    }

    @ReceiverToBeAutoRegistered
    @ReceiverToBeSpecifiedFlag(property = ReceiverToBeSpecifiedFlag.Property.EXPORT)
    public static class DefaultDataSubInfoChangeReceiver extends ReceiverWithIntentFilter {
        @Override // com.idm.fotaagent.receiver.dynamic.ReceiverWithIntentFilter
        public IntentFilter getIntentFilter() {
            return new IntentFilter(IntentActions.IDM_INTENT_DATA_SUBSCRIPTION_CHANGED);
        }

        @Override // com.idm.fotaagent.utils.receiver.SafeBroadcastReceiver
        public void handle() {
            Log.I("Subscription Changed Receive");
            IDMDynamicReceivers.resetNetworkFeatures();
        }
    }

    public enum State {
        UNREGISTERED,
        PARTIALLY_REGISTERED,
        REGISTERED
    }

    private IDMDynamicReceivers() {
    }

    public static void clearWifiPostponeIfNecessary(Context context) {
        String sessionId = new ActionInfoDao().getSessionId();
        if (TextUtils.isEmpty(sessionId)) {
            Log.W("taskId is empty");
            return;
        }
        if (!new PostponeRepository(context).isWifiSetting()) {
            Log.I("This postpone type is not clearing case");
        } else if (WifiOnlyChecker.getInstance().isWifiOnlyForDl(sessionId) || new ActionInfoDao(sessionId).getPushUiMode() == 4) {
            Log.I("Wifi still has been required");
        } else {
            Log.I("clear wifi postpone");
            PostponeManager.cancel();
        }
    }

    private Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static IDMDynamicReceivers getInstance() {
        return INSTANCE;
    }

    public static void resetNetworkFeatures() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        InRoaming.reloadFeature();
        NetworkResumeJobScheduleManager.reScheduleIfExistPendingJob(contextIdmGetContext);
        clearWifiPostponeIfNecessary(contextIdmGetContext);
    }

    public synchronized boolean isRegistered() {
        Log.I("state: " + this.state);
        return this.state == State.REGISTERED;
    }

    public synchronized void register() {
        try {
            Log.I("register");
            this.state = State.REGISTERED;
            for (Class<?> cls : getClass().getDeclaredClasses()) {
                if (cls.isAnnotationPresent(ReceiverToBeAutoRegistered.class)) {
                    if (ReceiverWithIntentFilter.class.isAssignableFrom(cls)) {
                        ReceiverToBeSpecifiedFlag.Property property = ReceiverToBeSpecifiedFlag.Property.NOT_SPECIFY_FOR_SYSTEM;
                        if (cls.isAnnotationPresent(ReceiverToBeSpecifiedFlag.class)) {
                            property = (ReceiverToBeSpecifiedFlag.Property) Optional.ofNullable((ReceiverToBeSpecifiedFlag) cls.getAnnotation(ReceiverToBeSpecifiedFlag.class)).map(new a(3)).orElse(property);
                        }
                        if (!register(cls, property)) {
                            this.state = State.PARTIALLY_REGISTERED;
                        }
                    } else {
                        Log.W("Annotation attached to unsupported class: " + cls);
                    }
                }
            }
        } finally {
        }
    }

    public void registerTemperatureChangeReceiverIfNeeded() {
        if (IDMApplication.getEnablerFactory().getTemperatureChecker().needsCheckTemperatureChange()) {
            getInstance().register(TemperatureChangeReceiver.class, ReceiverToBeSpecifiedFlag.Property.EXPORT);
        }
    }

    public synchronized void unregister() {
        try {
            Log.I("unregister");
            this.state = State.UNREGISTERED;
            for (ReceiverWithIntentFilter receiverWithIntentFilter : this.receivers.values()) {
                if (receiverWithIntentFilter == null) {
                    Log.W("receiver is null");
                } else {
                    getContext().unregisterReceiver(receiverWithIntentFilter);
                }
            }
            this.receivers.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void unregister(Class<? extends ReceiverWithIntentFilter> cls) {
        Log.I("unregister: " + cls);
        ReceiverWithIntentFilter receiverWithIntentFilterRemove = this.receivers.remove(cls);
        if (receiverWithIntentFilterRemove == null) {
            Log.W("receiver is null for " + cls);
            return;
        }
        getContext().unregisterReceiver(receiverWithIntentFilterRemove);
    }

    public synchronized boolean register(Class<? extends ReceiverWithIntentFilter> cls, ReceiverToBeSpecifiedFlag.Property property) {
        Log.I(cls + ", property : " + property);
        if (this.receivers.get(cls) != null) {
            Log.W("already registered: " + cls);
            return true;
        }
        try {
            ReceiverWithIntentFilter receiverWithIntentFilterNewInstance = cls.newInstance();
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$receiver$dynamic$ReceiverToBeSpecifiedFlag$Property[property.ordinal()];
            if (i5 == 1) {
                getContext().registerReceiver(receiverWithIntentFilterNewInstance, receiverWithIntentFilterNewInstance.getIntentFilter(), 2);
            } else if (i5 != 2) {
                getContext().registerReceiver(receiverWithIntentFilterNewInstance, receiverWithIntentFilterNewInstance.getIntentFilter());
            } else {
                getContext().registerReceiver(receiverWithIntentFilterNewInstance, receiverWithIntentFilterNewInstance.getIntentFilter(), 4);
            }
            this.receivers.put(cls, receiverWithIntentFilterNewInstance);
            return true;
        } catch (IllegalAccessException | InstantiationException e5) {
            Log.E(e5.getMessage());
            return false;
        }
    }
}
