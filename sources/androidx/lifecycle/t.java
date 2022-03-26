package androidx.lifecycle;

import androidx.fragment.app.u;
import i.c;
import j.e;
import j.h;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1044j = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1048d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1049e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1050f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1052h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1053i;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1045a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public h f1046b = new h();

    /* renamed from: c  reason: collision with root package name */
    public int f1047c = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f1051g = -1;

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public t() {
        Object obj = f1044j;
        this.f1050f = obj;
        new q(this);
        this.f1049e = obj;
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public final void c(s sVar) {
        if (sVar.f1041b) {
            if (!sVar.j()) {
                sVar.h(false);
                return;
            }
            int i2 = sVar.f1042c;
            int i3 = this.f1051g;
            if (i2 < i3) {
                sVar.f1042c = i3;
                ((u) sVar.f1040a).b(this.f1049e);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public void d(s sVar) {
        if (this.f1052h) {
            this.f1053i = true;
            return;
        }
        this.f1052h = true;
        do {
            this.f1053i = false;
            if (sVar == null) {
                e d2 = this.f1046b.d();
                while (d2.hasNext()) {
                    c((s) ((Map.Entry) d2.next()).getValue());
                    if (this.f1053i) {
                        break;
                    }
                }
            } else {
                c(sVar);
                sVar = null;
            }
        } while (this.f1053i);
        this.f1052h = false;
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.r != androidx.lifecycle.LiveData<T>$AlwaysActiveObserver */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.w != androidx.lifecycle.Observer<? super T> */
    public void e(w wVar) {
        a("observeForever");
        r rVar = new r(this, wVar);
        s sVar = (s) this.f1046b.g(wVar, rVar);
        if (sVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (sVar == null) {
            rVar.h(true);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.w != androidx.lifecycle.Observer<? super T> */
    public void h(w wVar) {
        a("removeObserver");
        s sVar = (s) this.f1046b.h(wVar);
        if (sVar != null) {
            sVar.i();
            sVar.h(false);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public void i(Object obj) {
        a("setValue");
        this.f1051g++;
        this.f1049e = obj;
        d(null);
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public void f() {
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public void g() {
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.t != androidx.lifecycle.LiveData<T> */
    public void b(int change) {
        boolean needToCallActive;
        boolean needToCallInactive;
        int previousActiveCount = this.f1047c;
        this.f1047c += change;
        if (!this.f1048d) {
            this.f1048d = true;
            while (true) {
                try {
                    int i2 = this.f1047c;
                    if (previousActiveCount != i2) {
                        if (previousActiveCount != 0 || i2 <= 0) {
                            needToCallActive = false;
                        } else {
                            needToCallActive = true;
                        }
                        if (previousActiveCount <= 0 || i2 != 0) {
                            needToCallInactive = false;
                        } else {
                            needToCallInactive = true;
                        }
                        previousActiveCount = i2;
                        if (needToCallActive) {
                            f();
                        } else if (needToCallInactive) {
                            g();
                        }
                    } else {
                        return;
                    }
                } finally {
                    this.f1048d = false;
                }
            }
        }
    }

    public static void a(String methodName) {
        if (!c.d().b()) {
            throw new IllegalStateException("Cannot invoke " + methodName + " on a background thread");
        }
    }
}
