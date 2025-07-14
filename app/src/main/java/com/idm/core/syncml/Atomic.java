package com.idm.core.syncml;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class Atomic extends Command {
    private ArrayList<Command> commandList = new ArrayList<>();

    public ArrayList<Command> getCommandList() {
        return this.commandList;
    }

    public void setCommandList(ArrayList<Command> arrayList) {
        this.commandList = arrayList;
    }

    public String toString() {
        return "Atomic [commandList=" + this.commandList + ", cmdID=" + this.cmdID + ", meta=" + this.meta + "]";
    }
}
