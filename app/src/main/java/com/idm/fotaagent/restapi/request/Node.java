package com.idm.fotaagent.restapi.request;

import java.util.Optional;

/* loaded from: classes.dex */
public class Node {
    private final String content;
    private final String tag;

    public Node(String str, String str2) {
        this.tag = str;
        this.content = str2;
    }

    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }

    public String tag() {
        return this.tag;
    }
}
