package com.wssyncmldm.databinding;

import T.a;
import Y0.j;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.databinding.q;
import androidx.databinding.v;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.wssyncmldm.generated.callback.OnItemSelected;
import e1.AbstractC0415a;
import g3.y;
import java.util.List;

/* loaded from: classes.dex */
public class AdminFeatureBindingImpl extends AdminFeatureBinding implements OnItemSelected.Listener {
    private static final q sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private final a mCallback1;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final AppCompatTextView mboundView1;
    private final AppCompatSpinner mboundView2;
    private h mboundView2androidSelectedItemPositionAttrChanged;

    public AdminFeatureBindingImpl(f fVar, View view) {
        this(fVar, view, v.mapBindings(fVar, view, 3, (q) null, sViewsWithIds));
    }

    @Override // com.wssyncmldm.generated.callback.OnItemSelected.Listener
    public final void _internalCallbackOnItemSelected(int i5, AdapterView adapterView, View view, int i6, long j5) {
        Feature feature = this.mFeature;
        if (feature != null) {
            feature.onItemSelected(i6);
        }
    }

    @Override // androidx.databinding.v
    public void executeBindings() {
        long j5;
        String name;
        int i5;
        List<String> list;
        synchronized (this) {
            j5 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Feature feature = this.mFeature;
        long j6 = 3 & j5;
        if (j6 == 0 || feature == null) {
            name = null;
            i5 = 0;
            list = null;
        } else {
            name = feature.getName();
            i5 = feature.selectedPosition;
            list = feature.candidates;
        }
        if (j6 != 0) {
            y.X(this.mboundView1, name);
            j.O(this.mboundView2, list);
            AppCompatSpinner appCompatSpinner = this.mboundView2;
            if (appCompatSpinner.getSelectedItemPosition() != i5) {
                appCompatSpinner.setSelection(i5);
            }
        }
        if ((j5 & 2) != 0) {
            AbstractC0415a.U(this.mboundView2, this.mCallback1, this.mboundView2androidSelectedItemPositionAttrChanged);
        }
    }

    @Override // androidx.databinding.v
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.v
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean onFieldChange(int i5, Object obj, int i6) {
        return false;
    }

    @Override // com.wssyncmldm.databinding.AdminFeatureBinding
    public void setFeature(Feature feature) {
        this.mFeature = feature;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(3);
        super.requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean setVariable(int i5, Object obj) {
        if (3 != i5) {
            return false;
        }
        setFeature((Feature) obj);
        return true;
    }

    private AdminFeatureBindingImpl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0);
        this.mboundView2androidSelectedItemPositionAttrChanged = new h() { // from class: com.wssyncmldm.databinding.AdminFeatureBindingImpl.1
            @Override // androidx.databinding.h
            public void onChange() {
                int selectedItemPosition = AdminFeatureBindingImpl.this.mboundView2.getSelectedItemPosition();
                Feature feature = AdminFeatureBindingImpl.this.mFeature;
                if (feature != null) {
                    feature.selectedPosition = selectedItemPosition;
                }
            }
        };
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[1];
        this.mboundView1 = appCompatTextView;
        appCompatTextView.setTag(null);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) objArr[2];
        this.mboundView2 = appCompatSpinner;
        appCompatSpinner.setTag(null);
        setRootTag(view);
        this.mCallback1 = new OnItemSelected(this, 1);
        invalidateAll();
    }
}
