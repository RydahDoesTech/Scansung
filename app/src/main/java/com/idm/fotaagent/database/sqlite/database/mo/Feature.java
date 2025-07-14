package com.idm.fotaagent.database.sqlite.database.mo;

import android.content.Context;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.DownloadType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallPostponeType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.InstallType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.ServiceType;
import com.idm.fotaagent.database.sqlite.database.mo.push.field.UpdateType;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class Feature<T> {
    protected static final int DEFAULT_POSITION = 0;
    public final List<String> candidates;
    private final Consumer<AdminRepository> deleter;
    private final Function<AdminRepository, Optional<? extends T>> getter;
    private final T[] mockCandidates;
    public final String name = getName();
    protected final AdminRepository repository;
    public int selectedPosition;
    private final BiConsumer<AdminRepository, ? super T> setter;

    public static class MockDownloadType extends Feature<DownloadType> {
        public MockDownloadType(Context context) {
            super(context, DownloadType.values(), new a(0), new E2.b(9), new c(7));
        }
    }

    public static class MockInstallPostponeType extends Feature<InstallPostponeType> {
        public MockInstallPostponeType(Context context) {
            super(context, (InstallPostponeType[]) Arrays.stream(new Byte[]{(byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9}).map(new E2.b(10)).toArray(new b(0)), new a(1), new E2.b(11), new c(8));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ InstallPostponeType[] lambda$new$0(int i5) {
            return new InstallPostponeType[i5];
        }
    }

    public static class MockInstallType extends Feature<InstallType> {
        public MockInstallType(Context context) {
            super(context, InstallType.values(), new a(2), new E2.b(12), new c(9));
        }
    }

    public static class MockServiceType extends Feature<ServiceType> {
        public MockServiceType(Context context) {
            super(context, ServiceType.values(), new a(3), new E2.b(13), new c(10));
        }
    }

    public static class MockUpdateType extends Feature<UpdateType> {
        public MockUpdateType(Context context) {
            super(context, UpdateType.values(), new a(4), new E2.b(14), new c(11));
        }
    }

    public static class MockWifiOnlyDevice extends Feature<AdminRepository.WifiOnlyDevice> {
        public MockWifiOnlyDevice(Context context) {
            super(context, AdminRepository.WifiOnlyDevice.values(), new a(5), new E2.b(15), new c(12));
        }
    }

    public Feature(Context context, T[] tArr, BiConsumer<AdminRepository, ? super T> biConsumer, Function<AdminRepository, Optional<? extends T>> function, Consumer<AdminRepository> consumer) {
        this.repository = new AdminRepository(context);
        this.setter = biConsumer;
        this.getter = function;
        this.deleter = consumer;
        this.mockCandidates = tArr;
        ArrayList arrayList = new ArrayList();
        this.candidates = arrayList;
        arrayList.add("SELECT");
        for (T t4 : tArr) {
            this.candidates.add(t4.toString());
        }
        int iIndexOf = this.candidates.indexOf(getValue().map(new E2.b(8)).orElse(""));
        this.selectedPosition = iIndexOf != -1 ? iIndexOf : 0;
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public Optional<T> getValue() {
        return this.getter.apply(this.repository);
    }

    public void onItemSelected(int i5) {
        Log.V("position : " + i5);
        setValueFrom(i5);
    }

    public void setValueFrom(int i5) {
        if (i5 == 0) {
            this.deleter.accept(this.repository);
        } else {
            this.setter.accept(this.repository, this.mockCandidates[i5 - 1]);
        }
    }
}
