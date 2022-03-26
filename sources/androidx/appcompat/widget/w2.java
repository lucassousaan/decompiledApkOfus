package androidx.appcompat.widget;

import j0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f572b;

    public w2(SearchView this$0) {
        this.f572b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f572b.S;
        if (cVar instanceof n3) {
            cVar.b(null);
        }
    }
}
