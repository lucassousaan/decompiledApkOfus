package androidx.appcompat.widget;

import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z1 f583b;

    public x1(z1 z1Var) {
        this.f583b = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewParent parent = this.f583b.f599e.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
