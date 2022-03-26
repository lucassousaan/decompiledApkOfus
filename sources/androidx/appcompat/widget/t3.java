package androidx.appcompat.widget;

import android.view.MenuItem;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t3 implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Toolbar f541a;

    public t3(Toolbar this$0) {
        this.f541a = this$0;
    }

    public boolean a(MenuItem item) {
        y3 y3Var = this.f541a.H;
        if (y3Var != null) {
            return y3Var.onMenuItemClick(item);
        }
        return false;
    }
}
