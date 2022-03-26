package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a0 extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public y f1008b;

    public static void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            z.registerIn(activity);
        }
        FragmentManager manager = activity.getFragmentManager();
        if (manager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            manager.beginTransaction().add(new a0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            manager.executePendingTransactions();
        }
    }

    public static void a(Activity activity, h event) {
        if (activity instanceof m) {
            j lifecycle = ((m) activity).g();
            if (lifecycle instanceof o) {
                ((o) lifecycle).h(event);
            }
        }
    }

    public final void c(y listener) {
        if (listener != null) {
            listener.a();
        }
    }

    public final void e(y listener) {
        if (listener != null) {
            listener.c();
        }
    }

    public final void d(y listener) {
        if (listener != null) {
            listener.b();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        c(null);
        b(h.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(null);
        b(h.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(null);
        b(h.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(h.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(h.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(h.ON_DESTROY);
        this.f1008b = null;
    }

    public final void b(h event) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), event);
        }
    }
}
