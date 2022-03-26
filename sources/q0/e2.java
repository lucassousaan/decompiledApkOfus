package q0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.c1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e2 {

    /* renamed from: s  reason: collision with root package name */
    public static final List f3017s = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final View f3018a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f3019b;

    /* renamed from: j  reason: collision with root package name */
    public int f3027j;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f3035r;

    /* renamed from: c  reason: collision with root package name */
    public int f3020c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3021d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f3022e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f3023f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3024g = -1;

    /* renamed from: h  reason: collision with root package name */
    public e2 f3025h = null;

    /* renamed from: i  reason: collision with root package name */
    public e2 f3026i = null;

    /* renamed from: k  reason: collision with root package name */
    public List f3028k = null;

    /* renamed from: l  reason: collision with root package name */
    public List f3029l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f3030m = 0;

    /* renamed from: n  reason: collision with root package name */
    public t1 f3031n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3032o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f3033p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f3034q = -1;

    public e2(View itemView) {
        if (itemView != null) {
            this.f3018a = itemView;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public void i(int mNewPosition, int offset, boolean applyToPreLayout) {
        b(8);
        A(offset, applyToPreLayout);
        this.f3020c = mNewPosition;
    }

    public void A(int offset, boolean applyToPreLayout) {
        if (this.f3021d == -1) {
            this.f3021d = this.f3020c;
        }
        if (this.f3024g == -1) {
            this.f3024g = this.f3020c;
        }
        if (applyToPreLayout) {
            this.f3024g += offset;
        }
        this.f3020c += offset;
        if (this.f3018a.getLayoutParams() != null) {
            ((n1) this.f3018a.getLayoutParams()).f3144c = true;
        }
    }

    public void c() {
        this.f3021d = -1;
        this.f3024g = -1;
    }

    public void E() {
        if (this.f3021d == -1) {
            this.f3021d = this.f3020c;
        }
    }

    public boolean J() {
        return (this.f3027j & 128) != 0;
    }

    public final int m() {
        int i2 = this.f3024g;
        return i2 == -1 ? this.f3020c : i2;
    }

    public final int j() {
        RecyclerView recyclerView = this.f3035r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.b0(this);
    }

    public final int n() {
        return this.f3021d;
    }

    public final long k() {
        return this.f3022e;
    }

    public final int l() {
        return this.f3023f;
    }

    public boolean w() {
        return this.f3031n != null;
    }

    public void K() {
        this.f3031n.H(this);
    }

    public boolean L() {
        return (this.f3027j & 32) != 0;
    }

    public void e() {
        this.f3027j &= -33;
    }

    public void f() {
        this.f3027j &= -257;
    }

    public void H(t1 recycler, boolean isChangeScrap) {
        this.f3031n = recycler;
        this.f3032o = isChangeScrap;
    }

    public boolean t() {
        return (this.f3027j & 4) != 0;
    }

    public boolean z() {
        return (this.f3027j & 2) != 0;
    }

    public boolean s() {
        return (this.f3027j & 1) != 0;
    }

    public boolean v() {
        return (this.f3027j & 8) != 0;
    }

    public boolean p(int flags) {
        return (this.f3027j & flags) != 0;
    }

    public boolean x() {
        return (this.f3027j & 256) != 0;
    }

    public boolean r() {
        return (this.f3018a.getParent() == null || this.f3018a.getParent() == this.f3035r) ? false : true;
    }

    public boolean q() {
        return (this.f3027j & 512) != 0 || t();
    }

    public void F(int flags, int mask) {
        this.f3027j = (this.f3027j & (~mask)) | (flags & mask);
    }

    public void b(int flags) {
        this.f3027j |= flags;
    }

    public void a(Object payload) {
        if (payload == null) {
            b(1024);
        } else if ((1024 & this.f3027j) == 0) {
            g();
            this.f3028k.add(payload);
        }
    }

    public final void g() {
        if (this.f3028k == null) {
            ArrayList arrayList = new ArrayList();
            this.f3028k = arrayList;
            this.f3029l = Collections.unmodifiableList(arrayList);
        }
    }

    public void d() {
        List list = this.f3028k;
        if (list != null) {
            list.clear();
        }
        this.f3027j &= -1025;
    }

    public List o() {
        if ((this.f3027j & 1024) != 0) {
            return f3017s;
        }
        List list = this.f3028k;
        if (list == null || list.size() == 0) {
            return f3017s;
        }
        return this.f3029l;
    }

    public void D() {
        this.f3027j = 0;
        this.f3020c = -1;
        this.f3021d = -1;
        this.f3022e = -1L;
        this.f3024g = -1;
        this.f3030m = 0;
        this.f3025h = null;
        this.f3026i = null;
        d();
        this.f3033p = 0;
        this.f3034q = -1;
        RecyclerView.r(this);
    }

    public void B(RecyclerView parent) {
        int i2 = this.f3034q;
        if (i2 != -1) {
            this.f3033p = i2;
        } else {
            this.f3033p = c1.y(this.f3018a);
        }
        parent.i1(this, 4);
    }

    public void C(RecyclerView parent) {
        parent.i1(this, this.f3033p);
        this.f3033p = 0;
    }

    public String toString() {
        String className = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(className + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3020c + " id=" + this.f3022e + ", oldPos=" + this.f3021d + ", pLpos:" + this.f3024g);
        if (w()) {
            sb.append(" scrap ");
            sb.append(this.f3032o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (t()) {
            sb.append(" invalid");
        }
        if (!s()) {
            sb.append(" unbound");
        }
        if (z()) {
            sb.append(" update");
        }
        if (v()) {
            sb.append(" removed");
        }
        if (J()) {
            sb.append(" ignored");
        }
        if (x()) {
            sb.append(" tmpDetached");
        }
        if (!u()) {
            sb.append(" not recyclable(" + this.f3030m + ")");
        }
        if (q()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3018a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void G(boolean recyclable) {
        int i2 = this.f3030m;
        int i3 = recyclable ? i2 - 1 : i2 + 1;
        this.f3030m = i3;
        if (i3 < 0) {
            this.f3030m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!recyclable && i3 == 1) {
            this.f3027j |= 16;
        } else if (recyclable && i3 == 0) {
            this.f3027j &= -17;
        }
    }

    public final boolean u() {
        return (this.f3027j & 16) == 0 && !c1.M(this.f3018a);
    }

    public boolean I() {
        return (this.f3027j & 16) != 0;
    }

    public boolean h() {
        return (this.f3027j & 16) == 0 && c1.M(this.f3018a);
    }

    public boolean y() {
        return (this.f3027j & 2) != 0;
    }
}
