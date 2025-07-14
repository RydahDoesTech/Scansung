package com.idm.adapter.filesystem;

import java.io.File;
import java.nio.file.Path;
import java.util.function.ToLongFunction;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ToLongFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6204a;

    public /* synthetic */ b(int i5) {
        this.f6204a = i5;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.f6204a) {
            case 0:
                return IDMFileSystemAdapter.lambda$idmGetDirSize$1((Path) obj);
            default:
                return ((File) obj).lastModified();
        }
    }
}
