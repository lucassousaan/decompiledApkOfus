package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import e0.h;
import f0.c1;
import n1.d;
import q1.j;
import q1.q;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f1376a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f1377b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f1378c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f1379d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1380e;

    /* renamed from: f  reason: collision with root package name */
    public final q f1381f;

    public e(ColorStateList backgroundColor, ColorStateList textColor, ColorStateList strokeColor, int strokeWidth, q itemShape, Rect insets) {
        h.c(insets.left);
        h.c(insets.top);
        h.c(insets.right);
        h.c(insets.bottom);
        this.f1376a = insets;
        this.f1377b = textColor;
        this.f1378c = backgroundColor;
        this.f1379d = strokeColor;
        this.f1380e = strokeWidth;
        this.f1381f = itemShape;
    }

    public static e a(Context context, int materialCalendarItemStyle) {
        h.a(materialCalendarItemStyle != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray styleableArray = context.obtainStyledAttributes(materialCalendarItemStyle, a.f3617n);
        int[] iArr = a.f3604a;
        int insetLeft = styleableArray.getDimensionPixelOffset(0, 0);
        int insetTop = styleableArray.getDimensionPixelOffset(2, 0);
        int insetRight = styleableArray.getDimensionPixelOffset(1, 0);
        int insetBottom = styleableArray.getDimensionPixelOffset(3, 0);
        Rect insets = new Rect(insetLeft, insetTop, insetRight, insetBottom);
        ColorStateList backgroundColor = d.a(context, styleableArray, 4);
        ColorStateList textColor = d.a(context, styleableArray, 9);
        ColorStateList strokeColor = d.a(context, styleableArray, 7);
        int strokeWidth = styleableArray.getDimensionPixelSize(8, 0);
        int shapeAppearanceResId = styleableArray.getResourceId(5, 0);
        int shapeAppearanceOverlayResId = styleableArray.getResourceId(6, 0);
        q itemShape = q.b(context, shapeAppearanceResId, shapeAppearanceOverlayResId).m();
        styleableArray.recycle();
        return new e(backgroundColor, textColor, strokeColor, strokeWidth, itemShape, insets);
    }

    public void b(TextView item) {
        j backgroundDrawable = new j();
        j shapeMask = new j();
        backgroundDrawable.setShapeAppearanceModel(this.f1381f);
        shapeMask.setShapeAppearanceModel(this.f1381f);
        backgroundDrawable.T(this.f1378c);
        backgroundDrawable.Y(this.f1380e, this.f1379d);
        item.setTextColor(this.f1377b);
        Drawable d2 = new RippleDrawable(this.f1377b.withAlpha(30), backgroundDrawable, shapeMask);
        Rect rect = this.f1376a;
        c1.o0(item, new InsetDrawable(d2, rect.left, rect.top, rect.right, rect.bottom));
    }
}
