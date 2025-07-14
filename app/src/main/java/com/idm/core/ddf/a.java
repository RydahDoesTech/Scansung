package com.idm.core.ddf;

import com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadDefaultValues;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6215b;

    public /* synthetic */ a(String str, int i5) {
        this.f6214a = i5;
        this.f6215b = str;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i5 = this.f6214a;
        String str = this.f6215b;
        switch (i5) {
            case 0:
                return DDFTagType.lambda$of$0(str, (DDFTagType) obj);
            case 1:
                return AutoDownloadDefaultValues.lambda$get$0(str, (AutoDownloadDefaultValues) obj);
            case 2:
                return str.equals((String) obj);
            default:
                return str.contains((String) obj);
        }
    }
}
