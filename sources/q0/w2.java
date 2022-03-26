package q0;

import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w2 {

    /* renamed from: a  reason: collision with root package name */
    public final v2 f3254a;

    /* renamed from: b  reason: collision with root package name */
    public u2 f3255b = new u2();

    public w2(v2 callback) {
        this.f3254a = callback;
    }

    public View a(int fromIndex, int toIndex, int preferredBoundFlags, int acceptableBoundFlags) {
        int start = this.f3254a.b();
        int end = this.f3254a.a();
        int next = toIndex > fromIndex ? 1 : -1;
        View acceptableMatch = null;
        for (int i2 = fromIndex; i2 != toIndex; i2 += next) {
            View child = this.f3254a.e(i2);
            int childStart = this.f3254a.d(child);
            int childEnd = this.f3254a.c(child);
            this.f3255b.e(start, end, childStart, childEnd);
            if (preferredBoundFlags != 0) {
                this.f3255b.d();
                this.f3255b.a(preferredBoundFlags);
                if (this.f3255b.b()) {
                    return child;
                }
            }
            if (acceptableBoundFlags != 0) {
                this.f3255b.d();
                this.f3255b.a(acceptableBoundFlags);
                if (this.f3255b.b()) {
                    acceptableMatch = child;
                }
            }
        }
        return acceptableMatch;
    }

    public boolean b(View child, int boundsFlags) {
        this.f3255b.e(this.f3254a.b(), this.f3254a.a(), this.f3254a.d(child), this.f3254a.c(child));
        if (boundsFlags == 0) {
            return false;
        }
        this.f3255b.d();
        this.f3255b.a(boundsFlags);
        return this.f3255b.b();
    }
}
