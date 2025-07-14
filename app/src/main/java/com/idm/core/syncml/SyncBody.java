package com.idm.core.syncml;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class SyncBody {
    private ArrayList<Command> commandList = new ArrayList<>();
    private boolean finalMsg = false;

    public ArrayList<Command> getCommandList() {
        return this.commandList;
    }

    public boolean isFinalMsg() {
        return this.finalMsg;
    }

    public void setCommandList(ArrayList<Command> arrayList) {
        this.commandList = arrayList;
    }

    public void setFinalMsg(boolean z4) {
        this.finalMsg = z4;
    }

    public String toString() {
        return "SyncBody [commandList=" + this.commandList + ", finalMsg=" + this.finalMsg + "]";
    }
}
