package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.example.helloworld.R;
import e.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e1 extends Spinner {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f308j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final x f309b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f310c;

    /* renamed from: d  reason: collision with root package name */
    public z1 f311d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f312e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f313f;

    /* renamed from: g  reason: collision with root package name */
    public d1 f314g;

    /* renamed from: h  reason: collision with root package name */
    public int f315h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f316i;

    public e1(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.spinnerStyle);
    }

    public e1(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public e1(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        this(context, attrs, defStyleAttr, mode, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r2 == null) goto L_0x006b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e1(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f316i = r0
            android.content.Context r0 = r8.getContext()
            androidx.appcompat.widget.o3.a(r8, r0)
            int[] r0 = c.a.f1187u
            r1 = 0
            androidx.appcompat.widget.s3 r0 = androidx.appcompat.widget.s3.v(r9, r10, r0, r11, r1)
            androidx.appcompat.widget.x r2 = new androidx.appcompat.widget.x
            r2.<init>(r8)
            r8.f309b = r2
            if (r13 == 0) goto L_0x0029
            g.e r2 = new g.e
            r2.<init>(r9, r13)
            r8.f310c = r2
            goto L_0x003c
        L_0x0029:
            int[] r2 = c.a.f1167a
            r2 = 4
            int r2 = r0.n(r2, r1)
            if (r2 == 0) goto L_0x003a
            g.e r3 = new g.e
            r3.<init>(r9, r2)
            r8.f310c = r3
            goto L_0x003c
        L_0x003a:
            r8.f310c = r9
        L_0x003c:
            r2 = -1
            if (r12 != r2) goto L_0x006b
            r2 = 0
            int[] r3 = androidx.appcompat.widget.e1.f308j     // Catch: all -> 0x0057, Exception -> 0x0059
            android.content.res.TypedArray r3 = r9.obtainStyledAttributes(r10, r3, r11, r1)     // Catch: all -> 0x0057, Exception -> 0x0059
            r2 = r3
            boolean r3 = r2.hasValue(r1)     // Catch: all -> 0x0057, Exception -> 0x0059
            if (r3 == 0) goto L_0x0052
            int r3 = r2.getInt(r1, r1)     // Catch: all -> 0x0057, Exception -> 0x0059
            r12 = r3
        L_0x0052:
        L_0x0053:
            r2.recycle()
            goto L_0x006b
        L_0x0057:
            r1 = move-exception
            goto L_0x0065
        L_0x0059:
            r3 = move-exception
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: all -> 0x0057
            if (r2 == 0) goto L_0x006b
            goto L_0x0053
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r1
        L_0x006b:
            r2 = 1
            r3 = 2
            switch(r12) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x00b7
        L_0x0071:
            androidx.appcompat.widget.a1 r4 = new androidx.appcompat.widget.a1
            android.content.Context r5 = r8.f310c
            r4.<init>(r8, r5, r10, r11)
            android.content.Context r5 = r8.f310c
            int[] r6 = c.a.f1187u
            androidx.appcompat.widget.s3 r5 = androidx.appcompat.widget.s3.v(r5, r10, r6, r11, r1)
            int[] r6 = c.a.f1167a
            r6 = 3
            r7 = -2
            int r6 = r5.m(r6, r7)
            r8.f315h = r6
            android.graphics.drawable.Drawable r6 = r5.g(r2)
            r4.l(r6)
            java.lang.String r3 = r0.o(r3)
            r4.h(r3)
            r5.w()
            r8.f314g = r4
            androidx.appcompat.widget.t0 r3 = new androidx.appcompat.widget.t0
            r3.<init>(r8, r8, r4)
            r8.f311d = r3
            goto L_0x00b7
        L_0x00a6:
            androidx.appcompat.widget.v0 r4 = new androidx.appcompat.widget.v0
            r4.<init>(r8)
            r8.f314g = r4
            int[] r5 = c.a.f1167a
            java.lang.String r3 = r0.o(r3)
            r4.h(r3)
        L_0x00b7:
            int[] r3 = c.a.f1167a
            java.lang.CharSequence[] r1 = r0.q(r1)
            if (r1 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r9, r4, r1)
            r4 = 2131427425(0x7f0b0061, float:1.8476466E38)
            r3.setDropDownViewResource(r4)
            r8.setAdapter(r3)
        L_0x00d0:
            r0.w()
            r8.f313f = r2
            android.widget.SpinnerAdapter r2 = r8.f312e
            if (r2 == 0) goto L_0x00df
            r8.setAdapter(r2)
            r2 = 0
            r8.f312e = r2
        L_0x00df:
            androidx.appcompat.widget.x r2 = r8.f309b
            r2.e(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e1.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f310c;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable background) {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            d1Var.l(background);
        } else {
            super.setPopupBackgroundDrawable(background);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(a.b(getPopupContext(), resId));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            return d1Var.n();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int pixels) {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            d1Var.m(pixels);
        } else {
            super.setDropDownVerticalOffset(pixels);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            return d1Var.j();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int pixels) {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            d1Var.p(pixels);
            this.f314g.c(pixels);
            return;
        }
        super.setDropDownHorizontalOffset(pixels);
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            return d1Var.d();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int pixels) {
        if (this.f314g != null) {
            this.f315h = pixels;
        } else {
            super.setDropDownWidth(pixels);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f314g != null) {
            return this.f315h;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter adapter) {
        if (!this.f313f) {
            this.f312e = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.f314g != null) {
            Context popupContext = this.f310c;
            if (popupContext == null) {
                popupContext = getContext();
            }
            this.f314g.o(new w0(adapter, popupContext.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d1 d1Var = this.f314g;
        if (d1Var != null && d1Var.a()) {
            this.f314g.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        z1 z1Var = this.f311d;
        if (z1Var == null || !z1Var.onTouch(this, event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f314g != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(Math.min(Math.max(measuredWidth, a(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        d1 d1Var = this.f314g;
        if (d1Var == null) {
            return super.performClick();
        }
        if (d1Var.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence prompt) {
        d1 d1Var = this.f314g;
        if (d1Var != null) {
            d1Var.h(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        d1 d1Var = this.f314g;
        return d1Var != null ? d1Var.b() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f309b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f309b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f309b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f309b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f309b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f309b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f309b;
        if (xVar != null) {
            xVar.b();
        }
    }

    public int a(SpinnerAdapter adapter, Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int start = Math.max(0, getSelectedItemPosition());
        int end = Math.min(adapter.getCount(), start + 15);
        int count = end - start;
        for (int i2 = Math.max(0, start - (15 - count)); i2 < end; i2++) {
            int positionType = adapter.getItemViewType(i2);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i2, itemView, this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.f316i);
        Rect rect = this.f316i;
        return width + rect.left + rect.right;
    }

    public final d1 getInternalPopup() {
        return this.f314g;
    }

    public void b() {
        this.f314g.f(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        c1 ss = new c1(super.onSaveInstanceState());
        d1 d1Var = this.f314g;
        ss.f274b = d1Var != null && d1Var.a();
        return ss;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        ViewTreeObserver vto;
        c1 ss = (c1) state;
        super.onRestoreInstanceState(ss.getSuperState());
        if (ss.f274b && (vto = getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener listener = new u0(this);
            vto.addOnGlobalLayoutListener(listener);
        }
    }
}
