package com.idm.core.wbxml;

import android.text.TextUtils;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Alert;
import com.idm.core.syncml.Atomic;
import com.idm.core.syncml.Command;
import com.idm.core.syncml.Constants;
import com.idm.core.syncml.Copy;
import com.idm.core.syncml.Cred;
import com.idm.core.syncml.Delete;
import com.idm.core.syncml.Exec;
import com.idm.core.syncml.Get;
import com.idm.core.syncml.Item;
import com.idm.core.syncml.Meta;
import com.idm.core.syncml.Replace;
import com.idm.core.syncml.Results;
import com.idm.core.syncml.Sequence;
import com.idm.core.syncml.Source;
import com.idm.core.syncml.Status;
import com.idm.core.syncml.SyncBody;
import com.idm.core.syncml.SyncHdr;
import com.idm.core.syncml.SyncML;
import com.idm.core.syncml.Target;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class IDMWbxmlSyncmlEncoder implements IDMWbxmlConstants, Constants {
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private int idmWbxmlAddContent(String str) {
        return !idmWbxmlEncodeAddContent(str) ? 5 : 0;
    }

    private void idmWbxmlAddElement(int i5, String str) {
        if (i5 == 15) {
            idmWbxmlStartElement(i5);
            if (!TextUtils.isEmpty(str)) {
                idmWbxmlAddContent(str);
            }
            idmWbxmlEndElement();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        idmWbxmlStartElement(i5);
        idmWbxmlAddContent(str);
        idmWbxmlEndElement();
    }

    private int idmWbxmlAddEmptyElement(int i5) {
        return !idmWbxmlEncodeStartElement(i5, false) ? 5 : 0;
    }

    private boolean idmWbxmlAppendByte(int i5) {
        try {
            this.out.write(i5);
            return true;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }

    private boolean idmWbxmlAppendMultiByteUInt32(int i5) {
        int i6;
        byte[] bArr = new byte[5];
        int i7 = 0;
        while (true) {
            i6 = i7 + 1;
            bArr[i7] = (byte) (i5 & 127);
            i5 >>= 7;
            if (i5 == 0) {
                break;
            }
            i7 = i6;
        }
        while (i6 > 1) {
            i6--;
            this.out.write(bArr[i6] | 128);
        }
        this.out.write(bArr[0]);
        return true;
    }

    private boolean idmWbxmlAppendSwitchpage(int i5) {
        return idmWbxmlAppendByte(0) && idmWbxmlAppendByte(i5);
    }

    private boolean idmWbxmlAppendToBuffer(String str) throws IOException {
        try {
            this.out.write(str.getBytes(Charset.defaultCharset()));
            return true;
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
            return false;
        }
    }

    private boolean idmWbxmlEncodeAddContent(String str) {
        if (!idmWbxmlAppendByte(3) || !idmWbxmlAppendToBuffer(str)) {
            return false;
        }
        this.out.write(0);
        return true;
    }

    private boolean idmWbxmlEncodeAddContentOpaque(char[] cArr) {
        if (!idmWbxmlAppendByte(IDMWbxmlConstants.WBXML_OPAQUE) || !idmWbxmlAppendMultiByteUInt32(cArr.length)) {
            return false;
        }
        for (char c2 : cArr) {
            this.out.write(c2);
        }
        return true;
    }

    private boolean idmWbxmlEncodeEndElement() {
        return idmWbxmlAppendByte(1);
    }

    private boolean idmWbxmlEncodeStartDocument(int i5, int i6, String str, int i7) {
        if (idmWbxmlAppendByte(2) && idmWbxmlAppendMultiByteUInt32(i5)) {
            return (i5 != 0 || idmWbxmlAppendMultiByteUInt32(0)) && idmWbxmlAppendMultiByteUInt32(i6) && idmWbxmlAppendMultiByteUInt32(i7) && idmWbxmlAppendToBuffer(str);
        }
        return false;
    }

    private boolean idmWbxmlEncodeStartElement(int i5, boolean z4) {
        if (z4) {
            i5 |= 64;
        }
        return idmWbxmlAppendByte(i5);
    }

    private int idmWbxmlEndElement() {
        return !idmWbxmlEncodeEndElement() ? 5 : 0;
    }

    private ByteArrayOutputStream idmWbxmlGetBuffer() {
        return this.out;
    }

    private int idmWbxmlGetBufferSize() {
        return this.out.size();
    }

    private int idmWbxmlMakeAdd(Add add) {
        int iIdmWbxmlMakeItemlist;
        if (add == null) {
            return 6;
        }
        idmWbxmlStartElement(5);
        idmWbxmlAddElement(11, add.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(add.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        if (add.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(add.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeAlert(Alert alert) {
        int iIdmWbxmlMakeItemlist;
        if (alert == null || TextUtils.isEmpty(alert.getCmdID()) || TextUtils.isEmpty(alert.getData())) {
            return 6;
        }
        idmWbxmlStartElement(6);
        idmWbxmlAddElement(11, alert.getCmdID());
        idmWbxmlAddElement(60, alert.getCorrelator());
        idmWbxmlAddElement(15, alert.getData());
        if (alert.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(alert.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeAtomic(Atomic atomic) {
        if (atomic == null) {
            return 6;
        }
        idmWbxmlStartElement(8);
        idmWbxmlAddElement(11, atomic.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(atomic.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        ArrayList<Command> commandList = atomic.getCommandList();
        if (commandList != null) {
            Iterator<Command> it = commandList.iterator();
            while (it.hasNext()) {
                Command next = it.next();
                if (next instanceof Alert) {
                    idmWbxmlMakeAlert((Alert) next);
                } else if (next instanceof Replace) {
                    idmWbxmlMakeReplace((Replace) next);
                } else if (next instanceof Add) {
                    idmWbxmlMakeAdd((Add) next);
                } else if (next instanceof Copy) {
                    idmWbxmlMakeCopy((Copy) next);
                } else if (next instanceof Delete) {
                    idmWbxmlMakeDelete((Delete) next);
                } else {
                    IDMDebug.E("now not support wbxml encoder");
                }
            }
        }
        idmWbxmlEndElement();
        return 0;
    }

    private void idmWbxmlMakeCommandList(ArrayList<Command> arrayList) {
        if (arrayList != null) {
            Iterator<Command> it = arrayList.iterator();
            while (it.hasNext()) {
                Command next = it.next();
                if (next instanceof Status) {
                    idmWbxmlMakeStatus((Status) next);
                } else if (next instanceof Results) {
                    idmWbxmlMakeResults((Results) next);
                } else if (next instanceof Alert) {
                    idmWbxmlMakeAlert((Alert) next);
                } else if (next instanceof Replace) {
                    idmWbxmlMakeReplace((Replace) next);
                } else if (next instanceof Add) {
                    idmWbxmlMakeAdd((Add) next);
                } else if (next instanceof Copy) {
                    idmWbxmlMakeCopy((Copy) next);
                } else if (next instanceof Delete) {
                    idmWbxmlMakeDelete((Delete) next);
                } else if (next instanceof Get) {
                    idmWbxmlMakeGet((Get) next);
                } else if (next instanceof Exec) {
                    idmWbxmlMakeExec((Exec) next);
                } else if (next instanceof Atomic) {
                    idmWbxmlMakeAtomic((Atomic) next);
                } else if (next instanceof Sequence) {
                    idmWbxmlMakeSequence((Sequence) next);
                } else {
                    IDMDebug.E("now not support wbxml encoder");
                }
            }
        }
    }

    private int idmWbxmlMakeCopy(Copy copy) {
        int iIdmWbxmlMakeItemlist;
        if (copy == null) {
            return 6;
        }
        idmWbxmlStartElement(13);
        idmWbxmlAddElement(11, copy.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(copy.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        if (copy.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(copy.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeCred(Cred cred) {
        if (cred == null) {
            return 0;
        }
        idmWbxmlStartElement(14);
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(cred.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        idmWbxmlAddElement(15, cred.getData());
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeDelete(Delete delete) {
        int iIdmWbxmlMakeItemlist;
        if (delete == null) {
            return 6;
        }
        idmWbxmlStartElement(16);
        idmWbxmlAddElement(11, delete.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(delete.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        if (delete.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(delete.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeEndSyncbody(boolean z4) {
        if (z4) {
            idmWbxmlAddEmptyElement(18);
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeEndSyncml() {
        return !idmWbxmlEncodeEndElement() ? 5 : 0;
    }

    private int idmWbxmlMakeExec(Exec exec) {
        int iIdmWbxmlMakeItemlist;
        if (exec == null) {
            return 6;
        }
        idmWbxmlStartElement(17);
        idmWbxmlAddElement(11, exec.getCmdID());
        idmWbxmlAddElement(60, exec.getCorrelator());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(exec.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        if (exec.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(exec.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeGet(Get get) {
        int iIdmWbxmlMakeItemlist;
        if (get == null) {
            return 6;
        }
        idmWbxmlStartElement(19);
        idmWbxmlAddElement(11, get.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(get.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        if (get.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(get.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeItem(Item item) {
        if (item == null) {
            return 6;
        }
        idmWbxmlStartElement(20);
        int iIdmWbxmlMakeTarget = idmWbxmlMakeTarget(item.getTarget());
        if (iIdmWbxmlMakeTarget != 0) {
            return iIdmWbxmlMakeTarget;
        }
        int iIdmWbxmlMakeSource = idmWbxmlMakeSource(item.getSource());
        if (iIdmWbxmlMakeSource != 0) {
            return iIdmWbxmlMakeSource;
        }
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(item.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        idmWbxmlAddElement(15, item.getData());
        if (item.isMoreData()) {
            idmWbxmlAddEmptyElement(52);
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeItemlist(ArrayList<Item> arrayList) {
        if (arrayList == null) {
            return 6;
        }
        Iterator<Item> it = arrayList.iterator();
        while (it.hasNext()) {
            int iIdmWbxmlMakeItem = idmWbxmlMakeItem(it.next());
            if (iIdmWbxmlMakeItem != 0) {
                return iIdmWbxmlMakeItem;
            }
        }
        return 0;
    }

    private int idmWbxmlMakeMeta(Meta meta) {
        if (meta == null) {
            return 0;
        }
        idmWbxmlStartElement(26);
        if (!idmWbxmlAppendSwitchpage(1)) {
            return 5;
        }
        idmWbxmlAddElement(7, meta.getFormat());
        idmWbxmlAddElement(19, meta.getType());
        idmWbxmlAddElement(18, meta.getSize());
        idmWbxmlAddElement(16, meta.getNextNonce());
        idmWbxmlAddElement(12, meta.getMaxMsgSize());
        idmWbxmlAddElement(21, meta.getMaxObjSize());
        if (!idmWbxmlAppendSwitchpage(0)) {
            return 5;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeReplace(Replace replace) {
        int iIdmWbxmlMakeItemlist;
        if (replace == null) {
            return 6;
        }
        idmWbxmlStartElement(32);
        idmWbxmlAddElement(11, replace.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(replace.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        if (replace.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(replace.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeResults(Results results) {
        int iIdmWbxmlMakeItemlist;
        if (results == null) {
            return 6;
        }
        idmWbxmlStartElement(34);
        idmWbxmlAddElement(11, results.getCmdID());
        idmWbxmlAddElement(28, results.getMsgRef());
        idmWbxmlAddElement(12, results.getCmdRef());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(results.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            idmWbxmlEndElement();
            return iIdmWbxmlMakeMeta;
        }
        idmWbxmlAddElement(47, results.getTargetRef());
        idmWbxmlAddElement(40, results.getSourceRef());
        if (results.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(results.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeSequence(Sequence sequence) {
        if (sequence == null) {
            return 6;
        }
        idmWbxmlStartElement(36);
        idmWbxmlAddElement(11, sequence.getCmdID());
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(sequence.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        ArrayList<Command> commandList = sequence.getCommandList();
        if (commandList != null) {
            Iterator<Command> it = commandList.iterator();
            while (it.hasNext()) {
                Command next = it.next();
                if (next instanceof Alert) {
                    idmWbxmlMakeAlert((Alert) next);
                } else if (next instanceof Replace) {
                    idmWbxmlMakeReplace((Replace) next);
                } else if (next instanceof Add) {
                    idmWbxmlMakeAdd((Add) next);
                } else if (next instanceof Copy) {
                    idmWbxmlMakeCopy((Copy) next);
                } else if (next instanceof Delete) {
                    idmWbxmlMakeDelete((Delete) next);
                } else if (next instanceof Get) {
                    idmWbxmlMakeGet((Get) next);
                } else if (next instanceof Exec) {
                    idmWbxmlMakeExec((Exec) next);
                } else {
                    IDMDebug.E("now not support wbxml encoder");
                }
            }
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeSource(Source source) {
        if (source == null) {
            return 0;
        }
        if (TextUtils.isEmpty(source.getLocURI()) && TextUtils.isEmpty(source.getLocName())) {
            return 6;
        }
        idmWbxmlStartElement(39);
        idmWbxmlAddElement(23, source.getLocURI());
        idmWbxmlAddElement(22, source.getLocName());
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeStartSyncbody() {
        idmWbxmlStartElement(43);
        return 0;
    }

    private int idmWbxmlMakeStartSyncml(int i5, int i6, String str) {
        if (!idmWbxmlEncodeStartDocument(i5, i6, str, str.length())) {
            return 5;
        }
        idmWbxmlStartElement(45);
        return 0;
    }

    private int idmWbxmlMakeStatus(Status status) {
        int iIdmWbxmlMakeItemlist;
        if (status == null) {
            return 6;
        }
        IDMDebug.I("makeStatus cmd.cmd = " + status.getCmd());
        IDMDebug.I("makeStatus cmd.data = " + status.getData());
        if (TextUtils.isEmpty(status.getCmdID()) || TextUtils.isEmpty(status.getMsgRef()) || TextUtils.isEmpty(status.getData())) {
            return 6;
        }
        idmWbxmlStartElement(41);
        idmWbxmlAddElement(11, status.getCmdID());
        idmWbxmlAddElement(28, status.getMsgRef());
        idmWbxmlAddElement(12, status.getCmdRef());
        idmWbxmlAddElement(10, status.getCmd());
        idmWbxmlAddElement(47, status.getTargetRef());
        idmWbxmlAddElement(40, status.getSourceRef());
        if (status.getChal() != null) {
            idmWbxmlStartElement(9);
            int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(status.getChal().getMeta());
            if (iIdmWbxmlMakeMeta != 0) {
                return iIdmWbxmlMakeMeta;
            }
            idmWbxmlEndElement();
        }
        idmWbxmlAddElement(15, status.getData());
        if (status.getItemList() != null && (iIdmWbxmlMakeItemlist = idmWbxmlMakeItemlist(status.getItemList())) != 0) {
            return iIdmWbxmlMakeItemlist;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private void idmWbxmlMakeSyncBody(SyncBody syncBody) {
        if (syncBody != null) {
            idmWbxmlMakeStartSyncbody();
            idmWbxmlMakeCommandList(syncBody.getCommandList());
            idmWbxmlMakeEndSyncbody(syncBody.isFinalMsg());
        }
    }

    private int idmWbxmlMakeSyncHeader(SyncHdr syncHdr) {
        idmWbxmlStartElement(44);
        idmWbxmlAddElement(49, syncHdr.getVerDTD());
        idmWbxmlAddElement(50, syncHdr.getVerProto());
        idmWbxmlAddElement(37, syncHdr.getSessionID());
        idmWbxmlAddElement(27, syncHdr.getMsgID());
        idmWbxmlAddElement(33, syncHdr.getRespURI());
        int iIdmWbxmlMakeTarget = idmWbxmlMakeTarget(syncHdr.getTarget());
        if (iIdmWbxmlMakeTarget != 0) {
            return iIdmWbxmlMakeTarget;
        }
        int iIdmWbxmlMakeSource = idmWbxmlMakeSource(syncHdr.getSource());
        if (iIdmWbxmlMakeSource != 0) {
            return iIdmWbxmlMakeSource;
        }
        int iIdmWbxmlMakeCred = idmWbxmlMakeCred(syncHdr.getCred());
        if (iIdmWbxmlMakeCred != 0) {
            return iIdmWbxmlMakeCred;
        }
        int iIdmWbxmlMakeMeta = idmWbxmlMakeMeta(syncHdr.getMeta());
        if (iIdmWbxmlMakeMeta != 0) {
            return iIdmWbxmlMakeMeta;
        }
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlMakeTarget(Target target) {
        if (target == null) {
            return 0;
        }
        if (TextUtils.isEmpty(target.getLocURI()) && TextUtils.isEmpty(target.getLocName())) {
            return 6;
        }
        idmWbxmlStartElement(46);
        idmWbxmlAddElement(23, target.getLocURI());
        idmWbxmlAddElement(22, target.getLocName());
        idmWbxmlEndElement();
        return 0;
    }

    private int idmWbxmlStartElement(int i5) {
        return !idmWbxmlEncodeStartElement(i5, true) ? 5 : 0;
    }

    public byte[] idmWbxmlEncode(SyncML syncML) {
        try {
            idmWbxmlMakeStartSyncml(0, 106, Constants.SYNCML_WBXML_STRING_TABLE_1_2);
            idmWbxmlMakeSyncHeader(syncML.getSyncHdr());
            idmWbxmlMakeSyncBody(syncML.getSyncBody());
            idmWbxmlMakeEndSyncml();
            return this.out.toByteArray();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
