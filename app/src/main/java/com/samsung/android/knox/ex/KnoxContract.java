package com.samsung.android.knox.ex;

/* loaded from: classes.dex */
public final class KnoxContract {
    public static final String AUTHORITY = "com.samsung.android.knox.sdk";
    public static final String AUTHORITY_URI_STRING = "content://com.samsung.android.knox.sdk";
    public static final String KEY = "key";

    public static class Config {
        public static final String LICENSE_PERMISSION = "com.samsung.android.knox.permission.KNOX_NDA_DEVICE_SETTINGS";
        public static final String PATH = "config";
        public static final String RUNTIME_PERMISSION = "com.samsung.android.knox.permission.KNOX_NDA_DEVICE_SETTINGS_RT";

        public static class Application {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/application";
            public static final String ID = "application";
            public static final String KEY_DEFAULT_APPS = "default-apps";
            public static final String KEY_PACKAGE_BATTERY_OPTIMIZATION_ALLOW_LIST = "package-battery-optimization-allow-list";
            public static final String KEY_USB_DEVICES_FOR_DEFAULT_ACCESS = "usb-devices-for-default-access";
            public static final String PARAM_PACKAGE_BATTERY_OPTIMIZATION_ALLOW_LIST = "package-battery-optimization-allow-list";
            public static final String PARAM_PACKAGE_NAME = "package-name";
            public static final String PARAM_PRODUCT_ID = "product-id";
            public static final int PARAM_PRODUCT_ID_COLUMN_INDEX = 1;
            public static final String PARAM_ROLE_NAME = "role-name";
            public static final String PARAM_VENDOR_ID = "vendor-id";
            public static final int PARAM_VENDOR_ID_COLUMN_INDEX = 0;

            public Application() {
                throw new RuntimeException("Stub!");
            }
        }

        public static class DateTime {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/date-time";
            public static final String ID = "date-time";
            public static final String KEY_AUTOMATIC_TIME = "automatic-time";
            public static final String KEY_DATETIME = "date-time";
            public static final String KEY_TIME_FORMAT = "time-format";
            public static final String PARAM_AUTOMATIC_TIME = "automatic-time";
            public static final String PARAM_DAY = "day";
            public static final String PARAM_HOUR = "hour";
            public static final String PARAM_MINUTE = "minute";
            public static final String PARAM_MONTH = "month";
            public static final String PARAM_SECOND = "second";
            public static final String PARAM_TIME_FORMAT = "time-format";
            public static final String PARAM_YEAR = "year";

            public DateTime() {
                throw new RuntimeException("Stub!");
            }
        }

        public static class Device {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/device";
            public static final String ID = "device";
            public static final String KEY_AUDIO_VOLUME = "audio-volume";
            public static final String KEY_AUTO_ROTATION_STATE = "auto-rotation-state";
            public static final String KEY_FORCE_AUTO_STARTUP = "force-auto-start-up-state";
            public static final String KEY_SCREEN_TIMEOUT = "screen-timeout";
            public static final String PARAM_AUDIO_STREAM = "audio-stream";
            public static final String PARAM_AUDIO_STREAM_ALARM = "4";
            public static final String PARAM_AUDIO_STREAM_MEDIA_PLAYBACK = "3";
            public static final String PARAM_AUDIO_STREAM_NOTIFICATIONS = "5";
            public static final String PARAM_AUDIO_STREAM_RINGER = "2";
            public static final String PARAM_AUDIO_STREAM_SYSTEM_SOUNDS = "1";
            public static final String PARAM_AUDIO_STREAM_VOICE_CALL = "0";
            public static final String PARAM_AUDIO_VOLUME = "audio-volume";
            public static final String PARAM_AUTO_ROTATION_STATE = "auto-rotation-state";
            public static final String PARAM_FORCE_AUTO_STARTUP = "force-auto-start-up-state";
            public static final String PARAM_SCREEN_TIMEOUT = "screen-timeout";

            public Device() {
                throw new RuntimeException("Stub!");
            }
        }

        public static class Font {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/font";
            public static final String ID = "font";
            public static final String KEY_SYSTEM_ACTIVE_FONT_SIZE = "system-active-font-size";
            public static final String KEY_SYSTEM_FONT_SIZES = "system-font-sizes";
            public static final String PARAM_SYSTEM_ACTIVE_FONT_SIZE = "system-active-font-size";

            public Font() {
                throw new RuntimeException("Stub!");
            }
        }

        public static class NFC {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/nfc";
            public static final String ID = "nfc";
            public static final String KEY_NFC = "nfc";
            public static final String PARAM_NFC = "nfc";

