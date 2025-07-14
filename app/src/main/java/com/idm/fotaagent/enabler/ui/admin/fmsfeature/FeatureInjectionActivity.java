package com.idm.fotaagent.enabler.ui.admin.fmsfeature;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjectionViewModel;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;
import com.wssyncmldm.databinding.FeatureEntryBinding;
import com.wssyncmldm.databinding.FeatureListBinding;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class FeatureInjectionActivity extends WindowInsetsBaseActivity {

    public static class FeatureAttributeAdapter extends ArrayAdapter<FeatureInjectionViewModel.FeatureEntry> {
        private final FeatureInjectionActivity activity;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$getView$0(FeatureEntryBinding featureEntryBinding, Integer num) {
            Log.V(num + "");
            if (num.intValue() == 0) {
                AppCompatTextView appCompatTextView = featureEntryBinding.description;
                Log.V(appCompatTextView.getText().toString());
                appCompatTextView.getParent().requestChildFocus(appCompatTextView, appCompatTextView);
            }
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            FeatureEntryBinding featureEntryBinding;
            View root;
            int i6 = 0;
            Log.V("" + i5);
            FeatureInjectionViewModel.FeatureEntry featureEntry = (FeatureInjectionViewModel.FeatureEntry) getItem(i5);
            Objects.requireNonNull(featureEntry, "featureEntry should not be null");
            if (view == null) {
                featureEntryBinding = (FeatureEntryBinding) g.c(this.activity.getLayoutInflater(), R.layout.feature_entry, viewGroup, false);
                featureEntryBinding.setLifecycleOwner(this.activity);
                featureEntry.getDescriptionVisibility().e(this.activity, new a(i6, featureEntryBinding));
                root = featureEntryBinding.getRoot();
            } else {
                DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
                featureEntryBinding = (FeatureEntryBinding) v.getBinding(view);
                root = view;
            }
            featureEntryBinding.setFeatureEntry(featureEntry);
            return root;
        }

        private FeatureAttributeAdapter(FeatureInjectionActivity featureInjectionActivity, List<FeatureInjectionViewModel.FeatureEntry> list) {
            super(featureInjectionActivity, R.layout.feature_entry, list);
            this.activity = featureInjectionActivity;
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void doOnCreate() {
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void setContentView() {
        FeatureInjectionViewModel featureInjectionViewModel = new FeatureInjectionViewModel();
        featureInjectionViewModel.loadFeatureEntriesFrom(CarrierFeature.class, FloatingFeature.class);
        FeatureListBinding featureListBinding = (FeatureListBinding) g.d(this, R.layout.feature_list);
        featureListBinding.listView.setAdapter((ListAdapter) new FeatureAttributeAdapter(featureInjectionViewModel.getFeatureEntries()));
        featureListBinding.setLifecycleOwner(this);
    }
}
