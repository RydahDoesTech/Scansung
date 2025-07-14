package com.samsung.android.knox.ex.knoxAI;

import com.samsung.android.knox.ex.knoxAI.KnoxAiManager;

/* loaded from: classes.dex */
public class KnoxAiSession {

    public enum CompUnit {
        CPU,
        DSP,
        GPU,
        NPU;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public enum DataFormat {
        NCHW,
        NHWC;

        public byte getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public enum DataType {
        BYTE,
        FLOAT16,
        FLOAT32,
        INT64,
        SEQUENCE_MAP,
        STRING;

        public byte getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public enum ExecType {
        BFLOAT16,
        FLOAT16,
        FLOAT32,
        QASYMM16,
        QASYMM8;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public enum Mode {
        DEBUG,
        RELEASE;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public enum ModelInputType {
        BUFFER,
        FD,
        FILEPATH;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public enum ModelType {
        CAFFE,
        EDEN,
        HVXNN,
        OFI,
        ONNX,
        SNAPLITE,
        SNF,
        SNPE,
        TENSORFLOW,
        TENSORFLOWLITE,
        TVM;

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public KnoxAiSession() {
        throw new RuntimeException("Stub!");
    }

    public KnoxAiManager.ErrorCodes close() {
        throw new RuntimeException("Stub!");
    }

    public KnoxAiManager.ErrorCodes execute(DataBuffer[] dataBufferArr, DataBuffer[] dataBufferArr2) {
        throw new RuntimeException("Stub!");
    }

    public KnoxAiManager.ErrorCodes getModelInputShape(int i5, int[] iArr) {
        throw new RuntimeException("Stub!");
    }

    public KnoxAiManager.ErrorCodes open(KfaOptions kfaOptions) {
        throw new RuntimeException("Stub!");
    }
}
