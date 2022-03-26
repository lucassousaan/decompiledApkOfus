package androidx.fragment.app;

import a.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f791a;

    public h0(j0 this$0) {
        this.f791a = this$0;
    }

    @Override // a.b
    public void a(Context context) {
        this.f791a.f807i.a(null);
        Bundle savedInstanceState = this.f791a.b().a("android:support:fragments");
        if (savedInstanceState != null) {
            Parcelable p2 = savedInstanceState.getParcelable("android:support:fragments");
            this.f791a.f807i.w(p2);
        }
    }
}
