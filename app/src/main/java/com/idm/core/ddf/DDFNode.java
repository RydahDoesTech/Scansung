package com.idm.core.ddf;

import E2.b;
import com.idm.fotaagent.restapi.parser.XmlParser;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public class DDFNode {
    private DDFTag accessType;
    private DDFTag dfFormat;
    private DDFTag dfType;
    private DDFTag nodeName;
    private final String parentPath;
    private DDFTag scope;
    private DDFTag value;

    /* renamed from: com.idm.core.ddf.DDFNode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$core$ddf$DDFTagType;

        static {
            int[] iArr = new int[DDFTagType.values().length];
            $SwitchMap$com$idm$core$ddf$DDFTagType = iArr;
            try {
                iArr[DDFTagType.NODE_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$core$ddf$DDFTagType[DDFTagType.ACCESS_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$core$ddf$DDFTagType[DDFTagType.SCOPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$core$ddf$DDFTagType[DDFTagType.DF_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$core$ddf$DDFTagType[DDFTagType.DF_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$idm$core$ddf$DDFTagType[DDFTagType.VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public DDFNode(String str) {
        this.parentPath = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getPath$0(DDFTag dDFTag) {
        return this.parentPath + "/" + dDFTag.getValue();
    }

    public List<String> getAccessTypes() {
        DDFTag dDFTag = this.accessType;
        return (dDFTag == null || dDFTag.getValue() == null) ? Collections.emptyList() : Arrays.asList(this.accessType.getValue().split(XmlParser.Polling.POLLING_VERSION_SEPARATOR));
    }

    public String getDfFormat() {
        return (String) Optional.ofNullable(this.dfFormat).map(new b(2)).orElse("");
    }

    public String getDfType() {
        return (String) Optional.ofNullable(this.dfType).map(new b(2)).orElse("");
    }

    public String getNodeName() {
        return (String) Optional.ofNullable(this.nodeName).map(new b(2)).orElse("");
    }

    public String getPath() {
        return (String) Optional.ofNullable(this.nodeName).map(new D2.b(1, this)).orElse(this.parentPath);
    }

    public String getScope() {
        return (String) Optional.ofNullable(this.scope).map(new b(2)).orElse("");
    }

    public String getValue() {
        return (String) Optional.ofNullable(this.value).map(new b(2)).orElse("");
    }

    public void setTag(DDFTagType dDFTagType, DDFTag dDFTag) {
        switch (AnonymousClass1.$SwitchMap$com$idm$core$ddf$DDFTagType[dDFTagType.ordinal()]) {
            case 1:
                this.nodeName = dDFTag;
                break;
            case 2:
                this.accessType = dDFTag;
                break;
            case 3:
                this.scope = dDFTag;
                break;
            case 4:
                this.dfFormat = dDFTag;
                break;
            case 5:
                this.dfType = dDFTag;
                break;
            case 6:
                this.value = dDFTag;
                break;
        }
    }

    public String toString() {
        return "NodeName : " + getNodeName() + ", AccessType : " + getAccessTypes() + ", Scope : " + getScope() + ", DfFormat : " + getDfFormat() + ", DfType : " + getDfType() + ", Value : " + getValue() + ", Path : " + getPath();
    }
}
