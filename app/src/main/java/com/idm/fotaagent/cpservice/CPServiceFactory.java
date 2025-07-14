package com.idm.fotaagent.cpservice;

import com.idm.fotaagent.database.sqlite.database.provider.CPService;

/* loaded from: classes.dex */
public class CPServiceFactory {
    public static CPService get() {
        return new HotSpotService();
    }
}
