package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.gms.internal.p000firebaseauthapi.P3;
import o.C0713k;

/* renamed from: j.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0507x extends P3 implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0492i f7028c;

    public MenuC0507x(Context context, MenuC0492i menuC0492i) {
        super(context);
        if (menuC0492i == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f7028c = menuC0492i;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f7028c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f7028c.addIntentOptions(i5, i6, i7, componentName, intentArr, intent, i8, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i9 = 0; i9 < length; i9++) {
                menuItemArr[i9] = g(menuItemArr2[i9]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f7028c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0713k c0713k = (C0713k) this.f5381b;
        if (c0713k != null) {
            c0713k.clear();
        }
        this.f7028c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f7028c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i5) {
        return g(this.f7028c.findItem(i5));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i5) {
        return g(this.f7028c.getItem(i5));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f7028c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return this.f7028c.isShortcutKey(i5, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i5, int i6) {
        return this.f7028c.performIdentifierAction(i5, i6);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        return this.f7028c.performShortcut(i5, keyEvent, i6);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i5) {
        if (((C0713k) this.f5381b) != null) {
            int i6 = 0;
            while (true) {
                C0713k c0713k = (C0713k) this.f5381b;
                if (i6 >= c0713k.f) {
                    break;
                }
                if (((D.a) c0713k.h(i6)).getGroupId() == i5) {
                    ((C0713k) this.f5381b).i(i6);
                    i6--;
                }
                i6++;
            }
        }
        this.f7028c.removeGroup(i5);
    }

    @Override // android.view.Menu
    public final void removeItem(int i5) {
        if (((C0713k) this.f5381b) != null) {
            int i6 = 0;
            while (true) {
                C0713k c0713k = (C0713k) this.f5381b;
                if (i6 >= c0713k.f) {
                    break;
                }
                if (((D.a) c0713k.h(i6)).getItemId() == i5) {
                    ((C0713k) this.f5381b).i(i6);
                    break;
                }
                i6++;
            }
        }
        this.f7028c.removeItem(i5);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i5, boolean z4, boolean z5) {
        this.f7028c.setGroupCheckable(i5, z4, z5);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i5, boolean z4) {
        this.f7028c.setGroupEnabled(i5, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i5, boolean z4) {
        this.f7028c.setGroupVisible(i5, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f7028c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7028c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5) {
        return this.f7028c.addSubMenu(i5);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5) {
        return g(this.f7028c.add(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        return this.f7028c.addSubMenu(i5, i6, i7, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return g(this.f7028c.a(i5, i6, i7, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return this.f7028c.addSubMenu(i5, i6, i7, i8);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i5, int i6, int i7, int i8) {
        return g(this.f7028c.add(i5, i6, i7, i8));
    }
}
