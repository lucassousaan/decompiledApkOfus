package h;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import g.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w extends FrameLayout implements d {

    /* renamed from: b  reason: collision with root package name */
    public final CollapsibleActionView f2208b;

    public w(View actionView) {
        super(actionView.getContext());
        this.f2208b = (CollapsibleActionView) actionView;
        addView(actionView);
    }

    @Override // g.d
    public void a() {
        this.f2208b.onActionViewExpanded();
    }

    @Override // g.d
    public void e() {
        this.f2208b.onActionViewCollapsed();
    }

    public View b() {
        return (View) this.f2208b;
    }
}
