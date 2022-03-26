package b0;

import android.os.CancellationSignal;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1134a;

    /* renamed from: b  reason: collision with root package name */
    public b f1135b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1136c;

    public void a() {
        synchronized (this) {
            if (!this.f1134a) {
                this.f1134a = true;
                this.f1136c = true;
                b listener = this.f1135b;
                CancellationSignal cancellationSignal = null;
                if (listener != null) {
                    try {
                        listener.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f1136c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (0 != 0) {
                    cancellationSignal.cancel();
                }
                synchronized (this) {
                    this.f1136c = false;
                    notifyAll();
                }
            }
        }
    }

    public void b(b listener) {
        synchronized (this) {
            c();
            if (this.f1135b != listener) {
                this.f1135b = listener;
                if (this.f1134a && listener != null) {
                    listener.a();
                }
            }
        }
    }

    public final void c() {
        while (this.f1136c) {
            try {
                wait();
            } catch (InterruptedException e2) {
            }
        }
    }
}
