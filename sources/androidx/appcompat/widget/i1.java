package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c.a;
import f0.c1;
import h0.b;
import i0.d;
import i0.s;
import java.lang.ref.WeakReference;
import w.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f354a;

    /* renamed from: b  reason: collision with root package name */
    public q3 f355b;

    /* renamed from: c  reason: collision with root package name */
    public q3 f356c;

    /* renamed from: d  reason: collision with root package name */
    public q3 f357d;

    /* renamed from: e  reason: collision with root package name */
    public q3 f358e;

    /* renamed from: f  reason: collision with root package name */
    public q3 f359f;

    /* renamed from: g  reason: collision with root package name */
    public q3 f360g;

    /* renamed from: h  reason: collision with root package name */
    public q3 f361h;

    /* renamed from: i  reason: collision with root package name */
    public final n1 f362i;

    /* renamed from: j  reason: collision with root package name */
    public int f363j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f364k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f365l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f366m;

    public i1(TextView view) {
        this.f354a = view;
        this.f362i = new n1(view);
    }

    public void m(AttributeSet attrs, int defStyleAttr) {
        boolean allCapsSet;
        boolean allCaps;
        String fontVariation;
        Drawable drawableTop;
        Drawable drawableRight;
        Drawable drawableBottom;
        Drawable drawableStart;
        int i2;
        Context context = this.f354a.getContext();
        d0 drawableManager = d0.b();
        int[] iArr = a.f1174h;
        s3 a2 = s3.v(context, attrs, iArr, defStyleAttr, 0);
        TextView textView = this.f354a;
        c1.j0(textView, textView.getContext(), iArr, attrs, a2.r(), defStyleAttr, 0);
        int[] iArr2 = a.f1167a;
        int ap = a2.n(0, -1);
        if (a2.s(3)) {
            this.f355b = d(context, drawableManager, a2.n(3, 0));
        }
        if (a2.s(1)) {
            this.f356c = d(context, drawableManager, a2.n(1, 0));
        }
        if (a2.s(4)) {
            this.f357d = d(context, drawableManager, a2.n(4, 0));
        }
        if (a2.s(2)) {
            this.f358e = d(context, drawableManager, a2.n(2, 0));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (a2.s(5)) {
            this.f359f = d(context, drawableManager, a2.n(5, 0));
        }
        if (a2.s(6)) {
            this.f360g = d(context, drawableManager, a2.n(6, 0));
        }
        a2.w();
        boolean hasPwdTm = this.f354a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps2 = false;
        boolean allCapsSet2 = false;
        String fontVariation2 = null;
        String localeListString = null;
        if (ap != -1) {
            s3 a3 = s3.t(context, ap, a.f1188v);
            if (!hasPwdTm && a3.s(14)) {
                allCapsSet2 = true;
                allCaps2 = a3.a(14, false);
            }
            C(context, a3);
            if (a3.s(15)) {
                localeListString = a3.o(15);
            }
            if (i3 >= 26 && a3.s(13)) {
                fontVariation2 = a3.o(13);
            }
            a3.w();
        }
        s3 a4 = s3.v(context, attrs, a.f1188v, defStyleAttr, 0);
        if (hasPwdTm || !a4.s(14)) {
            allCaps = allCaps2;
            allCapsSet = allCapsSet2;
        } else {
            allCaps = a4.a(14, false);
            allCapsSet = true;
        }
        if (a4.s(15)) {
            localeListString = a4.o(15);
        }
        if (i3 < 26 || !a4.s(13)) {
            fontVariation = fontVariation2;
        } else {
            fontVariation = a4.o(13);
        }
        if (i3 >= 28 && a4.s(0) && a4.f(0, -1) == 0) {
            this.f354a.setTextSize(0, 0.0f);
        }
        C(context, a4);
        a4.w();
        if (0 != 0) {
            this.f354a.setTextColor((ColorStateList) null);
        }
        if (0 != 0) {
            this.f354a.setHintTextColor((ColorStateList) null);
        }
        if (0 != 0) {
            this.f354a.setLinkTextColor((ColorStateList) null);
        }
        if (!hasPwdTm && allCapsSet) {
            s(allCaps);
        }
        Typeface typeface = this.f365l;
        if (typeface != null) {
            if (this.f364k == -1) {
                this.f354a.setTypeface(typeface, this.f363j);
            } else {
                this.f354a.setTypeface(typeface);
            }
        }
        if (fontVariation != null) {
            this.f354a.setFontVariationSettings(fontVariation);
        }
        if (localeListString != null) {
            this.f354a.setTextLocales(LocaleList.forLanguageTags(localeListString));
        }
        this.f362i.p(attrs, defStyleAttr);
        if (d.f2255a && this.f362i.k() != 0) {
            int[] autoSizeTextSizesInPx = this.f362i.j();
            if (autoSizeTextSizesInPx.length > 0) {
                if (this.f354a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f354a.setAutoSizeTextTypeUniformWithConfiguration(this.f362i.h(), this.f362i.g(), this.f362i.i(), 0);
                } else {
                    this.f354a.setAutoSizeTextTypeUniformWithPresetSizes(autoSizeTextSizesInPx, 0);
                }
            }
        }
        s3 a5 = s3.u(context, attrs, a.f1175i);
        Drawable drawableEnd = null;
        Drawable drawableLeft = null;
        int drawableLeftId = a5.n(8, -1);
        if (drawableLeftId != -1) {
            drawableLeft = drawableManager.c(context, drawableLeftId);
        }
        int drawableTopId = a5.n(13, -1);
        if (drawableTopId != -1) {
            drawableTop = drawableManager.c(context, drawableTopId);
        } else {
            drawableTop = null;
        }
        int drawableRightId = a5.n(9, -1);
        if (drawableRightId != -1) {
            Drawable drawableRight2 = drawableManager.c(context, drawableRightId);
            drawableRight = drawableRight2;
        } else {
            drawableRight = null;
        }
        int drawableBottomId = a5.n(6, -1);
        if (drawableBottomId != -1) {
            Drawable drawableBottom2 = drawableManager.c(context, drawableBottomId);
            drawableBottom = drawableBottom2;
        } else {
            drawableBottom = null;
        }
        int drawableStartId = a5.n(10, -1);
        if (drawableStartId != -1) {
            Drawable drawableStart2 = drawableManager.c(context, drawableStartId);
            drawableStart = drawableStart2;
        } else {
            drawableStart = null;
        }
        int drawableEndId = a5.n(7, -1);
        if (drawableEndId != -1) {
            drawableEnd = drawableManager.c(context, drawableEndId);
        }
        y(drawableLeft, drawableTop, drawableRight, drawableBottom, drawableStart, drawableEnd);
        if (a5.s(11)) {
            ColorStateList tintList = a5.c(11);
            s.g(this.f354a, tintList);
        }
        if (a5.s(12)) {
            i2 = -1;
            PorterDuff.Mode tintMode = s1.c(a5.k(12, -1), null);
            s.h(this.f354a, tintMode);
        } else {
            i2 = -1;
        }
        int firstBaselineToTopHeight = a5.f(14, i2);
        int lastBaselineToBottomHeight = a5.f(17, i2);
        int lineHeight = a5.f(18, i2);
        a5.w();
        if (firstBaselineToTopHeight != i2) {
            s.j(this.f354a, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != i2) {
            s.k(this.f354a, lastBaselineToBottomHeight);
        }
        if (lineHeight != i2) {
            s.l(this.f354a, lineHeight);
        }
    }

    public final void C(Context context, s3 a2) {
        String fontFamilyName;
        int[] iArr = a.f1167a;
        this.f363j = a2.k(2, this.f363j);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 >= 28) {
            int k2 = a2.k(11, -1);
            this.f364k = k2;
            if (k2 != -1) {
                this.f363j = (this.f363j & 2) | 0;
            }
        }
        int fontFamilyId = 10;
        if (a2.s(10) || a2.s(12)) {
            this.f365l = null;
            if (a2.s(12)) {
                fontFamilyId = 12;
            }
            int fontWeight = this.f364k;
            int style = this.f363j;
            if (!context.isRestricted()) {
                WeakReference<TextView> textViewWeak = new WeakReference<>(this.f354a);
                h replyCallback = new g1(this, fontWeight, style, textViewWeak);
                try {
                    Typeface typeface = a2.j(fontFamilyId, this.f363j, replyCallback);
                    if (typeface != null) {
                        if (i2 < 28 || this.f364k == -1) {
                            this.f365l = typeface;
                        } else {
                            this.f365l = Typeface.create(Typeface.create(typeface, 0), this.f364k, (this.f363j & 2) != 0);
                        }
                    }
                    this.f366m = this.f365l == null;
                } catch (Resources.NotFoundException e2) {
                } catch (UnsupportedOperationException e3) {
                }
            }
            if (this.f365l == null && (fontFamilyName = a2.o(fontFamilyId)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f364k == -1) {
                    this.f365l = Typeface.create(fontFamilyName, this.f363j);
                    return;
                }
                Typeface create = Typeface.create(fontFamilyName, 0);
                int i3 = this.f364k;
                if ((2 & this.f363j) != 0) {
                    z2 = true;
                }
                this.f365l = Typeface.create(create, i3, z2);
            }
        } else if (a2.s(1)) {
            this.f366m = false;
            int typefaceIndex = a2.k(1, 1);
            switch (typefaceIndex) {
                case 1:
                    this.f365l = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f365l = Typeface.SERIF;
                    return;
                case 3:
                    this.f365l = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f366m) {
            this.f365l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (c1.O(textView)) {
                int style = this.f363j;
                textView.post(new h1(this, textView, typeface, style));
                return;
            }
            textView.setTypeface(typeface, this.f363j);
        }
    }

    public void q(Context context, int resId) {
        String fontVariation;
        s3 a2 = s3.t(context, resId, a.f1188v);
        int[] iArr = a.f1167a;
        if (a2.s(14)) {
            s(a2.a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (a2.s(0) && a2.f(0, -1) == 0) {
            this.f354a.setTextSize(0, 0.0f);
        }
        C(context, a2);
        if (i2 >= 26 && a2.s(13) && (fontVariation = a2.o(13)) != null) {
            this.f354a.setFontVariationSettings(fontVariation);
        }
        a2.w();
        Typeface typeface = this.f365l;
        if (typeface != null) {
            this.f354a.setTypeface(typeface, this.f363j);
        }
    }

    public void s(boolean allCaps) {
        this.f354a.setAllCaps(allCaps);
    }

    public void p() {
        b();
    }

    public void b() {
        if (!(this.f355b == null && this.f356c == null && this.f357d == null && this.f358e == null)) {
            Drawable[] compoundDrawables = this.f354a.getCompoundDrawables();
            a(compoundDrawables[0], this.f355b);
            a(compoundDrawables[1], this.f356c);
            a(compoundDrawables[2], this.f357d);
            a(compoundDrawables[3], this.f358e);
        }
        if (this.f359f != null || this.f360g != null) {
            Drawable[] compoundDrawables2 = this.f354a.getCompoundDrawablesRelative();
            a(compoundDrawables2[0], this.f359f);
            a(compoundDrawables2[2], this.f360g);
        }
    }

    public final void a(Drawable drawable, q3 info) {
        if (drawable != null && info != null) {
            d0.i(drawable, info, this.f354a.getDrawableState());
        }
    }

    public static q3 d(Context context, d0 drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.f(context, drawableId);
        if (tintList == null) {
            return null;
        }
        q3 tintInfo = new q3();
        tintInfo.f511d = true;
        tintInfo.f508a = tintList;
        return tintInfo;
    }

    public void o() {
        if (!d.f2255a) {
            c();
        }
    }

    public void A(int unit, float size) {
        if (!d.f2255a && !l()) {
            B(unit, size);
        }
    }

    public void c() {
        this.f362i.a();
    }

    public boolean l() {
        return this.f362i.o();
    }

    public final void B(int unit, float size) {
        this.f362i.u(unit, size);
    }

    public void v(int autoSizeTextType) {
        this.f362i.s(autoSizeTextType);
    }

    public void t(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.f362i.q(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    public void u(int[] presetSizes, int unit) {
        this.f362i.r(presetSizes, unit);
    }

    public int i() {
        return this.f362i.k();
    }

    public int g() {
        return this.f362i.i();
    }

    public int f() {
        return this.f362i.h();
    }

    public int e() {
        return this.f362i.g();
    }

    public int[] h() {
        return this.f362i.j();
    }

    public ColorStateList j() {
        q3 q3Var = this.f361h;
        if (q3Var != null) {
            return q3Var.f508a;
        }
        return null;
    }

    public void w(ColorStateList tintList) {
        if (this.f361h == null) {
            this.f361h = new q3();
        }
        q3 q3Var = this.f361h;
        q3Var.f508a = tintList;
        q3Var.f511d = tintList != null;
        z();
    }

    public PorterDuff.Mode k() {
        q3 q3Var = this.f361h;
        if (q3Var != null) {
            return q3Var.f509b;
        }
        return null;
    }

    public void x(PorterDuff.Mode tintMode) {
        if (this.f361h == null) {
            this.f361h = new q3();
        }
        q3 q3Var = this.f361h;
        q3Var.f509b = tintMode;
        q3Var.f510c = tintMode != null;
        z();
    }

    public final void z() {
        q3 q3Var = this.f361h;
        this.f355b = q3Var;
        this.f356c = q3Var;
        this.f357d = q3Var;
        this.f358e = q3Var;
        this.f359f = q3Var;
        this.f360g = q3Var;
    }

    public final void y(Drawable drawableLeft, Drawable drawableTop, Drawable drawableRight, Drawable drawableBottom, Drawable drawableStart, Drawable drawableEnd) {
        if (drawableStart != null || drawableEnd != null) {
            Drawable[] existingRel = this.f354a.getCompoundDrawablesRelative();
            this.f354a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableStart != null ? drawableStart : existingRel[0], drawableTop != null ? drawableTop : existingRel[1], drawableEnd != null ? drawableEnd : existingRel[2], drawableBottom != null ? drawableBottom : existingRel[3]);
        } else if (drawableLeft != null || drawableTop != null || drawableRight != null || drawableBottom != null) {
            Drawable[] existingRel2 = this.f354a.getCompoundDrawablesRelative();
            if (existingRel2[0] == null && existingRel2[2] == null) {
                Drawable[] existingAbs = this.f354a.getCompoundDrawables();
                this.f354a.setCompoundDrawablesWithIntrinsicBounds(drawableLeft != null ? drawableLeft : existingAbs[0], drawableTop != null ? drawableTop : existingAbs[1], drawableRight != null ? drawableRight : existingAbs[2], drawableBottom != null ? drawableBottom : existingAbs[3]);
                return;
            }
            this.f354a.setCompoundDrawablesRelativeWithIntrinsicBounds(existingRel2[0], drawableTop != null ? drawableTop : existingRel2[1], existingRel2[2], drawableBottom != null ? drawableBottom : existingRel2[3]);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            b.e(editorInfo, textView.getText());
        }
    }
}