            public NFC() {
                throw new RuntimeException("Stub!");
            }
        }

        public static class Settings {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/settings";
            public static final String ID = "settings";
            public static final String KEY_BRIGHTNESS = "brightness";
            public static final String KEY_HWKEY = "hardware-key";
            public static final String KEY_INPUT_METHOD = "input-method";
            public static final String KEY_NAVIBAR_BUTTON_ORDER = "button-order";
            public static final String KEY_POWER_SAVING_MODE = "power-saving-mode";
            public static final String KEY_SYSTEM_LOCALE = "system-locale";
            public static final String KEY_TOUCH_SENSITIVITY = "touch-sensitivity";
            public static final String KEY_WIFI_STATE = "wifi-state";
            public static final String PARAM_BRIGHTNESS = "brightness";
            public static final String PARAM_HWKEY_ACTION = "action";
            public static final String PARAM_HWKEY_ACTION_ACTIVITY = "activity";
            public static final String PARAM_HWKEY_ACTION_BROADCAST = "broadcast";
            public static final String PARAM_HWKEY_ACTION_COMPONENTNAME = "component-name";
            public static final String PARAM_HWKEY_ACTION_INTENT = "intent";
            public static final String PARAM_HWKEY_ACTIVITY_EVENT = "event";
            public static final String PARAM_HWKEY_ACTIVITY_EVENT_DOUBLE_PRESS = "double-press";
            public static final String PARAM_HWKEY_ACTIVITY_EVENT_LONG_PRESS = "long-press";
            public static final String PARAM_HWKEY_ACTIVITY_EVENT_SHORT_PRESS = "press";
            public static final String PARAM_HWKEY_BROADCAST_DEFAULT_INTENT_ACTION = "com.samsung.android.knox.intent.action.HARD_KEY_REPORT";
            public static final String PARAM_HWKEY_BROADCAST_DEVICE_WIDE = "device-wide";
            public static final String PARAM_HWKEY_BROADCAST_DISPATCH = "dispatch";
            public static final int PARAM_HWKEY_BROADCAST_INTENT_EXTRA_KEY_ACTION_DOWN = 1;
            public static final int PARAM_HWKEY_BROADCAST_INTENT_EXTRA_KEY_ACTION_UP = 2;
            public static final String PARAM_HWKEY_BROADCAST_INTENT_EXTRA_KEY_CODE = "com.samsung.android.knox.intent.extra.KEY_CODE";
            public static final String PARAM_HWKEY_BROADCAST_INTENT_EXTRA_REPORT_TYPE_NEW = "com.samsung.android.knox.intent.extra.KEY_REPORT_TYPE_NEW";
            public static final String PARAM_HWKEY_BROADCAST_TARGET_PACKAGE = "target-package";
            public static final String PARAM_HWKEY_CODE = "key-code";
            public static final String PARAM_HWKEY_GRAY_OUT = "gray-out";
            public static final String PARAM_INPUT_METHOD = "input-method";
            public static final String PARAM_INPUT_METHOD_FORCE = "force";
            public static final String PARAM_LOCALE_COUNTRY = "locale-country";
            public static final String PARAM_LOCALE_LANGUAGE = "locale-language";
            public static final String PARAM_NAVIBAR_BUTTON_ORDER = "button-order";
            public static final String PARAM_PASSWORD = "password";
            public static final String PARAM_POWER_SAVING_MODE = "power-saving-mode";
            public static final String PARAM_SSID = "ssid";
            public static final String PARAM_STATE = "state";
            public static final String PARAM_USERNAME = "username";
            public static final int PARAM_USE_AUTO = -1;

            public Settings() {
                throw new RuntimeException("Stub!");
            }
        }

        public static class Wifi {
            public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/config/wifi";
            public static final String ID = "wifi";
            public static final String KEY_WIFI_SSIDS_BLOCK_LIST = "wifi-ssid-block-list";
            public static final String PARAM_WIFI_SSIDS_BLOCK_LIST = "wifi-ssid-block-list";

            public Wifi() {
                throw new RuntimeException("Stub!");
            }
        }

        public Config() {
            throw new RuntimeException("Stub!");
        }
    }

    public static class License {
        public static final String CONTENT_URI_STRING = "content://com.samsung.android.knox.sdk/license";
        public static final String LICENSE_PERMISSION = null;
        public static final String PATH = "license";
        public static final String RUNTIME_PERMISSION = null;

        public License() {
            throw new RuntimeException("Stub!");
        }
    }

    public KnoxContract() {
        throw new RuntimeException("Stub!");
    }
}
