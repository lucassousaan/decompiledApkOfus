package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements k {
    @Override // androidx.lifecycle.k
    public void g(m source, h event) {
        if (event == h.ON_DESTROY) {
            Handler handler = null;
            handler.removeCallbacks(null);
            throw null;
        }
    }
}
