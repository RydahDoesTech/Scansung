package com.idm.core.push;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IDMPushWapInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.idm.core.push.IDMPushWapInfo.1
        @Override // android.os.Parcelable.Creator
        public IDMPushWapInfo createFromParcel(Parcel parcel) {
            return new IDMPushWapInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IDMPushWapInfo[] newArray(int i5) {
            return new IDMPushWapInfo[i5];
        }
    };
    private int nBodyLen;
    private int nContentType;
    private int nHeaderLen;
    private int nMACLen;
    private int nSEC;
    private byte[] notiBody;
    private byte[] szMAC;

    public IDMPushWapInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int idmPushWapGetBodyLen() {
        return this.nBodyLen;
    }

    public int idmPushWapGetContentType() {
        return this.nContentType;
    }

    public int idmPushWapGetHeaderLen() {
        return this.nHeaderLen;
    }

    public byte[] idmPushWapGetMAC() {
        return (byte[]) this.szMAC.clone();
    }

    public int idmPushWapGetMACLen() {
        return this.nMACLen;
    }

    public byte[] idmPushWapGetNotiBody() {
        return (byte[]) this.notiBody.clone();
    }

    public int idmPushWapGetSEC() {
        return this.nSEC;
    }

    public void idmPushWapSetBodyLen(int i5) {
        this.nBodyLen = i5;
    }

    public void idmPushWapSetContentType(int i5) {
        this.nContentType = i5;
    }

    public void idmPushWapSetHeaderLen(int i5) {
        this.nHeaderLen = i5;
    }

    public void idmPushWapSetMAC(byte[] bArr) {
        this.szMAC = (byte[]) bArr.clone();
    }

    public void idmPushWapSetMACLen(int i5) {
        this.nMACLen = i5;
    }

    public void idmPushWapSetNotiBody(byte[] bArr) {
        this.notiBody = (byte[]) bArr.clone();
    }

    public void idmPushWapSetSEC(int i5) {
        this.nSEC = i5;
    }

    public void idmReadFromParcel(Parcel parcel) {
        this.nContentType = parcel.readInt();
        this.nHeaderLen = parcel.readInt();
        this.nBodyLen = parcel.readInt();
        this.nMACLen = parcel.readInt();
        this.nSEC = parcel.readInt();
        byte[] bArr = new byte[parcel.readInt()];
        this.szMAC = bArr;
        parcel.readByteArray(bArr);
        byte[] bArr2 = new byte[parcel.readInt()];
        this.notiBody = bArr2;
        parcel.readByteArray(bArr2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.nContentType);
        parcel.writeInt(this.nHeaderLen);
        parcel.writeInt(this.nBodyLen);
        parcel.writeInt(this.nMACLen);
        parcel.writeInt(this.nSEC);
        parcel.writeInt(this.szMAC.length);
        parcel.writeByteArray(this.szMAC);
        parcel.writeInt(this.notiBody.length);
        parcel.writeByteArray(this.notiBody);
    }

    public IDMPushWapInfo(Parcel parcel) {
        idmReadFromParcel(parcel);
    }
}
