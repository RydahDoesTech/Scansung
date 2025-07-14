package C0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import o.C0704b;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f291a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f292b;

    /* renamed from: c, reason: collision with root package name */
    public float f293c;

    /* renamed from: d, reason: collision with root package name */
    public float f294d;

    /* renamed from: e, reason: collision with root package name */
    public float f295e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f296g;

    /* renamed from: h, reason: collision with root package name */
    public float f297h;

    /* renamed from: i, reason: collision with root package name */
    public float f298i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f299j;

    /* renamed from: k, reason: collision with root package name */
    public String f300k;

    public j() {
        this.f291a = new Matrix();
        this.f292b = new ArrayList();
        this.f293c = 0.0f;
        this.f294d = 0.0f;
        this.f295e = 0.0f;
        this.f = 1.0f;
        this.f296g = 1.0f;
        this.f297h = 0.0f;
        this.f298i = 0.0f;
        this.f299j = new Matrix();
        this.f300k = null;
    }

    @Override // C0.k
    public final boolean a() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f292b;
            if (i5 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i5)).a()) {
                return true;
            }
            i5++;
        }
    }

    @Override // C0.k
    public final boolean b(int[] iArr) {
        int i5 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f292b;
            if (i5 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i5)).b(iArr);
            i5++;
        }
    }

    public final void c() {
        Matrix matrix = this.f299j;
        matrix.reset();
        matrix.postTranslate(-this.f294d, -this.f295e);
        matrix.postScale(this.f, this.f296g);
        matrix.postRotate(this.f293c, 0.0f, 0.0f);
        matrix.postTranslate(this.f297h + this.f294d, this.f298i + this.f295e);
    }

    public String getGroupName() {
        return this.f300k;
    }

    public Matrix getLocalMatrix() {
        return this.f299j;
    }

    public float getPivotX() {
        return this.f294d;
    }

    public float getPivotY() {
        return this.f295e;
    }

    public float getRotation() {
        return this.f293c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f296g;
    }

    public float getTranslateX() {
        return this.f297h;
    }

    public float getTranslateY() {
        return this.f298i;
    }

    public void setPivotX(float f) {
        if (f != this.f294d) {
            this.f294d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f295e) {
            this.f295e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f293c) {
            this.f293c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f296g) {
            this.f296g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f297h) {
            this.f297h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f298i) {
            this.f298i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(j jVar, C0704b c0704b) {
        h hVar;
        this.f291a = new Matrix();
        this.f292b = new ArrayList();
        this.f293c = 0.0f;
        this.f294d = 0.0f;
        this.f295e = 0.0f;
        this.f = 1.0f;
        this.f296g = 1.0f;
        this.f297h = 0.0f;
        this.f298i = 0.0f;
        Matrix matrix = new Matrix();
        this.f299j = matrix;
        this.f300k = null;
        this.f293c = jVar.f293c;
        this.f294d = jVar.f294d;
        this.f295e = jVar.f295e;
        this.f = jVar.f;
        this.f296g = jVar.f296g;
        this.f297h = jVar.f297h;
        this.f298i = jVar.f298i;
        String str = jVar.f300k;
        this.f300k = str;
        if (str != null) {
            c0704b.put(str, this);
        }
        matrix.set(jVar.f299j);
        ArrayList arrayList = jVar.f292b;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Object obj = arrayList.get(i5);
            if (obj instanceof j) {
                this.f292b.add(new j((j) obj, c0704b));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f283e = 0.0f;
                    iVar2.f284g = 1.0f;
                    iVar2.f285h = 1.0f;
                    iVar2.f286i = 0.0f;
                    iVar2.f287j = 1.0f;
                    iVar2.f288k = 0.0f;
                    iVar2.f289l = Paint.Cap.BUTT;
                    iVar2.f290m = Paint.Join.MITER;
                    iVar2.n = 4.0f;
                    iVar2.f282d = iVar.f282d;
                    iVar2.f283e = iVar.f283e;
                    iVar2.f284g = iVar.f284g;
                    iVar2.f = iVar.f;
                    iVar2.f303c = iVar.f303c;
                    iVar2.f285h = iVar.f285h;
                    iVar2.f286i = iVar.f286i;
                    iVar2.f287j = iVar.f287j;
                    iVar2.f288k = iVar.f288k;
                    iVar2.f289l = iVar.f289l;
                    iVar2.f290m = iVar.f290m;
                    iVar2.n = iVar.n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f292b.add(hVar);
                Object obj2 = hVar.f302b;
                if (obj2 != null) {
                    c0704b.put(obj2, hVar);
                }
            }
        }
    }
}
