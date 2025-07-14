package com.idm.agent.dm.uic;

import com.idm.agent.dm.uic.IDMDmUICInterface;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class IDMDmUICInfo implements Serializable {
    private static final long serialVersionUID = -415069183091747317L;
    private List<String> choiceList;
    private String message;
    private IDMDmUICInterface.UIC_DIALOG_TYPE type;
    private IDMDmUICOption uicOption;

    public List<String> idmGetChoiceList() {
        return this.choiceList;
    }

    public String idmGetMessage() {
        return this.message;
    }

    public int idmGetType() {
        return this.type.ordinal();
    }

    public IDMDmUICOption idmGetUicOption() {
        return this.uicOption;
    }

    public void idmSetChoiceList(List<String> list) {
        this.choiceList = list;
    }

    public void idmSetMessage(String str) {
        this.message = str;
    }

    public void idmSetType(IDMDmUICInterface.UIC_DIALOG_TYPE uic_dialog_type) {
        this.type = uic_dialog_type;
    }

    public void idmSetUicOption(IDMDmUICOption iDMDmUICOption) {
        this.uicOption = iDMDmUICOption;
    }

    public String toString() {
        return "UICInfo [type=" + this.type + ", message=" + this.message + ", uicOption=" + this.uicOption + ", choiceList=" + this.choiceList + "]";
    }
}
