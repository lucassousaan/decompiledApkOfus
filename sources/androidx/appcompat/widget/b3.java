package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b3 implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f264a;

    public b3(SearchView this$0) {
        this.f264a = this$0;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView v2, int actionId, KeyEvent event) {
        this.f264a.W();
        return true;
    }
}
