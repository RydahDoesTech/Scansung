package z;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0938a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int i5) {
        return context.getDrawable(i5);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
