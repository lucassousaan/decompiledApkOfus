package f0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j0 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f1879b = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry<View, Boolean> entry : this.f1879b.entrySet()) {
                a(entry.getKey(), entry.getValue().booleanValue());
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        b(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    public final void a(View pane, boolean oldVisibility) {
        int contentChangeType;
        boolean newVisibility = pane.getVisibility() == 0;
        if (oldVisibility != newVisibility) {
            if (newVisibility) {
                contentChangeType = 16;
            } else {
                contentChangeType = 32;
            }
            c1.U(pane, contentChangeType);
            this.f1879b.put(pane, Boolean.valueOf(newVisibility));
        }
    }

    public final void b(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
