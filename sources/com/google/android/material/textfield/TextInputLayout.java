package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.s1;
import androidx.appcompat.widget.s3;
import com.example.helloworld.R;
import com.google.android.material.internal.CheckableImageButton;
import d0.c;
import f0.c1;
import f0.s;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l1.e;
import l1.f;
import l1.w;
import n1.d;
import q1.j;
import q1.o;
import q1.q;
import s1.a0;
import s1.c0;
import s1.f0;
import s1.k;
import s1.l;
import s1.l0;
import s1.m;
import s1.m0;
import s1.n0;
import s1.o0;
import s1.p0;
import s1.q0;
import s1.r0;
import s1.s0;
import s1.u0;
import s1.z;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int N0 = 2131755609;
    public final TextView A;
    public ColorStateList A0;
    public boolean B;
    public int B0;
    public CharSequence C;
    public int C0;
    public boolean D;
    public int D0;
    public j E;
    public int E0;
    public j F;
    public int F0;
    public q G;
    public boolean G0;
    public final int H;
    public final e H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public ValueAnimator K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int O;
    public int P;
    public final Rect Q;
    public final Rect R;
    public final RectF S;
    public Typeface T;
    public final CheckableImageButton U;
    public ColorStateList V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public PorterDuff.Mode f1474a0;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f1475b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1476b0;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f1477c;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f1478c0;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f1479d;

    /* renamed from: d0  reason: collision with root package name */
    public int f1480d0;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f1481e;

    /* renamed from: e0  reason: collision with root package name */
    public View.OnLongClickListener f1482e0;

    /* renamed from: f  reason: collision with root package name */
    public EditText f1483f;

    /* renamed from: f0  reason: collision with root package name */
    public final LinkedHashSet f1484f0;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f1485g;

    /* renamed from: g0  reason: collision with root package name */
    public int f1486g0;

    /* renamed from: h  reason: collision with root package name */
    public int f1487h;

    /* renamed from: h0  reason: collision with root package name */
    public final SparseArray f1488h0;

    /* renamed from: i  reason: collision with root package name */
    public int f1489i;

    /* renamed from: i0  reason: collision with root package name */
    public final CheckableImageButton f1490i0;

    /* renamed from: j  reason: collision with root package name */
    public final c0 f1491j;

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashSet f1492j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1493k;

    /* renamed from: k0  reason: collision with root package name */
    public ColorStateList f1494k0;

    /* renamed from: l  reason: collision with root package name */
    public int f1495l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1496l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1497m;

    /* renamed from: m0  reason: collision with root package name */
    public PorterDuff.Mode f1498m0;

    /* renamed from: n  reason: collision with root package name */
    public TextView f1499n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1500n0;

    /* renamed from: o  reason: collision with root package name */
    public int f1501o;

    /* renamed from: o0  reason: collision with root package name */
    public Drawable f1502o0;

    /* renamed from: p  reason: collision with root package name */
    public int f1503p;

    /* renamed from: p0  reason: collision with root package name */
    public int f1504p0;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f1505q;

    /* renamed from: q0  reason: collision with root package name */
    public Drawable f1506q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1507r;

    /* renamed from: r0  reason: collision with root package name */
    public View.OnLongClickListener f1508r0;

    /* renamed from: s  reason: collision with root package name */
    public TextView f1509s;

    /* renamed from: s0  reason: collision with root package name */
    public View.OnLongClickListener f1510s0;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f1511t;

    /* renamed from: t0  reason: collision with root package name */
    public final CheckableImageButton f1512t0;

    /* renamed from: u  reason: collision with root package name */
    public int f1513u;

    /* renamed from: u0  reason: collision with root package name */
    public ColorStateList f1514u0;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f1515v;

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f1516v0;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f1517w;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f1518w0;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f1519x;

    /* renamed from: x0  reason: collision with root package name */
    public int f1520x0;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f1521y;

    /* renamed from: y0  reason: collision with root package name */
    public int f1522y0;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f1523z;

    /* renamed from: z0  reason: collision with root package name */
    public int f1524z0;

    public TextInputLayout(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.textInputStyle);
    }

    public TextInputLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 2131755609), attrs, defStyleAttr);
        int i2;
        int i3;
        this.f1487h = -1;
        this.f1489i = -1;
        this.f1491j = new c0(this);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new RectF();
        this.f1484f0 = new LinkedHashSet();
        this.f1486g0 = 0;
        SparseArray sparseArray = new SparseArray();
        this.f1488h0 = sparseArray;
        this.f1492j0 = new LinkedHashSet();
        e eVar = new e(this);
        this.H0 = eVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1475b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f1477c = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f1479d = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f1481e = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = w0.a.f3651a;
        eVar.c0(timeInterpolator);
        eVar.Z(timeInterpolator);
        eVar.N(8388659);
        int[] iArr = v0.a.f3604a;
        s3 a2 = l1.q.i(context2, attrs, v0.a.A, defStyleAttr, 2131755609, 20, 18, 33, 38, 42);
        this.B = a2.a(41, true);
        setHint(a2.p(4));
        this.J0 = a2.a(40, true);
        this.I0 = a2.a(35, true);
        if (a2.s(3)) {
            setMinWidth(a2.f(3, -1));
        }
        if (a2.s(2)) {
            setMaxWidth(a2.f(2, -1));
        }
        this.G = q.e(context2, attrs, defStyleAttr, 2131755609).m();
        this.H = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.K = a2.e(7, 0);
        this.M = a2.f(14, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.N = a2.f(15, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.L = this.M;
        float boxCornerRadiusTopStart = a2.d(11, -1.0f);
        float boxCornerRadiusTopEnd = a2.d(10, -1.0f);
        float boxCornerRadiusBottomEnd = a2.d(8, -1.0f);
        float boxCornerRadiusBottomStart = a2.d(9, -1.0f);
        o shapeBuilder = this.G.v();
        if (boxCornerRadiusTopStart >= 0.0f) {
            shapeBuilder.A(boxCornerRadiusTopStart);
        }
        if (boxCornerRadiusTopEnd >= 0.0f) {
            shapeBuilder.E(boxCornerRadiusTopEnd);
        }
        if (boxCornerRadiusBottomEnd >= 0.0f) {
            shapeBuilder.w(boxCornerRadiusBottomEnd);
        }
        if (boxCornerRadiusBottomStart >= 0.0f) {
            shapeBuilder.s(boxCornerRadiusBottomStart);
        }
        this.G = shapeBuilder.m();
        ColorStateList filledBackgroundColorStateList = d.b(context2, a2, 5);
        if (filledBackgroundColorStateList != null) {
            int defaultColor = filledBackgroundColorStateList.getDefaultColor();
            this.B0 = defaultColor;
            this.P = defaultColor;
            if (filledBackgroundColorStateList.isStateful()) {
                this.C0 = filledBackgroundColorStateList.getColorForState(new int[]{-16842910}, -1);
                this.D0 = filledBackgroundColorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
                this.E0 = filledBackgroundColorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.D0 = this.B0;
                ColorStateList mtrlFilledBackgroundColorStateList = e.a.a(context2, R.color.mtrl_filled_background_color);
                this.C0 = mtrlFilledBackgroundColorStateList.getColorForState(new int[]{-16842910}, -1);
                this.E0 = mtrlFilledBackgroundColorStateList.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.P = 0;
            this.B0 = 0;
            this.C0 = 0;
            this.D0 = 0;
            this.E0 = 0;
        }
        if (a2.s(1)) {
            ColorStateList c2 = a2.c(1);
            this.f1518w0 = c2;
            this.f1516v0 = c2;
        }
        ColorStateList boxStrokeColorStateList = d.b(context2, a2, 12);
        this.f1524z0 = a2.b(12, 0);
        this.f1520x0 = v.d.a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.F0 = v.d.a(context2, R.color.mtrl_textinput_disabled_color);
        this.f1522y0 = v.d.a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (boxStrokeColorStateList != null) {
            setBoxStrokeColorStateList(boxStrokeColorStateList);
        }
        if (a2.s(13)) {
            setBoxStrokeErrorColor(d.b(context2, a2, 13));
        }
        int hintAppearance = a2.n(42, -1);
        if (hintAppearance != -1) {
            i2 = 0;
            setHintTextAppearance(a2.n(42, 0));
        } else {
            i2 = 0;
        }
        int errorTextAppearance = a2.n(33, i2);
        CharSequence errorContentDescription = a2.p(28);
        boolean errorEnabled = a2.a(29, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.f1512t0 = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (d.g(context2)) {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams();
            s.d(lp, 0);
        }
        if (a2.s(30)) {
            setErrorIconDrawable(a2.g(30));
        }
        if (a2.s(31)) {
            setErrorIconTintList(d.b(context2, a2, 31));
        }
        if (a2.s(32)) {
            setErrorIconTintMode(w.e(a2.k(32, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        c1.s0(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int helperTextTextAppearance = a2.n(38, 0);
        boolean helperTextEnabled = a2.a(37, false);
        CharSequence helperText = a2.p(36);
        int placeholderTextAppearance = a2.n(50, 0);
        CharSequence placeholderText = a2.p(49);
        int prefixTextAppearance = a2.n(53, 0);
        CharSequence prefixText = a2.p(52);
        int suffixTextAppearance = a2.n(63, 0);
        CharSequence suffixText = a2.p(62);
        boolean counterEnabled = a2.a(16, false);
        setCounterMaxLength(a2.k(17, -1));
        this.f1503p = a2.n(20, 0);
        this.f1501o = a2.n(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.U = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (d.g(context2)) {
            ViewGroup.MarginLayoutParams lp2 = (ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams();
            s.c(lp2, 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (a2.s(59)) {
            setStartIconDrawable(a2.g(59));
            if (a2.s(58)) {
                setStartIconContentDescription(a2.p(58));
            }
            setStartIconCheckable(a2.a(57, true));
        }
        if (a2.s(60)) {
            setStartIconTintList(d.b(context2, a2, 60));
        }
        if (a2.s(61)) {
            setStartIconTintMode(w.e(a2.k(61, -1), null));
        }
        setBoxBackgroundMode(a2.k(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.f1490i0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (d.g(context2)) {
            ViewGroup.MarginLayoutParams lp3 = (ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams();
            i3 = 0;
            s.d(lp3, 0);
        } else {
            i3 = 0;
        }
        sparseArray.append(-1, new l(this));
        sparseArray.append(i3, new f0(this));
        sparseArray.append(1, new l0(this));
        sparseArray.append(2, new k(this));
        sparseArray.append(3, new z(this));
        if (a2.s(25)) {
            setEndIconMode(a2.k(25, 0));
            if (a2.s(24)) {
                setEndIconDrawable(a2.g(24));
            }
            if (a2.s(23)) {
                setEndIconContentDescription(a2.p(23));
            }
            setEndIconCheckable(a2.a(22, true));
        } else if (a2.s(46)) {
            setEndIconMode(a2.a(46, false) ? 1 : 0);
            setEndIconDrawable(a2.g(45));
            setEndIconContentDescription(a2.p(44));
            if (a2.s(47)) {
                setEndIconTintList(d.b(context2, a2, 47));
            }
            if (a2.s(48)) {
                setEndIconTintMode(w.e(a2.k(48, -1), null));
            }
        }
        if (!a2.s(46)) {
            if (a2.s(26)) {
                setEndIconTintList(d.b(context2, a2, 26));
            }
            if (a2.s(27)) {
                setEndIconTintMode(w.e(a2.k(27, -1), null));
            }
        }
        j1 j1Var = new j1(context2);
        this.f1521y = j1Var;
        j1Var.setId(R.id.textinput_prefix_text);
        j1Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        c1.n0(j1Var, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(j1Var);
        j1 j1Var2 = new j1(context2);
        this.A = j1Var2;
        j1Var2.setId(R.id.textinput_suffix_text);
        j1Var2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        c1.n0(j1Var2, 1);
        linearLayout2.addView(j1Var2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(helperTextEnabled);
        setHelperText(helperText);
        setHelperTextTextAppearance(helperTextTextAppearance);
        setErrorEnabled(errorEnabled);
        setErrorTextAppearance(errorTextAppearance);
        setErrorContentDescription(errorContentDescription);
        setCounterTextAppearance(this.f1503p);
        setCounterOverflowTextAppearance(this.f1501o);
        setPlaceholderText(placeholderText);
        setPlaceholderTextAppearance(placeholderTextAppearance);
        setPrefixText(prefixText);
        setPrefixTextAppearance(prefixTextAppearance);
        setSuffixText(suffixText);
        setSuffixTextAppearance(suffixTextAppearance);
        if (a2.s(34)) {
            setErrorTextColor(a2.c(34));
        }
        if (a2.s(39)) {
            setHelperTextColor(a2.c(39));
        }
        if (a2.s(43)) {
            setHintTextColor(a2.c(43));
        }
        if (a2.s(21)) {
            setCounterTextColor(a2.c(21));
        }
        if (a2.s(19)) {
            setCounterOverflowTextColor(a2.c(19));
        }
        if (a2.s(51)) {
            setPlaceholderTextColor(a2.c(51));
        }
        if (a2.s(54)) {
            setPrefixTextColor(a2.c(54));
        }
        if (a2.s(64)) {
            setSuffixTextColor(a2.c(64));
        }
        setCounterEnabled(counterEnabled);
        boolean errorEnabled2 = a2.a(0, true);
        setEnabled(errorEnabled2);
        a2.w();
        c1.s0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            c1.t0(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof EditText) {
            FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(params);
            flp.gravity = (flp.gravity & (-113)) | 16;
            this.f1475b.addView(child, flp);
            this.f1475b.setLayoutParams(params);
            u0();
            setEditText((EditText) child);
            return;
        }
        super.addView(child, index, params);
    }

    public j getBoxBackground() {
        int i2 = this.J;
        if (i2 == 1 || i2 == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundMode(int boxBackgroundMode) {
        if (boxBackgroundMode != this.J) {
            this.J = boxBackgroundMode;
            if (this.f1483f != null) {
                S();
            }
        }
    }

    public int getBoxBackgroundMode() {
        return this.J;
    }

    public final void S() {
        p();
        a0();
        F0();
        k0();
        h();
        if (this.J != 0) {
            u0();
        }
    }

    public final void p() {
        switch (this.J) {
            case 0:
                this.E = null;
                this.F = null;
                return;
            case 1:
                this.E = new j(this.G);
                this.F = new j();
                return;
            case 2:
                if (!this.B || (this.E instanceof m)) {
                    this.E = new j(this.G);
                } else {
                    this.E = new m(this.G);
                }
                this.F = null;
                return;
            default:
                throw new IllegalArgumentException(this.J + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    public final void a0() {
        if (h0()) {
            c1.o0(this.f1483f, this.E);
        }
    }

    public final boolean h0() {
        EditText editText = this.f1483f;
        return (editText == null || this.E == null || editText.getBackground() != null || this.J == 0) ? false : true;
    }

    public final void k0() {
        if (this.J != 1) {
            return;
        }
        if (d.h(getContext())) {
            this.K = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
        } else if (d.g(getContext())) {
            this.K = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
        }
    }

    public final void h() {
        if (this.f1483f != null && this.J == 1) {
            if (d.h(getContext())) {
                EditText editText = this.f1483f;
                c1.v0(editText, c1.F(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), c1.E(this.f1483f), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (d.g(getContext())) {
                EditText editText2 = this.f1483f;
                c1.v0(editText2, c1.F(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), c1.E(this.f1483f), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    public void setBoxStrokeWidthResource(int boxStrokeWidthResId) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(boxStrokeWidthResId));
    }

    public void setBoxStrokeWidth(int boxStrokeWidth) {
        this.M = boxStrokeWidth;
        F0();
    }

    public int getBoxStrokeWidth() {
        return this.M;
    }

    public void setBoxStrokeWidthFocusedResource(int boxStrokeWidthFocusedResId) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(boxStrokeWidthFocusedResId));
    }

    public void setBoxStrokeWidthFocused(int boxStrokeWidthFocused) {
        this.N = boxStrokeWidthFocused;
        F0();
    }

    public int getBoxStrokeWidthFocused() {
        return this.N;
    }

    public void setBoxStrokeColor(int boxStrokeColor) {
        if (this.f1524z0 != boxStrokeColor) {
            this.f1524z0 = boxStrokeColor;
            F0();
        }
    }

    public int getBoxStrokeColor() {
        return this.f1524z0;
    }

    public void setBoxStrokeColorStateList(ColorStateList boxStrokeColorStateList) {
        if (boxStrokeColorStateList.isStateful()) {
            this.f1520x0 = boxStrokeColorStateList.getDefaultColor();
            this.F0 = boxStrokeColorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1522y0 = boxStrokeColorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f1524z0 = boxStrokeColorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f1524z0 != boxStrokeColorStateList.getDefaultColor()) {
            this.f1524z0 = boxStrokeColorStateList.getDefaultColor();
        }
        F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList strokeErrorColor) {
        if (this.A0 != strokeErrorColor) {
            this.A0 = strokeErrorColor;
            F0();
        }
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.A0;
    }

    public void setBoxBackgroundColorResource(int boxBackgroundColorId) {
        setBoxBackgroundColor(v.d.a(getContext(), boxBackgroundColorId));
    }

    public void setBoxBackgroundColor(int boxBackgroundColor) {
        if (this.P != boxBackgroundColor) {
            this.P = boxBackgroundColor;
            this.B0 = boxBackgroundColor;
            this.D0 = boxBackgroundColor;
            this.E0 = boxBackgroundColor;
            j();
        }
    }

    public void setBoxBackgroundColorStateList(ColorStateList boxBackgroundColorStateList) {
        int defaultColor = boxBackgroundColorStateList.getDefaultColor();
        this.B0 = defaultColor;
        this.P = defaultColor;
        this.C0 = boxBackgroundColorStateList.getColorForState(new int[]{-16842910}, -1);
        this.D0 = boxBackgroundColorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.E0 = boxBackgroundColorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        j();
    }

    public int getBoxBackgroundColor() {
        return this.P;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.E.C();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.E.D();
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.E.r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.E.s();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.T) {
            this.T = typeface;
            this.H0.d0(typeface);
            this.f1491j.J(typeface);
            TextView textView = this.f1499n;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public Typeface getTypeface() {
        return this.T;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
        EditText editText = this.f1483f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(structure, flags);
        } else if (this.f1485g != null) {
            boolean wasProvidingHint = this.D;
            this.D = false;
            CharSequence hint = editText.getHint();
            this.f1483f.setHint(this.f1485g);
            try {
                super.dispatchProvideAutofillStructure(structure, flags);
            } finally {
                this.f1483f.setHint(hint);
                this.D = wasProvidingHint;
            }
        } else {
            structure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(structure, flags);
            onProvideAutofillVirtualStructure(structure, flags);
            structure.setChildCount(this.f1475b.getChildCount());
            for (int i2 = 0; i2 < this.f1475b.getChildCount(); i2++) {
                View child = this.f1475b.getChildAt(i2);
                ViewStructure childStructure = structure.newChild(i2);
                child.dispatchProvideAutofillStructure(childStructure, flags);
                if (child == this.f1483f) {
                    childStructure.setHint(getHint());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1483f == null) {
            if (this.f1486g0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f1483f = editText;
            setMinWidth(this.f1487h);
            setMaxWidth(this.f1489i);
            S();
            setTextInputAccessibilityDelegate(new q0(this));
            this.H0.d0(this.f1483f.getTypeface());
            this.H0.V(this.f1483f.getTextSize());
            int editTextGravity = this.f1483f.getGravity();
            this.H0.N((editTextGravity & (-113)) | 48);
            this.H0.U(editTextGravity);
            this.f1483f.addTextChangedListener(new m0(this));
            if (this.f1516v0 == null) {
                this.f1516v0 = this.f1483f.getHintTextColors();
            }
            if (this.B) {
                if (TextUtils.isEmpty(this.C)) {
                    CharSequence hint = this.f1483f.getHint();
                    this.f1485g = hint;
                    setHint(hint);
                    this.f1483f.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.f1499n != null) {
                n0(this.f1483f.getText().length());
            }
            s0();
            this.f1491j.e();
            this.f1477c.bringToFront();
            this.f1479d.bringToFront();
            this.f1481e.bringToFront();
            this.f1512t0.bringToFront();
            B();
            A0();
            D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    public final void u0() {
        if (this.J != 1) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f1475b.getLayoutParams();
            int newTopMargin = v();
            if (newTopMargin != lp.topMargin) {
                lp.topMargin = newTopMargin;
                this.f1475b.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1483f;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + v();
        }
        return super.getBaseline();
    }

    public void v0(boolean animate) {
        w0(animate, false);
    }

    public final void w0(boolean animate, boolean force) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1483f;
        boolean hasText = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f1483f;
        boolean hasFocus = editText2 != null && editText2.hasFocus();
        boolean errorShouldBeShown = this.f1491j.k();
        ColorStateList colorStateList2 = this.f1516v0;
        if (colorStateList2 != null) {
            this.H0.M(colorStateList2);
            this.H0.T(this.f1516v0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1516v0;
            int disabledHintColor = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.F0) : this.F0;
            this.H0.M(ColorStateList.valueOf(disabledHintColor));
            this.H0.T(ColorStateList.valueOf(disabledHintColor));
        } else if (errorShouldBeShown) {
            this.H0.M(this.f1491j.p());
        } else if (this.f1497m && (textView = this.f1499n) != null) {
            this.H0.M(textView.getTextColors());
        } else if (hasFocus && (colorStateList = this.f1518w0) != null) {
            this.H0.M(colorStateList);
        }
        if (hasText || !this.I0 || (isEnabled() && hasFocus)) {
            if (force || this.G0) {
                z(animate);
            }
        } else if (force || !this.G0) {
            F(animate);
        }
    }

    public EditText getEditText() {
        return this.f1483f;
    }

    public void setMinWidth(int minWidth) {
        this.f1487h = minWidth;
        EditText editText = this.f1483f;
        if (editText != null && minWidth != -1) {
            editText.setMinWidth(minWidth);
        }
    }

    public void setMinWidthResource(int minWidthId) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(minWidthId));
    }

    public int getMinWidth() {
        return this.f1487h;
    }

    public void setMaxWidth(int maxWidth) {
        this.f1489i = maxWidth;
        EditText editText = this.f1483f;
        if (editText != null && maxWidth != -1) {
            editText.setMaxWidth(maxWidth);
        }
    }

    public void setMaxWidthResource(int maxWidthId) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(maxWidthId));
    }

    public int getMaxWidth() {
        return this.f1489i;
    }

    public void setHint(CharSequence hint) {
        if (this.B) {
            setHintInternal(hint);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHint(int textHintId) {
        setHint(textHintId != 0 ? getResources().getText(textHintId) : null);
    }

    private void setHintInternal(CharSequence hint) {
        if (!TextUtils.equals(hint, this.C)) {
            this.C = hint;
            this.H0.b0(hint);
            if (!this.G0) {
                T();
            }
        }
    }

    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    public void setHintEnabled(boolean enabled) {
        if (enabled != this.B) {
            this.B = enabled;
            if (!enabled) {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f1483f.getHint())) {
                    this.f1483f.setHint(this.C);
                }
                setHintInternal(null);
            } else {
                CharSequence editTextHint = this.f1483f.getHint();
                if (!TextUtils.isEmpty(editTextHint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(editTextHint);
                    }
                    this.f1483f.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.f1483f != null) {
                u0();
            }
        }
    }

    public boolean O() {
        return this.D;
    }

    public void setHintTextAppearance(int resId) {
        this.H0.K(resId);
        this.f1518w0 = this.H0.n();
        if (this.f1483f != null) {
            v0(false);
            u0();
        }
    }

    public void setHintTextColor(ColorStateList hintTextColor) {
        if (this.f1518w0 != hintTextColor) {
            if (this.f1516v0 == null) {
                this.H0.M(hintTextColor);
            }
            this.f1518w0 = hintTextColor;
            if (this.f1483f != null) {
                v0(false);
            }
        }
    }

    public ColorStateList getHintTextColor() {
        return this.f1518w0;
    }

    public void setDefaultHintTextColor(ColorStateList textColor) {
        this.f1516v0 = textColor;
        this.f1518w0 = textColor;
        if (this.f1483f != null) {
            v0(false);
        }
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1516v0;
    }

    public void setErrorEnabled(boolean enabled) {
        this.f1491j.C(enabled);
    }

    public void setErrorTextAppearance(int errorTextAppearance) {
        this.f1491j.D(errorTextAppearance);
    }

    public void setErrorTextColor(ColorStateList errorTextColor) {
        this.f1491j.E(errorTextColor);
    }

    public int getErrorCurrentTextColors() {
        return this.f1491j.o();
    }

    public void setHelperTextTextAppearance(int helperTextTextAppearance) {
        this.f1491j.F(helperTextTextAppearance);
    }

    public void setHelperTextColor(ColorStateList helperTextColor) {
        this.f1491j.H(helperTextColor);
    }

    public void setHelperTextEnabled(boolean enabled) {
        this.f1491j.G(enabled);
    }

    public void setHelperText(CharSequence helperText) {
        if (!TextUtils.isEmpty(helperText)) {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f1491j.N(helperText);
        } else if (M()) {
            setHelperTextEnabled(false);
        }
    }

    public boolean M() {
        return this.f1491j.y();
    }

    public int getHelperTextCurrentTextColor() {
        return this.f1491j.r();
    }

    public void setErrorContentDescription(CharSequence errorContentDecription) {
        this.f1491j.B(errorContentDecription);
    }

    public CharSequence getErrorContentDescription() {
        return this.f1491j.m();
    }

    public void setError(CharSequence errorText) {
        if (!this.f1491j.x()) {
            if (!TextUtils.isEmpty(errorText)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(errorText)) {
            this.f1491j.M(errorText);
        } else {
            this.f1491j.t();
        }
    }

    public void setErrorIconDrawable(int resId) {
        setErrorIconDrawable(resId != 0 ? e.a.b(getContext(), resId) : null);
        W();
    }

    public void setErrorIconDrawable(Drawable errorIconDrawable) {
        this.f1512t0.setImageDrawable(errorIconDrawable);
        setErrorIconVisible(errorIconDrawable != null && this.f1491j.x());
    }

    public Drawable getErrorIconDrawable() {
        return this.f1512t0.getDrawable();
    }

    public void setErrorIconTintList(ColorStateList errorIconTintList) {
        this.f1514u0 = errorIconTintList;
        Drawable icon = this.f1512t0.getDrawable();
        if (icon != null) {
            y.a.l(icon);
            icon = icon.mutate();
            y.a.i(icon, errorIconTintList);
        }
        if (this.f1512t0.getDrawable() != icon) {
            this.f1512t0.setImageDrawable(icon);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode errorIconTintMode) {
        Drawable icon = this.f1512t0.getDrawable();
        if (icon != null) {
            y.a.l(icon);
            icon = icon.mutate();
            y.a.j(icon, errorIconTintMode);
        }
        if (this.f1512t0.getDrawable() != icon) {
            this.f1512t0.setImageDrawable(icon);
        }
    }

    public void setCounterEnabled(boolean enabled) {
        if (this.f1493k != enabled) {
            if (enabled) {
                j1 j1Var = new j1(getContext());
                this.f1499n = j1Var;
                j1Var.setId(R.id.textinput_counter);
                Typeface typeface = this.T;
                if (typeface != null) {
                    this.f1499n.setTypeface(typeface);
                }
                this.f1499n.setMaxLines(1);
                this.f1491j.d(this.f1499n, 2);
                s.d((ViewGroup.MarginLayoutParams) this.f1499n.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                p0();
                m0();
            } else {
                this.f1491j.z(this.f1499n, 2);
                this.f1499n = null;
            }
            this.f1493k = enabled;
        }
    }

    public void setCounterTextAppearance(int counterTextAppearance) {
        if (this.f1503p != counterTextAppearance) {
            this.f1503p = counterTextAppearance;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList counterTextColor) {
        if (this.f1515v != counterTextColor) {
            this.f1515v = counterTextColor;
            p0();
        }
    }

    public ColorStateList getCounterTextColor() {
        return this.f1515v;
    }

    public void setCounterOverflowTextAppearance(int counterOverflowTextAppearance) {
        if (this.f1501o != counterOverflowTextAppearance) {
            this.f1501o = counterOverflowTextAppearance;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList counterOverflowTextColor) {
        if (this.f1517w != counterOverflowTextColor) {
            this.f1517w = counterOverflowTextColor;
            p0();
        }
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1515v;
    }

    public void setCounterMaxLength(int maxLength) {
        if (this.f1495l != maxLength) {
            if (maxLength > 0) {
                this.f1495l = maxLength;
            } else {
                this.f1495l = -1;
            }
            if (this.f1493k) {
                m0();
            }
        }
    }

    public final void m0() {
        if (this.f1499n != null) {
            EditText editText = this.f1483f;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    public void n0(int length) {
        boolean wasCounterOverflowed = this.f1497m;
        int i2 = this.f1495l;
        if (i2 == -1) {
            this.f1499n.setText(String.valueOf(length));
            this.f1499n.setContentDescription(null);
            this.f1497m = false;
        } else {
            this.f1497m = length > i2;
            o0(getContext(), this.f1499n, length, this.f1495l, this.f1497m);
            if (wasCounterOverflowed != this.f1497m) {
                p0();
            }
            c bidiFormatter = c.c();
            this.f1499n.setText(bidiFormatter.j(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1495l))));
        }
        if (this.f1483f != null && wasCounterOverflowed != this.f1497m) {
            v0(false);
            F0();
            s0();
        }
    }

    public static void o0(Context context, TextView counterView, int length, int counterMaxLength, boolean counterOverflowed) {
        counterView.setContentDescription(context.getString(counterOverflowed ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(counterMaxLength)));
    }

    public void setPlaceholderText(CharSequence placeholderText) {
        if (!this.f1507r || !TextUtils.isEmpty(placeholderText)) {
            if (!this.f1507r) {
                setPlaceholderTextEnabled(true);
            }
            this.f1505q = placeholderText;
        } else {
            setPlaceholderTextEnabled(false);
        }
        y0();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1507r) {
            return this.f1505q;
        }
        return null;
    }

    private void setPlaceholderTextEnabled(boolean placeholderEnabled) {
        if (this.f1507r != placeholderEnabled) {
            if (placeholderEnabled) {
                j1 j1Var = new j1(getContext());
                this.f1509s = j1Var;
                j1Var.setId(R.id.textinput_placeholder);
                c1.n0(this.f1509s, 1);
                setPlaceholderTextAppearance(this.f1513u);
                setPlaceholderTextColor(this.f1511t);
                g();
            } else {
                Z();
                this.f1509s = null;
            }
            this.f1507r = placeholderEnabled;
        }
    }

    public final void y0() {
        EditText editText = this.f1483f;
        z0(editText == null ? 0 : editText.getText().length());
    }

    public final void z0(int inputTextLength) {
        if (inputTextLength != 0 || this.G0) {
            J();
        } else {
            i0();
        }
    }

    public final void i0() {
        TextView textView = this.f1509s;
        if (textView != null && this.f1507r) {
            textView.setText(this.f1505q);
            this.f1509s.setVisibility(0);
            this.f1509s.bringToFront();
        }
    }

    public final void J() {
        TextView textView = this.f1509s;
        if (textView != null && this.f1507r) {
            textView.setText((CharSequence) null);
            this.f1509s.setVisibility(4);
        }
    }

    public final void g() {
        TextView textView = this.f1509s;
        if (textView != null) {
            this.f1475b.addView(textView);
            this.f1509s.setVisibility(0);
        }
    }

    public final void Z() {
        TextView textView = this.f1509s;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList placeholderTextColor) {
        if (this.f1511t != placeholderTextColor) {
            this.f1511t = placeholderTextColor;
            TextView textView = this.f1509s;
            if (textView != null && placeholderTextColor != null) {
                textView.setTextColor(placeholderTextColor);
            }
        }
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1511t;
    }

    public void setPlaceholderTextAppearance(int placeholderTextAppearance) {
        this.f1513u = placeholderTextAppearance;
        TextView textView = this.f1509s;
        if (textView != null) {
            i0.s.n(textView, placeholderTextAppearance);
        }
    }

    public int getPlaceholderTextAppearance() {
        return this.f1513u;
    }

    public void setPrefixText(CharSequence prefixText) {
        this.f1519x = TextUtils.isEmpty(prefixText) ? null : prefixText;
        this.f1521y.setText(prefixText);
        B0();
    }

    public CharSequence getPrefixText() {
        return this.f1519x;
    }

    public TextView getPrefixTextView() {
        return this.f1521y;
    }

    public final void B0() {
        this.f1521y.setVisibility((this.f1519x == null || N()) ? 8 : 0);
        r0();
    }

    public void setPrefixTextColor(ColorStateList prefixTextColor) {
        this.f1521y.setTextColor(prefixTextColor);
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1521y.getTextColors();
    }

    public void setPrefixTextAppearance(int prefixTextAppearance) {
        i0.s.n(this.f1521y, prefixTextAppearance);
    }

    public final void A0() {
        if (this.f1483f != null) {
            int startPadding = Q() ? 0 : c1.F(this.f1483f);
            c1.v0(this.f1521y, startPadding, this.f1483f.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f1483f.getCompoundPaddingBottom());
        }
    }

    public void setSuffixText(CharSequence suffixText) {
        this.f1523z = TextUtils.isEmpty(suffixText) ? null : suffixText;
        this.A.setText(suffixText);
        E0();
    }

    public CharSequence getSuffixText() {
        return this.f1523z;
    }

    public TextView getSuffixTextView() {
        return this.A;
    }

    public final void E0() {
        int oldSuffixVisibility = this.A.getVisibility();
        int i2 = 0;
        boolean visible = this.f1523z != null && !N();
        TextView textView = this.A;
        if (!visible) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (oldSuffixVisibility != this.A.getVisibility()) {
            getEndIconDelegate().c(visible);
        }
        r0();
    }

    public void setSuffixTextColor(ColorStateList suffixTextColor) {
        this.A.setTextColor(suffixTextColor);
    }

    public ColorStateList getSuffixTextColor() {
        return this.A.getTextColors();
    }

    public void setSuffixTextAppearance(int suffixTextAppearance) {
        i0.s.n(this.A, suffixTextAppearance);
    }

    public final void D0() {
        if (this.f1483f != null) {
            int endPadding = (K() || L()) ? 0 : c1.E(this.f1483f);
            c1.v0(this.A, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.f1483f.getPaddingTop(), endPadding, this.f1483f.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        U(this, enabled);
        super.setEnabled(enabled);
    }

    public static void U(ViewGroup vg, boolean enabled) {
        int count = vg.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            View child = vg.getChildAt(i2);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                U((ViewGroup) child, enabled);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.f1495l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f1493k || !this.f1497m || (textView = this.f1499n) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public final void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f1499n;
        if (textView != null) {
            e0(textView, this.f1497m ? this.f1501o : this.f1503p);
            if (!this.f1497m && (colorStateList2 = this.f1515v) != null) {
                this.f1499n.setTextColor(colorStateList2);
            }
            if (this.f1497m && (colorStateList = this.f1517w) != null) {
                this.f1499n.setTextColor(colorStateList);
            }
        }
    }

    public void e0(TextView textView, int textAppearance) {
        boolean useDefaultColor = false;
        try {
            i0.s.n(textView, textAppearance);
            if (textView.getTextColors().getDefaultColor() == -65281) {
                useDefaultColor = true;
            }
        } catch (Exception e2) {
            useDefaultColor = true;
        }
        if (useDefaultColor) {
            i0.s.n(textView, 2131755317);
            textView.setTextColor(v.d.a(getContext(), R.color.design_error));
        }
    }

    public final int v() {
        if (!this.B) {
            return 0;
        }
        switch (this.J) {
            case 0:
            case 1:
                return (int) this.H0.o();
            case 2:
                return (int) (this.H0.o() / 2.0f);
            default:
                return 0;
        }
    }

    public final Rect r(Rect rect) {
        if (this.f1483f != null) {
            Rect bounds = this.R;
            boolean isRtl = true;
            if (c1.A(this) != 1) {
                isRtl = false;
            }
            bounds.bottom = rect.bottom;
            switch (this.J) {
                case 1:
                    bounds.left = G(rect.left, isRtl);
                    bounds.top = rect.top + this.K;
                    bounds.right = H(rect.right, isRtl);
                    return bounds;
                case 2:
                    bounds.left = rect.left + this.f1483f.getPaddingLeft();
                    bounds.top = rect.top - v();
                    bounds.right = rect.right - this.f1483f.getPaddingRight();
                    return bounds;
                default:
                    bounds.left = G(rect.left, isRtl);
                    bounds.top = getPaddingTop();
                    bounds.right = H(rect.right, isRtl);
                    return bounds;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final int G(int rectLeft, boolean isRtl) {
        int left = this.f1483f.getCompoundPaddingLeft() + rectLeft;
        if (this.f1519x == null || isRtl) {
            return left;
        }
        return (left - this.f1521y.getMeasuredWidth()) + this.f1521y.getPaddingLeft();
    }

    public final int H(int rectRight, boolean isRtl) {
        int right = rectRight - this.f1483f.getCompoundPaddingRight();
        if (this.f1519x == null || !isRtl) {
            return right;
        }
        return right + (this.f1521y.getMeasuredWidth() - this.f1521y.getPaddingRight());
    }

    public final Rect u(Rect rect) {
        if (this.f1483f != null) {
            Rect bounds = this.R;
            float labelHeight = this.H0.u();
            bounds.left = rect.left + this.f1483f.getCompoundPaddingLeft();
            bounds.top = t(rect, labelHeight);
            bounds.right = rect.right - this.f1483f.getCompoundPaddingRight();
            bounds.bottom = s(rect, bounds, labelHeight);
            return bounds;
        }
        throw new IllegalStateException();
    }

    public final int t(Rect rect, float labelHeight) {
        if (P()) {
            return (int) (rect.centerY() - (labelHeight / 2.0f));
        }
        return rect.top + this.f1483f.getCompoundPaddingTop();
    }

    public final int s(Rect rect, Rect bounds, float labelHeight) {
        if (P()) {
            return (int) (bounds.top + labelHeight);
        }
        return rect.bottom - this.f1483f.getCompoundPaddingBottom();
    }

    public final boolean P() {
        return this.J == 1 && this.f1483f.getMinLines() <= 1;
    }

    public final int q() {
        int backgroundColor = this.P;
        if (this.J != 1) {
            return backgroundColor;
        }
        int surfaceLayerColor = f1.a.d(this, R.attr.colorSurface, 0);
        int backgroundColor2 = f1.a.e(surfaceLayerColor, this.P);
        return backgroundColor2;
    }

    public final void j() {
        j jVar = this.E;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(this.G);
            if (w()) {
                this.E.X(this.L, this.O);
            }
            int q2 = q();
            this.P = q2;
            this.E.T(ColorStateList.valueOf(q2));
            if (this.f1486g0 == 3) {
                this.f1483f.getBackground().invalidateSelf();
            }
            k();
            invalidate();
        }
    }

    public final void k() {
        if (this.F != null) {
            if (x()) {
                this.F.T(ColorStateList.valueOf(this.O));
            }
            invalidate();
        }
    }

    public final boolean w() {
        return this.J == 2 && x();
    }

    public final boolean x() {
        return this.L > -1 && this.O != 0;
    }

    public void s0() {
        Drawable editTextBackground;
        TextView textView;
        EditText editText = this.f1483f;
        if (editText != null && this.J == 0 && (editTextBackground = editText.getBackground()) != null) {
            if (s1.a(editTextBackground)) {
                editTextBackground = editTextBackground.mutate();
            }
            if (this.f1491j.k()) {
                editTextBackground.setColorFilter(d0.e(this.f1491j.o(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f1497m || (textView = this.f1499n) == null) {
                y.a.a(editTextBackground);
                this.f1483f.refreshDrawableState();
            } else {
                editTextBackground.setColorFilter(d0.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        u0 ss = new u0(superState);
        if (this.f1491j.k()) {
            ss.f3527d = getError();
        }
        ss.f3528e = I() && this.f1490i0.isChecked();
        ss.f3529f = getHint();
        ss.f3530g = getHelperText();
        ss.f3531h = getPlaceholderText();
        return ss;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof u0)) {
            super.onRestoreInstanceState(state);
            return;
        }
        u0 ss = (u0) state;
        super.onRestoreInstanceState(ss.i());
        setError(ss.f3527d);
        if (ss.f3528e) {
            this.f1490i0.post(new n0(this));
        }
        setHint(ss.f3529f);
        setHelperText(ss.f3530g);
        setPlaceholderText(ss.f3531h);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.M0 = false;
    }

    public CharSequence getError() {
        if (this.f1491j.x()) {
            return this.f1491j.n();
        }
        return null;
    }

    public CharSequence getHelperText() {
        if (this.f1491j.y()) {
            return this.f1491j.q();
        }
        return null;
    }

    public void setHintAnimationEnabled(boolean enabled) {
        this.J0 = enabled;
    }

    public void setExpandedHintEnabled(boolean enabled) {
        if (this.I0 != enabled) {
            this.I0 = enabled;
            v0(false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        boolean updatedHeight = t0();
        boolean updatedIcon = r0();
        if (updatedHeight || updatedIcon) {
            this.f1483f.post(new o0(this));
        }
        x0();
        A0();
        D0();
    }

    public final boolean t0() {
        int maxIconHeight;
        if (this.f1483f == null || this.f1483f.getMeasuredHeight() >= (maxIconHeight = Math.max(this.f1479d.getMeasuredHeight(), this.f1477c.getMeasuredHeight()))) {
            return false;
        }
        this.f1483f.setMinimumHeight(maxIconHeight);
        return true;
    }

    public final void x0() {
        EditText editText;
        if (this.f1509s != null && (editText = this.f1483f) != null) {
            int editTextGravity = editText.getGravity();
            this.f1509s.setGravity(editTextGravity);
            this.f1509s.setPadding(this.f1483f.getCompoundPaddingLeft(), this.f1483f.getCompoundPaddingTop(), this.f1483f.getCompoundPaddingRight(), this.f1483f.getCompoundPaddingBottom());
        }
    }

    public void setStartIconDrawable(int resId) {
        setStartIconDrawable(resId != 0 ? e.a.b(getContext(), resId) : null);
    }

    public void setStartIconDrawable(Drawable startIconDrawable) {
        this.U.setImageDrawable(startIconDrawable);
        if (startIconDrawable != null) {
            setStartIconVisible(true);
            Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public Drawable getStartIconDrawable() {
        return this.U.getDrawable();
    }

    public void setStartIconOnClickListener(View.OnClickListener startIconOnClickListener) {
        c0(this.U, startIconOnClickListener, this.f1482e0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener startIconOnLongClickListener) {
        this.f1482e0 = startIconOnLongClickListener;
        d0(this.U, startIconOnLongClickListener);
    }

    public void setStartIconVisible(boolean visible) {
        if (Q() != visible) {
            this.U.setVisibility(visible ? 0 : 8);
            A0();
            r0();
        }
    }

    public boolean Q() {
        return this.U.getVisibility() == 0;
    }

    public void Y() {
        X(this.U, this.V);
    }

    public void setStartIconCheckable(boolean startIconCheckable) {
        this.U.setCheckable(startIconCheckable);
    }

    public void setStartIconContentDescription(int resId) {
        setStartIconContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setStartIconContentDescription(CharSequence startIconContentDescription) {
        if (getStartIconContentDescription() != startIconContentDescription) {
            this.U.setContentDescription(startIconContentDescription);
        }
    }

    public CharSequence getStartIconContentDescription() {
        return this.U.getContentDescription();
    }

    public void setStartIconTintList(ColorStateList startIconTintList) {
        if (this.V != startIconTintList) {
            this.V = startIconTintList;
            this.W = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode startIconTintMode) {
        if (this.f1474a0 != startIconTintMode) {
            this.f1474a0 = startIconTintMode;
            this.f1476b0 = true;
            o();
        }
    }

    public void setEndIconMode(int endIconMode) {
        int previousEndIconMode = this.f1486g0;
        this.f1486g0 = endIconMode;
        C(previousEndIconMode);
        setEndIconVisible(endIconMode != 0);
        if (getEndIconDelegate().b(this.J)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.J + " is not supported by the end icon mode " + endIconMode);
    }

    public int getEndIconMode() {
        return this.f1486g0;
    }

    public void setEndIconOnClickListener(View.OnClickListener endIconOnClickListener) {
        c0(this.f1490i0, endIconOnClickListener, this.f1508r0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener errorIconOnClickListener) {
        c0(this.f1512t0, errorIconOnClickListener, this.f1510s0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener endIconOnLongClickListener) {
        this.f1508r0 = endIconOnLongClickListener;
        d0(this.f1490i0, endIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener errorIconOnLongClickListener) {
        this.f1510s0 = errorIconOnLongClickListener;
        d0(this.f1512t0, errorIconOnLongClickListener);
    }

    public void W() {
        X(this.f1512t0, this.f1514u0);
    }

    public void setEndIconVisible(boolean visible) {
        if (K() != visible) {
            this.f1490i0.setVisibility(visible ? 0 : 8);
            D0();
            r0();
        }
    }

    public boolean K() {
        return this.f1481e.getVisibility() == 0 && this.f1490i0.getVisibility() == 0;
    }

    public void setEndIconActivated(boolean endIconActivated) {
        this.f1490i0.setActivated(endIconActivated);
    }

    public void V() {
        X(this.f1490i0, this.f1494k0);
    }

    public void setEndIconCheckable(boolean endIconCheckable) {
        this.f1490i0.setCheckable(endIconCheckable);
    }

    public void setEndIconDrawable(int resId) {
        setEndIconDrawable(resId != 0 ? e.a.b(getContext(), resId) : null);
    }

    public void setEndIconDrawable(Drawable endIconDrawable) {
        this.f1490i0.setImageDrawable(endIconDrawable);
        V();
    }

    public Drawable getEndIconDrawable() {
        return this.f1490i0.getDrawable();
    }

    public void setEndIconContentDescription(int resId) {
        setEndIconContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setEndIconContentDescription(CharSequence endIconContentDescription) {
        if (getEndIconContentDescription() != endIconContentDescription) {
            this.f1490i0.setContentDescription(endIconContentDescription);
        }
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1490i0.getContentDescription();
    }

    public void setEndIconTintList(ColorStateList endIconTintList) {
        if (this.f1494k0 != endIconTintList) {
            this.f1494k0 = endIconTintList;
            this.f1496l0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode endIconTintMode) {
        if (this.f1498m0 != endIconTintMode) {
            this.f1498m0 = endIconTintMode;
            this.f1500n0 = true;
            m();
        }
    }

    public void f(s0 listener) {
        this.f1492j0.add(listener);
    }

    public void e(r0 listener) {
        this.f1484f0.add(listener);
        if (this.f1483f != null) {
            listener.a(this);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int resId) {
        setPasswordVisibilityToggleDrawable(resId != 0 ? e.a.b(getContext(), resId) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable icon) {
        this.f1490i0.setImageDrawable(icon);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int resId) {
        setPasswordVisibilityToggleContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence description) {
        this.f1490i0.setContentDescription(description);
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1490i0.getDrawable();
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1490i0.getContentDescription();
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean enabled) {
        if (enabled && this.f1486g0 != 1) {
            setEndIconMode(1);
        } else if (!enabled) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList tintList) {
        this.f1494k0 = tintList;
        this.f1496l0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f1498m0 = mode;
        this.f1500n0 = true;
        m();
    }

    public void setTextInputAccessibilityDelegate(q0 delegate) {
        EditText editText = this.f1483f;
        if (editText != null) {
            c1.l0(editText, delegate);
        }
    }

    public CheckableImageButton getEndIconView() {
        return this.f1490i0;
    }

    private a0 getEndIconDelegate() {
        a0 endIconDelegate = (a0) this.f1488h0.get(this.f1486g0);
        return endIconDelegate != null ? endIconDelegate : (a0) this.f1488h0.get(0);
    }

    public final void B() {
        Iterator it = this.f1484f0.iterator();
        while (it.hasNext()) {
            r0 listener = (r0) it.next();
            listener.a(this);
        }
    }

    public final void o() {
        n(this.U, this.W, this.V, this.f1476b0, this.f1474a0);
    }

    public final boolean I() {
        return this.f1486g0 != 0;
    }

    public final void C(int previousIcon) {
        Iterator it = this.f1492j0.iterator();
        while (it.hasNext()) {
            s0 listener = (s0) it.next();
            listener.a(this, previousIcon);
        }
    }

    public final void j0(boolean tintEndIconOnError) {
        if (!tintEndIconOnError || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable endIconDrawable = getEndIconDrawable();
        y.a.l(endIconDrawable);
        Drawable endIconDrawable2 = endIconDrawable.mutate();
        y.a.h(endIconDrawable2, this.f1491j.o());
        this.f1490i0.setImageDrawable(endIconDrawable2);
    }

    public final void m() {
        n(this.f1490i0, this.f1496l0, this.f1494k0, this.f1500n0, this.f1498m0);
    }

    public final boolean r0() {
        if (this.f1483f == null) {
            return false;
        }
        boolean updatedIcon = false;
        if (g0()) {
            int right = this.f1477c.getMeasuredWidth() - this.f1483f.getPaddingLeft();
            if (this.f1478c0 == null || this.f1480d0 != right) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f1478c0 = colorDrawable;
                this.f1480d0 = right;
                colorDrawable.setBounds(0, 0, right, 1);
            }
            Drawable[] compounds = i0.s.a(this.f1483f);
            Drawable drawable = compounds[0];
            Drawable drawable2 = this.f1478c0;
            if (drawable != drawable2) {
                i0.s.i(this.f1483f, drawable2, compounds[1], compounds[2], compounds[3]);
                updatedIcon = true;
            }
        } else if (this.f1478c0 != null) {
            Drawable[] compounds2 = i0.s.a(this.f1483f);
            i0.s.i(this.f1483f, null, compounds2[1], compounds2[2], compounds2[3]);
            this.f1478c0 = null;
            updatedIcon = true;
        }
        if (f0()) {
            int right2 = this.A.getMeasuredWidth() - this.f1483f.getPaddingRight();
            View iconView = getEndIconToUpdateDummyDrawable();
            if (iconView != null) {
                right2 = iconView.getMeasuredWidth() + right2 + s.b((ViewGroup.MarginLayoutParams) iconView.getLayoutParams());
            }
            Drawable[] compounds3 = i0.s.a(this.f1483f);
            Drawable drawable3 = this.f1502o0;
            if (drawable3 == null || this.f1504p0 == right2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f1502o0 = colorDrawable2;
                    this.f1504p0 = right2;
                    colorDrawable2.setBounds(0, 0, right2, 1);
                }
                Drawable drawable4 = compounds3[2];
                Drawable drawable5 = this.f1502o0;
                if (drawable4 == drawable5) {
                    return updatedIcon;
                }
                this.f1506q0 = compounds3[2];
                i0.s.i(this.f1483f, compounds3[0], compounds3[1], drawable5, compounds3[3]);
                return true;
            }
            this.f1504p0 = right2;
            drawable3.setBounds(0, 0, right2, 1);
            i0.s.i(this.f1483f, compounds3[0], compounds3[1], this.f1502o0, compounds3[3]);
            return true;
        } else if (this.f1502o0 == null) {
            return updatedIcon;
        } else {
            Drawable[] compounds4 = i0.s.a(this.f1483f);
            if (compounds4[2] == this.f1502o0) {
                i0.s.i(this.f1483f, compounds4[0], compounds4[1], this.f1506q0, compounds4[3]);
                updatedIcon = true;
            }
            this.f1502o0 = null;
            return updatedIcon;
        }
    }

    public final boolean g0() {
        return !(getStartIconDrawable() == null && this.f1519x == null) && this.f1477c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (this.f1512t0.getVisibility() == 0 || ((I() && K()) || this.f1523z != null)) && this.f1479d.getMeasuredWidth() > 0;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f1512t0.getVisibility() == 0) {
            return this.f1512t0;
        }
        if (!I() || !K()) {
            return null;
        }
        return this.f1490i0;
    }

    public final void n(CheckableImageButton iconView, boolean hasIconTintList, ColorStateList iconTintList, boolean hasIconTintMode, PorterDuff.Mode iconTintMode) {
        Drawable icon = iconView.getDrawable();
        if (icon != null && (hasIconTintList || hasIconTintMode)) {
            y.a.l(icon);
            icon = icon.mutate();
            if (hasIconTintList) {
                y.a.i(icon, iconTintList);
            }
            if (hasIconTintMode) {
                y.a.j(icon, iconTintMode);
            }
        }
        if (iconView.getDrawable() != icon) {
            iconView.setImageDrawable(icon);
        }
    }

    public static void c0(CheckableImageButton iconView, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        iconView.setOnClickListener(onClickListener);
        b0(iconView, onLongClickListener);
    }

    public static void d0(CheckableImageButton iconView, View.OnLongClickListener onLongClickListener) {
        iconView.setOnLongClickListener(onLongClickListener);
        b0(iconView, onLongClickListener);
    }

    public static void b0(CheckableImageButton iconView, View.OnLongClickListener onLongClickListener) {
        boolean iconClickable = c1.L(iconView);
        boolean iconFocusable = false;
        int i2 = 1;
        boolean iconLongClickable = onLongClickListener != null;
        if (iconClickable || iconLongClickable) {
            iconFocusable = true;
        }
        iconView.setFocusable(iconFocusable);
        iconView.setClickable(iconClickable);
        iconView.setPressable(iconClickable);
        iconView.setLongClickable(iconLongClickable);
        if (!iconFocusable) {
            i2 = 2;
        }
        c1.s0(iconView, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        EditText editText = this.f1483f;
        if (editText != null) {
            Rect rect = this.Q;
            f.a(this, editText, rect);
            l0(rect);
            if (this.B) {
                this.H0.V(this.f1483f.getTextSize());
                int editTextGravity = this.f1483f.getGravity();
                this.H0.N((editTextGravity & (-113)) | 48);
                this.H0.U(editTextGravity);
                this.H0.J(r(rect));
                this.H0.R(u(rect));
                this.H0.F();
                if (A() && !this.G0) {
                    T();
                }
            }
        }
    }

    public final void l0(Rect bounds) {
        j jVar = this.F;
        if (jVar != null) {
            int i2 = bounds.bottom;
            int top = i2 - this.N;
            jVar.setBounds(bounds.left, top, bounds.right, i2);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    public final void E(Canvas canvas) {
        if (this.B) {
            this.H0.l(canvas);
        }
    }

    public final void D(Canvas canvas) {
        j jVar = this.F;
        if (jVar != null) {
            Rect underlineBounds = jVar.getBounds();
            underlineBounds.top = underlineBounds.bottom - this.L;
            this.F.draw(canvas);
        }
    }

    public final void z(boolean animate) {
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.K0.cancel();
        }
        if (!animate || !this.J0) {
            this.H0.X(1.0f);
        } else {
            i(1.0f);
        }
        this.G0 = false;
        if (A()) {
            T();
        }
        y0();
        B0();
        E0();
    }

    public final boolean A() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof m);
    }

    public final void T() {
        if (A()) {
            RectF cutoutBounds = this.S;
            this.H0.m(cutoutBounds, this.f1483f.getWidth(), this.f1483f.getGravity());
            l(cutoutBounds);
            int i2 = this.L;
            this.I = i2;
            cutoutBounds.top = 0.0f;
            cutoutBounds.bottom = i2;
            cutoutBounds.offset(-getPaddingLeft(), 0.0f);
            ((m) this.E).k0(cutoutBounds);
        }
    }

    public final void q0() {
        if (A() && !this.G0 && this.I != this.L) {
            y();
            T();
        }
    }

    public final void y() {
        if (A()) {
            ((m) this.E).h0();
        }
    }

    public final void l(RectF cutoutBounds) {
        float f2 = cutoutBounds.left;
        int i2 = this.H;
        cutoutBounds.left = f2 - i2;
        cutoutBounds.right += i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (!this.L0) {
            boolean z2 = true;
            this.L0 = true;
            super.drawableStateChanged();
            int[] state = getDrawableState();
            boolean changed = false;
            e eVar = this.H0;
            if (eVar != null) {
                changed = false | eVar.a0(state);
            }
            if (this.f1483f != null) {
                if (!c1.P(this) || !isEnabled()) {
                    z2 = false;
                }
                v0(z2);
            }
            s0();
            F0();
            if (changed) {
                invalidate();
            }
            this.L0 = false;
        }
    }

    public void F0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.E != null && this.J != 0) {
            boolean z2 = false;
            boolean hasFocus = isFocused() || ((editText2 = this.f1483f) != null && editText2.hasFocus());
            boolean isHovered = isHovered() || ((editText = this.f1483f) != null && editText.isHovered());
            if (!isEnabled()) {
                this.O = this.F0;
            } else if (this.f1491j.k()) {
                if (this.A0 != null) {
                    C0(hasFocus, isHovered);
                } else {
                    this.O = this.f1491j.o();
                }
            } else if (!this.f1497m || (textView = this.f1499n) == null) {
                if (hasFocus) {
                    this.O = this.f1524z0;
                } else if (isHovered) {
                    this.O = this.f1522y0;
                } else {
                    this.O = this.f1520x0;
                }
            } else if (this.A0 != null) {
                C0(hasFocus, isHovered);
            } else {
                this.O = textView.getCurrentTextColor();
            }
            if (getErrorIconDrawable() != null && this.f1491j.x() && this.f1491j.k()) {
                z2 = true;
            }
            setErrorIconVisible(z2);
            W();
            Y();
            V();
            if (getEndIconDelegate().d()) {
                j0(this.f1491j.k());
            }
            if (!hasFocus || !isEnabled()) {
                this.L = this.M;
            } else {
                this.L = this.N;
            }
            if (this.J == 2) {
                q0();
            }
            if (this.J == 1) {
                if (!isEnabled()) {
                    this.P = this.C0;
                } else if (isHovered && !hasFocus) {
                    this.P = this.E0;
                } else if (hasFocus) {
                    this.P = this.D0;
                } else {
                    this.P = this.B0;
                }
            }
            j();
        }
    }

    public final void C0(boolean hasFocus, boolean isHovered) {
        int defaultStrokeErrorColor = this.A0.getDefaultColor();
        int hoveredStrokeErrorColor = this.A0.getColorForState(new int[]{16843623, 16842910}, defaultStrokeErrorColor);
        int focusedStrokeErrorColor = this.A0.getColorForState(new int[]{16843518, 16842910}, defaultStrokeErrorColor);
        if (hasFocus) {
            this.O = focusedStrokeErrorColor;
        } else if (isHovered) {
            this.O = hoveredStrokeErrorColor;
        } else {
            this.O = defaultStrokeErrorColor;
        }
    }

    private void setErrorIconVisible(boolean errorIconVisible) {
        int i2 = 0;
        this.f1512t0.setVisibility(errorIconVisible ? 0 : 8);
        FrameLayout frameLayout = this.f1481e;
        if (errorIconVisible) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        D0();
        if (!I()) {
            r0();
        }
    }

    public final boolean L() {
        return this.f1512t0.getVisibility() == 0;
    }

    public final void X(CheckableImageButton iconView, ColorStateList colorStateList) {
        Drawable icon = iconView.getDrawable();
        if (iconView.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int color = colorStateList.getColorForState(R(iconView), colorStateList.getDefaultColor());
            y.a.l(icon);
            Drawable icon2 = icon.mutate();
            y.a.i(icon2, ColorStateList.valueOf(color));
            iconView.setImageDrawable(icon2);
        }
    }

    public final int[] R(CheckableImageButton iconView) {
        int[] textInputStates = getDrawableState();
        int[] iconStates = iconView.getDrawableState();
        int index = textInputStates.length;
        int[] states = Arrays.copyOf(textInputStates, textInputStates.length + iconStates.length);
        System.arraycopy(iconStates, 0, states, index, iconStates.length);
        return states;
    }

    public final void F(boolean animate) {
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.K0.cancel();
        }
        if (!animate || !this.J0) {
            this.H0.X(0.0f);
        } else {
            i(0.0f);
        }
        if (A() && ((m) this.E).e0()) {
            y();
        }
        this.G0 = true;
        J();
        B0();
        E0();
    }

    public void i(float target) {
        if (this.H0.v() != target) {
            if (this.K0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.K0 = valueAnimator;
                valueAnimator.setInterpolator(w0.a.f3652b);
                this.K0.setDuration(167L);
                this.K0.addUpdateListener(new p0(this));
            }
            this.K0.setFloatValues(this.H0.v(), target);
            this.K0.start();
        }
    }

    public final boolean N() {
        return this.G0;
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.H0.r();
    }

    public final float getHintCollapsedTextHeight() {
        return this.H0.o();
    }

    public final int getErrorTextCurrentColor() {
        return this.f1491j.o();
    }
}
