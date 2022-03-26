package u;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f3564a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f3565b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3566c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3567d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3568e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3569f = false;

    public e(Activity aboutToRecreate) {
        this.f3565b = aboutToRecreate;
        this.f3566c = aboutToRecreate.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f3565b == activity) {
            this.f3567d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.f3568e && !this.f3569f && !this.f3567d && f.h(this.f3564a, this.f3566c, activity)) {
            this.f3569f = true;
            this.f3564a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f3565b == activity) {
            this.f3565b = null;
            this.f3568e = true;
        }
    }
}
