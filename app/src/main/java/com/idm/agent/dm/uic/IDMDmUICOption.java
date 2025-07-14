package com.idm.agent.dm.uic;

import com.idm.agent.dm.uic.IDMDmUICInterface;
import java.io.Serializable;

/* loaded from: classes.dex */
public class IDMDmUICOption implements Serializable {
    private static final long serialVersionUID = 3098673725627948544L;
    public String defaultResponse;
    public int echoType;
    public IDMDmUICInterface.UIC_INPUT_TYPE inputType = IDMDmUICInterface.UIC_INPUT_TYPE.IDM_UIC_INPUTTYPE_NONE;
    public int maxDisplayTime;
    public int maxLength;
    public int minDisplayTime;

    public String idmGetDefaultResponse() {
        return this.defaultResponse;
    }

    public int idmGetEchoType() {
        return this.echoType;
    }

    public int idmGetInputType() {
        return this.inputType.ordinal();
    }

    public int idmGetMaxDisplayTime() {
        return this.maxDisplayTime;
    }

    public int idmGetMaxLength() {
        return this.maxLength;
    }

    public int idmGetMinDisplayTime() {
        return this.minDisplayTime;
    }

    public void idmSetDefaultResponse(String str) {
        this.defaultResponse = str;
    }

    public void idmSetEchoType(int i5) {
        this.echoType = i5;
    }

    public void idmSetInputType(IDMDmUICInterface.UIC_INPUT_TYPE uic_input_type) {
        this.inputType = uic_input_type;
    }

    public void idmSetMaxDisplayTime(int i5) {
        this.maxDisplayTime = i5;
    }

    public void idmSetMaxLength(int i5) {
        this.maxLength = i5;
    }

    public void idmSetMinDisplayTime(int i5) {
        this.minDisplayTime = i5;
    }

    public String toString() {
        return "UICOption [minDisplayTime=" + this.minDisplayTime + ", maxDisplayTime=" + this.maxDisplayTime + ", maxLength=" + this.maxLength + ", defaultResponse=" + this.defaultResponse + ", inputType=" + this.inputType + ", echoType=" + this.echoType + "]";
    }
}
