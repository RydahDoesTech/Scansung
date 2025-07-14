package C1;

import A.o;
import A1.i;
import J.C0061s;
import J.C0062t;
import J.C0065w;
import J.C0067y;
import P0.k;
import Q0.h;
import Y0.j;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.activity.l;
import androidx.emoji2.text.n;
import androidx.fragment.app.H;
import androidx.lifecycle.C0161y;
import androidx.lifecycle.EnumC0153p;
import androidx.lifecycle.K;
import androidx.preference.Preference;
import b3.AbstractC0219i;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.q;
import com.idm.agent.restclient.RestRequestExecutor;
import com.idm.fotaagent.InitExecutor;
import com.idm.fotaagent.abupdate.abenabler.Executor;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.TimeoutTask;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.debug.dao.PostponeReasonDao;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadDescriptor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadInProgress;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorFumoStart;
import com.idm.fotaagent.enabler.ui.admin.setting.AdminSettingContractor;
import com.idm.fotaagent.utils.rangerequest.RangeRequest;
import e1.AbstractC0415a;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import z.AbstractC0939b;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f340e;

    public /* synthetic */ b(int i5, Object obj) {
        this.f339d = i5;
        this.f340e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        E0.d dVar;
        final C0065w c0065wA;
        switch (this.f339d) {
            case 0:
                ((CarouselLayoutManager) this.f340e).m0();
                return;
            case 1:
                View view = (View) this.f340e;
                ((InputMethodManager) AbstractC0939b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                k kVar = (k) this.f340e;
                kVar.getClass();
                ((h) kVar.f2141d).m(new I0.b(2, kVar));
                return;
            case 3:
                i iVar = (i) this.f340e;
                iVar.f67c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) iVar.f69e;
                S.d dVar2 = sideSheetBehavior.f5958i;
                if (dVar2 != null && dVar2.f()) {
                    iVar.a(iVar.f66b);
                    return;
                } else {
                    if (sideSheetBehavior.f5957h == 2) {
                        sideSheetBehavior.s(iVar.f66b);
                        return;
                    }
                    return;
                }
            case 4:
                ((R1.d) this.f340e).t(true);
                return;
            case 5:
                R1.k kVar2 = (R1.k) this.f340e;
                boolean zIsPopupShowing = kVar2.f2389h.isPopupShowing();
                kVar2.t(zIsPopupShowing);
                kVar2.f2394m = zIsPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f340e).f6017g.requestLayout();
                return;
            case 7:
                ((H) this.f340e).invalidateMenu();
                return;
            case 8:
                androidx.activity.k kVar3 = (androidx.activity.k) this.f340e;
                Runnable runnable = kVar3.f3125e;
                if (runnable != null) {
                    runnable.run();
                    kVar3.f3125e = null;
                    return;
                }
                return;
            case 9:
                l.a((l) this.f340e);
                return;
            case 10:
                n nVar = (n) this.f340e;
                synchronized (nVar.f3676d) {
                    try {
                        if (nVar.f3679h == null) {
                            return;
                        }
                        try {
                            G.i iVarC = nVar.c();
                            int i5 = iVarC.f697e;
                            if (i5 == 2) {
                                synchronized (nVar.f3676d) {
                                }
                            }
                            if (i5 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                O1.e eVar = nVar.f3675c;
                                Context context = nVar.f3673a;
                                eVar.getClass();
                                Typeface typefaceA = B.h.a(context, new G.i[]{iVarC}, 0);
                                MappedByteBuffer mappedByteBufferL = AbstractC0415a.L(nVar.f3673a, iVarC.f693a);
                                if (mappedByteBufferL == null || typefaceA == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    q qVar = new q(typefaceA, AbstractC0415a.M(mappedByteBufferL));
                                    Trace.endSection();
                                    synchronized (nVar.f3676d) {
                                        try {
                                            j jVar = nVar.f3679h;
                                            if (jVar != null) {
                                                jVar.G(qVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    nVar.b();
                                    return;
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (nVar.f3676d) {
                                try {
                                    j jVar2 = nVar.f3679h;
                                    if (jVar2 != null) {
                                        jVar2.D(th2);
                                    }
                                    nVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 11:
                K k5 = (K) this.f340e;
                AbstractC0219i.e("this$0", k5);
                int i6 = k5.f3968e;
                C0161y c0161y = k5.f3971i;
                if (i6 == 0) {
                    k5.f = true;
                    c0161y.e(EnumC0153p.ON_PAUSE);
                }
                if (k5.f3967d == 0 && k5.f) {
                    c0161y.e(EnumC0153p.ON_STOP);
                    k5.f3969g = true;
                    return;
                }
                return;
            case 12:
                ((com.google.android.material.timepicker.e) this.f340e).g();
                return;
            case 13:
                ((InitExecutor) this.f340e).lambda$execute$2();
                return;
            case 14:
                ((Executor.AB.DownloadDescriptor) this.f340e).lambda$getCheckAndStarter$0();
                return;
            case 15:
                ((Executor.AB.DownloadProgress) this.f340e).lambda$getCheckAndStarter$0();
                return;
            case 16:
                ((Executor.AB.UpdateInProgress) this.f340e).lambda$setNotificationAndStartMergeCallbackListenerService$0();
                return;
            case 17:
                ((TimeoutTask) this.f340e).onTimer();
                return;
            case 18:
                ((PostponeReasonDao) this.f340e).deleteAll();
                return;
            case 19:
                ((IDMFumoExecutorDownloadDescriptor) this.f340e).checkMemoryAndStartDownloading();
                return;
            case 20:
                ((IDMFumoExecutorDownloadInProgress) this.f340e).checkMemoryAndStartDownloading();
                return;
            case 21:
                ((IDMFumoExecutorFumoStart) this.f340e).callDownloadYesNo();
                return;
            case 22:
                ((RangeRequest) this.f340e).watchFileLengthChange();
                return;
            case 23:
                ArrayList arrayList = new ArrayList();
                LinearLayout linearLayout = (LinearLayout) this.f340e;
                int childCount = linearLayout.getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = linearLayout.getChildAt(i8);
                    if ((childAt instanceof Button) && childAt.getVisibility() != 8) {
                        arrayList.add(childAt);
                    }
                }
                if (arrayList.size() == 0) {
                    dVar = null;
                } else {
                    int height = linearLayout.getHeight();
                    int width = linearLayout.getWidth();
                    Rect rect = new Rect(0, 0, width, height);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C0067y.b(linearLayout, (View) it.next()));
                    }
                    C0061s c0061s = linearLayout.getOrientation() == 0 ? new C0061s(0, rect) : new C0061s(1, rect);
                    Rect rect2 = (Rect) arrayList2.get(arrayList2.size() - 1);
                    arrayList2.add(new Rect(Math.max(0, width - rect2.right) + width, Math.max(0, height - rect2.bottom) + height, width, height));
                    Rect rect3 = new Rect(0, 0, 0, 0);
                    E0.d dVar3 = new E0.d((View) linearLayout);
                    while (i7 < arrayList.size()) {
                        Rect rect4 = (Rect) arrayList2.get(i7);
                        int i9 = i7 + 1;
                        Rect rect5 = (Rect) arrayList2.get(i9);
                        switch (c0061s.f1484a) {
                            case 0:
                                int i10 = rect4.left - rect3.right;
                                int i11 = rect4.top;
                                Rect rect6 = c0061s.f1485b;
                                c0065wA = C0065w.a(i10, i11 - rect6.top, Math.max(0, rect5.left - rect4.right) / 2, rect6.bottom - rect4.bottom);
                                break;
                            default:
                                int i12 = rect4.left;
                                Rect rect7 = c0061s.f1485b;
                                c0065wA = C0065w.a(i12 - rect7.left, rect4.top - rect3.bottom, rect7.right - rect4.right, Math.max(0, rect5.top - rect4.bottom) / 2);
                                break;
                        }
                        final View view2 = (View) arrayList.get(i7);
                        ((LinkedList) dVar3.f).add(new I.a() { // from class: J.u
                            @Override // I.a
                            public final void accept(Object obj) {
                                ((C0067y) obj).a(view2, c0065wA);
                            }
                        });
                        rect3 = rect4;
                        i7 = i9;
                    }
                    dVar = dVar3;
                }
                if (dVar != null) {
                    View view3 = (View) dVar.f520e;
                    Objects.requireNonNull(view3);
                    view3.post(new o(dVar, 1, new C0062t(0, view3)));
                    return;
                }
                return;
            case 24:
                ((RestRequestExecutor) this.f340e).lambda$start$0();
                return;
            case 25:
                SALogging.lambda$setup$0((Application) this.f340e);
                return;
            case 26:
                ((Preference) this.f340e).z("Checking...");
                return;
            default:
                ((AdminSettingContractor.View) this.f340e).refresh();
                return;
        }
    }
}
