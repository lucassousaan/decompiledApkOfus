package f0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class x0 {
    public static void b(View view, CharSequence stateDescription) {
        view.setStateDescription(stateDescription);
    }

    public static CharSequence a(View view) {
        return view.getStateDescription();
    }
}
