package s1;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3520a;

    public q(z this$0) {
        this.f3520a = this$0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View v2, boolean hasFocus) {
        this.f3520a.f3453a.setEndIconActivated(hasFocus);
        if (!hasFocus) {
            this.f3520a.E(false);
            this.f3520a.f3543i = false;
        }
    }
}
