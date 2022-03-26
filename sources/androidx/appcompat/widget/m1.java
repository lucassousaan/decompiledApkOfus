package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) n1.n(textView, "getHorizontallyScrolling", false)).booleanValue();
    }
}
