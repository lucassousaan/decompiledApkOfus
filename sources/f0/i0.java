package f0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i0 extends k0 {
    public i0(int tagKey, Class cls, int frameworkMinimumSdk) {
        super(tagKey, cls, frameworkMinimumSdk);
    }

    /* renamed from: i */
    public Boolean d(View view) {
        return Boolean.valueOf(v0.c(view));
    }

    /* renamed from: j */
    public void e(View view, Boolean value) {
        v0.g(view, value.booleanValue());
    }

    /* renamed from: k */
    public boolean h(Boolean oldValue, Boolean newValue) {
        return !a(oldValue, newValue);
    }
}
