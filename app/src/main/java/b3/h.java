package B3;

import C3.J;
import J.P;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.k;
import b3.AbstractC0219i;
import d4.j;
import j0.C0520K;
import j0.C0534c;
import j0.C0556y;
import j0.b0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import p3.InterfaceC0755Q;
import p3.InterfaceC0767k;
import v3.C0891C;
import y0.C0920b;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a;

    /* renamed from: b, reason: collision with root package name */
    public int f260b;

    /* renamed from: c, reason: collision with root package name */
    public Object f261c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f262d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f263e;
    public Object f;

    public h(g gVar, InterfaceC0767k interfaceC0767k, E3.e eVar, int i5) {
        this.f259a = 0;
        AbstractC0219i.e("c", gVar);
        AbstractC0219i.e("typeParameterOwner", eVar);
        this.f261c = gVar;
        this.f262d = interfaceC0767k;
        this.f260b = i5;
        ArrayList arrayListU = eVar.u();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayListU.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i6));
            i6++;
        }
        this.f263e = linkedHashMap;
        this.f = ((b) ((g) this.f261c).f255e).f223a.c(new d(1, this));
    }

    public static void d(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e5) {
            Log.w("SupportSQLite", "delete failed: ", e5);
        }
    }

    @Override // B3.i
    public InterfaceC0755Q a(C0891C c0891c) {
        AbstractC0219i.e("javaTypeParameter", c0891c);
        J j5 = (J) ((j) this.f).d(c0891c);
        return j5 != null ? j5 : ((i) ((g) this.f261c).f).a(c0891c);
    }

    public void b(View view, int i5, boolean z4) {
        RecyclerView recyclerView = ((C0556y) this.f261c).f7319a;
        int childCount = i5 < 0 ? recyclerView.getChildCount() : h(i5);
        ((C0534c) this.f262d).e(childCount, z4);
        if (z4) {
            k(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.V(view);
        ArrayList arrayList = recyclerView.f4739F;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((G0.g) recyclerView.f4739F.get(size)).getClass();
                C0520K c0520k = (C0520K) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0520k).width != -1 || ((ViewGroup.MarginLayoutParams) c0520k).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void c(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z4) {
        RecyclerView recyclerView = ((C0556y) this.f261c).f7319a;
        int childCount = i5 < 0 ? recyclerView.getChildCount() : h(i5);
        ((C0534c) this.f262d).e(childCount, z4);
        if (z4) {
            k(view);
        }
        b0 b0VarV = RecyclerView.V(view);
        if (b0VarV != null) {
            if (!b0VarV.k() && !b0VarV.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(b0VarV);
                throw new IllegalArgumentException(g4.f.b(recyclerView, sb));
            }
            if (RecyclerView.f4720m2) {
                Log.d("SeslRecyclerView", "reAttach " + b0VarV);
            }
            b0VarV.f7136j &= -257;
        } else if (RecyclerView.f4719l2) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(g4.f.b(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void e(int i5) {
        int iH = h(i5);
        ((C0534c) this.f262d).f(iH);
        RecyclerView recyclerView = ((C0556y) this.f261c).f7319a;
        View childAt = recyclerView.getChildAt(iH);
        if (childAt != null) {
            b0 b0VarV = RecyclerView.V(childAt);
            if (b0VarV != null) {
                if (b0VarV.k() && !b0VarV.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(b0VarV);
                    throw new IllegalArgumentException(g4.f.b(recyclerView, sb));
                }
                if (RecyclerView.f4720m2) {
                    Log.d("SeslRecyclerView", "tmpDetach " + b0VarV);
                }
                b0VarV.a(256);
            }
        } else if (RecyclerView.f4719l2) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iH);
            throw new IllegalArgumentException(g4.f.b(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iH);
    }

    public View f(int i5) {
        return ((C0556y) this.f261c).f7319a.getChildAt(h(i5));
    }

    public int g() {
        return ((C0556y) this.f261c).f7319a.getChildCount() - ((ArrayList) this.f263e).size();
    }

    public int h(int i5) {
        if (i5 < 0) {
            return -1;
        }
        int childCount = ((C0556y) this.f261c).f7319a.getChildCount();
        int i6 = i5;
        while (i6 < childCount) {
            C0534c c0534c = (C0534c) this.f262d;
            int iB = i5 - (i6 - c0534c.b(i6));
            if (iB == 0) {
                while (c0534c.d(i6)) {
                    i6++;
                }
                return i6;
            }
            i6 += iB;
        }
        return -1;
    }

    public View i(int i5) {
        return ((C0556y) this.f261c).f7319a.getChildAt(i5);
    }

    public int j() {
        return ((C0556y) this.f261c).f7319a.getChildCount();
    }

    public void k(View view) {
        ((ArrayList) this.f263e).add(view);
        C0556y c0556y = (C0556y) this.f261c;
        b0 b0VarV = RecyclerView.V(view);
        if (b0VarV != null) {
            int i5 = b0VarV.f7142q;
            View view2 = b0VarV.f7128a;
            if (i5 != -1) {
                b0VarV.f7141p = i5;
            } else {
                WeakHashMap weakHashMap = P.f1421a;
                b0VarV.f7141p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0556y.f7319a;
            if (recyclerView.a0()) {
                b0VarV.f7142q = 4;
                recyclerView.f4800d2.add(b0VarV);
            } else {
                WeakHashMap weakHashMap2 = P.f1421a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042 A[EDGE_INSN: B:53:0x0042->B:21:0x0042 BREAK  A[LOOP:1: B:15:0x0030->B:56:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(y0.C0920b r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Object r4 = r0.f261c
            androidx.room.a r4 = (androidx.room.a) r4
            java.lang.Object r5 = r0.f262d
            androidx.room.k r5 = (androidx.room.k) r5
            if (r4 == 0) goto L8d
            androidx.room.i r4 = r4.f4884d
            r4.getClass()
            if (r2 != r3) goto L1f
            java.util.List r4 = java.util.Collections.emptyList()
            goto L70
        L1f:
            if (r3 <= r2) goto L23
            r8 = 1
            goto L24
        L23:
            r8 = 0
        L24:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = -1
            if (r8 == 0) goto L2e
            r11 = r10
            goto L2f
        L2e:
            r11 = 1
        L2f:
            r12 = r2
        L30:
            if (r8 == 0) goto L35
            if (r12 >= r3) goto L6f
            goto L37
        L35:
            if (r12 <= r3) goto L6f
        L37:
            o.l r13 = r4.f4914a
            r14 = 0
            java.lang.Object r13 = r13.a(r12, r14)
            o.l r13 = (o.C0714l) r13
            if (r13 != 0) goto L44
        L42:
            r4 = r14
            goto L70
        L44:
            int r15 = r13.f
            if (r8 == 0) goto L4c
            int r15 = r15 + (-1)
            r6 = r10
            goto L4e
        L4c:
            r6 = r15
            r15 = 0
        L4e:
            if (r15 == r6) goto L6b
            int[] r7 = r13.f8239d
            r7 = r7[r15]
            if (r8 == 0) goto L5b
            if (r7 > r3) goto L69
            if (r7 <= r12) goto L69
            goto L5f
        L5b:
            if (r7 < r3) goto L69
            if (r7 >= r12) goto L69
        L5f:
            java.lang.Object[] r6 = r13.f8240e
            r6 = r6[r15]
            r9.add(r6)
            r12 = r7
            r6 = 1
            goto L6c
        L69:
            int r15 = r15 + r11
            goto L4e
        L6b:
            r6 = 0
        L6c:
            if (r6 != 0) goto L30
            goto L42
        L6f:
            r4 = r9
        L70:
            if (r4 == 0) goto L8d
            java.util.Iterator r2 = r4.iterator()
        L76:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()
            u0.a r3 = (u0.AbstractC0877a) r3
            r3.migrate(r1)
            goto L76
        L86:
            r5.validateMigration(r1)
            r16.n(r17)
            return
        L8d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "A migration from "
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.h.l(y0.b, int, int):void");
    }

    public void m(View view) {
        if (((ArrayList) this.f263e).remove(view)) {
            C0556y c0556y = (C0556y) this.f261c;
            b0 b0VarV = RecyclerView.V(view);
            if (b0VarV != null) {
                int i5 = b0VarV.f7141p;
                RecyclerView recyclerView = c0556y.f7319a;
                if (recyclerView.a0()) {
                    b0VarV.f7142q = i5;
                    recyclerView.f4800d2.add(b0VarV);
                } else {
                    WeakHashMap weakHashMap = P.f1421a;
                    b0VarV.f7128a.setImportantForAccessibility(i5);
                }
                b0VarV.f7141p = 0;
            }
        }
    }

    public void n(C0920b c0920b) {
        c0920b.d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0920b.d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"" + ((String) this.f263e) + "\")");
    }

    public String toString() {
        switch (this.f259a) {
            case 2:
                return ((C0534c) this.f262d).toString() + ", hidden list:" + ((ArrayList) this.f263e).size();
            default:
                return super.toString();
        }
    }

    public h(androidx.room.a aVar, k kVar, String str, String str2) {
        this.f259a = 1;
        this.f260b = kVar.version;
        this.f261c = aVar;
        this.f262d = kVar;
        this.f263e = str;
        this.f = str2;
    }

    public h(C0556y c0556y) {
        this.f259a = 2;
        this.f260b = 0;
        this.f261c = c0556y;
        this.f262d = new C0534c();
        this.f263e = new ArrayList();
    }
}
