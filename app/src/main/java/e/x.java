package e;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import i.AbstractC0476b;
import j.MenuC0492i;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final Window.Callback f6621d;

    /* renamed from: e, reason: collision with root package name */
    public J f6622e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6623g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B f6625i;

    public x(B b2, Window.Callback callback) {
        this.f6625i = b2;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f6621d = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    public final boolean b(int i5, Menu menu) {
        return this.f6621d.onMenuOpened(i5, menu);
    }

    public final void c(int i5, Menu menu) {
        this.f6621d.onPanelClosed(i5, menu);
    }

    public final void d(List list, Menu menu, int i5) {
        i.n.a(this.f6621d, list, menu, i5);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6621d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.f6623g;
        Window.Callback callback = this.f6621d;
        return z4 ? callback.dispatchKeyEvent(keyEvent) : this.f6625i.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f6621d.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        B b2 = this.f6625i;
        b2.B();
        AbstractC0398a abstractC0398a = b2.f6472p;
        if (abstractC0398a != null && abstractC0398a.i(keyCode, keyEvent)) {
            return true;
        }
        A a5 = b2.f6448N;
        if (a5 != null && b2.G(a5, keyEvent.getKeyCode(), keyEvent)) {
            A a6 = b2.f6448N;
            if (a6 == null) {
                return true;
            }
            a6.f6432l = true;
            return true;
        }
        if (b2.f6448N == null) {
            A A4 = b2.A(0);
            b2.H(A4, keyEvent);
            boolean zG = b2.G(A4, keyEvent.getKeyCode(), keyEvent);
            A4.f6431k = false;
            if (zG) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6621d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6621d.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6621d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6621d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6621d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6621d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.f6621d.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0 || (menu instanceof MenuC0492i)) {
            return this.f6621d.onCreatePanelMenu(i5, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i5) {
        J j5 = this.f6622e;
        if (j5 != null) {
            View view = i5 == 0 ? new View(j5.f6497d.f6498a.f7507a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f6621d.onCreatePanelView(i5);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6621d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        return this.f6621d.onMenuItemSelected(i5, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i5, Menu menu) {
        b(i5, menu);
        B b2 = this.f6625i;
        if (i5 == 108) {
            b2.B();
            AbstractC0398a abstractC0398a = b2.f6472p;
            if (abstractC0398a != null) {
                abstractC0398a.c(true);
            }
        } else {
            b2.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i5, Menu menu) {
        if (this.f6624h) {
            this.f6621d.onPanelClosed(i5, menu);
            return;
        }
        c(i5, menu);
        B b2 = this.f6625i;
        if (i5 == 108) {
            b2.B();
            AbstractC0398a abstractC0398a = b2.f6472p;
            if (abstractC0398a != null) {
                abstractC0398a.c(false);
                return;
            }
            return;
        }
        if (i5 != 0) {
            b2.getClass();
            return;
        }
        A A4 = b2.A(i5);
        if (A4.f6433m) {
            b2.t(A4, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        i.o.a(this.f6621d, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        MenuC0492i menuC0492i = menu instanceof MenuC0492i ? (MenuC0492i) menu : null;
        if (i5 == 0 && menuC0492i == null) {
            return false;
        }
        if (menuC0492i != null) {
            menuC0492i.f6976x = true;
        }
        J j5 = this.f6622e;
        if (j5 != null && i5 == 0) {
            K k5 = j5.f6497d;
            if (!k5.f6501d) {
                k5.f6498a.f7517l = true;
                k5.f6501d = true;
            }
        }
        boolean zOnPreparePanel = this.f6621d.onPreparePanel(i5, view, menu);
        if (menuC0492i != null) {
            menuC0492i.f6976x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i5) {
        MenuC0492i menuC0492i = this.f6625i.A(0).f6428h;
        if (menuC0492i != null) {
            d(list, menuC0492i, i5);
        } else {
            d(list, menu, i5);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.m.a(this.f6621d, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6621d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.f6621d.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        B b2 = this.f6625i;
        b2.getClass();
        if (i5 != 0) {
            return i.m.b(this.f6621d, callback, i5);
        }
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(b2.f6469l, callback);
        AbstractC0476b abstractC0476bO = b2.o(qVar);
        if (abstractC0476bO != null) {
            return qVar.s(abstractC0476bO);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6621d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
