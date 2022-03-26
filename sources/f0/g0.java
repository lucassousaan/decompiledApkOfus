package f0;

import android.text.TextUtils;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g0 extends k0 {
    public g0(int tagKey, Class cls, int contentChangeType, int frameworkMinimumSdk) {
        super(tagKey, cls, contentChangeType, frameworkMinimumSdk);
    }

    /* renamed from: i */
    public CharSequence d(View view) {
        return v0.b(view);
    }

    /* renamed from: j */
    public void e(View view, CharSequence value) {
        v0.h(view, value);
    }

    /* renamed from: k */
    public boolean h(CharSequence oldValue, CharSequence newValue) {
        return !TextUtils.equals(oldValue, newValue);
    }
}
