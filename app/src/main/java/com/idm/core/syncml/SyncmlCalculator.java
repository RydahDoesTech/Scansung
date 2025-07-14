package com.idm.core.syncml;

import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SyncmlCalculator implements Constants {
    private String mimeType;

    public SyncmlCalculator(String str) {
        this.mimeType = str;
    }

    private int getCommandWBXMLSize(Command command) {
        if (command instanceof Alert) {
            return getWBXMLSize((Alert) command);
        }
        if (command instanceof Replace) {
            return getWBXMLSize((Replace) command);
        }
        if (command instanceof Status) {
            return getWBXMLSize((Status) command);
        }
        if (command instanceof Results) {
            return getWBXMLSize((Results) command);
        }
        IDMDebug.E("other commands!!!!!!!!!!!!");
        return 0;
    }

    private int getCommandXMLSize(Command command) {
        if (command instanceof Alert) {
            return getXMLSize((Alert) command);
        }
        if (command instanceof Replace) {
            return getXMLSize((Replace) command);
        }
        if (command instanceof Status) {
            return getXMLSize((Status) command);
        }
        if (command instanceof Results) {
            return getXMLSize((Results) command);
        }
        IDMDebug.E("other commands!!!!!!!!!!!!");
        return 0;
    }

    private int getWBXMLSize(SyncML syncML) {
        if (syncML != null) {
            return getWBXMLSize(syncML.getSyncHdr()) + 36 + getWBXMLSize(syncML.getSyncBody());
        }
        return 0;
    }

    private int getXMLSize(SyncML syncML) {
        if (syncML != null) {
            return getXMLTagSize("SyncML", true) + getXMLSize(syncML.getSyncHdr()) + getXMLSize(syncML.getSyncBody());
        }
        return 0;
    }

    private int getXMLTagSize(String str, boolean z4) {
        if (str != null) {
            return z4 ? (str.length() * 2) + 5 : str.length() + 4;
        }
        return 0;
    }

    public int getSyncmlCommandSize(Command command) {
        if (Constants.MIMETYPE_SYNCML_DM_XML.equals(this.mimeType)) {
            return getCommandXMLSize(command);
        }
        if ("application/vnd.syncml.dm+wbxml".equals(this.mimeType)) {
            return getCommandWBXMLSize(command);
        }
        IDMDebug.I("mimeType is not support");
        return 0;
    }

    public int getSyncmlSize(SyncML syncML) {
        if (Constants.MIMETYPE_SYNCML_DM_XML.equals(this.mimeType)) {
            return getXMLSize(syncML);
        }
        if ("application/vnd.syncml.dm+wbxml".equals(this.mimeType)) {
            return getWBXMLSize(syncML);
        }
        IDMDebug.I("mimeType is not support");
        return 0;
    }

    private int getWBXMLSize(SyncHdr syncHdr) {
        if (syncHdr != null) {
            return getWBXMLSize(syncHdr.getVerDTD()) + 2 + getWBXMLSize(syncHdr.getVerProto()) + getWBXMLSize(syncHdr.getSessionID()) + getWBXMLSize(syncHdr.getMsgID()) + getWBXMLSize(syncHdr.getTarget()) + getWBXMLSize(syncHdr.getSource()) + getWBXMLSize(syncHdr.getRespURI()) + getWBXMLSize(syncHdr.getCred()) + getWBXMLSize(syncHdr.getMeta());
        }
        return 0;
    }

    private int getXMLSize(SyncHdr syncHdr) {
        if (syncHdr != null) {
            return getXMLTagSize(Constants.SYNCML_TAG_SYNCHDR, true) + getXMLSize("VerDTD", syncHdr.getVerDTD()) + getXMLSize(Constants.SYNCML_TAG_VERPROTO, syncHdr.getVerProto()) + getXMLSize(Constants.SYNCML_TAG_SESSIONID, syncHdr.getSessionID()) + getXMLSize(Constants.SYNCML_TAG_MSGID, syncHdr.getMsgID()) + getXMLSize(Constants.SYNCML_TAG_TARGET, syncHdr.getTarget()) + getXMLSize(Constants.SYNCML_TAG_SOURCE, syncHdr.getSource()) + getXMLSize(Constants.SYNCML_TAG_RESPURI, syncHdr.getRespURI()) + getXMLSize(syncHdr.getCred()) + getXMLSize(syncHdr.getMeta());
        }
        return 0;
    }

    private int getWBXMLSize(SyncBody syncBody) {
        if (syncBody == null) {
            return 0;
        }
        int commandWBXMLSize = (syncBody.isFinalMsg() ? 1 : 0) + 2;
        Iterator<Command> it = syncBody.getCommandList().iterator();
        while (it.hasNext()) {
            commandWBXMLSize += getCommandWBXMLSize(it.next());
        }
        return commandWBXMLSize;
    }

    private int getXMLSize(SyncBody syncBody) {
        if (syncBody != null) {
            int xMLTagSize = getXMLTagSize(Constants.SYNCML_TAG_SYNCBODY, true);
            xMLTagSize = syncBody.isFinalMsg() ? getXMLTagSize(Constants.SYNCML_TAG_FINAL, false) : 0;
            Iterator<Command> it = syncBody.getCommandList().iterator();
            xMLTagSize = xMLTagSize + xMLTagSize;
            while (it.hasNext()) {
                xMLTagSize += getCommandXMLSize(it.next());
            }
        }
        return xMLTagSize;
    }

    private int getWBXMLSize(Alert alert) {
        if (alert == null) {
            return 0;
        }
        int wBXMLSize = getWBXMLSize(alert.getCmdID()) + 2 + getWBXMLSize(alert.getCorrelator()) + getWBXMLSize(alert.getData()) + getWBXMLSize(alert.getMeta());
        Iterator<Item> it = alert.getItemList().iterator();
        while (it.hasNext()) {
            wBXMLSize += getWBXMLSize(it.next());
        }
        return wBXMLSize;
    }

    private int getXMLSize(Alert alert) {
        if (alert == null) {
            return 0;
        }
        int xMLTagSize = getXMLTagSize(Constants.SYNCML_TAG_ALERT, true) + getXMLSize(Constants.SYNCML_TAG_CMDID, alert.getCmdID()) + getXMLSize(Constants.SYNCML_TAG_CORRELATOR, alert.getCorrelator()) + getXMLSize(Constants.SYNCML_TAG_DATA, alert.getData()) + getXMLSize(alert.getMeta());
        Iterator<Item> it = alert.getItemList().iterator();
        while (it.hasNext()) {
            xMLTagSize += getXMLSize(it.next());
        }
        return xMLTagSize;
    }

    private int getWBXMLSize(Replace replace) {
        if (replace == null) {
            return 0;
        }
        int wBXMLSize = getWBXMLSize(replace.getCmdID()) + 2 + getWBXMLSize(replace.getMeta());
        Iterator<Item> it = replace.getItemList().iterator();
        while (it.hasNext()) {
            wBXMLSize += getWBXMLSize(it.next());
        }
        return wBXMLSize;
    }

    private int getXMLSize(Replace replace) {
        if (replace == null) {
            return 0;
        }
        int xMLTagSize = getXMLTagSize(Constants.SYNCML_TAG_REPLACE, true) + getXMLSize(Constants.SYNCML_TAG_CMDID, replace.getCmdID()) + getXMLSize(replace.getMeta());
        Iterator<Item> it = replace.getItemList().iterator();
        while (it.hasNext()) {
            xMLTagSize += getXMLSize(it.next());
        }
        return xMLTagSize;
    }

    private int getWBXMLSize(Status status) {
        if (status == null) {
            return 0;
        }
        int wBXMLSize = getWBXMLSize(status.getCmdID()) + 2 + getWBXMLSize(status.getMsgRef()) + getWBXMLSize(status.getCmdRef()) + getWBXMLSize(status.getCmd()) + getWBXMLSize(status.getTargetRef()) + getWBXMLSize(status.getSourceRef()) + getWBXMLSize(status.getChal()) + getWBXMLSize(status.getData());
        Iterator<Item> it = status.getItemList().iterator();
        while (it.hasNext()) {
            wBXMLSize += getWBXMLSize(it.next());
        }
        return wBXMLSize;
    }

    private int getXMLSize(Status status) {
        if (status == null) {
            return 0;
        }
        int xMLTagSize = getXMLTagSize(Constants.SYNCML_TAG_STATUS, true) + getXMLSize(Constants.SYNCML_TAG_CMDID, status.getCmdID()) + getXMLSize(Constants.SYNCML_TAG_MSGREF, status.getMsgRef()) + getXMLSize(Constants.SYNCML_TAG_CMDREF, status.getCmdRef()) + getXMLSize(Constants.SYNCML_TAG_CMD, status.getCmd()) + getXMLSize(Constants.SYNCML_TAG_TARGETREF, status.getTargetRef()) + getXMLSize(Constants.SYNCML_TAG_SOURCEREF, status.getSourceRef()) + getXMLSize(status.getChal()) + getXMLSize(Constants.SYNCML_TAG_DATA, status.getData());
        Iterator<Item> it = status.getItemList().iterator();
        while (it.hasNext()) {
            xMLTagSize += getXMLSize(it.next());
        }
        return xMLTagSize;
    }

    private int getWBXMLSize(Results results) {
        if (results == null) {
            return 0;
        }
        int wBXMLSize = getWBXMLSize(results.getCmdID()) + 2 + getWBXMLSize(results.getMsgRef()) + getWBXMLSize(results.getCmdRef()) + getWBXMLSize(results.getTargetRef()) + getWBXMLSize(results.getSourceRef());
        Iterator<Item> it = results.getItemList().iterator();
        while (it.hasNext()) {
            wBXMLSize += getWBXMLSize(it.next());
        }
        return wBXMLSize;
    }

    private int getXMLSize(Results results) {
        if (results == null) {
            return 0;
        }
        int xMLTagSize = getXMLTagSize(Constants.SYNCML_TAG_RESULTS, true) + getXMLSize(Constants.SYNCML_TAG_CMDID, results.getCmdID()) + getXMLSize(Constants.SYNCML_TAG_MSGREF, results.getMsgRef()) + getXMLSize(Constants.SYNCML_TAG_CMDREF, results.getCmdRef()) + getXMLSize(Constants.SYNCML_TAG_TARGETREF, results.getTargetRef()) + getXMLSize(Constants.SYNCML_TAG_SOURCEREF, results.getSourceRef());
        Iterator<Item> it = results.getItemList().iterator();
        while (it.hasNext()) {
            xMLTagSize += getXMLSize(it.next());
        }
        return xMLTagSize;
    }

    private int getWBXMLSize(Chal chal) {
        if (chal != null) {
            return getWBXMLSize(chal.getMeta()) + 2;
        }
        return 0;
    }

    private int getWBXMLSize(Item item) {
        if (item == null) {
            return 0;
        }
        return (item.isMoreData() ? 1 : 0) + getWBXMLSize(item.getTarget()) + 2 + getWBXMLSize(item.getSource()) + getWBXMLSize(item.getMeta()) + getWBXMLSize(item.getData());
    }

    private int getWBXMLSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return str.length() + 4;
    }

    private int getXMLSize(Chal chal) {
        if (chal != null) {
            return getXMLTagSize(Constants.SYNCML_TAG_CHAL, true) + getXMLSize(chal.getMeta());
        }
        return 0;
    }

    private int getWBXMLSize(Location location) {
        if (location != null) {
            return getWBXMLSize(location.getLocName()) + 2 + getWBXMLSize(location.getLocURI());
        }
        return 0;
    }

    private int getXMLSize(Item item) {
        if (item == null) {
            return 0;
        }
        return (item.isMoreData() ? getXMLTagSize(Constants.SYNCML_TAG_MOREDATA, false) : 0) + getXMLTagSize(Constants.SYNCML_TAG_ITEM, true) + getXMLSize(Constants.SYNCML_TAG_TARGET, item.getTarget()) + getXMLSize(Constants.SYNCML_TAG_SOURCE, item.getSource()) + getXMLSize(item.getMeta()) + getXMLSize(Constants.SYNCML_TAG_DATA, item.getData());
    }

    private int getWBXMLSize(Cred cred) {
        if (cred != null) {
            return getWBXMLSize(cred.getMeta()) + 2 + getWBXMLSize(cred.getData());
        }
        return 0;
    }

    private int getWBXMLSize(Meta meta) {
        if (meta != null) {
            return getWBXMLSize(meta.getFormat()) + 6 + getWBXMLSize(meta.getType()) + getWBXMLSize(meta.getSize()) + getWBXMLSize(meta.getNextNonce()) + getWBXMLSize(meta.getMaxMsgSize()) + getWBXMLSize(meta.getMaxObjSize());
        }
        return 0;
    }

    private int getXMLSize(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        return str2.length() + getXMLTagSize(str, true);
    }

    private int getXMLSize(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3) || str2 == null) {
            return 0;
        }
        return str3.length() + str2.length() + getXMLTagSize(str, true) + 1;
    }

    private int getXMLSize(String str, Location location) {
        if (location != null) {
            return getXMLTagSize(str, true) + getXMLSize(Constants.SYNCML_TAG_LOCNAME, location.getLocName()) + getXMLSize(Constants.SYNCML_TAG_LOCURI, location.getLocURI());
        }
        return 0;
    }

    private int getXMLSize(Cred cred) {
        if (cred != null) {
            return getXMLTagSize(Constants.SYNCML_TAG_CRED, true) + getXMLSize(cred.getMeta()) + getXMLSize(Constants.SYNCML_TAG_DATA, cred.getData());
        }
        return 0;
    }

    private int getXMLSize(Meta meta) {
        if (meta != null) {
            return getXMLTagSize(Constants.SYNCML_TAG_META, true) + getXMLSize("Format", Constants.XML_XMLNS_METAINFO, meta.getFormat()) + getXMLSize("Type", Constants.XML_XMLNS_METAINFO, meta.getType()) + getXMLSize("Size", Constants.XML_XMLNS_METAINFO, meta.getSize()) + getXMLSize(Constants.SYNCML_TAG_NEXTNONCE, Constants.XML_XMLNS_METAINFO, meta.getNextNonce()) + getXMLSize(Constants.SYNCML_TAG_MAXMSGSIZE, Constants.XML_XMLNS_METAINFO, meta.getMaxMsgSize()) + getXMLSize(Constants.SYNCML_TAG_MAXOBJSIZE, Constants.XML_XMLNS_METAINFO, meta.getMaxObjSize());
        }
        return 0;
    }
}
