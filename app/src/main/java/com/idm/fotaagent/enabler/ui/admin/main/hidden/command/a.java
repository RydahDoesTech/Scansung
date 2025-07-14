package com.idm.fotaagent.enabler.ui.admin.main.hidden.command;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6305a;

    public /* synthetic */ a(int i5) {
        this.f6305a = i5;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f6305a) {
            case 0:
                return Getlog.lambda$execute$0(file);
            default:
                return file.isFile();
        }
    }
}
