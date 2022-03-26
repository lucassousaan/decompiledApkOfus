package androidx.lifecycle;

import androidx.savedstate.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1002a;

    public boolean j() {
        return this.f1002a;
    }

    public void i(d registry, j lifecycle) {
        if (this.f1002a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1002a = true;
        lifecycle.a(this);
        b0 b0Var = null;
        b0Var.a();
        throw null;
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        if (event == h.ON_DESTROY) {
            this.f1002a = false;
            source.g().c(this);
        }
    }

    public static void h(d0 viewModel, d registry, j lifecycle) {
        SavedStateHandleController controller = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (controller != null && !controller.j()) {
            controller.i(registry, lifecycle);
            throw null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  
 */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f1003a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f1004b;

        @Override // androidx.lifecycle.k
        public void g(m source, h event) {
            if (event == h.ON_START) {
                this.f1003a.c(this);
                this.f1004b.e(c0.class);
            }
        }
    }
}
