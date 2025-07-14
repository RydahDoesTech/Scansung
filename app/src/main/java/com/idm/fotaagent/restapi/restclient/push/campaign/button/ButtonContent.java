package com.idm.fotaagent.restapi.restclient.push.campaign.button;

import java.io.Serializable;

/* loaded from: classes.dex */
public class ButtonContent implements Serializable {
    private static final long serialVersionUID = -7403523360196570838L;
    private final Action action;
    private final String title;

    public ButtonContent(String str, Action action) {
        this.title = str;
        this.action = action;
    }

    public Action action() {
        return this.action;
    }

    public String title() {
        return this.title;
    }
}
