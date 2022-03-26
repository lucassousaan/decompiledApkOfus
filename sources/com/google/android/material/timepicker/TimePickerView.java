package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.helloworld.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import f0.c1;
import q.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: u  reason: collision with root package name */
    public final Chip f1547u;

    /* renamed from: v  reason: collision with root package name */
    public final Chip f1548v;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButtonToggleGroup f1549w;

    /* renamed from: x  reason: collision with root package name */
    public final View.OnClickListener f1550x;

    public TimePickerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TimePickerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1550x = new m(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f1549w = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new n(this));
        this.f1547u = (Chip) findViewById(R.id.material_minute_tv);
        this.f1548v = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        x();
        w();
    }

    public final void x() {
        GestureDetector gestureDetector = new GestureDetector(getContext(), new o(this));
        View.OnTouchListener onTouchListener = new p(this, gestureDetector);
        this.f1547u.setOnTouchListener(onTouchListener);
        this.f1548v.setOnTouchListener(onTouchListener);
    }

    public final void w() {
        this.f1547u.setTag(R.id.selection_type, 12);
        this.f1548v.setTag(R.id.selection_type, 10);
        this.f1547u.setOnClickListener(this.f1550x);
        this.f1548v.setOnClickListener(this.f1550x);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (changedView == this && visibility == 0) {
            y();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    public final void y() {
        if (this.f1549w.getVisibility() == 0) {
            o constraintSet = new o();
            constraintSet.g(this);
            int sideToClear = 1;
            boolean isLtr = c1.A(this) == 0;
            if (isLtr) {
                sideToClear = 2;
            }
            constraintSet.e(R.id.material_clock_display, sideToClear);
            constraintSet.c(this);
        }
    }
}
