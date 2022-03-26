package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.c0;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements k {

    /* renamed from: a  reason: collision with root package name */
    public final f f1123a;

    public Recreator(f owner) {
        this.f1123a = owner;
    }

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        if (event == h.ON_CREATE) {
            source.g().c(this);
            Bundle bundle = this.f1123a.b().a("androidx.savedstate.Restarter");
            if (bundle != null) {
                ArrayList<String> classes = bundle.getStringArrayList("classes_to_restore");
                if (classes != null) {
                    Iterator<String> it = classes.iterator();
                    while (it.hasNext()) {
                        String className = it.next();
                        h(className);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public final void h(String className) {
        try {
            Class<? extends U> asSubclass = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(b.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    b newInstance = (b) declaredConstructor.newInstance(new Object[0]);
                    ((c0) newInstance).a(this.f1123a);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to instantiate " + className, e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Class " + className + " wasn't found", e4);
        }
    }
}
