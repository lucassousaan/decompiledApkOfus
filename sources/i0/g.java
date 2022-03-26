package i0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import b0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class g {
    public static EdgeEffect a(Context context, AttributeSet attrs) {
        if (a.c()) {
            return f.a(context, attrs);
        }
        return new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (a.c()) {
            return f.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        edgeEffect.onPull(deltaDistance, displacement);
    }

    public static float d(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        if (a.c()) {
            return f.c(edgeEffect, deltaDistance, displacement);
        }
        c(edgeEffect, deltaDistance, displacement);
        return deltaDistance;
    }
}
