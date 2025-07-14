package com.idm.core.xml;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.SyncML;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
class IDMXmlSyncmlDecoder {
    public SyncML idmSyncmlDecode(InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            IDMXmlSyncmlParserHandler iDMXmlSyncmlParserHandler = new IDMXmlSyncmlParserHandler();
            xmlPullParserNewPullParser.setInput(new InputStreamReader(inputStream));
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2) {
                    iDMXmlSyncmlParserHandler.startTag(xmlPullParserNewPullParser.getName());
                } else if (eventType == 3) {
                    iDMXmlSyncmlParserHandler.endTag(xmlPullParserNewPullParser.getName());
                } else if (eventType == 4) {
                    iDMXmlSyncmlParserHandler.text(xmlPullParserNewPullParser);
                }
            }
            return iDMXmlSyncmlParserHandler.idmGetSyncML();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
