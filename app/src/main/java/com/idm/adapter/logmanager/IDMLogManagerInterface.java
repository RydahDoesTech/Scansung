package com.idm.adapter.logmanager;

/* loaded from: classes.dex */
interface IDMLogManagerInterface {
    public static final boolean IDM_LOG_ON = true;
    public static final boolean IDM_PRIVATE_ON = true;
    public static final String LOG_TAG = "IDM_FOTA";
    public static final int[] priorities = {3, 2, 3, 4, 5, 6, 7};

    public enum LogLevel {
        H(0),
        V(1),
        D(2),
        I(3),
        W(4),
        E(5),
        F(6);

        private int nLevel;

        LogLevel(int i5) {
            this.nLevel = i5;
        }

        public int getLevel() {
            return this.nLevel;
        }
    }

    void D(String str);

    void E(String str);

    void H(String str);

    void I(String str);

    void V(String str);

    void W(String str);

    void printStackTrace(Throwable th);
}
