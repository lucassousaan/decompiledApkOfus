package androidx.activity;

import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements k, a {

    /* renamed from: a  reason: collision with root package name */
    public final j f30a;

    /* renamed from: b  reason: collision with root package name */
    public final f f31b;

    /* renamed from: c  reason: collision with root package name */
    public a f32c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f33d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(h hVar, j lifecycle, f onBackPressedCallback) {
        this.f33d = hVar;
        this.f30a = lifecycle;
        this.f31b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        if (event == h.ON_START) {
            this.f32c = this.f33d.b(this.f31b);
        } else if (event == h.ON_STOP) {
            a aVar = this.f32c;
            if (aVar != null) {
                aVar.cancel();
            }
        } else if (event == h.ON_DESTROY) {
            cancel();
        }
    }

    @Override // androidx.activity.a
    public void cancel() {
        this.f30a.c(this);
        this.f31b.e(this);
        a aVar = this.f32c;
        if (aVar != null) {
            aVar.cancel();
            this.f32c = null;
        }
    }
}
