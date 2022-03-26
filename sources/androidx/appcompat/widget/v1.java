package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.helloworld.R;
import f0.h1;
import i0.i;
import java.lang.reflect.Field;
import y.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v1 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f551b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public int f552c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f553d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f554e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f555f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f556g;

    /* renamed from: h  reason: collision with root package name */
    public Field f557h;

    /* renamed from: i  reason: collision with root package name */
    public t1 f558i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f559j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f560k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f561l;

    /* renamed from: m  reason: collision with root package name */
    public h1 f562m;

    /* renamed from: n  reason: collision with root package name */
    public i f563n;

    /* renamed from: o  reason: collision with root package name */
    public u1 f564o;

    public v1(Context context, boolean hijackFocus) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f560k = hijackFocus;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f557h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f560k && this.f559j) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f560k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f560k || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f560k || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable sel) {
        t1 t1Var = sel != null ? new t1(sel) : null;
        this.f558i = t1Var;
        super.setSelector(t1Var);
        Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.f552c = padding.left;
        this.f553d = padding.top;
        this.f554e = padding.right;
        this.f555f = padding.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f564o == null) {
            super.drawableStateChanged();
            j(true);
            l();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case 0:
                this.f556g = pointToPosition((int) ev.getX(), (int) ev.getY());
                break;
        }
        u1 u1Var = this.f564o;
        if (u1Var != null) {
            u1Var.a();
        }
        return super.onTouchEvent(ev);
    }

    public int d(int widthMeasureSpec, int maxHeight, int disallowPartialChildPosition) {
        ViewGroup.LayoutParams childLp;
        int heightMeasureSpec;
        int startPosition = 0;
        int endPosition = 0;
        int paddingTop = getListPaddingTop();
        int paddingBottom = getListPaddingBottom();
        int reportedDividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            int startPosition2 = paddingTop + paddingBottom;
            return startPosition2;
        }
        int returnedHeight = paddingTop + paddingBottom;
        int dividerHeight = (reportedDividerHeight <= 0 || divider == null) ? 0 : reportedDividerHeight;
        int prevHeightWithoutPartialChild = 0;
        View child = null;
        int viewType = 0;
        int count = adapter.getCount();
        int i2 = 0;
        while (i2 < count) {
            int newType = adapter.getItemViewType(i2);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(i2, child, this);
            ViewGroup.LayoutParams childLp2 = child.getLayoutParams();
            if (childLp2 == null) {
                childLp = generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            } else {
                childLp = childLp2;
            }
            int endPosition2 = childLp.height;
            if (endPosition2 > 0) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(endPosition2, 1073741824);
            } else {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (i2 > 0) {
                returnedHeight += dividerHeight;
            }
            returnedHeight += child.getMeasuredHeight();
            if (returnedHeight < maxHeight) {
                if (disallowPartialChildPosition >= 0 && i2 >= disallowPartialChildPosition) {
                    prevHeightWithoutPartialChild = returnedHeight;
                }
                i2++;
                startPosition = startPosition;
                endPosition = endPosition;
            } else if (disallowPartialChildPosition < 0 || i2 <= disallowPartialChildPosition || prevHeightWithoutPartialChild <= 0 || returnedHeight == maxHeight) {
                return maxHeight;
            } else {
                return prevHeightWithoutPartialChild;
            }
        }
        return returnedHeight;
    }

    public final void j(boolean enabled) {
        t1 t1Var = this.f558i;
        if (t1Var != null) {
            t1Var.c(enabled);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        int action = ev.getActionMasked();
        if (action == 10 && this.f564o == null) {
            u1 u1Var = new u1(this);
            this.f564o = u1Var;
            u1Var.b();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (!(position == -1 || position == getSelectedItemPosition())) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                l();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f564o = null;
        super.onDetachedFromWindow();
    }

    public boolean e(MotionEvent event, int activePointerId) {
        boolean handledEvent = true;
        boolean clearPressedItem = false;
        int actionMasked = event.getActionMasked();
        switch (actionMasked) {
            case 1:
                handledEvent = false;
            case 2:
                int activeIndex = event.findPointerIndex(activePointerId);
                if (activeIndex >= 0) {
                    int x2 = (int) event.getX(activeIndex);
                    int y2 = (int) event.getY(activeIndex);
                    int position = pointToPosition(x2, y2);
                    if (position != -1) {
                        View child = getChildAt(position - getFirstVisiblePosition());
                        i(child, position, x2, y2);
                        handledEvent = true;
                        if (actionMasked == 1) {
                            b(child, position);
                            break;
                        }
                    } else {
                        clearPressedItem = true;
                        break;
                    }
                } else {
                    handledEvent = false;
                    break;
                }
                break;
            case 3:
                handledEvent = false;
                break;
        }
        if (!handledEvent || clearPressedItem) {
            a();
        }
        if (handledEvent) {
            if (this.f563n == null) {
                this.f563n = new i(this);
            }
            this.f563n.m(true);
            this.f563n.onTouch(this, event);
        } else {
            i iVar = this.f563n;
            if (iVar != null) {
                iVar.m(false);
            }
        }
        return handledEvent;
    }

    public final void b(View child, int position) {
        long id = getItemIdAtPosition(position);
        performItemClick(child, position, id);
    }

    public void setListSelectionHidden(boolean hideListSelection) {
        this.f559j = hideListSelection;
    }

    public final void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (!this.f551b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f551b);
            selector.draw(canvas);
        }
    }

    public final void h(int position, View sel, float x2, float y2) {
        g(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            a.e(selector, x2, y2);
        }
    }

    public final void g(int position, View sel) {
        Drawable selector = getSelector();
        boolean z2 = true;
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        f(position, sel);
        if (manageState) {
            Rect bounds = this.f551b;
            float x2 = bounds.exactCenterX();
            float y2 = bounds.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            a.e(selector, x2, y2);
        }
    }

    public final void f(int position, View sel) {
        Rect selectorRect = this.f551b;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        selectorRect.left -= this.f552c;
        selectorRect.top -= this.f553d;
        selectorRect.right += this.f554e;
        selectorRect.bottom += this.f555f;
        try {
            boolean isChildViewEnabled = this.f557h.getBoolean(this);
            if (sel.isEnabled() != isChildViewEnabled) {
                this.f557h.set(this, Boolean.valueOf(!isChildViewEnabled));
                if (position != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        this.f561l = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f556g - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        h1 h1Var = this.f562m;
        if (h1Var != null) {
            h1Var.b();
            this.f562m = null;
        }
    }

    public final void i(View child, int position, float x2, float y2) {
        View motionView;
        this.f561l = true;
        drawableHotspotChanged(x2, y2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f556g;
        if (!(i2 == -1 || (motionView = getChildAt(i2 - getFirstVisiblePosition())) == null || motionView == child || !motionView.isPressed())) {
            motionView.setPressed(false);
        }
        this.f556g = position;
        float childX = x2 - child.getLeft();
        float childY = y2 - child.getTop();
        child.drawableHotspotChanged(childX, childY);
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        h(position, child, x2, y2);
        j(false);
        refreshDrawableState();
    }

    public final boolean k() {
        return this.f561l;
    }
}
