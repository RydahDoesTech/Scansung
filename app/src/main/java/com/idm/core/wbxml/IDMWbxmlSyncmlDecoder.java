package com.idm.core.wbxml;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.core.syncml.Add;
import com.idm.core.syncml.Alert;
import com.idm.core.syncml.Atomic;
import com.idm.core.syncml.Chal;
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
import java.util.Arrays;

/* loaded from: classes.dex */
class IDMWbxmlSyncmlDecoder implements IDMWbxmlConstants {
    private Add add;
    private Alert alert;
    private Chal chal;
    private int charset;
    private Copy copy;
    private Cred cred;
    private Delete delete;
    private String element;
    private Exec exec;
    private Get get;
    private Meta meta;
    private String pcdata;
    private int publicId;
    private Replace replace;
    private Results results;
    private Source source;
    private Status status;
    private String stringTable;
    private Target target;
    private int version;
    private byte[] wbxbuff;
    private SyncML syncML = new SyncML();
    private int wbxindex = 0;
    private int codePage = 0;

    private int idmWbxmlCheckElement(int i5) {
        if (i5 == idmWbxmlReadElement()) {
            return 0;
        }
        IDMDebug.E("idmWbxmlCheckElement is WBXML_ERR_UNKNOWN_ELEMENT");
        return 2;
    }

    private int idmWbxmlCheckZeroBitTag() {
        int i5;
        byte[] bArr = this.wbxbuff;
        int i6 = this.wbxindex - 1;
        this.wbxindex = i6;
        byte b2 = bArr[i6];
        int i7 = b2 & 63;
        if (i7 < 5 || i7 > 60 || (b2 & 64) != 0) {
            i5 = 0;
        } else {
            IDMDebug.I("WBXML_ERR_ZEROBIT_TAG");
            i5 = 8;
        }
        this.wbxindex++;
        return i5;
    }

