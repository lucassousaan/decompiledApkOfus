package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import h.i0;
import i0.q;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j2 implements i0 {
    public static Method D;
    public static Method E;
    public Rect A;
    public boolean B;
    public PopupWindow C;

    /* renamed from: b  reason: collision with root package name */
    public Context f384b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f385c;

    /* renamed from: d  reason: collision with root package name */
    public v1 f386d;

    /* renamed from: e  reason: collision with root package name */
    public int f387e;

    /* renamed from: f  reason: collision with root package name */
    public int f388f;

    /* renamed from: g  reason: collision with root package name */
    public int f389g;

    /* renamed from: h  reason: collision with root package name */
    public int f390h;

    /* renamed from: i  reason: collision with root package name */
    public int f391i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f392j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f393k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f394l;

    /* renamed from: m  reason: collision with root package name */
    public int f395m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f396n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f397o;

    /* renamed from: p  reason: collision with root package name */
    public int f398p;

    /* renamed from: q  reason: collision with root package name */
    public int f399q;

    /* renamed from: r  reason: collision with root package name */
    public DataSetObserver f400r;

    /* renamed from: s  reason: collision with root package name */
    public View f401s;

    /* renamed from: t  reason: collision with root package name */
    public AdapterView.OnItemClickListener f402t;

    /* renamed from: u  reason: collision with root package name */
    public final i2 f403u;

    /* renamed from: v  reason: collision with root package name */
    public final h2 f404v;

    /* renamed from: w  reason: collision with root package name */
    public final g2 f405w;

    /* renamed from: x  reason: collision with root package name */
    public final e2 f406x;

    /* renamed from: y  reason: collision with root package name */
    public final Handler f407y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f408z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                D = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                E = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e3) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public j2(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public j2(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public j2(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f387e = -2;
        this.f388f = -2;
        this.f391i = 1002;
        this.f395m = 0;
        this.f396n = false;
        this.f397o = false;
        this.f398p = Integer.MAX_VALUE;
        this.f399q = 0;
        this.f403u = new i2(this);
        this.f404v = new h2(this);
        this.f405w = new g2(this);
        this.f406x = new e2(this);
        this.f408z = new Rect();
        this.f384b = context;
        this.f407y = new Handler(context.getMainLooper());
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f1180n, defStyleAttr, defStyleRes);
        int[] iArr = a.f1167a;
        this.f389g = a2.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = a2.getDimensionPixelOffset(1, 0);
        this.f390h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f392j = true;
        }
        a2.recycle();
        k0 k0Var = new k0(context, attrs, defStyleAttr, defStyleRes);
        this.C = k0Var;
        k0Var.setInputMethodMode(1);
    }

    public void o(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.f400r;
        if (dataSetObserver == null) {
            this.f400r = new f2(this);
        } else {
            ListAdapter listAdapter = this.f385c;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f385c = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.f400r);
        }
        v1 v1Var = this.f386d;
        if (v1Var != null) {
            v1Var.setAdapter(this.f385c);
        }
    }

    public void O(int position) {
        this.f399q = position;
    }

    public void J(boolean modal) {
        this.B = modal;
        this.C.setFocusable(modal);
    }

    public boolean B() {
        return this.B;
    }

    public Drawable n() {
        return this.C.getBackground();
    }

    public void l(Drawable d2) {
        this.C.setBackgroundDrawable(d2);
    }

    public void E(int animationStyle) {
        this.C.setAnimationStyle(animationStyle);
    }

    public View t() {
        return this.f401s;
    }

    public void D(View anchor) {
        this.f401s = anchor;
    }

    public int d() {
        return this.f389g;
    }

    public void c(int offset) {
        this.f389g = offset;
    }

    public int j() {
        if (!this.f392j) {
            return 0;
        }
        return this.f390h;
    }

    public void m(int offset) {
        this.f390h = offset;
        this.f392j = true;
    }

    public void H(Rect bounds) {
        this.A = bounds != null ? new Rect(bounds) : null;
    }

    public void G(int gravity) {
        this.f395m = gravity;
    }

    public int z() {
        return this.f388f;
    }

    public void Q(int width) {
        this.f388f = width;
    }

    public void F(int width) {
        Drawable popupBackground = this.C.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.f408z);
            Rect rect = this.f408z;
            this.f388f = rect.left + rect.right + width;
            return;
        }
        Q(width);
    }

    public void L(AdapterView.OnItemClickListener clickListener) {
        this.f402t = clickListener;
    }

    @Override // h.i0
    public void i() {
        int widthSpec;
        int heightSpec;
        int widthSpec2;
        int heightSpec2;
        int height = q();
        boolean noInputMethod = A();
        q.b(this.C, this.f391i);
        int i2 = 0;
        if (!this.C.isShowing()) {
            int widthSpec3 = this.f388f;
            if (widthSpec3 == -1) {
                widthSpec = -1;
            } else if (widthSpec3 == -2) {
                widthSpec = t().getWidth();
            } else {
                widthSpec = this.f388f;
            }
            int i3 = this.f387e;
            if (i3 == -1) {
                heightSpec = -1;
            } else if (i3 == -2) {
                heightSpec = height;
            } else {
                heightSpec = this.f387e;
            }
            this.C.setWidth(widthSpec);
            this.C.setHeight(heightSpec);
            N(true);
            this.C.setOutsideTouchable(true);
            this.C.setTouchInterceptor(this.f404v);
            if (this.f394l) {
                q.a(this.C, this.f393k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = E;
                if (method != null) {
                    try {
                        method.invoke(this.C, this.A);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.C.setEpicenterBounds(this.A);
            }
            q.c(this.C, t(), this.f389g, this.f390h, this.f395m);
            this.f386d.setSelection(-1);
            if (!this.B || this.f386d.isInTouchMode()) {
                r();
            }
            if (!this.B) {
                this.f407y.post(this.f406x);
            }
        } else if (c1.O(t())) {
            int widthSpec4 = this.f388f;
            if (widthSpec4 == -1) {
                widthSpec2 = -1;
            } else if (widthSpec4 == -2) {
                widthSpec2 = t().getWidth();
            } else {
                widthSpec2 = this.f388f;
            }
            int i4 = this.f387e;
            if (i4 == -1) {
                heightSpec2 = noInputMethod ? height : -1;
                if (noInputMethod) {
                    this.C.setWidth(this.f388f == -1 ? -1 : 0);
                    this.C.setHeight(0);
                } else {
                    PopupWindow popupWindow = this.C;
                    if (this.f388f == -1) {
                        i2 = -1;
                    }
                    popupWindow.setWidth(i2);
                    this.C.setHeight(-1);
                }
            } else {
                heightSpec2 = i4 == -2 ? height : this.f387e;
            }
            this.C.setOutsideTouchable(true);
            this.C.update(t(), this.f389g, this.f390h, widthSpec2 < 0 ? -1 : widthSpec2, heightSpec2 < 0 ? -1 : heightSpec2);
        }
    }

    @Override // h.i0
    public void dismiss() {
        this.C.dismiss();
        C();
        this.C.setContentView(null);
        this.f386d = null;
        this.f407y.removeCallbacks(this.f403u);
    }

    public void K(PopupWindow.OnDismissListener listener) {
        this.C.setOnDismissListener(listener);
    }

    public final void C() {
    }

    public void I(int mode) {
        this.C.setInputMethodMode(mode);
    }

    public void P(int position) {
        v1 list = this.f386d;
        if (a() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }

    public void r() {
        v1 list = this.f386d;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }

    @Override // h.i0
    public boolean a() {
        return this.C.isShowing();
    }

    public boolean A() {
        return this.C.getInputMethodMode() == 2;
    }

    public Object v() {
        if (!a()) {
            return null;
        }
        return this.f386d.getSelectedItem();
    }

    public int x() {
        if (!a()) {
            return -1;
        }
        return this.f386d.getSelectedItemPosition();
    }

    public long w() {
        if (!a()) {
            return Long.MIN_VALUE;
        }
        return this.f386d.getSelectedItemId();
    }

    public View y() {
        if (!a()) {
            return null;
        }
        return this.f386d.getSelectedView();
    }

    @Override // h.i0
    public ListView e() {
        return this.f386d;
    }

    public v1 s(Context context, boolean hijackFocus) {
        return new v1(context, hijackFocus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q() {
        int padding;
        int childWidthSpec;
        int widthSize;
        int widthMode;
        int otherHeights = 0;
        boolean ignoreBottomDecorations = false;
        if (this.f386d == null) {
            Context context = this.f384b;
            new c2(this);
            v1 s2 = s(context, !this.B);
            this.f386d = s2;
            s2.setAdapter(this.f385c);
            this.f386d.setOnItemClickListener(this.f402t);
            this.f386d.setFocusable(true);
            this.f386d.setFocusableInTouchMode(true);
            this.f386d.setOnItemSelectedListener(new d2(this));
            this.f386d.setOnScrollListener(this.f405w);
            ViewGroup dropDownView = this.f386d;
            View hintView = null;
            if (0 != 0) {
                LinearLayout hintContainer = new LinearLayout(context);
                hintContainer.setOrientation(1);
                LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f399q) {
                    case 0:
                        hintContainer.addView(null);
                        hintContainer.addView(dropDownView, hintParams);
                        break;
                    case 1:
                        hintContainer.addView(dropDownView, hintParams);
                        hintContainer.addView(null);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f399q);
                        break;
                }
                if (this.f388f >= 0) {
                    widthMode = Integer.MIN_VALUE;
                    widthSize = this.f388f;
                } else {
                    widthMode = 0;
                    widthSize = 0;
                }
                int widthSpec = View.MeasureSpec.makeMeasureSpec(widthSize, widthMode);
                hintView.measure(widthSpec, 0);
                LinearLayout.LayoutParams hintParams2 = (LinearLayout.LayoutParams) hintView.getLayoutParams();
                dropDownView = hintContainer;
                otherHeights = hintView.getMeasuredHeight() + hintParams2.topMargin + hintParams2.bottomMargin;
            }
            this.C.setContentView(dropDownView);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.C.getContentView();
            View view = null;
            if (0 != 0) {
                LinearLayout.LayoutParams hintParams3 = (LinearLayout.LayoutParams) view.getLayoutParams();
                otherHeights = view.getMeasuredHeight() + hintParams3.topMargin + hintParams3.bottomMargin;
            }
        }
        Drawable background = this.C.getBackground();
        if (background != null) {
            background.getPadding(this.f408z);
            Rect rect = this.f408z;
            int i2 = rect.top;
            padding = rect.bottom + i2;
            if (!this.f392j) {
                this.f390h = -i2;
            }
        } else {
            this.f408z.setEmpty();
            padding = 0;
        }
        if (this.C.getInputMethodMode() == 2) {
            ignoreBottomDecorations = true;
        }
        int maxHeight = u(t(), this.f390h, ignoreBottomDecorations);
        if (this.f387e == -1) {
            return maxHeight + padding;
        }
        int i3 = this.f388f;
        switch (i3) {
            case -2:
                int i4 = this.f384b.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f408z;
                childWidthSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect2.left + rect2.right), Integer.MIN_VALUE);
                break;
            case -1:
                int i5 = this.f384b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f408z;
                childWidthSpec = View.MeasureSpec.makeMeasureSpec(i5 - (rect3.left + rect3.right), 1073741824);
                break;
            default:
                childWidthSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                break;
        }
        int listContent = this.f386d.d(childWidthSpec, maxHeight - otherHeights, -1);
        if (listContent > 0) {
            int listPadding = this.f386d.getPaddingTop() + this.f386d.getPaddingBottom();
            otherHeights += padding + listPadding;
        }
        int listPadding2 = listContent + otherHeights;
        return listPadding2;
    }

    public void M(boolean overlapAnchor) {
        this.f394l = true;
        this.f393k = overlapAnchor;
    }

    public final void N(boolean clip) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = D;
            if (method != null) {
                try {
                    method.invoke(this.C, Boolean.valueOf(clip));
                } catch (Exception e2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.C.setIsClippedToScreen(clip);
        }
    }

    public final int u(View anchor, int yOffset, boolean ignoreBottomDecorations) {
        return this.C.getMaxAvailableHeight(anchor, yOffset, ignoreBottomDecorations);
    }
}
