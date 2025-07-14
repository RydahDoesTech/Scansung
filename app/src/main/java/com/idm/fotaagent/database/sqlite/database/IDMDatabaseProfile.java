package com.idm.fotaagent.database.sqlite.database;

import A3.f;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IDMDatabaseProfile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.idm.fotaagent.database.sqlite.database.IDMDatabaseProfile.1
        @Override // android.os.Parcelable.Creator
        public IDMDatabaseProfile createFromParcel(Parcel parcel) {
            return new IDMDatabaseProfile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IDMDatabaseProfile[] newArray(int i5) {
            return new IDMDatabaseProfile[i5];
        }
    };
    public static final String IDM_BUNDLE_KEY = "profile";
    public static final String IDM_KEY = "serverId";
    private int active;
    private String clientAuthtype;
    private String clientId;
    private String clientNonce;
    private String clientPwd;
    private String name;
    private String serverAuthtype;
    private String serverId;
    private String serverNonce;
    private String serverPwd;
    private String serverUrl;

    public IDMDatabaseProfile() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int idmGetActive() {
        return this.active;
    }

    public String idmGetClientAuthtype() {
        return this.clientAuthtype;
    }

    public String idmGetClientId() {
        return this.clientId;
    }

    public String idmGetClientNonce() {
        return this.clientNonce;
    }

    public String idmGetClientPwd() {
        return this.clientPwd;
    }

    public String idmGetName() {
        return this.name;
    }

    public String idmGetServerAuthtype() {
        return this.serverAuthtype;
    }

    public String idmGetServerId() {
        return this.serverId;
    }

    public String idmGetServerNonce() {
        return this.serverNonce;
    }

    public String idmGetServerPwd() {
        return this.serverPwd;
    }

    public String idmGetServerUrl() {
        return this.serverUrl;
    }

    public void idmReadFromParcel(Parcel parcel) {
        this.serverId = parcel.readString();
        this.serverPwd = parcel.readString();
        this.serverNonce = parcel.readString();
        this.serverAuthtype = parcel.readString();
        this.serverUrl = parcel.readString();
        this.clientId = parcel.readString();
        this.clientPwd = parcel.readString();
        this.clientNonce = parcel.readString();
        this.clientAuthtype = parcel.readString();
        this.name = parcel.readString();
        this.active = parcel.readInt();
    }

    public void idmSetActive(int i5) {
        this.active = i5;
    }

    public void idmSetClientAuthtype(String str) {
        this.clientAuthtype = str;
    }

    public void idmSetClientId(String str) {
        this.clientId = str;
    }

    public void idmSetClientNonce(String str) {
        this.clientNonce = str;
    }

    public void idmSetClientPwd(String str) {
        this.clientPwd = str;
    }

    public void idmSetName(String str) {
        this.name = str;
    }

    public void idmSetServerAuthtype(String str) {
        this.serverAuthtype = str;
    }

    public void idmSetServerId(String str) {
        this.serverId = str;
    }

    public void idmSetServerNonce(String str) {
        this.serverNonce = str;
    }

    public void idmSetServerPwd(String str) {
        this.serverPwd = str;
    }

    public void idmSetServerUrl(String str) {
        this.serverUrl = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMProfile [serverId=");
        sb.append(this.serverId);
        sb.append(", serverPwd=");
        sb.append(this.serverPwd);
        sb.append(", serverNonce=");
        sb.append(this.serverNonce);
        sb.append(", serverAuthtype=");
        sb.append(this.serverAuthtype);
        sb.append(", serverUrl=");
        sb.append(this.serverUrl);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", clientPwd=");
        sb.append(this.clientPwd);
        sb.append(", clientNonce=");
        sb.append(this.clientNonce);
        sb.append(", clientAuthtype=");
        sb.append(this.clientAuthtype);
        sb.append(", name=");
        return f.p(sb, this.name, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.serverId);
        parcel.writeString(this.serverPwd);
        parcel.writeString(this.serverNonce);
        parcel.writeString(this.serverAuthtype);
        parcel.writeString(this.serverUrl);
        parcel.writeString(this.clientId);
        parcel.writeString(this.clientPwd);
        parcel.writeString(this.clientNonce);
        parcel.writeString(this.clientAuthtype);
        parcel.writeString(this.name);
        parcel.writeInt(this.active);
    }

    public IDMDatabaseProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i5) {
        this.serverId = str;
        this.serverPwd = str2;
        this.serverNonce = str3;
        this.serverAuthtype = str4;
        this.serverUrl = str5;
        this.clientId = str6;
        this.clientPwd = str7;
        this.clientNonce = str8;
        this.clientAuthtype = str9;
        this.name = str10;
        this.active = i5;
    }

    public IDMDatabaseProfile(Parcel parcel) {
        idmReadFromParcel(parcel);
    }
}
