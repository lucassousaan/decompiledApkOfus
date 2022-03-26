package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class a extends z1 implements j1 {

    /* renamed from: q  reason: collision with root package name */
    public final m1 f696q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f697r;

    /* renamed from: s  reason: collision with root package name */
    public int f698s;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f698s >= 0) {
            sb.append(" #");
            sb.append(this.f698s);
        }
        if (this.f988h != null) {
            sb.append(" ");
            sb.append(this.f988h);
        }
        sb.append("}");
        return sb.toString();
    }

    public void q(String prefix, PrintWriter writer) {
        r(prefix, writer, true);
    }

    public void r(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.f988h);
            writer.print(" mIndex=");
            writer.print(this.f698s);
            writer.print(" mCommitted=");
            writer.println(this.f697r);
            if (this.f986f != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.f986f));
            }
            if (!(this.f982b == 0 && this.f983c == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f982b));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f983c));
            }
            if (!(this.f984d == 0 && this.f985e == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f984d));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f985e));
            }
            if (!(this.f989i == 0 && this.f990j == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.f989i));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.f990j);
            }
            if (!(this.f991k == 0 && this.f992l == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.f991k));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.f992l);
            }
        }
        if (!this.f981a.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            int numOps = this.f981a.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                y1 op = (y1) this.f981a.get(opNum);
                switch (op.f971a) {
                    case 0:
                        cmdStr = "NULL";
                        break;
                    case 1:
                        cmdStr = "ADD";
                        break;
                    case 2:
                        cmdStr = "REPLACE";
                        break;
                    case 3:
                        cmdStr = "REMOVE";
                        break;
                    case 4:
                        cmdStr = "HIDE";
                        break;
                    case 5:
                        cmdStr = "SHOW";
                        break;
                    case 6:
                        cmdStr = "DETACH";
                        break;
                    case 7:
                        cmdStr = "ATTACH";
                        break;
                    case 8:
                        cmdStr = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        cmdStr = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        cmdStr = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        cmdStr = "cmd=" + op.f971a;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.f972b);
                if (full) {
                    if (!(op.f973c == 0 && op.f974d == 0)) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.f973c));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.f974d));
                    }
                    if (op.f975e != 0 || op.f976f != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.f975e));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.f976f));
                    }
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(androidx.fragment.app.m1 r3) {
        /*
            r2 = this;
            androidx.fragment.app.q0 r0 = r3.h0()
            androidx.fragment.app.r0 r1 = r3.j0()
            if (r1 == 0) goto L_0x0017
            androidx.fragment.app.r0 r1 = r3.j0()
            android.content.Context r1 = r1.k()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f698s = r0
            r2.f696q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.m1):void");
    }

    @Override // androidx.fragment.app.z1
    public void j(int containerViewId, f0 fragment, String tag, int opcmd) {
        super.j(containerViewId, fragment, tag, opcmd);
        fragment.f777t = this.f696q;
    }

    @Override // androidx.fragment.app.z1
    public z1 k(f0 fragment) {
        m1 m1Var = fragment.f777t;
        if (m1Var == null || m1Var == this.f696q) {
            super.k(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void o(int amt) {
        if (this.f987g) {
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + amt);
            }
            int numOps = this.f981a.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                y1 op = (y1) this.f981a.get(opNum);
                f0 f0Var = op.f972b;
                if (f0Var != null) {
                    f0Var.f776s += amt;
                    if (m1.v0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f972b + " to " + op.f972b.f776s);
                    }
                }
            }
        }
    }

    public void x() {
        if (this.f996p != null) {
            for (int i2 = 0; i2 < this.f996p.size(); i2++) {
                ((Runnable) this.f996p.get(i2)).run();
            }
            this.f996p = null;
        }
    }

    @Override // androidx.fragment.app.z1
    public int e() {
        return p(false);
    }

    @Override // androidx.fragment.app.z1
    public int f() {
        return p(true);
    }

    @Override // androidx.fragment.app.z1
    public void g() {
        i();
        this.f696q.T(this, false);
    }

    @Override // androidx.fragment.app.z1
    public void h() {
        i();
        this.f696q.T(this, true);
    }

    public int p(boolean allowStateLoss) {
        if (!this.f697r) {
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                l2 logw = new l2("FragmentManager");
                PrintWriter pw = new PrintWriter(logw);
                q("  ", pw);
                pw.close();
            }
            this.f697r = true;
            if (this.f987g) {
                this.f698s = this.f696q.f();
            } else {
                this.f698s = -1;
            }
            this.f696q.Q(this, allowStateLoss);
            return this.f698s;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.j1
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (m1.v0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f987g) {
            return true;
        }
        this.f696q.c(this);
        return true;
    }

    public boolean w(ArrayList arrayList, int startIndex, int endIndex) {
        int thatContainer;
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f981a.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            y1 op = (y1) this.f981a.get(opNum);
            f0 f0Var = op.f972b;
            int container = f0Var != null ? f0Var.f782y : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i2 = startIndex; i2 < endIndex; i2++) {
                    a record = (a) arrayList.get(i2);
                    int numThoseOps = record.f981a.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        y1 thatOp = (y1) record.f981a.get(thoseOpIndex);
                        f0 f0Var2 = thatOp.f972b;
                        if (f0Var2 != null) {
                            thatContainer = f0Var2.f782y;
                        } else {
                            thatContainer = 0;
                        }
                        if (thatContainer == container) {
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    public void s() {
        int numOps = this.f981a.size();
        int opNum = 0;
        while (opNum < numOps) {
            y1 op = (y1) this.f981a.get(opNum);
            f0 f2 = op.f972b;
            if (f2 != null) {
                f2.k1(false);
                f2.j1(this.f986f);
                f2.m1(this.f993m, this.f994n);
            }
            switch (op.f971a) {
                case 1:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.Q0(f2, false);
                    this.f696q.d(f2);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f971a);
                case 3:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.J0(f2);
                    break;
                case 4:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.s0(f2);
                    break;
                case 5:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.Q0(f2, false);
                    this.f696q.U0(f2);
                    break;
                case 6:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.p(f2);
                    break;
                case 7:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.Q0(f2, false);
                    this.f696q.h(f2);
                    break;
                case 8:
                    this.f696q.S0(f2);
                    break;
                case 9:
                    this.f696q.S0(null);
                    break;
                case 10:
                    this.f696q.R0(f2, op.f978h);
                    break;
            }
            opNum = (this.f995o || op.f971a == 1 || f2 != null) ? opNum + 1 : opNum + 1;
        }
    }

    public void t(boolean moveToState) {
        int opNum = this.f981a.size() - 1;
        while (opNum >= 0) {
            y1 op = (y1) this.f981a.get(opNum);
            f0 f2 = op.f972b;
            if (f2 != null) {
                f2.k1(true);
                f2.j1(m1.N0(this.f986f));
                f2.m1(this.f994n, this.f993m);
            }
            switch (op.f971a) {
                case 1:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.Q0(f2, true);
                    this.f696q.J0(f2);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f971a);
                case 3:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.d(f2);
                    break;
                case 4:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.U0(f2);
                    break;
                case 5:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.Q0(f2, true);
                    this.f696q.s0(f2);
                    break;
                case 6:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.h(f2);
                    break;
                case 7:
                    f2.g1(op.f973c, op.f974d, op.f975e, op.f976f);
                    this.f696q.Q0(f2, true);
                    this.f696q.p(f2);
                    break;
                case 8:
                    this.f696q.S0(null);
                    break;
                case 9:
                    this.f696q.S0(f2);
                    break;
                case 10:
                    this.f696q.R0(f2, op.f977g);
                    break;
            }
            opNum = (this.f995o || op.f971a == 3 || f2 != null) ? opNum - 1 : opNum + (-1);
        }
    }

    public f0 u(ArrayList arrayList, f0 oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f981a.size()) {
            y1 op = (y1) this.f981a.get(opNum);
            switch (op.f971a) {
                case 1:
                case 7:
                    arrayList.add(op.f972b);
                    break;
                case 2:
                    f0 f2 = op.f972b;
                    int containerId = f2.f782y;
                    boolean alreadyAdded = false;
                    for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                        f0 old = (f0) arrayList.get(i2);
                        if (old.f782y == containerId) {
                            if (old == f2) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f981a.add(opNum, new y1(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                y1 removeOp = new y1(3, old);
                                removeOp.f973c = op.f973c;
                                removeOp.f975e = op.f975e;
                                removeOp.f974d = op.f974d;
                                removeOp.f976f = op.f976f;
                                this.f981a.add(opNum, removeOp);
                                arrayList.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (alreadyAdded) {
                        this.f981a.remove(opNum);
                        opNum--;
                        break;
                    } else {
                        op.f971a = 1;
                        arrayList.add(f2);
                        break;
                    }
                case 3:
                case 6:
                    arrayList.remove(op.f972b);
                    f0 f0Var = op.f972b;
                    if (f0Var == oldPrimaryNav) {
                        this.f981a.add(opNum, new y1(9, f0Var));
                        opNum++;
                        oldPrimaryNav = null;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    this.f981a.add(opNum, new y1(9, oldPrimaryNav));
                    opNum++;
                    oldPrimaryNav = op.f972b;
                    break;
            }
            opNum++;
        }
        return oldPrimaryNav;
    }

    public f0 y(ArrayList arrayList, f0 oldPrimaryNav) {
        for (int opNum = this.f981a.size() - 1; opNum >= 0; opNum--) {
            y1 op = (y1) this.f981a.get(opNum);
            switch (op.f971a) {
                case 1:
                case 7:
                    arrayList.remove(op.f972b);
                    break;
                case 3:
                case 6:
                    arrayList.add(op.f972b);
                    break;
                case 8:
                    oldPrimaryNav = null;
                    break;
                case 9:
                    oldPrimaryNav = op.f972b;
                    break;
                case 10:
                    op.f978h = op.f977g;
                    break;
            }
        }
        return oldPrimaryNav;
    }

    public String v() {
        return this.f988h;
    }
}
