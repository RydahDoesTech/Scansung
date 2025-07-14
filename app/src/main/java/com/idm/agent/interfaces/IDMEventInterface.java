package com.idm.agent.interfaces;

/* loaded from: classes.dex */
public interface IDMEventInterface {

    public enum IDM_DL_TASK_EVENT {
        IDM_DL_TASK_EVENT_CONNECTFAIL,
        IDM_DL_TASK_EVENT_ABORT,
        IDM_DL_TASK_EVENT_START,
        IDM_DL_TASK_EVENT_CONTINUE,
        IDM_DL_TASK_EVENT_FINISH,
        IDM_DL_TASK_EVENT_SENDFAIL,
        IDM_DL_TASK_EVENT_RECEIVEFAIL,
        IDM_DL_TASK_EVENT_USERCANCEL,
        IDM_DL_TASK_EVENT_USERCANCEL_FINISH,
        IDM_DL_TASK_EVENT_MEMORY_FULL_REPORT,
        IDM_DL_TASK_EVENT_RECEIVE_OVERSIZE_REPORT,
        IDM_DL_TASK_EVENT_FILE_NOT_FOUND,
        IDM_DL_TASK_EVENT_REQUEST_RETRY,
        IDM_TASK_EVENT_DL_PAUSE_DOWNLOAD,
        IDM_TASK_EVENT_DL_PAUSE_DOWNLOAD_FINISH;

        private static final IDM_DL_TASK_EVENT[] values = values();

        public static IDM_DL_TASK_EVENT valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }

    public enum IDM_DM_TASK_EVENT {
        IDM_DM_TASK_EVENT_START,
        IDM_DM_TASK_EVENT_CONTINUE,
        IDM_DM_TASK_EVENT_FINISH,
        IDM_DM_TASK_EVENT_CONNECTFAIL,
        IDM_DM_TASK_EVENT_SENDFAIL,
        IDM_DM_TASK_EVENT_RECEIVEFAIL,
        IDM_DM_TASK_EVENT_ABORT,
        IDM_DM_TASK_EVENT_FINISHANDEXECUTE,
        IDM_DM_TASK_EVENT_USERCANCEL,
        IDM_DM_TASK_EVENT_USERCANCEL_FINISH;

        private static final IDM_DM_TASK_EVENT[] values = values();

        public static IDM_DM_TASK_EVENT valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }

    public enum IDM_SERVICE_EVENT {
        IDM_SERVICE_EVENT_DM_START,
        IDM_SERVICE_EVENT_DM_FINISH,
        IDM_SERVICE_EVENT_DM_CANCEL,
        IDM_SERVICE_EVENT_UI_CONNECT,
        IDM_SERVICE_EVENT_UI_FINISH,
        IDM_SERVICE_EVENT_PUSH_PARSE,
        IDM_SERVICE_EVENT_USERCANCEL,
        IDM_SERVICE_EVENT_PAUSE,
        IDM_SERVICE_EVENT_SUCANCEL,
        IDM_SERVICE_EVENT_DL_START,
        IDM_SERVICE_EVENT_DL_FINISH,
        IDM_SERVICE_EVENT_DL_CANCEL;

        private static final IDM_SERVICE_EVENT[] values = values();

        public static IDM_SERVICE_EVENT valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }
}
