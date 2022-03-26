package l1;

import android.content.Context;
import android.text.TextPaint;
import e1.e;
import java.lang.ref.WeakReference;
import n1.g;
import n1.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: c  reason: collision with root package name */
    public float f2458c;

    /* renamed from: f  reason: collision with root package name */
    public g f2461f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f2456a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final i f2457b = new m(this);

    /* renamed from: d  reason: collision with root package name */
    public boolean f2459d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f2460e = new WeakReference(null);

    public o(n delegate) {
        g(delegate);
    }

    public void g(n delegate) {
        this.f2460e = new WeakReference(delegate);
    }

    public TextPaint e() {
        return this.f2456a;
    }

    public void i(boolean dirty) {
        this.f2459d = dirty;
    }

    public float f(String text) {
        if (!this.f2459d) {
            return this.f2458c;
        }
        float c2 = c(text);
        this.f2458c = c2;
        this.f2459d = false;
        return c2;
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f2456a.measureText(charSequence, 0, charSequence.length());
    }

    public g d() {
        return this.f2461f;
    }

    public void h(g textAppearance, Context context) {
        if (this.f2461f != textAppearance) {
            this.f2461f = textAppearance;
            if (textAppearance != null) {
                textAppearance.k(context, this.f2456a, this.f2457b);
                n textDrawableDelegate = (n) this.f2460e.get();
                if (textDrawableDelegate != null) {
                    this.f2456a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.j(context, this.f2456a, this.f2457b);
                this.f2459d = true;
            }
            n textDrawableDelegate2 = (n) this.f2460e.get();
            if (textDrawableDelegate2 != null) {
                ((e) textDrawableDelegate2).q1();
                ((e) textDrawableDelegate2).onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void j(Context context) {
        this.f2461f.j(context, this.f2456a, this.f2457b);
    }
}
