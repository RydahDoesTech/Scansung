package com.samsung.android.lib.episode;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EpisodeCompatProvider extends EpisodeProvider {
    private static final String TAG = "Eternal/EpisodeCompat";

    public Bundle buildConvertData(List<Scene> list, int i5, int i6, int i7, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("convertDataSet", (ArrayList) list);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("convertResult", i5);
        bundle2.putInt("convertErrorCode", i6);
        bundle2.putInt("convertRequestSize", i7);
        bundle2.putString("convertSource", str);
        bundle.putBundle(EpisodeConstant.EXTRA_CONVERT_RESULT_SET, bundle2);
        return bundle;
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider, android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        String uid = getUID();
        if (str == null) {
            Log.d(TAG, "[" + uid + "] method is null");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!str.equals(EternalContract.METHOD_CONVERT_DATA)) {
            return super.call(str, str2, bundle);
        }
        Bundle bundle2 = new Bundle();
        Bundle bundleConvertData = convertData(bundle);
        if (bundleConvertData == null) {
            Log.e(TAG, "convertedData is null - UID = " + uid);
        } else {
            try {
                bundleConvertData.setClassLoader(Scene.class.getClassLoader());
                ArrayList<? extends Parcelable> parcelableArrayList = bundleConvertData.getParcelableArrayList("convertDataSet");
                if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                    Log.e(TAG, "sceneList is empty - UID = " + uid);
                } else {
                    Log.d(TAG, "convertedData size = " + parcelableArrayList.size() + " / UID = " + uid);
                    bundle2.putParcelableArrayList("convertDataSet", parcelableArrayList);
                    bundle2.putBundle(EpisodeConstant.EXTRA_CONVERT_RESULT_SET, bundleConvertData.getBundle(EpisodeConstant.EXTRA_CONVERT_RESULT_SET));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Log.d(TAG, "[" + uid + "]" + str + " took time : " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return bundle2;
    }

    public abstract Bundle convertData(Bundle bundle);
}
