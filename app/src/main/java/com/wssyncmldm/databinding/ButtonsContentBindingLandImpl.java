package com.wssyncmldm.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.f;
import androidx.databinding.q;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.common.ButtonOnClickListener;
import com.idm.fotaagent.enabler.ui.common.viewmodel.ButtonsContentViewModel;
import com.samsung.android.fotaagent.common.view.ButtonWithLimitedFontSizeAndWidth;
import com.wssyncmldm.R;
import g3.y;

/* loaded from: classes.dex */
public class ButtonsContentBindingLandImpl extends ButtonsContentBinding {
    private static final q sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.layout_mediumEmphasis, 3);
    }

    public ButtonsContentBindingLandImpl(f fVar, View view) {
        this(fVar, view, v.mapBindings(fVar, view, 4, (q) null, sViewsWithIds));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.v
    public void executeBindings() {
        long j5;
        ButtonOnClickListener buttonOnClickListener;
        String str;
        String highEmphasisButtonTitle;
        int i5;
        ButtonOnClickListener buttonOnClickListenerHighEmphasisButtonOnClickListener;
        synchronized (this) {
            j5 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ButtonsContentViewModel buttonsContentViewModel = this.mButtonContentViewModel;
        long j6 = j5 & 3;
        ButtonOnClickListener buttonOnClickListener2 = null;
        if (j6 != 0) {
            if (buttonsContentViewModel != null) {
                ButtonOnClickListener buttonOnClickListenerMediumEmphasisButtonOnClickListener = buttonsContentViewModel.mediumEmphasisButtonOnClickListener();
                String mediumEmphasisButtonTitle = buttonsContentViewModel.getMediumEmphasisButtonTitle();
                highEmphasisButtonTitle = buttonsContentViewModel.getHighEmphasisButtonTitle();
                buttonOnClickListenerHighEmphasisButtonOnClickListener = buttonsContentViewModel.highEmphasisButtonOnClickListener();
                buttonOnClickListener = buttonOnClickListenerMediumEmphasisButtonOnClickListener;
                buttonOnClickListener2 = mediumEmphasisButtonTitle;
            } else {
                buttonOnClickListener = null;
                buttonOnClickListenerHighEmphasisButtonOnClickListener = null;
                highEmphasisButtonTitle = null;
            }
            boolean z4 = buttonOnClickListener2 == null;
            boolean z5 = highEmphasisButtonTitle == null;
            if (j6 != 0) {
                j5 |= z4 ? 32L : 16L;
            }
            if ((j5 & 3) != 0) {
                j5 |= z5 ? 8L : 4L;
            }
            i5 = z4 ? 8 : 0;
            i = z5 ? 8 : 0;
            str = buttonOnClickListener2;
            buttonOnClickListener2 = buttonOnClickListenerHighEmphasisButtonOnClickListener;
        } else {
            buttonOnClickListener = null;
            str = 0;
            highEmphasisButtonTitle = null;
            i5 = 0;
        }
        if ((j5 & 3) != 0) {
            this.btHighEmphasis.setOnClickListener(buttonOnClickListener2);
            y.X(this.btHighEmphasis, highEmphasisButtonTitle);
            this.btHighEmphasis.setVisibility(i);
            this.btMediumEmphasis.setOnClickListener(buttonOnClickListener);
            y.X(this.btMediumEmphasis, str);
            this.btMediumEmphasis.setVisibility(i5);
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

    @Override // com.wssyncmldm.databinding.ButtonsContentBinding
    public void setButtonContentViewModel(ButtonsContentViewModel buttonsContentViewModel) {
        this.mButtonContentViewModel = buttonsContentViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean setVariable(int i5, Object obj) {
        if (2 != i5) {
            return false;
        }
        setButtonContentViewModel((ButtonsContentViewModel) obj);
        return true;
    }

    private ButtonsContentBindingLandImpl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ButtonWithLimitedFontSizeAndWidth) objArr[2], (ButtonWithLimitedFontSizeAndWidth) objArr[1], (LinearLayout) objArr[0], (LinearLayout) objArr[3]);
        this.mDirtyFlags = -1L;
        this.btHighEmphasis.setTag(null);
        this.btMediumEmphasis.setTag(null);
        this.buttonsContent.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
