package com.idm.core.syncml;

/* loaded from: classes.dex */
public class Item {
    private String data;
    private Meta meta;
    private boolean moreData;
    private Source source;
    private Target target;

    public String getData() {
        return this.data;
    }

    public Meta getMeta() {
        return this.meta;
    }

    public Source getSource() {
        return this.source;
    }

    public Target getTarget() {
        return this.target;
    }

    public boolean isMoreData() {
        return this.moreData;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void setMoreData(boolean z4) {
        this.moreData = z4;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public String toString() {
        return "Item [Target=" + this.target + ", Source=" + this.source + ", Meta=" + this.meta + ", Data=" + this.data + ", MoreData=" + this.moreData + "]";
    }
}
