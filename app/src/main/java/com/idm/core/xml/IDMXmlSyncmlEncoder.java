package com.idm.core.xml;

import android.text.TextUtils;
import android.util.Xml;
import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Alert;
import com.idm.core.syncml.Atomic;
import com.idm.core.syncml.Chal;
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
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
class IDMXmlSyncmlEncoder implements Constants {
    private XmlSerializer serializer;

    private void idmSyncmlMakeAdd(Add add) throws IllegalStateException, IOException, IllegalArgumentException {
        if (add != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_ADD);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, add.getCmdID());
            idmSyncmlMakeItemList(add.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_ADD);
        }
    }

    private void idmSyncmlMakeAlert(Alert alert) throws IllegalStateException, IOException, IllegalArgumentException {
        if (alert != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_ALERT);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, alert.getCmdID());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_DATA, alert.getData());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CORRELATOR, alert.getCorrelator());
            idmSyncmlMakeItemList(alert.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_ALERT);
        }
    }

    private void idmSyncmlMakeAtomic(Atomic atomic) throws IllegalStateException, IOException, IllegalArgumentException {
        if (atomic != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_ATOMIC);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, atomic.getCmdID());
            idmSyncmlMakeCommandList(atomic.getCommandList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_ATOMIC);
        }
    }

    private void idmSyncmlMakeChal(Chal chal) throws IllegalStateException, IOException, IllegalArgumentException {
        if (chal != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_CHAL);
            idmSyncmlMakeMeta(chal.getMeta());
            this.serializer.endTag(null, Constants.SYNCML_TAG_CHAL);
        }
    }

    private void idmSyncmlMakeCommandList(ArrayList<Command> arrayList) throws IllegalStateException, IOException, IllegalArgumentException {
        if (arrayList != null) {
            Iterator<Command> it = arrayList.iterator();
            while (it.hasNext()) {
                Command next = it.next();
                if (next instanceof Status) {
                    idmSyncmlMakeStatus((Status) next);
                } else if (next instanceof Results) {
                    idmSyncmlMakeResults((Results) next);
                } else if (next instanceof Alert) {
                    idmSyncmlMakeAlert((Alert) next);
                } else if (next instanceof Add) {
                    idmSyncmlMakeAdd((Add) next);
                } else if (next instanceof Copy) {
                    idmSyncmlMakeCopy((Copy) next);
                } else if (next instanceof Delete) {
                    idmSyncmlMakeDelete((Delete) next);
                } else if (next instanceof Get) {
                    idmSyncmlMakeGet((Get) next);
                } else if (next instanceof Replace) {
                    idmSyncmlMakeReplace((Replace) next);
                } else if (next instanceof Exec) {
                    idmSyncmlMakeExec((Exec) next);
                } else if (next instanceof Atomic) {
                    idmSyncmlMakeAtomic((Atomic) next);
                } else if (next instanceof Sequence) {
                    idmSyncmlMakeSequence((Sequence) next);
                }
            }
        }
    }

    private void idmSyncmlMakeCopy(Copy copy) throws IllegalStateException, IOException, IllegalArgumentException {
        if (copy != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_COPY);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, copy.getCmdID());
            idmSyncmlMakeItemList(copy.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_COPY);
        }
    }

    private void idmSyncmlMakeCred(Cred cred) throws IllegalStateException, IOException, IllegalArgumentException {
        if (cred != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_CRED);
            idmSyncmlMakeMeta(cred.getMeta());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_DATA, cred.getData());
            this.serializer.endTag(null, Constants.SYNCML_TAG_CRED);
        }
    }

    private void idmSyncmlMakeDelete(Delete delete) throws IllegalStateException, IOException, IllegalArgumentException {
        if (delete != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_DELETE);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, delete.getCmdID());
            idmSyncmlMakeItemList(delete.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_DELETE);
        }
    }

    private void idmSyncmlMakeExec(Exec exec) throws IllegalStateException, IOException, IllegalArgumentException {
        if (exec != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_EXEC);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, exec.getCmdID());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CORRELATOR, exec.getCorrelator());
            idmSyncmlMakeItemList(exec.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_EXEC);
        }
    }

    private void idmSyncmlMakeGet(Get get) throws IllegalStateException, IOException, IllegalArgumentException {
        if (get != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_GET);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, get.getCmdID());
            idmSyncmlMakeItemList(get.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_GET);
        }
    }

    private void idmSyncmlMakeItemList(ArrayList<Item> arrayList) throws IllegalStateException, IOException, IllegalArgumentException {
        if (arrayList != null) {
            Iterator<Item> it = arrayList.iterator();
            while (it.hasNext()) {
                Item next = it.next();
                this.serializer.startTag(null, Constants.SYNCML_TAG_ITEM);
                idmSyncmlMakeTarget(next.getTarget());
                idmSyncmlMakeSource(next.getSource());
                idmSyncmlMakeMeta(next.getMeta());
                idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_DATA, next.getData());
                idmSyncmlMakeTag(Constants.SYNCML_TAG_MOREDATA, next.isMoreData());
                this.serializer.endTag(null, Constants.SYNCML_TAG_ITEM);
            }
        }
    }

    private void idmSyncmlMakeMeta(Meta meta) throws IllegalStateException, IOException, IllegalArgumentException {
        if (meta != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_META);
            idmSyncmlMakeTagWithAttrContent("Format", "xmlns", Constants.NAMESPACE_METINF, meta.getFormat());
            idmSyncmlMakeTagWithAttrContent("Type", "xmlns", Constants.NAMESPACE_METINF, meta.getType());
            idmSyncmlMakeTagWithAttrContent("Size", "xmlns", Constants.NAMESPACE_METINF, meta.getSize());
            idmSyncmlMakeTagWithAttrContent(Constants.SYNCML_TAG_NEXTNONCE, "xmlns", Constants.NAMESPACE_METINF, meta.getNextNonce());
            idmSyncmlMakeTagWithAttrContent(Constants.SYNCML_TAG_MAXMSGSIZE, "xmlns", Constants.NAMESPACE_METINF, meta.getMaxMsgSize());
            idmSyncmlMakeTagWithAttrContent(Constants.SYNCML_TAG_MAXOBJSIZE, "xmlns", Constants.NAMESPACE_METINF, meta.getMaxObjSize());
            this.serializer.endTag(null, Constants.SYNCML_TAG_META);
        }
    }

    private void idmSyncmlMakeReplace(Replace replace) throws IllegalStateException, IOException, IllegalArgumentException {
        if (replace != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_REPLACE);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, replace.getCmdID());
            idmSyncmlMakeItemList(replace.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_REPLACE);
        }
    }

    private void idmSyncmlMakeResults(Results results) throws IllegalStateException, IOException, IllegalArgumentException {
        if (results != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_RESULTS);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, results.getCmdID());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_MSGREF, results.getMsgRef());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDREF, results.getCmdRef());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_TARGETREF, results.getTargetRef());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_SOURCEREF, results.getSourceRef());
            idmSyncmlMakeItemList(results.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_RESULTS);
        }
    }

    private void idmSyncmlMakeSequence(Sequence sequence) throws IllegalStateException, IOException, IllegalArgumentException {
        if (sequence != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_SEQUENCE);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, sequence.getCmdID());
            idmSyncmlMakeCommandList(sequence.getCommandList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_SEQUENCE);
        }
    }

    private void idmSyncmlMakeSource(Source source) throws IllegalStateException, IOException, IllegalArgumentException {
        if (source != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_SOURCE);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_LOCURI, source.getLocURI());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_LOCNAME, source.getLocName());
            this.serializer.endTag(null, Constants.SYNCML_TAG_SOURCE);
        }
    }

    private void idmSyncmlMakeStatus(Status status) throws IllegalStateException, IOException, IllegalArgumentException {
        if (status != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_STATUS);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDID, status.getCmdID());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_MSGREF, status.getMsgRef());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMDREF, status.getCmdRef());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_CMD, status.getCmd());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_TARGETREF, status.getTargetRef());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_SOURCEREF, status.getSourceRef());
            idmSyncmlMakeChal(status.getChal());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_DATA, status.getData());
            idmSyncmlMakeItemList(status.getItemList());
            this.serializer.endTag(null, Constants.SYNCML_TAG_STATUS);
        }
    }

    private void idmSyncmlMakeSyncBody(SyncBody syncBody) throws IllegalStateException, IOException, IllegalArgumentException {
        if (syncBody != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_SYNCBODY);
            idmSyncmlMakeCommandList(syncBody.getCommandList());
            idmSyncmlMakeTag(Constants.SYNCML_TAG_FINAL, syncBody.isFinalMsg());
            this.serializer.endTag(null, Constants.SYNCML_TAG_SYNCBODY);
        }
    }

    private void idmSyncmlMakeSyncHeader(SyncHdr syncHdr) throws IllegalStateException, IOException, IllegalArgumentException {
        if (syncHdr != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_SYNCHDR);
            idmSyncmlMakeTagWithContent("VerDTD", syncHdr.getVerDTD());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_VERPROTO, syncHdr.getVerProto());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_SESSIONID, syncHdr.getSessionID());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_MSGID, syncHdr.getMsgID());
            idmSyncmlMakeTarget(syncHdr.getTarget());
            idmSyncmlMakeSource(syncHdr.getSource());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_RESPURI, syncHdr.getRespURI());
            idmSyncmlMakeCred(syncHdr.getCred());
            idmSyncmlMakeMeta(syncHdr.getMeta());
            this.serializer.endTag(null, Constants.SYNCML_TAG_SYNCHDR);
        }
    }

    private void idmSyncmlMakeTag(String str, boolean z4) throws IllegalStateException, IOException, IllegalArgumentException {
        if (z4) {
            this.serializer.startTag(null, str);
            this.serializer.endTag(null, str);
        }
    }

    private void idmSyncmlMakeTagWithAttrContent(String str, String str2, String str3, String str4) throws IllegalStateException, IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        this.serializer.startTag(null, str);
        this.serializer.attribute(null, str2, str3);
        this.serializer.text(str4);
        this.serializer.endTag(null, str);
    }

    private void idmSyncmlMakeTagWithContent(String str, String str2) throws IllegalStateException, IOException, IllegalArgumentException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.serializer.startTag(null, str);
        this.serializer.text(str2);
        this.serializer.endTag(null, str);
    }

    private void idmSyncmlMakeTarget(Target target) throws IllegalStateException, IOException, IllegalArgumentException {
        if (target != null) {
            this.serializer.startTag(null, Constants.SYNCML_TAG_TARGET);
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_LOCURI, target.getLocURI());
            idmSyncmlMakeTagWithContent(Constants.SYNCML_TAG_LOCNAME, target.getLocName());
            this.serializer.endTag(null, Constants.SYNCML_TAG_TARGET);
        }
    }

    public byte[] idmSyncmlEncode(SyncML syncML) throws IllegalStateException, IOException, IllegalArgumentException {
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        this.serializer = xmlSerializerNewSerializer;
        try {
            xmlSerializerNewSerializer.setOutput(stringWriter);
            this.serializer.startTag(null, "SyncML");
            idmSyncmlMakeSyncHeader(syncML.getSyncHdr());
            idmSyncmlMakeSyncBody(syncML.getSyncBody());
            this.serializer.endTag(null, "SyncML");
            this.serializer.endDocument();
            return stringWriter.toString().getBytes(Charset.defaultCharset());
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
