package com.idm.core.ddf;

/* loaded from: classes.dex */
public class DDFTag {
    private final String name;
    private String value;

    public DDFTag(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
