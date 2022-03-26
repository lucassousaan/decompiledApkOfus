package androidx.savedstate;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Set f1125a = new HashSet();

    public a(d registry) {
        registry.d("androidx.savedstate.Restarter", this);
    }

    @Override // androidx.savedstate.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1125a));
        return bundle;
    }

    public void b(String className) {
        this.f1125a.add(className);
    }
}
