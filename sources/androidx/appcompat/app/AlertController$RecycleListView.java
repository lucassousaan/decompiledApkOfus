package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import c.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final int f62b;

    /* renamed from: c  reason: collision with root package name */
    public final int f63c;

    public AlertController$RecycleListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, a.f1185s);
        int[] iArr = a.f1167a;
        this.f63c = ta.getDimensionPixelOffset(0, -1);
        this.f62b = ta.getDimensionPixelOffset(1, -1);
    }

    public void a(boolean hasTitle, boolean hasButtons) {
        if (!hasButtons || !hasTitle) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = hasTitle ? getPaddingTop() : this.f62b;
            int paddingRight = getPaddingRight();
            int paddingBottom = hasButtons ? getPaddingBottom() : this.f63c;
            setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }
}
