package com.idm.core.tnds;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class IDMTndsXmlWbxmlConvertImpl {
    public IDMTndsMgmtTree idmTndsWbxmlDecoder(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String strIdmTndsWbxmlParse = new IDMTndsWbxmltoXmlParse().idmTndsWbxmlParse(str2, str2.length());
        if (TextUtils.isEmpty(strIdmTndsWbxmlParse)) {
            return null;
        }
        return new IDMTndsXmlDecoder().idmTndsXmlDataDecode(str, new ByteArrayInputStream(strIdmTndsWbxmlParse.getBytes(Charset.defaultCharset())));
    }

    public String idmTndsWbxmlEncoder(ArrayList<IDMTndsNodeInfo> arrayList, int i5) throws IllegalStateException, IOException, IllegalArgumentException {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        String strIdmTndsXmlDataEncode = new IDMTndsXmlEncoder().idmTndsXmlDataEncode(arrayList, i5);
        if (TextUtils.isEmpty(strIdmTndsXmlDataEncode)) {
            return null;
        }
        return new IDMTndsXmltoWbxmlParse().idmTndsXml2WbxmlConvert(strIdmTndsXmlDataEncode, strIdmTndsXmlDataEncode.length());
    }

    public IDMTndsMgmtTree idmTndsXmlDecoder(String str, InputStream inputStream) {
        return new IDMTndsXmlDecoder().idmTndsXmlDataDecode(str, inputStream);
    }

    public String idmTndsXmlEncoder(ArrayList<IDMTndsNodeInfo> arrayList, int i5) {
        return new IDMTndsXmlEncoder().idmTndsXmlDataEncode(arrayList, i5);
    }
}
