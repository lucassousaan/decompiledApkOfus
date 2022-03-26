package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.helloworld.R;
import e1.h;
import e1.i;
import e1.j;
import f0.c1;
import g0.d;
import g0.f;
import java.util.ArrayList;
import java.util.List;
import l1.g;
import l1.q;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class ChipGroup extends g {

    /* renamed from: o  reason: collision with root package name */
    public static final int f1334o = 2131755648;

    /* renamed from: f  reason: collision with root package name */
    public int f1335f;

    /* renamed from: g  reason: collision with root package name */
    public int f1336g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1337h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1338i;

    /* renamed from: j  reason: collision with root package name */
    public i f1339j;

    /* renamed from: k  reason: collision with root package name */
    public final e1.g f1340k;

    /* renamed from: l  reason: collision with root package name */
    public j f1341l;

    /* renamed from: m  reason: collision with root package name */
    public int f1342m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1343n;

    public ChipGroup(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 2131755648), attrs, defStyleAttr);
        this.f1340k = new e1.g(this, null);
        this.f1341l = new j(this, null);
        this.f1342m = -1;
        this.f1343n = false;
        Context context2 = getContext();
        TypedArray a2 = q.h(context2, attrs, v0.a.f3606c, defStyleAttr, 2131755648, new int[0]);
        int[] iArr = v0.a.f3604a;
        int chipSpacing = a2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(a2.getDimensionPixelOffset(2, chipSpacing));
        setChipSpacingVertical(a2.getDimensionPixelOffset(3, chipSpacing));
        setSingleLine(a2.getBoolean(5, false));
        setSingleSelection(a2.getBoolean(6, false));
        setSelectionRequired(a2.getBoolean(4, false));
        int checkedChip = a2.getResourceId(0, -1);
        if (checkedChip != -1) {
            this.f1342m = checkedChip;
        }
        a2.recycle();
        super.setOnHierarchyChangeListener(this.f1341l);
        c1.s0(this, 1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        f infoCompat = f.v0(info);
        int columnCount = c() ? getChipCount() : -1;
        infoCompat.Y(d.a(getRowCount(), columnCount, false, p() ? 1 : 2));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new h(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return new h(lp);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new h(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p2) {
        return super.checkLayoutParams(p2) && (p2 instanceof h);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
        j.a(this.f1341l, listener);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f1342m;
        if (i2 != -1) {
            r(i2, true);
            setCheckedId(this.f1342m);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof Chip) {
            Chip chip = (Chip) child;
            if (chip.isChecked()) {
                int i2 = this.f1342m;
                if (i2 != -1 && this.f1337h) {
                    r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(child, index, params);
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable divider) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable divider) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerHorizontal(int dividerMode) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int dividerMode) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int flexWrap) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void m(int id) {
        int i2 = this.f1342m;
        if (id != i2) {
            if (i2 != -1 && this.f1337h) {
                r(i2, false);
            }
            if (id != -1) {
                r(id, true);
            }
            setCheckedId(id);
        }
    }

    public int getCheckedChipId() {
        if (this.f1337h) {
            return this.f1342m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList<Integer> checkedIds = new ArrayList<>();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View child = getChildAt(i2);
            if ((child instanceof Chip) && ((Chip) child).isChecked()) {
                checkedIds.add(Integer.valueOf(child.getId()));
                if (this.f1337h) {
                    return checkedIds;
                }
            }
        }
        return checkedIds;
    }

    public void n() {
        this.f1343n = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View child = getChildAt(i2);
            if (child instanceof Chip) {
                ((Chip) child).setChecked(false);
            }
        }
        this.f1343n = false;
        setCheckedId(-1);
    }

    public void setOnCheckedChangeListener(i listener) {
        this.f1339j = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int checkedId) {
        q(checkedId, true);
    }

    public final void q(int checkedId, boolean fromUser) {
        this.f1342m = checkedId;
        i iVar = this.f1339j;
        if (iVar != null && this.f1337h && fromUser) {
            iVar.a(this, checkedId);
        }
    }

    public final void r(int viewId, boolean checked) {
        View checkedView = findViewById(viewId);
        if (checkedView instanceof Chip) {
            this.f1343n = true;
            ((Chip) checkedView).setChecked(checked);
            this.f1343n = false;
        }
    }

    private int getChipCount() {
        int count = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                count++;
            }
        }
        return count;
    }

    public int o(View child) {
        if (!(child instanceof Chip)) {
            return -1;
        }
        int index = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                Chip chip = (Chip) getChildAt(i2);
                if (chip == child) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public void setChipSpacing(int chipSpacing) {
        setChipSpacingHorizontal(chipSpacing);
        setChipSpacingVertical(chipSpacing);
    }

    public void setChipSpacingResource(int id) {
        setChipSpacing(getResources().getDimensionPixelOffset(id));
    }

    public int getChipSpacingHorizontal() {
        return this.f1335f;
    }

    public void setChipSpacingHorizontal(int chipSpacingHorizontal) {
        if (this.f1335f != chipSpacingHorizontal) {
            this.f1335f = chipSpacingHorizontal;
            setItemSpacing(chipSpacingHorizontal);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int id) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(id));
    }

    public int getChipSpacingVertical() {
        return this.f1336g;
    }

    public void setChipSpacingVertical(int chipSpacingVertical) {
        if (this.f1336g != chipSpacingVertical) {
            this.f1336g = chipSpacingVertical;
            setLineSpacing(chipSpacingVertical);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int id) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(id));
    }

    @Override // l1.g
    public boolean c() {
        return super.c();
    }

    @Override // l1.g
    public void setSingleLine(boolean singleLine) {
        super.setSingleLine(singleLine);
    }

    public void setSingleLine(int id) {
        setSingleLine(getResources().getBoolean(id));
    }

    public boolean p() {
        return this.f1337h;
    }

    public void setSingleSelection(boolean singleSelection) {
        if (this.f1337h != singleSelection) {
            this.f1337h = singleSelection;
            n();
        }
    }

    public void setSingleSelection(int id) {
        setSingleSelection(getResources().getBoolean(id));
    }

    public void setSelectionRequired(boolean selectionRequired) {
        this.f1338i = selectionRequired;
    }
}
