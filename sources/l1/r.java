package l1;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class r {
    public static TextView c(Toolbar toolbar) {
        return b(toolbar, toolbar.getTitle());
    }

    public static TextView a(Toolbar toolbar) {
        return b(toolbar, toolbar.getSubtitle());
    }

    public static TextView b(Toolbar toolbar, CharSequence text) {
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View child = toolbar.getChildAt(i2);
            if (child instanceof TextView) {
                TextView textView = (TextView) child;
                if (TextUtils.equals(textView.getText(), text)) {
                    return textView;
                }
            }
        }
        return null;
    }
}
