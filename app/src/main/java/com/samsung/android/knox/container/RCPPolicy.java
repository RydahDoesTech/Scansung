package com.samsung.android.knox.container;

import java.util.List;

/* loaded from: classes.dex */
public class RCPPolicy {
    public static final String CALENDAR = "Calendar";
    public static final String CONTACTS = "Contacts";
    public static final String EXPORT_DATA = "knox-export-data";
    public static final String IMPORT_DATA = "knox-import-data";
    public static final String NOTIFICATIONS = "Notifications";
    public static final String SANITIZE_DATA = "knox-sanitize-data";

    public RCPPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean allowMoveAppsToContainer(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowMoveFilesToContainer(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowMoveFilesToOwner(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowShareClipboardDataToOwner(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAllowChangeDataSyncPolicy(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getListFromAllowChangeDataSyncPolicy(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMoveAppsToContainerAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMoveFilesToContainerAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMoveFilesToOwnerAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isShareClipboardDataToOwnerAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAllowChangeDataSyncPolicy(List<String> list, String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
