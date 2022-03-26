package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.lang.reflect.Field;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements k {

    /* renamed from: b  reason: collision with root package name */
    public static int f25b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static Field f26c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f27d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f28e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f29a;

    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        if (event == h.ON_DESTROY) {
            if (f25b == 0) {
                h();
            }
            if (f25b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f29a.getSystemService("input_method");
                try {
                    Object lock = f26c.get(inputMethodManager);
                    if (lock != null) {
                        synchronized (lock) {
                            try {
                                try {
                                    View servedView = (View) f27d.get(inputMethodManager);
                                    if (servedView != null) {
                                        if (!servedView.isAttachedToWindow()) {
                                            try {
                                                f28e.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            } catch (IllegalAccessException e2) {
                                            }
                                        }
                                    }
                                } catch (ClassCastException e3) {
                                } catch (IllegalAccessException e4) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (IllegalAccessException e5) {
                }
            }
        }
    }

    public static void h() {
        try {
            f25b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f27d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f28e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f26c = declaredField3;
            declaredField3.setAccessible(true);
            f25b = 1;
        } catch (NoSuchFieldException e2) {
        }
    }
}
