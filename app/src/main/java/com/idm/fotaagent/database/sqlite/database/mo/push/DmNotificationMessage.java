package com.idm.fotaagent.database.sqlite.database.mo.push;

import A3.f;
import android.util.Base64;
import com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.Initiator;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.TypeLengthValueField;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UiMode;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.idm.fotaagent.utils.EnablerUtils;
import com.idm.providers.mo.IDMMoInterface;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.custom.CustomDeviceManager;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public class DmNotificationMessage {
    private static final short DIGEST_BYTES = 16;
    private final Trigger trigger;

    public static class Trigger {
        private final Body body;
        private final Header header;

        public static class Body {
            private final Map<Class<? extends TypeLengthValueField>, TypeLengthValueField> tlvElements;
            private final UiMode uiMode;

            /* JADX WARN: Enum visitor error
            jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INSTALL_TYPE' uses external variables
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
            public static final class TypeLengthValueDecoder {
                private static final /* synthetic */ TypeLengthValueDecoder[] $VALUES = $values();
                public static final TypeLengthValueDecoder DOWNLOAD_TYPE;
                public static final TypeLengthValueDecoder INSTALL_TYPE;
                public static final TypeLengthValueDecoder POSTPONE;
                public static final TypeLengthValueDecoder SERVICE_TYPE;
                public static final TypeLengthValueDecoder UPDATE_TYPE;
                private final Decoder decoder;
                private final byte type;

                public interface Decoder {
                    TypeLengthValueField decode(byte[] bArr);
                }

                private static /* synthetic */ TypeLengthValueDecoder[] $values() {
                    return new TypeLengthValueDecoder[]{INSTALL_TYPE, POSTPONE, UPDATE_TYPE, SERVICE_TYPE, DOWNLOAD_TYPE};
                }

                static {
                    final int i5 = 0;
                    INSTALL_TYPE = new TypeLengthValueDecoder("INSTALL_TYPE", 0, (byte) 1, new Decoder() { // from class: com.idm.fotaagent.database.sqlite.database.mo.push.a
                        @Override // com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.Decoder
                        public final TypeLengthValueField decode(byte[] bArr) {
                            switch (i5) {
                                case 0:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$0(bArr);
                                case 1:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$1(bArr);
                                case 2:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$2(bArr);
                                case 3:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$3(bArr);
                                default:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$4(bArr);
                            }
                        }
                    });
                    final int i6 = 1;
                    POSTPONE = new TypeLengthValueDecoder("POSTPONE", 1, (byte) 2, new Decoder() { // from class: com.idm.fotaagent.database.sqlite.database.mo.push.a
                        @Override // com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.Decoder
                        public final TypeLengthValueField decode(byte[] bArr) {
                            switch (i6) {
                                case 0:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$0(bArr);
                                case 1:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$1(bArr);
                                case 2:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$2(bArr);
                                case 3:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$3(bArr);
                                default:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$4(bArr);
                            }
                        }
                    });
                    final int i7 = 2;
                    UPDATE_TYPE = new TypeLengthValueDecoder("UPDATE_TYPE", 2, (byte) 3, new Decoder() { // from class: com.idm.fotaagent.database.sqlite.database.mo.push.a
                        @Override // com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.Decoder
                        public final TypeLengthValueField decode(byte[] bArr) {
                            switch (i7) {
                                case 0:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$0(bArr);
                                case 1:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$1(bArr);
                                case 2:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$2(bArr);
                                case 3:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$3(bArr);
                                default:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$4(bArr);
                            }
                        }
                    });
                    final int i8 = 3;
                    SERVICE_TYPE = new TypeLengthValueDecoder("SERVICE_TYPE", 3, (byte) 4, new Decoder() { // from class: com.idm.fotaagent.database.sqlite.database.mo.push.a
                        @Override // com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.Decoder
                        public final TypeLengthValueField decode(byte[] bArr) {
                            switch (i8) {
                                case 0:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$0(bArr);
                                case 1:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$1(bArr);
                                case 2:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$2(bArr);
                                case 3:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$3(bArr);
                                default:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$4(bArr);
                            }
                        }
                    });
                    final int i9 = 4;
                    DOWNLOAD_TYPE = new TypeLengthValueDecoder("DOWNLOAD_TYPE", 4, (byte) 5, new Decoder() { // from class: com.idm.fotaagent.database.sqlite.database.mo.push.a
                        @Override // com.idm.fotaagent.database.sqlite.database.mo.push.DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.Decoder
                        public final TypeLengthValueField decode(byte[] bArr) {
                            switch (i9) {
                                case 0:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$0(bArr);
                                case 1:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$1(bArr);
                                case 2:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$2(bArr);
                                case 3:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$3(bArr);
                                default:
                                    return DmNotificationMessage.Trigger.Body.TypeLengthValueDecoder.lambda$static$4(bArr);
                            }
                        }
                    });
                }

                private TypeLengthValueDecoder(String str, int i5, byte b2, Decoder decoder) {
                    this.type = b2;
                    this.decoder = decoder;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ TypeLengthValueField lambda$static$0(byte[] bArr) {
                    return InstallType.of(bArr[0]);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ TypeLengthValueField lambda$static$1(byte[] bArr) {
                    return InstallPostponeType.of(bArr[0]);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ TypeLengthValueField lambda$static$2(byte[] bArr) {
                    return UpdateType.of(bArr[0]);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ TypeLengthValueField lambda$static$3(byte[] bArr) {
                    return ServiceType.of(bArr[0]);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ TypeLengthValueField lambda$static$4(byte[] bArr) {
                    return DownloadType.of(bArr[0]);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static TypeLengthValueDecoder of(byte b2) {
                    for (TypeLengthValueDecoder typeLengthValueDecoder : values()) {
                        if (typeLengthValueDecoder.type == b2) {
                            return typeLengthValueDecoder;
                        }
                    }
                    throw new IllegalArgumentException(f.l(b2, "type: "));
                }

                public static TypeLengthValueDecoder valueOf(String str) {
                    return (TypeLengthValueDecoder) Enum.valueOf(TypeLengthValueDecoder.class, str);
                }

                public static TypeLengthValueDecoder[] values() {
                    return (TypeLengthValueDecoder[]) $VALUES.clone();
                }

                public TypeLengthValueField decode(byte[] bArr) {
                    return this.decoder.decode(bArr);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public <T extends TypeLengthValueField> T get(Class<T> cls) {
                return cls.cast(this.tlvElements.get(cls));
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Body(byte[] bArr, int i5) {
                RuntimeException e5;
                int i6;
                this.tlvElements = new HashMap();
                if (i5 >= bArr.length) {
                    this.uiMode = UiMode.NOT_SPECIFIED;
                    return;
                }
                this.uiMode = UiMode.of(bArr[i5]);
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 + 2 < bArr.length) {
                    int i9 = i7 + 1;
                    try {
                        byte b2 = bArr[i7];
                        i6 = i7 + 2;
                        try {
                            i8 = bArr[i9] & CustomDeviceManager.CALL_SCREEN_ALL;
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(bArr, i6, bArr2, 0, i8);
                            TypeLengthValueField typeLengthValueFieldDecode = TypeLengthValueDecoder.of(b2).decode(bArr2);
                            this.tlvElements.put(typeLengthValueFieldDecode.getClass(), typeLengthValueFieldDecode);
                        } catch (RuntimeException e6) {
                            e5 = e6;
                            Log.printStackTrace(e5);
                            i7 = i6 + i8;
                        }
                    } catch (RuntimeException e7) {
                        e5 = e7;
                        i6 = i9;
                    }
                    i7 = i6 + i8;
                }
            }
        }

        public static class Header {
            private final Initiator initiator;
            private final int offset;
            private final byte[] rawData;
            private final String serverId;
            private final int serverIdLen;
            private final String sessionId;
            private final UiMode uiMode;
            private final String version;

            private static int setFrom(int i5) {
                if (i5 < 0 || i5 > 7) {
                    throw new IllegalArgumentException(f.l(i5, "beginIndex: "));
                }
                int i6 = 1;
                while (true) {
                    i5++;
                    if (i5 >= 8) {
                        return i6;
                    }
                    i6 |= i6 << 1;
                }
            }

            private static int setTo(int i5) {
                if (i5 < 1 || i5 > 8) {
                    throw new IllegalArgumentException(f.l(i5, "endIndex: "));
                }
                int i6 = 128;
                while (true) {
                    i5--;
                    if (i5 <= 0) {
                        return i6;
                    }
                    i6 |= i6 >> 1;
                }
            }

            private int value(int i5, int i6) {
                if (i6 - i5 > 31 || i5 >= i6) {
                    throw new IllegalArgumentException("beginBitIndex: " + i5 + ", endBitIndex: " + i6);
                }
                int i7 = i5 / 8;
                int i8 = i5 % 8;
                int i9 = i6 / 8;
                int i10 = i6 % 8;
                if (i7 == i9) {
                    return ((this.rawData[this.offset + i7] & setFrom(i8)) & setTo(i10)) >> (8 - i10);
                }
                int from = setFrom(i8) & this.rawData[this.offset + i7];
                while (true) {
                    i7++;
                    if (i7 >= i9) {
                        break;
                    }
                    from = (from << 8) | (this.rawData[this.offset + i7] & 255);
                }
                if (i10 == 0) {
                    return from;
                }
                return ((this.rawData[this.offset + i9] & setTo(i10)) >> (8 - i10)) | (from << i10);
            }

            private Header(byte[] bArr, int i5) {
                this.rawData = bArr;
                this.offset = i5;
                int iValue = value(0, 10);
                String str = (iValue / 10) + IDMMoInterface.IDM_MO_ROOT_PATH + (iValue % 10);
                this.version = str;
                UiMode uiModeOf = UiMode.of((byte) value(10, 12));
                this.uiMode = uiModeOf;
                Initiator initiatorOf = Initiator.of((byte) value(12, 13));
                this.initiator = initiatorOf;
                String hexString = Integer.toHexString(value(40, 56));
                this.sessionId = hexString;
                int iValue2 = value(56, 64);
                this.serverIdLen = iValue2;
                String str2 = new String(bArr, i5 + 8, iValue2, StandardCharsets.US_ASCII);
                this.serverId = str2;
                Log.H("version: " + str + ", uiMode: " + uiModeOf + ", initiator: " + initiatorOf + ", sessionId: " + hexString + ", serverIdLen: " + iValue2 + ", serverId: " + str2);
            }
        }

        private Trigger(byte[] bArr, int i5) {
            Header header = new Header(bArr, i5);
            this.header = header;
            this.body = new Body(bArr, i5 + 8 + header.serverIdLen);
        }
    }

    private DmNotificationMessage(byte[] bArr) {
        Log.H("rawData: " + EnablerUtils.toHexString(bArr));
        int i5 = 16;
        if (bArr.length < 16) {
            throw new IllegalArgumentException("length: " + bArr.length);
        }
        try {
            this.trigger = new Trigger(bArr, i5);
        } catch (RuntimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static DmNotificationMessage decode(String str) {
        return new DmNotificationMessage(Base64.decode(str, 2));
    }

    public Optional<DownloadType> downloadType() {
        return Optional.ofNullable((DownloadType) this.trigger.body.get(DownloadType.class));
    }

    public Initiator initiator() {
        return this.trigger.header.initiator;
    }

    public Optional<InstallPostponeType> installPostponeType() {
        return Optional.ofNullable((InstallPostponeType) this.trigger.body.get(InstallPostponeType.class));
    }

    public Optional<InstallType> installType() {
        return Optional.ofNullable((InstallType) this.trigger.body.get(InstallType.class));
    }

    public String serverId() {
        return this.trigger.header.serverId;
    }

    public Optional<ServiceType> serviceType() {
        return Optional.ofNullable((ServiceType) this.trigger.body.get(ServiceType.class));
    }

    public String sessionId() {
        return this.trigger.header.sessionId;
    }

    public UiMode uiMode() {
        return this.trigger.body.uiMode == UiMode.WIFI_BACKGROUND ? this.trigger.body.uiMode : this.trigger.header.uiMode;
    }

    public Optional<UpdateType> updateType() {
        return Optional.ofNullable((UpdateType) this.trigger.body.get(UpdateType.class));
    }

    public String version() {
        return this.trigger.header.version;
    }

    public static DmNotificationMessage decode(byte[] bArr) {
        return new DmNotificationMessage(bArr);
    }
}
