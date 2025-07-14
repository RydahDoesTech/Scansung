package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import g3.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C0705c;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f3653i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile i f3654j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f3655a;

    /* renamed from: b, reason: collision with root package name */
    public final C0705c f3656b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3657c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3658d;

    /* renamed from: e, reason: collision with root package name */
    public final e f3659e;
    public final h f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3660g;

    /* renamed from: h, reason: collision with root package name */
    public final c f3661h;

    public i(o oVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3655a = reentrantReadWriteLock;
        this.f3657c = 3;
        h hVar = (h) oVar.f3651b;
        this.f = hVar;
        int i5 = oVar.f3650a;
        this.f3660g = i5;
        this.f3661h = (c) oVar.f3652c;
        this.f3658d = new Handler(Looper.getMainLooper());
        this.f3656b = new C0705c(0);
        e eVar = new e(this);
        this.f3659e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i5 == 0) {
            try {
                this.f3657c = 0;
            } catch (Throwable th) {
                this.f3655a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (f3653i) {
            try {
                iVar = f3654j;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public final int b() {
        this.f3655a.readLock().lock();
        try {
            return this.f3657c;
        } finally {
            this.f3655a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f3660g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f3655a.writeLock().lock();
        try {
            if (this.f3657c == 0) {
                return;
            }
            this.f3657c = 0;
            this.f3655a.writeLock().unlock();
            e eVar = this.f3659e;
            i iVar = eVar.f3647a;
            try {
                iVar.f.a(new d(eVar));
            } catch (Throwable th) {
                iVar.d(th);
            }
        } finally {
            this.f3655a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3655a.writeLock().lock();
        try {
            this.f3657c = 2;
            arrayList.addAll(this.f3656b);
            this.f3656b.clear();
            this.f3655a.writeLock().unlock();
            this.f3658d.post(new G.b(arrayList, this.f3657c, th));
        } catch (Throwable th2) {
            this.f3655a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i5, int i6) {
        int iCharCount;
        s[] sVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        y.f("start should be <= than end", i5 <= i6);
        t tVar = null;
        if (charSequence == null) {
            return null;
        }
        y.f("start should be < than charSequence length", i5 <= charSequence.length());
        y.f("end should be < than charSequence length", i6 <= charSequence.length());
        if (charSequence.length() == 0 || i5 == i6) {
            return charSequence;
        }
        E0.d dVar = this.f3659e.f3648b;
        dVar.getClass();
        boolean z4 = charSequence instanceof r;
        if (z4) {
            ((r) charSequence).a();
        }
        if (z4) {
            tVar = new t((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    tVar = new t((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i5 - 1, i6 + 1, s.class) <= i6) {
                    tVar = new t(charSequence);
                }
            } finally {
                if (z4) {
                    ((r) charSequence).b();
                }
            }
        }
        if (tVar != null && (sVarArr = (s[]) tVar.f3691e.getSpans(i5, i6, s.class)) != null && sVarArr.length > 0) {
            for (s sVar : sVarArr) {
                int spanStart = tVar.f3691e.getSpanStart(sVar);
                int spanEnd = tVar.f3691e.getSpanEnd(sVar);
                if (spanStart != i6) {
                    tVar.removeSpan(sVar);
                }
                i5 = Math.min(spanStart, i5);
                i6 = Math.max(spanEnd, i6);
            }
        }
        if (i5 != i6 && i5 < charSequence.length()) {
            m mVar = new m((p) ((com.google.firebase.messaging.q) dVar.f520e).f6169g);
            int iCodePointAt = Character.codePointAt(charSequence, i5);
            int i7 = 0;
            t tVar2 = tVar;
            loop1: while (true) {
                iCharCount = i5;
                while (i5 < i6 && i7 < Integer.MAX_VALUE) {
                    int iA = mVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i5 = iCharCount;
                    } else if (iA == 2) {
                        i5 += Character.charCount(iCodePointAt);
                        if (i5 < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, i5);
                        }
                    } else if (iA == 3) {
                        if (!dVar.K0(charSequence, iCharCount, i5, mVar.f3671d.f3682b)) {
                            if (tVar2 == null) {
                                tVar2 = new t((Spannable) new SpannableString(charSequence));
                            }
                            tVar2.setSpan(new s(mVar.f3671d.f3682b), iCharCount, i5, 33);
                            i7++;
                        }
                    }
                }
                break loop1;
            }
            if (mVar.f3668a == 2 && mVar.f3670c.f3682b != null && ((mVar.f > 1 || mVar.c()) && i7 < Integer.MAX_VALUE && !dVar.K0(charSequence, iCharCount, i5, mVar.f3670c.f3682b))) {
                if (tVar2 == null) {
                    tVar2 = new t(charSequence);
                }
                tVar2.setSpan(new s(mVar.f3670c.f3682b), iCharCount, i5, 33);
            }
            if (tVar2 != null) {
                Spannable spannable = tVar2.f3691e;
                if (z4) {
                    ((r) charSequence).b();
                }
                return spannable;
            }
            if (!z4) {
                return charSequence;
            }
        } else if (!z4) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(g gVar) {
        y.h("initCallback cannot be null", gVar);
        this.f3655a.writeLock().lock();
        try {
            if (this.f3657c == 1 || this.f3657c == 2) {
                this.f3658d.post(new G.b(Arrays.asList(gVar), this.f3657c, (Throwable) null));
            } else {
                this.f3656b.add(gVar);
            }
            this.f3655a.writeLock().unlock();
        } catch (Throwable th) {
            this.f3655a.writeLock().unlock();
            throw th;
        }
    }
}
