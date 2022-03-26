package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.example.helloworld.R;
import f0.b;
import f0.c1;
import g0.f;
import java.util.Arrays;
import n1.d;
import v0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ClockFaceView extends j implements g {
    public final SparseArray A;
    public final b B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public String[] I;
    public float J;
    public final ColorStateList K;

    /* renamed from: x  reason: collision with root package name */
    public final ClockHandView f1529x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f1530y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f1531z;

    public ClockFaceView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1530y = new Rect();
        this.f1531z = new RectF();
        this.A = new SparseArray();
        this.D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3607d, defStyleAttr, 2131755719);
        Resources res = getResources();
        int[] iArr = a.f3604a;
        ColorStateList a3 = d.a(context, a2, 1);
        this.K = a3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1529x = clockHandView;
        this.E = res.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int clockHandTextColor = a3.getColorForState(new int[]{16842913}, a3.getDefaultColor());
        this.C = new int[]{clockHandTextColor, clockHandTextColor, a3.getDefaultColor()};
        clockHandView.b(this);
        int defaultBackgroundColor = e.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList backgroundColor = d.a(context, a2, 0);
        setBackgroundColor(backgroundColor == null ? defaultBackgroundColor : backgroundColor.getDefaultColor());
        getViewTreeObserver().addOnPreDrawListener(new c(this));
        setFocusable(true);
        a2.recycle();
        this.B = new d(this);
        String[] initialValues = new String[12];
        Arrays.fill(initialValues, "");
        G(initialValues, 0);
        this.F = res.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.G = res.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.H = res.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public void G(String[] values, int contentDescription) {
        this.I = values;
        H(contentDescription);
    }

    public final void H(int contentDescription) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        int size = this.A.size();
        for (int i2 = 0; i2 < Math.max(this.I.length, size); i2++) {
            TextView textView = (TextView) this.A.get(i2);
            if (i2 >= this.I.length) {
                removeView(textView);
                this.A.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) inflater.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.A.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.I[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                c1.l0(textView, this.B);
                textView.setTextColor(this.K);
                if (contentDescription != 0) {
                    Resources res = getResources();
                    textView.setContentDescription(res.getString(contentDescription, this.I[i2]));
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        f infoCompat = f.v0(info);
        infoCompat.Y(g0.d.a(1, this.I.length, false, 1));
    }

    @Override // com.google.android.material.timepicker.j
    public void v(int radius) {
        if (radius != u()) {
            super.v(radius);
            this.f1529x.j(u());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        C();
    }

    public final void C() {
        RectF selectorBox = this.f1529x.d();
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            TextView tv = (TextView) this.A.get(i2);
            if (tv != null) {
                tv.getDrawingRect(this.f1530y);
                this.f1530y.offset(tv.getPaddingLeft(), tv.getPaddingTop());
                offsetDescendantRectToMyCoords(tv, this.f1530y);
                this.f1531z.set(this.f1530y);
                RadialGradient radialGradient = D(selectorBox, this.f1531z);
                tv.getPaint().setShader(radialGradient);
                tv.invalidate();
            }
        }
    }

    public final RadialGradient D(RectF selectorBox, RectF tvBox) {
        if (!RectF.intersects(selectorBox, tvBox)) {
            return null;
        }
        return new RadialGradient(selectorBox.centerX() - this.f1531z.left, selectorBox.centerY() - this.f1531z.top, 0.5f * selectorBox.width(), this.C, this.D, Shader.TileMode.CLAMP);
    }

    public void F(float rotation, boolean animating) {
        if (Math.abs(this.J - rotation) > 0.001f) {
            this.J = rotation;
            C();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Resources r2 = getResources();
        DisplayMetrics displayMetrics = r2.getDisplayMetrics();
        float height = displayMetrics.heightPixels;
        float width = displayMetrics.widthPixels;
        int size = (int) (this.H / E(this.F / height, this.G / width, 1.0f));
        int spec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        setMeasuredDimension(size, size);
        super.onMeasure(spec, spec);
    }

    public static float E(float a2, float b2, float c2) {
        return Math.max(Math.max(a2, b2), c2);
    }
}
