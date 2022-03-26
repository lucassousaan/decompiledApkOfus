package q0;

import android.database.Observable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y0 extends Observable {
    public boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public void b() {
        for (int i2 = ((Observable) this).mObservers.size() - 1; i2 >= 0; i2--) {
            ((z0) ((Observable) this).mObservers.get(i2)).a();
        }
    }
}
