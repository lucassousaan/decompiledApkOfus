package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.savedstate.SavedStateRegistry;
import j.h;
import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1127b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1128c;

    /* renamed from: d  reason: collision with root package name */
    public a f1129d;

    /* renamed from: a  reason: collision with root package name */
    public h f1126a = new h();

    /* renamed from: e  reason: collision with root package name */
    public boolean f1130e = true;

    public Bundle a(String key) {
        if (this.f1128c) {
            Bundle bundle = this.f1127b;
            if (bundle == null) {
                return null;
            }
            Bundle result = bundle.getBundle(key);
            this.f1127b.remove(key);
            if (this.f1127b.isEmpty()) {
                this.f1127b = null;
            }
            return result;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void d(String key, c provider) {
        c previous = (c) this.f1126a.g(key, provider);
        if (previous != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class cls) {
        if (this.f1130e) {
            if (this.f1129d == null) {
                this.f1129d = new a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1129d.b(cls.getName());
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public void b(j lifecycle, Bundle savedState) {
        if (!this.f1128c) {
            if (savedState != null) {
                this.f1127b = savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.a(new k() { // from class: androidx.savedstate.SavedStateRegistry$1
                @Override // androidx.lifecycle.k
                public void g(m source, androidx.lifecycle.h event) {
                    if (event == androidx.lifecycle.h.ON_START) {
                        d.this.f1130e = true;
                    } else if (event == androidx.lifecycle.h.ON_STOP) {
                        d.this.f1130e = false;
                    }
                }
            });
            this.f1128c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    public void c(Bundle outBundle) {
        Bundle components = new Bundle();
        Bundle bundle = this.f1127b;
        if (bundle != null) {
            components.putAll(bundle);
        }
        Iterator<Map.Entry<String, SavedStateRegistry.SavedStateProvider>> it = this.f1126a.d();
        while (it.hasNext()) {
            Map.Entry<String, SavedStateRegistry.SavedStateProvider> entry1 = (Map.Entry) it.next();
            components.putBundle(entry1.getKey(), ((c) entry1.getValue()).a());
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", components);
    }
}
