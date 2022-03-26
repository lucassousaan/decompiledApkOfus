package y0;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f0.c1;
import java.util.Objects;
import l0.l;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final View f3722b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3723c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3724d;

    /* JADX WARN: Generic types in debug info not equals: y0.d != com.google.android.material.behavior.SwipeDismissBehavior<V>$SettleRunnable */
    public d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean dismiss) {
        this.f3724d = swipeDismissBehavior;
        this.f3722b = view;
        this.f3723c = dismiss;
    }

    /* JADX WARN: Generic types in debug info not equals: y0.d != com.google.android.material.behavior.SwipeDismissBehavior<V>$SettleRunnable */
    @Override // java.lang.Runnable
    public void run() {
        l lVar = this.f3724d.f1248a;
        if (lVar != null && lVar.k(true)) {
            c1.d0(this.f3722b, this);
        } else if (this.f3723c) {
            Objects.requireNonNull(this.f3724d);
        }
    }
}
