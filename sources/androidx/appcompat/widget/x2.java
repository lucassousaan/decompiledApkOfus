package androidx.appcompat.widget;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x2 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f584a;

    public x2(SearchView this$0) {
        this.f584a = this$0;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View v2, boolean hasFocus) {
        SearchView searchView = this.f584a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, hasFocus);
        }
    }
}
