package androidx.picker.widget;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.SeslImmersiveScrollBehavior;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.wssyncmldm.R;
import d0.C0391a;
import j0.AbstractC0522M;
import java.util.Calendar;
import k.J1;
import r0.AbstractC0807a;
import r0.AbstractC0808b;

/* renamed from: androidx.picker.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0165c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4466b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0165c(Object obj, Looper looper, int i5) {
        super(looper);
        this.f4465a = i5;
        this.f4466b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        J2.b[] bVarArr;
        int i5;
        boolean z4;
        int childCount;
        switch (this.f4465a) {
            case 0:
                super.handleMessage(message);
                int i6 = message.what;
                SeslDatePicker seslDatePicker = (SeslDatePicker) this.f4466b;
                if (i6 == 1000) {
                    if (seslDatePicker.f4380q.get(1) <= seslDatePicker.getMaxYear()) {
                        Calendar calendar = seslDatePicker.f4380q;
                        if (calendar.get(1) < seslDatePicker.getMinYear()) {
                            return;
                        }
                        String strA = SeslDatePicker.a(seslDatePicker, calendar);
                        TextView textView = seslDatePicker.f4358V;
                        textView.setText(strA);
                        if (!SeslDatePicker.a(seslDatePicker, calendar).equals(SeslDatePicker.a(seslDatePicker, seslDatePicker.n))) {
                            seslDatePicker.f4356T.announceForAccessibility(textView.getText());
                        }
                        textView.setContentDescription(strA + ", " + seslDatePicker.f4365e.getString(seslDatePicker.f4386u == 0 ? R.string.sesl_date_picker_switch_to_month_day_year_view_description : R.string.sesl_date_picker_switch_to_calendar_description));
                        return;
                    }
                    return;
                }
                if (i6 != 1001) {
                    return;
                }
                int i7 = seslDatePicker.f4386u;
                ImageButton imageButton = seslDatePicker.f4372i0;
                ImageButton imageButton2 = seslDatePicker.f4370h0;
                if (i7 == 1) {
                    SeslDatePicker.c(seslDatePicker, 0.0f, false);
                    SeslDatePicker.d(seslDatePicker, 0.0f, false);
                    imageButton2.setImportantForAccessibility(2);
                    imageButton.setImportantForAccessibility(2);
                    seslDatePicker.f4358V.sendAccessibilityEvent(8);
                    return;
                }
                int iB = AbstractC0807a.b();
                if (iB != -1) {
                    AbstractC0808b.m(iB, imageButton2);
                    AbstractC0808b.m(iB, imageButton);
                }
                J1.a(imageButton2, seslDatePicker.getResources().getString(R.string.sesl_date_picker_decrement_month));
                J1.a(imageButton, seslDatePicker.getResources().getString(R.string.sesl_date_picker_increment_month));
                imageButton2.setImportantForAccessibility(1);
                imageButton.setImportantForAccessibility(1);
                int i8 = seslDatePicker.f4350L;
                if (i8 > 0 && i8 < seslDatePicker.f4351M - 1) {
                    SeslDatePicker.c(seslDatePicker, 1.0f, true);
                    SeslDatePicker.d(seslDatePicker, 1.0f, true);
                    return;
                }
                int i9 = seslDatePicker.f4351M;
                if (i9 == 1) {
                    SeslDatePicker.c(seslDatePicker, 0.4f, false);
                    SeslDatePicker.d(seslDatePicker, 0.4f, false);
                    seslDatePicker.l();
                    return;
                } else if (i8 == 0) {
                    SeslDatePicker.c(seslDatePicker, 0.4f, false);
                    SeslDatePicker.d(seslDatePicker, 1.0f, true);
                    seslDatePicker.l();
                    return;
                } else {
                    if (i8 == i9 - 1) {
                        SeslDatePicker.c(seslDatePicker, 1.0f, true);
                        SeslDatePicker.d(seslDatePicker, 0.4f, false);
                        seslDatePicker.l();
                        return;
                    }
                    return;
                }
            case 1:
                if (message.what != 1) {
                    return;
                }
                ((androidx.preference.z) this.f4466b).bindPreferences();
                return;
            case 2:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C0391a c0391a = (C0391a) this.f4466b;
                do {
                    synchronized (c0391a.f6396b) {
                        try {
                            size = c0391a.f6398d.size();
                            if (size <= 0) {
                                return;
                            }
                            bVarArr = new J2.b[size];
                            c0391a.f6398d.toArray(bVarArr);
                            c0391a.f6398d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (size <= 0);
                J2.b bVar = bVarArr[0];
                throw null;
            case 3:
                if (message.what != 0) {
                    return;
                }
                RecyclerView recyclerView = (RecyclerView) this.f4466b;
                if (recyclerView.f4831p == null) {
                    Log.e("SeslRecyclerView", "No adapter attached; skipping MSG_HOVERSCROLL_MOVE");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                recyclerView.f4738E1 = (jCurrentTimeMillis - recyclerView.F1) / 1000;
                boolean z5 = recyclerView.f4854x1;
                if (!z5 || jCurrentTimeMillis - recyclerView.f4749I1 >= recyclerView.f4743G1) {
                    if (!recyclerView.f4768Q0 || jCurrentTimeMillis - recyclerView.f4749I1 >= recyclerView.f4746H1) {
                        if (z5 && !recyclerView.f4757L1) {
                            AbstractC0522M abstractC0522M = recyclerView.n0;
                            if (abstractC0522M != null) {
                                recyclerView.M1 = 1;
                                abstractC0522M.a(recyclerView, 1);
                            }
                            recyclerView.f4757L1 = true;
                        }
                        boolean zE = recyclerView.f4833q.e();
                        boolean zD = recyclerView.f4833q.d();
                        boolean z6 = recyclerView.f4833q.A() == 1;
                        boolean zO = recyclerView.o();
                        boolean zP = recyclerView.p();
                        int iApplyDimension = (int) (TypedValue.applyDimension(1, RecyclerView.s2, recyclerView.f4859z0.getResources().getDisplayMetrics()) + 0.5f);
                        recyclerView.f4733C1 = iApplyDimension;
                        long j5 = recyclerView.f4738E1;
                        if (j5 > 2 && j5 < 4) {
                            recyclerView.f4733C1 = iApplyDimension + ((int) (iApplyDimension * 0.1d));
                        } else if (j5 >= 4 && j5 < 5) {
                            recyclerView.f4733C1 = iApplyDimension + ((int) (iApplyDimension * 0.2d));
                        } else if (j5 >= 5) {
                            recyclerView.f4733C1 = iApplyDimension + ((int) (iApplyDimension * 0.3d));
                        }
                        int i10 = recyclerView.J1;
                        if (i10 == 2) {
                            i5 = (zD && z6) ? recyclerView.f4733C1 : recyclerView.f4733C1 * (-1);
                            if (recyclerView.f4781V1 != i10 && recyclerView.U1) {
                                recyclerView.f4795b1 = null;
                                recyclerView.d1 = 0;
                                recyclerView.f4797c1 = recyclerView.f4786X1;
                                recyclerView.f4781V1 = i10;
                                recyclerView.U1 = true;
                            }
                        } else {
                            i5 = (zD && z6) ? recyclerView.f4733C1 * (-1) : recyclerView.f4733C1;
                            if (recyclerView.f4781V1 != i10 && recyclerView.U1) {
                                recyclerView.f4795b1 = null;
                                recyclerView.d1 = 0;
                                recyclerView.f4797c1 = recyclerView.f4784W1;
                                recyclerView.f4781V1 = i10;
                                recyclerView.U1 = true;
                            }
                        }
                        if (recyclerView.getChildAt(recyclerView.getChildCount() - 1) == null) {
                            return;
                        }
                        if ((i5 < 0 && zP) || (i5 > 0 && zO)) {
                            recyclerView.C0(zD ? 1 : 2, 1);
                            if (((RecyclerView) this.f4466b).A(zD ? z6 ? -i5 : i5 : 0, zE ? i5 : 0, null, null, 1)) {
                                recyclerView.m(i5);
                            } else {
                                int i11 = zD ? z6 ? -i5 : i5 : 0;
                                if (!zE) {
                                    i5 = 0;
                                }
                                recyclerView.t0(i11, i5, null, 0);
                                recyclerView.setScrollState(1);
                            }
                            recyclerView.c2.sendEmptyMessageDelayed(0, 0L);
                            return;
                        }
                        int overScrollMode = recyclerView.getOverScrollMode();
                        if (overScrollMode == 0) {
                            z4 = true;
                        } else {
                            if (overScrollMode == 1 && (childCount = recyclerView.getChildCount()) != 0) {
                                if (childCount == recyclerView.f4831p.a()) {
                                    int top = recyclerView.getChildAt(0).getTop();
                                    Rect rect = recyclerView.f4774S1;
                                    if (top < rect.top || recyclerView.getChildAt(childCount - 1).getBottom() > recyclerView.getHeight() - rect.bottom) {
                                    }
                                }
                                z4 = true;
                            }
                            z4 = false;
                        }
                        if (z4 && !recyclerView.f4754K1) {
                            if (zD) {
                                recyclerView.D();
                                recyclerView.E();
                            } else {
                                recyclerView.F();
                                recyclerView.C();
                            }
                            int i12 = recyclerView.J1;
                            if (i12 == 2) {
                                if (zD) {
                                    recyclerView.f4755L.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                                    if (!recyclerView.f4760N.isFinished()) {
                                        recyclerView.f4760N.onRelease();
                                    }
                                } else {
                                    recyclerView.f4758M.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                                    if (!recyclerView.f4762O.isFinished()) {
                                        recyclerView.f4762O.onRelease();
                                    }
                                }
                            } else if (i12 == 1) {
                                if (zD) {
                                    recyclerView.f4760N.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                                    if (!recyclerView.f4755L.isFinished()) {
                                        recyclerView.f4755L.onRelease();
                                    }
                                } else {
                                    recyclerView.f4762O.onAbsorb(IDMCallbackStatusInterface.IDM_RESULTS);
                                    recyclerView.setupGoToTop(1);
                                    if (!recyclerView.f4758M.isFinished()) {
                                        recyclerView.f4758M.onRelease();
                                    }
                                }
                            }
                            recyclerView.invalidate();
                            recyclerView.f4754K1 = true;
                        }
                        if (recyclerView.f4770R == 1) {
                            recyclerView.setScrollState(0);
                        }
                        if (z4 || recyclerView.f4754K1) {
                            return;
                        }
                        recyclerView.f4754K1 = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                if (message.what == 100) {
                    ((SeslImmersiveScrollBehavior) this.f4466b).getClass();
                    return;
                }
                return;
        }
    }
}
