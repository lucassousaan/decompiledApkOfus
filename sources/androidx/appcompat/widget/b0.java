package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import c.a;
import f0.c1;
import i0.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f243a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f244b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f245c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f246d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f247e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f248f;

    public b0(CompoundButton view) {
        this.f243a = view;
    }

    public void e(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        int resourceId2;
        Context context = this.f243a.getContext();
        int[] iArr = a.f1178l;
        s3 a2 = s3.v(context, attrs, iArr, defStyleAttr, 0);
        CompoundButton compoundButton = this.f243a;
        c1.j0(compoundButton, compoundButton.getContext(), iArr, attrs, a2.r(), defStyleAttr, 0);
        boolean buttonDrawableLoaded = false;
        try {
            int[] iArr2 = a.f1167a;
            if (a2.s(1) && (resourceId2 = a2.n(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f243a;
                    compoundButton2.setButtonDrawable(e.a.b(compoundButton2.getContext(), resourceId2));
                    buttonDrawableLoaded = true;
                } catch (Resources.NotFoundException e2) {
                }
            }
            if (!buttonDrawableLoaded) {
                int[] iArr3 = a.f1167a;
                if (a2.s(0) && (resourceId = a2.n(0, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f243a;
                    compoundButton3.setButtonDrawable(e.a.b(compoundButton3.getContext(), resourceId));
                }
            }
            int[] iArr4 = a.f1167a;
            if (a2.s(2)) {
                e.c(this.f243a, a2.c(2));
            }
            if (a2.s(3)) {
                e.d(this.f243a, s1.c(a2.k(3, -1), null));
            }
        } finally {
            a2.w();
        }
    }

    public void g(ColorStateList tint) {
        this.f244b = tint;
        this.f246d = true;
        a();
    }

    public ColorStateList c() {
        return this.f244b;
    }

    public void h(PorterDuff.Mode tintMode) {
        this.f245c = tintMode;
        this.f247e = true;
        a();
    }

    public PorterDuff.Mode d() {
        return this.f245c;
    }

    public void f() {
        if (this.f248f) {
            this.f248f = false;
            return;
        }
        this.f248f = true;
        a();
    }

    public void a() {
        Drawable buttonDrawable = e.a(this.f243a);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f246d || this.f247e) {
            Drawable buttonDrawable2 = y.a.l(buttonDrawable).mutate();
            if (this.f246d) {
                y.a.i(buttonDrawable2, this.f244b);
            }
            if (this.f247e) {
                y.a.j(buttonDrawable2, this.f245c);
            }
            if (buttonDrawable2.isStateful()) {
                buttonDrawable2.setState(this.f243a.getDrawableState());
            }
            this.f243a.setButtonDrawable(buttonDrawable2);
        }
    }

    public int b(int superValue) {
        return superValue;
    }
}
