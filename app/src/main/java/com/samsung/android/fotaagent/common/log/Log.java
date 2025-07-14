package com.samsung.android.fotaagent.common.log;

import E2.b;
import android.content.Context;
import com.idm.adapter.filesystem.c;
import com.idm.agent.dm.IDMDmInterface;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Comparator;

/* loaded from: classes.dex */
public class Log {
    private static final int ADDITIONAL_DEPTH_IN_CALL_STACK = 1;
    static final AndroidLogger ANDROID_LOGGER = AndroidLogger.of("IDM_FOTA", 1);
    private static Logger DEFAULT_LOGGER = Logger.STUB;
    public static final String LOG_DIRECTORY = "file_log";
    public static final String TAG_NAME = "IDM_FOTA";

    public static class Bootstrap extends AndroidAndFileLogger {
        private static volatile Bootstrap INSTANCE;

        private Bootstrap(Context context, String str, int i5, int i6) {
            super(context, str, i5, i6);
        }

        public static Bootstrap get(Context context) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            synchronized (Bootstrap.class) {
                try {
                    if (INSTANCE != null) {
                        return INSTANCE;
                    }
                    Bootstrap bootstrap = new Bootstrap(context, "dm_bootstrap.log", 2, IDMDmInterface.IDM_MAX_OBJ_SIZE);
                    INSTANCE = bootstrap;
                    return bootstrap;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class Default extends AndroidAndFileLogger {
        private static volatile Default INSTANCE;

        private Default(Context context, String str, int i5, int i6) {
            super(context, str, i5, i6);
        }

        public static Default get(Context context) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            synchronized (Default.class) {
                if (INSTANCE != null) {
                    return INSTANCE;
                }
                try {
                    Path path = context.getDir("log", 0).toPath();
                    if (Files.exists(path.resolve("fa_booting0.log"), new LinkOption[0])) {
                        Files.walk(path, new FileVisitOption[0]).sorted(Comparator.reverseOrder()).map(new b(1)).forEach(new c(0));
                    }
                } catch (IOException | RuntimeException e5) {
                    Log.ANDROID_LOGGER.printStackTrace(e5);
                }
                Default r12 = new Default(context, "fa_booting.log", 5, 204800);
                INSTANCE = r12;
                return r12;
            }
        }

        public void switchFileLoggerToSession() {
            this.fileLogger.I(Where.callerOf(2), ">>>>>   switch log file to fa_session.log   <<<<<");
            this.fileLogger.changeFileWriter(RotatingFileWriter.of(this.context, Log.LOG_DIRECTORY, "fa_session.log", 4, IDMDmInterface.IDM_MAX_OBJ_SIZE));
        }
    }

    public static class DownloadDescriptor extends LoggerCollection {
        private static volatile DownloadDescriptor INSTANCE;
        private final FileLogger fileLogger;

        private DownloadDescriptor(FileLogger fileLogger) {
            super(fileLogger);
            this.fileLogger = fileLogger;
        }

        public static DownloadDescriptor get(Context context) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            synchronized (DownloadDescriptor.class) {
                try {
                    if (INSTANCE != null) {
                        return INSTANCE;
                    }
                    DownloadDescriptor downloadDescriptor = new DownloadDescriptor(new FileLogger(RotatingFileWriter.of(context, Log.LOG_DIRECTORY, "dm_dd.log", 4, NetworkAnalyticsConstants.DataPoints.FLAG_PARENT_PROCESS_HASH)));
                    INSTANCE = downloadDescriptor;
                    return downloadDescriptor;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void forceFileLogger() {
            this.fileLogger.force();
        }
    }

    public static class FatalException extends AndroidAndFileLogger {
        private static volatile FatalException INSTANCE;

        private FatalException(Context context, String str, int i5, int i6) {
            super(context, str, i5, i6);
        }

        public static FatalException get(Context context) {
            if (INSTANCE != null) {
                return INSTANCE;
            }
            synchronized (FatalException.class) {
                try {
                    if (INSTANCE != null) {
                        return INSTANCE;
                    }
                    FatalException fatalException = new FatalException(context, "fe_wssyncmldm.log", 2, IDMDmInterface.IDM_MAX_OBJ_SIZE);
                    INSTANCE = fatalException;
                    return fatalException;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void D(Object obj) {
        DEFAULT_LOGGER.D(Where.callerOf(1), obj);
    }

    public static void E(Object obj) {
        DEFAULT_LOGGER.E(Where.callerOf(1), obj);
    }

    public static void H(Object obj) {
        DEFAULT_LOGGER.H(Where.callerOf(1), obj);
    }

    public static void I(Object obj) {
        DEFAULT_LOGGER.I(Where.callerOf(1), obj);
    }

    public static void V(Object obj) {
        DEFAULT_LOGGER.V(Where.callerOf(1), obj);
    }

    public static void W(Object obj) {
        DEFAULT_LOGGER.W(Where.callerOf(1), obj);
    }

    public static Logger bootstrapLogger(Context context) {
        return Bootstrap.get(context);
    }

    public static Logger defaultLogger(Context context) {
        Default r02 = Default.get(context);
        DEFAULT_LOGGER = r02;
        return r02;
    }

    public static Logger downloadDescriptorLogger(Context context) {
        return DownloadDescriptor.get(context);
    }

    public static Logger fatalExceptionLogger(Context context) {
        return FatalException.get(context);
    }

    public static void forceFileLogger(Context context) {
        Default.get(context).forceFileLogger();
        Bootstrap.get(context).forceFileLogger();
        FatalException.get(context).forceFileLogger();
        DownloadDescriptor.get(context).forceFileLogger();
    }

    public static void printStackTrace(Throwable th) {
        DEFAULT_LOGGER.printStackTrace(Where.callerOf(1), th);
    }

    public static void switchFileLoggerToSession(Context context) {
        Default.get(context).switchFileLoggerToSession();
    }

    public static void printStackTrace(Throwable th, Object obj) {
        DEFAULT_LOGGER.printStackTrace(Where.callerOf(1), th, obj);
    }

    public static class AndroidAndFileLogger extends LoggerCollection {
        final Context context;
        final FileLogger fileLogger;

        public AndroidAndFileLogger(Context context, String str, int i5, int i6) {
            this(context, Log.ANDROID_LOGGER, new FileLogger(RotatingFileWriter.of(context, Log.LOG_DIRECTORY, str, i5, i6)));
        }

        public void forceFileLogger() {
            this.fileLogger.force();
        }

        public AndroidAndFileLogger(Context context, AndroidLogger androidLogger, FileLogger fileLogger) {
            super(androidLogger, fileLogger);
            this.context = context.getApplicationContext();
            this.fileLogger = fileLogger;
        }
    }
}
