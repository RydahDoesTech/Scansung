package com.idm.fotaagent.enabler.ui.admin.fmsfeature;

import android.view.View;
import androidx.lifecycle.C;
import androidx.lifecycle.F;
import androidx.lifecycle.X;
import com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjector;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FeatureInjectionViewModel extends X {
    private List<FeatureEntry> featureEntries;

    public static class FeatureEntry {
        public final List<String> candidateValues;
        public final String description;
        private final F descriptionVisibility;
        private final FeatureInjector featureInjector;
        public final String name;
        private final F selectedValueIndex;

        public FeatureEntry(String str, List<String> list, String str2, FeatureInjector featureInjector) {
            this.featureInjector = featureInjector;
            this.name = str;
            ArrayList arrayList = new ArrayList();
            this.candidateValues = arrayList;
            arrayList.add("SELECT");
            arrayList.addAll(list);
            F f = new F();
            this.selectedValueIndex = f;
            f.k(Integer.valueOf(featureInjector.indexOfInjectedValue(str) + 1));
            f.f(new a(1, this));
            this.description = str2;
            F f5 = new F();
            this.descriptionVisibility = f5;
            f5.k(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void performFeatureInjection(Integer num) {
            Log.V("index: " + num + " name: " + this.name + " featureInjector: " + this.featureInjector);
            if (num.intValue() == 0) {
                this.featureInjector.restore(this.name);
                return;
            }
            try {
                this.featureInjector.inject(this.name, this.candidateValues.get(num.intValue()));
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e5) {
                Log.printStackTrace(e5);
            }
        }

        public C getDescriptionVisibility() {
            return this.descriptionVisibility;
        }

        public F getSelectedValueIndex() {
            return this.selectedValueIndex;
        }

        public void toggleDescriptionVisibility(View view) {
            Integer num = (Integer) this.descriptionVisibility.d();
            Log.V("descriptionVisibility: " + num);
            if (num == null) {
                Log.E("visibility should not be null; fallback to View.GONE");
                num = 8;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                this.descriptionVisibility.k(8);
            } else {
                if (iIntValue == 8) {
                    this.descriptionVisibility.k(0);
                    return;
                }
                Log.W("unexpected value: " + this.descriptionVisibility.d());
            }
        }
    }

    public List<FeatureEntry> getFeatureEntries() {
        return Collections.unmodifiableList(this.featureEntries);
    }

    public void loadFeatureEntriesFrom(Class<?>... clsArr) {
        if (this.featureEntries != null) {
            return;
        }
        this.featureEntries = new ArrayList();
        for (Class<?> cls : clsArr) {
            FeatureInjector featureInjector = FeatureInjector.get(cls);
            for (FeatureInjector.FeatureInfo featureInfo : featureInjector.getFeatureInfos()) {
                this.featureEntries.add(new FeatureEntry(featureInfo.getName(), featureInfo.getCandidateValues(), featureInfo.getDescription(), featureInjector));
            }
        }
    }
}
