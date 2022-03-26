package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import h.d0;
import h.g0;
import h.o;
import h.p;
import h.q;
import h.t;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ActionMenuView extends b2 implements p, g0 {
    public int A;
    public v B;

    /* renamed from: q  reason: collision with root package name */
    public q f141q;

    /* renamed from: r  reason: collision with root package name */
    public Context f142r;

    /* renamed from: s  reason: collision with root package name */
    public int f143s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f144t;

    /* renamed from: u  reason: collision with root package name */
    public q f145u;

    /* renamed from: v  reason: collision with root package name */
    public d0 f146v;

    /* renamed from: w  reason: collision with root package name */
    public o f147w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f148x;

    /* renamed from: y  reason: collision with root package name */
    public int f149y;

    /* renamed from: z  reason: collision with root package name */
    public int f150z;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBaselineAligned(false);
        float density = context.getResources().getDisplayMetrics().density;
        this.f150z = (int) (56.0f * density);
        this.A = (int) (4.0f * density);
        this.f142r = context;
        this.f143s = 0;
    }

    public void setPopupTheme(int resId) {
        if (this.f143s != resId) {
            this.f143s = resId;
            if (resId == 0) {
                this.f142r = getContext();
            } else {
                this.f142r = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f143s;
    }

    public void setPresenter(q presenter) {
        this.f145u = presenter;
        presenter.H(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        q qVar = this.f145u;
        if (qVar != null) {
            qVar.k(false);
            if (this.f145u.E()) {
                this.f145u.B();
                this.f145u.K();
            }
        }
    }

    public void setOnMenuItemClickListener(v listener) {
        this.B = listener;
    }

    @Override // androidx.appcompat.widget.b2, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        q qVar;
        boolean wasFormatted = this.f148x;
        boolean z2 = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        this.f148x = z2;
        if (wasFormatted != z2) {
            this.f149y = 0;
        }
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!(!this.f148x || (qVar = this.f141q) == null || widthSize == this.f149y)) {
            this.f149y = widthSize;
            qVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.f148x || childCount <= 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = getChildAt(i2);
                t lp = (t) child.getLayoutParams();
                ((LinearLayout.LayoutParams) lp).rightMargin = 0;
                ((LinearLayout.LayoutParams) lp).leftMargin = 0;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        M(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b9  */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(int r41, int r42) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.M(int, int):void");
    }

    public static int L(View child, int cellSize, int cellsRemaining, int parentHeightMeasureSpec, int parentHeightPadding) {
        t lp = (t) child.getLayoutParams();
        int childHeightSize = View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding;
        int childHeightMode = View.MeasureSpec.getMode(parentHeightMeasureSpec);
        int childHeightSpec = View.MeasureSpec.makeMeasureSpec(childHeightSize, childHeightMode);
        ActionMenuItemView itemView = child instanceof ActionMenuItemView ? (ActionMenuItemView) child : null;
        boolean expandable = false;
        boolean hasText = itemView != null && itemView.f();
        int cellsUsed = 0;
        if (cellsRemaining > 0 && (!hasText || cellsRemaining >= 2)) {
            int childWidthSpec = View.MeasureSpec.makeMeasureSpec(cellSize * cellsRemaining, Integer.MIN_VALUE);
            child.measure(childWidthSpec, childHeightSpec);
            int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                cellsUsed++;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        if (!lp.f532a && hasText) {
            expandable = true;
        }
        lp.f535d = expandable;
        lp.f533b = cellsUsed;
        int targetWidth = cellsUsed * cellSize;
        child.measure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), childHeightSpec);
        return cellsUsed;
    }

    @Override // androidx.appcompat.widget.b2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i2;
        int nonOverflowCount;
        int overflowWidth;
        int dividerWidth;
        int r2;
        int l2;
        ActionMenuView actionMenuView = this;
        if (!actionMenuView.f148x) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int childCount = getChildCount();
        int midVertical = (bottom - top) / 2;
        int dividerWidth2 = getDividerWidth();
        int overflowWidth2 = 0;
        int nonOverflowCount2 = 0;
        int widthRemaining = ((right - left) - getPaddingRight()) - getPaddingLeft();
        int i3 = 0;
        boolean isLayoutRtl = l4.b(this);
        int i4 = 0;
        while (true) {
            i2 = 8;
            if (i4 >= childCount) {
                break;
            }
            View v2 = actionMenuView.getChildAt(i4);
            if (v2.getVisibility() == 8) {
                dividerWidth = dividerWidth2;
            } else {
                t p2 = (t) v2.getLayoutParams();
                if (p2.f532a) {
                    overflowWidth2 = v2.getMeasuredWidth();
                    if (actionMenuView.G(i4)) {
                        overflowWidth2 += dividerWidth2;
                    }
                    int height = v2.getMeasuredHeight();
                    if (isLayoutRtl) {
                        l2 = getPaddingLeft() + ((LinearLayout.LayoutParams) p2).leftMargin;
                        r2 = l2 + overflowWidth2;
                    } else {
                        r2 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) p2).rightMargin;
                        l2 = r2 - overflowWidth2;
                    }
                    int t2 = midVertical - (height / 2);
                    dividerWidth = dividerWidth2;
                    int dividerWidth3 = t2 + height;
                    v2.layout(l2, t2, r2, dividerWidth3);
                    widthRemaining -= overflowWidth2;
                    i3 = 1;
                } else {
                    dividerWidth = dividerWidth2;
                    int dividerWidth4 = v2.getMeasuredWidth();
                    int size = dividerWidth4 + ((LinearLayout.LayoutParams) p2).leftMargin + ((LinearLayout.LayoutParams) p2).rightMargin;
                    widthRemaining -= size;
                    actionMenuView.G(i4);
                    nonOverflowCount2++;
                }
            }
            i4++;
            dividerWidth2 = dividerWidth;
        }
        if (childCount == 1 && i3 == 0) {
            View v3 = actionMenuView.getChildAt(0);
            int width = v3.getMeasuredWidth();
            int height2 = v3.getMeasuredHeight();
            int midHorizontal = (right - left) / 2;
            int l3 = midHorizontal - (width / 2);
            int t3 = midVertical - (height2 / 2);
            v3.layout(l3, t3, l3 + width, t3 + height2);
            return;
        }
        int spacerCount = nonOverflowCount2 - (i3 ^ 1);
        int spacerSize = Math.max(0, spacerCount > 0 ? widthRemaining / spacerCount : 0);
        if (isLayoutRtl) {
            int startRight = getWidth() - getPaddingRight();
            int i5 = 0;
            while (i5 < childCount) {
                View v4 = actionMenuView.getChildAt(i5);
                t lp = (t) v4.getLayoutParams();
                if (v4.getVisibility() == i2) {
                    overflowWidth = overflowWidth2;
                    nonOverflowCount = nonOverflowCount2;
                } else if (lp.f532a) {
                    overflowWidth = overflowWidth2;
                    nonOverflowCount = nonOverflowCount2;
                } else {
                    int startRight2 = startRight - ((LinearLayout.LayoutParams) lp).rightMargin;
                    int width2 = v4.getMeasuredWidth();
                    int height3 = v4.getMeasuredHeight();
                    int t4 = midVertical - (height3 / 2);
                    overflowWidth = overflowWidth2;
                    int overflowWidth3 = startRight2 - width2;
                    nonOverflowCount = nonOverflowCount2;
                    int nonOverflowCount3 = t4 + height3;
                    v4.layout(overflowWidth3, t4, startRight2, nonOverflowCount3);
                    startRight = startRight2 - ((((LinearLayout.LayoutParams) lp).leftMargin + width2) + spacerSize);
                }
                i5++;
                overflowWidth2 = overflowWidth;
                nonOverflowCount2 = nonOverflowCount;
                i2 = 8;
            }
            return;
        }
        int startLeft = getPaddingLeft();
        int i6 = 0;
        while (i6 < childCount) {
            View v5 = actionMenuView.getChildAt(i6);
            t lp2 = (t) v5.getLayoutParams();
            if (v5.getVisibility() != 8 && !lp2.f532a) {
                int startLeft2 = startLeft + ((LinearLayout.LayoutParams) lp2).leftMargin;
                int width3 = v5.getMeasuredWidth();
                int height4 = v5.getMeasuredHeight();
                int t5 = midVertical - (height4 / 2);
                v5.layout(startLeft2, t5, startLeft2 + width3, t5 + height4);
                startLeft = startLeft2 + ((LinearLayout.LayoutParams) lp2).rightMargin + width3 + spacerSize;
            }
            i6++;
            actionMenuView = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    public void setOverflowIcon(Drawable icon) {
        getMenu();
        this.f145u.I(icon);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f145u.A();
    }

    public boolean K() {
        return this.f144t;
    }

    public void setOverflowReserved(boolean reserveOverflow) {
        this.f144t = reserveOverflow;
    }

    /* renamed from: C */
    public t m() {
        t params = new t(-2, -2);
        ((LinearLayout.LayoutParams) params).gravity = 16;
        return params;
    }

    /* renamed from: D */
    public t n(AttributeSet attrs) {
        return new t(getContext(), attrs);
    }

    /* renamed from: E */
    public t o(ViewGroup.LayoutParams p2) {
        t result;
        if (p2 == null) {
            return m();
        }
        if (p2 instanceof t) {
            result = new t((t) p2);
        } else {
            result = new t(p2);
        }
        if (((LinearLayout.LayoutParams) result).gravity <= 0) {
            ((LinearLayout.LayoutParams) result).gravity = 16;
        }
        return result;
    }

    @Override // androidx.appcompat.widget.b2, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return p2 instanceof t;
    }

    public t F() {
        t result = m();
        result.f532a = true;
        return result;
    }

    @Override // h.p
    public boolean f(t item) {
        return this.f141q.L(item, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // h.g0
    public void b(q menu) {
        this.f141q = menu;
    }

    public Menu getMenu() {
        if (this.f141q == null) {
            Context context = getContext();
            q qVar = new q(context);
            this.f141q = qVar;
            qVar.R(new u(this));
            q qVar2 = new q(context);
            this.f145u = qVar2;
            qVar2.J(true);
            q qVar3 = this.f145u;
            d0 d0Var = this.f146v;
            if (d0Var == null) {
                d0Var = new s();
            }
            qVar3.d(d0Var);
            this.f141q.c(this.f145u, this.f142r);
            this.f145u.H(this);
        }
        return this.f141q;
    }

    public void O(d0 pcb, o mcb) {
        this.f146v = pcb;
        this.f147w = mcb;
    }

    public q N() {
        return this.f141q;
    }

    public boolean P() {
        q qVar = this.f145u;
        return qVar != null && qVar.K();
    }

    public boolean H() {
        q qVar = this.f145u;
        return qVar != null && qVar.B();
    }

    public boolean J() {
        q qVar = this.f145u;
        return qVar != null && qVar.E();
    }

    public boolean I() {
        q qVar = this.f145u;
        return qVar != null && qVar.D();
    }

    public void B() {
        q qVar = this.f145u;
        if (qVar != null) {
            qVar.y();
        }
    }

    public boolean G(int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        View childBefore = getChildAt(childIndex - 1);
        View child = getChildAt(childIndex);
        boolean result = false;
        if (childIndex < getChildCount() && (childBefore instanceof r)) {
            result = false | ((r) childBefore).b();
        }
        if (childIndex <= 0 || !(child instanceof r)) {
            return result;
        }
        return result | ((r) child).a();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean exclusive) {
        this.f145u.G(exclusive);
    }
}