    private int idmWbxmlDecodeAdd() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(5);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.add = new Add();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                idmWbxmlReadElement();
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.add.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 20) {
                Add add = this.add;
                add.setItemList(idmWbxmlDecodeItemlist(add.getItemList()));
            } else if (iIdmWbxmlReadElement != 26) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.add.setMeta(this.meta);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeAlert() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(6);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.alert = new Alert();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.alert.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 15) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.alert.setData(this.element);
            } else if (iIdmWbxmlReadElement != 20) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                Alert alert = this.alert;
                alert.setItemList(idmWbxmlDecodeItemlist(alert.getItemList()));
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private Atomic idmWbxmlDecodeAtomic() {
        int iIdmWbxmlCheckZeroBitTag;
        if (idmWbxmlCheckElement(8) != 0 || (iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag()) == 8) {
            return null;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return null;
        }
        Atomic atomic = new Atomic();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return atomic;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 8) {
                Atomic atomicIdmWbxmlDecodeAtomic = idmWbxmlDecodeAtomic();
                if (atomicIdmWbxmlDecodeAtomic != null) {
                    atomic.getCommandList().add(atomicIdmWbxmlDecodeAtomic);
                }
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                atomic.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 13) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeCopy();
                atomic.getCommandList().add(this.copy);
            } else if (iIdmWbxmlReadElement == 19) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeGet();
                atomic.getCommandList().add(this.get);
            } else if (iIdmWbxmlReadElement == 26) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                atomic.setMeta(this.meta);
            } else if (iIdmWbxmlReadElement == 32) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeReplace();
                atomic.getCommandList().add(this.replace);
            } else if (iIdmWbxmlReadElement == 36) {
                Sequence sequenceIdmWbxmlDecodeSequence = idmWbxmlDecodeSequence();
                if (sequenceIdmWbxmlDecodeSequence != null) {
                    atomic.getCommandList().add(sequenceIdmWbxmlDecodeSequence);
                }
            } else if (iIdmWbxmlReadElement == 5) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeAdd();
                atomic.getCommandList().add(this.add);
            } else if (iIdmWbxmlReadElement == 6) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeAlert();
                atomic.getCommandList().add(this.alert);
            } else if (iIdmWbxmlReadElement == 16) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeDelete();
                atomic.getCommandList().add(this.delete);
            } else if (iIdmWbxmlReadElement != 17) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeExec();
                atomic.getCommandList().add(this.exec);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return null;
    }

    private boolean idmWbxmlDecodeBlankElement(int i5) {
        boolean z4;
        try {
            z4 = (idmWbxmlGetCurrentElement() & 64) != 0;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
        if (idmWbxmlCheckElement(i5) != 0) {
            return false;
        }
        if (z4) {
            if (idmWbxmlCheckElement(1) != 0) {
                return false;
            }
        }
        return true;
    }

    private int idmWbxmlDecodeChal() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(9);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.chal = new Chal();
        int iIdmWbxmlDecodeMeta = idmWbxmlDecodeMeta();
        if (iIdmWbxmlDecodeMeta != 0) {
            return iIdmWbxmlDecodeMeta;
        }
        this.chal.setMeta(this.meta);
        return idmWbxmlCheckElement(1);
    }

    private String idmWbxmlDecodeContent() {
        String strIdmWbxmlDecodeExtension = null;
        try {
            int iIdmWbxmlReadBufferByte = idmWbxmlReadBufferByte();
            if (iIdmWbxmlReadBufferByte == 3) {
                strIdmWbxmlDecodeExtension = idmWbxmlDecodeStringInline();
            } else if (iIdmWbxmlReadBufferByte == 131) {
                strIdmWbxmlDecodeExtension = idmWbxmlDecodeStringTableRef();
            } else if (iIdmWbxmlReadBufferByte == 195) {
                strIdmWbxmlDecodeExtension = idmWbxmlDecodeExtension(iIdmWbxmlReadBufferByte);
            } else {
                this.wbxindex--;
                if (idmWbxmlSkipElement() != 0) {
                    return null;
                }
            }
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
        return strIdmWbxmlDecodeExtension;
    }

    private int idmWbxmlDecodeCopy() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(13);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.copy = new Copy();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                idmWbxmlReadElement();
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.copy.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 20) {
                Copy copy = this.copy;
                copy.setItemList(idmWbxmlDecodeItemlist(copy.getItemList()));
            } else if (iIdmWbxmlReadElement != 26) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.copy.setMeta(this.meta);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeCred() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(14);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        this.cred = new Cred();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return iIdmWbxmlCheckElement;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 15) {
                iIdmWbxmlCheckElement = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.cred.setData(this.element);
            } else if (iIdmWbxmlReadElement != 26) {
                iIdmWbxmlCheckElement = 2;
            } else {
                iIdmWbxmlCheckElement = idmWbxmlDecodeMeta();
                this.cred.setMeta(this.meta);
            }
        } while (iIdmWbxmlCheckElement == 0);
        return iIdmWbxmlCheckElement;
    }

    private int idmWbxmlDecodeDelete() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(16);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.delete = new Delete();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.delete.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 20) {
                Delete delete = this.delete;
                delete.setItemList(idmWbxmlDecodeItemlist(delete.getItemList()));
            } else if (iIdmWbxmlReadElement != 26) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.delete.setMeta(this.meta);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeElement(int i5) {
        this.element = "";
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(i5);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlSkipLiteralElement = idmWbxmlSkipLiteralElement();
        if (iIdmWbxmlSkipLiteralElement != 0) {
            return iIdmWbxmlSkipLiteralElement;
        }
        while (true) {
            String strIdmWbxmlDecodeContent = idmWbxmlDecodeContent();
            if (strIdmWbxmlDecodeContent != null) {
                this.element = "".concat(strIdmWbxmlDecodeContent);
            }
            try {
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (idmWbxmlReadBufferByte() != 131) {
                this.wbxindex--;
                break;
            }
            this.element = "".concat(idmWbxmlDecodeStringTableRef());
            if (idmWbxmlReadBufferByte() == 1) {
                this.wbxindex--;
                break;
            }
            this.wbxindex--;
        }
        return idmWbxmlCheckElement(1);
    }

    private int idmWbxmlDecodeExec() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(17);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.exec = new Exec();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                idmWbxmlReadElement();
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.exec.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 20) {
                Exec exec = this.exec;
                exec.setItemList(idmWbxmlDecodeItemlist(exec.getItemList()));
            } else if (iIdmWbxmlReadElement == 26) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.exec.setMeta(this.meta);
            } else if (iIdmWbxmlReadElement != 60) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.exec.setCorrelator(this.element);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private String idmWbxmlDecodeExtension(int i5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i5 != 195) {
            return null;
        }
        try {
            int iIdmWbxmlReadBufferMultiByteUInt32 = idmWbxmlReadBufferMultiByteUInt32();
            for (int i6 = 0; i6 < iIdmWbxmlReadBufferMultiByteUInt32; i6++) {
                byteArrayOutputStream.write(idmWbxmlReadBufferByte());
            }
            return new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset());
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    private int idmWbxmlDecodeGet() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(19);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.get = new Get();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.get.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 20) {
                Get get = this.get;
                get.setItemList(idmWbxmlDecodeItemlist(get.getItemList()));
            } else if (iIdmWbxmlReadElement != 26) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.get.setMeta(this.meta);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeItem(Item item) {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(20);
        if (iIdmWbxmlCheckElement != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return iIdmWbxmlCheckZeroBitTag;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 15) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodePcdata(iIdmWbxmlReadElement);
                item.setData(this.pcdata);
            } else if (iIdmWbxmlReadElement == 26) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                item.setMeta(this.meta);
            } else if (iIdmWbxmlReadElement == 39) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeSource();
                item.setSource(this.source);
            } else if (iIdmWbxmlReadElement == 46) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeTarget();
                item.setTarget(this.target);
            } else if (iIdmWbxmlReadElement != 52) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                item.setMoreData(idmWbxmlDecodeBlankElement(iIdmWbxmlReadElement));
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private ArrayList<Item> idmWbxmlDecodeItemlist(ArrayList<Item> arrayList) {
        int iIdmWbxmlGetCurrentElement = 0;
        while (true) {
            try {
                iIdmWbxmlGetCurrentElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlGetCurrentElement != 20) {
                return arrayList;
            }
            Item item = new Item();
            if (idmWbxmlDecodeItem(item) != 0) {
                return null;
            }
            arrayList.add(item);
        }
    }

    private int idmWbxmlDecodeMeta() {
        int iIdmWbxmlReadElement;
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(26);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            return iIdmWbxmlCheckZeroBitTag;
        }
        try {
            iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            iIdmWbxmlReadElement = -1;
        }
        if (iIdmWbxmlReadElement == 1) {
            idmWbxmlReadElement();
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlCheckElement2 = idmWbxmlCheckElement(0);
        if (iIdmWbxmlCheckElement2 != 0) {
            return iIdmWbxmlCheckElement2;
        }
        int iIdmWbxmlCheckElement3 = idmWbxmlCheckElement(1);
        if (iIdmWbxmlCheckElement3 != 0) {
            return iIdmWbxmlCheckElement3;
        }
        this.codePage = 1;
        this.meta = new Meta();
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e6) {
                IDMDebug.printStackTrace(e6);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return iIdmWbxmlCheckElement3;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 7) {
                iIdmWbxmlCheckElement3 = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.meta.setFormat(this.element);
            } else if (iIdmWbxmlReadElement == 12) {
                iIdmWbxmlCheckElement3 = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.meta.setMaxMsgSize(this.element);
            } else if (iIdmWbxmlReadElement == 16) {
                iIdmWbxmlCheckElement3 = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.meta.setNextNonce(this.element);
            } else if (iIdmWbxmlReadElement == 21) {
                iIdmWbxmlCheckElement3 = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.meta.setMaxObjSize(this.element);
            } else if (iIdmWbxmlReadElement == 18) {
                iIdmWbxmlCheckElement3 = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.meta.setSize(this.element);
            } else if (iIdmWbxmlReadElement != 19) {
                iIdmWbxmlCheckElement3 = 2;
            } else {
                iIdmWbxmlCheckElement3 = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.meta.setType(this.element);
            }
        } while (iIdmWbxmlCheckElement3 == 0);
        return iIdmWbxmlCheckElement3;
    }

    private int idmWbxmlDecodePcdata(int i5) {
        int iIdmWbxmlCheckElement;
        this.pcdata = "";
        int iIdmWbxmlCheckElement2 = idmWbxmlCheckElement(i5);
        if (iIdmWbxmlCheckElement2 != 0) {
            return iIdmWbxmlCheckElement2;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        try {
            int iIdmWbxmlReadBufferByte = idmWbxmlReadBufferByte();
            if (iIdmWbxmlReadBufferByte == 3) {
                this.pcdata = idmWbxmlDecodeStringInline();
            } else if (iIdmWbxmlReadBufferByte == 131) {
                this.pcdata = idmWbxmlDecodeStringTableRef();
            } else if (iIdmWbxmlReadBufferByte == 195) {
                this.pcdata = idmWbxmlDecodeExtension(iIdmWbxmlReadBufferByte);
            } else if (iIdmWbxmlReadBufferByte == 0) {
                this.codePage = idmWbxmlReadElement();
                int iIdmWbxmlGetCurrentElement = idmWbxmlGetCurrentElement();
                do {
                    if (iIdmWbxmlGetCurrentElement == 0) {
                        idmWbxmlReadElement();
                        idmWbxmlReadElement();
                    }
                    iIdmWbxmlGetCurrentElement = idmWbxmlGetCurrentElement();
                } while (iIdmWbxmlGetCurrentElement != 1);
            } else {
                this.wbxindex--;
                int iIdmWbxmlSkipElement = idmWbxmlSkipElement();
                if (iIdmWbxmlSkipElement != 0) {
                    return iIdmWbxmlSkipElement;
                }
                this.pcdata = null;
            }
            iIdmWbxmlCheckElement = idmWbxmlCheckElement(1);
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        return 0;
    }

    private int idmWbxmlDecodeReplace() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(32);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.replace = new Replace();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.replace.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 20) {
                Replace replace = this.replace;
                replace.setItemList(idmWbxmlDecodeItemlist(replace.getItemList()));
            } else if (iIdmWbxmlReadElement != 26) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.replace.setMeta(this.meta);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeResults() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(34);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.results = new Results();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 20) {
                Results results = this.results;
                results.setItemList(idmWbxmlDecodeItemlist(results.getItemList()));
            } else if (iIdmWbxmlReadElement == 26) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                this.results.setMeta(this.meta);
            } else if (iIdmWbxmlReadElement == 28) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.results.setMsgRef(this.element);
            } else if (iIdmWbxmlReadElement == 40) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.results.setSourceRef(this.element);
            } else if (iIdmWbxmlReadElement == 47) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.results.setTargetRef(this.element);
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.results.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement != 12) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                this.results.setCmdRef(this.element);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private Sequence idmWbxmlDecodeSequence() {
        int iIdmWbxmlCheckZeroBitTag;
        if (idmWbxmlCheckElement(36) != 0 || (iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag()) == 8) {
            return null;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return null;
        }
        Sequence sequence = new Sequence();
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return sequence;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 8) {
                Atomic atomicIdmWbxmlDecodeAtomic = idmWbxmlDecodeAtomic();
                if (atomicIdmWbxmlDecodeAtomic != null) {
                    sequence.getCommandList().add(atomicIdmWbxmlDecodeAtomic);
                }
            } else if (iIdmWbxmlReadElement == 11) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                sequence.setCmdID(this.element);
            } else if (iIdmWbxmlReadElement == 13) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeCopy();
                sequence.getCommandList().add(this.copy);
            } else if (iIdmWbxmlReadElement == 19) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeGet();
                sequence.getCommandList().add(this.get);
            } else if (iIdmWbxmlReadElement == 26) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                sequence.setMeta(this.meta);
            } else if (iIdmWbxmlReadElement == 32) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeReplace();
                sequence.getCommandList().add(this.replace);
            } else if (iIdmWbxmlReadElement == 36) {
                Sequence sequenceIdmWbxmlDecodeSequence = idmWbxmlDecodeSequence();
                if (sequenceIdmWbxmlDecodeSequence != null) {
                    sequence.getCommandList().add(sequenceIdmWbxmlDecodeSequence);
                }
            } else if (iIdmWbxmlReadElement == 5) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeAdd();
                sequence.getCommandList().add(this.add);
            } else if (iIdmWbxmlReadElement == 6) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeAlert();
                sequence.getCommandList().add(this.alert);
            } else if (iIdmWbxmlReadElement == 16) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeDelete();
                sequence.getCommandList().add(this.delete);
            } else if (iIdmWbxmlReadElement != 17) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeExec();
                sequence.getCommandList().add(this.exec);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return null;
    }

    private int idmWbxmlDecodeSource() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(39);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlDecodeElement = idmWbxmlDecodeElement(23);
        if (iIdmWbxmlDecodeElement != 0) {
            return iIdmWbxmlDecodeElement;
        }
        try {
            if (idmWbxmlGetCurrentElement() == 22) {
                idmWbxmlSkipElement();
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
        int iIdmWbxmlCheckElement2 = idmWbxmlCheckElement(1);
        if (iIdmWbxmlCheckElement2 != 0) {
            return iIdmWbxmlCheckElement2;
        }
        Source source = new Source();
        this.source = source;
        source.setLocURI(this.element);
        return iIdmWbxmlCheckElement2;
    }

    private void idmWbxmlDecodeStartDocument() {
        try {
            this.version = idmWbxmlReadBufferByte();
            IDMDebug.H("version : " + this.version);
            int iIdmWbxmlReadBufferMultiByteUInt32 = idmWbxmlReadBufferMultiByteUInt32();
            this.publicId = iIdmWbxmlReadBufferMultiByteUInt32;
            if (iIdmWbxmlReadBufferMultiByteUInt32 == 0) {
                idmWbxmlReadBufferMultiByteUInt32();
            }
            this.charset = idmWbxmlReadBufferMultiByteUInt32();
            IDMDebug.H("charset : " + this.charset);
            this.stringTable = idmWbxmlDecodeStringTable();
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    private int idmWbxmlDecodeStatus() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(41);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        this.status = new Status();
        int iIdmWbxmlReadElement = -1;
        while (true) {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 41) {
                idmWbxmlReadElement();
            } else {
                if (iIdmWbxmlReadElement == 0) {
                    idmWbxmlReadElement();
                    iIdmWbxmlReadElement = idmWbxmlReadElement();
                    this.codePage = iIdmWbxmlReadElement;
                } else if (iIdmWbxmlReadElement == 15) {
                    iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                    this.status.setData(this.element);
                } else if (iIdmWbxmlReadElement == 20) {
                    Status status = this.status;
                    status.setItemList(idmWbxmlDecodeItemlist(status.getItemList()));
                } else if (iIdmWbxmlReadElement == 28) {
                    iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                    this.status.setMsgRef(this.element);
                } else if (iIdmWbxmlReadElement == 40) {
                    iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                    this.status.setSourceRef(this.element);
                } else if (iIdmWbxmlReadElement != 47) {
                    switch (iIdmWbxmlReadElement) {
                        case 9:
                            iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeChal();
                            this.status.setChal(this.chal);
                            break;
                        case 10:
                            iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                            this.status.setCmd(this.element);
                            break;
                        case 11:
                            iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                            this.status.setCmdID(this.element);
                            break;
                        case 12:
                            iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                            this.status.setCmdRef(this.element);
                            break;
                        default:
                            IDMDebug.E("WBXML_ERR_UNKNOWN_ELEMENT !!!!!!!");
                            iIdmWbxmlCheckZeroBitTag = 2;
                            break;
                    }
                } else {
                    iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                    this.status.setTargetRef(this.element);
                }
                if (iIdmWbxmlCheckZeroBitTag != 0) {
                    return iIdmWbxmlCheckZeroBitTag;
                }
            }
        }
    }

    private String idmWbxmlDecodeStringInline() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int iIdmWbxmlReadBufferByte = idmWbxmlReadBufferByte();
            if (iIdmWbxmlReadBufferByte == 0) {
                String str = new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset());
                byteArrayOutputStream.close();
                return str;
            }
            if (iIdmWbxmlReadBufferByte == -1) {
                throw new IOException("Unexpected EOF decodeStringInline");
            }
            byteArrayOutputStream.write(iIdmWbxmlReadBufferByte);
        }
    }

    private String idmWbxmlDecodeStringTable() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iIdmWbxmlReadBufferMultiByteUInt32 = idmWbxmlReadBufferMultiByteUInt32();
        for (int i5 = 0; i5 < iIdmWbxmlReadBufferMultiByteUInt32; i5++) {
            byteArrayOutputStream.write(idmWbxmlReadBufferByte());
        }
        return new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset());
    }

    private String idmWbxmlDecodeStringTableRef() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            for (int iIdmWbxmlReadBufferMultiByteUInt32 = idmWbxmlReadBufferMultiByteUInt32(); this.stringTable.charAt(iIdmWbxmlReadBufferMultiByteUInt32) != 0; iIdmWbxmlReadBufferMultiByteUInt32++) {
                byteArrayOutputStream.write(this.stringTable.charAt(iIdmWbxmlReadBufferMultiByteUInt32));
            }
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
        return new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset());
    }

    private int idmWbxmlDecodeSyncBody(SyncBody syncBody) {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(43);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not  WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
            } else if (iIdmWbxmlReadElement == 8) {
                Atomic atomicIdmWbxmlDecodeAtomic = idmWbxmlDecodeAtomic();
                if (atomicIdmWbxmlDecodeAtomic != null) {
                    syncBody.getCommandList().add(atomicIdmWbxmlDecodeAtomic);
                }
            } else if (iIdmWbxmlReadElement == 13) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeCopy();
                syncBody.getCommandList().add(this.copy);
            } else if (iIdmWbxmlReadElement == 32) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeReplace();
                syncBody.getCommandList().add(this.replace);
            } else if (iIdmWbxmlReadElement == 34) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeResults();
                syncBody.getCommandList().add(this.results);
            } else if (iIdmWbxmlReadElement == 36) {
                Sequence sequenceIdmWbxmlDecodeSequence = idmWbxmlDecodeSequence();
                if (sequenceIdmWbxmlDecodeSequence != null) {
                    syncBody.getCommandList().add(sequenceIdmWbxmlDecodeSequence);
                }
            } else if (iIdmWbxmlReadElement == 41) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeStatus();
                syncBody.getCommandList().add(this.status);
            } else if (iIdmWbxmlReadElement == 5) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeAdd();
                syncBody.getCommandList().add(this.add);
            } else if (iIdmWbxmlReadElement != 6) {
                switch (iIdmWbxmlReadElement) {
                    case 16:
                        iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeDelete();
                        syncBody.getCommandList().add(this.delete);
                        break;
                    case 17:
                        iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeExec();
                        syncBody.getCommandList().add(this.exec);
                        break;
                    case 18:
                        syncBody.setFinalMsg(idmWbxmlDecodeBlankElement(iIdmWbxmlReadElement));
                        break;
                    case 19:
                        iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeGet();
                        syncBody.getCommandList().add(this.get);
                        break;
                    default:
                        iIdmWbxmlCheckZeroBitTag = 2;
                        break;
                }
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeAlert();
                syncBody.getCommandList().add(this.alert);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeSyncHeader(SyncHdr syncHdr) {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(44);
        if (iIdmWbxmlCheckElement != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                idmWbxmlReadElement();
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
                this.codePage = iIdmWbxmlReadElement;
                IDMDebug.H("codePage : " + this.codePage);
            } else if (iIdmWbxmlReadElement == 14) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeCred();
                syncHdr.setCred(this.cred);
            } else if (iIdmWbxmlReadElement == 33) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                syncHdr.setRespURI(this.element);
            } else if (iIdmWbxmlReadElement == 37) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                syncHdr.setSessionID(this.element);
            } else if (iIdmWbxmlReadElement == 39) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeSource();
                syncHdr.setSource(this.source);
            } else if (iIdmWbxmlReadElement == 46) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeTarget();
                syncHdr.setTarget(this.target);
            } else if (iIdmWbxmlReadElement == 26) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeMeta();
                syncHdr.setMeta(this.meta);
            } else if (iIdmWbxmlReadElement == 27) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                syncHdr.setMsgID(this.element);
            } else if (iIdmWbxmlReadElement == 49) {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                syncHdr.setVerDTD(this.element);
            } else if (iIdmWbxmlReadElement != 50) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeElement(iIdmWbxmlReadElement);
                syncHdr.setVerProto(this.element);
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        IDMDebug.E("not  WBXML_ERR_OK");
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeSyncml() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(45);
        if (iIdmWbxmlCheckElement != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlReadElement = -1;
        do {
            try {
                iIdmWbxmlReadElement = idmWbxmlGetCurrentElement();
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
            if (iIdmWbxmlReadElement == 1) {
                return 0;
            }
            if (iIdmWbxmlReadElement == 0) {
                iIdmWbxmlReadElement = idmWbxmlReadElement();
            } else if (iIdmWbxmlReadElement == 43) {
                this.syncML.setSyncBody(new SyncBody());
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeSyncBody(this.syncML.getSyncBody());
            } else if (iIdmWbxmlReadElement != 44) {
                iIdmWbxmlCheckZeroBitTag = 2;
            } else {
                this.syncML.setSyncHdr(new SyncHdr());
                iIdmWbxmlCheckZeroBitTag = idmWbxmlDecodeSyncHeader(this.syncML.getSyncHdr());
            }
        } while (iIdmWbxmlCheckZeroBitTag == 0);
        return iIdmWbxmlCheckZeroBitTag;
    }

    private int idmWbxmlDecodeTarget() {
        int iIdmWbxmlCheckElement = idmWbxmlCheckElement(46);
        if (iIdmWbxmlCheckElement != 0) {
            return iIdmWbxmlCheckElement;
        }
        int iIdmWbxmlCheckZeroBitTag = idmWbxmlCheckZeroBitTag();
        if (iIdmWbxmlCheckZeroBitTag == 8) {
            return 0;
        }
        if (iIdmWbxmlCheckZeroBitTag != 0) {
            IDMDebug.E("not WBXML_ERR_OK");
            return iIdmWbxmlCheckZeroBitTag;
        }
        int iIdmWbxmlDecodeElement = idmWbxmlDecodeElement(23);
        if (iIdmWbxmlDecodeElement != 0) {
            return iIdmWbxmlDecodeElement;
        }
        try {
            if (idmWbxmlGetCurrentElement() == 22) {
                idmWbxmlSkipElement();
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
        int iIdmWbxmlCheckElement2 = idmWbxmlCheckElement(1);
        if (iIdmWbxmlCheckElement2 != 0) {
            return iIdmWbxmlCheckElement2;
        }
        Target target = new Target();
        this.target = target;
        target.setLocURI(this.element);
        return iIdmWbxmlCheckElement2;
    }

    private int idmWbxmlGetCurrentElement() {
        return this.wbxbuff[this.wbxindex] & 63;
    }

    private int idmWbxmlReadBufferByte() {
        byte[] bArr = this.wbxbuff;
        int i5 = this.wbxindex;
        this.wbxindex = i5 + 1;
        return bArr[i5] & 255;
    }

    private int idmWbxmlReadBufferMultiByteUInt32() {
        int iIdmWbxmlReadBufferByte;
        int i5 = 0;
        for (int i6 = 0; i6 < 5 && (iIdmWbxmlReadBufferByte = idmWbxmlReadBufferByte()) >= 0; i6++) {
            i5 = (i5 << 7) | (iIdmWbxmlReadBufferByte & 127);
            if ((iIdmWbxmlReadBufferByte & 128) == 0) {
                return i5;
            }
        }
        return 0;
    }

    private int idmWbxmlReadElement() {
        try {
            return idmWbxmlReadBufferByte() & 63;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return -1;
        }
    }

    private int idmWbxmlSkipElement() {
        int i5 = 0;
        while (true) {
            try {
                int iIdmWbxmlGetCurrentElement = idmWbxmlGetCurrentElement();
                if (iIdmWbxmlGetCurrentElement == 0) {
                    idmWbxmlReadBufferByte();
                    idmWbxmlReadBufferByte();
                } else if (iIdmWbxmlGetCurrentElement == 1) {
                    idmWbxmlReadBufferByte();
                    i5--;
                    if (i5 == 0) {
                        break;
                    }
                } else if (iIdmWbxmlGetCurrentElement == 3 || iIdmWbxmlGetCurrentElement == 131 || iIdmWbxmlGetCurrentElement == 195) {
                    idmWbxmlDecodeContent();
                } else {
                    idmWbxmlReadBufferByte();
                    i5++;
                }
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
            }
        }
        while (idmWbxmlGetCurrentElement() == 0) {
            idmWbxmlReadBufferByte();
            idmWbxmlReadBufferByte();
        }
        return 0;
    }

    private int idmWbxmlSkipLiteralElement() {
        try {
            if (idmWbxmlGetCurrentElement() != 4) {
                return 0;
            }
            do {
            } while (idmWbxmlReadBufferByte() != 1);
            return 0;
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return 0;
        }
    }

    public SyncML idmWbxmlDecode(byte[] bArr) {
        int iIdmWbxmlGetCurrentElement;
        IDMDebug.I("decode");
        if (bArr == null) {
            IDMDebug.E("buf is null");
            return null;
        }
        this.wbxbuff = Arrays.copyOf(bArr, bArr.length);
        idmWbxmlDecodeStartDocument();
        try {
            iIdmWbxmlGetCurrentElement = idmWbxmlGetCurrentElement();
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            iIdmWbxmlGetCurrentElement = -1;
        }
        if (iIdmWbxmlGetCurrentElement != 45) {
            IDMDebug.E("not WBXML_TAG_SYNCML");
            return null;
        }
        int iIdmWbxmlDecodeSyncml = idmWbxmlDecodeSyncml();
        if (iIdmWbxmlDecodeSyncml == 0) {
            return this.syncML;
        }
        IDMDebug.E("result : " + iIdmWbxmlDecodeSyncml);
        return null;
    }
}
