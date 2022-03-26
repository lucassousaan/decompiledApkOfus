package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class w0 {
    public static void c(View view, Context context, int[] styleable, AttributeSet attrs, TypedArray t2, int defStyleAttr, int defStyleRes) {
        view.saveAttributeDataForStyleable(context, styleable, attrs, t2, defStyleAttr, defStyleRes);
    }

    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void d(View view, List<Rect> rects) {
        view.setSystemGestureExclusionRects(rects);
    }

    public static List<Rect> b(View view) {
        return view.getSystemGestureExclusionRects();
    }
}
