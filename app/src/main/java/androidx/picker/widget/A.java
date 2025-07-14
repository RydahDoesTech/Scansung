package androidx.picker.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.samsung.android.knox.net.nap.NetworkAnalyticsConstants;
import com.wssyncmldm.R;
import e1.AbstractC0415a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import r0.AbstractC0808b;

/* loaded from: classes.dex */
public final class A extends AccessibilityNodeProvider {
    public static final /* synthetic */ int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f4038g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4039a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4040b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4041c;

    /* renamed from: d, reason: collision with root package name */
    public int f4042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4043e;

    public A(M m4) {
        this.f4039a = 1;
        this.f4043e = m4;
        this.f4040b = new Rect();
        this.f4041c = new int[2];
        this.f4042d = Integer.MIN_VALUE;
    }

    public static void g(Rect rect, float f5) {
        if (f5 != 1.0f) {
            rect.left = (int) ((rect.left * f5) + 0.5f);
            rect.top = (int) ((rect.top * f5) + 0.5f);
            rect.right = (int) ((rect.right * f5) + 0.5f);
            rect.bottom = (int) ((rect.bottom * f5) + 0.5f);
        }
    }

    public static void h(Rect rect, float f5) {
        if (f5 != 1.0f) {
            rect.left = (int) ((rect.left * f5) + 0.5f);
            rect.top = (int) ((rect.top * f5) + 0.5f);
            rect.right = (int) ((rect.right * f5) + 0.5f);
            rect.bottom = (int) ((rect.bottom * f5) + 0.5f);
        }
    }

