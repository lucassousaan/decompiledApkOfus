package f0;

import android.view.KeyEvent;
import android.view.View;
import com.example.helloworld.R;
import java.util.Objects;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static <T> T f(View view, int id) {
        return (T) view.requireViewById(id);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void h(View view, CharSequence accessibilityPaneTitle) {
        view.setAccessibilityPaneTitle(accessibilityPaneTitle);
    }

    public static void g(View view, boolean isHeading) {
        view.setAccessibilityHeading(isHeading);
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void i(View view, boolean screenReaderFocusable) {
        view.setScreenReaderFocusable(screenReaderFocusable);
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat, android.view.View$OnUnhandledKeyEventListener> */
    public static void a(View v2, final a1 listener) {
        n nVar = (n) v2.getTag(R.id.tag_unhandled_key_listeners);
        if (nVar == null) {
            nVar = new n();
            v2.setTag(R.id.tag_unhandled_key_listeners, nVar);
        }
        Objects.requireNonNull(listener);
        View.OnUnhandledKeyEventListener fwListener = new View.OnUnhandledKeyEventListener() { // from class: f0.u0
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                return a1.this.onUnhandledKeyEvent(view, keyEvent);
            }
        };
        nVar.put(listener, fwListener);
        v2.addOnUnhandledKeyEventListener(fwListener);
    }

    /* JADX WARN: Generic types in debug info not equals: k.n != androidx.collection.SimpleArrayMap<androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat, android.view.View$OnUnhandledKeyEventListener> */
    public static void e(View v2, a1 listener) {
        View.OnUnhandledKeyEventListener fwListener;
        n nVar = (n) v2.getTag(R.id.tag_unhandled_key_listeners);
        if (nVar != null && (fwListener = (View.OnUnhandledKeyEventListener) nVar.get(listener)) != null) {
            v2.removeOnUnhandledKeyEventListener(fwListener);
        }
    }
}
