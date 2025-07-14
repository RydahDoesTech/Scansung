package com.samsung.android.fotaagent.common.log;

import A3.f;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.providers.mo.IDMMoInterface;

/* loaded from: classes.dex */
public class Where {
    private static final int DEFAULT_DEPTH_IN_CALL_STACK = 4;
    private static final String LAMBDA_PREFIX = "lambda$-";
    private final String where;

    private Where(int i5) {
        String fileName;
        int lineNumber;
        String strSubstring;
        String strShortenMethodNameIfLambda;
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[i5 + 4];
            fileName = stackTraceElement.getFileName();
            String className = stackTraceElement.getClassName();
            strSubstring = className.substring(className.lastIndexOf(46) + 1);
            strShortenMethodNameIfLambda = shortenMethodNameIfLambda(stackTraceElement.getMethodName());
            lineNumber = stackTraceElement.getLineNumber();
        } catch (Exception unused) {
            android.util.Log.e("IDM_FOTA", "initialization error - depth: " + i5);
            fileName = "unknown";
            lineNumber = -1;
            strSubstring = "unknown";
            strShortenMethodNameIfLambda = strSubstring;
        }
        if (DeviceUtils.isUserShipBinary()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(strSubstring);
            sb.append("(");
            sb.append(lineNumber);
            sb.append("/");
            this.where = f.p(sb, strShortenMethodNameIfLambda, ")]");
            return;
        }
        this.where = "[" + strSubstring + IDMMoInterface.IDM_MO_ROOT_PATH + strShortenMethodNameIfLambda + "(" + fileName + ":" + lineNumber + ")]";
    }

    public static Where callerOf(int i5) {
        return new Where(i5);
    }

    public static Where here() {
        return new Where(0);
    }

    private static String shortenMethodNameIfLambda(String str) {
        if (!str.startsWith(LAMBDA_PREFIX)) {
            return str;
        }
        try {
            return LAMBDA_PREFIX + str.substring(str.lastIndexOf(95) + 1);
        } catch (Exception unused) {
            return LAMBDA_PREFIX;
        }
    }

    public final String toString() {
        return this.where;
    }
}
