package com.idm.agent.dm.uic;

/* loaded from: classes.dex */
public interface IDMDmUICInterface {
    public static final int IDM_UIC_ECHOTYPE_PASSWORD = 2;
    public static final int IDM_UIC_ECHOTYPE_TEXT = 1;
    public static final String IDM_UIC_OPTION_DEFAULT = "MINDT=30";
    public static final String IDM_UIC_OPTION_DR = "DR";
    public static final String IDM_UIC_OPTION_DR_ACCEPT = "1";
    public static final String IDM_UIC_OPTION_DR_REJECT = "0";
    public static final String IDM_UIC_OPTION_ET = "ET";
    public static final String IDM_UIC_OPTION_ET_P = "P";
    public static final String IDM_UIC_OPTION_ET_T = "T";
    public static final String IDM_UIC_OPTION_IT = "IT";
    public static final String IDM_UIC_OPTION_IT_A = "A";
    public static final String IDM_UIC_OPTION_IT_D = "D";
    public static final String IDM_UIC_OPTION_IT_I = "I";
    public static final String IDM_UIC_OPTION_IT_N = "N";
    public static final String IDM_UIC_OPTION_IT_P = "P";
    public static final String IDM_UIC_OPTION_IT_T = "T";
    public static final String IDM_UIC_OPTION_MAXDT = "MAXDT";
    public static final String IDM_UIC_OPTION_MAXLEN = "MAXLEN";
    public static final String IDM_UIC_OPTION_MINDT = "MINDT";
    public static final String IDM_UIC_STATUS_CANCEL = "214";
    public static final String IDM_UIC_STATUS_OK = "200";
    public static final String IDM_UIC_STATUS_REJECT = "304";
    public static final String IDM_UIC_STATUS_TIMEOUT = "215";
    public static final int IDM_UIC_TASK_EVENT_END = 2;
    public static final int IDM_UIC_TASK_EVENT_START = 1;

    public enum UIC_DIALOG_TYPE {
        IDM_UIC_TYPE_NONE,
        IDM_UIC_TYPE_DISPLAY,
        IDM_UIC_TYPE_CONFIRMATION,
        IDM_UIC_TYPE_USER_INPUT,
        IDM_UIC_TYPE_SINGLE_CHOICE,
        IDM_UIC_TYPE_MULTIPLE_CHOICE;

        private static final UIC_DIALOG_TYPE[] values = values();

        public static UIC_DIALOG_TYPE valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }

    public enum UIC_INPUT_TYPE {
        IDM_UIC_INPUTTYPE_NONE,
        IDM_UIC_INPUTTYPE_ALPHANUMERIC,
        IDM_UIC_INPUTTYPE_NUMERIC,
        IDM_UIC_INPUTTYPE_DATE,
        IDM_UIC_INPUTTYPE_TIME,
        IDM_UIC_INPUTTYPE_PHONENUBMER,
        IDM_UIC_INPUTTYPE_IPADDRESS;

        private static final UIC_INPUT_TYPE[] values = values();

        public static UIC_INPUT_TYPE valueOf(int i5) {
            try {
                return values[i5];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new IllegalArgumentException(e5);
            }
        }
    }
}
