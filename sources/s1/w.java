package s1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f3533b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f3534c;

    public w(z this$0, AutoCompleteTextView autoCompleteTextView) {
        this.f3534c = this$0;
        this.f3533b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v2, MotionEvent event) {
        boolean C;
        if (event.getAction() == 1) {
            C = this.f3534c.C();
            if (C) {
                this.f3534c.f3543i = false;
            }
            this.f3534c.H(this.f3533b);
        }
        return false;
    }
}
