package com.idm.fotaagent.enabler.ui.admin.main.hidden.executor;

import android.content.Context;
import android.view.WindowManager;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.command.HiddenCommand;
import com.samsung.android.fotaagent.common.log.Log;
import g4.f;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class AdminCommandExecutor {
    public static final String PATH_FOR_NON_AB = "com.idm.fotaagent.enabler.ui.admin.main.hidden.command.";
    protected final Context context;

    public AdminCommandExecutor(Context context) {
        this.context = context;
    }

    public HiddenCommand createCommandInstance(String str) {
        return (HiddenCommand) Class.forName(getClassFullName(getPackagePath(), str)).getConstructor(Context.class).newInstance(this.context);
    }

    public void execute(String str) {
        try {
            if (str.isEmpty()) {
                return;
            }
            createCommandInstance(str).execute();
        } catch (WindowManager.BadTokenException unused) {
            Log.E("Use proper context");
            Log.I("There is no such command : " + str);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            Log.printStackTrace(e5);
            Log.I("There is no such command : " + str);
        }
    }

    public String getClassFullName(String str, String str2) {
        return f.c(str, str2.substring(0, 1).toUpperCase() + str2.substring(1));
    }

    public String getPackagePath() {
        return PATH_FOR_NON_AB;
    }
}
