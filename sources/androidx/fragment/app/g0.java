package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.h;
import androidx.savedstate.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f786a;

    public g0(j0 this$0) {
        this.f786a = this$0;
    }

    @Override // androidx.savedstate.c
    public Bundle a() {
        Bundle outState = new Bundle();
        this.f786a.r();
        this.f786a.f808j.h(h.ON_STOP);
        Parcelable p2 = this.f786a.f807i.x();
        if (p2 != null) {
            outState.putParcelable("android:support:fragments", p2);
        }
        return outState;
    }
}
