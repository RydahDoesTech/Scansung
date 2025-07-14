package com.idm.agent.dm;

import android.os.Handler;
import android.util.SparseArray;
import com.idm.adapter.logmanager.IDMDebug;

/* loaded from: classes.dex */
public class IDMDmCommonHandler {
    private static SparseArray<Handler> commonHandlerArray = new SparseArray<>();

    public static synchronized int idmAddCommonHandler(Handler handler) {
        int size;
        try {
            size = commonHandlerArray.size();
            if (size > 0) {
                StringBuilder sb = new StringBuilder("handler size=");
                sb.append(size);
                sb.append(", key=");
                int i5 = size - 1;
                sb.append(commonHandlerArray.keyAt(i5));
                IDMDebug.D(sb.toString());
                size = commonHandlerArray.keyAt(i5) + 1;
            }
            commonHandlerArray.append(size, handler);
        } catch (Throwable th) {
            throw th;
        }
        return size;
    }

    public static synchronized void idmDeleteCommonHandler(int i5) {
        commonHandlerArray.remove(i5);
    }

    public static synchronized Handler idmGetCommonHandler(int i5) {
        if (commonHandlerArray.size() <= 0) {
            return null;
        }
        return commonHandlerArray.get(i5);
    }
}
