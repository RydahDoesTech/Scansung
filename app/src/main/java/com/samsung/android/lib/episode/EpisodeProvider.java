package com.samsung.android.lib.episode;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.samsung.android.lib.episode.Scene;
import com.samsung.android.lib.episode.SceneResult;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class EpisodeProvider extends ContentProvider {

    @Deprecated
    public static final String ERROR_TYPE_FEATURE = "FEATURE";

    @Deprecated
    public static final String ERROR_TYPE_INVALID_DATA = "INVALID_DATA";

    @Deprecated
    public static final String ERROR_TYPE_PERMISSION = "PERMISSION";

    @Deprecated
    public static final String ERROR_TYPE_STORAGE_FULL = "STORAGE_FULL";

    @Deprecated
    public static final String ERROR_TYPE_UNKNOWN = "UNKNOWN";

    @Deprecated
    public static final String ERROR_TYPE_UNSUPPORTED_DEVICE_TYPE = "UNSUPPORTED_DEVICE_TYPE";

    @Deprecated
    public static final String EXTRA_ACTION = "ACTION";

    @Deprecated
    public static final String EXTRA_CONVERT_DATA_SET = "convertDataSet";

    @Deprecated
    public static final String EXTRA_CONVERT_ERROR_CODE = "convertErrorCode";

    @Deprecated
    public static final String EXTRA_CONVERT_REQUEST_SIZE = "convertRequestSize";

    @Deprecated
    public static final String EXTRA_CONVERT_RESULT = "convertResult";

    @Deprecated
    public static final String EXTRA_CONVERT_RESULT_SET = "convertDataSet";

    @Deprecated
    public static final String EXTRA_CONVERT_SOURCE = "convertSource";

    @Deprecated
    public static final String EXTRA_CONVERT_TYPE = "convertType";

    @Deprecated
    public static final String EXTRA_EXPORT_SESSION_TIME = "EXPORT_SESSION_TIME";

    @Deprecated
    public static final String EXTRA_FILE_URI = "fileUri";

    @Deprecated
    public static final String EXTRA_SAVE_PATH = "SAVE_PATH";

    @Deprecated
    public static final String EXTRA_SECURITY_LEVEL = "SECURITY_LEVEL";

    @Deprecated
    public static final String EXTRA_SESSION_KEY = "SESSION_KEY";

    @Deprecated
    public static final String EXTRA_SOURCE = "SOURCE";
    private static final String TAG = "Eternal/EpisodeProvider";

    @Deprecated
    public static final String TYPE_SCLOUD = "sCloud";

    @Deprecated
    public static final String TYPE_SMART_SWITCH = "smartSwitch";

    /* renamed from: com.samsung.android.lib.episode.EpisodeProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType;

        static {
            int[] iArr = new int[SceneResult.ErrorType.values().length];
            $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType = iArr;
            try {
                iArr[SceneResult.ErrorType.INVALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType[SceneResult.ErrorType.STORAGE_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType[SceneResult.ErrorType.UNKNOWN_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType[SceneResult.ErrorType.NOT_SUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType[SceneResult.ErrorType.NO_PERMISSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType[SceneResult.ErrorType.DEVICE_TYPE_MISMATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private float getEpisodeVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.valueOf(str).floatValue();
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    private List<Scene> getErrorSceneList(List<SceneResult> list) {
        ArrayList arrayList = new ArrayList();
        for (SceneResult sceneResult : list) {
            if (sceneResult.hasError()) {
                Scene.Builder builder = new Scene.Builder(sceneResult.getKey());
                builder.addAttribute(EternalContract.EXTRA_RESTORE_ERROR_TYPE, migrationErrorType(sceneResult.getErrorType()));
                arrayList.add(builder.build());
            }
        }
        return arrayList;
    }

    private Cursor getLoggingData() {
        return null;
    }

    private String getMappingTableData() throws Resources.NotFoundException, IOException {
        try {
            InputStream inputStreamOpenRawResource = getContext().getResources().openRawResource(R.raw.action_key_map);
            try {
                String uid = getUID();
                int iAvailable = inputStreamOpenRawResource.available();
                if (iAvailable < 1) {
                    Log.e(TAG, "getMappingTable() - inputStream is empty");
                    inputStreamOpenRawResource.close();
                    return null;
                }
                byte[] bArr = new byte[iAvailable];
                inputStreamOpenRawResource.read(bArr);
                JSONObject jSONObject = new JSONObject(new String(bArr)).getJSONObject(uid);
                if (jSONObject != null) {
                    String string = jSONObject.toString();
                    inputStreamOpenRawResource.close();
                    return string;
                }
                Log.e(TAG, "[" + uid + "] getMappingTableData() uidKeyMap is null");
                inputStreamOpenRawResource.close();
                return null;
            } finally {
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private List<Scene> getSceneListFromBundle(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Scene.Builder builder = new Scene.Builder(str);
            builder.setBundle(bundle.getBundle(str));
            arrayList.add(builder.build());
        }
        return arrayList;
    }

    private SourceInfo getSourceInfoFromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("version");
        String string = bundle2 != null ? bundle2.getString("version") : null;
        Bundle bundle3 = bundle.getBundle(EternalContract.EXTRA_DEVICE_TYPE);
        String string2 = bundle3 != null ? bundle3.getString("value") : null;
        bundle.remove("version");
        bundle.remove(EternalContract.EXTRA_DEVICE_TYPE);
        return new SourceInfo(string2, string, "");
    }

    private String migrationErrorType(SceneResult.ErrorType errorType) {
        switch (AnonymousClass1.$SwitchMap$com$samsung$android$lib$episode$SceneResult$ErrorType[errorType.ordinal()]) {
            case 1:
                return "INVALID_DATA";
            case 2:
                return "STORAGE_FULL";
            case 3:
                return "UNKNOWN";
            case 4:
                return "FEATURE";
            case 5:
                return "PERMISSION";
            case 6:
                return "UNSUPPORTED_DEVICE_TYPE";
            default:
                return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x03b5  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle call(java.lang.String r21, java.lang.String r22, android.os.Bundle r23) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.lib.episode.EpisodeProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public HashMap<Object, Object> getEntries(String str) {
        return null;
    }

    public abstract List<String> getKeySet();

    public List<Scene> getTestScenes(String str) {
        return null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    public abstract String getUID();

    public abstract List<Scene> getValues(List<String> list);

    public List<Scene> getValues(List<String> list, SourceInfo sourceInfo) {
        return getValues(list);
    }

    public abstract String getVersion();

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Deprecated
    public SceneResult isOpenable(String str) {
        return null;
    }

    public boolean isSupported(String str) {
        return true;
    }

    public abstract boolean isValid(Scene scene, Scene scene2);

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Deprecated
    public void open(String str) {
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public abstract List<SceneResult> setValues(SourceInfo sourceInfo, List<Scene> list);

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean verifyCallingPackage(String str) {
        String callingPackage = getCallingPackage();
        if (!TextUtils.isEmpty(callingPackage)) {
            for (String str2 : EternalContract.WELL_KNOWN_CALLING_PACKAGES) {
                if (callingPackage.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
            Log.i(TAG, "[" + callingPackage + "]" + str + " rejected");
        }
        return false;
    }
}
