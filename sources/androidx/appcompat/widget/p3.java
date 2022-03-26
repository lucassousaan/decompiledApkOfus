package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class p3 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f481a = new Object();

    public static Context b(Context context) {
        a(context);
        return context;
    }

    public static boolean a(Context context) {
        if ((context instanceof p3) || (context.getResources() instanceof r3) || (context.getResources() instanceof j4)) {
            return false;
        }
        j4.b();
        return false;
    }
}
