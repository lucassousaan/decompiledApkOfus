package q0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h1 {
    public void d(Canvas c2, RecyclerView parent, b2 state) {
        c();
    }

    public void c() {
    }

    public void f(Canvas c2, RecyclerView parent, b2 state) {
        e();
    }

    public void e() {
    }

    public void a(Rect outRect) {
        outRect.set(0, 0, 0, 0);
    }

    public void b(Rect outRect, View view, RecyclerView parent) {
        ((n1) view.getLayoutParams()).a();
        a(outRect);
    }
}
