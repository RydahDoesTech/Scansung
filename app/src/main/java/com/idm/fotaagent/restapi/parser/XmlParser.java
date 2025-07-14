package com.idm.fotaagent.restapi.parser;

import A2.b;
import A2.c;
import I.a;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.Xpath;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class XmlParser {
    public static final String ERROR_CODE = "error/code";
    public static final String ERROR_MESSAGE = "error/message";
    public static final String ERROR_CHALLENGE = "error/challenge";
    private static final String[] ERROR_PARSING_EXPRESSIONS = {ERROR_CODE, ERROR_MESSAGE, ERROR_CHALLENGE};

    public static class Device extends XmlParser {
        public static final String DEVICE_HEARTBEAT_NOW_VALUE = "1";
        public static final String DEVICE_HEARTBEAT_PERIOD = "versioninfo/ActiveDeviceInfo/CycleOfDeviceHeartbeat";
        public static final String DEVICE_HEARTBEAT_URL = "versioninfo/ActiveDeviceInfo/ServiceURL";
        public static final String DEVICE_POLLING_URL = "versioninfo/url";
        public static final String DEVICE_POLLING_TARGET = "versioninfo/Polling/filename";
        public static final String DEVICE_HEARTBEAT_NOW = "versioninfo/ActiveDeviceInfo/ImmediatelyDeviceHeartbeat";
        public static final String DEVICE_FIRST_POLLING_TIME = "versioninfo/DeviceInitDelayTime";
        private static final String[] DEVICE_PARSING_EXPRESSIONS = {"versioninfo/url", DEVICE_POLLING_TARGET, "versioninfo/ActiveDeviceInfo/CycleOfDeviceHeartbeat", "versioninfo/ActiveDeviceInfo/ServiceURL", DEVICE_HEARTBEAT_NOW, DEVICE_FIRST_POLLING_TIME};

        @Override // com.idm.fotaagent.restapi.parser.XmlParser
        public Map<String, String> doParseForSuccess(String str) {
            return parse(str, DEVICE_PARSING_EXPRESSIONS);
        }
    }

    public static class Heartbeat extends XmlParser {
        public static final String HEARTBEAT_PERIOD = "ActiveDeviceInfo/CycleOfDeviceHeartbeat";
        public static final String HEARTBEAT_URL = "ActiveDeviceInfo/ServiceURL";
        private static final String[] HEARTBEAT_PARSING_EXPRESSIONS = {HEARTBEAT_PERIOD, HEARTBEAT_URL};

        @Override // com.idm.fotaagent.restapi.parser.XmlParser
        public Map<String, String> doParseForSuccess(String str) {
            return parse(str, HEARTBEAT_PARSING_EXPRESSIONS);
        }
    }

    public static class Polling extends XmlParser {
        public static final String POLLING_HEARTBEAT_PERIOD = "versioninfo/ActiveDeviceInfo/CycleOfDeviceHeartbeat";
        public static final String POLLING_HEARTBEAT_URL = "versioninfo/ActiveDeviceInfo/ServiceURL";
        public static final String POLLING_URL = "versioninfo/url";
        public static final String POLLING_VERSION = "versioninfo/firmware/version/upgrade/value";
        public static final String POLLING_VERSION_SEPARATOR = ";";
        public static final String POLLING_UNIT = "versioninfo/polling/periodUnit";
        public static final String POLLING_PERIOD = "versioninfo/polling/period";
        public static final String POLLING_TIME = "versioninfo/polling/time";
        public static final String POLLING_RANGE = "versioninfo/polling/range";
        private static final String[] POLLING_PARSING_EXPRESSIONS = {"versioninfo/url", POLLING_UNIT, POLLING_PERIOD, POLLING_TIME, POLLING_RANGE, "versioninfo/ActiveDeviceInfo/CycleOfDeviceHeartbeat", "versioninfo/ActiveDeviceInfo/ServiceURL"};

        @Override // com.idm.fotaagent.restapi.parser.XmlParser
        public Map<String, String> doParseForSuccess(String str) {
            Map<String, String> map = parse(str, POLLING_PARSING_EXPRESSIONS);
            getPollingVersion(str).ifPresent(new c(0, map));
            return map;
        }

        public Optional<String> getPollingVersion(String str) {
            NodeList nodeList = new Xpath(str).getNodeList(POLLING_VERSION);
            if (nodeList == null) {
                Log.W("nodeList is null. Failed to parse polling version");
                return Optional.empty();
            }
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < nodeList.getLength(); i5++) {
                sb.append(nodeList.item(i5).getTextContent());
                sb.append(POLLING_VERSION_SEPARATOR);
            }
            return Optional.of(sb.substring(0, sb.length() - 1));
        }
    }

    public static class Time extends XmlParser {
        public static final String TIME_SERVER_TIME = "initializeResult/currentServerTime";
        private static final String[] TIME_PARSING_EXPRESSIONS = {TIME_SERVER_TIME};

        @Override // com.idm.fotaagent.restapi.parser.XmlParser
        public Map<String, String> doParseForSuccess(String str) {
            return parse(str, TIME_PARSING_EXPRESSIONS);
        }
    }

    private void printAttributes(Map<String, String> map, a aVar) {
        Log.I("Attributes:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVar.accept(entry.getKey() + "=" + entry.getValue());
        }
    }

    public Map<String, String> doParseForSuccess(String str) {
        return new HashMap();
    }

    public Map<String, String> parse(String str, String[] strArr) {
        HashMap map = new HashMap();
        for (String str2 : strArr) {
            map.put(str2, (String) Optional.ofNullable(Xpath.getResultOfString(str, str2)).orElseThrow(new b(0)));
        }
        return map;
    }

    public Map<String, String> parseForError(String str) {
        Map<String, String> map = parse(str, ERROR_PARSING_EXPRESSIONS);
        printAttributes(map, new A2.a(1));
        return map;
    }

    public Map<String, String> parseForSuccess(String str) {
        Map<String, String> mapDoParseForSuccess = doParseForSuccess(str);
        printAttributes(mapDoParseForSuccess, new A2.a(0));
        return mapDoParseForSuccess;
    }
}
