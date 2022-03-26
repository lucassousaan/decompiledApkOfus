package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1020a = new HashMap();

    public final void d(String key, d0 viewModel) {
        d0 oldViewModel = (d0) this.f1020a.put(key, viewModel);
        if (oldViewModel != null) {
            oldViewModel.d();
        }
    }

    public final d0 b(String key) {
        return (d0) this.f1020a.get(key);
    }

    public Set c() {
        return new HashSet(this.f1020a.keySet());
    }

    public final void a() {
        for (d0 vm : this.f1020a.values()) {
            vm.a();
        }
        this.f1020a.clear();
    }
}
