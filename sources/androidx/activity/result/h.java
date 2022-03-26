package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public Random f54a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map f55b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f56c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map f57d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f58e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map f59f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map f60g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f61h = new Bundle();

    /* JADX WARN: Generic types in debug info not equals: androidx.activity.result.c != androidx.activity.result.ActivityResultCallback<O> */
    /* JADX WARN: Generic types in debug info not equals: b.a != androidx.activity.result.contract.ActivityResultContract<I, O> */
    public final d g(String key, a aVar, c cVar) {
        int requestCode = h(key);
        this.f59f.put(key, new f(cVar, aVar));
        if (this.f60g.containsKey(key)) {
            Object obj = this.f60g.get(key);
            this.f60g.remove(key);
            cVar.a(obj);
        }
        b pendingResult = (b) this.f61h.getParcelable(key);
        if (pendingResult != null) {
            this.f61h.remove(key);
            cVar.a(aVar.a(pendingResult.j(), pendingResult.i()));
        }
        return new e(this, key, requestCode, aVar);
    }

    public final void i(String key) {
        Integer rc;
        if (!this.f58e.contains(key) && (rc = (Integer) this.f56c.remove(key)) != null) {
            this.f55b.remove(rc);
        }
        this.f59f.remove(key);
        if (this.f60g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f60g.get(key));
            this.f60g.remove(key);
        }
        if (this.f61h.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f61h.getParcelable(key));
            this.f61h.remove(key);
        }
        g lifecycleContainer = (g) this.f57d.get(key);
        if (lifecycleContainer != null) {
            lifecycleContainer.a();
            this.f57d.remove(key);
        }
    }

    public final void f(Bundle outState) {
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f55b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f55b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f58e));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f61h.clone());
        outState.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f54a);
    }

    public final void e(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            ArrayList<Integer> rcs = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> keys = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(keys == null || rcs == null)) {
                int numKeys = keys.size();
                for (int i2 = 0; i2 < numKeys; i2++) {
                    a(rcs.get(i2).intValue(), keys.get(i2));
                }
                this.f58e = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f54a = (Random) savedInstanceState.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f61h.putAll(savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
    }

    public final boolean b(int requestCode, int resultCode, Intent data) {
        String key = (String) this.f55b.get(Integer.valueOf(requestCode));
        if (key == null) {
            return false;
        }
        this.f58e.remove(key);
        c(key, resultCode, data, (f) this.f59f.get(key));
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.activity.result.c != androidx.activity.result.ActivityResultCallback<O> */
    /* JADX WARN: Generic types in debug info not equals: androidx.activity.result.f != androidx.activity.result.ActivityResultRegistry$CallbackAndContract<O> */
    /* JADX WARN: Generic types in debug info not equals: b.a != androidx.activity.result.contract.ActivityResultContract<?, O> */
    public final void c(String key, int resultCode, Intent data, f fVar) {
        if (fVar == null || fVar.f52a == null) {
            this.f60g.remove(key);
            this.f61h.putParcelable(key, new b(resultCode, data));
            return;
        }
        fVar.f52a.a(fVar.f53b.a(resultCode, data));
    }

    public final int h(String key) {
        Integer existing = (Integer) this.f56c.get(key);
        if (existing != null) {
            return existing.intValue();
        }
        int rc = d();
        a(rc, key);
        return rc;
    }

    public final int d() {
        int number = this.f54a.nextInt(2147418112) + 65536;
        while (this.f55b.containsKey(Integer.valueOf(number))) {
            number = this.f54a.nextInt(2147418112) + 65536;
        }
        return number;
    }

    public final void a(int rc, String key) {
        this.f55b.put(Integer.valueOf(rc), key);
        this.f56c.put(key, Integer.valueOf(rc));
    }
}
