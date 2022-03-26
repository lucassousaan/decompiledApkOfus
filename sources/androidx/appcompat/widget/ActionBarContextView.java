package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import g.c;
import h.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ActionBarContextView extends b {

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f104j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f105k;

    /* renamed from: l  reason: collision with root package name */
    public View f106l;

    /* renamed from: m  reason: collision with root package name */
    public View f107m;

    /* renamed from: n  reason: collision with root package name */
    public View f108n;

    /* renamed from: o  reason: collision with root package name */
    public LinearLayout f109o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f110p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f111q;

    /* renamed from: r  reason: collision with root package name */
    public int f112r;

    /* renamed from: s  reason: collision with root package name */
    public int f113s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f114t;

    /* renamed from: u  reason: collision with root package name */
    public int f115u;

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        s3 a2 = s3.v(context, attrs, a.f1170d, defStyle, 0);
        int[] iArr = a.f1167a;
        c1.o0(this, a2.g(0));
        this.f112r = a2.n(5, 0);
        this.f113s = a2.n(4, 0);
        this.f239f = a2.m(3, 0);
        this.f115u = a2.n(2, R.layout.abc_action_mode_close_item_material);
        a2.w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q qVar = this.f238e;
        if (qVar != null) {
            qVar.B();
            this.f238e.C();
        }
    }

    @Override // androidx.appcompat.widget.b
    public void setContentHeight(int height) {
        this.f239f = height;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f108n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f108n = view;
        if (!(view == null || (linearLayout = this.f109o) == null)) {
            removeView(linearLayout);
            this.f109o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence title) {
        this.f104j = title;
        i();
    }

    public void setSubtitle(CharSequence subtitle) {
        this.f105k = subtitle;
        i();
    }

    public CharSequence getTitle() {
        return this.f104j;
    }

    public CharSequence getSubtitle() {
        return this.f105k;
    }

    public final void i() {
        if (this.f109o == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            inflater.inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f109o = linearLayout;
            this.f110p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f111q = (TextView) this.f109o.findViewById(R.id.action_bar_subtitle);
            if (this.f112r != 0) {
                this.f110p.setTextAppearance(getContext(), this.f112r);
            }
            if (this.f113s != 0) {
                this.f111q.setTextAppearance(getContext(), this.f113s);
            }
        }
        this.f110p.setText(this.f104j);
        this.f111q.setText(this.f105k);
        boolean hasTitle = !TextUtils.isEmpty(this.f104j);
        boolean hasSubtitle = !TextUtils.isEmpty(this.f105k);
        int i2 = 0;
        this.f111q.setVisibility(hasSubtitle ? 0 : 8);
        LinearLayout linearLayout2 = this.f109o;
        if (!hasTitle && !hasSubtitle) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f109o.getParent() == null) {
            addView(this.f109o);
        }
    }

    public void h(c mode) {
        View view = this.f106l;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View inflate = inflater.inflate(this.f115u, (ViewGroup) this, false);
            this.f106l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f106l);
        }
        View findViewById = this.f106l.findViewById(R.id.action_mode_close_button);
        this.f107m = findViewById;
        findViewById.setOnClickListener(new d(this, mode));
        q menu = (q) mode.e();
        q qVar = this.f238e;
        if (qVar != null) {
            qVar.y();
        }
        q qVar2 = new q(getContext());
        this.f238e = qVar2;
        qVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.c(this.f238e, this.f236c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f238e.o(this);
        this.f237d = actionMenuView;
        c1.o0(actionMenuView, null);
        addView(this.f237d, layoutParams);
    }

    public void g() {
        if (this.f106l == null) {
            k();
        }
    }

    public void k() {
        removeAllViews();
        this.f108n = null;
        this.f237d = null;
        this.f238e = null;
        View view = this.f107m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        q qVar = this.f238e;
        if (qVar != null) {
            return qVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int customWidthMode;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int customHeightMode = 1073741824;
        if (widthMode == 1073741824) {
            int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
            if (heightMode != 0) {
                int contentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
                int maxHeight = this.f239f;
                if (maxHeight <= 0) {
                    maxHeight = View.MeasureSpec.getSize(heightMeasureSpec);
                }
                int verticalPadding = getPaddingTop() + getPaddingBottom();
                int availableWidth = (contentWidth - getPaddingLeft()) - getPaddingRight();
                int height = maxHeight - verticalPadding;
                int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
                View view = this.f106l;
                int i2 = 0;
                if (view != null) {
                    int availableWidth2 = c(view, availableWidth, childSpecHeight, 0);
                    ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f106l.getLayoutParams();
                    availableWidth = availableWidth2 - (lp.leftMargin + lp.rightMargin);
                }
                ActionMenuView actionMenuView = this.f237d;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    availableWidth = c(this.f237d, availableWidth, childSpecHeight, 0);
                }
                LinearLayout linearLayout = this.f109o;
                if (linearLayout != null && this.f108n == null) {
                    if (this.f114t) {
                        int titleWidthSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        this.f109o.measure(titleWidthSpec, childSpecHeight);
                        int titleWidth = this.f109o.getMeasuredWidth();
                        boolean titleFits = titleWidth <= availableWidth;
                        if (titleFits) {
                            availableWidth -= titleWidth;
                        }
                        LinearLayout linearLayout2 = this.f109o;
                        if (!titleFits) {
                            i2 = 8;
                        }
                        linearLayout2.setVisibility(i2);
                    } else {
                        availableWidth = c(linearLayout, availableWidth, childSpecHeight, 0);
                    }
                }
                View view2 = this.f108n;
                if (view2 != null) {
                    ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
                    int i3 = lp2.width;
                    if (i3 != -2) {
                        customWidthMode = 1073741824;
                    } else {
                        customWidthMode = Integer.MIN_VALUE;
                    }
                    int customWidth = i3 >= 0 ? Math.min(i3, availableWidth) : availableWidth;
                    int i4 = lp2.height;
                    if (i4 == -2) {
                        customHeightMode = Integer.MIN_VALUE;
                    }
                    int customHeight = i4 >= 0 ? Math.min(i4, height) : height;
                    View view3 = this.f108n;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode);
                    int widthMode2 = View.MeasureSpec.makeMeasureSpec(customHeight, customHeightMode);
                    view3.measure(makeMeasureSpec, widthMode2);
                }
                int widthMode3 = this.f239f;
                if (widthMode3 <= 0) {
                    int measuredHeight = 0;
                    int count = getChildCount();
                    for (int i5 = 0; i5 < count; i5++) {
                        View v2 = getChildAt(i5);
                        int paddedViewHeight = v2.getMeasuredHeight() + verticalPadding;
                        if (paddedViewHeight > measuredHeight) {
                            measuredHeight = paddedViewHeight;
                        }
                    }
                    setMeasuredDimension(contentWidth, measuredHeight);
                    return;
                }
                setMeasuredDimension(contentWidth, maxHeight);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        int x2;
        boolean isLayoutRtl = l4.b(this);
        int x3 = isLayoutRtl ? (r2 - l2) - getPaddingRight() : getPaddingLeft();
        int y2 = getPaddingTop();
        int contentHeight = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f106l;
        if (view == null || view.getVisibility() == 8) {
            x2 = x3;
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f106l.getLayoutParams();
            int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            int x4 = b.d(x3, startMargin, isLayoutRtl);
            x2 = b.d(x4 + e(this.f106l, x4, y2, contentHeight, isLayoutRtl), endMargin, isLayoutRtl);
        }
        LinearLayout linearLayout = this.f109o;
        if (!(linearLayout == null || this.f108n != null || linearLayout.getVisibility() == 8)) {
            x2 += e(this.f109o, x2, y2, contentHeight, isLayoutRtl);
        }
        View view2 = this.f108n;
        if (view2 != null) {
            int e2 = x2 + e(view2, x2, y2, contentHeight, isLayoutRtl);
        }
        int x5 = isLayoutRtl ? getPaddingLeft() : (r2 - l2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f237d;
        if (actionMenuView != null) {
            int e3 = x5 + e(actionMenuView, x5, y2, contentHeight, !isLayoutRtl);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == 32) {
            event.setSource(this);
            event.setClassName(getClass().getName());
            event.setPackageName(getContext().getPackageName());
            event.setContentDescription(this.f104j);
            return;
        }
        super.onInitializeAccessibilityEvent(event);
    }

    public void setTitleOptional(boolean titleOptional) {
        if (titleOptional != this.f114t) {
            requestLayout();
        }
        this.f114t = titleOptional;
    }

    public boolean j() {
        return this.f114t;
    }
}
