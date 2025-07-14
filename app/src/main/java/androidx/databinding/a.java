package androidx.databinding;

/* loaded from: classes.dex */
public abstract class a implements j {
    private transient p mCallbacks;

    @Override // androidx.databinding.j
    public void addOnPropertyChangedCallback(i iVar) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new p(p.f3632i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCallbacks.a(iVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                p pVar = this.mCallbacks;
                if (pVar == null) {
                    return;
                }
                pVar.c(this, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i5) {
        synchronized (this) {
            try {
                p pVar = this.mCallbacks;
                if (pVar == null) {
                    return;
                }
                pVar.c(this, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.j
    public void removeOnPropertyChangedCallback(i iVar) {
        synchronized (this) {
            try {
                p pVar = this.mCallbacks;
                if (pVar == null) {
                    return;
                }
                pVar.f(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
