package k;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620f1 extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7662d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0611c1 f7663e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f7664g;

    /* renamed from: h, reason: collision with root package name */
    public int f7665h;

    public final void a() {
        ArrayList arrayList = this.f7662d;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            ((C0614d1) arrayList.get(i5)).a(i5 == this.f7665h);
            i5++;
        }
    }

    public final void b(int i5) {
        if (i5 >= 0) {
            ArrayList arrayList = this.f7662d;
            if (i5 >= arrayList.size()) {
                return;
            }
            removeView((C0614d1) arrayList.remove(i5));
            if (this.f7665h >= arrayList.size()) {
                setSelectedPosition(this.f7665h - 1);
            } else {
                a();
            }
        }
    }

    public final Drawable getDefaultCircle() {
        return this.f;
    }

    public final Drawable getSelectCircle() {
        return this.f7664g;
    }

    public final int getSelectedPosition() {
        return this.f7665h;
    }

    public final int getSize() {
        return this.f7662d.size();
    }

    public final void setDefaultCircle(Drawable drawable) {
        Iterator it = this.f7662d.iterator();
        while (it.hasNext()) {
            C0614d1 c0614d1 = (C0614d1) it.next();
            c0614d1.f7656d = drawable;
            c0614d1.a(c0614d1.f);
        }
        this.f = drawable;
    }

    public final void setOnItemClickListener(InterfaceC0611c1 interfaceC0611c1) {
        AbstractC0219i.e("itemClickListener", interfaceC0611c1);
        this.f7663e = interfaceC0611c1;
        Iterator it = this.f7662d.iterator();
        while (it.hasNext()) {
            ((C0614d1) it.next()).setOnClickListener(new ViewOnClickListenerC0608b1(interfaceC0611c1, this, 0));
        }
    }

    public final void setSelectCircle(Drawable drawable) {
        Iterator it = this.f7662d.iterator();
        while (it.hasNext()) {
            C0614d1 c0614d1 = (C0614d1) it.next();
            c0614d1.f7657e = drawable;
            c0614d1.a(c0614d1.f);
        }
        this.f7664g = drawable;
    }

    public final void setSelectedPosition(int i5) {
        if (i5 < 0) {
            i5 = 0;
        } else {
            ArrayList arrayList = this.f7662d;
            if (i5 >= arrayList.size()) {
                i5 = arrayList.size() - 1;
            }
        }
        this.f7665h = i5;
        a();
    }
}
