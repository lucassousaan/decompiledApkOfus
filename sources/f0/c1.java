package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.helloworld.R;
import g0.c;
import g0.f;
import g0.t;
import i0.u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: c  reason: collision with root package name */
    public static Field f1853c;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f1851a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public static WeakHashMap f1852b = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1854d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1855e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: f  reason: collision with root package name */
    public static final c0 f1856f = e0.f1862b;

    static {
        new j0();
    }

    public static void j0(View view, Context context, int[] styleable, AttributeSet attrs, TypedArray t2, int defStyleAttr, int defStyleRes) {
        if (Build.VERSION.SDK_INT >= 29) {
            w0.c(view, context, styleable, attrs, t2, defStyleAttr, defStyleRes);
        }
    }

    public static void Y(View v2, f info) {
        v2.onInitializeAccessibilityNodeInfo(info.u0());
    }

    public static void l0(View v2, b delegate) {
        if (delegate == null && (m(v2) instanceof a)) {
            delegate = new b();
        }
        v2.setAccessibilityDelegate(delegate == null ? null : delegate.d());
    }

    public static int z(View v2) {
        if (Build.VERSION.SDK_INT >= 26) {
            return t0.b(v2);
        }
        return 0;
    }

    public static void t0(View v2, int mode) {
        if (Build.VERSION.SDK_INT >= 26) {
            t0.l(v2, mode);
        }
    }

    public static b l(View view) {
        View.AccessibilityDelegate delegate = m(view);
        if (delegate == null) {
            return null;
        }
        if (delegate instanceof a) {
            return ((a) delegate).f1843a;
        }
        return new b(delegate);
    }

    public static void j(View v2) {
        b delegateCompat = l(v2);
        if (delegateCompat == null) {
            delegateCompat = new b();
        }
        l0(v2, delegateCompat);
    }

    public static View.AccessibilityDelegate m(View v2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return w0.a(v2);
        }
        return n(v2);
    }

    public static View.AccessibilityDelegate n(View v2) {
        if (f1854d) {
            return null;
        }
        if (f1853c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1853c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f1854d = true;
                return null;
            }
        }
        try {
            Object o2 = f1853c.get(v2);
            if (o2 instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) o2;
            }
            return null;
        } catch (Throwable th2) {
            f1854d = true;
            return null;
        }
    }

    public static boolean M(View view) {
        return m0.i(view);
    }

    public static void c0(View view) {
        m0.k(view);
    }

    public static void d0(View view, Runnable action) {
        m0.m(view, action);
    }

    public static void e0(View view, Runnable action, long delayMillis) {
        m0.n(view, action, delayMillis);
    }

    public static int y(View view) {
        return m0.c(view);
    }

    public static void s0(View view, int mode) {
        m0.s(view, mode);
    }

    public static boolean a0(View view, int action, Bundle arguments) {
        return m0.j(view, action, arguments);
    }

    public static int c(View view, CharSequence label, t command) {
        int actionId = r(view, label);
        if (actionId != -1) {
            c action = new c(actionId, label, command);
            d(view, action);
        }
        return actionId;
    }

    public static int r(View view, CharSequence label) {
        int result = -1;
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = q(view);
        for (int i2 = 0; i2 < actions.size(); i2++) {
            if (TextUtils.equals(label, ((c) actions.get(i2)).c())) {
                return ((c) actions.get(i2)).b();
            }
        }
        int i3 = 0;
        while (true) {
            int[] iArr = f1855e;
            if (i3 >= iArr.length || result != -1) {
                break;
            }
            int id = iArr[i3];
            boolean idAvailable = true;
            for (int j2 = 0; j2 < actions.size(); j2++) {
                idAvailable &= ((c) actions.get(j2)).b() != id;
            }
            if (idAvailable) {
                result = id;
            }
            i3++;
        }
        return result;
    }

    public static void h0(View view, c replacedAction, CharSequence label, t command) {
        if (command == null && label == null) {
            f0(view, replacedAction.b());
        } else {
            d(view, replacedAction.a(label, command));
        }
    }

    public static void d(View view, c action) {
        j(view);
        g0(action.b(), view);
        q(view).add(action);
        U(view, 0);
    }

    public static void f0(View view, int actionId) {
        g0(actionId, view);
        U(view, 0);
    }

    public static void g0(int actionId, View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = q(view);
        for (int i2 = 0; i2 < actions.size(); i2++) {
            if (((c) actions.get(i2)).b() == actionId) {
                actions.remove(i2);
                return;
            }
        }
    }

    public static List q(View view) {
        ArrayList<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (actions != null) {
            return actions;
        }
        ArrayList<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions2 = new ArrayList<>();
        view.setTag(R.id.tag_accessibility_actions, actions2);
        return actions2;
    }

    public static CharSequence H(View view) {
        return (CharSequence) z0().f(view);
    }

    public static int A(View view) {
        return n0.d(view);
    }

    public static int o(View view) {
        return o0.a(view);
    }

    public static void n0(View view, int mode) {
        o0.f(view, mode);
    }

    public static int F(View view) {
        return n0.f(view);
    }

    public static int E(View view) {
        return n0.e(view);
    }

    public static void v0(View view, int start, int top, int end, int bottom) {
        n0.k(view, start, top, end, bottom);
    }

    public static int C(View view) {
        return m0.e(view);
    }

    public static int B(View view) {
        return m0.d(view);
    }

    public static h1 e(View view) {
        if (f1852b == null) {
            f1852b = new WeakHashMap();
        }
        h1 vpa = (h1) f1852b.get(view);
        if (vpa != null) {
            return vpa;
        }
        h1 vpa2 = new h1(view);
        f1852b.put(view, vpa2);
        return vpa2;
    }

    public static void r0(View view, float elevation) {
        r0.s(view, elevation);
    }

    public static float v(View view) {
        return r0.i(view);
    }

    public static void x0(View view, String transitionName) {
        r0.v(view, transitionName);
    }

    public static String I(View view) {
        return r0.k(view);
    }

    public static int J(View view) {
        return m0.g(view);
    }

    public static void i0(View view) {
        p0.c(view);
    }

    public static boolean x(View v2) {
        return m0.b(v2);
    }

    public static void u0(View v2, a0 listener) {
        r0.u(v2, listener);
    }

    public static x1 X(View view, x1 insets) {
        WindowInsets unwrapped = insets.r();
        if (unwrapped != null) {
            WindowInsets result = p0.b(view, unwrapped);
            if (!result.equals(unwrapped)) {
                return x1.t(result, view);
            }
        }
        return insets;
    }

    public static x1 g(View view, x1 insets) {
        WindowInsets unwrapped = insets.r();
        if (unwrapped != null) {
            WindowInsets result = p0.a(view, unwrapped);
            if (!result.equals(unwrapped)) {
                return x1.t(result, view);
            }
        }
        return insets;
    }

    public static x1 G(View view) {
        return s0.a(view);
    }

    public static x1 f(View view, x1 insets, Rect outLocalInsets) {
        return r0.b(view, insets, outLocalInsets);
    }

    public static String[] D(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y0.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static m b0(View view, m payload) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + payload + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return y0.b(view, payload);
        }
        b0 listener = (b0) view.getTag(R.id.tag_on_receive_content_listener);
        if (listener == null) {
            return w(view).a(payload);
        }
        m remaining = ((u) listener).b(view, payload);
        if (remaining == null) {
            return null;
        }
        return w(view).a(remaining);
    }

    public static c0 w(View view) {
        if (view instanceof c0) {
            return (c0) view;
        }
        return f1856f;
    }

    public static /* synthetic */ m T(m payload) {
        return payload;
    }

    public static boolean R(View view) {
        return n0.g(view);
    }

    public static void o0(View view, Drawable background) {
        m0.q(view, background);
    }

    public static ColorStateList s(View view) {
        return r0.g(view);
    }

    public static void p0(View view, ColorStateList tintList) {
        r0.q(view, tintList);
    }

    public static PorterDuff.Mode t(View view) {
        return r0.h(view);
    }

    public static void q0(View view, PorterDuff.Mode mode) {
        r0.r(view, mode);
    }

    public static boolean Q(View view) {
        return r0.p(view);
    }

    public static void A0(View view) {
        r0.z(view);
    }

    public static boolean P(View view) {
        return o0.c(view);
    }

    public static float K(View view) {
        return r0.m(view);
    }

    public static void W(View view, int offset) {
        view.offsetTopAndBottom(offset);
    }

    public static void V(View view, int offset) {
        view.offsetLeftAndRight(offset);
    }

    public static boolean O(View view) {
        return o0.b(view);
    }

    public static boolean L(View view) {
        return l0.a(view);
    }

    public static void w0(View view, int indicators, int mask) {
        s0.d(view, indicators, mask);
    }

    public static Display u(View view) {
        return n0.b(view);
    }

    public static int k() {
        return n0.a();
    }

    public static boolean i(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return b1.a(root).f(evt);
    }

    public static boolean h(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return b1.a(root).b(root, evt);
    }

    public static boolean S(View view) {
        Boolean result = (Boolean) k0().f(view);
        return result != null && result.booleanValue();
    }

    public static k0 k0() {
        return new f0(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static CharSequence p(View view) {
        return (CharSequence) Z().f(view);
    }

    public static k0 Z() {
        return new g0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static k0 z0() {
        return new h0(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    public static boolean N(View view) {
        Boolean result = (Boolean) b().f(view);
        return result != null && result.booleanValue();
    }

    public static void m0(View view, boolean isHeading) {
        b().g(view, Boolean.valueOf(isHeading));
    }

    public static k0 b() {
        return new i0(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void U(View view, int changeType) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean isVisibleAccessibilityPane = p(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (o(view) != 0 || isVisibleAccessibilityPane) {
                AccessibilityEvent event = AccessibilityEvent.obtain();
                if (!isVisibleAccessibilityPane) {
                    i2 = 2048;
                }
                event.setEventType(i2);
                o0.g(event, changeType);
                if (isVisibleAccessibilityPane) {
                    event.getText().add(p(view));
                    y0(view);
                }
                view.sendAccessibilityEventUnchecked(event);
            } else if (changeType == 32) {
                AccessibilityEvent event2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(event2);
                event2.setEventType(32);
                o0.g(event2, changeType);
                event2.setSource(view);
                view.onPopulateAccessibilityEvent(event2);
                event2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(event2);
            } else if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                try {
                    o0.e(parent, view, view, changeType);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void y0(View view) {
        if (y(view) == 0) {
            s0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (y((View) parent) == 4) {
                s0(view, 2);
                return;
            }
        }
    }
}
