package com.idm.agent.dl;

/* loaded from: classes.dex */
public class IDMDlDownloadInfo {
    private int m_nDeltaDownState = 0;
    private int m_nDownloadPercent = 0;
    private long szDownloadSize = 0;

    public int idmGetDeltaDownState() {
        return this.m_nDeltaDownState;
    }

    public int idmGetDownloadPercent() {
        return this.m_nDownloadPercent;
    }

    public long idmGetDownloadSize() {
        return this.szDownloadSize;
    }

    public void idmSetDeltaDownState(int i5) {
        this.m_nDeltaDownState = i5;
    }

    public void idmSetDownloadPercent(int i5) {
        this.m_nDownloadPercent = i5;
    }

    public void idmSetDownloadSize(long j5) {
        this.szDownloadSize = j5;
    }
}
