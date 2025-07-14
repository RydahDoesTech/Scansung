package com.idm.core.dd;

import com.idm.adapter.logmanager.IDMDebug;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class IDMDDXmlParser implements IDMDDConstants {
    public IDMDDXmlDataSet idmDDXmlDataParser(byte[] bArr, List<String> list) throws XmlPullParserException, IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            IDMDDXmlHandler iDMDDXmlHandler = new IDMDDXmlHandler(list);
            xmlPullParserNewPullParser.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2) {
                    iDMDDXmlHandler.startTag(xmlPullParserNewPullParser.getName());
                } else if (eventType == 3) {
                    iDMDDXmlHandler.endTag(xmlPullParserNewPullParser.getName());
                } else if (eventType == 4) {
                    iDMDDXmlHandler.text(xmlPullParserNewPullParser);
                }
            }
            return iDMDDXmlHandler.idmDDXmlGetParsedData();
        } catch (IOException | XmlPullParserException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
