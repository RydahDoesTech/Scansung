package com.samsung.android.knox.ex.knoxAI;

import android.os.SharedMemory;
import android.util.Half;
import java.io.Closeable;
import java.io.FileDescriptor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DataBuffer {
    public DataBuffer() {
        throw new RuntimeException("Stub!");
    }

    public static Half readFloat16FromBytes(byte[] bArr, int i5) {
        throw new RuntimeException("Stub!");
    }

    public static float readFloatFromBytes(byte[] bArr, int i5) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] readFloatToBytes(float[] fArr) {
        throw new RuntimeException("Stub!");
    }

    public static JSONObject readJSONObjectFromBytes(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public static long readLongFromBytes(byte[] bArr, int i5) {
        throw new RuntimeException("Stub!");
    }

    public void closeQuietly(Closeable closeable) {
        throw new RuntimeException("Stub!");
    }

    public byte getDataFormat() {
        throw new RuntimeException("Stub!");
    }

    public float[] getDataOriginal() {
        throw new RuntimeException("Stub!");
    }

    public SharedMemory getDataShared() {
        throw new RuntimeException("Stub!");
    }

    public byte getDataSource() {
        throw new RuntimeException("Stub!");
    }

    public byte getDataType() {
        throw new RuntimeException("Stub!");
    }

    public FileDescriptor getFileDesc() {
        throw new RuntimeException("Stub!");
    }

    public int[] getShape() {
        throw new RuntimeException("Stub!");
    }

    public void setDataFormat(byte b2) {
        throw new RuntimeException("Stub!");
    }

    public void setDataOriginal(float[] fArr) {
        throw new RuntimeException("Stub!");
    }

    public void setDataShared(SharedMemory sharedMemory) {
        throw new RuntimeException("Stub!");
    }

    public void setDataSource(byte b2) {
        throw new RuntimeException("Stub!");
    }

    public void setDataType(byte b2) {
        throw new RuntimeException("Stub!");
    }

    public void setFileDesc(FileDescriptor fileDescriptor) {
        throw new RuntimeException("Stub!");
    }

    public void setShape(int[] iArr) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
