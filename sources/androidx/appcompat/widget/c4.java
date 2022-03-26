package androidx.appcompat.widget;

import android.view.View;
import f0.j1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c4 extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f277a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f278b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d4 f279c;

    public c4(d4 this$0, int i2) {
        this.f279c = this$0;
        this.f278b = i2;
    }

    @Override // f0.j1, f0.i1
    public void b(View view) {
        this.f279c.f286a.setVisibility(0);
    }

    @Override // f0.i1
    public void a(View view) {
        if (!this.f277a) {
            this.f279c.f286a.setVisibility(this.f278b);
        }
    }

    @Override // f0.j1, f0.i1
    public void c(View view) {
        this.f277a = true;
    }
}
