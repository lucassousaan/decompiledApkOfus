package androidx.lifecycle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final w f1040a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1041b;

    /* renamed from: c  reason: collision with root package name */
    public int f1042c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f1043d;

    public abstract boolean j();

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.w != androidx.lifecycle.Observer<? super T> */
    public s(t tVar, w wVar) {
        this.f1043d = tVar;
        this.f1040a = wVar;
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    public void i() {
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.lifecycle.s != androidx.lifecycle.LiveData<T>$ObserverWrapper */
    public void h(boolean newActive) {
        if (newActive != this.f1041b) {
            this.f1041b = newActive;
            this.f1043d.b(newActive ? 1 : -1);
            if (this.f1041b) {
                this.f1043d.d(this);
            }
        }
    }
}
