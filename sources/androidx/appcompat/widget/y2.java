package androidx.appcompat.widget;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class y2 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f590a;

    public y2(SearchView this$0) {
        this.f590a = this$0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        this.f590a.B();
    }
}
