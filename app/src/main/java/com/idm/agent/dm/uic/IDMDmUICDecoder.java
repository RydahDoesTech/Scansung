package com.idm.agent.dm.uic;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import com.idm.core.syncml.Constants;
import com.idm.core.syncml.Item;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class IDMDmUICDecoder implements Constants, IDMDmUICInterface {
    private List<String> idmDecodeChoiceList(ArrayList<Item> arrayList) {
        if (arrayList.size() < 2) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 2; i5 < arrayList.size(); i5++) {
            String data = arrayList.get(i5).getData();
            if (data != null) {
                arrayList2.add(data);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:3:0x0005, B:5:0x0010, B:55:0x00bc, B:8:0x001d, B:48:0x009f, B:49:0x00a5, B:50:0x00a9, B:51:0x00ad, B:52:0x00b1, B:53:0x00b5, B:54:0x00b9, B:21:0x0053, B:26:0x0060, B:29:0x006a, B:32:0x0074, B:35:0x007e, B:38:0x0088, B:56:0x00c0), top: B:60:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.idm.agent.dm.uic.IDMDmUICOption idmDecodeUICOption(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.uic.IDMDmUICDecoder.idmDecodeUICOption(java.lang.String):com.idm.agent.dm.uic.IDMDmUICOption");
    }

    private void idmSetUICOptionDR(String str, IDMDmUICOption iDMDmUICOption) {
        iDMDmUICOption.idmSetDefaultResponse(str);
    }

    private void idmSetUICOptionET(String str, IDMDmUICOption iDMDmUICOption) {
        str.getClass();
        if (str.equals("P")) {
            iDMDmUICOption.idmSetEchoType(2);
        } else if (str.equals("T")) {
            iDMDmUICOption.idmSetEchoType(1);
        } else {
            IDMDebug.W("No EchoType Option");
        }
    }

    private void idmSetUICOptionIT(String str, IDMDmUICOption iDMDmUICOption) {
        str.getClass();
        switch (str) {
            case "A":
                iDMDmUICOption.idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_ALPHANUMERIC);
                break;
            case "D":
                iDMDmUICOption.idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_DATE);
                break;
            case "I":
                iDMDmUICOption.idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_IPADDRESS);
                break;
            case "N":
                iDMDmUICOption.idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_NUMERIC);
                break;
            case "P":
                iDMDmUICOption.idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_PHONENUBMER);
                break;
            case "T":
                iDMDmUICOption.idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_TIME);
                break;
            default:
                IDMDebug.W("No InputType Option");
                break;
        }
    }

    private void idmSetUICOptionMAXDT(String str, IDMDmUICOption iDMDmUICOption) {
        try {
            iDMDmUICOption.idmSetMaxDisplayTime(Integer.parseInt(str));
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmSetUICOptionMAXLEN(String str, IDMDmUICOption iDMDmUICOption) {
        try {
            iDMDmUICOption.idmSetMaxLength(Integer.parseInt(str));
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private void idmSetUICOptionMINDT(String str, IDMDmUICOption iDMDmUICOption) {
        try {
            iDMDmUICOption.idmSetMinDisplayTime(Integer.parseInt(str));
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.idm.agent.dm.uic.IDMDmUICInfo idmDecode(java.lang.String r8, java.util.ArrayList<com.idm.core.syncml.Item> r9) {
        /*
            r7 = this;
            com.idm.agent.dm.uic.IDMDmUICInfo r0 = new com.idm.agent.dm.uic.IDMDmUICInfo
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = r9.get(r1)     // Catch: java.lang.Exception -> L20
            com.idm.core.syncml.Item r2 = (com.idm.core.syncml.Item) r2     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = r2.getData()     // Catch: java.lang.Exception -> L20
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L23
            java.lang.String r2 = "MINDT=30"
            com.idm.agent.dm.uic.IDMDmUICOption r2 = r7.idmDecodeUICOption(r2)     // Catch: java.lang.Exception -> L20
            r0.idmSetUicOption(r2)     // Catch: java.lang.Exception -> L20
            goto L2a
        L20:
            r7 = move-exception
            goto Lb1
        L23:
            com.idm.agent.dm.uic.IDMDmUICOption r2 = r7.idmDecodeUICOption(r2)     // Catch: java.lang.Exception -> L20
            r0.idmSetUicOption(r2)     // Catch: java.lang.Exception -> L20
        L2a:
            r2 = 1
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Exception -> L20
            com.idm.core.syncml.Item r3 = (com.idm.core.syncml.Item) r3     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = r3.getData()     // Catch: java.lang.Exception -> L20
            r0.idmSetMessage(r3)     // Catch: java.lang.Exception -> L20
            int r3 = r8.hashCode()     // Catch: java.lang.Exception -> L20
            r4 = 2
            r5 = 3
            r6 = 4
            switch(r3) {
                case 1508384: goto L6b;
                case 1508385: goto L61;
                case 1508386: goto L57;
                case 1508387: goto L4d;
                case 1508388: goto L43;
                default: goto L42;
            }     // Catch: java.lang.Exception -> L20
        L42:
            goto L74
        L43:
            java.lang.String r1 = "1104"
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Exception -> L20
            if (r8 == 0) goto L74
            r1 = r6
            goto L75
        L4d:
            java.lang.String r1 = "1103"
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Exception -> L20
            if (r8 == 0) goto L74
            r1 = r5
            goto L75
        L57:
            java.lang.String r1 = "1102"
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Exception -> L20
            if (r8 == 0) goto L74
            r1 = r4
            goto L75
        L61:
            java.lang.String r1 = "1101"
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Exception -> L20
            if (r8 == 0) goto L74
            r1 = r2
            goto L75
        L6b:
            java.lang.String r3 = "1100"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Exception -> L20
            if (r8 == 0) goto L74
            goto L75
        L74:
            r1 = -1
        L75:
            if (r1 == 0) goto Lab
            if (r1 == r2) goto La5
            if (r1 == r4) goto L9f
            if (r1 == r5) goto L92
            if (r1 == r6) goto L85
            java.lang.String r7 = "No UIC AlertCode"
            com.idm.adapter.logmanager.IDMDebug.W(r7)     // Catch: java.lang.Exception -> L20
            goto Lb0
        L85:
            com.idm.agent.dm.uic.IDMDmUICInterface$UIC_DIALOG_TYPE r8 = com.idm.agent.dm.uic.IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_MULTIPLE_CHOICE     // Catch: java.lang.Exception -> L20
            r0.idmSetType(r8)     // Catch: java.lang.Exception -> L20
            java.util.List r7 = r7.idmDecodeChoiceList(r9)     // Catch: java.lang.Exception -> L20
            r0.idmSetChoiceList(r7)     // Catch: java.lang.Exception -> L20
            goto Lb0
        L92:
            com.idm.agent.dm.uic.IDMDmUICInterface$UIC_DIALOG_TYPE r8 = com.idm.agent.dm.uic.IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_SINGLE_CHOICE     // Catch: java.lang.Exception -> L20
            r0.idmSetType(r8)     // Catch: java.lang.Exception -> L20
            java.util.List r7 = r7.idmDecodeChoiceList(r9)     // Catch: java.lang.Exception -> L20
            r0.idmSetChoiceList(r7)     // Catch: java.lang.Exception -> L20
            goto Lb0
        L9f:
            com.idm.agent.dm.uic.IDMDmUICInterface$UIC_DIALOG_TYPE r7 = com.idm.agent.dm.uic.IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_USER_INPUT     // Catch: java.lang.Exception -> L20
            r0.idmSetType(r7)     // Catch: java.lang.Exception -> L20
            goto Lb0
        La5:
            com.idm.agent.dm.uic.IDMDmUICInterface$UIC_DIALOG_TYPE r7 = com.idm.agent.dm.uic.IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_CONFIRMATION     // Catch: java.lang.Exception -> L20
            r0.idmSetType(r7)     // Catch: java.lang.Exception -> L20
            goto Lb0
        Lab:
            com.idm.agent.dm.uic.IDMDmUICInterface$UIC_DIALOG_TYPE r7 = com.idm.agent.dm.uic.IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_DISPLAY     // Catch: java.lang.Exception -> L20
            r0.idmSetType(r7)     // Catch: java.lang.Exception -> L20
        Lb0:
            return r0
        Lb1:
            com.idm.adapter.logmanager.IDMDebug.printStackTrace(r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.idm.agent.dm.uic.IDMDmUICDecoder.idmDecode(java.lang.String, java.util.ArrayList):com.idm.agent.dm.uic.IDMDmUICInfo");
    }
}
