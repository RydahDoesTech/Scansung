package b3;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5098d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f5099e;

    public /* synthetic */ p() {
    }

    public final String toString() {
        switch (this.f5098d) {
            case 0:
                return String.valueOf(this.f5099e);
            default:
                String string = ((Pattern) this.f5099e).toString();
                AbstractC0219i.d("nativePattern.toString()", string);
                return string;
        }
    }

    public p(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC0219i.d("compile(pattern)", patternCompile);
        this.f5099e = patternCompile;
    }
}
