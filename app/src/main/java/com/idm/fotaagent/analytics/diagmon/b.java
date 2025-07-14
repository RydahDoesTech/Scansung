package com.idm.fotaagent.analytics.diagmon;

import F.i;
import F.j;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import e.AbstractC0413p;
import e.B;
import e.q;
import e.r;
import h0.AbstractC0472c;
import h0.ExecutorC0470a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0709g;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f6246e;

    public /* synthetic */ b(Context context, int i5) {
        this.f6245d = i5;
        this.f6246e = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Object systemService;
        FileInputStream fileInputStreamOpenFileInput;
        Context context;
        int i5 = 3;
        Context context2 = this.f6246e;
        switch (this.f6245d) {
            case 0:
                DiagMon.lambda$setup$0(context2);
                return;
            case 1:
                ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                    int i6 = F.b.f617a;
                    Iterator it = r.f6612h.iterator();
                    while (true) {
                        C0709g c0709g = (C0709g) it;
                        if (c0709g.hasNext()) {
                            r rVar = (r) ((WeakReference) c0709g.next()).get();
                            if (rVar != null && (context = ((B) rVar).f6469l) != null) {
                                systemService = context.getSystemService("locale");
                            }
                        } else {
                            systemService = null;
                        }
                    }
                    if ((systemService != null ? new i(new j(q.a(systemService))) : i.f622b).f623a.f624a.isEmpty()) {
                        String attributeValue = "";
                        try {
                            fileInputStreamOpenFileInput = context2.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        } catch (FileNotFoundException unused) {
                            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        }
                        try {
                            try {
                                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                                xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                                int depth = xmlPullParserNewPullParser.getDepth();
                                while (true) {
                                    int next = xmlPullParserNewPullParser.next();
                                    if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                        if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                            attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        }
                                    }
                                }
                            } catch (IOException | XmlPullParserException unused2) {
                                Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                if (fileInputStreamOpenFileInput != null) {
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (attributeValue.isEmpty()) {
                                context2.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            } else {
                                Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(attributeValue));
                            }
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                q.b(systemService2, AbstractC0413p.a(attributeValue));
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    }
                    context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                }
                r.f6611g = true;
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new b(context2, i5));
                return;
            default:
                AbstractC0472c.b(context2, new ExecutorC0470a(0), AbstractC0472c.f6844a, false);
                return;
        }
    }
}
