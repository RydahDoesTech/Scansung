package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import android.content.Context;
import com.idm.fotaagent.database.room.data.repository.DeviceRegistrationRepository;
import com.idm.fotaagent.database.room.data.repository.RegisteredDeviceRepository;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.DeviceId;
import com.samsung.android.fotaagent.common.feature.SalesCode;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class Skipregister extends HiddenCommand {

    public enum RegistrationStatus {
        REGISTERED("Set device as registered"),
        UNREGISTERED("Set device as unregistered");

        private final String description;

        RegistrationStatus(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public Skipregister(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(DeviceRegistrationRepository deviceRegistrationRepository, RegisteredDeviceRepository registeredDeviceRepository, Enum r4) {
        if (r4 == RegistrationStatus.REGISTERED) {
            if (deviceRegistrationRepository.isRegistered()) {
                Log.I("device already registered");
                return;
            }
            Log.I("set device as registered");
            registeredDeviceRepository.save(DeviceId.readDeviceId(this.context), DeviceUtils.readModelName(), SalesCode.get().toString());
            deviceRegistrationRepository.setRegister();
            return;
        }
        if (!deviceRegistrationRepository.isRegistered()) {
            Log.I("device already unregistered");
            return;
        }
        Log.I("set device as unregistered");
        new DeviceRegistrationRepository(this.context).setUnregister();
        new RegisteredDeviceRepository(this.context).clear();
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand
    public void execute() {
        if (DeviceUtils.isUserShipBinary()) {
            showToast("Not allowed in user-ship binary");
            return;
        }
        final DeviceRegistrationRepository deviceRegistrationRepository = new DeviceRegistrationRepository(this.context);
        final RegisteredDeviceRepository registeredDeviceRepository = new RegisteredDeviceRepository(this.context);
        showDialog("Change Registration Status", RegistrationStatus.values(), RegistrationStatus.REGISTERED, new Consumer() { // from class: com.idm.fotaagent.enabler.ui.admin.main.hidden.command.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DeviceRegistrationRepository deviceRegistrationRepository2 = deviceRegistrationRepository;
                this.f6310d.lambda$execute$0(deviceRegistrationRepository2, registeredDeviceRepository, (Enum) obj);
            }
        });
    }
}
