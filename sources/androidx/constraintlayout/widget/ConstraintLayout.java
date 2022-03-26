package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import o.d;
import o.g;
import o.h;
import q.c;
import q.e;
import q.f;
import q.i;
import q.o;
import q.p;
import q.r;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f609b = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f610c = new ArrayList(4);

    /* renamed from: d  reason: collision with root package name */
    public h f611d = new h();

    /* renamed from: e  reason: collision with root package name */
    public int f612e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f613f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f614g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public int f615h = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public boolean f616i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f617j = 257;

    /* renamed from: k  reason: collision with root package name */
    public o f618k = null;

    /* renamed from: l  reason: collision with root package name */
    public i f619l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f620m = -1;

    /* renamed from: n  reason: collision with root package name */
    public HashMap f621n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    public int f622o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f623p = -1;

    /* renamed from: q  reason: collision with root package name */
    public SparseArray f624q = new SparseArray();

    /* renamed from: r  reason: collision with root package name */
    public f f625r = new f(this, this);

    /* renamed from: s  reason: collision with root package name */
    public int f626s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f627t = 0;

    public void q(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.f621n == null) {
                this.f621n = new HashMap();
            }
            String name = (String) value1;
            int index = name.indexOf("/");
            if (index != -1) {
                name = name.substring(index + 1);
            }
            int id = ((Integer) value2).intValue();
            this.f621n.put(name, Integer.valueOf(id));
        }
    }

    public Object f(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String name = (String) value;
        HashMap hashMap = this.f621n;
        if (hashMap == null || !hashMap.containsKey(name)) {
            return null;
        }
        return this.f621n.get(name);
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        j(attrs, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        j(attrs, defStyleAttr, 0);
    }

    @Override // android.view.View
    public void setId(int id) {
        this.f609b.remove(getId());
        super.setId(id);
        this.f609b.put(getId(), this);
    }

    public final void j(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f611d.i0(this);
        this.f611d.y1(this.f625r);
        this.f609b.put(getId(), this);
        this.f618k = null;
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, r.f2945b, defStyleAttr, defStyleRes);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                int[] iArr = r.f2944a;
                if (attr == 9) {
                    this.f612e = a2.getDimensionPixelOffset(attr, this.f612e);
                } else if (attr == 10) {
                    this.f613f = a2.getDimensionPixelOffset(attr, this.f613f);
                } else if (attr == 7) {
                    this.f614g = a2.getDimensionPixelOffset(attr, this.f614g);
                } else if (attr == 8) {
                    this.f615h = a2.getDimensionPixelOffset(attr, this.f615h);
                } else if (attr == 90) {
                    this.f617j = a2.getInt(attr, this.f617j);
                } else if (attr == 39) {
                    int id = a2.getResourceId(attr, 0);
                    if (id != 0) {
                        try {
                            m(id);
                        } catch (Resources.NotFoundException e2) {
                            this.f619l = null;
                        }
                    }
                } else if (attr == 18) {
                    int id2 = a2.getResourceId(attr, 0);
                    try {
                        o oVar = new o();
                        this.f618k = oVar;
                        oVar.l(getContext(), id2);
                    } catch (Resources.NotFoundException e3) {
                        this.f618k = null;
                    }
                    this.f620m = id2;
                }
            }
            a2.recycle();
        }
        this.f611d.z1(this.f617j);
    }

    public void m(int id) {
        this.f619l = new i(getContext(), this, id);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        g widget = i(view);
        if ((view instanceof Guideline) && !(widget instanceof o.i)) {
            e layoutParams = (e) view.getLayoutParams();
            o.i iVar = new o.i();
            layoutParams.f2835m0 = iVar;
            layoutParams.Y = true;
            iVar.e1(layoutParams.R);
        }
        if (view instanceof c) {
            c helper = (c) view;
            helper.l();
            ((e) view.getLayoutParams()).Z = true;
            if (!this.f610c.contains(helper)) {
                this.f610c.add(helper);
            }
        }
        this.f609b.put(view.getId(), view);
        this.f616i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f609b.remove(view.getId());
        g widget = i(view);
        this.f611d.Y0(widget);
        this.f610c.remove(view);
        this.f616i = true;
    }

    public void setMinWidth(int value) {
        if (value != this.f612e) {
            this.f612e = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.f613f) {
            this.f613f = value;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f612e;
    }

    public int getMinHeight() {
        return this.f613f;
    }

    public void setMaxWidth(int value) {
        if (value != this.f614g) {
            this.f614g = value;
            requestLayout();
        }
    }

    public void setMaxHeight(int value) {
        if (value != this.f615h) {
            this.f615h = value;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f614g;
    }

    public int getMaxHeight() {
        return this.f615h;
    }

    public final boolean s() {
        int count = getChildCount();
        boolean recompute = false;
        int i2 = 0;
        while (true) {
            if (i2 >= count) {
                break;
            }
            View child = getChildAt(i2);
            if (child.isLayoutRequested()) {
                recompute = true;
                break;
            }
            i2++;
        }
        if (recompute) {
            p();
        }
        return recompute;
    }

    public final void p() {
        boolean isInEditMode = isInEditMode();
        int count = getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            g widget = i(getChildAt(i2));
            if (widget != null) {
                widget.e0();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < count; i3++) {
                View view = getChildAt(i3);
                try {
                    String IdAsString = getResources().getResourceName(view.getId());
                    q(0, IdAsString, Integer.valueOf(view.getId()));
                    int slashIndex = IdAsString.indexOf(47);
                    if (slashIndex != -1) {
                        IdAsString = IdAsString.substring(slashIndex + 1);
                    }
                    g(view.getId()).j0(IdAsString);
                } catch (Resources.NotFoundException e2) {
                }
            }
        }
        int i4 = this.f620m;
        if (i4 != -1) {
            for (int i5 = 0; i5 < count; i5++) {
                if (getChildAt(i5).getId() == this.f620m) {
                }
            }
        }
        o oVar = this.f618k;
        if (oVar != null) {
            oVar.d(this, true);
        }
        this.f611d.Z0();
        int helperCount = this.f610c.size();
        if (helperCount > 0) {
            for (int i6 = 0; i6 < helperCount; i6++) {
                c helper = (c) this.f610c.get(i6);
                helper.k(this);
            }
        }
        for (int i7 = 0; i7 < count; i7++) {
            getChildAt(i7);
        }
        this.f624q.clear();
        this.f624q.put(0, this.f611d);
        this.f624q.put(getId(), this.f611d);
        for (int i8 = 0; i8 < count; i8++) {
            View child = getChildAt(i8);
            this.f624q.put(child.getId(), i(child));
        }
        for (int i9 = 0; i9 < count; i9++) {
            View child2 = getChildAt(i9);
            g widget2 = i(child2);
            if (widget2 != null) {
                e layoutParams = (e) child2.getLayoutParams();
                this.f611d.V0(widget2);
                c(isInEditMode, child2, widget2, layoutParams, this.f624q);
            }
        }
    }

    public void c(boolean isInEditMode, View child, g widget, e layoutParams, SparseArray sparseArray) {
        int i2;
        float resolvedHorizontalBias;
        int resolveGoneRightMargin;
        g target;
        g target2;
        g target3;
        g target4;
        layoutParams.a();
        Objects.requireNonNull(layoutParams);
        widget.O0(child.getVisibility());
        Objects.requireNonNull(layoutParams);
        widget.i0(child);
        if (child instanceof c) {
            c helper = (c) child;
            helper.g(widget, this.f611d.s1());
        }
        if (layoutParams.Y) {
            o.i guideline = (o.i) widget;
            int resolvedGuideBegin = layoutParams.f2829j0;
            int resolvedGuideEnd = layoutParams.f2831k0;
            float resolvedGuidePercent = layoutParams.f2833l0;
            if (resolvedGuidePercent != -1.0f) {
                guideline.d1(resolvedGuidePercent);
            } else if (resolvedGuideBegin != -1) {
                guideline.b1(resolvedGuideBegin);
            } else if (resolvedGuideEnd != -1) {
                guideline.c1(resolvedGuideEnd);
            }
        } else {
            int resolvedLeftToLeft = layoutParams.f2815c0;
            int resolvedLeftToRight = layoutParams.f2817d0;
            int resolvedRightToLeft = layoutParams.f2819e0;
            int resolvedRightToRight = layoutParams.f2821f0;
            int resolveGoneLeftMargin = layoutParams.f2823g0;
            int resolveGoneRightMargin2 = layoutParams.f2825h0;
            float resolvedHorizontalBias2 = layoutParams.f2827i0;
            int i3 = layoutParams.f2834m;
            if (i3 != -1) {
                g target5 = (g) sparseArray.get(i3);
                if (target5 != null) {
                    widget.g(target5, layoutParams.f2837o, layoutParams.f2836n);
                }
            } else {
                if (resolvedLeftToLeft != -1) {
                    g target6 = (g) sparseArray.get(resolvedLeftToLeft);
                    if (target6 != null) {
                        d dVar = d.LEFT;
                        resolvedHorizontalBias = resolvedHorizontalBias2;
                        resolveGoneRightMargin = resolveGoneRightMargin2;
                        widget.U(dVar, target6, dVar, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, resolveGoneLeftMargin);
                    } else {
                        resolvedHorizontalBias = resolvedHorizontalBias2;
                        resolveGoneRightMargin = resolveGoneRightMargin2;
                    }
                } else {
                    resolvedHorizontalBias = resolvedHorizontalBias2;
                    resolveGoneRightMargin = resolveGoneRightMargin2;
                    if (!(resolvedLeftToRight == -1 || (target4 = (g) sparseArray.get(resolvedLeftToRight)) == null)) {
                        widget.U(d.LEFT, target4, d.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, resolveGoneLeftMargin);
                    }
                }
                if (resolvedRightToLeft != -1) {
                    g target7 = (g) sparseArray.get(resolvedRightToLeft);
                    if (target7 != null) {
                        widget.U(d.RIGHT, target7, d.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolveGoneRightMargin);
                    }
                } else if (!(resolvedRightToRight == -1 || (target3 = (g) sparseArray.get(resolvedRightToRight)) == null)) {
                    d dVar2 = d.RIGHT;
                    widget.U(dVar2, target3, dVar2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolveGoneRightMargin);
                }
                int i4 = layoutParams.f2824h;
                if (i4 != -1) {
                    g target8 = (g) sparseArray.get(i4);
                    if (target8 != null) {
                        d dVar3 = d.TOP;
                        widget.U(dVar3, target8, dVar3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2843u);
                    }
                } else {
                    int i5 = layoutParams.f2826i;
                    if (!(i5 == -1 || (target2 = (g) sparseArray.get(i5)) == null)) {
                        widget.U(d.TOP, target2, d.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2843u);
                    }
                }
                int i6 = layoutParams.f2828j;
                if (i6 != -1) {
                    g target9 = (g) sparseArray.get(i6);
                    if (target9 != null) {
                        widget.U(d.BOTTOM, target9, d.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2845w);
                    }
                } else {
                    int i7 = layoutParams.f2830k;
                    if (!(i7 == -1 || (target = (g) sparseArray.get(i7)) == null)) {
                        d dVar4 = d.BOTTOM;
                        widget.U(dVar4, target, dVar4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2845w);
                    }
                }
                int i8 = layoutParams.f2832l;
                if (i8 != -1) {
                    View view = (View) this.f609b.get(i8);
                    g target10 = (g) sparseArray.get(layoutParams.f2832l);
                    if (!(target10 == null || view == null || !(view.getLayoutParams() instanceof e))) {
                        e targetParams = (e) view.getLayoutParams();
                        layoutParams.X = true;
                        targetParams.X = true;
                        d dVar5 = d.BASELINE;
                        o.e baseline = widget.j(dVar5);
                        o.e targetBaseline = target10.j(dVar5);
                        baseline.a(targetBaseline, 0, -1, true);
                        widget.r0(true);
                        targetParams.f2835m0.r0(true);
                        widget.j(d.TOP).p();
                        widget.j(d.BOTTOM).p();
                    }
                }
                if (resolvedHorizontalBias >= 0.0f) {
                    widget.t0(resolvedHorizontalBias);
                }
                float f2 = layoutParams.A;
                if (f2 >= 0.0f) {
                    widget.I0(f2);
                }
            }
            if (isInEditMode && !((i2 = layoutParams.P) == -1 && layoutParams.Q == -1)) {
                widget.G0(i2, layoutParams.Q);
            }
            if (layoutParams.V) {
                widget.w0(o.f.FIXED);
                widget.P0(((ViewGroup.MarginLayoutParams) layoutParams).width);
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                    widget.w0(o.f.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.S) {
                    widget.w0(o.f.MATCH_CONSTRAINT);
                } else {
                    widget.w0(o.f.MATCH_PARENT);
                }
                widget.j(d.LEFT).f2621g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                widget.j(d.RIGHT).f2621g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                widget.w0(o.f.MATCH_CONSTRAINT);
                widget.P0(0);
            }
            if (layoutParams.W) {
                widget.L0(o.f.FIXED);
                widget.s0(((ViewGroup.MarginLayoutParams) layoutParams).height);
                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                    widget.L0(o.f.WRAP_CONTENT);
                }
            } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.T) {
                    widget.L0(o.f.MATCH_CONSTRAINT);
                } else {
                    widget.L0(o.f.MATCH_PARENT);
                }
                widget.j(d.TOP).f2621g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                widget.j(d.BOTTOM).f2621g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                widget.L0(o.f.MATCH_CONSTRAINT);
                widget.s0(0);
            }
            widget.k0(layoutParams.B);
            widget.y0(layoutParams.D);
            widget.N0(layoutParams.E);
            widget.u0(layoutParams.F);
            widget.J0(layoutParams.G);
            widget.x0(layoutParams.H, layoutParams.J, layoutParams.L, layoutParams.N);
            widget.M0(layoutParams.I, layoutParams.K, layoutParams.M, layoutParams.O);
        }
    }

    public final g g(int id) {
        if (id == 0) {
            return this.f611d;
        }
        View view = (View) this.f609b.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f611d;
        }
        if (view == null) {
            return null;
        }
        return ((e) view.getLayoutParams()).f2835m0;
    }

    public final g i(View view) {
        if (view == this) {
            return this.f611d;
        }
        if (view == null) {
            return null;
        }
        return ((e) view.getLayoutParams()).f2835m0;
    }

    public void o(h layout, int optimizationLevel, int widthMeasureSpec, int heightMeasureSpec) {
        int paddingX;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingY = Math.max(0, getPaddingTop());
        int paddingBottom = Math.max(0, getPaddingBottom());
        int paddingHeight = paddingY + paddingBottom;
        int paddingWidth = getPaddingWidth();
        this.f625r.a(widthMeasureSpec, heightMeasureSpec, paddingY, paddingBottom, paddingWidth, paddingHeight);
        int paddingStart = Math.max(0, getPaddingStart());
        int paddingEnd = Math.max(0, getPaddingEnd());
        if (paddingStart <= 0 && paddingEnd <= 0) {
            paddingX = Math.max(0, getPaddingLeft());
        } else if (k()) {
            paddingX = paddingEnd;
        } else {
            paddingX = paddingStart;
        }
        int widthSize2 = widthSize - paddingWidth;
        int heightSize2 = heightSize - paddingHeight;
        r(layout, widthMode, widthSize2, heightMode, heightSize2);
        layout.u1(optimizationLevel, widthMode, widthSize2, heightMode, heightSize2, this.f622o, this.f623p, paddingX, paddingY);
    }

    public void n(int widthMeasureSpec, int heightMeasureSpec, int measuredWidth, int measuredHeight, boolean isWidthMeasuredTooSmall, boolean isHeightMeasuredTooSmall) {
        f fVar = this.f625r;
        int heightPadding = fVar.f2853e;
        int widthPadding = fVar.f2852d;
        int androidLayoutWidth = measuredWidth + widthPadding;
        int androidLayoutHeight = measuredHeight + heightPadding;
        int resolvedWidthSize = ViewGroup.resolveSizeAndState(androidLayoutWidth, widthMeasureSpec, 0);
        int resolvedHeightSize = ViewGroup.resolveSizeAndState(androidLayoutHeight, heightMeasureSpec, 0 << 16);
        int resolvedWidthSize2 = Math.min(this.f614g, resolvedWidthSize & 16777215);
        int resolvedHeightSize2 = Math.min(this.f615h, resolvedHeightSize & 16777215);
        if (isWidthMeasuredTooSmall) {
            resolvedWidthSize2 |= 16777216;
        }
        if (isHeightMeasuredTooSmall) {
            resolvedHeightSize2 |= 16777216;
        }
        setMeasuredDimension(resolvedWidthSize2, resolvedHeightSize2);
        this.f622o = resolvedWidthSize2;
        this.f623p = resolvedHeightSize2;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.f616i) {
            int count = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= count) {
                    break;
                }
                View child = getChildAt(i2);
                if (child.isLayoutRequested()) {
                    this.f616i = true;
                    break;
                }
                i2++;
            }
        }
        if (!this.f616i) {
            int i3 = this.f626s;
            if (i3 == widthMeasureSpec && this.f627t == heightMeasureSpec) {
                n(widthMeasureSpec, heightMeasureSpec, this.f611d.O(), this.f611d.s(), this.f611d.t1(), this.f611d.r1());
                return;
            } else if (i3 == widthMeasureSpec && View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f627t) == Integer.MIN_VALUE) {
                int newSize = View.MeasureSpec.getSize(heightMeasureSpec);
                if (newSize >= this.f611d.s()) {
                    this.f626s = widthMeasureSpec;
                    this.f627t = heightMeasureSpec;
                    n(widthMeasureSpec, heightMeasureSpec, this.f611d.O(), this.f611d.s(), this.f611d.t1(), this.f611d.r1());
                    return;
                }
            }
        }
        this.f626s = widthMeasureSpec;
        this.f627t = heightMeasureSpec;
        this.f611d.A1(k());
        if (this.f616i) {
            this.f616i = false;
            if (s()) {
                this.f611d.C1();
            }
        }
        o(this.f611d, this.f617j, widthMeasureSpec, heightMeasureSpec);
        n(widthMeasureSpec, heightMeasureSpec, this.f611d.O(), this.f611d.s(), this.f611d.t1(), this.f611d.r1());
    }

    public boolean k() {
        boolean isRtlSupported = (getContext().getApplicationInfo().flags & 4194304) != 0;
        return isRtlSupported && 1 == getLayoutDirection();
    }

    private int getPaddingWidth() {
        int widthPadding = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int rtlPadding = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (rtlPadding > 0) {
            return rtlPadding;
        }
        return widthPadding;
    }

    public void r(h layout, int widthMode, int widthSize, int heightMode, int heightSize) {
        f fVar = this.f625r;
        int heightPadding = fVar.f2853e;
        int widthPadding = fVar.f2852d;
        o.f widthBehaviour = o.f.FIXED;
        o.f heightBehaviour = o.f.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        int childCount = getChildCount();
        switch (widthMode) {
            case Integer.MIN_VALUE:
                widthBehaviour = o.f.WRAP_CONTENT;
                desiredWidth = widthSize;
                if (childCount == 0) {
                    desiredWidth = Math.max(0, this.f612e);
                    break;
                }
                break;
            case 0:
                widthBehaviour = o.f.WRAP_CONTENT;
                if (childCount == 0) {
                    desiredWidth = Math.max(0, this.f612e);
                    break;
                }
                break;
            case 1073741824:
                desiredWidth = Math.min(this.f614g - widthPadding, widthSize);
                break;
        }
        switch (heightMode) {
            case Integer.MIN_VALUE:
                heightBehaviour = o.f.WRAP_CONTENT;
                desiredHeight = heightSize;
                if (childCount == 0) {
                    desiredHeight = Math.max(0, this.f613f);
                    break;
                }
                break;
            case 0:
                heightBehaviour = o.f.WRAP_CONTENT;
                if (childCount == 0) {
                    desiredHeight = Math.max(0, this.f613f);
                    break;
                }
                break;
            case 1073741824:
                desiredHeight = Math.min(this.f615h - heightPadding, heightSize);
                break;
        }
        if (!(desiredWidth == layout.O() && desiredHeight == layout.s())) {
            layout.q1();
        }
        layout.Q0(0);
        layout.R0(0);
        layout.C0(this.f614g - widthPadding);
        layout.B0(this.f615h - heightPadding);
        layout.F0(0);
        layout.E0(0);
        layout.w0(widthBehaviour);
        layout.P0(desiredWidth);
        layout.L0(heightBehaviour);
        layout.s0(desiredHeight);
        layout.F0(this.f612e - widthPadding);
        layout.E0(this.f613f - heightPadding);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int widgetsCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i2 = 0; i2 < widgetsCount; i2++) {
            View child = getChildAt(i2);
            e params = (e) child.getLayoutParams();
            g widget = params.f2835m0;
            if ((child.getVisibility() != 8 || params.Y || params.Z || params.f2813b0 || isInEditMode) && !params.f2811a0) {
                int l2 = widget.P();
                int t2 = widget.Q();
                int r2 = widget.O() + l2;
                int b2 = widget.s() + t2;
                child.layout(l2, t2, r2, b2);
            }
        }
        int helperCount = this.f610c.size();
        if (helperCount > 0) {
            for (int i3 = 0; i3 < helperCount; i3++) {
                c helper = (c) this.f610c.get(i3);
                helper.h();
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.f617j = level;
        this.f611d.z1(level);
    }

    public int getOptimizationLevel() {
        return this.f611d.n1();
    }

    /* renamed from: e */
    public e generateLayoutParams(AttributeSet attrs) {
        return new e(getContext(), attrs);
    }

    /* renamed from: d */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p2) {
        return new e(p2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof e;
    }

    public void setConstraintSet(o set) {
        this.f618k = set;
    }

    public View h(int id) {
        return (View) this.f609b.get(id);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float ch;
        float cw;
        int count;
        int helperCount;
        ConstraintLayout constraintLayout = this;
        ArrayList arrayList = constraintLayout.f610c;
        if (arrayList != null && (helperCount = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                c helper = (c) constraintLayout.f610c.get(i2);
                helper.j();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int count2 = getChildCount();
            float cw2 = getWidth();
            float ch2 = getHeight();
            int i3 = 0;
            while (i3 < count2) {
                View child = constraintLayout.getChildAt(i3);
                if (child.getVisibility() == 8) {
                    count = count2;
                    cw = cw2;
                    ch = ch2;
                } else {
                    Object tag = child.getTag();
                    if (tag == null || !(tag instanceof String)) {
                        count = count2;
                        cw = cw2;
                        ch = ch2;
                    } else {
                        String coordinates = (String) tag;
                        String[] split = coordinates.split(",");
                        if (split.length == 4) {
                            int x2 = (int) ((Integer.parseInt(split[0]) / 1080.0f) * cw2);
                            int y2 = (int) ((Integer.parseInt(split[1]) / 1920.0f) * ch2);
                            int w2 = (int) ((Integer.parseInt(split[2]) / 1080.0f) * cw2);
                            int h2 = (int) ((Integer.parseInt(split[3]) / 1920.0f) * ch2);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                            float ch3 = y2;
                            canvas.drawLine(x2, y2, x2 + w2, ch3, paint);
                            canvas.drawLine(x2 + w2, y2, x2 + w2, y2 + h2, paint);
                            canvas.drawLine(x2 + w2, y2 + h2, x2, y2 + h2, paint);
                            canvas.drawLine(x2, y2 + h2, x2, y2, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine(x2, y2, x2 + w2, y2 + h2, paint);
                            canvas.drawLine(x2, y2 + h2, x2 + w2, y2, paint);
                        } else {
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                        }
                    }
                }
                i3++;
                constraintLayout = this;
                count2 = count;
                cw2 = cw;
                ch2 = ch;
            }
        }
    }

    public void setOnConstraintsChanged(p constraintsChangedListener) {
        i iVar = this.f619l;
        if (iVar != null) {
            iVar.c(constraintsChangedListener);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final void l() {
        this.f616i = true;
        this.f622o = -1;
        this.f623p = -1;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
