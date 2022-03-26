package androidx.appcompat.widget;

import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j2 f367b;

    public i2(j2 j2Var) {
        this.f367b = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        v1 v1Var = this.f367b.f386d;
        if (v1Var != null && c1.O(v1Var) && this.f367b.f386d.getCount() > this.f367b.f386d.getChildCount()) {
            int childCount = this.f367b.f386d.getChildCount();
            j2 j2Var = this.f367b;
            if (childCount <= j2Var.f398p) {
                j2Var.C.setInputMethodMode(2);
                this.f367b.i();
            }
        }
    }
}
