package androidx.room;

import android.content.Context;

/* loaded from: classes.dex */
public class Room {
    public static <T extends j> h inMemoryDatabaseBuilder(Context context, Class<T> cls) {
        return new h(context, cls, null);
    }
}
