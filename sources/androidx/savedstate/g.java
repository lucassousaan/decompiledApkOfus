package androidx.savedstate;

import android.view.View;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class g {
    public static void a(View view, f owner) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, owner);
    }
}
