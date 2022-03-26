package l1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import f0.b;
import g0.f;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f2397d;

    public a(CheckableImageButton this$0) {
        this.f2397d = this$0;
    }

    @Override // f0.b
    public void f(View host, AccessibilityEvent event) {
        super.f(host, event);
        event.setChecked(this.f2397d.isChecked());
    }

    @Override // f0.b
    public void g(View host, f info) {
        super.g(host, info);
        info.U(this.f2397d.a());
        info.V(this.f2397d.isChecked());
    }
}
