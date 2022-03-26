package x0;

import android.view.View;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final View f3710a;

    /* renamed from: b  reason: collision with root package name */
    public int f3711b;

    /* renamed from: c  reason: collision with root package name */
    public int f3712c;

    /* renamed from: d  reason: collision with root package name */
    public int f3713d;

    /* renamed from: e  reason: collision with root package name */
    public int f3714e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3715f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3716g = true;

    public i(View view) {
        this.f3710a = view;
    }

    public void c() {
        this.f3711b = this.f3710a.getTop();
        this.f3712c = this.f3710a.getLeft();
    }

    public void a() {
        View view = this.f3710a;
        c1.W(view, this.f3713d - (view.getTop() - this.f3711b));
        View view2 = this.f3710a;
        c1.V(view2, this.f3714e - (view2.getLeft() - this.f3712c));
    }

    public boolean e(int offset) {
        if (this.f3713d == offset) {
            return false;
        }
        this.f3713d = offset;
        a();
        return true;
    }

    public boolean d(int offset) {
        if (this.f3714e == offset) {
            return false;
        }
        this.f3714e = offset;
        a();
        return true;
    }

    public int b() {
        return this.f3713d;
    }
}
