package D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import j.ActionProviderVisibilityListenerC0495l;

/* loaded from: classes.dex */
public interface a extends MenuItem {
    default void a() {
    }

    a b(ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l);

    ActionProviderVisibilityListenerC0495l c();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i5);

    @Override // android.view.MenuItem
    a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i5);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c5, int i5, int i6);

    @Override // android.view.MenuItem
    a setTooltipText(CharSequence charSequence);
}
