package q0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public o0 f3010a;

    /* renamed from: b  reason: collision with root package name */
    public int f3011b;

    /* renamed from: c  reason: collision with root package name */
    public int f3012c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3013d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3014e;

    public e0() {
        e();
    }

    public void e() {
        this.f3011b = -1;
        this.f3012c = Integer.MIN_VALUE;
        this.f3013d = false;
        this.f3014e = false;
    }

    public void a() {
        int i2;
        if (this.f3013d) {
            i2 = this.f3010a.i();
        } else {
            i2 = this.f3010a.m();
        }
        this.f3012c = i2;
    }

    public String toString() {
        return "AnchorInfo{mPosition=" + this.f3011b + ", mCoordinate=" + this.f3012c + ", mLayoutFromEnd=" + this.f3013d + ", mValid=" + this.f3014e + '}';
    }

    public boolean d(View child, b2 state) {
        n1 lp = (n1) child.getLayoutParams();
        return !lp.c() && lp.a() >= 0 && lp.a() < state.b();
    }

    public void c(View child, int position) {
        int spaceChange = this.f3010a.o();
        if (spaceChange >= 0) {
            b(child, position);
            return;
        }
        this.f3011b = position;
        if (this.f3013d) {
            int prevLayoutEnd = this.f3010a.i() - spaceChange;
            int childEnd = this.f3010a.d(child);
            int previousEndMargin = prevLayoutEnd - childEnd;
            this.f3012c = this.f3010a.i() - previousEndMargin;
            if (previousEndMargin > 0) {
                int childSize = this.f3010a.e(child);
                int estimatedChildStart = this.f3012c - childSize;
                int layoutStart = this.f3010a.m();
                int previousStartMargin = this.f3010a.g(child) - layoutStart;
                int startReference = Math.min(previousStartMargin, 0) + layoutStart;
                int startMargin = estimatedChildStart - startReference;
                if (startMargin < 0) {
                    this.f3012c += Math.min(previousEndMargin, -startMargin);
                    return;
                }
                return;
            }
            return;
        }
        int childStart = this.f3010a.g(child);
        int startMargin2 = childStart - this.f3010a.m();
        this.f3012c = childStart;
        if (startMargin2 > 0) {
            int estimatedEnd = this.f3010a.e(child) + childStart;
            int previousLayoutEnd = this.f3010a.i() - spaceChange;
            int endReference = this.f3010a.i() - Math.min(0, previousLayoutEnd - this.f3010a.d(child));
            int endMargin = endReference - estimatedEnd;
            if (endMargin < 0) {
                this.f3012c -= Math.min(startMargin2, -endMargin);
            }
        }
    }

    public void b(View child, int position) {
        if (this.f3013d) {
            this.f3012c = this.f3010a.d(child) + this.f3010a.o();
        } else {
            this.f3012c = this.f3010a.g(child);
        }
        this.f3011b = position;
    }
}
