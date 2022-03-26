package l0;

import android.view.animation.Interpolator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class i implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float t2) {
        float t3 = t2 - 1.0f;
        return (t3 * t3 * t3 * t3 * t3) + 1.0f;
    }
}
