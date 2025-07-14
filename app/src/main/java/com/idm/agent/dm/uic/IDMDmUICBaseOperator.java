package com.idm.agent.dm.uic;

import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0130s;
import androidx.fragment.app.H;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.agent.dm.IDMDmCommonHandler;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public abstract class IDMDmUICBaseOperator extends H implements IDMDmUICInterface {
    protected DialogInterfaceOnCancelListenerC0130s dialog;
    protected int key;
    protected IDMDmUICInfo uicInfo;
    private Timer uicTimer;

    /* renamed from: com.idm.agent.dm.uic.IDMDmUICBaseOperator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE;

        static {
            int[] iArr = new int[IDMDmUICInterface.UIC_DIALOG_TYPE.values().length];
            $SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE = iArr;
            try {
                iArr[IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE[IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE[IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_USER_INPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE[IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_SINGLE_CHOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE[IDMDmUICInterface.UIC_DIALOG_TYPE.IDM_UIC_TYPE_MULTIPLE_CHOICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class IDMCloseTimerTask extends TimerTask {
        public IDMCloseTimerTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IDMDmUICBaseOperator.this.idmCancelCloseTimer();
            IDMDmUICBaseOperator.this.dialog.dismissAllowingStateLoss();
            IDMDmUICBaseOperator.this.idmPerformUICDefaultResponse();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void idmCancelCloseTimer() {
        Timer timer = this.uicTimer;
        if (timer != null) {
            timer.cancel();
            this.uicTimer = null;
        }
    }

    private void idmFinishDialog() {
        if (this.dialog != null) {
            IDMDebug.I("idmFinishDialog");
            this.dialog.dismiss();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void idmPerformUICDefaultResponse() {
        IDMDmUICOption iDMDmUICOptionIdmGetUicOption = this.uicInfo.idmGetUicOption();
        IDMDmUICInterface.UIC_DIALOG_TYPE uic_dialog_typeValueOf = IDMDmUICInterface.UIC_DIALOG_TYPE.valueOf(this.uicInfo.idmGetType());
        IDMDebug.I("Default Response UIC Type : " + uic_dialog_typeValueOf);
        int i5 = AnonymousClass1.$SwitchMap$com$idm$agent$dm$uic$IDMDmUICInterface$UIC_DIALOG_TYPE[uic_dialog_typeValueOf.ordinal()];
        if (i5 == 1) {
            idmResultPerformUIC("200", null);
            return;
        }
        if (i5 == 2) {
            if (iDMDmUICOptionIdmGetUicOption == null || TextUtils.isEmpty(iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse())) {
                idmResultPerformUIC("215", null);
                return;
            }
            if ("1".equals(iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse())) {
                idmResultPerformUIC("200", null);
                return;
            } else if ("0".equals(iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse())) {
                idmResultPerformUIC("304", null);
                return;
            } else {
                idmResultPerformUIC("214", null);
                return;
            }
        }
        if (i5 == 3) {
            if (iDMDmUICOptionIdmGetUicOption == null || TextUtils.isEmpty(iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse())) {
                idmResultPerformUIC("215", null);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse());
            idmResultPerformUIC("200", arrayList);
            return;
        }
        if (i5 == 4 || i5 == 5) {
            if (iDMDmUICOptionIdmGetUicOption == null || TextUtils.isEmpty(iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse())) {
                idmResultPerformUIC("215", null);
                return;
            }
            List<String> arrayList2 = new ArrayList<>();
            Collections.addAll(arrayList2, iDMDmUICOptionIdmGetUicOption.idmGetDefaultResponse().split("-"));
            idmResultPerformUIC("200", arrayList2);
        }
    }

    private void idmSendMessage(IDMDmUICResult iDMDmUICResult) {
        Handler handlerIdmGetCommonHandler = IDMDmCommonHandler.idmGetCommonHandler(this.key);
        if (handlerIdmGetCommonHandler != null) {
            if (iDMDmUICResult == null) {
                handlerIdmGetCommonHandler.sendEmptyMessage(2);
            } else {
                handlerIdmGetCommonHandler.sendMessage(handlerIdmGetCommonHandler.obtainMessage(2, iDMDmUICResult));
            }
        }
    }

    public void idmResultPerformUIC(String str, List<String> list) {
        idmCancelCloseTimer();
        IDMDmUICResult iDMDmUICResult = new IDMDmUICResult();
        iDMDmUICResult.idmSetStatusCode(str);
        iDMDmUICResult.idmSetDataList(list);
        IDMDebug.I(iDMDmUICResult.toString());
        idmSendMessage(iDMDmUICResult);
        idmFinishDialog();
    }

    public void idmSetCloseTimerOption() {
        IDMDmUICOption iDMDmUICOptionIdmGetUicOption = this.uicInfo.idmGetUicOption();
        if (iDMDmUICOptionIdmGetUicOption == null) {
            IDMDebug.I("uicOption is null");
            return;
        }
        int i5 = iDMDmUICOptionIdmGetUicOption.minDisplayTime;
        int i6 = i5 > 0 ? i5 * 1000 : 0;
        int i7 = iDMDmUICOptionIdmGetUicOption.maxDisplayTime;
        if (i7 > 0) {
            i6 = i7 * 1000;
        }
        if (this.uicTimer != null) {
            IDMDebug.I("uicTimer is running or already started!!");
            return;
        }
        if (i6 > 0) {
            IDMDebug.I("displayTime : " + i6);
            IDMCloseTimerTask iDMCloseTimerTask = new IDMCloseTimerTask();
            Timer timer = new Timer(true);
            this.uicTimer = timer;
            timer.schedule(iDMCloseTimerTask, i6);
        }
    }

    public abstract void idmShowUICDialog();
}
