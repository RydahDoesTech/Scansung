package com.samsung.android.fotaagent.common.log;

import com.samsung.android.fotaagent.common.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class LoggerCollection extends Logger {
    private final List<Logger> loggers = new ArrayList();

    public LoggerCollection(Logger... loggerArr) {
        for (Logger logger : loggerArr) {
            if (logger != null) {
                this.loggers.add(logger);
            }
        }
    }

    @Override // com.samsung.android.fotaagent.common.log.Logger
    public void log(Logger.Level level, Where where, Object obj) {
        Iterator<Logger> it = this.loggers.iterator();
        while (it.hasNext()) {
            it.next().log(level, where, obj);
        }
    }
}
