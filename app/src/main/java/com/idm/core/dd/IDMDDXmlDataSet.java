package com.idm.core.dd;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class IDMDDXmlDataSet {
    private String name = "";
    private String size = "";
    private String DDVersion = "";
    private String objectURI = "";
    private String type = "";
    private String vendor = "";
    private String description = "";
    private String installNotifyURI = "";
    private String nextURL = "";
    private String infoURL = "";
    private String iconURI = "";
    private String installParam = "";
    private Map<String, String> extraElement = new HashMap();

    public String idmDDXmlDataGetDDVersion() {
        return this.DDVersion;
    }

    public String idmDDXmlDataGetDescription() {
        return this.description;
    }

    public Map<String, String> idmDDXmlDataGetExtraElement() {
        return this.extraElement;
    }

    public String idmDDXmlDataGetIconURI() {
        return this.iconURI;
    }

    public String idmDDXmlDataGetInfoURL() {
        return this.infoURL;
    }

    public String idmDDXmlDataGetInstallNotifyURI() {
        return this.installNotifyURI;
    }

    public String idmDDXmlDataGetInstallParam() {
        return this.installParam;
    }

    public String idmDDXmlDataGetName() {
        return this.name;
    }

    public String idmDDXmlDataGetNextURL() {
        return this.nextURL;
    }

    public String idmDDXmlDataGetObjectURI() {
        return this.objectURI;
    }

    public String idmDDXmlDataGetSize() {
        return this.size;
    }

    public String idmDDXmlDataGetType() {
        return this.type;
    }

    public String idmDDXmlDataGetVendor() {
        return this.vendor;
    }

    public void idmDDXmlDataSetDDVersion(String str) {
        this.DDVersion = str;
    }

    public void idmDDXmlDataSetDescription(String str) {
        this.description = str;
    }

    public void idmDDXmlDataSetExtraElement(String str, String str2) {
        this.extraElement.put(str, str2);
    }

    public void idmDDXmlDataSetIconURI(String str) {
        this.iconURI = str;
    }

    public void idmDDXmlDataSetInfoURL(String str) {
        this.infoURL = str;
    }

    public void idmDDXmlDataSetInstallNotifyURI(String str) {
        this.installNotifyURI = str;
    }

    public void idmDDXmlDataSetInstallParam(String str) {
        this.installParam = str;
    }

    public void idmDDXmlDataSetName(String str) {
        this.name = str;
    }

    public void idmDDXmlDataSetNextURL(String str) {
        this.nextURL = str;
    }

    public void idmDDXmlDataSetObjectURI(String str) {
        this.objectURI = str;
    }

    public void idmDDXmlDataSetSize(String str) {
        this.size = str;
    }

    public void idmDDXmlDataSetType(String str) {
        this.type = str;
    }

    public void idmDDXmlDataSetVendor(String str) {
        this.vendor = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMDDXmlDataSet [name=");
        sb.append(this.name);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", DDVersion=");
        sb.append(this.DDVersion);
        sb.append(", objectURI=");
        sb.append(this.objectURI);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", vendor=");
        sb.append(this.vendor);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", installNotifyURI=");
        sb.append(this.installNotifyURI);
        sb.append(", nextURL=");
        sb.append(this.nextURL);
        sb.append(", infoURL=");
        sb.append(this.infoURL);
        sb.append(", iconURI=");
        sb.append(this.iconURI);
        sb.append(", installParam=");
        sb.append(this.installParam);
        for (String str : this.extraElement.keySet()) {
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append(this.extraElement.get(str));
        }
        sb.append("]");
        return sb.toString();
    }
}
