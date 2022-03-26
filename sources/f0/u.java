package f0;

import android.view.MotionEvent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(MotionEvent event, int source) {
        return (event.getSource() & source) == source;
    }
}
