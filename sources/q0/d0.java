package q0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b  reason: collision with root package name */
    public int f2995b;

    /* renamed from: c  reason: collision with root package name */
    public int f2996c;

    /* renamed from: d  reason: collision with root package name */
    public int f2997d;

    /* renamed from: e  reason: collision with root package name */
    public int f2998e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3001h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3002i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2994a = true;

    /* renamed from: f  reason: collision with root package name */
    public int f2999f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3000g = 0;

    public boolean a(b2 state) {
        int i2 = this.f2996c;
        return i2 >= 0 && i2 < state.b();
    }

    public View b(t1 recycler) {
        View view = recycler.o(this.f2996c);
        this.f2996c += this.f2997d;
        return view;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2995b + ", mCurrentPosition=" + this.f2996c + ", mItemDirection=" + this.f2997d + ", mLayoutDirection=" + this.f2998e + ", mStartLine=" + this.f2999f + ", mEndLine=" + this.f3000g + '}';
    }
}
