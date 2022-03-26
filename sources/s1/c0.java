package s1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.j1;
import com.example.helloworld.R;
import com.google.android.material.textfield.TextInputLayout;
import f0.c1;
import i0.s;
import java.util.ArrayList;
import java.util.List;
import n1.d;
import w0.a;
import w0.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3463a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f3464b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f3465c;

    /* renamed from: d  reason: collision with root package name */
    public int f3466d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f3467e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f3468f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3469g;

    /* renamed from: h  reason: collision with root package name */
    public int f3470h;

    /* renamed from: i  reason: collision with root package name */
    public int f3471i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3472j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3473k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f3474l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f3475m;

    /* renamed from: n  reason: collision with root package name */
    public int f3476n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f3477o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f3478p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3479q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f3480r;

    /* renamed from: s  reason: collision with root package name */
    public int f3481s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f3482t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f3483u;

    public c0(TextInputLayout textInputView) {
        Context context = textInputView.getContext();
        this.f3463a = context;
        this.f3464b = textInputView;
        this.f3469g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void N(CharSequence helperText) {
        g();
        this.f3478p = helperText;
        this.f3480r.setText(helperText);
        int i2 = this.f3470h;
        if (i2 != 2) {
            this.f3471i = 2;
        }
        O(i2, this.f3471i, L(this.f3480r, helperText));
    }

    public void u() {
        g();
        int i2 = this.f3470h;
        if (i2 == 2) {
            this.f3471i = 0;
        }
        O(i2, this.f3471i, L(this.f3480r, null));
    }

    public void M(CharSequence errorText) {
        g();
        this.f3472j = errorText;
        this.f3474l.setText(errorText);
        int i2 = this.f3470h;
        if (i2 != 1) {
            this.f3471i = 1;
        }
        O(i2, this.f3471i, L(this.f3474l, errorText));
    }

    public void t() {
        this.f3472j = null;
        g();
        if (this.f3470h == 1) {
            if (!this.f3479q || TextUtils.isEmpty(this.f3478p)) {
                this.f3471i = 0;
            } else {
                this.f3471i = 2;
            }
        }
        O(this.f3470h, this.f3471i, L(this.f3474l, null));
    }

    public final boolean L(TextView captionView, CharSequence captionText) {
        return c1.P(this.f3464b) && this.f3464b.isEnabled() && (this.f3471i != this.f3470h || captionView == null || !TextUtils.equals(captionView.getText(), captionText));
    }

    public final void O(int captionToHide, int captionToShow, boolean animate) {
        if (captionToHide != captionToShow) {
            if (animate) {
                AnimatorSet captionAnimator = new AnimatorSet();
                this.f3468f = captionAnimator;
                List<Animator> captionAnimatorList = new ArrayList<>();
                h(captionAnimatorList, this.f3479q, this.f3480r, 2, captionToHide, captionToShow);
                h(captionAnimatorList, this.f3473k, this.f3474l, 1, captionToHide, captionToShow);
                b.a(captionAnimator, captionAnimatorList);
                TextView captionViewToHide = l(captionToHide);
                TextView captionViewToShow = l(captionToShow);
                captionAnimator.addListener(new b0(this, captionToShow, captionViewToHide, captionToHide, captionViewToShow));
                captionAnimator.start();
            } else {
                A(captionToHide, captionToShow);
            }
            this.f3464b.s0();
            this.f3464b.v0(animate);
            this.f3464b.F0();
        }
    }

    public final void A(int captionToHide, int captionToShow) {
        TextView captionViewDisplayed;
        TextView captionViewToShow;
        if (captionToHide != captionToShow) {
            if (!(captionToShow == 0 || (captionViewToShow = l(captionToShow)) == null)) {
                captionViewToShow.setVisibility(0);
                captionViewToShow.setAlpha(1.0f);
            }
            if (!(captionToHide == 0 || (captionViewDisplayed = l(captionToHide)) == null)) {
                captionViewDisplayed.setVisibility(4);
                if (captionToHide == 1) {
                    captionViewDisplayed.setText((CharSequence) null);
                }
            }
            this.f3470h = captionToShow;
        }
    }

    public final void h(List list, boolean captionEnabled, TextView captionView, int captionState, int captionToHide, int captionToShow) {
        if (captionView != null && captionEnabled) {
            if (captionState == captionToShow || captionState == captionToHide) {
                list.add(i(captionView, captionToShow == captionState));
                if (captionToShow == captionState) {
                    list.add(j(captionView));
                }
            }
        }
    }

    public final ObjectAnimator i(TextView captionView, boolean display) {
        float endValue = display ? 1.0f : 0.0f;
        ObjectAnimator opacityAnimator = ObjectAnimator.ofFloat(captionView, View.ALPHA, endValue);
        opacityAnimator.setDuration(167L);
        opacityAnimator.setInterpolator(a.f3651a);
        return opacityAnimator;
    }

    public final ObjectAnimator j(TextView captionView) {
        ObjectAnimator translationYAnimator = ObjectAnimator.ofFloat(captionView, View.TRANSLATION_Y, -this.f3469g, 0.0f);
        translationYAnimator.setDuration(217L);
        translationYAnimator.setInterpolator(a.f3654d);
        return translationYAnimator;
    }

    public void g() {
        Animator animator = this.f3468f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean w(int index) {
        return index == 0 || index == 1;
    }

    public final TextView l(int captionDisplayState) {
        switch (captionDisplayState) {
            case 1:
                return this.f3474l;
            case 2:
                return this.f3480r;
            default:
                return null;
        }
    }

    public void e() {
        if (f()) {
            EditText editText = this.f3464b.getEditText();
            boolean isFontScaleLarge = d.g(this.f3463a);
            c1.v0(this.f3465c, s(isFontScaleLarge, R.dimen.material_helper_text_font_1_3_padding_horizontal, c1.F(editText)), s(isFontScaleLarge, R.dimen.material_helper_text_font_1_3_padding_top, this.f3463a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), s(isFontScaleLarge, R.dimen.material_helper_text_font_1_3_padding_horizontal, c1.E(editText)), 0);
        }
    }

    public final boolean f() {
        return (this.f3465c == null || this.f3464b.getEditText() == null) ? false : true;
    }

    public final int s(boolean isFontScaleLarge, int largeFontPaddingRes, int defaultPadding) {
        return isFontScaleLarge ? this.f3463a.getResources().getDimensionPixelSize(largeFontPaddingRes) : defaultPadding;
    }

    public void d(TextView indicator, int index) {
        if (this.f3465c == null && this.f3467e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f3463a);
            this.f3465c = linearLayout;
            linearLayout.setOrientation(0);
            this.f3464b.addView(this.f3465c, -1, -2);
            this.f3467e = new FrameLayout(this.f3463a);
            LinearLayout.LayoutParams captionAreaLp = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.f3465c.addView(this.f3467e, captionAreaLp);
            if (this.f3464b.getEditText() != null) {
                e();
            }
        }
        if (w(index)) {
            this.f3467e.setVisibility(0);
            this.f3467e.addView(indicator);
        } else {
            LinearLayout.LayoutParams indicatorAreaLp = new LinearLayout.LayoutParams(-2, -2);
            this.f3465c.addView(indicator, indicatorAreaLp);
        }
        this.f3465c.setVisibility(0);
        this.f3466d++;
    }

    public void z(TextView indicator, int index) {
        FrameLayout frameLayout;
        if (this.f3465c != null) {
            if (!w(index) || (frameLayout = this.f3467e) == null) {
                this.f3465c.removeView(indicator);
            } else {
                frameLayout.removeView(indicator);
            }
            int i2 = this.f3466d - 1;
            this.f3466d = i2;
            K(this.f3465c, i2);
        }
    }

    public final void K(ViewGroup viewGroup, int indicatorsAdded) {
        if (indicatorsAdded == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public void C(boolean enabled) {
        if (this.f3473k != enabled) {
            g();
            if (enabled) {
                j1 j1Var = new j1(this.f3463a);
                this.f3474l = j1Var;
                j1Var.setId(R.id.textinput_error);
                this.f3474l.setTextAlignment(5);
                Typeface typeface = this.f3483u;
                if (typeface != null) {
                    this.f3474l.setTypeface(typeface);
                }
                D(this.f3476n);
                E(this.f3477o);
                B(this.f3475m);
                this.f3474l.setVisibility(4);
                c1.n0(this.f3474l, 1);
                d(this.f3474l, 0);
            } else {
                t();
                z(this.f3474l, 0);
                this.f3474l = null;
                this.f3464b.s0();
                this.f3464b.F0();
            }
            this.f3473k = enabled;
        }
    }

    public boolean x() {
        return this.f3473k;
    }

    public boolean y() {
        return this.f3479q;
    }

    public void G(boolean enabled) {
        if (this.f3479q != enabled) {
            g();
            if (enabled) {
                j1 j1Var = new j1(this.f3463a);
                this.f3480r = j1Var;
                j1Var.setId(R.id.textinput_helper_text);
                this.f3480r.setTextAlignment(5);
                Typeface typeface = this.f3483u;
                if (typeface != null) {
                    this.f3480r.setTypeface(typeface);
                }
                this.f3480r.setVisibility(4);
                c1.n0(this.f3480r, 1);
                F(this.f3481s);
                H(this.f3482t);
                d(this.f3480r, 1);
            } else {
                u();
                z(this.f3480r, 1);
                this.f3480r = null;
                this.f3464b.s0();
                this.f3464b.F0();
            }
            this.f3479q = enabled;
        }
    }

    public boolean k() {
        return v(this.f3471i);
    }

    public final boolean v(int captionState) {
        return captionState == 1 && this.f3474l != null && !TextUtils.isEmpty(this.f3472j);
    }

    public CharSequence n() {
        return this.f3472j;
    }

    public CharSequence q() {
        return this.f3478p;
    }

    public void J(Typeface typeface) {
        if (typeface != this.f3483u) {
            this.f3483u = typeface;
            I(this.f3474l, typeface);
            I(this.f3480r, typeface);
        }
    }

    public final void I(TextView captionView, Typeface typeface) {
        if (captionView != null) {
            captionView.setTypeface(typeface);
        }
    }

    public int o() {
        TextView textView = this.f3474l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList p() {
        TextView textView = this.f3474l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public void E(ColorStateList errorViewTextColor) {
        this.f3477o = errorViewTextColor;
        TextView textView = this.f3474l;
        if (textView != null && errorViewTextColor != null) {
            textView.setTextColor(errorViewTextColor);
        }
    }

    public void D(int resId) {
        this.f3476n = resId;
        TextView textView = this.f3474l;
        if (textView != null) {
            this.f3464b.e0(textView, resId);
        }
    }

    public void B(CharSequence errorContentDescription) {
        this.f3475m = errorContentDescription;
        TextView textView = this.f3474l;
        if (textView != null) {
            textView.setContentDescription(errorContentDescription);
        }
    }

    public CharSequence m() {
        return this.f3475m;
    }

    public int r() {
        TextView textView = this.f3480r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void H(ColorStateList helperTextViewTextColor) {
        this.f3482t = helperTextViewTextColor;
        TextView textView = this.f3480r;
        if (textView != null && helperTextViewTextColor != null) {
            textView.setTextColor(helperTextViewTextColor);
        }
    }

    public void F(int resId) {
        this.f3481s = resId;
        TextView textView = this.f3480r;
        if (textView != null) {
            s.n(textView, resId);
        }
    }
}
