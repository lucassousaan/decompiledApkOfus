package q0;

import e0.e;
import e0.f;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public e f2981a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2982b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2983c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2984d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2985e;

    /* renamed from: f  reason: collision with root package name */
    public final l0 f2986f;

    /* renamed from: g  reason: collision with root package name */
    public int f2987g;

    public c(a callback) {
        this(callback, false);
    }

    public c(a callback, boolean disableRecycler) {
        this.f2981a = new f(30);
        this.f2982b = new ArrayList();
        this.f2983c = new ArrayList();
        this.f2987g = 0;
        this.f2984d = callback;
        this.f2985e = disableRecycler;
        this.f2986f = new l0(this);
    }

    public void u() {
        t(this.f2982b);
        t(this.f2983c);
        this.f2987g = 0;
    }

    public void r() {
        this.f2986f.b(this.f2982b);
        int count = this.f2982b.size();
        for (int i2 = 0; i2 < count; i2++) {
            b op = (b) this.f2982b.get(i2);
            switch (op.f2961a) {
                case 1:
                    a(op);
                    break;
                case 2:
                    d(op);
                    break;
                case 4:
                    e(op);
                    break;
                case 8:
                    b(op);
                    break;
            }
        }
        this.f2982b.clear();
    }

    public void g() {
        int count = this.f2983c.size();
        for (int i2 = 0; i2 < count; i2++) {
            ((w0) this.f2984d).i((b) this.f2983c.get(i2));
        }
        t(this.f2983c);
        this.f2987g = 0;
    }

    public final void b(b op) {
        q(op);
    }

    public final void d(b op) {
        int tmpStart = op.f2962b;
        int tmpCount = 0;
        int tmpEnd = op.f2962b + op.f2964d;
        int type = -1;
        int position = op.f2962b;
        while (position < tmpEnd) {
            boolean typeChanged = false;
            e2 vh = ((w0) this.f2984d).b(position);
            if (vh != null || f(position)) {
                if (type == 0) {
                    b newOp = p(2, tmpStart, tmpCount, null);
                    i(newOp);
                    typeChanged = true;
                }
                type = 1;
            } else {
                if (type == 1) {
                    b newOp2 = p(2, tmpStart, tmpCount, null);
                    q(newOp2);
                    typeChanged = true;
                }
                type = 0;
            }
            if (typeChanged) {
                position -= tmpCount;
                tmpEnd -= tmpCount;
                tmpCount = 1;
            } else {
                tmpCount++;
            }
            position++;
        }
        int position2 = op.f2964d;
        if (tmpCount != position2) {
            s(op);
            op = p(2, tmpStart, tmpCount, null);
        }
        if (type == 0) {
            i(op);
        } else {
            q(op);
        }
    }

    public final void e(b op) {
        int tmpStart = op.f2962b;
        int tmpCount = 0;
        int tmpEnd = op.f2962b + op.f2964d;
        int type = -1;
        for (int position = op.f2962b; position < tmpEnd; position++) {
            e2 vh = ((w0) this.f2984d).b(position);
            if (vh != null || f(position)) {
                if (type == 0) {
                    b newOp = p(4, tmpStart, tmpCount, op.f2963c);
                    i(newOp);
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 1;
            } else {
                if (type == 1) {
                    b newOp2 = p(4, tmpStart, tmpCount, op.f2963c);
                    q(newOp2);
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 0;
            }
            tmpCount++;
        }
        int position2 = op.f2964d;
        if (tmpCount != position2) {
            Object payload = op.f2963c;
            s(op);
            op = p(4, tmpStart, tmpCount, payload);
        }
        if (type == 0) {
            i(op);
        } else {
            q(op);
        }
    }

    public final void i(b op) {
        int positionMultiplier;
        int i2 = op.f2961a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int tmpStart = v(op.f2962b, i2);
        int tmpCnt = 1;
        int offsetPositionForPartial = op.f2962b;
        switch (op.f2961a) {
            case 2:
                positionMultiplier = 0;
                break;
            case 3:
            default:
                throw new IllegalArgumentException("op should be remove or update." + op);
            case 4:
                positionMultiplier = 1;
                break;
        }
        for (int p2 = 1; p2 < op.f2964d; p2++) {
            int pos = op.f2962b + (positionMultiplier * p2);
            int updatedPos = v(pos, op.f2961a);
            boolean continuous = false;
            int i3 = op.f2961a;
            continuous = false;
            switch (i3) {
                case 2:
                    if (updatedPos == tmpStart) {
                        continuous = true;
                    }
                    break;
                case 4:
                    if (updatedPos == tmpStart + 1) {
                        continuous = true;
                    }
                    break;
            }
            if (continuous) {
                tmpCnt++;
            } else {
                b tmp = p(i3, tmpStart, tmpCnt, op.f2963c);
                j(tmp, offsetPositionForPartial);
                s(tmp);
                if (op.f2961a == 4) {
                    offsetPositionForPartial += tmpCnt;
                }
                tmpStart = updatedPos;
                tmpCnt = 1;
            }
        }
        Object payload = op.f2963c;
        s(op);
        if (tmpCnt > 0) {
            b tmp2 = p(op.f2961a, tmpStart, tmpCnt, payload);
            j(tmp2, offsetPositionForPartial);
            s(tmp2);
        }
    }

    public void j(b op, int offsetStart) {
        ((w0) this.f2984d).h(op);
        switch (op.f2961a) {
            case 2:
                ((w0) this.f2984d).f(offsetStart, op.f2964d);
                return;
            case 3:
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            case 4:
                ((w0) this.f2984d).c(offsetStart, op.f2964d, op.f2963c);
                return;
        }
    }

    public final int v(int pos, int cmd) {
        int end;
        int start;
        int count = this.f2983c.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            b postponed = (b) this.f2983c.get(i2);
            int i3 = postponed.f2961a;
            if (i3 == 8) {
                int i4 = postponed.f2962b;
                int i5 = postponed.f2964d;
                if (i4 < i5) {
                    start = postponed.f2962b;
                    end = postponed.f2964d;
                } else {
                    start = postponed.f2964d;
                    end = postponed.f2962b;
                }
                if (pos < start || pos > end) {
                    if (pos < i4) {
                        if (cmd == 1) {
                            postponed.f2962b = i4 + 1;
                            postponed.f2964d = i5 + 1;
                        } else if (cmd == 2) {
                            postponed.f2962b = i4 - 1;
                            postponed.f2964d = i5 - 1;
                        }
                    }
                } else if (start == i4) {
                    if (cmd == 1) {
                        postponed.f2964d = i5 + 1;
                    } else if (cmd == 2) {
                        postponed.f2964d = i5 - 1;
                    }
                    pos++;
                } else {
                    if (cmd == 1) {
                        postponed.f2962b = i4 + 1;
                    } else if (cmd == 2) {
                        postponed.f2962b = i4 - 1;
                    }
                    pos--;
                }
            } else {
                int i6 = postponed.f2962b;
                if (i6 <= pos) {
                    if (i3 == 1) {
                        pos -= postponed.f2964d;
                    } else if (i3 == 2) {
                        pos += postponed.f2964d;
                    }
                } else if (cmd == 1) {
                    postponed.f2962b = i6 + 1;
                } else if (cmd == 2) {
                    postponed.f2962b = i6 - 1;
                }
            }
        }
        for (int i7 = this.f2983c.size() - 1; i7 >= 0; i7--) {
            b op = (b) this.f2983c.get(i7);
            if (op.f2961a == 8) {
                int i8 = op.f2964d;
                if (i8 == op.f2962b || i8 < 0) {
                    this.f2983c.remove(i7);
                    s(op);
                }
            } else if (op.f2964d <= 0) {
                this.f2983c.remove(i7);
                s(op);
            }
        }
        return pos;
    }

    public final boolean f(int position) {
        int count = this.f2983c.size();
        for (int i2 = 0; i2 < count; i2++) {
            b op = (b) this.f2983c.get(i2);
            int i3 = op.f2961a;
            if (i3 == 8) {
                if (l(op.f2964d, i2 + 1) == position) {
                    return true;
                }
            } else if (i3 == 1) {
                int end = op.f2962b + op.f2964d;
                for (int pos = op.f2962b; pos < end; pos++) {
                    if (l(pos, i2 + 1) == position) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void a(b op) {
        q(op);
    }

    public final void q(b op) {
        this.f2983c.add(op);
        switch (op.f2961a) {
            case 1:
                ((w0) this.f2984d).d(op.f2962b, op.f2964d);
                return;
            case 2:
                ((w0) this.f2984d).g(op.f2962b, op.f2964d);
                return;
            case 4:
                ((w0) this.f2984d).c(op.f2962b, op.f2964d, op.f2963c);
                return;
            case 8:
                ((w0) this.f2984d).e(op.f2962b, op.f2964d);
                return;
            default:
                throw new IllegalArgumentException("Unknown update op type for " + op);
        }
    }

    public boolean n() {
        return this.f2982b.size() > 0;
    }

    public boolean m(int updateTypes) {
        return (this.f2987g & updateTypes) != 0;
    }

    public int k(int position) {
        return l(position, 0);
    }

    public int l(int position, int firstPostponedItem) {
        int count = this.f2983c.size();
        for (int i2 = firstPostponedItem; i2 < count; i2++) {
            b op = (b) this.f2983c.get(i2);
            int i3 = op.f2961a;
            if (i3 == 8) {
                int i4 = op.f2962b;
                if (i4 == position) {
                    position = op.f2964d;
                } else {
                    if (i4 < position) {
                        position--;
                    }
                    if (op.f2964d <= position) {
                        position++;
                    }
                }
            } else {
                int i5 = op.f2962b;
                if (i5 > position) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = op.f2964d;
                    if (position < i5 + i6) {
                        return -1;
                    }
                    position -= i6;
                } else if (i3 == 1) {
                    position += op.f2964d;
                }
            }
        }
        return position;
    }

    public void h() {
        g();
        int count = this.f2982b.size();
        for (int i2 = 0; i2 < count; i2++) {
            b op = (b) this.f2982b.get(i2);
            switch (op.f2961a) {
                case 1:
                    ((w0) this.f2984d).i(op);
                    ((w0) this.f2984d).d(op.f2962b, op.f2964d);
                    break;
                case 2:
                    ((w0) this.f2984d).i(op);
                    ((w0) this.f2984d).f(op.f2962b, op.f2964d);
                    break;
                case 4:
                    ((w0) this.f2984d).i(op);
                    ((w0) this.f2984d).c(op.f2962b, op.f2964d, op.f2963c);
                    break;
                case 8:
                    ((w0) this.f2984d).i(op);
                    ((w0) this.f2984d).e(op.f2962b, op.f2964d);
                    break;
            }
        }
        t(this.f2982b);
        this.f2987g = 0;
    }

    public int c(int position) {
        int size = this.f2982b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b op = (b) this.f2982b.get(i2);
            switch (op.f2961a) {
                case 1:
                    if (op.f2962b <= position) {
                        position += op.f2964d;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    int i3 = op.f2962b;
                    if (i3 <= position) {
                        int i4 = op.f2964d;
                        int end = i3 + i4;
                        if (end <= position) {
                            position -= i4;
                            break;
                        } else {
                            return -1;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    int i5 = op.f2962b;
                    if (i5 == position) {
                        position = op.f2964d;
                        break;
                    } else {
                        if (i5 < position) {
                            position--;
                        }
                        if (op.f2964d <= position) {
                            position++;
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
        return position;
    }

    public boolean o() {
        return !this.f2983c.isEmpty() && !this.f2982b.isEmpty();
    }

    public b p(int cmd, int positionStart, int itemCount, Object payload) {
        b op = (b) this.f2981a.b();
        if (op == null) {
            return new b(cmd, positionStart, itemCount, payload);
        }
        op.f2961a = cmd;
        op.f2962b = positionStart;
        op.f2964d = itemCount;
        op.f2963c = payload;
        return op;
    }

    public void s(b op) {
        if (!this.f2985e) {
            op.f2963c = null;
            this.f2981a.a(op);
        }
    }

    public void t(List list) {
        int count = list.size();
        for (int i2 = 0; i2 < count; i2++) {
            s((b) list.get(i2));
        }
        list.clear();
    }
}
