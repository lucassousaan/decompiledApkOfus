package q1;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3287a;

    public a(float size) {
        this.f3287a = size;
    }

    @Override // q1.c
    public float a(RectF bounds) {
        return this.f3287a;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof a)) {
            return false;
        }
        a that = (a) o2;
        return this.f3287a == that.f3287a;
    }

    public int hashCode() {
        Object[] hashedFields = {Float.valueOf(this.f3287a)};
        return Arrays.hashCode(hashedFields);
    }
}
