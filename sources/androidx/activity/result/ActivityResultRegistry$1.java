package androidx.activity.result;

import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class ActivityResultRegistry$1 implements k {
    @Override // androidx.lifecycle.k
    public void g(m lifecycleOwner, h event) {
        h hVar = null;
        if (h.ON_START.equals(event)) {
            throw null;
        } else if (h.ON_STOP.equals(event)) {
            throw null;
        } else if (h.ON_DESTROY.equals(event)) {
            hVar.i(null);
            throw null;
        }
    }
}
