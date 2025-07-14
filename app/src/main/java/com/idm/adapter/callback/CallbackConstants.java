package com.idm.adapter.callback;

/* loaded from: classes.dex */
public class CallbackConstants {

    public enum AbortCode {
        NONE(0),
        DELTA_CHECKSUM_MISMATCHED(1),
        AUTHENTICATION_FAILED(IDMCallbackStatusInterface.IDM_ABORT_AUTHENTIFICATION_FAIL),
        NETWORK_CONNECT_FAILED(501),
        NETWORK_SEND_FAILED(502),
        NETWORK_RECEIVE_FAILED(503),
        NETWORK_HEADER_FAILED(505),
        NETWORK_MEMORY_FULL(IDMCallbackStatusInterface.IDM_ABORT_NETWORK_MEMORY_FULL),
        DELTA_OVERSIZE(IDMCallbackStatusInterface.IDM_ABORT_NETWORK_RECEIVE_OVERSIZE),
        DELTA_FILE_NOT_FOUND(IDMCallbackStatusInterface.IDM_ABORT_NETWORK_MEMORY_FULL);

        private final int abortCode;

        AbortCode(int i5) {
            this.abortCode = i5;
        }

        public int getAbortCode() {
            return this.abortCode;
        }
    }

    public enum FumoStatus {
        NONE(0),
        FUMO_START(10),
        DOWNLOAD_DESCRIPTOR(200),
        DOWNLOAD_IN_PROGRESS(30),
        DOWNLOAD_PAUSED(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE),
        DOWNLOAD_REPORT(35),
        DOWNLOAD_COMPLETE(40),
        READY_TO_UPDATE(50),
        UPDATE_POSTPONED(IDMCallbackStatusInterface.IDM_DL_STATE_POSTPONE_TO_UPDATE),
        UPDATE_IN_PROGRESS(60),
        UPDATE_REPORT(65),
        UPDATE_FAILED(80),
        UPDATE_SUCCESS(100),
        DOWNLOAD_CANCELED(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL),
        DOWNLOAD_CANCELED_REPORT(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING),
        DOWNLOAD_FAILED(20),
        DOWNLOAD_FAILED_REPORT(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING);

        private final int fumoStatus;

        FumoStatus(int i5) {
            this.fumoStatus = i5;
        }

        public int getFumoStatus() {
            return this.fumoStatus;
        }
    }

    public enum ResultCode {
        NONE(0),
        SUCCESS(IDMCallbackStatusInterface.IDM_RESULTS),
        PROGRESS(IDMCallbackStatusInterface.IDM_RESULTS_PROGRESS),
        FAILURE(IDMCallbackStatusInterface.IDM_RESULTS_FAIL);

        private final int resultCode;

        ResultCode(int i5) {
            this.resultCode = i5;
        }

        public int getResultCode() {
            return this.resultCode;
        }
    }

    public enum StatusCode {
        NONE(0),
        RESTCLIENT_ABORT(300),
        RESTCLIENT_FINISH(301),
        START(IDMCallbackStatusInterface.IDM_STATUS_START),
        USER_CANCELED(IDMCallbackStatusInterface.IDM_STATUS_USERCANCEL),
        DM_ABORT(IDMCallbackStatusInterface.IDM_STATUS_ABORT),
        FINISH(IDMCallbackStatusInterface.IDM_STATUS_FINISH),
        CONTINUE(IDMCallbackStatusInterface.IDM_STATUS_CONTINUE),
        FINISH_AND_EXECUTE(IDMCallbackStatusInterface.IDM_STATUS_FINISH_AND_EXECUTE),
        USER_CANCELED_FINISH(IDMCallbackStatusInterface.IDM_STATUS_USERCANCEL_FINISH),
        DL_ABORT(IDMCallbackStatusInterface.IDM_DL_STATUS_ABORT);

        private final int statusCode;

        StatusCode(int i5) {
            this.statusCode = i5;
        }

        public int getStatusCode() {
            return this.statusCode;
        }
    }
}
