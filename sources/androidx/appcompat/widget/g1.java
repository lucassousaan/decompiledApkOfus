package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;
import w.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g1 extends h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WeakReference f328c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i1 f329d;

    public g1(i1 this$0, int i2, int i3, WeakReference weakReference) {
        this.f329d = this$0;
        this.f326a = i2;
        this.f327b = i3;
        this.f328c = weakReference;
    }

    @Override // w.h
    public void e(Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f326a) != -1) {
            typeface = Typeface.create(typeface, i2, (this.f327b & 2) != 0);
        }
        this.f329d.n(this.f328c, typeface);
    }

    @Override // w.h
    public void d(int reason) {
    }
}
