package e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.q2;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1803a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f1804b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1805c = new Object();

    public static ColorStateList a(Context context, int resId) {
        return context.getColorStateList(resId);
    }

    public static Drawable b(Context context, int resId) {
        return q2.g().i(context, resId);
    }
}
