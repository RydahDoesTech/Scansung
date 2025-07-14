package com.idm.fotaagent.database.sqlite.database.entity;

import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;

/* loaded from: classes.dex */
public class IDMUpdateHistoryInfo {
    private long date;
    private long deltaSize;
    private String version = "";
    private String description = "";
    private String descriptionType = "";
    private String summaryDescription = "";
    private String oneUiVersion = "";
    private String oneUiType = "";
    private String androidVersion = "";
    private String resultCode = "";
    private String securityPatchLevel = "";

    public String androidVersion() {
        return this.androidVersion;
    }

    public long date() {
        return this.date;
    }

    public long deltaSize() {
        return this.deltaSize;
    }

    public String description() {
        return this.description;
    }

    public String descriptionType() {
        return this.descriptionType;
    }

    public boolean isMajor() {
        return InstallParamRepository.VALUE_ONE_UI_TYPE_MAJOR.equals(oneUiType());
    }

    public boolean isMinor() {
        return !isMajor();
    }

    public String oneUiType() {
        return this.oneUiType;
    }

    public String oneUiVersion() {
        return this.oneUiVersion;
    }

    public String resultCode() {
        return this.resultCode;
    }

    public String securityPatchLevel() {
        return this.securityPatchLevel;
    }

    public void setAndroidVersion(String str) {
        this.androidVersion = str;
    }

    public void setDate(long j5) {
        this.date = j5;
    }

    public void setDeltaSize(long j5) {
        this.deltaSize = j5;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDescriptionType(String str) {
        this.descriptionType = str;
    }

    public void setOneUiType(String str) {
        this.oneUiType = str;
    }

    public void setOneUiVersion(String str) {
        this.oneUiVersion = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setSecurityPatchLevel(String str) {
        this.securityPatchLevel = str;
    }

    public void setSummaryDescription(String str) {
        this.summaryDescription = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String summaryDescription() {
        return this.summaryDescription;
    }

    public String version() {
        return this.version;
    }
}
