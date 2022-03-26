package androidx.fragment.app;

import b0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p extends o {

    /* renamed from: c  reason: collision with root package name */
    public final Object f875c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f876d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f877e;

    public p(s2 operation, c signal, boolean isPop, boolean providesSharedElementTransition) {
        super(operation, signal);
        Object obj;
        Object obj2;
        if (operation.e() == r2.VISIBLE) {
            if (isPop) {
                obj2 = operation.f().G();
            } else {
                operation.f().r();
                obj2 = null;
            }
            this.f875c = obj2;
            if (isPop) {
                operation.f().l();
            } else {
                operation.f().k();
            }
            this.f876d = true;
        } else {
            if (isPop) {
                obj = operation.f().I();
            } else {
                operation.f().u();
                obj = null;
            }
            this.f875c = obj;
            this.f876d = true;
        }
        if (!providesSharedElementTransition) {
            this.f877e = null;
        } else if (isPop) {
            this.f877e = operation.f().K();
        } else {
            operation.f().J();
            this.f877e = null;
        }
    }

    public Object h() {
        return this.f875c;
    }

    public boolean j() {
        return this.f876d;
    }

    public boolean i() {
        return this.f877e != null;
    }

    public Object g() {
        return this.f877e;
    }

    public j2 e() {
        j2 transitionImpl = f(this.f875c);
        j2 sharedElementTransitionImpl = f(this.f877e);
        if (transitionImpl == null || sharedElementTransitionImpl == null || transitionImpl == sharedElementTransitionImpl) {
            return transitionImpl != null ? transitionImpl : sharedElementTransitionImpl;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f875c + " which uses a different Transition  type than its shared element transition " + this.f877e);
    }

    public final j2 f(Object transition) {
        if (transition == null) {
            return null;
        }
        j2 j2Var = b2.f721b;
        if (j2Var != null && j2Var.e(transition)) {
            return j2Var;
        }
        j2 j2Var2 = b2.f722c;
        if (j2Var2 != null && j2Var2.e(transition)) {
            return j2Var2;
        }
        throw new IllegalArgumentException("Transition " + transition + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
    }
}
