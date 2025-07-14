package androidx.versionedparcelable;

import D0.a;
import D0.b;
import D0.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import g4.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C0704b;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public final c f4924d;

    public ParcelImpl(Parcel parcel) throws NoSuchMethodException, SecurityException {
        parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        C0704b c0704b = new C0704b();
        C0704b c0704b2 = new C0704b();
        C0704b c0704b3 = new C0704b();
        new SparseIntArray();
        String string = parcel.readString();
        c cVar = null;
        if (string != null) {
            b bVar = new b(parcel, parcel.dataPosition(), iDataSize, f.c("", "  "), c0704b, c0704b2, c0704b3);
            try {
                Method declaredMethod = (Method) c0704b.getOrDefault(string, null);
                if (declaredMethod == null) {
                    System.currentTimeMillis();
                    declaredMethod = Class.forName(string, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
                    c0704b.put(string, declaredMethod);
                }
                cVar = (c) declaredMethod.invoke(null, bVar);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
            } catch (InvocationTargetException e8) {
                if (!(e8.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
                }
                throw ((RuntimeException) e8.getCause());
            }
        }
        this.f4924d = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        C0704b c0704b = new C0704b();
        C0704b c0704b2 = new C0704b();
        C0704b c0704b3 = new C0704b();
        b bVar = new b(parcel, iDataPosition, iDataSize, "", c0704b, c0704b2, c0704b3);
        Parcel parcel2 = bVar.f462d;
        c cVar = this.f4924d;
        if (cVar == null) {
            parcel2.writeString(null);
            return;
        }
        try {
            parcel2.writeString(bVar.a(cVar.getClass()).getName());
            int iDataPosition2 = parcel2.dataPosition();
            int i6 = bVar.f466i;
            if (i6 == bVar.f463e) {
                i6 = bVar.f;
            }
            b bVar2 = new b(parcel2, iDataPosition2, i6, A3.f.p(new StringBuilder(), bVar.f464g, "  "), c0704b, c0704b2, c0704b3);
            try {
                bVar.b(cVar.getClass()).invoke(null, cVar, bVar2);
                int i7 = bVar2.f465h;
                if (i7 >= 0) {
                    int i8 = bVar2.f461c.get(i7);
                    Parcel parcel3 = bVar2.f462d;
                    int iDataPosition3 = parcel3.dataPosition();
                    parcel3.setDataPosition(i8);
                    parcel3.writeInt(iDataPosition3 - i8);
                    parcel3.setDataPosition(iDataPosition3);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
            } catch (InvocationTargetException e8) {
                if (!(e8.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
                }
                throw ((RuntimeException) e8.getCause());
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e9);
        }
    }
}
