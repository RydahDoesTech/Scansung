package androidx.appcompat.util;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class SeslShapeDrawable extends GradientDrawable {
    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, NoSuchMethodException, IOException, SecurityException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        Method methodR = J2.b.r(GradientDrawable.class, "setSmoothCorner", Boolean.TYPE);
        if (methodR == null) {
            Log.w("SeslShapeDrawable", "This API is not supported by the platform.");
        } else {
            J2.b.E(this, methodR, Boolean.TRUE);
        }
    }
}
