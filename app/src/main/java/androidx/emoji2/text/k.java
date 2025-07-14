package androidx.emoji2.text;

import android.os.Trace;

/* loaded from: classes.dex */
public final class k implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (i.f3654j != null) {
                i.a().c();
            }
        } finally {
            Trace.endSection();
        }
    }
}
