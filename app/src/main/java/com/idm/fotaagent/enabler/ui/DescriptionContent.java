package com.idm.fotaagent.enabler.ui;

import java.io.Serializable;

/* loaded from: classes.dex */
public class DescriptionContent implements Serializable {
    private static final long serialVersionUID = -6158186463429686328L;
    private final String description;
    private final String summaryDescription;
    private final String type;

    public DescriptionContent(String str, String str2, String str3) {
        this.description = str;
        this.summaryDescription = str2 == null ? "" : str2;
        this.type = str3 == null ? "" : str3;
    }

    public String description() {
        return this.description;
    }

    public boolean existsSummaryDescription() {
        return !this.summaryDescription.isEmpty();
    }

    public String summaryDescription() {
        return this.summaryDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DescriptionContent{description='");
        sb.append(this.description);
        sb.append("', summaryDescription='");
        sb.append(this.summaryDescription);
        sb.append("', type='");
        return A3.f.p(sb, this.type, "'}");
    }

    public String type() {
        return this.type;
    }

    public DescriptionContent(String str, String str2) {
        this(str, "", str2);
    }
}
