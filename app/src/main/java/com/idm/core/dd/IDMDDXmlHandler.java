package com.idm.core.dd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class IDMDDXmlHandler implements IDMDDConstants {
    private String extraElementTag;
    private List<String> extraElements;
    private boolean isDDVersion = false;
    private boolean isName = false;
    private boolean isType = false;
    private boolean isDescription = false;
    private boolean isObjectUri = false;
    private boolean isSize = false;
    private boolean isNotifyUri = false;
    private boolean isInstallParam = false;
    private boolean isVendor = false;
    private boolean isNextUrl = false;
    private boolean isInfoUrl = false;
    private boolean isIconUri = false;
    private boolean isExtraElement = false;
    private final IDMDDXmlDataSet ddXmlDataSet = new IDMDDXmlDataSet();

    public IDMDDXmlHandler(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.extraElements = arrayList;
        arrayList.addAll(list);
        Iterator<String> it = this.extraElements.iterator();
        while (it.hasNext()) {
            this.ddXmlDataSet.idmDDXmlDataSetExtraElement(it.next(), "");
        }
    }

    public void endTag(String str) {
        if (IDMDDConstants.tagDDVersion.equals(str)) {
            this.isDDVersion = false;
            return;
        }
        if ("name".equals(str)) {
            this.isName = false;
            return;
        }
        if ("type".equals(str)) {
            this.isType = false;
            return;
        }
        if ("description".equals(str)) {
            this.isDescription = false;
            return;
        }
        if (IDMDDConstants.tagObjectURI.equals(str)) {
            this.isObjectUri = false;
            return;
        }
        if (IDMDDConstants.tagSize.equals(str)) {
            this.isSize = false;
            return;
        }
        if (IDMDDConstants.tagNotifyURI.equals(str)) {
            this.isNotifyUri = false;
            return;
        }
        if (IDMDDConstants.tagInstallParam.equals(str)) {
            this.isInstallParam = false;
            return;
        }
        if (IDMDDConstants.tagVendor.equals(str)) {
            this.isVendor = false;
            return;
        }
        if (IDMDDConstants.tagNextURL.equals(str)) {
            this.isNextUrl = false;
            return;
        }
        if (IDMDDConstants.tagInfoURL.equals(str)) {
            this.isInfoUrl = false;
            return;
        }
        if (IDMDDConstants.tagIconURI.equals(str)) {
            this.isIconUri = false;
        } else if (this.isExtraElement && this.extraElements != null && this.extraElementTag.equals(str)) {
            this.isExtraElement = false;
        }
    }

    public IDMDDXmlDataSet idmDDXmlGetParsedData() {
        return this.ddXmlDataSet;
    }

    public void startTag(String str) {
        if (IDMDDConstants.tagDDVersion.equals(str)) {
            this.isDDVersion = true;
            return;
        }
        if ("name".equals(str)) {
            this.isName = true;
            return;
        }
        if ("type".equals(str)) {
            this.isType = true;
            return;
        }
        if ("description".equals(str)) {
            this.isDescription = true;
            return;
        }
        if (IDMDDConstants.tagObjectURI.equals(str)) {
            this.isObjectUri = true;
            return;
        }
        if (IDMDDConstants.tagSize.equals(str)) {
            this.isSize = true;
            return;
        }
        if (IDMDDConstants.tagNotifyURI.equals(str)) {
            this.isNotifyUri = true;
            return;
        }
        if (IDMDDConstants.tagInstallParam.equals(str)) {
            this.isInstallParam = true;
            return;
        }
        if (IDMDDConstants.tagVendor.equals(str)) {
            this.isVendor = true;
            return;
        }
        if (IDMDDConstants.tagNextURL.equals(str)) {
            this.isNextUrl = true;
            return;
        }
        if (IDMDDConstants.tagInfoURL.equals(str)) {
            this.isInfoUrl = true;
            return;
        }
        if (IDMDDConstants.tagIconURI.equals(str)) {
            this.isIconUri = true;
            return;
        }
        List<String> list = this.extraElements;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    this.isExtraElement = true;
                    this.extraElementTag = str;
                    return;
                }
            }
        }
    }

    public void text(XmlPullParser xmlPullParser) {
        if (this.isDDVersion) {
            this.ddXmlDataSet.idmDDXmlDataSetDDVersion(xmlPullParser.getText().trim());
            return;
        }
        if (this.isName) {
            this.ddXmlDataSet.idmDDXmlDataSetName(xmlPullParser.getText().trim());
            return;
        }
        if (this.isType) {
            this.ddXmlDataSet.idmDDXmlDataSetType(xmlPullParser.getText().trim());
            return;
        }
        if (this.isDescription) {
            this.ddXmlDataSet.idmDDXmlDataSetDescription(xmlPullParser.getText().trim());
            return;
        }
        if (this.isObjectUri) {
            this.ddXmlDataSet.idmDDXmlDataSetObjectURI(xmlPullParser.getText().trim());
            return;
        }
        if (this.isSize) {
            this.ddXmlDataSet.idmDDXmlDataSetSize(xmlPullParser.getText().trim());
            return;
        }
        if (this.isNotifyUri) {
            this.ddXmlDataSet.idmDDXmlDataSetInstallNotifyURI(xmlPullParser.getText().trim());
            return;
        }
        if (this.isInstallParam) {
            this.ddXmlDataSet.idmDDXmlDataSetInstallParam(xmlPullParser.getText().trim());
            return;
        }
        if (this.isVendor) {
            this.ddXmlDataSet.idmDDXmlDataSetVendor(xmlPullParser.getText().trim());
            return;
        }
        if (this.isNextUrl) {
            this.ddXmlDataSet.idmDDXmlDataSetNextURL(xmlPullParser.getText().trim());
            return;
        }
        if (this.isInfoUrl) {
            this.ddXmlDataSet.idmDDXmlDataSetInfoURL(xmlPullParser.getText().trim());
        } else if (this.isIconUri) {
            this.ddXmlDataSet.idmDDXmlDataSetIconURI(xmlPullParser.getText().trim());
        } else if (this.isExtraElement) {
            this.ddXmlDataSet.idmDDXmlDataSetExtraElement(this.extraElementTag, xmlPullParser.getText().trim());
        }
    }
}
