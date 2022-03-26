package q0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e1 {

    /* renamed from: a  reason: collision with root package name */
    public int f3015a;

    /* renamed from: b  reason: collision with root package name */
    public int f3016b;

    public e1 a(e2 holder) {
        b(holder);
        return this;
    }

    public e1 b(e2 holder) {
        View view = holder.f3018a;
        this.f3015a = view.getLeft();
        this.f3016b = view.getTop();
        view.getRight();
        view.getBottom();
        return this;
    }
}
