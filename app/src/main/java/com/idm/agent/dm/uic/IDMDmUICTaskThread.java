package com.idm.agent.dm.uic;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.IDMDmCommonHandler;
import com.idm.agent.dm.IDMDmHandlerMessage;
import com.idm.agent.dm.IDMDmUicActionInterface;
import com.idm.agent.dm.IDMDmWeakRefHandler;

/* loaded from: classes.dex */
public class IDMDmUICTaskThread implements Runnable, IDMDmUICInterface, IDMDmHandlerMessage {
    private Context context;
    private int key;
    private Handler taskHandler;
    private IDMDmUicActionInterface uicActionInterface;
    private IDMDmUICInfo uicInfo;
    private IDMDmUICResult uicResult;

    public IDMDmUICTaskThread(Context context, IDMDmUICInfo iDMDmUICInfo) {
        this.context = context;
        this.uicInfo = iDMDmUICInfo;
    }

    private void idmStopThreadLooper() {
        IDMDebug.I("idmStopThreadLooper");
        this.taskHandler.getLooper().quit();
    }

    public Handler idmGetTaskHandler() {
        return this.taskHandler;
    }

    public IDMDmUICResult idmGetUicResult() {
        return this.uicResult;
    }

    @Override // com.idm.agent.dm.IDMDmHandlerMessage
    public void idmHandleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 1) {
            if (i5 != 2) {
                return;
            }
            IDMDebug.I("IDM_UIC_TASK_EVENT_END");
            IDMDmCommonHandler.idmDeleteCommonHandler(this.key);
            this.uicResult = (IDMDmUICResult) message.obj;
            idmStopThreadLooper();
            return;
        }
        IDMDebug.I("IDM_UIC_TASK_EVENT_START");
        if (this.context == null || this.uicActionInterface == null) {
            IDMDebug.I("context is null or interface is null");
            this.taskHandler.sendEmptyMessage(2);
        } else {
            int iIdmAddCommonHandler = IDMDmCommonHandler.idmAddCommonHandler(this.taskHandler);
            this.key = iIdmAddCommonHandler;
            this.uicActionInterface.idmUicActionStart(this.uicInfo, iIdmAddCommonHandler);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        IDMDmWeakRefHandler iDMDmWeakRefHandler = new IDMDmWeakRefHandler(this);
        this.taskHandler = iDMDmWeakRefHandler;
        iDMDmWeakRefHandler.sendEmptyMessage(1);
        Looper.loop();
    }
}
