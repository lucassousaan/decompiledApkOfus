package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.e4;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.z1;
import c.a;
import h.b;
import h.c;
import h.f0;
import h.p;
import h.t;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends j1 implements f0, View.OnClickListener, r {

    /* renamed from: g  reason: collision with root package name */
    public t f64g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f65h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f66i;

    /* renamed from: j  reason: collision with root package name */
    public p f67j;

    /* renamed from: k  reason: collision with root package name */
    public z1 f68k;

    /* renamed from: l  reason: collision with root package name */
    public c f69l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f70m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f71n;

    /* renamed from: o  reason: collision with root package name */
    public int f72o;

    /* renamed from: p  reason: collision with root package name */
    public int f73p;

    /* renamed from: q  reason: collision with root package name */
    public int f74q;

    public ActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Resources res = context.getResources();
        this.f70m = g();
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f1169c, defStyle, 0);
        int[] iArr = a.f1167a;
        this.f72o = a2.getDimensionPixelSize(0, 0);
        a2.recycle();
        float density = res.getDisplayMetrics().density;
        this.f74q = (int) ((32.0f * density) + 0.5f);
        setOnClickListener(this);
        this.f73p = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f70m = g();
        h();
    }

    public final boolean g() {
        Configuration config = getContext().getResources().getConfiguration();
        int widthDp = config.screenWidthDp;
        int heightDp = config.screenHeightDp;
        return widthDp >= 480 || (widthDp >= 640 && heightDp >= 480) || config.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int l2, int t2, int r2, int b2) {
        this.f73p = l2;
        super.setPadding(l2, t2, r2, b2);
    }

    @Override // h.f0
    public t getItemData() {
        return this.f64g;
    }

    @Override // h.f0
    public void c(t itemData, int menuType) {
        this.f64g = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.i(this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? 0 : 8);
        setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.f68k == null) {
            this.f68k = new b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent e2) {
        z1 z1Var;
        if (!this.f64g.hasSubMenu() || (z1Var = this.f68k) == null || !z1Var.onTouch(this, e2)) {
            return super.onTouchEvent(e2);
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        p pVar = this.f67j;
        if (pVar != null) {
            pVar.f(this.f64g);
        }
    }

    public void setItemInvoker(p invoker) {
        this.f67j = invoker;
    }

    public void setPopupCallback(c popupCallback) {
        this.f69l = popupCallback;
    }

    @Override // h.f0
    public boolean d() {
        return true;
    }

    public void setCheckable(boolean checkable) {
    }

    public void setChecked(boolean checked) {
    }

    public void setExpandedFormat(boolean expandedFormat) {
        if (this.f71n != expandedFormat) {
            this.f71n = expandedFormat;
            t tVar = this.f64g;
            if (tVar != null) {
                tVar.c();
            }
        }
    }

    public final void h() {
        boolean z2 = true;
        boolean visible = !TextUtils.isEmpty(this.f65h);
        if (this.f66i != null && (!this.f64g.A() || (!this.f70m && !this.f71n))) {
            z2 = false;
        }
        boolean visible2 = visible & z2;
        CharSequence charSequence = null;
        setText(visible2 ? this.f65h : null);
        CharSequence contentDescription = this.f64g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(visible2 ? null : this.f64g.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f64g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!visible2) {
                charSequence = this.f64g.getTitle();
            }
            e4.a(this, charSequence);
            return;
        }
        e4.a(this, tooltipText);
    }

    public void setIcon(Drawable icon) {
        this.f66i = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            int i2 = this.f74q;
            if (width > i2) {
                float scale = i2 / width;
                width = this.f74q;
                height = (int) (height * scale);
            }
            if (height > i2) {
                float scale2 = i2 / height;
                height = this.f74q;
                width = (int) (width * scale2);
            }
            icon.setBounds(0, 0, width, height);
        }
        setCompoundDrawables(icon, null, null, null);
        h();
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence title) {
        this.f65h = title;
        h();
    }

    @Override // androidx.appcompat.widget.r
    public boolean a() {
        return f() && this.f64g.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.r
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.widget.j1, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i2;
        boolean textVisible = f();
        if (textVisible && (i2 = this.f73p) >= 0) {
            super.setPadding(i2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth = getMeasuredWidth();
        int targetWidth = widthMode == Integer.MIN_VALUE ? Math.min(widthSize, this.f72o) : this.f72o;
        if (widthMode != 1073741824 && this.f72o > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.f66i != null) {
            int w2 = getMeasuredWidth();
            int dw = this.f66i.getBounds().width();
            super.setPadding((w2 - dw) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(null);
    }
}
