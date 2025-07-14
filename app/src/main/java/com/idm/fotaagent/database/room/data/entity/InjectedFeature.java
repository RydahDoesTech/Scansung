package com.idm.fotaagent.database.room.data.entity;

import java.io.Serializable;

/* loaded from: classes.dex */
public class InjectedFeature extends CategoryNameValue {
    public static final String TABLE_NAME = "injected_feature";

    public InjectedFeature(String str, String str2, Serializable serializable) {
        this(str, str2, CategoryNameValue.serialize(serializable), serializable.toString());
    }

    @Override // com.idm.fotaagent.database.room.data.entity.CategoryNameValue
    public String getTableName() {
        return TABLE_NAME;
    }

    public InjectedFeature(String str, String str2, byte[] bArr, String str3) {
        super(str, str2, bArr, str3);
    }
}
