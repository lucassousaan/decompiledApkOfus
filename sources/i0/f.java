package i0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f {
    public static EdgeEffect a(Context context, AttributeSet attrs) {
        try {
            return new EdgeEffect(context, attrs);
        } catch (Throwable th) {
            return new EdgeEffect(context);
        }
    }

    public static float c(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        try {
            return edgeEffect.onPullDistance(deltaDistance, displacement);
        } catch (Throwable th) {
            edgeEffect.onPull(deltaDistance, displacement);
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable th) {
            return 0.0f;
        }
    }
}
