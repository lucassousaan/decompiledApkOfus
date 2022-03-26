package q1;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f3289a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3290b;

    public b(float adjustment, c other) {
        while (other instanceof b) {
            other = ((b) other).f3289a;
            adjustment += ((b) other).f3290b;
        }
        this.f3289a = other;
        this.f3290b = adjustment;
    }

    @Override // q1.c
    public float a(RectF bounds) {
        return Math.max(0.0f, this.f3289a.a(bounds) + this.f3290b);
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof b)) {
            return false;
        }
        b that = (b) o2;
        return this.f3289a.equals(that.f3289a) && this.f3290b == that.f3290b;
    }

    public int hashCode() {
        Object[] hashedFields = {this.f3289a, Float.valueOf(this.f3290b)};
        return Arrays.hashCode(hashedFields);
    }
}
