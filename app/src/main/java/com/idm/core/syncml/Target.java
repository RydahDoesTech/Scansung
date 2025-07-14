package com.idm.core.syncml;

import A3.f;

/* loaded from: classes.dex */
public class Target extends Location {
    public Target() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target [LocURI=");
        sb.append(this.locURI);
        sb.append(", LocName=");
        return f.p(sb, this.locName, "]");
    }

    public Target(String str) {
        super(str, null);
    }

    public Target(String str, String str2) {
        super(str, str2);
    }
}
