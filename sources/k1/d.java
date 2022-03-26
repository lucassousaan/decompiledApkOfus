package k1;

import android.util.Property;
import android.view.View;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d extends Property {
    public d(Class cls, String x1) {
        super(cls, x1);
    }

    /* renamed from: b */
    public void set(View object, Float value) {
        c1.v0(object, c1.F(object), object.getPaddingTop(), value.intValue(), object.getPaddingBottom());
    }

    /* renamed from: a */
    public Float get(View object) {
        return Float.valueOf(c1.E(object));
    }
}
