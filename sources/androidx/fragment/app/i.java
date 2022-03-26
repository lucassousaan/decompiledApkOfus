package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import b0.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f793b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f794c;

    public i(q this$0, View view, ViewGroup viewGroup, n nVar) {
        this.f792a = view;
        this.f793b = viewGroup;
        this.f794c = nVar;
    }

    @Override // b0.b
    public void a() {
        this.f792a.clearAnimation();
        this.f793b.endViewTransition(this.f792a);
        this.f794c.a();
    }
}
