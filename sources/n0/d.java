package n0;

import android.view.animation.Interpolator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2557a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2558b;

    public d(float[] values) {
        this.f2557a = values;
        this.f2558b = 1.0f / (values.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        if (input >= 1.0f) {
            return 1.0f;
        }
        if (input <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2557a;
        int position = Math.min((int) ((fArr.length - 1) * input), fArr.length - 2);
        float f2 = this.f2558b;
        float quantized = position * f2;
        float diff = input - quantized;
        float weight = diff / f2;
        float[] fArr2 = this.f2557a;
        return fArr2[position] + ((fArr2[position + 1] - fArr2[position]) * weight);
    }
}
