package q0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b2 {

    /* renamed from: a  reason: collision with root package name */
    public int f2967a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f2968b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2969c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2970d = 1;

    /* renamed from: e  reason: collision with root package name */
    public int f2971e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2972f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2973g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2974h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2975i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2976j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2977k = false;

    /* renamed from: l  reason: collision with root package name */
    public int f2978l;

    /* renamed from: m  reason: collision with root package name */
    public long f2979m;

    /* renamed from: n  reason: collision with root package name */
    public int f2980n;

    public void a(int accepted) {
        if ((this.f2970d & accepted) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(accepted) + " but it is " + Integer.toBinaryString(this.f2970d));
        }
    }

    public void f(x0 adapter) {
        this.f2970d = 1;
        this.f2971e = adapter.c();
        this.f2973g = false;
        this.f2974h = false;
        this.f2975i = false;
    }

    public boolean e() {
        return this.f2973g;
    }

    public boolean g() {
        return this.f2977k;
    }

    public int c() {
        return this.f2967a;
    }

    public boolean d() {
        return this.f2967a != -1;
    }

    public int b() {
        return this.f2973g ? this.f2968b - this.f2969c : this.f2971e;
    }

    public String toString() {
        return "State{mTargetPosition=" + this.f2967a + ", mData=" + ((Object) null) + ", mItemCount=" + this.f2971e + ", mIsMeasuring=" + this.f2975i + ", mPreviousLayoutItemCount=" + this.f2968b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2969c + ", mStructureChanged=" + this.f2972f + ", mInPreLayout=" + this.f2973g + ", mRunSimpleAnimations=" + this.f2976j + ", mRunPredictiveAnimations=" + this.f2977k + '}';
    }
}
