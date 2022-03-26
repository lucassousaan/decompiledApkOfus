package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.example.helloworld.R;
import e0.d;
import f0.c1;
import java.util.Calendar;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f1344b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1345c;

    public MaterialCalendarGridView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1344b = s0.i();
        if (d0.Q1(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f1345c = d0.R1(getContext());
        c1.l0(this, new y(this));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int position) {
        if (position < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(position);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean result = super.onKeyDown(keyCode, event);
        if (!result) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != keyCode) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    /* renamed from: b */
    public j0 getAdapter2() {
        return (j0) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter adapter) {
        if (adapter instanceof j0) {
            super.setAdapter(adapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j0.class.getCanonicalName()));
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g != com.google.android.material.datepicker.DateSelector<?> */
    /* JADX WARN: Generic types in debug info not equals: e0.d != androidx.core.util.Pair<java.lang.Long, java.lang.Long> */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j0 monthAdapter = getAdapter2();
        g gVar = monthAdapter.f1401c;
        f fVar = monthAdapter.f1403e;
        monthAdapter.getItem(monthAdapter.b());
        monthAdapter.getItem(monthAdapter.g());
        for (d dVar : gVar.g()) {
            Objects.requireNonNull(dVar);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f1345c) {
            int expandSpec = View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE);
            super.onMeasure(widthMeasureSpec, expandSpec);
            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = getMeasuredHeight();
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        if (gainFocus) {
            a(direction, previouslyFocusedRect);
        } else {
            super.onFocusChanged(false, direction, previouslyFocusedRect);
        }
    }

    public final void a(int direction, Rect previouslyFocusedRect) {
        if (direction == 33) {
            setSelection(getAdapter2().g());
        } else if (direction == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, direction, previouslyFocusedRect);
        }
    }
}
