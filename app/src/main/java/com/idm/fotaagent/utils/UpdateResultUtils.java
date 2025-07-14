package com.idm.fotaagent.utils;

import android.text.TextUtils;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import com.idm.fotaagent.utils.storage.FileManager;
import com.idm.fotaagent.utils.storage.StorageType;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class UpdateResultUtils {
    static final String UPDATE_RESULT_FAIL = "FAIL";
    static final String UPDATE_RESULT_INIT = "FOTA";
    static final String UPDATE_RESULT_SUCCESS_200 = "200";
    static final String UPDATE_RESULT_SUCCESS_DONE = "DONE";
    static final String UPDATE_RESULT_SUCCESS_NO_FOTA_STATUS = "250";

    public String getUpdateResultCode() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(FileManager.PATH_FOTA_STATUS), Charset.defaultCharset()));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line) && !line.startsWith(UPDATE_RESULT_FAIL)) {
                    if (!line.startsWith("200") && !line.startsWith(UPDATE_RESULT_SUCCESS_DONE)) {
                        if (line.startsWith(UPDATE_RESULT_INIT)) {
                            Log.I("getUpdateResultCode : 451");
                            bufferedReader.close();
                            return IDMFumoExtInterface.IDM_FOTA_GENERIC_NO_RECOVERY_ENTRY;
                        }
                        String strTrim = line.trim();
                        Log.I("getUpdateResultCode : " + strTrim);
                        bufferedReader.close();
                        return strTrim;
                    }
                    Log.I("getUpdateResultCode : 200");
                    bufferedReader.close();
                    return "200";
                }
                Log.W("value : " + line + ", getUpdateResultCode : 410");
                bufferedReader.close();
                return IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED;
            } finally {
            }
        } catch (FileNotFoundException e5) {
            Log.printStackTrace(e5);
            return "250";
        } catch (IOException e6) {
            Log.printStackTrace(e6);
            return IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED;
        }
    }

    public void initializeUpdateResult() {
        setUpdateResultCode(UPDATE_RESULT_INIT);
    }

    public boolean isUpdateSucceeded() throws IOException {
        String updateResultCode = getUpdateResultCode();
        return "200".equals(updateResultCode) || "250".equals(updateResultCode);
    }

    public void setUpdateResultCode(String str) {
        boolean z4;
        new FileManager().createDeltaFolder(StorageType.CACHE);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FileManager.PATH_FOTA_STATUS);
            try {
                fileOutputStream.write(str.getBytes());
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                z4 = true;
            } finally {
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            z4 = false;
        }
        Log.I("setUpdateResultCode: " + z4);
    }
}
