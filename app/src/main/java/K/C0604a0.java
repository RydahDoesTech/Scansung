package k;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f7629a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f7630b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f7631c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f7632d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7633e = new int[0];
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f7634g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f7635h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C0604a0(TextView textView) {
        this.f7634g = textView;
        this.f7635h = textView.getContext();
        new Y();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        return !(this.f7634g instanceof C0655u);
    }
}
