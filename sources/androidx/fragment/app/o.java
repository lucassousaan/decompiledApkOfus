package androidx.fragment.app;

import b0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final s2 f868a;

    /* renamed from: b  reason: collision with root package name */
    public final c f869b;

    public o(s2 operation, c signal) {
        this.f868a = operation;
        this.f869b = signal;
    }

    public s2 b() {
        return this.f868a;
    }

    public c c() {
        return this.f869b;
    }

    public boolean d() {
        r2 r2Var;
        r2 currentState = r2.c(this.f868a.f().H);
        r2 finalState = this.f868a.e();
        return currentState == finalState || !(currentState == (r2Var = r2.VISIBLE) || finalState == r2Var);
    }

    public void a() {
        this.f868a.d(this.f869b);
    }
}
