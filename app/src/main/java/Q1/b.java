package Q1;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class b implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View childAt;
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            float x5 = childAt.getX();
            float y5 = childAt.getY();
            float width = childAt.getWidth() + x5;
            float height = childAt.getHeight() + y5;
            if (x4 >= x5 && y4 >= y5 && x4 < width && y4 < height) {
                break;
            }
            childCount--;
        }
        return childAt != null;
    }
}
