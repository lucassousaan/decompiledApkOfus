package q1;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3350a;

    public l(float percent) {
        this.f3350a = percent;
    }

    @Override // q1.c
    public float a(RectF bounds) {
        return this.f3350a * bounds.height();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (!(o2 instanceof l)) {
            return false;
        }
        l that = (l) o2;
        return this.f3350a == that.f3350a;
    }

    public int hashCode() {
        Object[] hashedFields = {Float.valueOf(this.f3350a)};
        return Arrays.hashCode(hashedFields);
    }
}
