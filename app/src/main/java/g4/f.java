package g4;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static final boolean a(int i5) {
        return i5 == 6 || i5 == 4;
    }

    public static String b(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.G());
        return sb.toString();
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String e(int i5) {
        switch (i5) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }
}
