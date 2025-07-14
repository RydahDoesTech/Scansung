package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import c.AbstractC0220a;
import j.ActionProviderVisibilityListenerC0495l;
import j.MenuC0492i;
import java.io.IOException;
import k.AbstractC0622g0;
import org.xmlpull.v1.XmlPullParserException;
import z.AbstractC0941d;

/* loaded from: classes.dex */
public final class j extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f6904e;
    public static final Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f6905a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f6906b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6907c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6908d;

    static {
        Class[] clsArr = {Context.class};
        f6904e = clsArr;
        f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.f6907c = context;
        Object[] objArr = {context};
        this.f6905a = objArr;
        this.f6906b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i5;
        boolean z4;
        ColorStateList colorStateList;
        int resourceId;
        i iVar = new i(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i5 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i5) {
                if (eventType != 3) {
                    z4 = r4;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z6 && name2.equals(str)) {
                        z4 = r4;
                        z6 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            iVar.f6881b = 0;
                            iVar.f6882c = 0;
                            iVar.f6883d = 0;
                            iVar.f6884e = 0;
                            iVar.f = r4;
                            iVar.f6885g = r4;
                        } else if (name2.equals("item")) {
                            if (!iVar.f6886h) {
                                ActionProviderVisibilityListenerC0495l actionProviderVisibilityListenerC0495l = iVar.f6903z;
                                if (actionProviderVisibilityListenerC0495l == null || !actionProviderVisibilityListenerC0495l.f7006a.hasSubMenu()) {
                                    iVar.f6886h = r4;
                                    iVar.b(iVar.f6880a.add(iVar.f6881b, iVar.f6887i, iVar.f6888j, iVar.f6889k));
                                } else {
                                    iVar.f6886h = r4;
                                    iVar.b(iVar.f6880a.addSubMenu(iVar.f6881b, iVar.f6887i, iVar.f6888j, iVar.f6889k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z4 = r4;
                            z5 = z4;
                        }
                        z4 = r4;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = z4;
                i5 = 2;
                z6 = z6;
            } else {
                if (!z6) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    j jVar = iVar.E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = jVar.f6907c.obtainStyledAttributes(attributeSet, AbstractC0220a.f5125p);
                        iVar.f6881b = typedArrayObtainStyledAttributes.getResourceId(r4, 0);
                        iVar.f6882c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        iVar.f6883d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        iVar.f6884e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        iVar.f = typedArrayObtainStyledAttributes.getBoolean(2, r4);
                        iVar.f6885g = typedArrayObtainStyledAttributes.getBoolean(0, r4);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = jVar.f6907c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0220a.f5126q);
                            iVar.f6887i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            iVar.f6888j = (typedArrayObtainStyledAttributes2.getInt(5, iVar.f6882c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, iVar.f6883d) & 65535);
                            iVar.f6889k = typedArrayObtainStyledAttributes2.getText(7);
                            iVar.f6890l = typedArrayObtainStyledAttributes2.getText(8);
                            iVar.f6891m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            iVar.n = string == null ? (char) 0 : string.charAt(0);
                            iVar.f6892o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            iVar.f6893p = string2 == null ? (char) 0 : string2.charAt(0);
                            iVar.f6894q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                iVar.f6895r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                iVar.f6895r = iVar.f6884e;
                            }
                            iVar.f6896s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            iVar.f6897t = typedArrayObtainStyledAttributes2.getBoolean(4, iVar.f);
                            iVar.f6898u = typedArrayObtainStyledAttributes2.getBoolean(1, iVar.f6885g);
                            iVar.f6899v = typedArrayObtainStyledAttributes2.getInt(22, -1);
                            iVar.f6902y = typedArrayObtainStyledAttributes2.getString(12);
                            iVar.f6900w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            iVar.f6901x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z7 = string3 != null;
                            if (z7 && iVar.f6900w == 0 && iVar.f6901x == null) {
                                iVar.f6903z = (ActionProviderVisibilityListenerC0495l) iVar.a(string3, f, jVar.f6906b);
                            } else {
                                if (z7) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                iVar.f6903z = null;
                            }
                            iVar.f6876A = typedArrayObtainStyledAttributes2.getText(17);
                            iVar.f6877B = typedArrayObtainStyledAttributes2.getText(23);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                iVar.f6879D = AbstractC0622g0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), iVar.f6879D);
                            } else {
                                iVar.f6879D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0941d.b(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                iVar.f6878C = colorStateList;
                            } else {
                                iVar.f6878C = null;
                            }
                            typedArrayObtainStyledAttributes2.getInt(21, 0);
                            typedArrayObtainStyledAttributes2.recycle();
                            iVar.f6886h = false;
                            z4 = true;
                        } else if (name3.equals("menu")) {
                            z4 = true;
                            iVar.f6886h = true;
                            SubMenu subMenuAddSubMenu = iVar.f6880a.addSubMenu(iVar.f6881b, iVar.f6887i, iVar.f6888j, iVar.f6889k);
                            iVar.b(subMenuAddSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                        } else {
                            z4 = true;
                            str = name3;
                            z6 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z4;
                        i5 = 2;
                        z6 = z6;
                    }
                }
                z4 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z4;
            i5 = 2;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i5, Menu menu) {
        if (!(menu instanceof MenuC0492i)) {
            super.inflate(i5, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f6907c.getResources().getLayout(i5);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e5) {
                    throw new InflateException("Error inflating menu XML", e5);
                }
            } catch (IOException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
