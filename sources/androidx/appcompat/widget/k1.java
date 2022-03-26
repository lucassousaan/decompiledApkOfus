package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k1 extends m1 {
    @Override // androidx.appcompat.widget.m1
    public void a(StaticLayout.Builder layoutBuilder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) n1.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        layoutBuilder.setTextDirection(textDirectionHeuristic);
    }
}
