package androidx.fragment.app;

import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class FragmentManager$6 implements k {
    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        Map unused;
        j jVar = null;
        if (event == h.ON_START) {
            unused = null.f844j;
            throw null;
        } else if (event == h.ON_DESTROY) {
            jVar.c(this);
            throw null;
        }
    }
}
