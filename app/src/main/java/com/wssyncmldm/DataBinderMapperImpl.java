package com.wssyncmldm;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.v;
import com.wssyncmldm.databinding.AdminActionBindingImpl;
import com.wssyncmldm.databinding.AdminFeatureActionActivityBindingImpl;
import com.wssyncmldm.databinding.AdminFeatureBindingImpl;
import com.wssyncmldm.databinding.ButtonsContentBindingImpl;
import com.wssyncmldm.databinding.ButtonsContentBindingLandImpl;
import com.wssyncmldm.databinding.FeatureEntryBindingImpl;
import com.wssyncmldm.databinding.FeatureListBindingImpl;
import com.wssyncmldm.databinding.ProfileEditBindingImpl;
import com.wssyncmldm.databinding.ProgressBarContentBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends e {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ADMINACTION = 1;
    private static final int LAYOUT_ADMINFEATURE = 2;
    private static final int LAYOUT_ADMINFEATUREACTIONACTIVITY = 3;
    private static final int LAYOUT_BUTTONSCONTENT = 4;
    private static final int LAYOUT_FEATUREENTRY = 5;
    private static final int LAYOUT_FEATURELIST = 6;
    private static final int LAYOUT_PROFILEEDIT = 7;
    private static final int LAYOUT_PROGRESSBARCONTENT = 8;

    public static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(7);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actions");
            sparseArray.put(2, "buttonContentViewModel");
            sparseArray.put(3, "feature");
            sparseArray.put(4, "featureEntry");
            sparseArray.put(5, "progressBarContentViewModel");
            sparseArray.put(6, "viewModel");
        }

        private InnerBrLookup() {
        }
    }

    public static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> map = new HashMap<>(9);
            sKeys = map;
            map.put("layout/admin_action_0", Integer.valueOf(R.layout.admin_action));
            map.put("layout/admin_feature_0", Integer.valueOf(R.layout.admin_feature));
            map.put("layout/admin_feature_action_activity_0", Integer.valueOf(R.layout.admin_feature_action_activity));
            Integer numValueOf = Integer.valueOf(R.layout.buttons_content);
            map.put("layout/buttons_content_0", numValueOf);
            map.put("layout-land/buttons_content_0", numValueOf);
            map.put("layout/feature_entry_0", Integer.valueOf(R.layout.feature_entry));
            map.put("layout/feature_list_0", Integer.valueOf(R.layout.feature_list));
            map.put("layout/profile_edit_0", Integer.valueOf(R.layout.profile_edit));
            map.put("layout/progress_bar_content_0", Integer.valueOf(R.layout.progress_bar_content));
        }

        private InnerLayoutIdLookup() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.admin_action, 1);
        sparseIntArray.put(R.layout.admin_feature, 2);
        sparseIntArray.put(R.layout.admin_feature_action_activity, 3);
        sparseIntArray.put(R.layout.buttons_content, 4);
        sparseIntArray.put(R.layout.feature_entry, 5);
        sparseIntArray.put(R.layout.feature_list, 6);
        sparseIntArray.put(R.layout.profile_edit, 7);
        sparseIntArray.put(R.layout.progress_bar_content, 8);
    }

    @Override // androidx.databinding.e
    public List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i5) {
        return InnerBrLookup.sKeys.get(i5);
    }

    @Override // androidx.databinding.e
    public v getDataBinder(f fVar, View view, int i5) {
        int i6 = INTERNAL_LAYOUT_ID_LOOKUP.get(i5);
        if (i6 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i6) {
            case 1:
                if ("layout/admin_action_0".equals(tag)) {
                    return new AdminActionBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for admin_action is invalid. Received: " + tag);
            case 2:
                if ("layout/admin_feature_0".equals(tag)) {
                    return new AdminFeatureBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for admin_feature is invalid. Received: " + tag);
            case 3:
                if ("layout/admin_feature_action_activity_0".equals(tag)) {
                    return new AdminFeatureActionActivityBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for admin_feature_action_activity is invalid. Received: " + tag);
            case 4:
                if ("layout/buttons_content_0".equals(tag)) {
                    return new ButtonsContentBindingImpl(fVar, view);
                }
                if ("layout-land/buttons_content_0".equals(tag)) {
                    return new ButtonsContentBindingLandImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for buttons_content is invalid. Received: " + tag);
            case 5:
                if ("layout/feature_entry_0".equals(tag)) {
                    return new FeatureEntryBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for feature_entry is invalid. Received: " + tag);
            case 6:
                if ("layout/feature_list_0".equals(tag)) {
                    return new FeatureListBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for feature_list is invalid. Received: " + tag);
            case 7:
                if ("layout/profile_edit_0".equals(tag)) {
                    return new ProfileEditBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for profile_edit is invalid. Received: " + tag);
            case 8:
                if ("layout/progress_bar_content_0".equals(tag)) {
                    return new ProgressBarContentBindingImpl(fVar, view);
                }
                throw new IllegalArgumentException("The tag for progress_bar_content is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.e
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.e
    public v getDataBinder(f fVar, View[] viewArr, int i5) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i5) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
