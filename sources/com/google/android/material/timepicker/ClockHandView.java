package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.example.helloworld.R;
import f0.c1;
import java.util.ArrayList;
import java.util.List;
import v0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f1532b;

    /* renamed from: c  reason: collision with root package name */
    public float f1533c;

    /* renamed from: d  reason: collision with root package name */
    public float f1534d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1535e;

    /* renamed from: f  reason: collision with root package name */
    public int f1536f;

    /* renamed from: g  reason: collision with root package name */
    public final List f1537g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1538h;

    /* renamed from: i  reason: collision with root package name */
    public final float f1539i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f1540j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f1541k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1542l;

    /* renamed from: m  reason: collision with root package name */
    public float f1543m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1544n;

    /* renamed from: o  reason: collision with root package name */
    public double f1545o;

    /* renamed from: p  reason: collision with root package name */
    public int f1546p;

    public ClockHandView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1537g = new ArrayList();
        Paint paint = new Paint();
        this.f1540j = paint;
        this.f1541k = new RectF();
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f3608e, defStyleAttr, 2131755719);
        int[] iArr = a.f3604a;
        this.f1546p = a2.getDimensionPixelSize(1, 0);
        this.f1538h = a2.getDimensionPixelSize(2, 0);
        Resources res = getResources();
        this.f1542l = res.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1539i = res.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int selectorColor = a2.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(selectorColor);
        k(0.0f);
        this.f1536f = ViewConfiguration.get(context).getScaledTouchSlop();
        c1.s0(this, 2);
        a2.recycle();
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        k(f());
    }

    public void k(float degrees) {
        l(degrees, false);
    }

    public void l(float degrees, boolean animate) {
        ValueAnimator valueAnimator = this.f1532b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!animate) {
            m(degrees, false);
            return;
        }
        Pair<Float, Float> animationValues = h(degrees);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) animationValues.first).floatValue(), ((Float) animationValues.second).floatValue());
        this.f1532b = ofFloat;
        ofFloat.setDuration(200L);
        this.f1532b.addUpdateListener(new e(this));
        this.f1532b.addListener(new f(this));
        this.f1532b.start();
    }

    public final Pair h(float degrees) {
        float currentDegrees = f();
        if (Math.abs(currentDegrees - degrees) > 180.0f) {
            if (currentDegrees > 180.0f && degrees < 180.0f) {
                degrees += 360.0f;
            }
            if (currentDegrees < 180.0f && degrees > 180.0f) {
                currentDegrees += 360.0f;
            }
        }
        return new Pair(Float.valueOf(currentDegrees), Float.valueOf(degrees));
    }

    public final void m(float degrees, boolean animate) {
        float degrees2 = degrees % 360.0f;
        this.f1543m = degrees2;
        float angDeg = degrees2 - 90.0f;
        this.f1545o = Math.toRadians(angDeg);
        int yCenter = getHeight() / 2;
        int xCenter = getWidth() / 2;
        float selCenterX = xCenter + (this.f1546p * ((float) Math.cos(this.f1545o)));
        float selCenterY = yCenter + (this.f1546p * ((float) Math.sin(this.f1545o)));
        RectF rectF = this.f1541k;
        int i2 = this.f1538h;
        rectF.set(selCenterX - i2, selCenterY - i2, i2 + selCenterX, i2 + selCenterY);
        for (g listener : this.f1537g) {
            ((ClockFaceView) listener).F(degrees2, animate);
        }
        invalidate();
    }

    public void b(g listener) {
        this.f1537g.add(listener);
    }

    public float f() {
        return this.f1543m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    public final void c(Canvas canvas) {
        int yCenter = getHeight() / 2;
        int xCenter = getWidth() / 2;
        float selCenterX = xCenter + (this.f1546p * ((float) Math.cos(this.f1545o)));
        float selCenterY = yCenter + (this.f1546p * ((float) Math.sin(this.f1545o)));
        this.f1540j.setStrokeWidth(0.0f);
        canvas.drawCircle(selCenterX, selCenterY, this.f1538h, this.f1540j);
        double sin = Math.sin(this.f1545o);
        double cos = Math.cos(this.f1545o);
        float lineLength = this.f1546p - this.f1538h;
        float linePointX = ((int) (lineLength * cos)) + xCenter;
        float linePointY = ((int) (lineLength * sin)) + yCenter;
        this.f1540j.setStrokeWidth(this.f1542l);
        canvas.drawLine(xCenter, yCenter, linePointX, linePointY, this.f1540j);
        canvas.drawCircle(xCenter, yCenter, this.f1539i, this.f1540j);
    }

    public RectF d() {
        return this.f1541k;
    }

    public int g() {
        return this.f1538h;
    }

    public void j(int circleRadius) {
        this.f1546p = circleRadius;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getActionMasked();
        boolean forceSelection = false;
        boolean actionDown = false;
        boolean actionUp = false;
        float x2 = event.getX();
        float y2 = event.getY();
        actionUp = false;
        switch (action) {
            case 0:
                this.f1533c = x2;
                this.f1534d = y2;
                this.f1535e = true;
                this.f1544n = false;
                actionDown = true;
                break;
            case 1:
            case 2:
                int deltaX = (int) (x2 - this.f1533c);
                int deltaY = (int) (y2 - this.f1534d);
                int distance = (deltaX * deltaX) + (deltaY * deltaY);
                this.f1535e = distance > this.f1536f;
                if (this.f1544n) {
                    forceSelection = true;
                }
                if (action == 1) {
                    actionUp = true;
                }
                break;
        }
        this.f1544n = i(x2, y2, forceSelection, actionDown, actionUp) | this.f1544n;
        return true;
    }

    public final boolean i(float x2, float y2, boolean forceSelection, boolean touchDown, boolean actionUp) {
        int degrees = e(x2, y2);
        boolean valueChanged = f() != ((float) degrees);
        if (touchDown && valueChanged) {
            return true;
        }
        if (!valueChanged && !forceSelection) {
            return false;
        }
        float f2 = degrees;
        if (actionUp) {
        }
        l(f2, false);
        return true;
    }

    public final int e(float x2, float y2) {
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        double dX = x2 - xCenter;
        double dY = y2 - yCenter;
        int degrees = ((int) Math.toDegrees(Math.atan2(dY, dX))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }
}
