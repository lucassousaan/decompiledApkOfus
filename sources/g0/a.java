package g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    public final int f2004b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2005c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2006d;

    public a(int originalClickableSpanId, f nodeInfoCompat, int clickableSpanActionId) {
        this.f2004b = originalClickableSpanId;
        this.f2005c = nodeInfoCompat;
        this.f2006d = clickableSpanActionId;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View unused) {
        Bundle arguments = new Bundle();
        arguments.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2004b);
        this.f2005c.N(this.f2006d, arguments);
    }
}
