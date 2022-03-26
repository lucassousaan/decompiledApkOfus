package androidx.fragment.app;

import android.view.View;
import f0.c1;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f798b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f799c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f800d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f801e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f802f;

    public i2(j2 this$0, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f798b = i2;
        this.f799c = arrayList;
        this.f800d = arrayList2;
        this.f801e = arrayList3;
        this.f802f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i2 = 0; i2 < this.f798b; i2++) {
            c1.x0((View) this.f799c.get(i2), (String) this.f800d.get(i2));
            c1.x0((View) this.f801e.get(i2), (String) this.f802f.get(i2));
        }
    }
}
