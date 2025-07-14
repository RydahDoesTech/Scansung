package j;

import J.S;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import z.AbstractC0938a;

/* renamed from: j.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0492i implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f6954y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f6955a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6956b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6957c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6958d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0490g f6959e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6960g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6961h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6962i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6963j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6964k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6966m;
    public Drawable n;

    /* renamed from: o, reason: collision with root package name */
    public View f6967o;

    /* renamed from: v, reason: collision with root package name */
    public C0494k f6974v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6976x;

    /* renamed from: l, reason: collision with root package name */
    public int f6965l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6968p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6969q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6970r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6971s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f6972t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f6973u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f6975w = false;

    public MenuC0492i(Context context) {
        boolean z4 = false;
        this.f6955a = context;
        Resources resources = context.getResources();
        this.f6956b = resources;
        this.f = new ArrayList();
        this.f6960g = new ArrayList();
        this.f6961h = true;
        this.f6962i = new ArrayList();
        this.f6963j = new ArrayList();
        this.f6964k = true;
        if (resources.getConfiguration().keyboard != 1 && S.b(ViewConfiguration.get(context))) {
            z4 = true;
        }
        this.f6958d = z4;
    }

    public final C0494k a(int i5, int i6, int i7, CharSequence charSequence) {
        int i8;
        int i9 = ((-65536) & i7) >> 16;
        if (i9 < 0 || i9 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i10 = (f6954y[i9] << 16) | (65535 & i7);
        C0494k c0494k = new C0494k(this, i5, i6, i7, i10, charSequence, this.f6965l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i8 = 0;
                break;
            }
            if (((C0494k) arrayList.get(size)).f6985d <= i10) {
                i8 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i8, c0494k);
        p(true);
        return c0494k;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        int i9;
        PackageManager packageManager = this.f6955a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i8 & 1) == 0) {
            removeGroup(i5);
        }
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i11 < 0 ? intent : intentArr[i11]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0494k c0494kA = a(i5, i6, i7, resolveInfo.loadLabel(packageManager));
            c0494kA.setIcon(resolveInfo.loadIcon(packageManager));
            c0494kA.f6987g = intent2;
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = c0494kA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0504u interfaceC0504u, Context context) {
        this.f6973u.add(new WeakReference(interfaceC0504u));
        interfaceC0504u.c(context, this);
        this.f6964k = true;
    }

    public final void c(boolean z4) {
        if (this.f6971s) {
            return;
        }
        this.f6971s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6973u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0504u interfaceC0504u = (InterfaceC0504u) weakReference.get();
            if (interfaceC0504u == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0504u.a(this, z4);
            }
        }
        this.f6971s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0494k c0494k = this.f6974v;
        if (c0494k != null) {
            d(c0494k);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.f6966m = null;
        this.f6967o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0494k c0494k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6973u;
        boolean zG = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f6974v == c0494k) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0504u interfaceC0504u = (InterfaceC0504u) weakReference.get();
                if (interfaceC0504u == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG = interfaceC0504u.g(c0494k);
                    if (zG) {
                        break;
                    }
                }
            }
            v();
            if (zG) {
                this.f6974v = null;
            }
        }
        return zG;
    }

    public boolean e(MenuC0492i menuC0492i, MenuItem menuItem) {
        InterfaceC0490g interfaceC0490g = this.f6959e;
        return interfaceC0490g != null && interfaceC0490g.d(menuC0492i, menuItem);
    }

    public boolean f(C0494k c0494k) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6973u;
        boolean zE = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0504u interfaceC0504u = (InterfaceC0504u) weakReference.get();
            if (interfaceC0504u == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zE = interfaceC0504u.e(c0494k);
                if (zE) {
                    break;
                }
            }
        }
        v();
        if (zE) {
            this.f6974v = c0494k;
        }
        return zE;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i5) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0494k c0494k = (C0494k) arrayList.get(i6);
            if (c0494k.f6982a == i5) {
                return c0494k;
            }
            if (c0494k.hasSubMenu() && (menuItemFindItem = c0494k.f6994o.findItem(i5)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final C0494k g(int i5, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6972t;
        arrayList.clear();
        h(arrayList, i5, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0494k) arrayList.get(0);
        }
        boolean zN = n();
        for (int i6 = 0; i6 < size; i6++) {
            C0494k c0494k = (C0494k) arrayList.get(i6);
            char c2 = zN ? c0494k.f6990j : c0494k.f6988h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zN && c2 == '\b' && i5 == 67))) {
                return c0494k;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i5) {
        return (MenuItem) this.f.get(i5);
    }

    public final void h(ArrayList arrayList, int i5, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i5 == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0494k c0494k = (C0494k) arrayList2.get(i6);
                if (c0494k.hasSubMenu()) {
                    c0494k.f6994o.h(arrayList, i5, keyEvent);
                }
                char c2 = zN ? c0494k.f6990j : c0494k.f6988h;
                if ((modifiers & 69647) == ((zN ? c0494k.f6991k : c0494k.f6989i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zN && c2 == '\b' && i5 == 67)) && c0494k.isEnabled()) {
                        arrayList.add(c0494k);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f6976x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((C0494k) arrayList.get(i5)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f6964k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f6973u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zD = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0504u interfaceC0504u = (InterfaceC0504u) weakReference.get();
                if (interfaceC0504u == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= interfaceC0504u.d();
                }
            }
            ArrayList arrayList = this.f6962i;
            ArrayList arrayList2 = this.f6963j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0494k c0494k = (C0494k) arrayListL.get(i5);
                    if (c0494k.g()) {
                        arrayList.add(c0494k);
                    } else {
                        arrayList2.add(c0494k);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f6964k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return g(i5, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0492i k() {
        return this;
    }

    public final ArrayList l() {
        boolean z4 = this.f6961h;
        ArrayList arrayList = this.f6960g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0494k c0494k = (C0494k) arrayList2.get(i5);
            if (c0494k.isVisible()) {
                arrayList.add(c0494k);
            }
        }
        this.f6961h = false;
        this.f6964k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f6975w;
    }

    public boolean n() {
        return this.f6957c;
    }

    public boolean o() {
        return this.f6958d;
    }

    public final void p(boolean z4) {
        if (this.f6968p) {
            this.f6969q = true;
            if (z4) {
                this.f6970r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f6961h = true;
            this.f6964k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6973u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0504u interfaceC0504u = (InterfaceC0504u) weakReference.get();
            if (interfaceC0504u == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0504u.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i5, int i6) {
        return q(findItem(i5), null, i6);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        C0494k c0494kG = g(i5, keyEvent);
        boolean zQ = c0494kG != null ? q(c0494kG, null, i6) : false;
        if ((i6 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, j.InterfaceC0504u r8, int r9) {
        /*
            r6 = this;
            j.k r7 = (j.C0494k) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f6995p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            j.i r1 = r7.n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f6987g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f6955a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            j.l r1 = r7.f6979A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f7006a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            j.l r3 = r7.f6979A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f7006a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.f()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            j.A r9 = new j.A
            android.content.Context r5 = r6.f6955a
            r9.<init>(r5, r6, r7)
            r7.f6994o = r9
            java.lang.CharSequence r5 = r7.f6986e
            r9.setHeaderTitle(r5)
        L90:
            j.A r7 = r7.f6994o
            if (r4 == 0) goto L9e
            j.p r9 = r3.f7007b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f7006a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f6973u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.h(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            j.u r4 = (j.InterfaceC0504u) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.h(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.MenuC0492i.q(android.view.MenuItem, j.u, int):boolean");
    }

    public final void r(InterfaceC0504u interfaceC0504u) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6973u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0504u interfaceC0504u2 = (InterfaceC0504u) weakReference.get();
            if (interfaceC0504u2 == null || interfaceC0504u2 == interfaceC0504u) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (((C0494k) arrayList.get(i7)).f6983b == i5) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            int size2 = arrayList.size() - i7;
            while (true) {
                int i8 = i6 + 1;
                if (i6 >= size2 || ((C0494k) arrayList.get(i7)).f6983b != i5) {
                    break;
                }
                if (i7 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i7 < arrayList2.size()) {
                        arrayList2.remove(i7);
                    }
                }
                i6 = i8;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((C0494k) arrayList.get(i6)).f6982a == i5) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i6 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i6);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0483A) item.getSubMenu()).s(bundle);
            }
        }
        int i6 = bundle.getInt("android:menu:expandedactionview");
        if (i6 <= 0 || (menuItemFindItem = findItem(i6)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i5, boolean z4, boolean z5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0494k c0494k = (C0494k) arrayList.get(i6);
            if (c0494k.f6983b == i5) {
                c0494k.f7003x = (c0494k.f7003x & (-5)) | (z5 ? 4 : 0);
                c0494k.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f6975w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i5, boolean z4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0494k c0494k = (C0494k) arrayList.get(i6);
            if (c0494k.f6983b == i5) {
                c0494k.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i5, boolean z4) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            C0494k c0494k = (C0494k) arrayList.get(i6);
            if (c0494k.f6983b == i5) {
                int i7 = c0494k.f7003x;
                int i8 = (i7 & (-9)) | (z4 ? 0 : 8);
                c0494k.f7003x = i8;
                if (i7 != i8) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f6957c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0483A) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i5, CharSequence charSequence, int i6, Drawable drawable, View view) {
        if (view != null) {
            this.f6967o = view;
            this.f6966m = null;
            this.n = null;
        } else {
            if (i5 > 0) {
                this.f6966m = this.f6956b.getText(i5);
            } else if (charSequence != null) {
                this.f6966m = charSequence;
            }
            if (i6 > 0) {
                this.n = AbstractC0938a.b(this.f6955a, i6);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f6967o = null;
        }
        p(false);
    }

    public final void v() {
        this.f6968p = false;
        if (this.f6969q) {
            this.f6969q = false;
            p(this.f6970r);
        }
    }

    public final void w() {
        if (this.f6968p) {
            return;
        }
        this.f6968p = true;
        this.f6969q = false;
        this.f6970r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5) {
        return a(0, 0, 0, this.f6956b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5) {
        return addSubMenu(0, 0, 0, this.f6956b.getString(i5));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return a(i5, i6, i7, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        C0494k c0494kA = a(i5, i6, i7, charSequence);
        SubMenuC0483A subMenuC0483A = new SubMenuC0483A(this.f6955a, this, c0494kA);
        c0494kA.f6994o = subMenuC0483A;
        subMenuC0483A.setHeaderTitle(c0494kA.f6986e);
        return subMenuC0483A;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i6, int i7, int i8) {
        return a(i5, i6, i7, this.f6956b.getString(i8));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return addSubMenu(i5, i6, i7, this.f6956b.getString(i8));
    }
}
