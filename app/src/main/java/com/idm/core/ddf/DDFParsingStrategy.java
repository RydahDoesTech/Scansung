package com.idm.core.ddf;

import com.idm.fotaagent.restapi.parser.XmlParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public interface DDFParsingStrategy {
    public static final DDFParsingStrategy BETWEEN_TAG = new C2.a(17);
    public static final DDFParsingStrategy CHILD_TAG_NAME = new C2.a(18);
    public static final DDFParsingStrategy CHILD_TAG_VALUE = new C2.a(19);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        moveToBody(xmlPullParser);
        if (xmlPullParser.getEventType() == 3) {
            return "";
        }
        String strTrim = xmlPullParser.getText().trim();
        moveToEndTag(xmlPullParser);
        return strTrim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$1(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        moveToBody(xmlPullParser);
        moveToChildStartTag(xmlPullParser);
        StringBuilder sb = new StringBuilder();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && name.equals(xmlPullParser.getName())) {
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
            if (eventType == 2) {
                sb.append(xmlPullParser.getName().trim());
                sb.append(XmlParser.Polling.POLLING_VERSION_SEPARATOR);
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$2(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        moveToBody(xmlPullParser);
        moveToChildStartTag(xmlPullParser);
        moveToChildBody(xmlPullParser);
        if (xmlPullParser.getEventType() == 3) {
            moveToEndTag(xmlPullParser);
            return "";
        }
        String strTrim = xmlPullParser.getText().trim();
        moveToChildEndTag(xmlPullParser);
        moveToEndTag(xmlPullParser);
        return strTrim;
    }

    static void moveToBody(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.next();
    }

    static void moveToChildBody(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.next();
    }

    static void moveToChildEndTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.next();
    }

    static void moveToChildStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.next();
    }

    static void moveToEndTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.next();
    }

    String parseValue(XmlPullParser xmlPullParser);
}
