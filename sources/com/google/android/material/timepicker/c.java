package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1552b;

    public c(ClockFaceView this$0) {
        this.f1552b = this$0;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ClockHandView clockHandView;
        int i2;
        if (!this.f1552b.isShown()) {
            return true;
        }
        this.f1552b.getViewTreeObserver().removeOnPreDrawListener(this);
        clockHandView = this.f1552b.f1529x;
        int height = (this.f1552b.getHeight() / 2) - clockHandView.g();
        i2 = this.f1552b.E;
        int circleRadius = height - i2;
        this.f1552b.v(circleRadius);
        return true;
    }
}
