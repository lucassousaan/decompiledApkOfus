package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import c.a;
import f0.c1;
import i0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f332a;

    /* renamed from: b  reason: collision with root package name */
    public q3 f333b;

    public h0(ImageView view) {
        this.f332a = view;
    }

    public void e(AttributeSet attrs, int defStyleAttr) {
        Context context = this.f332a.getContext();
        int[] iArr = a.f1172f;
        s3 a2 = s3.v(context, attrs, iArr, defStyleAttr, 0);
        ImageView imageView = this.f332a;
        c1.j0(imageView, imageView.getContext(), iArr, attrs, a2.r(), defStyleAttr, 0);
        try {
            Drawable drawable = this.f332a.getDrawable();
            if (drawable == null) {
                int[] iArr2 = a.f1167a;
                int id = a2.n(1, -1);
                if (!(id == -1 || (drawable = e.a.b(this.f332a.getContext(), id)) == null)) {
                    this.f332a.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                s1.b(drawable);
            }
            int[] iArr3 = a.f1167a;
            if (a2.s(2)) {
                h.a(this.f332a, a2.c(2));
            }
            if (a2.s(3)) {
                h.b(this.f332a, s1.c(a2.k(3, -1), null));
            }
        } finally {
            a2.w();
        }
    }

    public void f(int resId) {
        if (resId != 0) {
            Drawable d2 = e.a.b(this.f332a.getContext(), resId);
            if (d2 != null) {
                s1.b(d2);
            }
            this.f332a.setImageDrawable(d2);
        } else {
            this.f332a.setImageDrawable(null);
        }
        a();
    }

    public boolean d() {
        Drawable background = this.f332a.getBackground();
        if (background instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(ColorStateList tint) {
        if (this.f333b == null) {
            this.f333b = new q3();
        }
        q3 q3Var = this.f333b;
        q3Var.f508a = tint;
        q3Var.f511d = true;
        a();
    }

    public ColorStateList b() {
        q3 q3Var = this.f333b;
        if (q3Var != null) {
            return q3Var.f508a;
        }
        return null;
    }

    public void h(PorterDuff.Mode tintMode) {
        if (this.f333b == null) {
            this.f333b = new q3();
        }
        q3 q3Var = this.f333b;
        q3Var.f509b = tintMode;
        q3Var.f510c = true;
        a();
    }

    public PorterDuff.Mode c() {
        q3 q3Var = this.f333b;
        if (q3Var != null) {
            return q3Var.f509b;
        }
        return null;
    }

    public void a() {
        Drawable imageViewDrawable = this.f332a.getDrawable();
        if (imageViewDrawable != null) {
            s1.b(imageViewDrawable);
        }
        if (imageViewDrawable != null) {
            i();
            q3 q3Var = this.f333b;
            if (q3Var != null) {
                d0.i(imageViewDrawable, q3Var, this.f332a.getDrawableState());
            }
        }
    }

    public final boolean i() {
        int i2 = Build.VERSION.SDK_INT;
        return false;
    }
}
