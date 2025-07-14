package com.wssyncmldm.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.f;
import androidx.databinding.q;
import androidx.databinding.v;
import com.idm.fotaagent.enabler.ui.admin.feature.AdminActionViewModel;
import com.wssyncmldm.generated.callback.OnClickListener;
import g3.y;

/* loaded from: classes.dex */
public class AdminActionBindingImpl extends AdminActionBinding implements OnClickListener.Listener {
    private static final q sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private final View.OnClickListener mCallback3;
    private final View.OnClickListener mCallback4;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final AppCompatButton mboundView1;
    private final AppCompatButton mboundView2;

    public AdminActionBindingImpl(f fVar, View view) {
        this(fVar, view, v.mapBindings(fVar, view, 3, (q) null, sViewsWithIds));
    }

    @Override // com.wssyncmldm.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int i5, View view) {
        AdminActionViewModel.Action action;
        AdminActionViewModel.Actions actions;
        AdminActionViewModel.Action action2;
        if (i5 != 1) {
            if (i5 != 2 || (actions = this.mActions) == null || (action2 = actions.rightAction) == null) {
                return;
            }
            action2.doAction();
            return;
        }
        AdminActionViewModel.Actions actions2 = this.mActions;
        if (actions2 == null || (action = actions2.leftAction) == null) {
            return;
        }
        action.doAction();
    }

    @Override // androidx.databinding.v
    public void executeBindings() {
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        AdminActionViewModel.Actions actions = this.mActions;
        long j6 = j5 & 3;
        String str3 = null;
        if (j6 != 0) {
            if (actions != null) {
                str3 = actions.rightButtonName;
                str2 = actions.leftButtonName;
            } else {
                str2 = null;
            }
            boolean z4 = str3 == null;
            if (j6 != 0) {
                j5 |= z4 ? 8L : 4L;
            }
            i = z4 ? 8 : 0;
            String str4 = str3;
            str3 = str2;
            str = str4;
        } else {
            str = null;
        }
        if ((3 & j5) != 0) {
            y.X(this.mboundView1, str3);
            y.X(this.mboundView2, str);
            this.mboundView2.setVisibility(i);
        }
        if ((j5 & 2) != 0) {
            this.mboundView1.setOnClickListener(this.mCallback3);
            this.mboundView2.setOnClickListener(this.mCallback4);
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

    @Override // com.wssyncmldm.databinding.AdminActionBinding
    public void setActions(AdminActionViewModel.Actions actions) {
        this.mActions = actions;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean setVariable(int i5, Object obj) {
        if (1 != i5) {
            return false;
        }
        setActions((AdminActionViewModel.Actions) obj);
        return true;
    }

    private AdminActionBindingImpl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 0);
        this.mDirtyFlags = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        AppCompatButton appCompatButton = (AppCompatButton) objArr[1];
        this.mboundView1 = appCompatButton;
        appCompatButton.setTag(null);
        AppCompatButton appCompatButton2 = (AppCompatButton) objArr[2];
        this.mboundView2 = appCompatButton2;
        appCompatButton2.setTag(null);
        setRootTag(view);
        this.mCallback3 = new OnClickListener(this, 1);
        this.mCallback4 = new OnClickListener(this, 2);
        invalidateAll();
    }
}
