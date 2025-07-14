package com.idm.adapter.logmanager;

import A3.f;
import android.text.TextUtils;
import android.util.Log;
import com.idm.adapter.logmanager.IDMLogManagerInterface;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class IDMLogManager implements IDMLogManagerInterface {
    private List<String> classNameList;

    /* renamed from: com.idm.adapter.logmanager.IDMLogManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel;

        static {
            int[] iArr = new int[IDMLogManagerInterface.LogLevel.values().length];
            $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel = iArr;
            try {
                iArr[IDMLogManagerInterface.LogLevel.H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[IDMLogManagerInterface.LogLevel.D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[IDMLogManagerInterface.LogLevel.V.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[IDMLogManagerInterface.LogLevel.I.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[IDMLogManagerInterface.LogLevel.W.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[IDMLogManagerInterface.LogLevel.E.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[IDMLogManagerInterface.LogLevel.F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public IDMLogManager() {
        try {
            this.classNameList = new ArrayList();
            idmExcludeClass(Class.forName("dalvik.system.VMStack"), Thread.class, IDMLogManager.class, IDMDebug.class);
        } catch (ClassNotFoundException e5) {
            e5.printStackTrace();
        }
    }

    private void idmExcludeClass(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.classNameList.add(cls.getName());
        }
    }

    private List<String> idmGetClassNameList() {
        return this.classNameList;
    }

    private StackTraceElement[] idmGetStackTrace() {
        return Thread.currentThread().getStackTrace();
    }

    private String idmMakeLog(IDMLogManagerInterface.LogLevel logLevel, String str) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement stackTraceElementIdmPeekStack = idmPeekStack();
        if (logLevel == IDMLogManagerInterface.LogLevel.E) {
            sb.append("Warning!!! ");
        }
        sb.append("[");
        sb.append(stackTraceElementIdmPeekStack.getClassName());
        sb.append("(Line:");
        sb.append(stackTraceElementIdmPeekStack.getLineNumber());
        sb.append("/");
        sb.append(stackTraceElementIdmPeekStack.getMethodName());
        return f.p(sb, ")] ", str);
    }

    private StackTraceElement idmPeekStack() {
        for (StackTraceElement stackTraceElement : idmGetStackTrace()) {
            if (!idmGetClassNameList().contains(stackTraceElement.getClassName())) {
                return stackTraceElement;
            }
        }
        return new StackTraceElement("<idmGetStackTrace() failed>", "<idmGetStackTrace() failed>", "<idmGetStackTrace() failed>", -1);
    }

    private void idmPrintLog(IDMLogManagerInterface.LogLevel logLevel, String str) {
        String strIdmMakeLog = idmMakeLog(logLevel, str);
        if (TextUtils.isEmpty(strIdmMakeLog)) {
            return;
        }
        switch (AnonymousClass1.$SwitchMap$com$idm$adapter$logmanager$IDMLogManagerInterface$LogLevel[logLevel.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Log.println(IDMLogManagerInterface.priorities[logLevel.getLevel()], "IDM_FOTA", strIdmMakeLog);
                break;
            default:
                Log.println(IDMLogManagerInterface.priorities[IDMLogManagerInterface.LogLevel.W.getLevel()], "IDM_FOTA", "<Logger: Invalid priority: " + logLevel.getLevel() + "> " + strIdmMakeLog);
                break;
        }
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void D(String str) {
        idmPrintLog(IDMLogManagerInterface.LogLevel.D, str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void E(String str) {
        idmPrintLog(IDMLogManagerInterface.LogLevel.E, str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void H(String str) {
        idmPrintLog(IDMLogManagerInterface.LogLevel.H, str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void I(String str) {
        idmPrintLog(IDMLogManagerInterface.LogLevel.I, str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void V(String str) {
        idmPrintLog(IDMLogManagerInterface.LogLevel.V, str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void W(String str) {
        idmPrintLog(IDMLogManagerInterface.LogLevel.W, str);
    }

    @Override // com.idm.adapter.logmanager.IDMLogManagerInterface
    public void printStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            H(stringWriter.toString());
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
