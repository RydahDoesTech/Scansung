package com.wssyncmldm.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SeslProgressBar;
import androidx.databinding.f;
import androidx.databinding.q;
import androidx.databinding.v;
import androidx.lifecycle.C;
import com.idm.fotaagent.enabler.ui.downloadprogress.ProgressBarContentViewModel;
import com.samsung.android.fotaagent.common.view.TextViewWithLimitedFontSize;

/* loaded from: classes.dex */
public class ProgressBarContentBindingImpl extends ProgressBarContentBinding {
    private static final q sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    public ProgressBarContentBindingImpl(f fVar, View view) {
        this(fVar, view, v.mapBindings(fVar, view, 4, (q) null, sViewsWithIds));
    }

    private boolean onChangeProgressBarContentViewModelGetFormattedRemainingTime(C c2, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeProgressBarContentViewModelPercent(C c2, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[PHI: r10
  0x003d: PHI (r10v2 int) = (r10v0 int), (r10v4 int) binds: [B:8:0x001b, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // androidx.databinding.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.mDirtyFlags     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            r14.mDirtyFlags = r2     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8c
            com.idm.fotaagent.enabler.ui.downloadprogress.ProgressBarContentViewModel r4 = r14.mProgressBarContentViewModel
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 14
            r8 = 13
            r10 = 0
            r11 = 0
            if (r5 == 0) goto L71
            long r12 = r0 & r8
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 == 0) goto L3d
            if (r4 == 0) goto L24
            androidx.lifecycle.C r5 = r4.getPercent()
            goto L25
        L24:
            r5 = r11
        L25:
            r14.updateLiveDataRegistration(r10, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.d()
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L32
        L31:
            r5 = r11
        L32:
            int r10 = androidx.databinding.v.safeUnbox(r5)
            if (r4 == 0) goto L3d
            java.lang.String r5 = r4.getFormattedPercent(r10)
            goto L3e
        L3d:
            r5 = r11
        L3e:
            long r12 = r0 & r6
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L6e
            if (r4 == 0) goto L4b
            androidx.lifecycle.C r4 = r4.getFormattedRemainingTime()
            goto L4c
        L4b:
            r4 = r11
        L4c:
            r12 = 1
            r14.updateLiveDataRegistration(r12, r4)
            if (r4 == 0) goto L59
            java.lang.Object r4 = r4.d()
            r11 = r4
            java.lang.String r11 = (java.lang.String) r11
        L59:
            com.samsung.android.fotaagent.common.view.TextViewWithLimitedFontSize r4 = r14.tvRemainTime
            android.content.res.Resources r4 = r4.getResources()
            r12 = 2131951665(0x7f130031, float:1.953975E38)
            java.lang.String r4 = r4.getString(r12)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r11 = java.lang.String.format(r4, r11)
        L6e:
            r4 = r11
            r11 = r5
            goto L72
        L71:
            r4 = r11
        L72:
            long r8 = r8 & r0
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 == 0) goto L81
            androidx.appcompat.widget.SeslProgressBar r5 = r14.progressBar
            r5.setProgress(r10)
            com.samsung.android.fotaagent.common.view.TextViewWithLimitedFontSize r5 = r14.tvPercent
            g3.y.X(r5, r11)
        L81:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L8b
            com.samsung.android.fotaagent.common.view.TextViewWithLimitedFontSize r14 = r14.tvRemainTime
            g3.y.X(r14, r4)
        L8b:
            return
        L8c:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wssyncmldm.databinding.ProgressBarContentBindingImpl.executeBindings():void");
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
            return onChangeProgressBarContentViewModelPercent((C) obj, i6);
        }
        if (i5 != 1) {
            return false;
        }
        return onChangeProgressBarContentViewModelGetFormattedRemainingTime((C) obj, i6);
    }

    @Override // com.wssyncmldm.databinding.ProgressBarContentBinding
    public void setProgressBarContentViewModel(ProgressBarContentViewModel progressBarContentViewModel) {
        this.mProgressBarContentViewModel = progressBarContentViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean setVariable(int i5, Object obj) {
        if (5 != i5) {
            return false;
        }
        setProgressBarContentViewModel((ProgressBarContentViewModel) obj);
        return true;
    }

    private ProgressBarContentBindingImpl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (SeslProgressBar) objArr[1], (TextViewWithLimitedFontSize) objArr[3], (TextViewWithLimitedFontSize) objArr[2]);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        this.progressBar.setTag(null);
        this.tvPercent.setTag(null);
        this.tvRemainTime.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
