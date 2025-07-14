package com.idm.fotaagent.restapi.restclient.push.campaign.button;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class Action implements Serializable {
    public static final String KEY_ACTION = "intent";
    public static final String KEY_DATA = "data";
    public static final String KEY_PACKAGENAME = "package";
    public static final String KEY_TYPE = "type";
    private static final long serialVersionUID = -2086251690694028780L;
    private final String actionForIntent;
    private final String data;
    private final String packageName;
    private final ActionType type;

    public static class Builder {
        private String actionForIntent;
        private String data;
        private String packageName;
        private final ActionType type;

        public Builder(ActionType actionType) {
            this.type = actionType;
        }

        public Builder actionForIntent(String str) {
            this.actionForIntent = str;
            return this;
        }

        public Action build() {
            ActionType actionType = this.type;
            if (actionType == ActionType.OK) {
                return new Action(this);
            }
            if (actionType != ActionType.LAUNCH_APP && TextUtils.isEmpty(this.actionForIntent)) {
                throw new IllegalArgumentException("actionForIntent should not be empty");
            }
            if (TextUtils.isEmpty(this.packageName)) {
                throw new IllegalArgumentException("packageName should not be empty");
            }
            return new Action(this);
        }

        public Builder data(String str) {
            this.data = str;
            return this;
        }

        public Builder packageName(String str) {
            this.packageName = str;
            return this;
        }
    }

    public static Action generateOkButtonAction() {
        return new Builder(ActionType.OK).build();
    }

    public void act(Context context) {
        this.type.act(context, createIntent(context));
    }

    public Intent createIntent(Context context) {
        PackageManager packageManager;
        if (this.type == ActionType.LAUNCH_APP && (packageManager = context.getPackageManager()) != null) {
            return packageManager.getLaunchIntentForPackage(this.packageName);
        }
        Intent intent = new Intent(this.actionForIntent).setPackage(this.packageName);
        if (!TextUtils.isEmpty(this.data)) {
            intent.setData(Uri.parse(this.data));
        }
        return intent;
    }

    private Action(Builder builder) {
        this.type = builder.type;
        this.actionForIntent = builder.actionForIntent;
        this.data = builder.data;
        this.packageName = builder.packageName;
    }
}
