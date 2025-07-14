package com.samsung.android.knox.restriction;

import android.os.Bundle;

/* loaded from: classes.dex */
public class PhoneRestrictionPolicy {
    public static final String ACTION_RCS_MSG_FILE_RECEIVED = "com.samsung.android.knox.intent.action.RCS_MSG_FILE_RECEIVED";
    public static final String ACTION_RCS_MSG_FILE_SENT = "com.samsung.android.knox.intent.action.RCS_MSG_FILE_SENT";
    public static final String ACTION_RCS_MSG_FILE_THUMBNAIL_RECEIVED = "com.samsung.android.knox.intent.action.RCS_MSG_FILE_THUMBNAIL_RECEIVED";
    public static final String ACTION_RCS_MSG_TEXT_RECEIVED = "com.samsung.android.knox.intent.action.RCS_MSG_TEXT_RECEIVED";
    public static final String ACTION_RCS_MSG_TEXT_SENT = "com.samsung.android.knox.intent.action.RCS_MSG_TEXT_SENT";
    public static final String BODY = "body";
    public static final String CONTENT_TYPE = "content-type";
    public static final int ERROR_INVALID_INPUT = -1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_SUPPORTED = -3;
    public static final int ERROR_SIM_NOT_INSERTED = 13;
    public static final int ERROR_SIM_PIN_ALREADY_LOCKED = 4;
    public static final int ERROR_SIM_PIN_ALREADY_LOCKED_BY_ADMIN = 11;
    public static final int ERROR_SIM_PIN_ALREADY_UNLOCKED = 5;
    public static final int ERROR_SIM_PIN_BLOCKED_BY_PUK = 6;
    public static final int ERROR_SIM_PIN_DATABASE = 10;
    public static final int ERROR_SIM_PIN_FAILED = 1;
    public static final int ERROR_SIM_PIN_ID_NOT_READY = 9;
    public static final int ERROR_SIM_PIN_INCORRECT_CODE = 3;
    public static final int ERROR_SIM_PIN_INVALID_CODE = 2;
    public static final int ERROR_SIM_PIN_MAX_RETRIES_EXCEEDED = 8;
    public static final int ERROR_SIM_PIN_NONE = 0;
    public static final int ERROR_SIM_PIN_OWNED_BY_OTHER_ADMIN = 12;
    public static final int ERROR_SIM_PIN_UNKNOWN = 100;
    public static final int ERROR_UNKNOWN = -2;
    public static final String EXTRA_MSG_ID = "id";
    public static final String FILE_PATH = "file-path";
    public static final int LIMIT_NUMBER_OF_CALLS_BY_DAY = 0;
    public static final int LIMIT_NUMBER_OF_CALLS_BY_MONTH = 2;
    public static final int LIMIT_NUMBER_OF_CALLS_BY_WEEK = 1;
    public static final int LIMIT_NUMBER_OF_DATA_CALLS_BY_DAY = 0;
    public static final int LIMIT_NUMBER_OF_DATA_CALLS_BY_MONTH = 2;
    public static final int LIMIT_NUMBER_OF_DATA_CALLS_BY_WEEK = 1;
    public static final int LIMIT_NUMBER_OF_SMS_BY_DAY = 0;
    public static final int LIMIT_NUMBER_OF_SMS_BY_MONTH = 2;
    public static final int LIMIT_NUMBER_OF_SMS_BY_WEEK = 1;
    public static final int RCS_FEATURE_ALL = 1;
    public static final String REMOTE_URI = "remote-uri";
    public static final String SENDER_ALIAS = "sender-alias";
    public static final String THUMBNAIL_PATH = "thumbnail-path";
    public static final String TIMESTAMP = "timestamp";

    public PhoneRestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean addIncomingCallExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addIncomingCallRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addIncomingSmsExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addIncomingSmsRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addOutgoingCallExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addOutgoingCallRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addOutgoingSmsExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addOutgoingSmsRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowCallerIDDisplay(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowCopyContactToSim(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowIncomingMms(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowIncomingSms(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowOutgoingMms(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowOutgoingSms(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowWapPush(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean blockMmsWithStorage(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean blockSmsWithStorage(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean canIncomingCall(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean canIncomingSms(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean canOutgoingCall(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean canOutgoingSms(String str) {
        throw new RuntimeException("Stub!");
    }

    public int changeSimPinCode(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearStoredBlockedMms() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearStoredBlockedSms() {
        throw new RuntimeException("Stub!");
    }

    public int disableSimPinLock(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableLimitNumberOfCalls(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableLimitNumberOfSms(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int enableSimPinLock(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean getDataCallLimitEnabled() {
        throw new RuntimeException("Stub!");
    }

    public String getDisclaimerText() {
        throw new RuntimeException("Stub!");
    }

    public boolean getEmergencyCallOnly(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public String getIncomingCallExceptionPatterns() {
        throw new RuntimeException("Stub!");
    }

    public String getIncomingCallRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public String getIncomingSmsExceptionPatterns() {
        throw new RuntimeException("Stub!");
    }

    public String getIncomingSmsRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public long getLimitOfDataCalls(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getLimitOfIncomingCalls(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getLimitOfIncomingSms(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getLimitOfOutgoingCalls(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getLimitOfOutgoingSms(int i5) {
        throw new RuntimeException("Stub!");
    }

    public String getOutgoingCallExceptionPatterns() {
        throw new RuntimeException("Stub!");
    }

    public String getOutgoingCallRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public String getOutgoingSmsExceptionPatterns() {
        throw new RuntimeException("Stub!");
    }

    public String getOutgoingSmsRestriction(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public Bundle getRCSMessage(long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isBlockMmsWithStorageEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBlockSmsWithStorageEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCallerIDDisplayAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCopyContactToSimAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isIncomingMmsAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isIncomingSmsAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLimitNumberOfCallsEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLimitNumberOfSmsEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOutgoingMmsAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOutgoingSmsAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRCSEnabled(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWapPushAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeIncomingCallExceptionPattern() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeIncomingCallRestriction() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeIncomingSmsExceptionPattern() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeIncomingSmsRestriction() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeOutgoingCallExceptionPattern() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeOutgoingCallRestriction() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeOutgoingSmsExceptionPattern() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeOutgoingSmsRestriction() {
        throw new RuntimeException("Stub!");
    }

    public boolean resetCallsCount() {
        throw new RuntimeException("Stub!");
    }

    public boolean resetDataCallLimitCounter() {
        throw new RuntimeException("Stub!");
    }

    public boolean resetSmsCount() {
        throw new RuntimeException("Stub!");
    }

    public boolean setDataCallLimitEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDisclaimerText(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setEmergencyCallOnly(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setIncomingCallExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setIncomingCallRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setIncomingSmsExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setIncomingSmsRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLimitOfDataCalls(long j5, long j6, long j7) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLimitOfIncomingCalls(int i5, int i6, int i7) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLimitOfIncomingSms(int i5, int i6, int i7) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLimitOfOutgoingCalls(int i5, int i6, int i7) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLimitOfOutgoingSms(int i5, int i6, int i7) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutgoingCallExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutgoingCallRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutgoingSmsExceptionPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setOutgoingSmsRestriction(String str) {
        throw new RuntimeException("Stub!");
    }

    public int setRCSEnabled(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
