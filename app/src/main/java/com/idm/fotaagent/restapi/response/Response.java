package com.idm.fotaagent.restapi.response;

import com.idm.fotaagent.restapi.parser.XmlParser;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Response {
    private Result result = new Result();

    public static class WithAttributes extends Response {
        private final Map<String, String> attributes = new HashMap();

        public static class ForPolling extends WithAttributes {
            public String[] getVersions() {
                String str = getAttributes().get(XmlParser.Polling.POLLING_VERSION);
                return str != null ? str.split(XmlParser.Polling.POLLING_VERSION_SEPARATOR) : new String[0];
            }
        }

        public Map<String, String> getAttributes() {
            return this.attributes;
        }

        public String getErrorCode() {
            return this.attributes.get(XmlParser.ERROR_CODE);
        }

        public void setAttributes(Map<String, String> map) {
            this.attributes.clear();
            this.attributes.putAll(map);
        }
    }

    public static class WithBody extends Response {
        private String body = "";

        public String getBody() {
            return this.body;
        }

        public void setBody(String str) {
            this.body = str;
        }
    }

    public Result getResult() {
        return this.result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
