package com.idm.fotaagent.database.sqlite.database.settings;

import com.idm.fotaagent.IDMApplication;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.lib.episode.EpisodeProvider;
import com.samsung.android.lib.episode.EternalContract;
import com.samsung.android.lib.episode.Scene;
import com.samsung.android.lib.episode.SceneResult;
import com.samsung.android.lib.episode.SourceInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FotaEpisodeProvider extends EpisodeProvider {
    private static final String KEY_WIFI_AUTO_DOWNLOAD = "/SoftwareUpdate/WifiAutoDownload";
    private static final String PROVIDER_DTD_VERSION = "1.0";
    private static final String PROVIDER_UID = "SoftwareUpdate";

    private boolean needWifiAutoDownloadMenu() {
        return !CarrierFeature.needsToRemoveAutoDownloadMenu();
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public List<String> getKeySet() {
        Log.I("");
        ArrayList arrayList = new ArrayList();
        if (needWifiAutoDownloadMenu()) {
            Log.I("add key : WifiAutoDownload");
            arrayList.add(KEY_WIFI_AUTO_DOWNLOAD);
        }
        return arrayList;
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public List<Scene> getTestScenes(String str) {
        ArrayList arrayList = new ArrayList();
        if (KEY_WIFI_AUTO_DOWNLOAD.equals(str)) {
            Scene.Builder builder = new Scene.Builder(str);
            builder.setValue(0);
            Boolean bool = Boolean.FALSE;
            builder.addAttribute(EternalContract.EXTRA_EXPECTED_RESULT, bool);
            arrayList.add(builder.build());
            Scene.Builder builder2 = new Scene.Builder(str);
            builder2.setValue(1);
            builder2.addAttribute(EternalContract.EXTRA_EXPECTED_RESULT, Boolean.TRUE);
            arrayList.add(builder2.build());
            Scene.Builder builder3 = new Scene.Builder(str);
            builder3.setValue(-1);
            builder3.setDefault(true);
            builder3.addAttribute(EternalContract.EXTRA_EXPECTED_RESULT, bool);
            arrayList.add(builder3.build());
        } else {
            Log.E("unexpected key : " + str);
        }
        return arrayList;
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public String getUID() {
        return PROVIDER_UID;
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public List<Scene> getValues(List<String> list) {
        Log.I("");
        if (list == null || list.isEmpty()) {
            Log.E("keyList is null or empty");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Scene.Builder builder = new Scene.Builder(str);
            if (KEY_WIFI_AUTO_DOWNLOAD.equals(str)) {
                builder.setValue(Integer.valueOf(SettingsDatabaseManager.getAutoDownloadOption(getContext()).getDbValue()));
            } else {
                Log.E("unexpected key : " + str);
            }
            Scene sceneBuild = builder.build();
            if (sceneBuild != null) {
                arrayList.add(sceneBuild);
            }
        }
        return arrayList;
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public String getVersion() {
        return "1.0";
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public SceneResult isOpenable(String str) {
        SceneResult.Builder builder = new SceneResult.Builder(str);
        if (KEY_WIFI_AUTO_DOWNLOAD.equals(str)) {
            builder.setResult(SceneResult.ResultType.RESULT_FAIL).setErrorType(SceneResult.ErrorType.NOT_SUPPORTED);
        } else {
            Log.E("unexpected key : " + str);
        }
        return builder.build();
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public boolean isValid(Scene scene, Scene scene2) {
        return true;
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider, android.content.ContentProvider
    public boolean onCreate() {
        IDMApplication.enableLog();
        return super.onCreate();
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public void open(String str) {
        if (KEY_WIFI_AUTO_DOWNLOAD.equals(str)) {
            return;
        }
        Log.E("unexpected key : " + str);
    }

    @Override // com.samsung.android.lib.episode.EpisodeProvider
    public List<SceneResult> setValues(SourceInfo sourceInfo, List<Scene> list) {
        Log.I("");
        ArrayList arrayList = new ArrayList();
        if (!"1.0".equals(sourceInfo.getVersion())) {
            Log.W("app version : 1.0, backup data version : " + sourceInfo.getVersion());
        }
        if (list == null || list.isEmpty()) {
            Log.E("sceneList is null or empty");
            return arrayList;
        }
        for (Scene scene : list) {
            String key = scene.getKey();
            SceneResult.Builder builder = new SceneResult.Builder(key);
            if (!KEY_WIFI_AUTO_DOWNLOAD.equals(key)) {
                Log.E("unexpected key : " + key);
                builder.setResult(SceneResult.ResultType.RESULT_FAIL).setErrorType(SceneResult.ErrorType.INVALID_DATA);
            } else if (SettingsDatabaseManager.setAutoDownload(getContext(), scene.getValueInt(AutoDownloadDefaultValues.get().getDefaultValue()))) {
                builder.setResult(SceneResult.ResultType.RESULT_OK);
            } else {
                Log.E("failed to restore : " + key);
                builder.setResult(SceneResult.ResultType.RESULT_FAIL).setErrorType(SceneResult.ErrorType.UNKNOWN_ERROR);
            }
            SceneResult sceneResultBuild = builder.build();
            if (sceneResultBuild != null) {
                arrayList.add(sceneResultBuild);
            }
        }
        return arrayList;
    }
}
