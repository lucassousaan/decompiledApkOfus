package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f1567b;

    public p(TimePickerView this$0, GestureDetector gestureDetector) {
        this.f1567b = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        if (((Checkable) v2).isChecked()) {
            return this.f1567b.onTouchEvent(event);
        }
        return false;
    }
}
