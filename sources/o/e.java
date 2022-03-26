package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.m;
import p.l;
import p.s;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public int f2616b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2617c;

    /* renamed from: d  reason: collision with root package name */
    public final g f2618d;

    /* renamed from: e  reason: collision with root package name */
    public final d f2619e;

    /* renamed from: f  reason: collision with root package name */
    public e f2620f;

    /* renamed from: i  reason: collision with root package name */
    public m f2623i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet f2615a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f2621g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2622h = -1;

    public void b(int orientation, ArrayList arrayList, s group) {
        HashSet hashSet = this.f2615a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e anchor = (e) it.next();
                l.a(anchor.f2618d, orientation, arrayList, group);
            }
        }
    }

    public HashSet c() {
        return this.f2615a;
    }

    public boolean l() {
        HashSet hashSet = this.f2615a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean k() {
        HashSet hashSet = this.f2615a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e anchor = (e) it.next();
            e opposite = anchor.f();
            if (opposite.n()) {
                return true;
            }
        }
        return false;
    }

    public void s(int finalValue) {
        this.f2616b = finalValue;
        this.f2617c = true;
    }

    public int d() {
        if (!this.f2617c) {
            return 0;
        }
        return this.f2616b;
    }

    public void q() {
        this.f2617c = false;
        this.f2616b = 0;
    }

    public boolean m() {
        return this.f2617c;
    }

    public e(g owner, d type) {
        this.f2618d = owner;
        this.f2619e = type;
    }

    public m h() {
        return this.f2623i;
    }

    public void r() {
        m mVar = this.f2623i;
        if (mVar == null) {
            this.f2623i = new m(n.l.UNRESTRICTED);
        } else {
            mVar.d();
        }
    }

    public g g() {
        return this.f2618d;
    }

    public d j() {
        return this.f2619e;
    }

    public int e() {
        e eVar;
        if (this.f2618d.N() == 8) {
            return 0;
        }
        if (this.f2622h <= -1 || (eVar = this.f2620f) == null || eVar.f2618d.N() != 8) {
            return this.f2621g;
        }
        return this.f2622h;
    }

    public e i() {
        return this.f2620f;
    }

    public void p() {
        HashSet hashSet;
        e eVar = this.f2620f;
        if (!(eVar == null || (hashSet = eVar.f2615a) == null)) {
            hashSet.remove(this);
            if (this.f2620f.f2615a.size() == 0) {
                this.f2620f.f2615a = null;
            }
        }
        this.f2615a = null;
        this.f2620f = null;
        this.f2621g = 0;
        this.f2622h = -1;
        this.f2617c = false;
        this.f2616b = 0;
    }

    public boolean a(e toAnchor, int margin, int goneMargin, boolean forceConnection) {
        if (toAnchor == null) {
            p();
            return true;
        } else if (!forceConnection && !o(toAnchor)) {
            return false;
        } else {
            this.f2620f = toAnchor;
            if (toAnchor.f2615a == null) {
                toAnchor.f2615a = new HashSet();
            }
            HashSet hashSet = this.f2620f.f2615a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (margin > 0) {
                this.f2621g = margin;
            } else {
                this.f2621g = 0;
            }
            this.f2622h = goneMargin;
            return true;
        }
    }

    public boolean n() {
        return this.f2620f != null;
    }

    public boolean o(e anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        d target = anchor.j();
        d dVar = this.f2619e;
        if (target == dVar) {
            return dVar != d.BASELINE || (anchor.g().R() && g().R());
        }
        switch (dVar.ordinal()) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean isCompatible2 = target == d.LEFT || target == d.RIGHT;
                if (!(anchor.g() instanceof i)) {
                    return isCompatible2;
                }
                if (isCompatible2 || target == d.CENTER_X) {
                    isCompatible = true;
                }
                return isCompatible;
            case 2:
            case 4:
                boolean isCompatible3 = target == d.TOP || target == d.BOTTOM;
                if (!(anchor.g() instanceof i)) {
                    return isCompatible3;
                }
                if (isCompatible3 || target == d.CENTER_Y) {
                    isCompatible = true;
                }
                return isCompatible;
            case 6:
                return (target == d.BASELINE || target == d.CENTER_X || target == d.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f2619e.name());
        }
    }

    public String toString() {
        return this.f2618d.o() + ":" + this.f2619e.toString();
    }

    public final e f() {
        switch (this.f2619e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f2618d.H;
            case 2:
                return this.f2618d.I;
            case 3:
                return this.f2618d.F;
            case 4:
                return this.f2618d.G;
            default:
                throw new AssertionError(this.f2619e.name());
        }
    }
}
