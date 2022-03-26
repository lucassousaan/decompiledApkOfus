package androidx.appcompat.widget;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j2 f275b;

    public c2(j2 this$0) {
        this.f275b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view = this.f275b.t();
        if (view != null && view.getWindowToken() != null) {
            this.f275b.i();
        }
    }
}
