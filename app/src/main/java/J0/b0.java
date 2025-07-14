package j0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.samsung.android.knox.container.KnoxContainerManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: u, reason: collision with root package name */
    public static final List f7127u = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f7128a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f7129b;

    /* renamed from: j, reason: collision with root package name */
    public int f7136j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f7143r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0510A f7144s;

    /* renamed from: c, reason: collision with root package name */
    public int f7130c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7131d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f7132e = -1;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f7133g = -1;

    /* renamed from: h, reason: collision with root package name */
    public b0 f7134h = null;

    /* renamed from: i, reason: collision with root package name */
    public b0 f7135i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7137k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f7138l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f7139m = 0;
    public C0525P n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7140o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f7141p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f7142q = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7145t = true;

    public b0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f7128a = view;
    }

    public final void a(int i5) {
        this.f7136j = i5 | this.f7136j;
    }

    public final int b() {
        int i5 = this.f7133g;
        return i5 == -1 ? this.f7130c : i5;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f7136j & 1024) != 0 || (arrayList = this.f7137k) == null || arrayList.size() == 0) ? f7127u : this.f7138l;
    }

    public final boolean d(int i5) {
        return (this.f7136j & i5) != 0;
    }

    public final boolean e() {
        View view = this.f7128a;
        return (view.getParent() == null || view.getParent() == this.f7143r) ? false : true;
    }

    public final boolean f() {
        return (this.f7136j & 1) != 0;
    }

    public final boolean g() {
        return (this.f7136j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f7136j & 16) == 0) {
            WeakHashMap weakHashMap = J.P.f1421a;
            if (!this.f7128a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f7136j & 8) != 0;
    }

    public final boolean j() {
        return this.n != null;
    }

    public final boolean k() {
        return (this.f7136j & 256) != 0;
    }

    public final boolean l() {
        return (this.f7136j & 2) != 0;
    }

    public final void m(int i5, boolean z4) {
        if (this.f7131d == -1) {
            this.f7131d = this.f7130c;
        }
        if (this.f7133g == -1) {
            this.f7133g = this.f7130c;
        }
        if (z4) {
            this.f7133g += i5;
        }
        this.f7130c += i5;
        View view = this.f7128a;
        if (view.getLayoutParams() != null) {
            ((C0520K) view.getLayoutParams()).f7077c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f4719l2 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f7136j = 0;
        this.f7130c = -1;
        this.f7131d = -1;
        this.f7132e = -1L;
        this.f7133g = -1;
        this.f7139m = 0;
        this.f7134h = null;
        this.f7135i = null;
        ArrayList arrayList = this.f7137k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f7136j &= KnoxContainerManager.ERROR_INVALID_PASSWORD_RESET_TOKEN;
        this.f7141p = 0;
        this.f7142q = -1;
        RecyclerView.q(this);
    }

    public final void o(boolean z4) {
        int i5 = this.f7139m;
        int i6 = z4 ? i5 - 1 : i5 + 1;
        this.f7139m = i6;
        if (i6 < 0) {
            this.f7139m = 0;
            if (RecyclerView.f4719l2) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z4 && i6 == 1) {
            this.f7136j |= 16;
        } else if (z4 && i6 == 0) {
            this.f7136j &= -17;
        }
        if (RecyclerView.f4720m2) {
            Log.d("SeslRecyclerView", "setIsRecyclable val:" + z4 + ":" + this);
        }
    }

    public final boolean p() {
        return (this.f7136j & 128) != 0;
    }

    public final boolean q() {
        return (this.f7136j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f7130c + " id=" + this.f7132e + ", oldPos=" + this.f7131d + ", pLpos:" + this.f7133g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f7140o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f7136j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f7139m + ")");
        }
        if ((this.f7136j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f7128a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
