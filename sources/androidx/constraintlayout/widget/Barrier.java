package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.a;
import o.g;
import q.c;
import q.r;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class Barrier extends c {

    /* renamed from: j  reason: collision with root package name */
    public int f606j;

    /* renamed from: k  reason: collision with root package name */
    public int f607k;

    /* renamed from: l  reason: collision with root package name */
    public a f608l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f606j;
    }

    public void setType(int type) {
        this.f606j = type;
    }

    public final void n(g widget, int type, boolean isRtl) {
        this.f607k = type;
        if (isRtl) {
            int i2 = this.f606j;
            if (i2 == 5) {
                this.f607k = 1;
            } else if (i2 == 6) {
                this.f607k = 0;
            }
        } else {
            int i3 = this.f606j;
            if (i3 == 5) {
                this.f607k = 0;
            } else if (i3 == 6) {
                this.f607k = 1;
            }
        }
        if (widget instanceof a) {
            a barrier = (a) widget;
            barrier.h1(this.f607k);
        }
    }

    @Override // q.c
    public void g(g widget, boolean isRtl) {
        n(widget, this.f606j, isRtl);
    }

    @Override // q.c
    public void f(AttributeSet attrs) {
        super.f(attrs);
        this.f608l = new a();
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, r.f2945b);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                int[] iArr = r.f2944a;
                if (attr == 15) {
                    setType(a2.getInt(attr, 0));
                } else if (attr == 14) {
                    this.f608l.g1(a2.getBoolean(attr, true));
                } else if (attr == 16) {
                    int margin = a2.getDimensionPixelSize(attr, 0);
                    this.f608l.i1(margin);
                }
            }
            a2.recycle();
        }
        this.f2804e = this.f608l;
        l();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.f608l.g1(supportGone);
    }

    public boolean m() {
        return this.f608l.b1();
    }

    public void setDpMargin(int margin) {
        float density = getResources().getDisplayMetrics().density;
        int px = (int) ((margin * density) + 0.5f);
        this.f608l.i1(px);
    }

    public int getMargin() {
        return this.f608l.d1();
    }

    public void setMargin(int margin) {
        this.f608l.i1(margin);
    }
}
