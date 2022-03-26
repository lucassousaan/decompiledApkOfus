package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j2 f812b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f813c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Rect f814d;

    public k(q this$0, j2 j2Var, View view, Rect rect) {
        this.f812b = j2Var;
        this.f813c = view;
        this.f814d = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f812b.h(this.f813c, this.f814d);
    }
}
