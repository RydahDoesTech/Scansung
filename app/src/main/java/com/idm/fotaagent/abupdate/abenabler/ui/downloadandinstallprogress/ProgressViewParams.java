package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import java.util.Optional;

/* loaded from: classes.dex */
public class ProgressViewParams {
    private final Integer percent;
    private final String title;
    private final Integer titleStyle;

    public static class Builder {
        private Integer percent;
        private final String title;
        private Integer titleStyle;

        public Builder(String str) {
            this.title = str;
        }

        public ProgressViewParams build() {
            return new ProgressViewParams(this);
        }

        public Builder withPercent(int i5) {
            this.percent = Integer.valueOf(i5);
            return this;
        }

        public Builder withTitleStyle(int i5) {
            this.titleStyle = Integer.valueOf(i5);
            return this;
        }
    }

    public Optional<Integer> getPercent() {
        return Optional.ofNullable(this.percent);
    }

    public String getTitle() {
        return this.title;
    }

    public Optional<Integer> getTitleStyle() {
        return Optional.ofNullable(this.titleStyle);
    }

    private ProgressViewParams(Builder builder) {
        this.title = builder.title;
        this.titleStyle = builder.titleStyle;
        this.percent = builder.percent;
    }
}
