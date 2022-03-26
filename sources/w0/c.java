package w0;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends Property {

    /* renamed from: a  reason: collision with root package name */
    public static final Property f3656a = new c("childrenAlpha");

    public c(String name) {
        super(Float.class, name);
    }

    /* renamed from: a */
    public Float get(ViewGroup object) {
        Float alpha = (Float) object.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (alpha != null) {
            return alpha;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(ViewGroup object, Float value) {
        float alpha = value.floatValue();
        object.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(alpha));
        int count = object.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = object.getChildAt(i2);
            child.setAlpha(alpha);
        }
    }
}
