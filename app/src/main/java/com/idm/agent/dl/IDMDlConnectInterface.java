package com.idm.agent.dl;

/* loaded from: classes.dex */
public interface IDMDlConnectInterface {
    boolean idmDLConnectFailRetryStatus(String str, int i5, int i6);

    boolean idmDLProcessBlockForNetwork(String str);

    boolean idmDLReceiveRetryStatus(String str, int i5, int i6);

    boolean idmDLSendFailRetryStatus(String str, int i5, int i6);

    boolean idmIsRoamingDataConnectStatus(String str);
}
