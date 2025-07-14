package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i6) throws Resources.NotFoundException {
        int lineCount;
        super.onMeasure(i5, i6);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.sesl_dialog_title_text_size);
        if (dimensionPixelSize != 0) {
            float f = getContext().getResources().getConfiguration().fontScale;
            float f5 = dimensionPixelSize;
            if (f > 1.3f) {
                f5 = (f5 / f) * 1.3f;
            }
            setTextSize(0, f5);
        }
        super.onMeasure(i5, i6);
    }
}
