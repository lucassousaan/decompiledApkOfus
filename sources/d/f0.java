package d;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f0 extends h0 {

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager f1610c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n0 f1611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(n0 n0Var, Context context) {
        super(n0Var);
        this.f1611d = n0Var;
        this.f1610c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // d.h0
    public int c() {
        return b0.a(this.f1610c) ? 2 : 1;
    }

    @Override // d.h0
    public void d() {
        this.f1611d.F();
    }

    @Override // d.h0
    public IntentFilter b() {
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return filter;
    }
}
