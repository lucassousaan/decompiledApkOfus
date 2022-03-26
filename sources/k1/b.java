package k1;

import android.util.Property;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b extends Property {
    public b(Class cls, String x1) {
        super(cls, x1);
    }

    /* renamed from: b */
    public void set(View object, Float value) {
        object.getLayoutParams().height = value.intValue();
        object.requestLayout();
    }

    /* renamed from: a */
    public Float get(View object) {
        return Float.valueOf(object.getLayoutParams().height);
    }
}
