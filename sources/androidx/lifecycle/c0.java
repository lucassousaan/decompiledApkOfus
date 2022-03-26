package androidx.lifecycle;

import androidx.savedstate.b;
import androidx.savedstate.d;
import androidx.savedstate.f;
import java.util.HashSet;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c0 implements b {
    public void a(f owner) {
        if (owner instanceof h0) {
            g0 viewModelStore = ((h0) owner).d();
            d savedStateRegistry = owner.b();
            Iterator it = ((HashSet) viewModelStore.c()).iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                d0 viewModel = viewModelStore.b(key);
                SavedStateHandleController.h(viewModel, savedStateRegistry, owner.g());
            }
            if (!((HashSet) viewModelStore.c()).isEmpty()) {
                savedStateRegistry.e(c0.class);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
    }
}
