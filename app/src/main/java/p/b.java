package P;

import A3.f;
import E0.i;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.s1;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2102d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2103e;
    public Cursor f;

    /* renamed from: g, reason: collision with root package name */
    public int f2104g;

    /* renamed from: h, reason: collision with root package name */
    public a f2105h;

    /* renamed from: i, reason: collision with root package name */
    public i f2106i;

    /* renamed from: j, reason: collision with root package name */
    public c f2107j;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f2105h;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                i iVar = this.f2106i;
                if (iVar != null) {
                    cursor2.unregisterDataSetObserver(iVar);
                }
            }
            this.f = cursor;
            if (cursor != null) {
                a aVar2 = this.f2105h;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                i iVar2 = this.f2106i;
                if (iVar2 != null) {
                    cursor.registerDataSetObserver(iVar2);
                }
                this.f2104g = cursor.getColumnIndexOrThrow("_id");
                this.f2102d = true;
                notifyDataSetChanged();
            } else {
                this.f2104g = -1;
                this.f2102d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f2102d || (cursor = this.f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f2102d) {
            return null;
        }
        this.f.moveToPosition(i5);
        if (view == null) {
            s1 s1Var = (s1) this;
            view = s1Var.f7801m.inflate(s1Var.f7800l, viewGroup, false);
        }
        a(view, this.f);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f2107j == null) {
            c cVar = new c();
            cVar.f2108a = this;
            this.f2107j = cVar;
        }
        return this.f2107j;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i5) {
        Cursor cursor;
        if (!this.f2102d || (cursor = this.f) == null) {
            return null;
        }
        cursor.moveToPosition(i5);
        return this.f;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        Cursor cursor;
        if (this.f2102d && (cursor = this.f) != null && cursor.moveToPosition(i5)) {
            return this.f.getLong(this.f2104g);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f2102d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f.moveToPosition(i5)) {
            throw new IllegalStateException(f.l(i5, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f);
        return view;
    }
}
