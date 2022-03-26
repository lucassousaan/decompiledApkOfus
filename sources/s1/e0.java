package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.j2;
import androidx.appcompat.widget.w;
import com.example.helloworld.R;
import com.google.android.material.textfield.TextInputLayout;
import l1.i;
import l1.q;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e0 extends w {

    /* renamed from: e  reason: collision with root package name */
    public final j2 f3488e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f3489f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f3490g;

    public e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public e0(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(a.c(context, attributeSet, defStyleAttr, 0), attributeSet, defStyleAttr);
        this.f3490g = new Rect();
        Context context2 = getContext();
        TypedArray attributes = q.h(context2, attributeSet, v0.a.f3613j, defStyleAttr, 2131755534, new int[0]);
        int[] iArr = v0.a.f3604a;
        if (attributes.hasValue(0)) {
            int inputType = attributes.getInt(0, 0);
            if (inputType == 0) {
                setKeyListener(null);
            }
        }
        this.f3489f = (AccessibilityManager) context2.getSystemService("accessibility");
        j2 j2Var = new j2(context2);
        this.f3488e = j2Var;
        j2Var.J(true);
        j2Var.D(this);
        j2Var.I(2);
        j2Var.o(getAdapter());
        j2Var.L(new d0(this));
        attributes.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f3489f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f3488e.i();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T adapter) {
        super.setAdapter(adapter);
        this.f3488e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout layout = c();
        if (layout != null && layout.O() && super.getHint() == null && i.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = c();
        if (textInputLayout == null || !textInputLayout.O()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(Math.min(Math.max(measuredWidth, d()), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    public final int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayout = c();
        if (adapter == null || textInputLayout == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int start = Math.max(0, this.f3488e.x());
        int end = Math.min(adapter.getCount(), start + 15);
        int start2 = Math.max(0, end - 15);
        for (int i2 = start2; i2 < end; i2++) {
            int positionType = adapter.getItemViewType(i2);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i2, itemView, textInputLayout);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        Drawable background = this.f3488e.n();
        if (background != null) {
            background.getPadding(this.f3490g);
            Rect rect = this.f3490g;
            width += rect.left + rect.right;
        }
        int iconWidth = textInputLayout.getEndIconView().getMeasuredWidth();
        return width + iconWidth;
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void e(Object selectedItem) {
        setText(convertSelectionToString(selectedItem), false);
    }
}
