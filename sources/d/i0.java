package d;

import android.content.IntentFilter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i0 extends h0 {

    /* renamed from: c  reason: collision with root package name */
    public final v0 f1630c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n0 f1631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, v0 twilightManager) {
        super(n0Var);
        this.f1631d = n0Var;
        this.f1630c = twilightManager;
    }

    @Override // d.h0
    public int c() {
        return this.f1630c.d() ? 2 : 1;
    }

    @Override // d.h0
    public void d() {
        this.f1631d.F();
    }

    @Override // d.h0
    public IntentFilter b() {
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.TIME_SET");
        filter.addAction("android.intent.action.TIMEZONE_CHANGED");
        filter.addAction("android.intent.action.TIME_TICK");
        return filter;
    }
}
