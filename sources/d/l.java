package d;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.ListView;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l extends p0 {

    /* renamed from: d  reason: collision with root package name */
    public final j f1661d = new j(getContext(), this, getWindow());

    public l(Context context, int themeResId) {
        super(context, i(context, themeResId));
    }

    public static int i(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    public ListView g() {
        return this.f1661d.c();
    }

    @Override // d.p0, android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f1661d.l(title);
    }

    @Override // d.p0, android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f1661d.d();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f1661d.e(event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f1661d.f(event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
