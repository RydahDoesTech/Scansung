package com.idm.fotaagent.abupdate.enablerinterface;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;

/* loaded from: classes.dex */
public interface MemoryHandler {
    static MemoryHandler createInstance(String str, FumoMemoryHandler.CheckStatus checkStatus) {
        return IDMApplication.getEnablerFactory().getMemoryHandler(str, checkStatus);
    }

    void check();
}
