package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import c.a;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public final View f576a;

    /* renamed from: d  reason: collision with root package name */
    public q3 f579d;

    /* renamed from: e  reason: collision with root package name */
    public q3 f580e;

    /* renamed from: f  reason: collision with root package name */
    public q3 f581f;

    /* renamed from: c  reason: collision with root package name */
    public int f578c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f577b = d0.b();

    public x(View view) {
        this.f576a = view;
    }

    public void e(AttributeSet attrs, int defStyleAttr) {
        Context context = this.f576a.getContext();
        int[] iArr = a.f1191y;
        s3 a2 = s3.v(context, attrs, iArr, defStyleAttr, 0);
        View view = this.f576a;
        c1.j0(view, view.getContext(), iArr, attrs, a2.r(), defStyleAttr, 0);
        try {
            int[] iArr2 = a.f1167a;
            if (a2.s(0)) {
                this.f578c = a2.n(0, -1);
                ColorStateList tint = this.f577b.f(this.f576a.getContext(), this.f578c);
                if (tint != null) {
                    h(tint);
                }
            }
            if (a2.s(1)) {
                c1.p0(this.f576a, a2.c(1));
            }
            if (a2.s(2)) {
                c1.q0(this.f576a, s1.c(a2.k(2, -1), null));
            }
        } finally {
            a2.w();
        }
    }

    public void g(int resId) {
        ColorStateList colorStateList;
        this.f578c = resId;
        d0 d0Var = this.f577b;
        if (d0Var != null) {
            colorStateList = d0Var.f(this.f576a.getContext(), resId);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    public void f() {
        this.f578c = -1;
        h(null);
        b();
    }

    public void i(ColorStateList tint) {
        if (this.f580e == null) {
            this.f580e = new q3();
        }
        q3 q3Var = this.f580e;
        q3Var.f508a = tint;
        q3Var.f511d = true;
        b();
    }

    public ColorStateList c() {
        q3 q3Var = this.f580e;
        if (q3Var != null) {
            return q3Var.f508a;
        }
        return null;
    }

    public void j(PorterDuff.Mode tintMode) {
        if (this.f580e == null) {
            this.f580e = new q3();
        }
        q3 q3Var = this.f580e;
        q3Var.f509b = tintMode;
        q3Var.f510c = true;
        b();
    }

    public PorterDuff.Mode d() {
        q3 q3Var = this.f580e;
        if (q3Var != null) {
            return q3Var.f509b;
        }
        return null;
    }

    public void b() {
        Drawable background = this.f576a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            q3 q3Var = this.f580e;
            if (q3Var != null) {
                d0.i(background, q3Var, this.f576a.getDrawableState());
                return;
            }
            q3 q3Var2 = this.f579d;
            if (q3Var2 != null) {
                d0.i(background, q3Var2, this.f576a.getDrawableState());
            }
        }
    }

    public void h(ColorStateList tint) {
        if (tint != null) {
            if (this.f579d == null) {
                this.f579d = new q3();
            }
            q3 q3Var = this.f579d;
            q3Var.f508a = tint;
            q3Var.f511d = true;
        } else {
            this.f579d = null;
        }
        b();
    }

    public final boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return this.f579d != null;
    }

    public final boolean a(Drawable background) {
        if (this.f581f == null) {
            this.f581f = new q3();
        }
        q3 info = this.f581f;
        info.a();
        ColorStateList tintList = c1.s(this.f576a);
        if (tintList != null) {
            info.f511d = true;
            info.f508a = tintList;
        }
        PorterDuff.Mode mode = c1.t(this.f576a);
        if (mode != null) {
            info.f510c = true;
            info.f509b = mode;
        }
        if (!info.f511d && !info.f510c) {
            return false;
        }
        d0.i(background, info, this.f576a.getDrawableState());
        return true;
    }
}
