package d;

import android.os.Bundle;
import androidx.savedstate.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f1679a;

    public m(o this$0) {
        this.f1679a = this$0;
    }

    @Override // androidx.savedstate.c
    public Bundle a() {
        Bundle outState = new Bundle();
        this.f1679a.x().u(outState);
        return outState;
    }
}
