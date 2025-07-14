package com.idm.fotaagent.scheduler;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.service.actioninfo.IDMActionInfo;
import java.util.Objects;

/* loaded from: classes.dex */
public class IDMSchedulerInfo implements Parcelable, IDMSchedulerInterface {
    public static final Parcelable.Creator<IDMSchedulerInfo> CREATOR = new Parcelable.Creator() { // from class: com.idm.fotaagent.scheduler.IDMSchedulerInfo.1
        @Override // android.os.Parcelable.Creator
        public IDMSchedulerInfo createFromParcel(Parcel parcel) {
            return new IDMSchedulerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IDMSchedulerInfo[] newArray(int i5) {
            return new IDMSchedulerInfo[i5];
        }
    };
    private static final String DATA = "data";
    private IDMActionInfo actionInfo;
    private long index;
    private IDMSchedulerInterface.IDM_SCHEDULE_TYPE initType;
    private Intent intent;
    private int nPushType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDMSchedulerInfo iDMSchedulerInfo = (IDMSchedulerInfo) obj;
        return this.index == iDMSchedulerInfo.index && this.nPushType == iDMSchedulerInfo.nPushType && this.initType == iDMSchedulerInfo.initType && Objects.equals(this.actionInfo, iDMSchedulerInfo.actionInfo) && Objects.equals(this.intent, iDMSchedulerInfo.intent);
    }

    public byte[] getData() {
        Intent intent = this.intent;
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("data") : null;
        return byteArrayExtra != null ? byteArrayExtra : new byte[0];
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.index), this.initType, this.actionInfo, this.intent, Integer.valueOf(this.nPushType));
    }

    public IDMActionInfo idmGetActionInfo() {
        return this.actionInfo;
    }

    public long idmGetIndex() {
        return this.index;
    }

    public int idmGetPushType() {
        return this.nPushType;
    }

    public IDMSchedulerInterface.IDM_SCHEDULE_TYPE idmGetSchedulerInitType() {
        return this.initType;
    }

    public void idmSetActionInfo(IDMActionInfo iDMActionInfo) {
        this.actionInfo = iDMActionInfo;
    }

    public void idmSetIndex(long j5) {
        this.index = j5;
    }

    public void idmSetPushType(int i5) {
        this.nPushType = i5;
    }

    public void idmSetSchedulerInitType(IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type) {
        this.initType = idm_schedule_type;
    }

    public void setData(byte[] bArr) {
        this.intent = new Intent().putExtra("data", bArr);
    }

    public void start() {
        this.initType.execute(this);
    }

    public String toString() {
        return "IDMSchedulerInfo{index=" + this.index + ", initType=" + this.initType + ", actionInfo=" + this.actionInfo + ", intent=" + this.intent + ", nPushType=" + this.nPushType + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.index);
        parcel.writeValue(this.initType);
        parcel.writeValue(this.actionInfo);
        parcel.writeValue(this.intent);
        parcel.writeInt(this.nPushType);
    }

    public IDMSchedulerInfo() {
    }

    public IDMSchedulerInfo(long j5, IDMSchedulerInterface.IDM_SCHEDULE_TYPE idm_schedule_type, IDMActionInfo iDMActionInfo, Intent intent, int i5) {
        this.index = j5;
        this.initType = idm_schedule_type;
        this.actionInfo = iDMActionInfo;
        this.intent = intent;
        this.nPushType = i5;
    }

    private IDMSchedulerInfo(Parcel parcel) {
        this.index = parcel.readLong();
        this.initType = (IDMSchedulerInterface.IDM_SCHEDULE_TYPE) parcel.readValue(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.class.getClassLoader());
        this.actionInfo = (IDMActionInfo) parcel.readValue(IDMActionInfo.class.getClassLoader());
        this.intent = (Intent) parcel.readValue(Intent.class.getClassLoader());
        this.nPushType = parcel.readInt();
    }
}
