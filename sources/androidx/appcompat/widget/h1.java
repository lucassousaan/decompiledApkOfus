package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f334b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Typeface f335c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f336d;

    public h1(i1 this$0, TextView textView, Typeface typeface, int i2) {
        this.f334b = textView;
        this.f335c = typeface;
        this.f336d = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f334b.setTypeface(this.f335c, this.f336d);
    }
}
