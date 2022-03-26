package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.example.helloworld.R;
import n1.c;
import n1.d;
import v0.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e f1382a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1383b;

    /* renamed from: c  reason: collision with root package name */
    public final e f1384c;

    /* renamed from: d  reason: collision with root package name */
    public final e f1385d;

    /* renamed from: e  reason: collision with root package name */
    public final e f1386e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1387f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1388g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f1389h;

    public f(Context context) {
        int calendarStyle = c.c(context, R.attr.materialCalendarStyle, x.class.getCanonicalName());
        TypedArray calendarAttributes = context.obtainStyledAttributes(calendarStyle, a.f3616m);
        int[] iArr = a.f3604a;
        this.f1382a = e.a(context, calendarAttributes.getResourceId(3, 0));
        this.f1388g = e.a(context, calendarAttributes.getResourceId(1, 0));
        this.f1383b = e.a(context, calendarAttributes.getResourceId(2, 0));
        this.f1384c = e.a(context, calendarAttributes.getResourceId(4, 0));
        ColorStateList rangeFillColorList = d.a(context, calendarAttributes, 6);
        this.f1385d = e.a(context, calendarAttributes.getResourceId(8, 0));
        this.f1386e = e.a(context, calendarAttributes.getResourceId(7, 0));
        this.f1387f = e.a(context, calendarAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f1389h = paint;
        paint.setColor(rangeFillColorList.getDefaultColor());
        calendarAttributes.recycle();
    }
}
