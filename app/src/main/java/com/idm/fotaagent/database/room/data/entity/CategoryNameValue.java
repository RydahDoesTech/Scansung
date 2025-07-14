package com.idm.fotaagent.database.room.data.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CategoryNameValue {
    public static final String COLUMN_CATEGORY = "category";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_VALUE = "value";
    public static final String COLUMN_VALUE_STRING = "value_text";
    public long _id;
    private final String category;
    private final String name;
    private final byte[] value;
    public final String valueString;

    public CategoryNameValue(String str, String str2, byte[] bArr, String str3) {
        this.category = str;
        this.name = str2;
        this.value = bArr;
        this.valueString = str3;
    }

    public static byte[] serialize(Serializable serializable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String getCategory() {
        return this.category;
    }

    public <V extends Serializable> V getDeserializedValue() throws IOException {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(this.value));
            try {
                Object object = objectInputStream.readObject();
                Objects.requireNonNull(object, "readObject() should not be null");
                V v2 = (V) object;
                objectInputStream.close();
                return v2;
            } catch (Throwable th) {
                try {
                    objectInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException | NullPointerException e5) {
            e = e5;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return this.name;
    }

    public abstract String getTableName();

    public byte[] getValue() {
        return this.value;
    }
}
