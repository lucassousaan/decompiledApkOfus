package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.a2;
import androidx.appcompat.widget.e4;
import com.example.helloworld.R;
import f0.b;
import f0.c1;
import h.f0;
import h.t;
import i0.s;
import l1.h;
import l1.j;
import w.l;
import y.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends h implements f0 {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public t B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final b F;

    /* renamed from: w  reason: collision with root package name */
    public int f1463w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1464x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1465y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f1466z;

    public NavigationMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        j jVar = new j(this);
        this.F = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f1466z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        c1.l0(checkedTextView, jVar);
    }

    @Override // h.f0
    public void c(t itemData, int menuType) {
        this.B = itemData;
        if (itemData.getItemId() > 0) {
            setId(itemData.getItemId());
        }
        setVisibility(itemData.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            c1.o0(this, C());
        }
        setCheckable(itemData.isCheckable());
        setChecked(itemData.isChecked());
        setEnabled(itemData.isEnabled());
        setTitle(itemData.getTitle());
        setIcon(itemData.getIcon());
        setActionView(itemData.getActionView());
        setContentDescription(itemData.getContentDescription());
        e4.a(this, itemData.getTooltipText());
        B();
    }

    public final boolean D() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    public final void B() {
        if (D()) {
            this.f1466z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                a2 params = (a2) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) params).width = -1;
                this.A.setLayoutParams(params);
                return;
            }
            return;
        }
        this.f1466z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            a2 params2 = (a2) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) params2).width = -2;
            this.A.setLayoutParams(params2);
        }
    }

    private void setActionView(View actionView) {
        if (actionView != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(actionView);
        }
    }

    public final StateListDrawable C() {
        TypedValue value = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, value, true)) {
            return null;
        }
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(G, new ColorDrawable(value.data));
        drawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return drawable;
    }

    @Override // h.f0
    public t getItemData() {
        return this.B;
    }

    public void setTitle(CharSequence title) {
        this.f1466z.setText(title);
    }

    public void setCheckable(boolean checkable) {
        refreshDrawableState();
        if (this.f1465y != checkable) {
            this.f1465y = checkable;
            this.F.l(this.f1466z, 2048);
        }
    }

    public void setChecked(boolean checked) {
        refreshDrawableState();
        this.f1466z.setChecked(checked);
    }

    public void setIcon(Drawable icon) {
        if (icon != null) {
            if (this.D) {
                Drawable.ConstantState state = icon.getConstantState();
                Drawable newDrawable = state == null ? icon : state.newDrawable();
                a.l(newDrawable);
                icon = newDrawable.mutate();
                a.i(icon, this.C);
            }
            int i2 = this.f1463w;
            icon.setBounds(0, 0, i2, i2);
        } else if (this.f1464x) {
            if (this.E == null) {
                Drawable b2 = l.b(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.E = b2;
                if (b2 != null) {
                    int i3 = this.f1463w;
                    b2.setBounds(0, 0, i3, i3);
                }
            }
            icon = this.E;
        }
        s.i(this.f1466z, icon, null, null, null);
    }

    public void setIconSize(int iconSize) {
        this.f1463w = iconSize;
    }

    @Override // h.f0
    public boolean d() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        t tVar = this.B;
        if (tVar != null && tVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(drawableState, G);
        }
        return drawableState;
    }

    public void setIconTintList(ColorStateList tintList) {
        this.C = tintList;
        this.D = tintList != null;
        t tVar = this.B;
        if (tVar != null) {
            setIcon(tVar.getIcon());
        }
    }

    public void setTextAppearance(int textAppearance) {
        s.n(this.f1466z, textAppearance);
    }

    public void setTextColor(ColorStateList colors) {
        this.f1466z.setTextColor(colors);
    }

    public void setNeedsEmptyIcon(boolean needsEmptyIcon) {
        this.f1464x = needsEmptyIcon;
    }

    public void setHorizontalPadding(int padding) {
        setPadding(padding, 0, padding, 0);
    }

    public void setIconPadding(int padding) {
        this.f1466z.setCompoundDrawablePadding(padding);
    }

    public void setMaxLines(int maxLines) {
        this.f1466z.setMaxLines(maxLines);
    }
}
