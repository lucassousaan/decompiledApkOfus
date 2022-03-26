package androidx.fragment.app;

import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k1 implements j1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f817a;

    /* renamed from: b  reason: collision with root package name */
    public final int f818b;

    /* renamed from: c  reason: collision with root package name */
    public final int f819c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m1 f820d;

    public k1(m1 m1Var, String name, int id, int flags) {
        this.f820d = m1Var;
        this.f817a = name;
        this.f818b = id;
        this.f819c = flags;
    }

    @Override // androidx.fragment.app.j1
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        f0 f0Var = this.f820d.f854t;
        if (f0Var != null && this.f818b < 0) {
            m1 childManager = f0Var.o();
            if (childManager.G0()) {
                return false;
            }
        }
        return this.f820d.I0(arrayList, arrayList2, null, this.f818b, this.f819c);
    }
}