    public final AccessibilityNodeInfo a(int i5, int i6, int i7, int i8, int i9, String str) {
        switch (this.f4039a) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                accessibilityNodeInfoObtain.setClassName(Button.class.getName());
                D d5 = (D) this.f4043e;
                accessibilityNodeInfoObtain.setPackageName(d5.f4188a.getPackageName());
                accessibilityNodeInfoObtain.setSource((SeslNumberPicker) d5.f4189b, i5);
                accessibilityNodeInfoObtain.setParent((SeslNumberPicker) d5.f4189b);
                accessibilityNodeInfoObtain.setText(str);
                accessibilityNodeInfoObtain.setTooltipText(d5.f4103d);
                accessibilityNodeInfoObtain.setClickable(true);
                accessibilityNodeInfoObtain.setLongClickable(true);
                accessibilityNodeInfoObtain.setEnabled(((SeslNumberPicker) d5.f4189b).isEnabled());
                Rect rect = this.f4040b;
                rect.set(i6, i7, i8, i9);
                SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
                seslNumberPicker.getClass();
                accessibilityNodeInfoObtain.setVisibleToUser(AbstractC0808b.i(rect, seslNumberPicker));
                accessibilityNodeInfoObtain.setBoundsInParent(rect);
                SeslNumberPicker seslNumberPicker2 = (SeslNumberPicker) d5.f4189b;
                int[] iArr = this.f4041c;
                seslNumberPicker2.getLocationOnScreen(iArr);
                rect.offset(iArr[0], iArr[1]);
                accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                if (this.f4042d != i5) {
                    accessibilityNodeInfoObtain.addAction(64);
                } else {
                    accessibilityNodeInfoObtain.addAction(128);
                }
                if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                    accessibilityNodeInfoObtain.addAction(16);
                }
                return accessibilityNodeInfoObtain;
            default:
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
                accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
                M m4 = (M) this.f4043e;
                accessibilityNodeInfoObtain2.setPackageName(m4.f4188a.getPackageName());
                accessibilityNodeInfoObtain2.setSource((SeslSpinningDatePickerSpinner) m4.f4189b, i5);
                accessibilityNodeInfoObtain2.setParent((SeslSpinningDatePickerSpinner) m4.f4189b);
                accessibilityNodeInfoObtain2.setText(str);
                accessibilityNodeInfoObtain2.setClickable(true);
                accessibilityNodeInfoObtain2.setLongClickable(true);
                accessibilityNodeInfoObtain2.setEnabled(((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled());
                Rect rect2 = this.f4040b;
                rect2.set(i6, i7, i8, i9);
                SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
                seslSpinningDatePickerSpinner.getClass();
                accessibilityNodeInfoObtain2.setVisibleToUser(AbstractC0808b.i(rect2, seslSpinningDatePickerSpinner));
                accessibilityNodeInfoObtain2.setBoundsInParent(rect2);
                SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner2 = (SeslSpinningDatePickerSpinner) m4.f4189b;
                int[] iArr2 = this.f4041c;
                seslSpinningDatePickerSpinner2.getLocationOnScreen(iArr2);
                rect2.offset(iArr2[0], iArr2[1]);
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect2);
                if (this.f4042d != i5) {
                    accessibilityNodeInfoObtain2.addAction(64);
                } else {
                    accessibilityNodeInfoObtain2.addAction(128);
                }
                if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled()) {
                    accessibilityNodeInfoObtain2.addAction(16);
                }
                return accessibilityNodeInfoObtain2;
        }
    }

    public final void b(String str, int i5, ArrayList arrayList) {
        switch (this.f4039a) {
            case 0:
                if (i5 == 1) {
                    String strE = e();
                    if (!TextUtils.isEmpty(strE) && strE.toLowerCase().contains(str)) {
                        arrayList.add(createAccessibilityNodeInfo(1));
                        break;
                    }
                } else if (i5 == 2) {
                    Editable text = ((D) this.f4043e).f4105e.getText();
                    if (!TextUtils.isEmpty(text) && text.toString().toLowerCase().contains(str)) {
                        arrayList.add(createAccessibilityNodeInfo(2));
                        break;
                    }
                } else if (i5 == 3) {
                    String strF = f();
                    if (!TextUtils.isEmpty(strF) && strF.toLowerCase().contains(str)) {
                        arrayList.add(createAccessibilityNodeInfo(3));
                        break;
                    }
                }
                break;
            default:
                if (i5 == 1) {
                    String strE2 = e();
                    if (!TextUtils.isEmpty(strE2) && strE2.toLowerCase().contains(str)) {
                        arrayList.add(createAccessibilityNodeInfo(1));
                        break;
                    }
                } else if (i5 == 2) {
                    String strC = c();
                    if (!TextUtils.isEmpty(strC) && strC.toLowerCase().contains(str)) {
                        arrayList.add(createAccessibilityNodeInfo(2));
                        break;
                    }
                } else if (i5 == 3) {
                    String strF2 = f();
                    if (!TextUtils.isEmpty(strF2) && strF2.toLowerCase().contains(str)) {
                        arrayList.add(createAccessibilityNodeInfo(3));
                        break;
                    }
                }
                break;
        }
    }

    public String c() {
        M m4 = (M) this.f4043e;
        Calendar calendar = (Calendar) m4.f4254m.clone();
        m4.getClass();
        if (calendar.compareTo(m4.f4253l) > 0) {
            return null;
        }
        m4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(m4.d(calendar));
        sb.append(", ");
        return A3.f.p(sb, m4.f4238c, ", ");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) throws NoSuchFieldException {
        switch (this.f4039a) {
            case 0:
                D d5 = (D) this.f4043e;
                int left = ((SeslNumberPicker) d5.f4189b).getLeft();
                int right = ((SeslNumberPicker) d5.f4189b).getRight();
                int top = ((SeslNumberPicker) d5.f4189b).getTop();
                int bottom = ((SeslNumberPicker) d5.f4189b).getBottom();
                int scrollX = ((SeslNumberPicker) d5.f4189b).getScrollX();
                int scrollY = ((SeslNumberPicker) d5.f4189b).getScrollY();
                if (d5.f4101c0 != -1 || d5.f4094Z != Integer.MIN_VALUE) {
                    int[] iArr = this.f4041c;
                    Rect rect = this.f4040b;
                    if (i5 == -1) {
                        int i6 = (right - left) + scrollX;
                        int i7 = (bottom - top) + scrollY;
                        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                        accessibilityNodeInfoObtain.setClassName(NumberPicker.class.getName());
                        accessibilityNodeInfoObtain.setPackageName(d5.f4188a.getPackageName());
                        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
                        accessibilityNodeInfoObtain.setSource(seslNumberPicker);
                        if (d5.f4077Q || d5.f4118o > d5.f4117m) {
                            accessibilityNodeInfoObtain.addChild(seslNumberPicker, 1);
                        }
                        accessibilityNodeInfoObtain.addChild(seslNumberPicker, 2);
                        if (d5.f4077Q || d5.f4118o < d5.n) {
                            accessibilityNodeInfoObtain.addChild(seslNumberPicker, 3);
                        }
                        accessibilityNodeInfoObtain.setParent((View) seslNumberPicker.getParentForAccessibility());
                        accessibilityNodeInfoObtain.setEnabled(seslNumberPicker.isEnabled());
                        accessibilityNodeInfoObtain.setScrollable(true);
                        float fU = AbstractC0415a.u(d5.f4188a.getResources());
                        rect.set(scrollX, scrollY, i6, i7);
                        g(rect, fU);
                        accessibilityNodeInfoObtain.setBoundsInParent(rect);
                        accessibilityNodeInfoObtain.setVisibleToUser(AbstractC0808b.i(null, seslNumberPicker));
                        seslNumberPicker.getLocationOnScreen(iArr);
                        rect.offset(iArr[0], iArr[1]);
                        g(rect, fU);
                        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
                        if (this.f4042d != -1) {
                            accessibilityNodeInfoObtain.addAction(64);
                        } else {
                            accessibilityNodeInfoObtain.addAction(128);
                        }
                        if (seslNumberPicker.isEnabled()) {
                            if (d5.f4077Q || d5.f4118o < d5.n) {
                                accessibilityNodeInfoObtain.addAction(4096);
                            }
                            if (d5.f4077Q || d5.f4118o > d5.f4117m) {
                                accessibilityNodeInfoObtain.addAction(8192);
                            }
                        }
                        return accessibilityNodeInfoObtain;
                    }
                    int i8 = d5.f4081S;
                    if (i5 == 1) {
                        return a(1, scrollX, scrollY, (right - left) + scrollX, d5.f4090X + i8, e());
                    }
                    if (i5 == 2) {
                        int i9 = d5.f4090X + i8;
                        int i10 = (right - left) + scrollX;
                        int i11 = d5.f4092Y - i8;
                        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = d5.f4105e.createAccessibilityNodeInfo();
                        SeslNumberPicker seslNumberPicker2 = (SeslNumberPicker) d5.f4189b;
                        accessibilityNodeInfoCreateAccessibilityNodeInfo.setSource(seslNumberPicker2, 2);
                        if (this.f4042d != 2) {
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setAccessibilityFocused(false);
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(64);
                        } else {
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setAccessibilityFocused(true);
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(128);
                        }
                        if (!d5.g0) {
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setClassName(TextView.class.getName());
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setText(d(false));
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setTooltipText(d5.f4103d);
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setSelected(true);
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setAccessibilityFocused(false);
                        } else if (d5.f4128v != null) {
                            accessibilityNodeInfoCreateAccessibilityNodeInfo.setText(d(false));
                        }
                        rect.set(scrollX, i9, i10, i11);
                        seslNumberPicker2.getClass();
                        accessibilityNodeInfoCreateAccessibilityNodeInfo.setVisibleToUser(AbstractC0808b.i(rect, seslNumberPicker2));
                        accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInParent(rect);
                        seslNumberPicker2.getLocationOnScreen(iArr);
                        rect.offset(iArr[0], iArr[1]);
                        accessibilityNodeInfoCreateAccessibilityNodeInfo.setBoundsInScreen(rect);
                        return accessibilityNodeInfoCreateAccessibilityNodeInfo;
                    }
                    if (i5 == 3) {
                        return a(3, scrollX, d5.f4092Y - i8, (right - left) + scrollX, (bottom - top) + scrollY, f());
                    }
                }
                AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo2 = super.createAccessibilityNodeInfo(i5);
                return accessibilityNodeInfoCreateAccessibilityNodeInfo2 == null ? AccessibilityNodeInfo.obtain() : accessibilityNodeInfoCreateAccessibilityNodeInfo2;
            default:
                M m4 = (M) this.f4043e;
                int left2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getLeft();
                int right2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getRight();
                int top2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getTop();
                int bottom2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getBottom();
                int scrollX2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getScrollX();
                int scrollY2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getScrollY();
                if (m4.f4228S != -1 || m4.f4224O != Integer.MIN_VALUE) {
                    int[] iArr2 = this.f4041c;
                    Rect rect2 = this.f4040b;
                    if (i5 == -1) {
                        int i12 = (right2 - left2) + scrollX2;
                        int i13 = (bottom2 - top2) + scrollY2;
                        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
                        accessibilityNodeInfoObtain2.setClassName(SeslSpinningDatePickerSpinner.class.getName());
                        accessibilityNodeInfoObtain2.setPackageName(m4.f4188a.getPackageName());
                        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
                        accessibilityNodeInfoObtain2.setSource(seslSpinningDatePickerSpinner);
                        m4.getClass();
                        if (m4.f4254m.compareTo(m4.f4252k) > 0) {
                            accessibilityNodeInfoObtain2.addChild(seslSpinningDatePickerSpinner, 1);
                        }
                        accessibilityNodeInfoObtain2.addChild(seslSpinningDatePickerSpinner, 2);
                        m4.getClass();
                        if (m4.f4254m.compareTo(m4.f4253l) < 0) {
                            accessibilityNodeInfoObtain2.addChild(seslSpinningDatePickerSpinner, 3);
                        }
                        accessibilityNodeInfoObtain2.setParent((View) seslSpinningDatePickerSpinner.getParentForAccessibility());
                        accessibilityNodeInfoObtain2.setEnabled(seslSpinningDatePickerSpinner.isEnabled());
                        accessibilityNodeInfoObtain2.setScrollable(true);
                        float fU2 = AbstractC0415a.u(m4.f4188a.getResources());
                        rect2.set(scrollX2, scrollY2, i12, i13);
                        h(rect2, fU2);
                        accessibilityNodeInfoObtain2.setBoundsInParent(rect2);
                        accessibilityNodeInfoObtain2.setVisibleToUser(AbstractC0808b.i(null, seslSpinningDatePickerSpinner));
                        seslSpinningDatePickerSpinner.getLocationOnScreen(iArr2);
                        rect2.offset(iArr2[0], iArr2[1]);
                        h(rect2, fU2);
                        accessibilityNodeInfoObtain2.setBoundsInScreen(rect2);
                        if (this.f4042d != -1) {
                            accessibilityNodeInfoObtain2.addAction(64);
                        } else {
                            accessibilityNodeInfoObtain2.addAction(128);
                        }
                        if (seslSpinningDatePickerSpinner.isEnabled()) {
                            Calendar calendar = m4.f4254m;
                            if (calendar.compareTo(m4.f4253l) < 0) {
                                accessibilityNodeInfoObtain2.addAction(4096);
                            }
                            if (calendar.compareTo(m4.f4252k) > 0) {
                                accessibilityNodeInfoObtain2.addAction(8192);
                            }
                        }
                        return accessibilityNodeInfoObtain2;
                    }
                    int i14 = m4.f4215I;
                    if (i5 == 1) {
                        return a(1, scrollX2, scrollY2, (right2 - left2) + scrollX2, m4.f4222M + i14, e());
                    }
                    if (i5 == 2) {
                        int i15 = m4.f4222M + i14;
                        int i16 = (right2 - left2) + scrollX2;
                        int i17 = m4.f4223N - i14;
                        AccessibilityNodeInfo accessibilityNodeInfoObtain3 = AccessibilityNodeInfo.obtain();
                        accessibilityNodeInfoObtain3.setPackageName(m4.f4188a.getPackageName());
                        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner2 = (SeslSpinningDatePickerSpinner) m4.f4189b;
                        accessibilityNodeInfoObtain3.setSource(seslSpinningDatePickerSpinner2, 2);
                        accessibilityNodeInfoObtain3.setParent(seslSpinningDatePickerSpinner2);
                        accessibilityNodeInfoObtain3.setText(c() + m4.f4188a.getString(R.string.sesl_date_picker_switch_to_calendar_description));
                        accessibilityNodeInfoObtain3.setClickable(true);
                        accessibilityNodeInfoObtain3.setEnabled(seslSpinningDatePickerSpinner2.isEnabled());
                        if (this.f4042d != 2) {
                            accessibilityNodeInfoObtain3.setAccessibilityFocused(false);
                            accessibilityNodeInfoObtain3.addAction(64);
                        } else {
                            accessibilityNodeInfoObtain3.setAccessibilityFocused(true);
                            accessibilityNodeInfoObtain3.addAction(128);
                        }
                        rect2.set(scrollX2, i15, i16, i17);
                        accessibilityNodeInfoObtain3.setVisibleToUser(AbstractC0808b.i(rect2, seslSpinningDatePickerSpinner2));
                        accessibilityNodeInfoObtain3.setBoundsInParent(rect2);
                        seslSpinningDatePickerSpinner2.getLocationOnScreen(iArr2);
                        rect2.offset(iArr2[0], iArr2[1]);
                        accessibilityNodeInfoObtain3.setBoundsInScreen(rect2);
                        return accessibilityNodeInfoObtain3;
                    }
                    if (i5 == 3) {
                        return a(3, scrollX2, m4.f4223N - i14, (right2 - left2) + scrollX2, (bottom2 - top2) + scrollY2, f());
                    }
                }
                AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo3 = super.createAccessibilityNodeInfo(i5);
                return accessibilityNodeInfoCreateAccessibilityNodeInfo3 == null ? AccessibilityNodeInfo.obtain() : accessibilityNodeInfoCreateAccessibilityNodeInfo3;
        }
    }

    public String d(boolean z4) {
        String strF;
        D d5 = (D) this.f4043e;
        int i5 = d5.f4118o;
        if (d5.f4077Q) {
            i5 = d5.i(i5);
        }
        if (i5 <= d5.n) {
            r rVar = d5.f4128v;
            if (rVar != null) {
                strF = ((C0176n) rVar).f4484a.f4411v[i5];
            } else {
                String[] strArr = d5.f4116l;
                strF = strArr == null ? d5.f(i5) : strArr[i5 - d5.f4117m];
            }
        } else {
            strF = null;
        }
        if (strF == null || !z4) {
            return strF;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strF);
        sb.append(", ");
        return A3.f.p(sb, d5.f4103d, ", ");
    }

    public final String e() {
        switch (this.f4039a) {
            case 0:
                D d5 = (D) this.f4043e;
                int i5 = d5.f4119p;
                if (i5 == 1 || !d5.f4120q) {
                    i5 = 1;
                }
                int i6 = d5.f4118o - i5;
                if (d5.f4077Q) {
                    i6 = d5.i(i6);
                }
                int i7 = d5.f4117m;
                if (i6 < i7) {
                    return null;
                }
                r rVar = d5.f4128v;
                if (rVar != null) {
                    return ((C0176n) rVar).f4484a.f4411v[i6];
                }
                String[] strArr = d5.f4116l;
                return strArr == null ? d5.f(i6) : strArr[i6 - i7];
            default:
                M m4 = (M) this.f4043e;
                Calendar calendar = (Calendar) m4.f4254m.clone();
                calendar.add(5, -1);
                m4.getClass();
                if (calendar.compareTo(m4.f4252k) < 0) {
                    return null;
                }
                m4.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(m4.d(calendar));
                sb.append(", ");
                return A3.f.p(sb, m4.f4238c, ", ");
        }
    }

    public final String f() {
        switch (this.f4039a) {
            case 0:
                D d5 = (D) this.f4043e;
                int i5 = d5.f4119p;
                if (i5 == 1 || !d5.f4120q) {
                    i5 = 1;
                }
                int i6 = d5.f4118o + i5;
                if (d5.f4077Q) {
                    i6 = d5.i(i6);
                }
                if (i6 > d5.n) {
                    return null;
                }
                r rVar = d5.f4128v;
                if (rVar != null) {
                    return ((C0176n) rVar).f4484a.f4411v[i6];
                }
                String[] strArr = d5.f4116l;
                return strArr == null ? d5.f(i6) : strArr[i6 - d5.f4117m];
            default:
                M m4 = (M) this.f4043e;
                Calendar calendar = (Calendar) m4.f4254m.clone();
                calendar.add(5, 1);
                m4.getClass();
                if (calendar.compareTo(m4.f4253l) > 0) {
                    return null;
                }
                m4.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(m4.d(calendar));
                sb.append(", ");
                return A3.f.p(sb, m4.f4238c, ", ");
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i5) {
        switch (this.f4039a) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    String lowerCase = str.toLowerCase();
                    ArrayList arrayList = new ArrayList();
                    if (i5 == -1) {
                        b(lowerCase, 1, arrayList);
                        b(lowerCase, 2, arrayList);
                        b(lowerCase, 3, arrayList);
                    } else if (i5 != 1 && i5 != 2 && i5 != 3) {
                        break;
                    } else {
                        b(lowerCase, i5, arrayList);
                    }
                    break;
                } else {
                    break;
                }
            default:
                if (!TextUtils.isEmpty(str)) {
                    String lowerCase2 = str.toLowerCase();
                    ArrayList arrayList2 = new ArrayList();
                    if (i5 == -1) {
                        b(lowerCase2, 1, arrayList2);
                        b(lowerCase2, 2, arrayList2);
                        b(lowerCase2, 3, arrayList2);
                    } else if (i5 != 1 && i5 != 2 && i5 != 3) {
                        break;
                    } else {
                        b(lowerCase2, i5, arrayList2);
                    }
                    break;
                } else {
                    break;
                }
        }
        return Collections.emptyList();
    }

    public final void i(int i5, int i6, String str) {
        switch (this.f4039a) {
            case 0:
                D d5 = (D) this.f4043e;
                if (d5.f4095Z0.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i6);
                    accessibilityEventObtain.setClassName(Button.class.getName());
                    accessibilityEventObtain.setPackageName(d5.f4188a.getPackageName());
                    accessibilityEventObtain.getText().add(str);
                    accessibilityEventObtain.setEnabled(((SeslNumberPicker) d5.f4189b).isEnabled());
                    accessibilityEventObtain.setSource((SeslNumberPicker) d5.f4189b, i5);
                    SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
                    seslNumberPicker.requestSendAccessibilityEvent(seslNumberPicker, accessibilityEventObtain);
                    break;
                }
                break;
            default:
                M m4 = (M) this.f4043e;
                if (m4.f4212G0.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i6);
                    accessibilityEventObtain2.setClassName(Button.class.getName());
                    accessibilityEventObtain2.setPackageName(m4.f4188a.getPackageName());
                    accessibilityEventObtain2.getText().add(str);
                    accessibilityEventObtain2.setEnabled(((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled());
                    accessibilityEventObtain2.setSource((SeslSpinningDatePickerSpinner) m4.f4189b, i5);
                    SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
                    seslSpinningDatePickerSpinner.requestSendAccessibilityEvent(seslSpinningDatePickerSpinner, accessibilityEventObtain2);
                    break;
                }
                break;
        }
    }

    public final void j(int i5, int i6) {
        switch (this.f4039a) {
            case 0:
                D d5 = (D) this.f4043e;
                if (i5 == 1) {
                    if (d5.f4077Q || d5.f4118o > d5.f4117m) {
                        i(i5, i6, e());
                        break;
                    }
                } else if (i5 == 2) {
                    if (d5.f4095Z0.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i6);
                        EditText editText = d5.f4105e;
                        editText.onInitializeAccessibilityEvent(accessibilityEventObtain);
                        editText.onPopulateAccessibilityEvent(accessibilityEventObtain);
                        SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
                        accessibilityEventObtain.setSource(seslNumberPicker, 2);
                        seslNumberPicker.requestSendAccessibilityEvent(seslNumberPicker, accessibilityEventObtain);
                        break;
                    }
                } else if (i5 == 3) {
                    if (d5.f4077Q || d5.f4118o < d5.n) {
                        i(i5, i6, f());
                        break;
                    }
                }
                break;
            default:
                M m4 = (M) this.f4043e;
                if (i5 == 1) {
                    m4.getClass();
                    if (m4.f4254m.compareTo(m4.f4252k) > 0) {
                        i(i5, i6, e());
                        break;
                    }
                } else if (i5 == 2) {
                    if (m4.f4212G0.isEnabled()) {
                        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i6);
                        Context context = m4.f4188a;
                        accessibilityEventObtain2.setPackageName(context.getPackageName());
                        accessibilityEventObtain2.getText().add(c() + context.getString(R.string.sesl_date_picker_switch_to_calendar_description));
                        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
                        accessibilityEventObtain2.setEnabled(seslSpinningDatePickerSpinner.isEnabled());
                        accessibilityEventObtain2.setSource(seslSpinningDatePickerSpinner, 2);
                        seslSpinningDatePickerSpinner.requestSendAccessibilityEvent(seslSpinningDatePickerSpinner, accessibilityEventObtain2);
                        break;
                    }
                } else if (i5 == 3) {
                    m4.getClass();
                    if (m4.f4254m.compareTo(m4.f4253l) < 0) {
                        i(i5, i6, f());
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i5, int i6, Bundle bundle) {
        switch (this.f4039a) {
            case 0:
                D d5 = (D) this.f4043e;
                if (!d5.n0) {
                    int right = ((SeslNumberPicker) d5.f4189b).getRight();
                    int bottom = ((SeslNumberPicker) d5.f4189b).getBottom();
                    if (i5 != -1) {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                EditText editText = d5.f4105e;
                                if (i6 == 1) {
                                    if (((SeslNumberPicker) d5.f4189b).isEnabled() && !editText.isFocused()) {
                                        break;
                                    }
                                } else if (i6 != 2) {
                                    if (i6 != 16) {
                                        if (i6 != 32) {
                                            if (i6 != 64) {
                                                if (i6 != 128) {
                                                    break;
                                                } else if (this.f4042d == i5) {
                                                    this.f4042d = Integer.MIN_VALUE;
                                                    j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
                                                    ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4090X, right, d5.f4092Y);
                                                }
                                            } else if (this.f4042d != i5) {
                                                this.f4042d = i5;
                                                j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
                                                ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4090X, right, d5.f4092Y);
                                            }
                                        } else if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                                            d5.f4085U = true;
                                            if (d5.g0) {
                                                d5.m0 = true;
                                            }
                                        }
                                    } else if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                                        if (d5.g0) {
                                            d5.x();
                                        }
                                    }
                                } else if (((SeslNumberPicker) d5.f4189b).isEnabled() && editText.isFocused()) {
                                    editText.clearFocus();
                                }
                            } else {
                                if (i5 == 3) {
                                    if (i6 != 16) {
                                        if (i6 != 64) {
                                            if (i6 == 128 && this.f4042d == i5) {
                                                this.f4042d = Integer.MIN_VALUE;
                                                j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
                                                ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4092Y, right, bottom);
                                            }
                                        } else if (this.f4042d != i5) {
                                            this.f4042d = i5;
                                            j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
                                            ((SeslNumberPicker) d5.f4189b).invalidate(0, d5.f4092Y, right, bottom);
                                        }
                                    } else if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                                        d5.z(false);
                                        d5.c(true);
                                        j(i5, 1);
                                        d5.z(true);
                                    }
                                }
                                break;
                            }
                        } else if (i6 != 16) {
                            if (i6 != 64) {
                                if (i6 == 128 && this.f4042d == i5) {
                                    this.f4042d = Integer.MIN_VALUE;
                                    j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
                                    ((SeslNumberPicker) d5.f4189b).invalidate(0, 0, right, d5.f4090X);
                                }
                            } else if (this.f4042d != i5) {
                                this.f4042d = i5;
                                j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
                                ((SeslNumberPicker) d5.f4189b).invalidate(0, 0, right, d5.f4090X);
                            }
                        } else if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                            d5.z(false);
                            d5.c(false);
                            j(i5, 1);
                            d5.z(true);
                        }
                        break;
                    } else if (i6 != 64) {
                        if (i6 != 128) {
                            if (i6 != 4096) {
                                if (i6 == 8192) {
                                    if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                                        if (d5.f4077Q || d5.f4118o > d5.f4117m) {
                                            d5.z(false);
                                            d5.c(false);
                                            d5.z(true);
                                        }
                                    }
                                }
                            } else if (((SeslNumberPicker) d5.f4189b).isEnabled()) {
                                if (d5.f4077Q || d5.f4118o < d5.n) {
                                    d5.z(false);
                                    d5.c(true);
                                    d5.z(true);
                                }
                            }
                        } else if (this.f4042d == i5) {
                            this.f4042d = Integer.MIN_VALUE;
                            SeslNumberPicker seslNumberPicker = (SeslNumberPicker) d5.f4189b;
                            Method methodZ = J2.b.z(View.class, "clearAccessibilityFocus", new Class[0]);
                            if (methodZ != null) {
                                J2.b.E(seslNumberPicker, methodZ, new Object[0]);
                            }
                        }
                    } else if (this.f4042d != i5) {
                        this.f4042d = i5;
                        SeslNumberPicker seslNumberPicker2 = (SeslNumberPicker) d5.f4189b;
                        Method methodZ2 = J2.b.z(View.class, "requestAccessibilityFocus", new Class[0]);
                        if (methodZ2 != null) {
                            Object objE = J2.b.E(seslNumberPicker2, methodZ2, new Object[0]);
                            if (objE instanceof Boolean) {
                                ((Boolean) objE).getClass();
                            }
                        }
                    }
                }
                break;
            default:
                M m4 = (M) this.f4043e;
                if (!m4.f4243e0) {
                    int right2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getRight();
                    int bottom2 = ((SeslSpinningDatePickerSpinner) m4.f4189b).getBottom();
                    if (i5 != -1) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 == 3) {
                                    if (i6 != 16) {
                                        if (i6 != 64) {
                                            if (i6 == 128 && this.f4042d == i5) {
                                                this.f4042d = Integer.MIN_VALUE;
                                                j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
                                                ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4223N, right2, bottom2);
                                            }
                                        } else if (this.f4042d != i5) {
                                            this.f4042d = i5;
                                            j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
                                            ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4223N, right2, bottom2);
                                        }
                                    } else if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled()) {
                                        m4.q(false);
                                        m4.a(true);
                                        j(i5, 1);
                                        m4.q(true);
                                    }
                                }
                                break;
                            } else if (i6 != 16) {
                                if (i6 != 64) {
                                    if (i6 == 128 && this.f4042d == i5) {
                                        this.f4042d = Integer.MIN_VALUE;
                                        j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
                                        ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4222M, right2, m4.f4223N);
                                    }
                                } else if (this.f4042d != i5) {
                                    this.f4042d = i5;
                                    j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
                                    ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, m4.f4222M, right2, m4.f4223N);
                                }
                            } else if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled()) {
                                m4.r();
                            }
                        } else if (i6 != 16) {
                            if (i6 != 64) {
                                if (i6 == 128 && this.f4042d == i5) {
                                    this.f4042d = Integer.MIN_VALUE;
                                    j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_DNS_UID);
                                    ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, 0, right2, m4.f4222M);
                                }
                            } else if (this.f4042d != i5) {
                                this.f4042d = i5;
                                j(i5, NetworkAnalyticsConstants.DataPoints.FLAG_UID);
                                ((SeslSpinningDatePickerSpinner) m4.f4189b).invalidate(0, 0, right2, m4.f4222M);
                            }
                        } else if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled()) {
                            m4.q(false);
                            m4.a(false);
                            j(i5, 1);
                            m4.q(true);
                        }
                        break;
                    } else if (i6 != 64) {
                        if (i6 != 128) {
                            if (i6 != 4096) {
                                if (i6 == 8192) {
                                    if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled() && m4.f4254m.compareTo(m4.f4252k) > 0) {
                                        m4.q(false);
                                        m4.a(false);
                                        m4.q(true);
                                    }
                                }
                            } else if (((SeslSpinningDatePickerSpinner) m4.f4189b).isEnabled() && m4.f4254m.compareTo(m4.f4253l) < 0) {
                                m4.q(false);
                                m4.a(true);
                                m4.q(true);
                            }
                        } else if (this.f4042d == i5) {
                            this.f4042d = Integer.MIN_VALUE;
                            SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner = (SeslSpinningDatePickerSpinner) m4.f4189b;
                            Method methodZ3 = J2.b.z(View.class, "clearAccessibilityFocus", new Class[0]);
                            if (methodZ3 != null) {
                                J2.b.E(seslSpinningDatePickerSpinner, methodZ3, new Object[0]);
                            }
                        }
                    } else if (this.f4042d != i5) {
                        this.f4042d = i5;
                        SeslSpinningDatePickerSpinner seslSpinningDatePickerSpinner2 = (SeslSpinningDatePickerSpinner) m4.f4189b;
                        Method methodZ4 = J2.b.z(View.class, "requestAccessibilityFocus", new Class[0]);
                        if (methodZ4 != null) {
                            Object objE2 = J2.b.E(seslSpinningDatePickerSpinner2, methodZ4, new Object[0]);
                            if (objE2 instanceof Boolean) {
                                ((Boolean) objE2).getClass();
                            }
                        }
                    }
                }
                break;
        }
        return false;
    }

    public A(D d5) {
        this.f4039a = 0;
        this.f4043e = d5;
        this.f4040b = new Rect();
        this.f4041c = new int[2];
        this.f4042d = Integer.MIN_VALUE;
    }
}
