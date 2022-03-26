package f0;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import x.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a  reason: collision with root package name */
    public static Field f1889a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f1890b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f1891c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1892d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f1889a = declaredField;
            declaredField.setAccessible(true);
            Class<?> sAttachInfoClass = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = sAttachInfoClass.getDeclaredField("mStableInsets");
            f1890b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = sAttachInfoClass.getDeclaredField("mContentInsets");
            f1891c = declaredField3;
            declaredField3.setAccessible(true);
            f1892d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }

    public static x1 a(View v2) {
        if (!f1892d || !v2.isAttachedToWindow()) {
            return null;
        }
        View rootView = v2.getRootView();
        try {
            Object attachInfo = f1889a.get(rootView);
            if (attachInfo != null) {
                Rect stableInsets = (Rect) f1890b.get(attachInfo);
                Rect visibleInsets = (Rect) f1891c.get(attachInfo);
                if (!(stableInsets == null || visibleInsets == null)) {
                    m1 m1Var = new m1();
                    m1Var.b(b.b(stableInsets));
                    m1Var.c(b.b(visibleInsets));
                    x1 insets = m1Var.a();
                    insets.p(insets);
                    insets.d(v2.getRootView());
                    return insets;
                }
            }
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
        }
        return null;
    }
}
