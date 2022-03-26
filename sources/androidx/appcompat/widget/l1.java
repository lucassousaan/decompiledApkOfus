package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l1 extends k1 {
    @Override // androidx.appcompat.widget.m1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // androidx.appcompat.widget.k1, androidx.appcompat.widget.m1
    public void a(StaticLayout.Builder layoutBuilder, TextView textView) {
        layoutBuilder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
