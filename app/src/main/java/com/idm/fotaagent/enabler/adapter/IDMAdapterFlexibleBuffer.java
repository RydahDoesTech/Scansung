package com.idm.fotaagent.enabler.adapter;

import com.samsung.android.fotaagent.common.log.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public class IDMAdapterFlexibleBuffer {
    private byte[] RealwriteBuffer;
    private byte[] flexbleBuffer;
    private int nAppendBufferSize;
    private int nFlexbleBufferLen;
    private int nRealWriteBufferLen;
    private int nReceiveBufferSize;

    public IDMAdapterFlexibleBuffer(int i5, int i6) {
        this.nAppendBufferSize = i5;
        this.nReceiveBufferSize = i6;
    }

    private void idmAddFlexibleBufferLength(int i5) {
        this.nFlexbleBufferLen += i5;
    }

    private void idmAddRealWriteBuffer() {
        try {
            int i5 = this.nFlexbleBufferLen;
            this.RealwriteBuffer = new byte[i5];
            idmSetRealWriteBufferLength(i5);
            System.arraycopy(this.flexbleBuffer, 0, this.RealwriteBuffer, 0, this.nFlexbleBufferLen);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    public void idmAddFlexibleBuffer(byte[] bArr, int i5) {
        try {
            if (this.flexbleBuffer == null) {
                this.flexbleBuffer = new byte[this.nAppendBufferSize + this.nReceiveBufferSize];
            }
            System.arraycopy(bArr, 0, this.flexbleBuffer, this.nFlexbleBufferLen, i5);
            idmAddFlexibleBufferLength(i5);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    public void idmAllClearBufferInfo() {
        this.flexbleBuffer = null;
        this.nFlexbleBufferLen = 0;
        this.RealwriteBuffer = null;
        this.nRealWriteBufferLen = 0;
    }

    public void idmClearFlexibleBuffer() {
        this.flexbleBuffer = null;
        this.nFlexbleBufferLen = 0;
    }

    public int idmGetAppendSavedBufferSize() {
        return this.nAppendBufferSize;
    }

    public byte[] idmGetFlexibleBuffer() {
        byte[] bArr = this.flexbleBuffer;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public int idmGetFlexibleBufferLength() {
        return this.nFlexbleBufferLen;
    }

    public byte[] idmGetRealWriteBuffer() {
        idmAddRealWriteBuffer();
        byte[] bArr = this.RealwriteBuffer;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public int idmGetRealWriteBufferLength() {
        int i5 = this.nRealWriteBufferLen;
        this.nRealWriteBufferLen = 0;
        return i5;
    }

    public void idmSetRealWriteBufferLength(int i5) {
        this.nRealWriteBufferLen += i5;
    }
}
