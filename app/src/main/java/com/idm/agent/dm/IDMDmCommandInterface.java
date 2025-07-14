package com.idm.agent.dm;

import com.idm.service.actioninfo.IDMActionInfo;

/* loaded from: classes.dex */
public interface IDMDmCommandInterface {
    public static final String IDM_APPLICABLE = "APPLICABLE";
    public static final String IDM_APPLICABLE_NOUPDATE_MO = "APPLICABLE_NOUPDATE";
    public static final int IDM_EXEC_ASYNC = 2;
    public static final int IDM_EXEC_FAIL = 1;
    public static final int IDM_EXEC_SUCCESS = 0;
    public static final String IDM_NOTAPPLICABLE = "N/A";

    String idmProcessAdd(IDMActionInfo iDMActionInfo, String str, String str2);

    int idmProcessExec(IDMActionInfo iDMActionInfo, String str);

    String idmProcessGet(IDMActionInfo iDMActionInfo, String str);

    String idmProcessReplace(IDMActionInfo iDMActionInfo, String str, String str2);
}
