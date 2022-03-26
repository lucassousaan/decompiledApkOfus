package u1;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3591b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3592c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j1.a f3593d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f3594e;

    public a(ExpandableBehavior this$0, View view, int i2, j1.a aVar) {
        this.f3594e = this$0;
        this.f3591b = view;
        this.f3592c = i2;
        this.f3593d = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i2;
        this.f3591b.getViewTreeObserver().removeOnPreDrawListener(this);
        i2 = this.f3594e.f1568a;
        if (i2 == this.f3592c) {
            ExpandableBehavior expandableBehavior = this.f3594e;
            j1.a aVar = this.f3593d;
            expandableBehavior.H((View) aVar, this.f3591b, aVar.a(), false);
        }
        return false;
    }
}
