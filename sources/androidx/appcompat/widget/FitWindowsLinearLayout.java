package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public w1 f164b;

    public FitWindowsLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOnFitSystemWindowsListener(w1 listener) {
        this.f164b = listener;
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect insets) {
        w1 w1Var = this.f164b;
        if (w1Var != null) {
            w1Var.a(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
