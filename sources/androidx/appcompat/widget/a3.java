package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a3 implements View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f232b;

    public a3(SearchView this$0) {
        this.f232b = this$0;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        SearchView searchView = this.f232b;
        if (searchView.f172g0 == null) {
            return false;
        }
        if (searchView.f182q.isPopupShowing() && this.f232b.f182q.getListSelection() != -1) {
            return this.f232b.X(keyCode, event);
        }
        if (this.f232b.f182q.b() || !event.hasNoModifiers() || event.getAction() != 1 || keyCode != 66) {
            return false;
        }
        v2.cancelLongPress();
        SearchView searchView2 = this.f232b;
        searchView2.P(0, null, searchView2.f182q.getText().toString());
        return true;
    }
}
