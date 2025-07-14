package j0;

import J.C0059p;
import android.util.Log;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: j0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7319a;

    public /* synthetic */ C0556y(RecyclerView recyclerView) {
        this.f7319a = recyclerView;
    }

    public void a(C0532a c0532a) {
        int i5 = c0532a.f7112a;
        RecyclerView recyclerView = this.f7319a;
        if (i5 == 1) {
            recyclerView.f4833q.W(c0532a.f7113b, c0532a.f7115d);
            return;
        }
        if (i5 == 2) {
            recyclerView.f4833q.Z(c0532a.f7113b, c0532a.f7115d);
        } else if (i5 == 4) {
            recyclerView.f4833q.a0(c0532a.f7113b, c0532a.f7115d);
        } else {
            if (i5 != 8) {
                return;
            }
            recyclerView.f4833q.Y(c0532a.f7113b, c0532a.f7115d);
        }
    }

    public b0 b(int i5) {
        RecyclerView recyclerView = this.f7319a;
        int iJ = recyclerView.f4814i.j();
        int i6 = 0;
        b0 b0Var = null;
        while (true) {
            if (i6 >= iJ) {
                break;
            }
            b0 b0VarV = RecyclerView.V(recyclerView.f4814i.i(i6));
            if (b0VarV != null && !b0VarV.i() && b0VarV.f7130c == i5) {
                if (!((ArrayList) recyclerView.f4814i.f263e).contains(b0VarV.f7128a)) {
                    b0Var = b0VarV;
                    break;
                }
                b0Var = b0VarV;
            }
            i6++;
        }
        if (b0Var == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f4814i.f263e).contains(b0Var.f7128a)) {
            return b0Var;
        }
        if (RecyclerView.f4720m2) {
            Log.d("SeslRecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i5, int i6, Preference preference) {
        int i7;
        int i8;
        RecyclerView recyclerView = this.f7319a;
        int iJ = recyclerView.f4814i.j();
        int i9 = i6 + i5;
        for (int i10 = 0; i10 < iJ; i10++) {
            View viewI = recyclerView.f4814i.i(i10);
            b0 b0VarV = RecyclerView.V(viewI);
            if (b0VarV != null && !b0VarV.p() && (i8 = b0VarV.f7130c) >= i5 && i8 < i9) {
                b0VarV.a(2);
                if (preference == null) {
                    b0VarV.a(1024);
                } else if ((1024 & b0VarV.f7136j) == 0) {
                    if (b0VarV.f7137k == null) {
                        ArrayList arrayList = new ArrayList();
                        b0VarV.f7137k = arrayList;
                        b0VarV.f7138l = Collections.unmodifiableList(arrayList);
                    }
                    b0VarV.f7137k.add(preference);
                }
                ((C0520K) viewI.getLayoutParams()).f7077c = true;
            }
        }
        C0525P c0525p = recyclerView.f;
        ArrayList arrayList2 = c0525p.f7088c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList2.get(size);
            if (b0Var != null && (i7 = b0Var.f7130c) >= i5 && i7 < i9) {
                b0Var.a(2);
                c0525p.g(size);
            }
        }
        recyclerView.q0 = true;
    }

    public void d(int i5, int i6) {
        RecyclerView recyclerView = this.f7319a;
        int iJ = recyclerView.f4814i.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            b0 b0VarV = RecyclerView.V(recyclerView.f4814i.i(i7));
            if (b0VarV != null && !b0VarV.p() && b0VarV.f7130c >= i5) {
                if (RecyclerView.f4720m2) {
                    Log.d("SeslRecyclerView", "offsetPositionRecordsForInsert attached child " + i7 + " holder " + b0VarV + " now at position " + (b0VarV.f7130c + i6));
                }
                b0VarV.m(i6, false);
                recyclerView.m0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f.f7088c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b0 b0Var = (b0) arrayList.get(i8);
            if (b0Var != null && b0Var.f7130c >= i5) {
                if (RecyclerView.f4720m2) {
                    Log.d("SeslRecyclerView", "offsetPositionRecordsForInsert cached " + i8 + " holder " + b0Var + " now at position " + (b0Var.f7130c + i6));
                }
                b0Var.m(i6, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.p0 = true;
    }

    public void e(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.f7319a;
        int iJ = recyclerView.f4814i.j();
        int i14 = -1;
        if (i5 < i6) {
            i8 = i5;
            i7 = i6;
            i9 = -1;
        } else {
            i7 = i5;
            i8 = i6;
            i9 = 1;
        }
        for (int i15 = 0; i15 < iJ; i15++) {
            b0 b0VarV = RecyclerView.V(recyclerView.f4814i.i(i15));
            if (b0VarV != null && (i13 = b0VarV.f7130c) >= i8 && i13 <= i7) {
                if (RecyclerView.f4720m2) {
                    Log.d("SeslRecyclerView", "offsetPositionRecordsForMove attached child " + i15 + " holder " + b0VarV);
                }
                if (b0VarV.f7130c == i5) {
                    b0VarV.m(i6 - i5, false);
                } else {
                    b0VarV.m(i9, false);
                }
                recyclerView.m0.f = true;
            }
        }
        C0525P c0525p = recyclerView.f;
        c0525p.getClass();
        if (i5 < i6) {
            i11 = i5;
            i10 = i6;
        } else {
            i10 = i5;
            i11 = i6;
            i14 = 1;
        }
        ArrayList arrayList = c0525p.f7088c;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            b0 b0Var = (b0) arrayList.get(i16);
            if (b0Var != null && (i12 = b0Var.f7130c) >= i11 && i12 <= i10) {
                if (i12 == i5) {
                    b0Var.m(i6 - i5, false);
                } else {
                    b0Var.m(i14, false);
                }
                if (RecyclerView.f4720m2) {
                    Log.d("SeslRecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + b0Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.p0 = true;
    }

    public void f(b0 b0Var, C0059p c0059p, C0059p c0059p2) {
        boolean zG;
        int i5;
        int i6;
        RecyclerView recyclerView = this.f7319a;
        recyclerView.getClass();
        b0Var.o(false);
        e0 e0Var = (e0) recyclerView.f4767Q;
        e0Var.getClass();
        if (c0059p == null || ((i5 = c0059p.f1478a) == (i6 = c0059p2.f1478a) && c0059p.f1479b == c0059p2.f1479b)) {
            C0542k c0542k = (C0542k) e0Var;
            c0542k.l(b0Var);
            b0Var.f7128a.setAlpha(0.0f);
            c0542k.f.add(b0Var);
            int i7 = c0542k.f7214p;
            if ((i7 & 8) == 0) {
                c0542k.f7214p = i7 | 8;
            }
            zG = true;
        } else {
            zG = e0Var.g(b0Var, i5, c0059p.f1479b, i6, c0059p2.f1479b);
        }
        if (zG) {
            recyclerView.l0();
        }
    }

    public void g(b0 b0Var, C0059p c0059p, C0059p c0059p2) {
        boolean zG;
        RecyclerView recyclerView = this.f7319a;
        recyclerView.f.l(b0Var);
        recyclerView.i(b0Var);
        b0Var.o(false);
        e0 e0Var = (e0) recyclerView.f4767Q;
        e0Var.getClass();
        int i5 = c0059p.f1478a;
        int i6 = c0059p.f1479b;
        View view = b0Var.f7128a;
        int left = c0059p2 == null ? view.getLeft() : c0059p2.f1478a;
        int top = c0059p2 == null ? view.getTop() : c0059p2.f1479b;
        if (b0Var.i() || (i5 == left && i6 == top)) {
            C0542k c0542k = (C0542k) e0Var;
            c0542k.l(b0Var);
            c0542k.f7205e.add(b0Var);
            if (view.getBottom() > c0542k.f7215q) {
                c0542k.f7215q = view.getBottom();
            }
            int i7 = c0542k.f7214p;
            if ((i7 & 1) == 0) {
                c0542k.f7214p = i7 | 1;
            }
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = e0Var.g(b0Var, i5, i6, left, top);
        }
        if (zG) {
            recyclerView.l0();
        }
    }

    public void h(int i5) {
        RecyclerView recyclerView = this.f7319a;
        View childAt = recyclerView.getChildAt(i5);
        if (childAt != null) {
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i5);
    }
}
