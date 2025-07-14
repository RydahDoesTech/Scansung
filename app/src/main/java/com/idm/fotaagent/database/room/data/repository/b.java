package com.idm.fotaagent.database.room.data.repository;

import a3.InterfaceC0107b;
import com.idm.fotaagent.database.room.data.entity.CategoryNameValue;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f6249d;

    public /* synthetic */ b(Serializable serializable) {
        this.f6249d = serializable;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        return CategoryNameValueRepository.lambda$getLiveDataValueOf$0(this.f6249d, (CategoryNameValue) obj);
    }
}
