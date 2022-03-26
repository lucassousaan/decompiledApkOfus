package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import b1.f;
import b1.g;
import b1.h;
import b1.i;
import b1.j;
import b1.k;
import com.example.helloworld.R;
import com.google.android.material.timepicker.n;
import f0.c1;
import f0.s;
import g0.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import l1.q;
import q1.o;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final String f1302l = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    public static final int f1303m = 2131755662;

    /* renamed from: b  reason: collision with root package name */
    public final List f1304b;

    /* renamed from: c  reason: collision with root package name */
    public final h f1305c;

    /* renamed from: d  reason: collision with root package name */
    public final k f1306d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f1307e;

    /* renamed from: f  reason: collision with root package name */
    public final Comparator f1308f;

    /* renamed from: g  reason: collision with root package name */
    public Integer[] f1309g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1310h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1311i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1312j;

    /* renamed from: k  reason: collision with root package name */
    public int f1313k;

    public MaterialButtonToggleGroup(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(a.c(context, attrs, defStyleAttr, 2131755662), attrs, defStyleAttr);
        this.f1304b = new ArrayList();
        this.f1305c = new h(this, null);
        this.f1306d = new k(this, null);
        this.f1307e = new LinkedHashSet();
        this.f1308f = new f(this);
        this.f1310h = false;
        Context context2 = getContext();
        TypedArray attributes = q.h(context2, attrs, v0.a.f3615l, defStyleAttr, 2131755662, new int[0]);
        int[] iArr = v0.a.f3604a;
        setSingleSelection(attributes.getBoolean(2, false));
        this.f1313k = attributes.getResourceId(0, -1);
        this.f1312j = attributes.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        attributes.recycle();
        c1.s0(this, 1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f1313k;
        if (i2 != -1) {
            j(i2, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!(child instanceof MaterialButton)) {
            Log.e(f1302l, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(child, index, params);
        MaterialButton buttonChild = (MaterialButton) child;
        setGeneratedIdIfNeeded(buttonChild);
        setupButtonChild(buttonChild);
        if (buttonChild.isChecked()) {
            u(buttonChild.getId(), true);
            setCheckedId(buttonChild.getId());
        }
        q1.q shapeAppearanceModel = buttonChild.getShapeAppearanceModel();
        this.f1304b.add(new i(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        c1.l0(buttonChild, new g(this));
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View child) {
        super.onViewRemoved(child);
        if (child instanceof MaterialButton) {
            ((MaterialButton) child).h(this.f1305c);
            ((MaterialButton) child).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(child);
        if (indexOfChild >= 0) {
            this.f1304b.remove(indexOfChild);
        }
        w();
        h();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        w();
        h();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        g0.f infoCompat = g0.f.v0(info);
        infoCompat.Y(d.a(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    public void k() {
        this.f1310h = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton child = m(i2);
            child.setChecked(false);
            l(child.getId(), false);
        }
        this.f1310h = false;
        setCheckedId(-1);
    }

    public int getCheckedButtonId() {
        if (this.f1311i) {
            return this.f1313k;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        List<Integer> checkedIds = new ArrayList<>();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton child = m(i2);
            if (child.isChecked()) {
                checkedIds.add(Integer.valueOf(child.getId()));
            }
        }
        return checkedIds;
    }

    public void g(j listener) {
        this.f1307e.add(listener);
    }

    public boolean q() {
        return this.f1311i;
    }

    public void setSingleSelection(boolean singleSelection) {
        if (this.f1311i != singleSelection) {
            this.f1311i = singleSelection;
            k();
        }
    }

    public void setSelectionRequired(boolean selectionRequired) {
        this.f1312j = selectionRequired;
    }

    public void setSingleSelection(int id) {
        setSingleSelection(getResources().getBoolean(id));
    }

    public final void s(int viewId, boolean checked) {
        View checkedView = findViewById(viewId);
        if (checkedView instanceof MaterialButton) {
            this.f1310h = true;
            ((MaterialButton) checkedView).setChecked(checked);
            this.f1310h = false;
        }
    }

    private void setCheckedId(int checkedId) {
        this.f1313k = checkedId;
        l(checkedId, true);
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton currentButton = m(i2);
                MaterialButton previousButton = m(i2 - 1);
                int smallestStrokeWidth = Math.min(currentButton.getStrokeWidth(), previousButton.getStrokeWidth());
                LinearLayout.LayoutParams params = i(currentButton);
                if (getOrientation() == 0) {
                    s.c(params, 0);
                    s.d(params, -smallestStrokeWidth);
                    params.topMargin = 0;
                } else {
                    params.bottomMargin = 0;
                    params.topMargin = -smallestStrokeWidth;
                    s.d(params, 0);
                }
                currentButton.setLayoutParams(params);
            }
            r(firstVisibleChildIndex);
        }
    }

    public final MaterialButton m(int index) {
        return (MaterialButton) getChildAt(index);
    }

    public final void r(int childIndex) {
        if (getChildCount() != 0 && childIndex != -1) {
            MaterialButton currentButton = m(childIndex);
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) currentButton.getLayoutParams();
            if (getOrientation() == 1) {
                params.topMargin = 0;
                params.bottomMargin = 0;
                return;
            }
            s.c(params, 0);
            s.d(params, 0);
            params.leftMargin = 0;
            params.rightMargin = 0;
        }
    }

    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton button = m(i2);
            if (button.getVisibility() != 8) {
                o builder = button.getShapeAppearanceModel().v();
                i newCornerData = o(i2, firstVisibleChildIndex, lastVisibleChildIndex);
                t(builder, newCornerData);
                button.setShapeAppearanceModel(builder.m());
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (p(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (p(i2)) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean p(int i2) {
        View child = getChildAt(i2);
        return child.getVisibility() != 8;
    }

    private int getVisibleButtonCount() {
        int count = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && p(i2)) {
                count++;
            }
        }
        return count;
    }

    public final int n(View child) {
        if (!(child instanceof MaterialButton)) {
            return -1;
        }
        int index = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == child) {
                return index;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && p(i2)) {
                index++;
            }
        }
        return -1;
    }

    public final i o(int index, int firstVisibleChildIndex, int lastVisibleChildIndex) {
        i cornerData = (i) this.f1304b.get(index);
        if (firstVisibleChildIndex == lastVisibleChildIndex) {
            return cornerData;
        }
        boolean isHorizontal = getOrientation() == 0;
        if (index == firstVisibleChildIndex) {
            return isHorizontal ? i.e(cornerData, this) : i.f(cornerData);
        }
        if (index == lastVisibleChildIndex) {
            return isHorizontal ? i.b(cornerData, this) : i.a(cornerData);
        }
        return null;
    }

    public static void t(o shapeAppearanceModelBuilder, i cornerData) {
        if (cornerData == null) {
            shapeAppearanceModelBuilder.o(0.0f);
            return;
        }
        shapeAppearanceModelBuilder.B(cornerData.f1162a);
        shapeAppearanceModelBuilder.t(cornerData.f1165d);
        shapeAppearanceModelBuilder.F(cornerData.f1163b);
        shapeAppearanceModelBuilder.x(cornerData.f1164c);
    }

    public final boolean u(int childId, boolean childIsChecked) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f1312j || !checkedButtonIds.isEmpty()) {
            if (childIsChecked && this.f1311i) {
                checkedButtonIds.remove(Integer.valueOf(childId));
                for (Integer num : checkedButtonIds) {
                    int buttonId = num.intValue();
                    s(buttonId, false);
                    l(buttonId, false);
                }
            }
            return true;
        }
        s(childId, true);
        this.f1313k = childId;
        return false;
    }

    public final void l(int buttonId, boolean checked) {
        Iterator it = this.f1307e.iterator();
        while (it.hasNext()) {
            j listener = (j) it.next();
            ((n) listener).a(this, buttonId, checked);
        }
    }

    public final void j(int checkedId, boolean checked) {
        MaterialButton button = (MaterialButton) findViewById(checkedId);
        if (button != null) {
            button.setChecked(checked);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(c1.k());
        }
    }

    private void setupButtonChild(MaterialButton buttonChild) {
        buttonChild.setMaxLines(1);
        buttonChild.setEllipsize(TextUtils.TruncateAt.END);
        buttonChild.setCheckable(true);
        buttonChild.a(this.f1305c);
        buttonChild.setOnPressedChangeListenerInternal(this.f1306d);
        buttonChild.setShouldDrawSurfaceColorStroke(true);
    }

    public final LinearLayout.LayoutParams i(View child) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int i2) {
        Integer[] numArr = this.f1309g;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f1302l, "Child order wasn't updated");
        return i2;
    }

    public final void v() {
        SortedMap<MaterialButton, Integer> viewToIndexMap = new TreeMap<>(this.f1308f);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewToIndexMap.put(m(i2), Integer.valueOf(i2));
        }
        this.f1309g = (Integer[]) viewToIndexMap.values().toArray(new Integer[0]);
    }
}
