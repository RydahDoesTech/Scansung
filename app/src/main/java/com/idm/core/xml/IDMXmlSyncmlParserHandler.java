package com.idm.core.xml;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Alert;
import com.idm.core.syncml.Atomic;
import com.idm.core.syncml.Chal;
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
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class IDMXmlSyncmlParserHandler implements Constants {
    private Add add;
    private Alert alert;
    private Atomic atomic;
    private Chal chal;
    private String cmd;
    private String cmdID;
    private String cmdRef;
    private Copy copy;
    private String correlator;
    private Cred cred;
    private String data;
    private Delete delete;
    private Exec exec;
    private Get get;
    private Item item;
    private Meta meta;
    private String msgRef;
    private Replace replace;
    private Results results;
    private Sequence sequence;
    private Source source;
    private String sourceRef;
    private Status status;
    private Target target;
    private String targetRef;
    private boolean bSyncHdr = false;
    private boolean bVerDTD = false;
    private boolean bVerProto = false;
    private boolean bSessionID = false;
    private boolean bMsgID = false;
    private boolean bRespURI = false;
    private boolean bTarget = false;
    private boolean bSource = false;
    private boolean bLocURI = false;
    private boolean bLocName = false;
    private boolean bCred = false;
    private boolean bFormat = false;
    private boolean bType = false;
    private boolean bNextNonce = false;
    private boolean bMaxMsgSize = false;
    private boolean bMaxObjSize = false;
    private boolean bAtomic = false;
    private boolean bSequence = false;
    private boolean bAlert = false;
    private boolean bAdd = false;
    private boolean bGet = false;
    private boolean bReplace = false;
    private boolean bExec = false;
    private boolean bCopy = false;
    private boolean bDelete = false;
    private boolean bStatus = false;
    private boolean bChal = false;
    private boolean bResults = false;
    private boolean bItem = false;
    private boolean bData = false;
    private boolean bCmdID = false;
    private boolean bCmd = false;
    private boolean bCorrelator = false;
    private boolean bMsgRef = false;
    private boolean bCmdRef = false;
    private boolean bTargetRef = false;
    private boolean bSourceRef = false;
    private SyncML syncML = new SyncML();

    public void endTag(String str) {
        if ("SyncML".equals(str)) {
            IDMDebug.I("SYNCML_TAG_SYNCML");
            return;
        }
        if (Constants.SYNCML_TAG_SYNCHDR.equals(str)) {
            this.bSyncHdr = false;
            return;
        }
        if (Constants.SYNCML_TAG_SYNCBODY.equals(str)) {
            IDMDebug.I("SYNCML_TAG_SYNCBODY");
            return;
        }
        if ("VerDTD".equals(str)) {
            this.bVerDTD = false;
            return;
        }
        if (Constants.SYNCML_TAG_VERPROTO.equals(str)) {
            this.bVerProto = false;
            return;
        }
        if (Constants.SYNCML_TAG_SESSIONID.equals(str)) {
            this.bSessionID = false;
            return;
        }
        if (Constants.SYNCML_TAG_MSGID.equals(str)) {
            this.bMsgID = false;
            return;
        }
        if (Constants.SYNCML_TAG_RESPURI.equals(str)) {
            this.bRespURI = false;
            return;
        }
        if (Constants.SYNCML_TAG_TARGET.equals(str)) {
            this.bTarget = false;
            if (this.bSyncHdr) {
                this.syncML.getSyncHdr().setTarget(this.target);
                return;
            } else {
                if (this.bItem) {
                    this.item.setTarget(this.target);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_SOURCE.equals(str)) {
            this.bSource = false;
            if (this.bSyncHdr) {
                this.syncML.getSyncHdr().setSource(this.source);
                return;
            } else {
                if (this.bItem) {
                    this.item.setSource(this.source);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_LOCURI.equals(str)) {
            this.bLocURI = false;
            return;
        }
        if (Constants.SYNCML_TAG_LOCNAME.equals(str)) {
            this.bLocName = false;
            return;
        }
        if (Constants.SYNCML_TAG_CRED.equals(str)) {
            this.bCred = false;
            this.syncML.getSyncHdr().setCred(this.cred);
            return;
        }
        if (Constants.SYNCML_TAG_META.equals(str)) {
            if (this.bCred) {
                this.cred.setMeta(this.meta);
                return;
            }
            if (this.bSyncHdr) {
                this.syncML.getSyncHdr().setMeta(this.meta);
                return;
            }
            if (this.bItem) {
                this.item.setMeta(this.meta);
                return;
            }
            if (this.bAdd) {
                this.add.setMeta(this.meta);
                return;
            }
            if (this.bGet) {
                this.get.setMeta(this.meta);
                return;
            }
            if (this.bReplace) {
                this.replace.setMeta(this.meta);
                return;
            }
            if (this.bExec) {
                this.exec.setMeta(this.meta);
                return;
            }
            if (this.bCopy) {
                this.copy.setMeta(this.meta);
                return;
            }
            if (this.bDelete) {
                this.delete.setMeta(this.meta);
                return;
            } else if (this.bChal) {
                this.chal.setMeta(this.meta);
                return;
            } else {
                if (this.bResults) {
                    this.results.setMeta(this.meta);
                    return;
                }
                return;
            }
        }
        if ("Format".equals(str)) {
            this.bFormat = false;
            return;
        }
        if ("Type".equals(str)) {
            this.bType = false;
            return;
        }
        if (Constants.SYNCML_TAG_NEXTNONCE.equals(str)) {
            this.bNextNonce = false;
            return;
        }
        if (Constants.SYNCML_TAG_MAXMSGSIZE.equals(str)) {
            this.bMaxMsgSize = false;
            return;
        }
        if (Constants.SYNCML_TAG_MAXOBJSIZE.equals(str)) {
            this.bMaxObjSize = false;
            return;
        }
        if (Constants.SYNCML_TAG_DATA.equals(str)) {
            this.bData = false;
            if (this.bCred) {
                this.cred.setData(this.data);
                return;
            }
            if (this.bItem) {
                this.item.setData(this.data);
                return;
            } else if (this.bAlert) {
                this.alert.setData(this.data);
                return;
            } else {
                if (this.bStatus) {
                    this.status.setData(this.data);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_CMDID.equals(str)) {
            this.bCmdID = false;
            if (this.bAlert) {
                this.alert.setCmdID(this.cmdID);
                return;
            }
            if (this.bAdd) {
                this.add.setCmdID(this.cmdID);
                return;
            }
            if (this.bGet) {
                this.get.setCmdID(this.cmdID);
                return;
            }
            if (this.bReplace) {
                this.replace.setCmdID(this.cmdID);
                return;
            }
            if (this.bExec) {
                this.exec.setCmdID(this.cmdID);
                return;
            }
            if (this.bCopy) {
                this.copy.setCmdID(this.cmdID);
                return;
            }
            if (this.bDelete) {
                this.delete.setCmdID(this.cmdID);
                return;
            } else if (this.bStatus) {
                this.status.setCmdID(this.cmdID);
                return;
            } else {
                if (this.bResults) {
                    this.results.setCmdID(this.cmdID);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_ATOMIC.equals(str)) {
            this.bAtomic = false;
            this.syncML.getSyncBody().getCommandList().add(this.atomic);
            return;
        }
        if (Constants.SYNCML_TAG_SEQUENCE.equals(str)) {
            this.bSequence = false;
            this.syncML.getSyncBody().getCommandList().add(this.sequence);
            return;
        }
        if (Constants.SYNCML_TAG_ALERT.equals(str)) {
            this.bAlert = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.alert);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.alert);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.alert);
                return;
            }
        }
        if (Constants.SYNCML_TAG_ADD.equals(str)) {
            this.bAdd = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.add);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.add);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.add);
                return;
            }
        }
        if (Constants.SYNCML_TAG_GET.equals(str)) {
            this.bGet = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.get);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.get);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.get);
                return;
            }
        }
        if (Constants.SYNCML_TAG_REPLACE.equals(str)) {
            this.bReplace = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.replace);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.replace);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.replace);
                return;
            }
        }
        if (Constants.SYNCML_TAG_EXEC.equals(str)) {
            this.bExec = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.exec);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.exec);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.exec);
                return;
            }
        }
        if (Constants.SYNCML_TAG_COPY.equals(str)) {
            this.bCopy = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.copy);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.copy);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.copy);
                return;
            }
        }
        if (Constants.SYNCML_TAG_DELETE.equals(str)) {
            this.bDelete = false;
            if (this.bAtomic) {
                this.atomic.getCommandList().add(this.delete);
                return;
            } else if (this.bSequence) {
                this.sequence.getCommandList().add(this.delete);
                return;
            } else {
                this.syncML.getSyncBody().getCommandList().add(this.delete);
                return;
            }
        }
        if (Constants.SYNCML_TAG_ITEM.equals(str)) {
            this.bItem = false;
            if (this.bAlert) {
                this.alert.getItemList().add(this.item);
                return;
            }
            if (this.bAdd) {
                this.add.getItemList().add(this.item);
                return;
            }
            if (this.bGet) {
                this.get.getItemList().add(this.item);
                return;
            }
            if (this.bReplace) {
                this.replace.getItemList().add(this.item);
                return;
            }
            if (this.bExec) {
                this.exec.getItemList().add(this.item);
                return;
            }
            if (this.bCopy) {
                this.copy.getItemList().add(this.item);
                return;
            }
            if (this.bDelete) {
                this.delete.getItemList().add(this.item);
                return;
            } else if (this.bStatus) {
                this.status.getItemList().add(this.item);
                return;
            } else {
                if (this.bResults) {
                    this.results.getItemList().add(this.item);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_MOREDATA.equals(str)) {
            this.item.setMoreData(true);
            return;
        }
        if (Constants.SYNCML_TAG_CORRELATOR.equals(str)) {
            this.bCorrelator = false;
            if (this.bAlert) {
                this.alert.setCorrelator(this.correlator);
                return;
            } else {
                if (this.bExec) {
                    this.exec.setCorrelator(this.correlator);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_STATUS.equals(str)) {
            this.bStatus = false;
            this.syncML.getSyncBody().getCommandList().add(this.status);
            return;
        }
        if (Constants.SYNCML_TAG_CMD.equals(str)) {
            this.bCmd = false;
            this.status.setCmd(this.cmd);
            return;
        }
        if (Constants.SYNCML_TAG_CHAL.equals(str)) {
            this.bChal = false;
            this.status.setChal(this.chal);
            return;
        }
        if (Constants.SYNCML_TAG_RESULTS.equals(str)) {
            this.bResults = false;
            this.syncML.getSyncBody().getCommandList().add(this.results);
            return;
        }
        if (Constants.SYNCML_TAG_MSGREF.equals(str)) {
            this.bMsgRef = false;
            if (this.bStatus) {
                this.status.setMsgRef(this.msgRef);
                return;
            } else {
                if (this.bResults) {
                    this.results.setMsgRef(this.msgRef);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_CMDREF.equals(str)) {
            this.bCmdRef = false;
            if (this.bStatus) {
                this.status.setCmdRef(this.cmdRef);
                return;
            } else {
                if (this.bResults) {
                    this.results.setCmdRef(this.cmdRef);
                    return;
                }
                return;
            }
        }
        if (Constants.SYNCML_TAG_TARGETREF.equals(str)) {
            this.bTargetRef = false;
            if (this.bStatus) {
                this.status.setTargetRef(this.targetRef);
                return;
            } else {
                if (this.bResults) {
                    this.results.setTargetRef(this.targetRef);
                    return;
                }
                return;
            }
        }
        if (!Constants.SYNCML_TAG_SOURCEREF.equals(str)) {
            if (Constants.SYNCML_TAG_FINAL.equals(str)) {
                this.syncML.getSyncBody().setFinalMsg(true);
                return;
            }
            return;
        }
        this.bSourceRef = false;
        if (this.bStatus) {
            this.status.setSourceRef(this.sourceRef);
        } else if (this.bResults) {
            this.results.setSourceRef(this.sourceRef);
        }
    }

    public SyncML idmGetSyncML() {
        return this.syncML;
    }

    public void startTag(String str) {
        if ("SyncML".equals(str)) {
            IDMDebug.I("SYNCML_TAG_SYNCML");
            return;
        }
        if (Constants.SYNCML_TAG_SYNCHDR.equals(str)) {
            this.syncML.setSyncHdr(new SyncHdr());
            this.bSyncHdr = true;
            return;
        }
        if (Constants.SYNCML_TAG_SYNCBODY.equals(str)) {
            this.syncML.setSyncBody(new SyncBody());
            return;
        }
        if ("VerDTD".equals(str)) {
            this.bVerDTD = true;
            return;
        }
        if (Constants.SYNCML_TAG_VERPROTO.equals(str)) {
            this.bVerProto = true;
            return;
        }
        if (Constants.SYNCML_TAG_SESSIONID.equals(str)) {
            this.bSessionID = true;
            return;
        }
        if (Constants.SYNCML_TAG_MSGID.equals(str)) {
            this.bMsgID = true;
            return;
        }
        if (Constants.SYNCML_TAG_RESPURI.equals(str)) {
            this.bRespURI = true;
            return;
        }
        if (Constants.SYNCML_TAG_TARGET.equals(str)) {
            this.bTarget = true;
            this.target = new Target();
            return;
        }
        if (Constants.SYNCML_TAG_SOURCE.equals(str)) {
            this.bSource = true;
            this.source = new Source();
            return;
        }
        if (Constants.SYNCML_TAG_LOCURI.equals(str)) {
            this.bLocURI = true;
            return;
        }
        if (Constants.SYNCML_TAG_LOCNAME.equals(str)) {
            this.bLocName = true;
            return;
        }
        if (Constants.SYNCML_TAG_CRED.equals(str)) {
            this.bCred = true;
            this.cred = new Cred();
            return;
        }
        if (Constants.SYNCML_TAG_META.equals(str)) {
            this.meta = new Meta();
            return;
        }
        if ("Format".equals(str)) {
            this.bFormat = true;
            return;
        }
        if ("Type".equals(str)) {
            this.bType = true;
            return;
        }
        if (Constants.SYNCML_TAG_NEXTNONCE.equals(str)) {
            this.bNextNonce = true;
            return;
        }
        if (Constants.SYNCML_TAG_MAXMSGSIZE.equals(str)) {
            this.bMaxMsgSize = true;
            return;
        }
        if (Constants.SYNCML_TAG_MAXOBJSIZE.equals(str)) {
            this.bMaxObjSize = true;
            return;
        }
        if (Constants.SYNCML_TAG_DATA.equals(str)) {
            this.bData = true;
            return;
        }
        if (Constants.SYNCML_TAG_CORRELATOR.equals(str)) {
            this.bCorrelator = true;
            return;
        }
        if (Constants.SYNCML_TAG_ATOMIC.equals(str)) {
            this.bAtomic = true;
            this.atomic = new Atomic();
            return;
        }
        if (Constants.SYNCML_TAG_SEQUENCE.equals(str)) {
            this.bSequence = true;
            this.sequence = new Sequence();
            return;
        }
        if (Constants.SYNCML_TAG_ALERT.equals(str)) {
            this.bAlert = true;
            this.alert = new Alert();
            return;
        }
        if (Constants.SYNCML_TAG_ADD.equals(str)) {
            this.bAdd = true;
            this.add = new Add();
            return;
        }
        if (Constants.SYNCML_TAG_GET.equals(str)) {
            this.bGet = true;
            this.get = new Get();
            return;
        }
        if (Constants.SYNCML_TAG_REPLACE.equals(str)) {
            this.bReplace = true;
            this.replace = new Replace();
            return;
        }
        if (Constants.SYNCML_TAG_EXEC.equals(str)) {
            this.bExec = true;
            this.exec = new Exec();
            return;
        }
        if (Constants.SYNCML_TAG_COPY.equals(str)) {
            this.bCopy = true;
            this.copy = new Copy();
            return;
        }
        if (Constants.SYNCML_TAG_DELETE.equals(str)) {
            this.bDelete = true;
            this.delete = new Delete();
            return;
        }
        if (Constants.SYNCML_TAG_CMDID.equals(str)) {
            this.bCmdID = true;
            return;
        }
        if (Constants.SYNCML_TAG_ITEM.equals(str)) {
            this.bItem = true;
            this.item = new Item();
            return;
        }
        if (Constants.SYNCML_TAG_STATUS.equals(str)) {
            this.bStatus = true;
            this.status = new Status();
            return;
        }
        if (Constants.SYNCML_TAG_CMD.equals(str)) {
            this.bCmd = true;
            return;
        }
        if (Constants.SYNCML_TAG_CHAL.equals(str)) {
            this.bChal = true;
            this.chal = new Chal();
            return;
        }
        if (Constants.SYNCML_TAG_RESULTS.equals(str)) {
            this.bResults = true;
            this.results = new Results();
            return;
        }
        if (Constants.SYNCML_TAG_MSGREF.equals(str)) {
            this.bMsgRef = true;
            return;
        }
        if (Constants.SYNCML_TAG_CMDREF.equals(str)) {
            this.bCmdRef = true;
        } else if (Constants.SYNCML_TAG_TARGETREF.equals(str)) {
            this.bTargetRef = true;
        } else if (Constants.SYNCML_TAG_SOURCEREF.equals(str)) {
            this.bSourceRef = true;
        }
    }

    public void text(XmlPullParser xmlPullParser) {
        if (this.bVerDTD) {
            this.syncML.getSyncHdr().setVerDTD(xmlPullParser.getText().trim());
            return;
        }
        if (this.bVerProto) {
            this.syncML.getSyncHdr().setVerProto(xmlPullParser.getText().trim());
            return;
        }
        if (this.bSessionID) {
            this.syncML.getSyncHdr().setSessionID(xmlPullParser.getText().trim());
            return;
        }
        if (this.bMsgID) {
            this.syncML.getSyncHdr().setMsgID(xmlPullParser.getText().trim());
            return;
        }
        if (this.bRespURI) {
            this.syncML.getSyncHdr().setRespURI(xmlPullParser.getText().trim());
            return;
        }
        if (this.bLocURI) {
            if (this.bTarget) {
                this.target.setLocURI(xmlPullParser.getText().trim());
                return;
            } else {
                if (this.bSource) {
                    this.source.setLocURI(xmlPullParser.getText().trim());
                    return;
                }
                return;
            }
        }
        if (this.bLocName) {
            if (this.bTarget) {
                this.target.setLocName(xmlPullParser.getText().trim());
                return;
            } else {
                if (this.bSource) {
                    this.source.setLocName(xmlPullParser.getText().trim());
                    return;
                }
                return;
            }
        }
        if (this.bFormat) {
            this.meta.setFormat(xmlPullParser.getText().trim());
            return;
        }
        if (this.bType) {
            this.meta.setType(xmlPullParser.getText().trim());
            return;
        }
        if (this.bNextNonce) {
            this.meta.setNextNonce(xmlPullParser.getText().trim());
            return;
        }
        if (this.bMaxMsgSize) {
            this.meta.setMaxMsgSize(xmlPullParser.getText().trim());
            return;
        }
        if (this.bMaxObjSize) {
            this.meta.setMaxObjSize(xmlPullParser.getText().trim());
            return;
        }
        if (this.bData) {
            this.data = xmlPullParser.getText().trim();
            return;
        }
        if (this.bCmdID) {
            this.cmdID = xmlPullParser.getText().trim();
            return;
        }
        if (this.bCorrelator) {
            this.correlator = xmlPullParser.getText().trim();
            return;
        }
        if (this.bCmd) {
            this.cmd = xmlPullParser.getText().trim();
            return;
        }
        if (this.bMsgRef) {
            this.msgRef = xmlPullParser.getText().trim();
            return;
        }
        if (this.bCmdRef) {
            this.cmdRef = xmlPullParser.getText().trim();
        } else if (this.bTargetRef) {
            this.targetRef = xmlPullParser.getText().trim();
        } else if (this.bSourceRef) {
            this.sourceRef = xmlPullParser.getText().trim();
        }
    }
}
