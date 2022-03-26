package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class u2 implements TextWatcher {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView f545b;

    public u2(SearchView this$0) {
        this.f545b = this$0;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s2, int start, int before, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s2, int start, int before, int after) {
        this.f545b.Y(s2);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s2) {
    }
}
