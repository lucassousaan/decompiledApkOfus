package w0;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import n0.b;
import n0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f3651a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f3652b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f3653c = new n0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f3654d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f3655e = new DecelerateInterpolator();

    public static float a(float startValue, float endValue, float fraction) {
        return ((endValue - startValue) * fraction) + startValue;
    }
}
