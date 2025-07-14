package androidx.room;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {
    final String[] mTables;

    public d(String str, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        this.mTables = strArr2;
        strArr2[strArr.length] = str;
    }

    public abstract void onInvalidated(Set set);

    public d(String[] strArr) {
        this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
