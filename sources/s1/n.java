package s1;

import android.widget.AutoCompleteTextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f3513b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f3514c;

    public n(p this$1, AutoCompleteTextView autoCompleteTextView) {
        this.f3514c = this$1;
        this.f3513b = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean isPopupShowing = this.f3513b.isPopupShowing();
        this.f3514c.f3518b.E(isPopupShowing);
        this.f3514c.f3518b.f3543i = isPopupShowing;
    }
}
