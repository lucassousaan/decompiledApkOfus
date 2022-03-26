package q0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v0 implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3251a;

    public v0(RecyclerView this$0) {
        this.f3251a = this$0;
    }

    public int e() {
        return this.f3251a.getChildCount();
    }

    public void a(View child, int index) {
        this.f3251a.addView(child, index);
        this.f3251a.y(child);
    }

    public int g(View view) {
        return this.f3251a.indexOfChild(view);
    }

    public void k(int index) {
        View child = this.f3251a.getChildAt(index);
        if (child != null) {
            this.f3251a.z(child);
            child.clearAnimation();
        }
        this.f3251a.removeViewAt(index);
    }

    public View d(int offset) {
        return this.f3251a.getChildAt(offset);
    }

    public void j() {
        int count = e();
        for (int i2 = 0; i2 < count; i2++) {
            View child = d(i2);
            this.f3251a.z(child);
            child.clearAnimation();
        }
        this.f3251a.removeAllViews();
    }

    public e2 f(View view) {
        return RecyclerView.f0(view);
    }

    public void b(View child, int index, ViewGroup.LayoutParams layoutParams) {
        e2 vh = RecyclerView.f0(child);
        if (vh != null) {
            if (vh.x() || vh.J()) {
                vh.f();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + vh + this.f3251a.P());
            }
        }
        this.f3251a.attachViewToParent(child, index, layoutParams);
    }

    public void c(int offset) {
        e2 vh;
        View view = d(offset);
        if (!(view == null || (vh = RecyclerView.f0(view)) == null)) {
            if (!vh.x() || vh.J()) {
                vh.b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + vh + this.f3251a.P());
            }
        }
        this.f3251a.detachViewFromParent(offset);
    }

    public void h(View child) {
        e2 vh = RecyclerView.f0(child);
        if (vh != null) {
            vh.B(this.f3251a);
        }
    }

    public void i(View child) {
        e2 vh = RecyclerView.f0(child);
        if (vh != null) {
            vh.C(this.f3251a);
        }
    }
}
