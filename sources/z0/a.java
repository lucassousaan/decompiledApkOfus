package z0;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar$Behavior f3725a;

    public a(BottomAppBar$Behavior this$0) {
        this.f3725a = this$0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        WeakReference weakReference;
        weakReference = this.f3725a.f1257f;
        b child = (b) weakReference.get();
        if (child != null) {
        }
        v2.removeOnLayoutChangeListener(this);
    }
}
