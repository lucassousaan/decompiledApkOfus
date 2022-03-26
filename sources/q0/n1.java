package q0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n1 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public e2 f3142a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3143b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3144c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3145d = false;

    public n1(Context c2, AttributeSet attrs) {
        super(c2, attrs);
    }

    public n1(int width, int height) {
        super(width, height);
    }

    public n1(ViewGroup.MarginLayoutParams source) {
        super(source);
    }

    public n1(ViewGroup.LayoutParams source) {
        super(source);
    }

    public n1(n1 source) {
        super((ViewGroup.LayoutParams) source);
    }

    public boolean d() {
        return this.f3142a.t();
    }

    public boolean c() {
        return this.f3142a.v();
    }

    public boolean b() {
        return this.f3142a.y();
    }

    public int a() {
        return this.f3142a.m();
    }
}
