package g;

import android.view.animation.Interpolator;
import f0.h1;
import f0.i1;
import f0.j1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f1999c;

    /* renamed from: d  reason: collision with root package name */
    public i1 f2000d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2001e;

    /* renamed from: b  reason: collision with root package name */
    public long f1998b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final j1 f2002f = new l(this);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1997a = new ArrayList();

    public m c(h1 animator) {
        if (!this.f2001e) {
            this.f1997a.add(animator);
        }
        return this;
    }

    public m d(h1 anim1, h1 anim2) {
        this.f1997a.add(anim1);
        anim2.h(anim1.c());
        this.f1997a.add(anim2);
        return this;
    }

    public void h() {
        if (!this.f2001e) {
            Iterator it = this.f1997a.iterator();
            while (it.hasNext()) {
                h1 animator = (h1) it.next();
                long j2 = this.f1998b;
                if (j2 >= 0) {
                    animator.d(j2);
                }
                Interpolator interpolator = this.f1999c;
                if (interpolator != null) {
                    animator.e(interpolator);
                }
                if (this.f2000d != null) {
                    animator.f(this.f2002f);
                }
                animator.j();
            }
            this.f2001e = true;
        }
    }

    public void b() {
        this.f2001e = false;
    }

    public void a() {
        if (this.f2001e) {
            Iterator it = this.f1997a.iterator();
            while (it.hasNext()) {
                h1 animator = (h1) it.next();
                animator.b();
            }
            this.f2001e = false;
        }
    }

    public m e(long duration) {
        if (!this.f2001e) {
            this.f1998b = duration;
        }
        return this;
    }

    public m f(Interpolator interpolator) {
        if (!this.f2001e) {
            this.f1999c = interpolator;
        }
        return this;
    }

    public m g(i1 listener) {
        if (!this.f2001e) {
            this.f2000d = listener;
        }
        return this;
    }
}
