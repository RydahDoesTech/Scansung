package com.idm.core.tnds;

import com.idm.adapter.logmanager.IDMDebug;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
class IDMTndsXmlDecoder {
    public IDMTndsMgmtTree idmTndsXmlDataDecode(String str, InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            IDMTndsParserHandler iDMTndsParserHandler = new IDMTndsParserHandler(str);
            xmlPullParserNewPullParser.setInput(new InputStreamReader(inputStream));
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2) {
                    iDMTndsParserHandler.startTag(xmlPullParserNewPullParser.getName());
                } else if (eventType == 3) {
                    iDMTndsParserHandler.endTag(xmlPullParserNewPullParser.getName());
                } else if (eventType == 4) {
                    iDMTndsParserHandler.text(xmlPullParserNewPullParser);
                }
            }
            return iDMTndsParserHandler.idmTndsGetMgmtTree();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
