package g0;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2026a;

    public j() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2026a = new i(this);
        } else {
            this.f2026a = new h(this);
        }
    }

    public j(Object provider) {
        this.f2026a = provider;
    }

    public Object e() {
        return this.f2026a;
    }

    public f b(int virtualViewId) {
        return null;
    }

    public boolean f(int virtualViewId, int action, Bundle arguments) {
        return false;
    }

    public List c() {
        return null;
    }

    public f d(int focus) {
        return null;
    }

    public void a() {
    }
}
