package androidx.fragment.app;

import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f824b;

    public l(q this$0, ArrayList arrayList) {
        this.f824b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        b2.e(this.f824b, 4);
    }
}
