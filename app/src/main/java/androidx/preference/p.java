package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class p implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final Preference f4674d;

    public p(Preference preference) {
        this.f4674d = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f4674d;
        CharSequence charSequenceG = preference.g();
        if (!preference.f4583F || TextUtils.isEmpty(charSequenceG)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceG);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f4674d;
        ClipboardManager clipboardManager = (ClipboardManager) preference.f4601d.getSystemService("clipboard");
        CharSequence charSequenceG = preference.g();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceG));
        Context context = preference.f4601d;
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceG), 0).show();
        return true;
    }
}
