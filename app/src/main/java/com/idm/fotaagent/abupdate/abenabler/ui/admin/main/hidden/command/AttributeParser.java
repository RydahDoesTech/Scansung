package com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command;

import android.text.TextUtils;
import com.idm.fotaagent.abupdate.manager.UpdateEngineManager;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.exception.LocalTestResetRequiredException;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
abstract class AttributeParser {
    protected final Map<String, String> attributes;
    private final String deltaPath;

    public static class UsingBuildInfo extends AttributeParser {
        static final String BUILD_INFO_FILE_NAME = "build_info.txt";
        public static final String DELTA_QB_ID = "delta_qb_id";
        public static final String UPDATED_VERSION = "updated_version";

        public UsingBuildInfo(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public String getFileName() {
            return BUILD_INFO_FILE_NAME;
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public boolean needsIgnore(String str) {
            return false;
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public void parseAndUpdate(String[] strArr) {
            if (DELTA_QB_ID.equals(strArr[0]) || UPDATED_VERSION.equals(strArr[0])) {
                this.attributes.put(strArr[0], strArr[1]);
            }
        }
    }

    public static class UsingMetadataFile extends AttributeParser {
        static final String METADATA_FILE_NAME = "META-INF/com/android/metadata";
        static final String OTA_PROPERTY_FILES = "ota-property-files";
        private static final String PAYLOAD_METADATA = "payload_metadata.bin";

        public UsingMetadataFile(String str) {
            super(str);
        }

        private void updateAttribute(String[] strArr) throws LocalTestResetRequiredException {
            if (TextUtils.isEmpty(strArr[1])) {
                throw new LocalTestResetRequiredException("offset should not be empty", null);
            }
            if (TextUtils.isEmpty(strArr[2])) {
                throw new LocalTestResetRequiredException("METADATA_SIZE should not be empty", null);
            }
            this.attributes.put(UpdateEngineManager.OFFSET, strArr[1]);
            this.attributes.put(UpdateEngineManager.METADATA_FILE_SIZE, strArr[2]);
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public String getFileName() {
            return METADATA_FILE_NAME;
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public boolean needsIgnore(String str) {
            return !OTA_PROPERTY_FILES.equals(str);
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public void parseAndUpdate(String[] strArr) throws LocalTestResetRequiredException {
            for (String str : strArr[1].split(",")) {
                String[] strArrSplit = str.split(":");
                if (PAYLOAD_METADATA.equals(strArrSplit[0])) {
                    updateAttribute(strArrSplit);
                    return;
                }
            }
            Log.E("Should not reach here. Please check delta file");
            throw new LocalTestResetRequiredException("wrong delta file", null);
        }
    }

    public static class UsingPropertiesFile extends AttributeParser {
        static final String PROPERTIES_FILE_NAME = "payload_properties.txt";

        public UsingPropertiesFile(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public String getFileName() {
            return PROPERTIES_FILE_NAME;
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public boolean needsIgnore(String str) {
            return false;
        }

        @Override // com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.command.AttributeParser
        public void parseAndUpdate(String[] strArr) {
            this.attributes.put(strArr[0], strArr[1]);
        }
    }

    private void parse() throws LocalTestResetRequiredException, IOException {
        String str;
        try {
            ZipFile zipFile = new ZipFile(this.deltaPath);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(zipFile.getEntry(getFileName()))));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            zipFile.close();
                            return;
                        }
                        String[] strArrSplit = line.split("=", 2);
                        if (strArrSplit.length != 2 || (str = strArrSplit[0]) == null || strArrSplit[1] == null) {
                            Log.W("invalid line: " + line);
                        } else if (!needsIgnore(str)) {
                            parseAndUpdate(strArrSplit);
                        }
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Exception e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new LocalTestResetRequiredException("", e);
        }
    }

    public static Map<String, String> parseAll(String str) throws LocalTestResetRequiredException, IOException {
        UsingPropertiesFile usingPropertiesFile = new UsingPropertiesFile(str);
        usingPropertiesFile.parse();
        HashMap map = new HashMap(usingPropertiesFile.getAttributes());
        UsingMetadataFile usingMetadataFile = new UsingMetadataFile(str);
        usingMetadataFile.parse();
        map.putAll(usingMetadataFile.getAttributes());
        UsingBuildInfo usingBuildInfo = new UsingBuildInfo(str);
        usingBuildInfo.parse();
        map.putAll(usingBuildInfo.getAttributes());
        return map;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public abstract String getFileName();

    public abstract boolean needsIgnore(String str);

    public abstract void parseAndUpdate(String[] strArr);

    private AttributeParser(String str) {
        this.deltaPath = str;
        this.attributes = new HashMap();
    }
}
