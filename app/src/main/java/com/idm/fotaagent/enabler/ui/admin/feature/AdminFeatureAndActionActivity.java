package com.idm.fotaagent.enabler.ui.admin.feature;

import D3.c;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.g;
import androidx.databinding.v;
import androidx.lifecycle.Z;
import b3.AbstractC0219i;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel;
import com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity;
import com.wssyncmldm.R;
import com.wssyncmldm.databinding.AdminActionBinding;
import com.wssyncmldm.databinding.AdminFeatureActionActivityBinding;
import com.wssyncmldm.databinding.AdminFeatureBinding;
import java.util.List;

/* loaded from: classes.dex */
public class AdminFeatureAndActionActivity extends WindowInsetsBaseActivity {

    public static class ActionsArrayAdapter extends ArrayAdapter<AdminActionViewModel.Actions> {
        private AdminFeatureAndActionActivity activity;

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            AdminActionBinding adminActionBinding;
            View root;
            AdminActionViewModel.Actions actions = (AdminActionViewModel.Actions) getItem(i5);
            if (view == null) {
                adminActionBinding = (AdminActionBinding) g.c(this.activity.getLayoutInflater(), R.layout.admin_action, viewGroup, false);
                adminActionBinding.setLifecycleOwner(this.activity);
                root = adminActionBinding.getRoot();
            } else {
                DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
                adminActionBinding = (AdminActionBinding) v.getBinding(view);
                root = view;
            }
            adminActionBinding.setActions(actions);
            return root;
        }

        private ActionsArrayAdapter(AdminFeatureAndActionActivity adminFeatureAndActionActivity, List<AdminActionViewModel.Actions> list) {
            super(adminFeatureAndActionActivity, R.layout.admin_action, list);
            this.activity = adminFeatureAndActionActivity;
        }
    }

    public static class FeatureArrayAdapter extends ArrayAdapter<Feature<?>> {
        private final AdminFeatureAndActionActivity activity;

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            AdminFeatureBinding adminFeatureBinding;
            View root;
            Feature feature = (Feature) getItem(i5);
            if (view == null) {
                adminFeatureBinding = (AdminFeatureBinding) g.c(this.activity.getLayoutInflater(), R.layout.admin_feature, viewGroup, false);
                adminFeatureBinding.setLifecycleOwner(this.activity);
                root = adminFeatureBinding.getRoot();
            } else {
                DataBinderMapperImpl dataBinderMapperImpl = g.f3629a;
                adminFeatureBinding = (AdminFeatureBinding) v.getBinding(view);
                root = view;
            }
            adminFeatureBinding.setFeature(feature);
            return root;
        }

        private FeatureArrayAdapter(AdminFeatureAndActionActivity adminFeatureAndActionActivity, List<Feature<?>> list) {
            super(adminFeatureAndActionActivity, R.layout.admin_feature, list);
            this.activity = adminFeatureAndActionActivity;
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void doOnCreate() {
    }

    @Override // com.idm.fotaagent.enabler.ui.common.WindowInsetsBaseActivity
    public void setContentView() {
        Application application = getApplication();
        if (application == null) {
            throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        if (Z.f4006h == null) {
            Z.f4006h = new Z(application);
        }
        Z z4 = Z.f4006h;
        AbstractC0219i.b(z4);
        AdminFeatureViewModel adminFeatureViewModel = (AdminFeatureViewModel) new c(getViewModelStore(), z4).d(AdminFeatureViewModel.class);
        Application application2 = getApplication();
        if (application2 == null) {
            throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
        }
        if (Z.f4006h == null) {
            Z.f4006h = new Z(application2);
        }
        Z z5 = Z.f4006h;
        AbstractC0219i.b(z5);
        AdminActionViewModel adminActionViewModel = (AdminActionViewModel) new c(getViewModelStore(), z5).d(AdminActionViewModel.class);
        AdminFeatureActionActivityBinding adminFeatureActionActivityBinding = (AdminFeatureActionActivityBinding) g.d(this, R.layout.admin_feature_action_activity);
        adminFeatureActionActivityBinding.listFeatures.setAdapter((ListAdapter) new FeatureArrayAdapter(adminFeatureViewModel.getFeatureList(getApplicationContext())));
        adminFeatureActionActivityBinding.listActions.setAdapter((ListAdapter) new ActionsArrayAdapter(adminActionViewModel.getActionsList(this)));
        adminFeatureActionActivityBinding.setLifecycleOwner(this);
    }
}
