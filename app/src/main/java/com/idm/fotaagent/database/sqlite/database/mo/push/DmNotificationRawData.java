package com.idm.fotaagent.database.sqlite.database.mo.push;

import com.idm.fotaagent.database.sqlite.database.mo.push.field.UiMode;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.custom.CustomDeviceManager;

/* loaded from: classes.dex */
public class DmNotificationRawData {
    private final byte[] rawData;

    /* renamed from: com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationRawData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode;

        static {
            int[] iArr = new int[UiMode.values().length];
            $SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode = iArr;
            try {
                iArr[UiMode.INFORMATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode[UiMode.USER_INTERACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode[UiMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode[UiMode.NOT_SPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode[UiMode.WIFI_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class Builder {
        static final int LENGTH_DIGEST = 16;
        static final int LENGTH_TRIGGER_HEADER = 8;
        private byte[] rawData;
        private final byte[] serverId;
        private byte[] triggerBody;
        private final byte[] triggerHeader = createDefaultHeader();
        private UiMode uiMode = UiMode.USER_INTERACTION;

        public Builder(byte[] bArr) {
            this.serverId = bArr;
        }

        private void assemble() {
            resolveIfConflictExists();
            byte[] bArr = this.triggerHeader;
            int length = bArr.length + 16;
            byte[] bArr2 = this.triggerBody;
            byte[] bArr3 = new byte[length + (bArr2 != null ? bArr2.length : 0)];
            this.rawData = bArr3;
            System.arraycopy(bArr, 0, bArr3, 16, bArr.length);
            byte[] bArr4 = this.triggerBody;
            if (bArr4 != null) {
                System.arraycopy(bArr4, 0, this.rawData, this.triggerHeader.length + 16, bArr4.length);
            }
        }

        private byte convertToByte(UiMode uiMode) {
            Log.I("uiMode : " + uiMode);
            int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$database$sqlite$database$mo$push$field$UiMode[uiMode.ordinal()];
            if (i5 == 1) {
                return (byte) -24;
            }
            if (i5 != 2) {
                return i5 != 3 ? (byte) -56 : (byte) -40;
            }
            return (byte) -8;
        }

        private byte[] createDefaultHeader() {
            byte[] bArr = this.serverId;
            int length = bArr.length + 8;
            byte[] bArr2 = new byte[length];
            bArr2[0] = 2;
            bArr2[1] = -8;
            bArr2[2] = 0;
            bArr2[3] = 0;
            bArr2[4] = 0;
            bArr2[5] = 103;
            bArr2[6] = 33;
            bArr2[7] = (byte) (bArr.length & CustomDeviceManager.CALL_SCREEN_ALL);
            System.arraycopy(bArr, 0, bArr2, length - bArr.length, bArr.length);
            return bArr2;
        }

        private void resolveIfConflictExists() {
            byte[] bArr = this.triggerBody;
            if (bArr == null) {
                return;
            }
            byte b2 = bArr[0];
            UiMode uiMode = UiMode.WIFI_BACKGROUND;
            if (b2 == uiMode.toCode()) {
                this.uiMode = uiMode;
                this.triggerHeader[1] = convertToByte(uiMode);
            } else if (this.uiMode == uiMode) {
                UiMode uiMode2 = UiMode.NOT_SPECIFIED;
                this.uiMode = uiMode2;
                this.triggerHeader[1] = convertToByte(uiMode2);
            }
        }

        private void setVendorIfWifiBackground(UiMode uiMode) {
            UiMode uiMode2 = UiMode.WIFI_BACKGROUND;
            if (uiMode == uiMode2 && this.triggerBody == null) {
                this.triggerBody = new byte[]{uiMode2.toCode()};
            }
        }

        public Builder body(byte[] bArr) {
            this.triggerBody = bArr;
            return this;
        }

        public DmNotificationRawData build() {
            assemble();
            return new DmNotificationRawData(this);
        }

        public Builder uiMode(UiMode uiMode) {
            this.uiMode = uiMode;
            this.triggerHeader[1] = convertToByte(uiMode);
            setVendorIfWifiBackground(uiMode);
            return this;
        }
    }

    public DmNotificationRawData(Builder builder) {
        this.rawData = builder.rawData;
    }

    public byte[] generate() {
        return this.rawData;
    }
}
