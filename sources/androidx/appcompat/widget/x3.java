package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import d.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class x3 extends a {

    /* renamed from: b  reason: collision with root package name */
    public int f585b;

    public x3(Context c2, AttributeSet attrs) {
        super(c2, attrs);
        this.f585b = 0;
    }

    public x3(int width, int height) {
        super(width, height);
        this.f585b = 0;
        this.f1579a = 8388627;
    }

    public x3(x3 source) {
        super((a) source);
        this.f585b = 0;
        this.f585b = source.f585b;
    }

    public x3(a source) {
        super(source);
        this.f585b = 0;
    }

    public x3(ViewGroup.MarginLayoutParams source) {
        super(source);
        this.f585b = 0;
        a(source);
    }

    public x3(ViewGroup.LayoutParams source) {
        super(source);
        this.f585b = 0;
    }

    public void a(ViewGroup.MarginLayoutParams source) {
        ((ViewGroup.MarginLayoutParams) this).leftMargin = source.leftMargin;
        ((ViewGroup.MarginLayoutParams) this).topMargin = source.topMargin;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = source.rightMargin;
        ((ViewGroup.MarginLayoutParams) this).bottomMargin = source.bottomMargin;
    }
}
