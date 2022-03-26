package k1;

import android.util.Property;
import android.view.View;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c extends Property {
    public c(Class cls, String x1) {
        super(cls, x1);
    }

    /* renamed from: b */
    public void set(View object, Float value) {
        c1.v0(object, value.intValue(), object.getPaddingTop(), c1.E(object), object.getPaddingBottom());
    }

    /* renamed from: a */
    public Float get(View object) {
        return Float.valueOf(c1.F(object));
    }
}
