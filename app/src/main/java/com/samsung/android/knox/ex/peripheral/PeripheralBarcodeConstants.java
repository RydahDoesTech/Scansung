package com.samsung.android.knox.ex.peripheral;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class PeripheralBarcodeConstants {

    public static class Option {
        public static final String CODABAR_CHECK_DIGIT_VERIFY_NO_TRANSMIT = "CODABAR_CHECK_DIGIT_VERIFY_NO_TRANSMIT";
        public static final String CODABAR_CHECK_DIGIT_VERIFY_TRANSMIT = "CODABAR_CHECK_DIGIT_VERIFY_TRANSMIT";
        public static final String CODABAR_CONCATENATION_ON = "CODABAR_CONCATENATION_ON";
        public static final String CODABAR_CONCATENATION_REQUIRE = "CODABAR_CONCATENATION_REQUIRE";
        public static final String CODABAR_NO_START_STOP_CHARS = "CODABAR_NO_START_STOP_CHARS";
        public static final String CODABAR_TRANSMIT_START_STOP = "CODABAR_TRANSMIT_START_STOP";
        public static final String CODE11_CHECK_DIGIT = "CODE11_CHECK_DIGIT";
        public static final String CODE128_ISBT_CONCATENATION_ON = "CODE128_ISBT_CONCATENATION_ON";
        public static final String CODE39_APPEND_ON = "CODE39_APPEND_ON";
        public static final String CODE39_CHECK_DIGIT_VERIFY_NO_TRANSMIT = "CODE39_CHECK_DIGIT_VERIFY_NO_TRANSMIT";
        public static final String CODE39_CHECK_DIGIT_VERIFY_TRANSMIT = "CODE39_CHECK_DIGIT_VERIFY_TRANSMIT";
        public static final String CODE39_FULL_ASCII_ON = "CODE39_FULL_ASCII_ON";
        public static final String CODE39_RETURN_CHECK_DIGIT = "CODE39_RETURN_CHECK_DIGIT";
        public static final String CODE39_TRANSMIT_START_STOP = "CODE39_TRANSMIT_START_STOP";
        public static final String CODE39_VERIFY_CHECK_DIGIT = "CODE39_VERIFY_CHECK_DIGIT";
        public static final String EAN13_2DIGIT_ADDENDA_ON = "EAN13_2DIGIT_ADDENDA_ON";
        public static final String EAN13_5DIGIT_ADDENDA_ON = "EAN13_5DIGIT_ADDENDA_ON";
        public static final String EAN13_ADDENDA_REQUIRED = "EAN13_ADDENDA_REQUIRED";
        public static final String EAN13_ADDENDA_SEPARATOR_ON = "EAN13_ADDENDA_SEPARATOR_ON";
        public static final String EAN13_CHECK_DIGIT_VERIFY = "EAN13_CHECK_DIGIT_VERIFY";
        public static final String EAN13_ISBN_TRANSLATOR_ON = "EAN13_ISBN_TRANSLATOR_ON";
        public static final String EAN13_RETURN_CHECK_DIGIT = "EAN13_RETURN_CHECK_DIGIT";
        public static final String EAN8_2DIGIT_ADDENDA_ON = "EAN8_2DIGIT_ADDENDA_ON";
        public static final String EAN8_5DIGIT_ADDENDA_ON = "EAN8_5DIGIT_ADDENDA_ON";
        public static final String EAN8_ADDENDA_REQUIRED = "EAN8_ADDENDA_REQUIRED";
        public static final String EAN8_ADDENDA_SEPARATOR_ON = "EAN8_ADDENDA_SEPARATOR_ON";
        public static final String EAN8_AS_EAN13 = "EAN8_AS_EAN13";
        public static final String EAN8_RETURN_CHECK_DIGIT = "EAN8_RETURN_CHECK_DIGIT";
        public static final String EAN8_VERIFY_CHECK_DIGIT = "EAN8_VERIFY_CHECK_DIGIT";
        public static final String HIGH_FILTER_MODE = "HIGH_FILTER_MODE";
        public static final String I2OF5_CHECK_DIGIT_VERIFY_NO_TRANSMIT = "I2OF5_CHECK_DIGIT_VERIFY_NO_TRANSMIT";
        public static final String I2OF5_CHECK_DIGIT_VERIFY_TRANSMIT = "I2OF5_CHECK_DIGIT_VERIFY_TRANSMIT";
        public static final String I2OF5_RETURN_CHECK_DIGIT = "I2OF5_RETURN_CHECK_DIGIT";
        public static final String I2OF5_VERIFY_CHECK_DIGIT = "I2OF5_VERIFY_CHECK_DIGIT";
        public static final String MSI_128_EMULATION = "MSI_128_EMULATION";
        public static final String MSI_RSS_EMULATION = "MSI_RSS_EMULATION";
        public static final String MSI_VERIFY_CHECK_CHARACTER_TRANSMIT = "MSI_VERIFY_CHECK_CHARACTER_TRANSMIT";
        public static final String MSI_VERSION_ON = "MSI_VERSION_ON";
        public static final String PLANETCODE_CHECK_DIGIT_TRANSMIT = "PLANETCODE_CHECK_DIGIT_TRANSMIT";
        public static final String POSI_CODE_AB_LIMITED_A_ON = "POSI_CODE_AB_LIMITED_A_ON";
        public static final String POSI_CODE_AB_LIMITED_B_ON = "POSI_CODE_AB_LIMITED_B_ON";
        public static final String POSTNET_CHECK_DIGIT_TRANSMIT = "POSTNET_CHECK_DIGIT_TRANSMIT";
        public static final String RETURN_CHECK_DIGIT = "RETURN_CHECK_DIGIT";
        public static final String REVERSE_DIRECTION = "REVERSE_DIRECTION";
        public static final String TELEPEN_AIM_OUTPUT_AIM = "TELEPEN_AIM_OUTPUT_AIM";
        public static final String UPCA_2DIGIT_ADDENDA_ON = "UPCA_2DIGIT_ADDENDA_ON";
        public static final String UPCA_5DIGIT_ADDENDA_ON = "UPCA_5DIGIT_ADDENDA_ON";
        public static final String UPCA_ADDENDA_REQUIRED = "UPCA_ADDENDA_REQUIRED";
        public static final String UPCA_ADDENDA_SEPARATOR_ON = "UPCA_ADDENDA_SEPARATOR_ON";
        public static final String UPCA_AS_EAN13 = "UPCA_AS_EAN13";
        public static final String UPCA_CHECK_DIGIT_VERIFY = "UPCA_CHECK_DIGIT_VERIFY";
        public static final String UPCA_EXTENDED_COUPON_CODE_ON = "UPCA_EXTENDED_COUPON_CODE_ON";
        public static final String UPCA_NUMBER_SYSTEM_ON = "UPCA_NUMBER_SYSTEM_ON";
        public static final String UPCA_RETURN_CHECK_DIGIT = "UPCA_RETURN_CHECK_DIGIT";
        public static final String UPCE_2DIGIT_ADDENDA_ON = "UPCE_2DIGIT_ADDENDA_ON";
        public static final String UPCE_5DIGIT_ADDENDA_ON = "UPCE_5DIGIT_ADDENDA_ON";
        public static final String UPCE_ADDENDA_REQUIRED = "UPCE_ADDENDA_REQUIRED";
        public static final String UPCE_ADDENDA_SEPARATOR_ON = "UPCE_ADDENDA_SEPARATOR_ON";
        public static final String UPCE_AS_EAN13 = "UPCE_AS_EAN13";
        public static final String UPCE_AS_UPCA = "UPCE_AS_UPCA";
        public static final String UPCE_CHECK_DIGIT_ON = "UPCE_CHECK_DIGIT_ON";
        public static final String UPCE_EXPAND_ON = "UPCE_EXPAND_ON";
        public static final String UPCE_NUMBER_SYSTEM_ON = "UPCE_NUMBER_SYSTEM_ON";
        public static final String UPCE_RETURN_CHECK_DIGIT = "UPCE_RETURN_CHECK_DIGIT";
        public static final String VERIFY_CHECK_DIGIT = "VERIFY_CHECK_DIGIT";
        public static final String WIDE_SCAN_ANGLE = "WIDE_SCAN_ANGLE";

        public Option() {
            throw new RuntimeException("Stub!");
        }
    }

    public static class Symbology {
        public static final String AUSTRALIAN_POST = "AUSTRALIAN_POST";
        public static final String AZTEC_CODE = "AZTEC_CODE";
        public static final String AZTEC_RUNES = "AZTEC_RUNES";
        public static final String BOOKLANDEAN = "BOOKLANDEAN";
        public static final String BRITISH_POST = "BRITISH_POST";
        public static final String CANADIAN_POST = "CANADIAN_POST";
        public static final String CHINA_POST = "CHINA_POST";
        public static final String CODABAR = "CODABAR";
        public static final String CODABLOCK_F = "CODABLOCK_F";
        public static final String CODE11 = "CODE11";
        public static final String CODE128 = "CODE128";
        public static final String CODE16K = "CODE16K";
        public static final String CODE32 = "CODE32";
        public static final String CODE35 = "CODE35";
        public static final String CODE39 = "CODE39";
        public static final String CODE49 = "CODE49";
        public static final String CODE93 = "CODE93";
        public static final String DATA_MATRIX = "DATA_MATRIX";
        public static final String DRIVER_LICENSE = "DRIVER_LICENSE";
        public static final String EAN13 = "EAN13";
        public static final String EAN13WADDON = "EAN13WADDON";
        public static final String EAN8 = "EAN8";
        public static final String EAN8WADDON = "EAN8WADDON";
        public static final String GS1128 = "GS1128";
        public static final String GS1_COMPOSIT = "GS1_COMPOSIT";
        public static final String GS1_DATABAR = "GS1_DATABAR";
        public static final String GS1_DATA_MATRIX = "GS1_DATA_MATRIX";
        public static final String GS1_EXPANDED = "GS1_EXPANDED";
        public static final String GS1_LIMITED = "GS1_LIMITED";
        public static final String GS1_OMNI = "GS1_OMNI";
        public static final String HANXIN = "HANXIN";
        public static final String I2OF5 = "I2OF5";
        public static final String ITF14 = "ITF14";
        public static final String JAPANESE_POST = "JAPANESE_POST";
        public static final String KIX_POST = "KIX_POST";
        public static final String KOREA_POST = "KOREA_POST";
        public static final String MATRIX2OF5 = "MATRIX2OF5";
        public static final String MAXICODE = "MAXICODE";
        public static final String MICROPDF417 = "MICROPDF417";
        public static final String MRZ = "MRZ";
        public static final String MSI = "MSI";
        public static final String NO_READ = "NO_READ";
        public static final String OCR = "OCR";
        public static final String OCR_A = "OCR_A";
        public static final String OCR_B = "OCR_B";
        public static final String OCR_MICR_E13B = "OCR_MICR_E13B";
        public static final String OCR_OFF = "OCR_OFF";
        public static final String OCR_SEMI_FONT = "OCR_SEMI_FONT";
        public static final String OCR_US_CURRENCY = "OCR_US_CURRENCY";
        public static final String PDF417 = "PDF417";
        public static final String PLANET_CODE = "PLANET_CODE";
        public static final String PLESSEY_CODE = "PLESSEY_CODE";
        public static final String POSICODE = "POSICODE";
        public static final String POSTNET = "POSTNET";
        public static final String QR_CODE = "QR_CODE";
        public static final String S2OF5IATA = "S2OF5IATA";
        public static final String S2OF5IND = "S2OF5IND";
        public static final String SOCIAL = "SOCIAL";
        public static final String TELEPEN = "TELEPEN";
        public static final String TLC39 = "TLC39";
        public static final String TRIOPTIC = "TRIOPTIC";
        public static final String UNDEFINED = "UNDEFINED";
        public static final String UPCA = "UPCA";
        public static final String UPCAWADDON = "UPCAWADDON";
        public static final String UPCE = "UPCE";
        public static final String UPCE0 = "UPCE0";
        public static final String UPCE1 = "UPCE1";
        public static final String UPCEWADDON = "UPCEWADDON";
        public static final String VERICODE = "VERICODE";

        public static class Type {
            public static final String TYPE_1D = "1D";
            public static final String TYPE_2D = "2D";
            public static final String TYPE_NONE = "NONE";

            public Type() {
                throw new RuntimeException("Stub!");
            }
        }

        public Symbology() {
            throw new RuntimeException("Stub!");
        }

        public static boolean contains(String str) {
            throw new RuntimeException("Stub!");
        }

        public static String getType(String str) {
            throw new RuntimeException("Stub!");
        }

        public static ArrayList<String> values() {
            throw new RuntimeException("Stub!");
        }
    }

    public PeripheralBarcodeConstants() {
        throw new RuntimeException("Stub!");
    }
}
