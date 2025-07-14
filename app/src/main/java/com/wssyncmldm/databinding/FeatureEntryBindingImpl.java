package com.wssyncmldm.databinding;

import Y0.j;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.databinding.q;
import androidx.databinding.v;
import androidx.lifecycle.C;
import androidx.lifecycle.F;
import com.idm.fotaagent.enabler.ui.admin.fmsfeature.FeatureInjectionViewModel;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import g3.y;
import java.util.List;

/* loaded from: classes.dex */
public class FeatureEntryBindingImpl extends FeatureEntryBinding {
    private static final q sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private OnClickListenerImpl mFeatureEntryToggleDescriptionVisibilityAndroidViewViewOnClickListener;
    private final LinearLayout mboundView0;
    private final AppCompatSpinner mboundView2;
    private h mboundView2androidSelectedItemPositionAttrChanged;

    public static class OnClickListenerImpl implements View.OnClickListener {
        private FeatureInjectionViewModel.FeatureEntry value;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.value.toggleDescriptionVisibility(view);
        }

        public OnClickListenerImpl setValue(FeatureInjectionViewModel.FeatureEntry featureEntry) {
            this.value = featureEntry;
            if (featureEntry == null) {
                return null;
            }
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.injection_toggle, 4);
    }

    public FeatureEntryBindingImpl(f fVar, View view) {
        this(fVar, view, v.mapBindings(fVar, view, 5, (q) null, sViewsWithIds));
    }

    private boolean onChangeFeatureEntryDescriptionVisibility(C c2, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeFeatureEntrySelectedValueIndex(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.v
    public void executeBindings() {
        long j5;
        long j6;
        int iSafeUnbox;
        String str;
        List<String> list;
        String str2;
        OnClickListenerImpl value;
        synchronized (this) {
            j5 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        FeatureInjectionViewModel.FeatureEntry featureEntry = this.mFeatureEntry;
        int iSafeUnbox2 = 0;
        if ((15 & j5) != 0) {
            if ((j5 & 12) == 0 || featureEntry == null) {
                str = null;
                list = null;
                str2 = null;
                value = null;
            } else {
                str = featureEntry.name;
                OnClickListenerImpl onClickListenerImpl = this.mFeatureEntryToggleDescriptionVisibilityAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new OnClickListenerImpl();
                    this.mFeatureEntryToggleDescriptionVisibilityAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(featureEntry);
                str2 = featureEntry.description;
                list = featureEntry.candidateValues;
            }
            if ((j5 & 13) != 0) {
                F selectedValueIndex = featureEntry != null ? featureEntry.getSelectedValueIndex() : null;
                updateLiveDataRegistration(0, selectedValueIndex);
                iSafeUnbox = v.safeUnbox(selectedValueIndex != null ? (Integer) selectedValueIndex.d() : null);
            } else {
                iSafeUnbox = 0;
            }
            if ((j5 & 14) != 0) {
                C descriptionVisibility = featureEntry != null ? featureEntry.getDescriptionVisibility() : null;
                updateLiveDataRegistration(1, descriptionVisibility);
                iSafeUnbox2 = v.safeUnbox(descriptionVisibility != null ? (Integer) descriptionVisibility.d() : null);
            }
            j6 = 12;
        } else {
            j6 = 12;
            iSafeUnbox = 0;
            str = null;
            list = null;
            str2 = null;
            value = null;
        }
        if ((j5 & j6) != 0) {
            y.X(this.description, str2);
            this.description.setOnClickListener(value);
            j.O(this.mboundView2, list);
            y.X(this.name, str);
            this.name.setOnClickListener(value);
        }
        if ((j5 & 14) != 0) {
            this.description.setVisibility(iSafeUnbox2);
        }
        if ((j5 & 13) != 0) {
            AppCompatSpinner appCompatSpinner = this.mboundView2;
            if (appCompatSpinner.getSelectedItemPosition() != iSafeUnbox) {
                appCompatSpinner.setSelection(iSafeUnbox);
            }
        }
        if ((j5 & 8) != 0) {
            AbstractC0415a.U(this.mboundView2, null, this.mboundView2androidSelectedItemPositionAttrChanged);
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
            this.mDirtyFlags = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean onFieldChange(int i5, Object obj, int i6) {
        if (i5 == 0) {
            return onChangeFeatureEntrySelectedValueIndex((F) obj, i6);
        }
        if (i5 != 1) {
            return false;
        }
        return onChangeFeatureEntryDescriptionVisibility((C) obj, i6);
    }

    @Override // com.wssyncmldm.databinding.FeatureEntryBinding
    public void setFeatureEntry(FeatureInjectionViewModel.FeatureEntry featureEntry) {
        this.mFeatureEntry = featureEntry;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean setVariable(int i5, Object obj) {
        if (4 != i5) {
            return false;
        }
        setFeatureEntry((FeatureInjectionViewModel.FeatureEntry) obj);
        return true;
    }

    private FeatureEntryBindingImpl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (AppCompatTextView) objArr[3], (SwitchCompat) objArr[4], (AppCompatTextView) objArr[1]);
        this.mboundView2androidSelectedItemPositionAttrChanged = new h() { // from class: com.wssyncmldm.databinding.FeatureEntryBindingImpl.1
            @Override // androidx.databinding.h
            public void onChange() {
                F selectedValueIndex;
                int selectedItemPosition = FeatureEntryBindingImpl.this.mboundView2.getSelectedItemPosition();
                FeatureInjectionViewModel.FeatureEntry featureEntry = FeatureEntryBindingImpl.this.mFeatureEntry;
                if (featureEntry == null || (selectedValueIndex = featureEntry.getSelectedValueIndex()) == null) {
                    return;
                }
                selectedValueIndex.k(Integer.valueOf(selectedItemPosition));
            }
        };
        this.mDirtyFlags = -1L;
        this.description.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) objArr[2];
        this.mboundView2 = appCompatSpinner;
        appCompatSpinner.setTag(null);
        this.name.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
