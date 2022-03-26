package f0;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1903a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f1904b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1905c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f1906d = null;

    public static boolean d(View root, KeyEvent event) {
        return c1.i(root, event);
    }

    public static boolean e(p component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.i(event);
        }
        if (callback instanceof Activity) {
            return b((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return c((Dialog) callback, event);
        }
        return (root != null && c1.h(root, event)) || component.i(event);
    }

    public static boolean a(ActionBar actionBar, KeyEvent event) {
        if (!f1903a) {
            try {
                f1904b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e2) {
            }
            f1903a = true;
        }
        Method method = f1904b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, event)).booleanValue();
            } catch (IllegalAccessException e3) {
            } catch (InvocationTargetException e4) {
            }
        }
        return false;
    }

    public static boolean b(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            int keyCode = event.getKeyCode();
            if (keyCode == 82 && actionBar != null && a(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (c1.h(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    public static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f1905c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f1906d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f1905c = true;
        }
        Field field = f1906d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e3) {
            return null;
        }
    }

    public static boolean c(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = f(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (c1.h(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
