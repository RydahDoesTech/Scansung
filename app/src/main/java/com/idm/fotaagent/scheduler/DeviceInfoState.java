package com.idm.fotaagent.scheduler;

import android.content.Context;
import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.scheduler.DeviceInfoState;
import com.idm.fotaagent.scheduler.exception.DeviceInfoException;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.DeviceId;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public enum DeviceInfoState {
    RUNNABLE(null),
    EMPTY(new DeviceInfoException() { // from class: com.idm.fotaagent.scheduler.exception.DeviceInfoEmptyException
    }),
    CHANGED(new DeviceInfoException() { // from class: com.idm.fotaagent.scheduler.exception.DeviceInfoChangedException
    });

    private final DeviceInfoException exception;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEVICE_ID' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class Element {
        private static final /* synthetic */ Element[] $VALUES;
        public static final Element DEVICE_ID;
        public static final Element MODEL_NAME;
        public static final Element SALES_CODE;
        private final Supplier<String> getterForCurrent;
        private final Function<RegisteredDeviceRepository, Optional<String>> getterForRegistered;

        private static /* synthetic */ Element[] $values() {
            return new Element[]{DEVICE_ID, MODEL_NAME, SALES_CODE};
        }

        static {
            final int i5 = 0;
            DEVICE_ID = new Element("DEVICE_ID", 0, new Supplier() { // from class: com.idm.fotaagent.scheduler.a
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i5) {
                        case 0:
                            return DeviceInfoState.Element.lambda$static$0();
                        default:
                            return DeviceUtils.readModelName();
                    }
                }
            }, new c(1)) { // from class: com.idm.fotaagent.scheduler.DeviceInfoState.Element.1
                @Override // com.idm.fotaagent.scheduler.DeviceInfoState.Element
                public void logReasonForChanged(String str, String str2) {
                    Log.H("Current value for " + name() + ": " + str + ", Registered value for " + name() + ": " + str2);
                    Log.W("Current is different from registered one; reset and re-register device");
                }
            };
            final int i6 = 1;
            MODEL_NAME = new Element("MODEL_NAME", 1, new Supplier() { // from class: com.idm.fotaagent.scheduler.a
                @Override // java.util.function.Supplier
                public final Object get() {
                    switch (i6) {
                        case 0:
                            return DeviceInfoState.Element.lambda$static$0();
                        default:
                            return DeviceUtils.readModelName();
                    }
                }
            }, new c(2));
            SalesCode salesCode = SalesCode.get();
            Objects.requireNonNull(salesCode);
            SALES_CODE = new Element("SALES_CODE", 2, new b(0, salesCode), new c(3));
            $VALUES = $values();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ DeviceInfoState lambda$state$1(String str) {
            return DeviceInfoState.RUNNABLE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ DeviceInfoState lambda$state$2(String str, Optional optional) {
            logReasonForChanged(str, (String) optional.orElse(null));
            return DeviceInfoState.CHANGED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String lambda$static$0() {
            return DeviceId.readDeviceId(DeviceInfoState.getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DeviceInfoState state() {
            final String str = this.getterForCurrent.get();
            if (!TextUtils.isEmpty(str)) {
                final Optional<String> optionalApply = this.getterForRegistered.apply(new RegisteredDeviceRepository(DeviceInfoState.getContext()));
                Objects.requireNonNull(str);
                return (DeviceInfoState) optionalApply.filter(new com.idm.core.ddf.a(str, 2)).map(new c(0)).orElseGet(new Supplier() { // from class: com.idm.fotaagent.scheduler.d
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return this.f6364a.lambda$state$2(str, optionalApply);
                    }
                });
            }
            Log.W("Current value for " + name() + " should not be empty");
            return DeviceInfoState.EMPTY;
        }

        public static Element valueOf(String str) {
            return (Element) Enum.valueOf(Element.class, str);
        }

        public static Element[] values() {
            return (Element[]) $VALUES.clone();
        }

        public void logReasonForChanged(String str, String str2) {
            Log.W("Current value for " + name() + "(" + str + ") is different from registered one(" + str2 + "; reset and re-register device");
        }

        private Element(String str, int i5, Supplier supplier, Function function) {
            this.getterForCurrent = supplier;
            this.getterForRegistered = function;
        }
    }

    DeviceInfoState(DeviceInfoException deviceInfoException) {
        this.exception = deviceInfoException;
    }

    public static DeviceInfoState get() {
        Log.I("");
        if (new AdminRepository(getContext()).isCustomProfileMode()) {
            Log.I("CheckProfileEditMode : true");
            return RUNNABLE;
        }
        DeviceInfoState deviceInfoStateState = Element.DEVICE_ID.state();
        DeviceInfoState deviceInfoStateState2 = Element.MODEL_NAME.state();
        DeviceInfoState deviceInfoStateState3 = Element.SALES_CODE.state();
        DeviceInfoState deviceInfoState = RUNNABLE;
        if (deviceInfoStateState == deviceInfoState && deviceInfoStateState2 == deviceInfoState && deviceInfoStateState3 == deviceInfoState) {
            return deviceInfoState;
        }
        DeviceInfoState deviceInfoState2 = EMPTY;
        return (deviceInfoStateState == deviceInfoState2 || deviceInfoStateState2 == deviceInfoState2 || deviceInfoStateState3 == deviceInfoState2) ? deviceInfoState2 : CHANGED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public void checkException() throws DeviceInfoException {
        DeviceInfoException deviceInfoException = this.exception;
        if (deviceInfoException != null) {
            throw deviceInfoException;
        }
    }
}
