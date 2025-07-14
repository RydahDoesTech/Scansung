package com.samsung.android.fotaagent.common.log;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class Logger {
    private static final int DEFAULT_ADDITIONAL_DEPTH_IN_CALL_STACK = 1;
    public static Logger STUB = new Logger() { // from class: com.samsung.android.fotaagent.common.log.Logger.1
        @Override // com.samsung.android.fotaagent.common.log.Logger
        public void log(Level level, Where where, Object obj) {
        }
    };
    private final int additionalDepthInCallStack;

    public enum Level {
        S(6) { // from class: com.samsung.android.fotaagent.common.log.Logger.Level.1
            @Override // java.lang.Enum
            public String toString() {
                return Level.H.toString();
            }
        },
        H(3),
        V(2),
        D(3),
        I(4),
        W(5),
        E(6),
        A(7);

        private final int priority;

        public int priority() {
            return this.priority;
        }

        Level(int i5) {
            this.priority = i5;
        }
    }

    public Logger() {
        this(0);
    }

    public void D(Object obj) {
        D(Where.callerOf(this.additionalDepthInCallStack), obj);
    }

    public void E(Object obj) {
        E(Where.callerOf(this.additionalDepthInCallStack), obj);
    }

    public void H(Object obj) {
        H(Where.callerOf(this.additionalDepthInCallStack), obj);
    }

    public void I(Object obj) {
        I(Where.callerOf(this.additionalDepthInCallStack), obj);
    }

    public void V(Object obj) {
        V(Where.callerOf(this.additionalDepthInCallStack), obj);
    }

    public void W(Object obj) {
        W(Where.callerOf(this.additionalDepthInCallStack), obj);
    }

    public abstract void log(Level level, Where where, Object obj);

    public void printStackTrace(Throwable th) {
        printStackTrace(Where.callerOf(this.additionalDepthInCallStack), th);
    }

    public Logger(int i5) {
        this.additionalDepthInCallStack = i5 + 1;
    }

    public void D(Where where, Object obj) {
        log(Level.D, where, obj);
    }

    public void E(Where where, Object obj) {
        log(Level.E, where, obj);
    }

    public void H(Where where, Object obj) {
        log(Level.H, where, obj);
    }

    public void I(Where where, Object obj) {
        log(Level.I, where, obj);
    }

    public void V(Where where, Object obj) {
        log(Level.V, where, obj);
    }

    public void W(Where where, Object obj) {
        log(Level.W, where, obj);
    }

    public void printStackTrace(Where where, Throwable th, Object obj) {
        E(where, obj);
        printStackTrace(where, th);
    }

    public void printStackTrace(Where where, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            log(Level.S, where, stringWriter.toString());
            printWriter.close();
        } catch (Throwable th2) {
            try {
                printWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
