package com.wssyncmldm.databinding;

import android.database.SQLException;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.databinding.f;
import androidx.databinding.h;
import androidx.databinding.q;
import androidx.databinding.v;
import androidx.lifecycle.F;
import com.idm.fotaagent.enabler.ui.admin.profile.AdminProfileViewModel;
import com.idm.fotaagent.enabler.ui.common.ColoredPaddingView;
import com.wssyncmldm.R;
import com.wssyncmldm.generated.callback.OnClickListener;
import g3.y;

/* loaded from: classes.dex */
public class ProfileEditBindingImpl extends ProfileEditBinding implements OnClickListener.Listener {
    private static final q sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private h clientAuthandroidSelectedItemPositionAttrChanged;
    private h clientIdandroidTextAttrChanged;
    private h clientPwdandroidTextAttrChanged;
    private final View.OnClickListener mCallback2;
    private long mDirtyFlags;
    private final ScrollView mboundView0;
    private h profileNameandroidTextAttrChanged;
    private h serverAddressandroidTextAttrChanged;
    private h serverAuthandroidSelectedItemPositionAttrChanged;
    private h serverIdandroidTextAttrChanged;
    private h serverPwdandroidTextAttrChanged;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.included_window_inset, 10);
        sparseIntArray.put(R.id.ProfileLinear, 11);
    }

    public ProfileEditBindingImpl(f fVar, View view) {
        this(fVar, view, v.mapBindings(fVar, view, 12, (q) null, sViewsWithIds));
    }

    private boolean onChangeViewModelClientAuthTypeIndex(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelClientId(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeViewModelClientPwd(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelProfileName(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelServerAuthTypeIndex(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelServerId(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelServerPwd(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelServerUrl(F f, int i5) {
        if (i5 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // com.wssyncmldm.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int i5, View view) throws SQLException {
        AdminProfileViewModel adminProfileViewModel = this.mViewModel;
        if (adminProfileViewModel != null) {
            adminProfileViewModel.saveProfileToDBIfPossible();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0116  */
    @Override // androidx.databinding.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wssyncmldm.databinding.ProfileEditBindingImpl.executeBindings():void");
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
            this.mDirtyFlags = 512L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.v
    public boolean onFieldChange(int i5, Object obj, int i6) {
        switch (i5) {
            case 0:
                return onChangeViewModelServerUrl((F) obj, i6);
            case 1:
                return onChangeViewModelProfileName((F) obj, i6);
            case 2:
                return onChangeViewModelServerPwd((F) obj, i6);
            case 3:
                return onChangeViewModelServerId((F) obj, i6);
            case 4:
                return onChangeViewModelClientPwd((F) obj, i6);
            case 5:
                return onChangeViewModelServerAuthTypeIndex((F) obj, i6);
            case 6:
                return onChangeViewModelClientId((F) obj, i6);
            case 7:
                return onChangeViewModelClientAuthTypeIndex((F) obj, i6);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.v
    public boolean setVariable(int i5, Object obj) {
        if (6 != i5) {
            return false;
        }
        setViewModel((AdminProfileViewModel) obj);
        return true;
    }

    @Override // com.wssyncmldm.databinding.ProfileEditBinding
    public void setViewModel(AdminProfileViewModel adminProfileViewModel) {
        this.mViewModel = adminProfileViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        notifyPropertyChanged(6);
        super.requestRebind();
    }

    private ProfileEditBindingImpl(f fVar, View view, Object[] objArr) {
        super(fVar, view, 8, (LinearLayout) objArr[11], (Spinner) objArr[8], (EditText) objArr[6], (EditText) objArr[7], (ColoredPaddingView) objArr[10], (EditText) objArr[1], (Button) objArr[9], (EditText) objArr[2], (Spinner) objArr[5], (EditText) objArr[3], (EditText) objArr[4]);
        this.clientAuthandroidSelectedItemPositionAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.1
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                int selectedItemPosition = ProfileEditBindingImpl.this.clientAuth.getSelectedItemPosition();
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.clientAuthTypeIndex) == null) {
                    return;
                }
                f.k(Integer.valueOf(selectedItemPosition));
            }
        };
        this.clientIdandroidTextAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.2
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                String strG = y.G(ProfileEditBindingImpl.this.clientId);
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.clientId) == null) {
                    return;
                }
                f.k(strG);
            }
        };
        this.clientPwdandroidTextAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.3
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                String strG = y.G(ProfileEditBindingImpl.this.clientPwd);
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.clientPwd) == null) {
                    return;
                }
                f.k(strG);
            }
        };
        this.profileNameandroidTextAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.4
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                String strG = y.G(ProfileEditBindingImpl.this.profileName);
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.profileName) == null) {
                    return;
                }
                f.k(strG);
            }
        };
        this.serverAddressandroidTextAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.5
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                String strG = y.G(ProfileEditBindingImpl.this.serverAddress);
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.serverUrl) == null) {
                    return;
                }
                f.k(strG);
            }
        };
        this.serverAuthandroidSelectedItemPositionAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.6
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                int selectedItemPosition = ProfileEditBindingImpl.this.serverAuth.getSelectedItemPosition();
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.serverAuthTypeIndex) == null) {
                    return;
                }
                f.k(Integer.valueOf(selectedItemPosition));
            }
        };
        this.serverIdandroidTextAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.7
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                String strG = y.G(ProfileEditBindingImpl.this.serverId);
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.serverId) == null) {
                    return;
                }
                f.k(strG);
            }
        };
        this.serverPwdandroidTextAttrChanged = new h() { // from class: com.wssyncmldm.databinding.ProfileEditBindingImpl.8
            @Override // androidx.databinding.h
            public void onChange() {
                F f;
                String strG = y.G(ProfileEditBindingImpl.this.serverPwd);
                AdminProfileViewModel adminProfileViewModel = ProfileEditBindingImpl.this.mViewModel;
                if (adminProfileViewModel == null || (f = adminProfileViewModel.serverPwd) == null) {
                    return;
                }
                f.k(strG);
            }
        };
        this.mDirtyFlags = -1L;
        this.clientAuth.setTag(null);
        this.clientId.setTag(null);
        this.clientPwd.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.mboundView0 = scrollView;
        scrollView.setTag(null);
        this.profileName.setTag(null);
        this.saveBtn.setTag(null);
        this.serverAddress.setTag(null);
        this.serverAuth.setTag(null);
        this.serverId.setTag(null);
        this.serverPwd.setTag(null);
        setRootTag(view);
        this.mCallback2 = new OnClickListener(this, 1);
        invalidateAll();
    }
}
