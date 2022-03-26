package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import k.g;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n2 extends g {
    public n2(int maxSize) {
        super(maxSize);
    }

    public PorterDuffColorFilter i(int color, PorterDuff.Mode mode) {
        return (PorterDuffColorFilter) c(Integer.valueOf(h(color, mode)));
    }

    public PorterDuffColorFilter j(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
        return (PorterDuffColorFilter) d(Integer.valueOf(h(color, mode)), filter);
    }

    public static int h(int color, PorterDuff.Mode mode) {
        int hashCode = (1 * 31) + color;
        return (hashCode * 31) + mode.hashCode();
    }
}
