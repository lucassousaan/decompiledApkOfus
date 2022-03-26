package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public int f1579a;

    public a(Context c2, AttributeSet attrs) {
        super(c2, attrs);
        this.f1579a = 0;
        TypedArray a2 = c2.obtainStyledAttributes(attrs, c.a.f1168b);
        int[] iArr = c.a.f1167a;
        this.f1579a = a2.getInt(0, 0);
        a2.recycle();
    }

    public a(int width, int height) {
        super(width, height);
        this.f1579a = 0;
        this.f1579a = 8388627;
    }

    public a(a source) {
        super((ViewGroup.MarginLayoutParams) source);
        this.f1579a = 0;
        this.f1579a = source.f1579a;
    }

    public a(ViewGroup.LayoutParams source) {
        super(source);
        this.f1579a = 0;
    }
}
