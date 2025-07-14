package com.samsung.android.lib.episode;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SourceInfo {
    private String mDTDVersion;
    private String mDeviceType;
    private int mManufacturer;
    private int mOSVersion;
    private String mOneUIVersion;
    private ArrayList<String> mPackageList;
    private int mRequestFrom;
    private boolean mRestoreViaFastTrack;
    private String mVersion;

    public SourceInfo() {
        this.mDeviceType = null;
        this.mVersion = null;
        this.mDTDVersion = null;
        this.mRestoreViaFastTrack = false;
        this.mRequestFrom = -1;
        this.mPackageList = null;
        this.mManufacturer = -1;
    }

    public String getDTDVersion() {
        return this.mDTDVersion;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public int getManufacturer() {
        return this.mManufacturer;
    }

    public int getOSVersion() {
        return this.mOSVersion;
    }

    public String getOneUIVersion() {
        return this.mOneUIVersion;
    }

    public String getPackageIndex(String str) {
        ArrayList<String> arrayList;
        return (TextUtils.isEmpty(str) || (arrayList = this.mPackageList) == null || !arrayList.contains(str)) ? str : Integer.toString(this.mPackageList.indexOf(str));
    }

    public ArrayList<String> getPackageList() {
        return this.mPackageList;
    }

    public String getPackageName(String str) throws NumberFormatException {
        try {
            int i5 = Integer.parseInt(str);
            ArrayList<String> arrayList = this.mPackageList;
            if (arrayList != null && i5 < arrayList.size()) {
                return this.mPackageList.get(i5);
            }
            return null;
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public int getRequestFrom() {
        return this.mRequestFrom;
    }

    public String getVersion() {
        return this.mVersion;
    }

    public boolean isRestoreViaFastTrack() {
        return this.mRestoreViaFastTrack;
    }

    public void setDTDVersion(String str) {
        this.mDTDVersion = str;
    }

    public void setDeviceType(String str) {
        this.mDeviceType = str;
    }

    public void setManufacturer(int i5) {
        this.mManufacturer = i5;
    }

    public void setOSVersion(int i5) {
        this.mOSVersion = i5;
    }

    public void setOneUIVersion(String str) {
        this.mOneUIVersion = str;
    }

    public void setPackageList(ArrayList<String> arrayList) {
        this.mPackageList = arrayList;
    }

    public void setRequestFrom(int i5) {
        this.mRequestFrom = i5;
    }

    public void setRestoreViaFastTrack(boolean z4) {
        this.mRestoreViaFastTrack = z4;
    }

    public void setVersion(String str) {
        this.mVersion = str;
    }

    public SourceInfo(String str, String str2) {
        this.mDTDVersion = null;
        this.mRestoreViaFastTrack = false;
        this.mRequestFrom = -1;
        this.mPackageList = null;
        this.mManufacturer = -1;
        this.mDeviceType = str;
        this.mVersion = str2;
    }

    public SourceInfo(String str, String str2, String str3) {
        this(str, str2);
        this.mDTDVersion = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SourceInfo(java.util.List<com.samsung.android.lib.episode.Scene> r6, com.samsung.android.lib.episode.Scene r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.mDeviceType = r0
            r5.mVersion = r0
            r5.mDTDVersion = r0
            r1 = 0
            r5.mRestoreViaFastTrack = r1
            r2 = -1
            r5.mRequestFrom = r2
            r5.mPackageList = r0
            r5.mManufacturer = r2
            if (r6 == 0) goto L89
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r6.next()
            com.samsung.android.lib.episode.Scene r0 = (com.samsung.android.lib.episode.Scene) r0
            java.lang.String r3 = r0.getKey()
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1228368090: goto L57;
                case -610089000: goto L4c;
                case 307747916: goto L41;
                case 728705500: goto L36;
                default: goto L34;
            }
        L34:
            r3 = r2
            goto L61
        L36:
            java.lang.String r4 = "/GeneralInfo/PackageList"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3f
            goto L34
        L3f:
            r3 = 3
            goto L61
        L41:
            java.lang.String r4 = "/GeneralInfo/OSVersion"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4a
            goto L34
        L4a:
            r3 = 2
            goto L61
        L4c:
            java.lang.String r4 = "/GeneralInfo/DeviceType"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L55
            goto L34
        L55:
            r3 = 1
            goto L61
        L57:
            java.lang.String r4 = "/GeneralInfo/OneUIVersion"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L60
            goto L34
        L60:
            r3 = r1
        L61:
            switch(r3) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L65;
                default: goto L64;
            }
        L64:
            goto L1a
        L65:
            java.lang.String r0 = r0.getValue()
            java.lang.String r0 = com.samsung.android.lib.episode.EpisodeUtils.decompressString(r0)
            java.util.ArrayList r0 = com.samsung.android.lib.episode.EpisodeUtils.convertStringToArrayList(r0)
            r5.mPackageList = r0
            goto L1a
        L74:
            int r0 = r0.getValueInt(r2)
            r5.mOSVersion = r0
            goto L1a
        L7b:
            java.lang.String r0 = r0.getValue()
            r5.mDeviceType = r0
            goto L1a
        L82:
            java.lang.String r0 = r0.getValue()
            r5.mOneUIVersion = r0
            goto L1a
        L89:
            if (r7 == 0) goto L9b
            java.lang.String r6 = "version"
            java.lang.String r6 = r7.getAttribute(r6)
            r5.mVersion = r6
            java.lang.String r6 = "dtd_version"
            java.lang.String r6 = r7.getAttribute(r6)
            r5.mDTDVersion = r6
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.lib.episode.SourceInfo.<init>(java.util.List, com.samsung.android.lib.episode.Scene):void");
    }

    public SourceInfo(Bundle bundle) {
        this.mDeviceType = null;
        this.mVersion = null;
        this.mDTDVersion = null;
        this.mRestoreViaFastTrack = false;
        this.mRequestFrom = -1;
        this.mPackageList = null;
        this.mManufacturer = -1;
        if (bundle == null) {
            return;
        }
        this.mDeviceType = bundle.getString(EternalContract.EXTRA_DEVICE_TYPE);
        this.mVersion = bundle.getString("version");
        this.mDTDVersion = bundle.getString("dtd_version");
        this.mRequestFrom = bundle.getInt(EternalContract.EXTRA_REQUEST_FROM);
        this.mRestoreViaFastTrack = bundle.getBoolean(EternalContract.EXTRA_FAST_TRACK);
        this.mOSVersion = bundle.getInt(EternalContract.EXTRA_OS_VERSION);
        this.mOneUIVersion = bundle.getString(EternalContract.EXTRA_ONEUI_VERSION);
        this.mPackageList = EpisodeUtils.convertStringToArrayList(EpisodeUtils.decompressString(bundle.getString(EternalContract.EXTRA_PACKAGE_LIST)));
        this.mManufacturer = bundle.getInt(EternalContract.EXTRA_MANUFACTURER);
    }
}
