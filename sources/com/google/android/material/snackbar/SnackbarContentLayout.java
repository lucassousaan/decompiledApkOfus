package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.helloworld.R;
import f0.c1;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public TextView f1468b;

    /* renamed from: c  reason: collision with root package name */
    public Button f1469c;

    /* renamed from: d  reason: collision with root package name */
    public int f1470d;

    /* renamed from: e  reason: collision with root package name */
    public int f1471e;

    public SnackbarContentLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3627x);
        int[] iArr = a.f3604a;
        this.f1470d = a2.getDimensionPixelSize(0, -1);
        this.f1471e = a2.getDimensionPixelSize(7, -1);
        a2.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1468b = (TextView) findViewById(R.id.snackbar_text);
        this.f1469c = (Button) findViewById(R.id.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f1468b;
    }

    public Button getActionView() {
        return this.f1469c;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f1470d > 0) {
            int measuredWidth = getMeasuredWidth();
            int i2 = this.f1470d;
            if (measuredWidth > i2) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
        int multiLineVPadding = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int singleLineVPadding = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean isMultiLine = this.f1468b.getLayout().getLineCount() > 1;
        boolean remeasure = false;
        if (!isMultiLine || this.f1471e <= 0 || this.f1469c.getMeasuredWidth() <= this.f1471e) {
            int messagePadding = isMultiLine ? multiLineVPadding : singleLineVPadding;
            if (b(0, messagePadding, messagePadding)) {
                remeasure = true;
            }
        } else if (b(1, multiLineVPadding, multiLineVPadding - singleLineVPadding)) {
            remeasure = true;
        }
        if (remeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final boolean b(int orientation, int messagePadTop, int messagePadBottom) {
        boolean changed = false;
        if (orientation != getOrientation()) {
            setOrientation(orientation);
            changed = true;
        }
        if (this.f1468b.getPaddingTop() == messagePadTop && this.f1468b.getPaddingBottom() == messagePadBottom) {
            return changed;
        }
        a(this.f1468b, messagePadTop, messagePadBottom);
        return true;
    }

    public static void a(View view, int topPadding, int bottomPadding) {
        if (c1.R(view)) {
            c1.v0(view, c1.F(view), topPadding, c1.E(view), bottomPadding);
        } else {
            view.setPadding(view.getPaddingLeft(), topPadding, view.getPaddingRight(), bottomPadding);
        }
    }

    public void setMaxInlineActionWidth(int width) {
        this.f1471e = width;
    }
}
