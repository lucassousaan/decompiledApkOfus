package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.s3;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import h.f0;
import h.t;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements f0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public t f77b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f78c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f79d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f80e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f81f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f82g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f83h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f84i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f85j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f86k;

    /* renamed from: l  reason: collision with root package name */
    public int f87l;

    /* renamed from: m  reason: collision with root package name */
    public Context f88m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f89n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f90o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f91p;

    /* renamed from: q  reason: collision with root package name */
    public LayoutInflater f92q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f93r;

    public ListMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        s3 a2 = s3.v(getContext(), attrs, a.f1183q, defStyleAttr, 0);
        int[] iArr = a.f1167a;
        this.f86k = a2.g(5);
        this.f87l = a2.n(1, -1);
        this.f89n = a2.a(7, false);
        this.f88m = context;
        this.f90o = a2.g(8);
        TypedArray b2 = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f91p = b2.hasValue(0);
        a2.w();
        b2.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        c1.o0(this, this.f86k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f80e = textView;
        int i2 = this.f87l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f88m, i2);
        }
        this.f82g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f83h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f90o);
        }
        this.f84i = (ImageView) findViewById(R.id.group_divider);
        this.f85j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // h.f0
    public void c(t itemData, int menuType) {
        this.f77b = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        setTitle(itemData.i(this));
        setCheckable(itemData.isCheckable());
        boolean z2 = itemData.z();
        itemData.g();
        h(z2);
        setIcon(itemData.getIcon());
        setEnabled(itemData.isEnabled());
        setSubMenuArrowVisible(itemData.hasSubMenu());
        setContentDescription(itemData.getContentDescription());
    }

    public final void a(View v2) {
        b(v2, -1);
    }

    public final void b(View v2, int index) {
        LinearLayout linearLayout = this.f85j;
        if (linearLayout != null) {
            linearLayout.addView(v2, index);
        } else {
            addView(v2, index);
        }
    }

    public void setForceShowIcon(boolean forceShow) {
        this.f93r = forceShow;
        this.f89n = forceShow;
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            this.f80e.setText(title);
            if (this.f80e.getVisibility() != 0) {
                this.f80e.setVisibility(0);
            }
        } else if (this.f80e.getVisibility() != 8) {
            this.f80e.setVisibility(8);
        }
    }

    @Override // h.f0
    public t getItemData() {
        return this.f77b;
    }

    public void setCheckable(boolean checkable) {
        CompoundButton otherCompoundButton;
        CompoundButton compoundButton;
        if (checkable || this.f79d != null || this.f81f != null) {
            if (this.f77b.m()) {
                if (this.f79d == null) {
                    g();
                }
                compoundButton = this.f79d;
                otherCompoundButton = this.f81f;
            } else {
                if (this.f81f == null) {
                    e();
                }
                compoundButton = this.f81f;
                otherCompoundButton = this.f79d;
            }
            if (checkable) {
                compoundButton.setChecked(this.f77b.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                    otherCompoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f81f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f79d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton compoundButton;
        if (this.f77b.m()) {
            if (this.f79d == null) {
                g();
            }
            compoundButton = this.f79d;
        } else {
            CompoundButton compoundButton2 = this.f81f;
            if (compoundButton2 == null) {
                e();
            }
            compoundButton = this.f81f;
        }
        compoundButton.setChecked(checked);
    }

    private void setSubMenuArrowVisible(boolean hasSubmenu) {
        ImageView imageView = this.f83h;
        if (imageView != null) {
            imageView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }

    public void h(boolean showShortcut) {
        int newVisibility = (!showShortcut || !this.f77b.z()) ? 8 : 0;
        if (newVisibility == 0) {
            this.f82g.setText(this.f77b.h());
        }
        if (this.f82g.getVisibility() != newVisibility) {
            this.f82g.setVisibility(newVisibility);
        }
    }

    public void setIcon(Drawable icon) {
        this.f77b.y();
        boolean showIcon = this.f93r;
        if (showIcon || this.f89n) {
            ImageView imageView = this.f78c;
            if (imageView != null || icon != null || this.f89n) {
                if (imageView == null) {
                    f();
                }
                if (icon != null || this.f89n) {
                    this.f78c.setImageDrawable(showIcon ? icon : null);
                    if (this.f78c.getVisibility() != 0) {
                        this.f78c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f78c.setVisibility(8);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f78c != null && this.f89n) {
            ViewGroup.LayoutParams lp = getLayoutParams();
            LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams) this.f78c.getLayoutParams();
            int i2 = lp.height;
            if (i2 > 0 && iconLp.width <= 0) {
                iconLp.width = i2;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void f() {
        LayoutInflater inflater = getInflater();
        ImageView imageView = (ImageView) inflater.inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f78c = imageView;
        b(imageView, 0);
    }

    public final void g() {
        LayoutInflater inflater = getInflater();
        RadioButton radioButton = (RadioButton) inflater.inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f79d = radioButton;
        a(radioButton);
    }

    public final void e() {
        LayoutInflater inflater = getInflater();
        CheckBox checkBox = (CheckBox) inflater.inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f81f = checkBox;
        a(checkBox);
    }

    @Override // h.f0
    public boolean d() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.f92q == null) {
            this.f92q = LayoutInflater.from(getContext());
        }
        return this.f92q;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        ImageView imageView = this.f84i;
        if (imageView != null) {
            imageView.setVisibility((this.f91p || !groupDividerEnabled) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f84i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f84i.getLayoutParams();
            rect.top += this.f84i.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
