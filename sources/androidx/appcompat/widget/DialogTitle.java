package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import c.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class DialogTitle extends j1 {
    public DialogTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override // androidx.appcompat.widget.j1, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int lineCount;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0) {
            int ellipsisCount = layout.getEllipsisCount(lineCount - 1);
            if (ellipsisCount > 0) {
                setSingleLine(false);
                setMaxLines(2);
                TypedArray a2 = getContext().obtainStyledAttributes(null, a.f1188v, 16842817, 16973892);
                int[] iArr = a.f1167a;
                int textSize = a2.getDimensionPixelSize(0, 0);
                if (textSize != 0) {
                    setTextSize(0, textSize);
                }
                a2.recycle();
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }
}
