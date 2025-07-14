package com.idm.fotaagent.database.sqlite.database;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IDMDatabaseServerInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.idm.fotaagent.database.sqlite.database.IDMDatabaseServerInfo.1
        @Override // android.os.Parcelable.Creator
        public IDMDatabaseServerInfo createFromParcel(Parcel parcel) {
            return new IDMDatabaseServerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IDMDatabaseServerInfo[] newArray(int i5) {
            return new IDMDatabaseServerInfo[i5];
        }
    };
    private int active;
    private int id;
    private String server;

    private void idmReadFromParcel(Parcel parcel) {
        this.server = parcel.readString();
        this.active = parcel.readInt();
        this.id = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int idmGetActive() {
        return this.active;
    }

    public int idmGetId() {
        return this.id;
    }

    public String idmGetServer() {
        return this.server;
    }

    public void idmSetActive(int i5) {
        this.active = i5;
    }

    public void idmSetId(int i5) {
        this.id = i5;
    }

    public void idmSetServer(String str) {
        this.server = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.server);
        parcel.writeInt(this.active);
        parcel.writeInt(this.id);
    }

    public IDMDatabaseServerInfo() {
    }

    public IDMDatabaseServerInfo(String str, int i5, int i6) {
        this.server = str;
        this.active = i5;
        this.id = i6;
    }

    private IDMDatabaseServerInfo(Parcel parcel) {
        idmReadFromParcel(parcel);
    }
}
