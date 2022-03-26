package f0;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.example.helloworld.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f1847d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f1848a = null;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f1849b = null;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f1850c = null;

    public final SparseArray d() {
        if (this.f1849b == null) {
            this.f1849b = new SparseArray();
        }
        return this.f1849b;
    }

    public static b1 a(View root) {
        b1 manager = (b1) root.getTag(R.id.tag_unhandled_key_event_manager);
        if (manager != null) {
            return manager;
        }
        b1 manager2 = new b1();
        root.setTag(R.id.tag_unhandled_key_event_manager, manager2);
        return manager2;
    }

    public boolean b(View root, KeyEvent event) {
        if (event.getAction() == 0) {
            g();
        }
        View consumer = c(root, event);
        if (event.getAction() == 0) {
            int keycode = event.getKeyCode();
            if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                d().put(keycode, new WeakReference(consumer));
            }
        }
        return consumer != null;
    }

    public final View c(View view, KeyEvent event) {
        WeakHashMap weakHashMap = this.f1848a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) view;
            for (int i2 = vg.getChildCount() - 1; i2 >= 0; i2--) {
                View v2 = vg.getChildAt(i2);
                View consumer = c(v2, event);
                if (consumer != null) {
                    return consumer;
                }
            }
        }
        if (e(view, event)) {
            return view;
        }
        return null;
    }

    public boolean f(KeyEvent event) {
        int idx;
        WeakReference weakReference = this.f1850c;
        if (weakReference != null && weakReference.get() == event) {
            return false;
        }
        this.f1850c = new WeakReference(event);
        WeakReference<View> currentReceiver = null;
        SparseArray<WeakReference<View>> capturedKeys = d();
        if (event.getAction() == 1 && (idx = capturedKeys.indexOfKey(event.getKeyCode())) >= 0) {
            currentReceiver = capturedKeys.valueAt(idx);
            capturedKeys.removeAt(idx);
        }
        if (currentReceiver == null) {
            currentReceiver = capturedKeys.get(event.getKeyCode());
        }
        if (currentReceiver == null) {
            return false;
        }
        View target = currentReceiver.get();
        if (target != null && c1.O(target)) {
            e(target, event);
        }
        return true;
    }

    public final boolean e(View v2, KeyEvent event) {
        ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v2.getTag(R.id.tag_unhandled_key_listeners);
        if (viewListeners == null) {
            return false;
        }
        for (int i2 = viewListeners.size() - 1; i2 >= 0; i2--) {
            if (((a1) viewListeners.get(i2)).onUnhandledKeyEvent(v2, event)) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        WeakHashMap weakHashMap = this.f1848a;
        if (weakHashMap != null) {
            weakHashMap.clear();
        }
        ArrayList arrayList = f1847d;
        if (!arrayList.isEmpty()) {
            synchronized (arrayList) {
                if (this.f1848a == null) {
                    this.f1848a = new WeakHashMap();
                }
                for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                    ArrayList arrayList2 = f1847d;
                    WeakReference<View> vw = (WeakReference) arrayList2.get(i2);
                    View v2 = vw.get();
                    if (v2 == null) {
                        arrayList2.remove(i2);
                    } else {
                        this.f1848a.put(v2, Boolean.TRUE);
                        for (ViewParent nxt = v2.getParent(); nxt instanceof View; nxt = nxt.getParent()) {
                            this.f1848a.put((View) nxt, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }
}
