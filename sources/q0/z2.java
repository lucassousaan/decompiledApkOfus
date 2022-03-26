package q0;

import k.f;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z2 {

    /* renamed from: a  reason: collision with root package name */
    public final n f3285a = new n();

    /* renamed from: b  reason: collision with root package name */
    public final f f3286b = new f();

    public void f() {
        this.f3285a.clear();
        this.f3286b.a();
    }

    public void e(e2 holder, e1 info) {
        x2 record = (x2) this.f3285a.get(holder);
        if (record == null) {
            record = x2.b();
            this.f3285a.put(holder, record);
        }
        record.f3265b = info;
        record.f3264a |= 4;
    }

    public boolean h(e2 holder) {
        x2 record = (x2) this.f3285a.get(holder);
        return (record == null || (record.f3264a & 1) == 0) ? false : true;
    }

    public e1 n(e2 vh) {
        return l(vh, 4);
    }

    public e1 m(e2 vh) {
        return l(vh, 8);
    }

    public final e1 l(e2 vh, int flag) {
        x2 record;
        e1 info;
        int index = this.f3285a.f(vh);
        if (index >= 0 && (record = (x2) this.f3285a.l(index)) != null) {
            int i2 = record.f3264a;
            if ((i2 & flag) != 0) {
                int i3 = (~flag) & i2;
                record.f3264a = i3;
                if (flag == 4) {
                    info = record.f3265b;
                } else if (flag == 8) {
                    info = record.f3266c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f3285a.j(index);
                    x2.c(record);
                }
                return info;
            }
        }
        return null;
    }

    public void c(long key, e2 holder) {
        this.f3286b.g(key, holder);
    }

    public void a(e2 holder, e1 info) {
        x2 record = (x2) this.f3285a.get(holder);
        if (record == null) {
            record = x2.b();
            this.f3285a.put(holder, record);
        }
        record.f3264a |= 2;
        record.f3265b = info;
    }

    public boolean i(e2 viewHolder) {
        x2 record = (x2) this.f3285a.get(viewHolder);
        return (record == null || (record.f3264a & 4) == 0) ? false : true;
    }

    public e2 g(long key) {
        return (e2) this.f3286b.d(key);
    }

    public void d(e2 holder, e1 info) {
        x2 record = (x2) this.f3285a.get(holder);
        if (record == null) {
            record = x2.b();
            this.f3285a.put(holder, record);
        }
        record.f3266c = info;
        record.f3264a |= 8;
    }

    public void b(e2 holder) {
        x2 record = (x2) this.f3285a.get(holder);
        if (record == null) {
            record = x2.b();
            this.f3285a.put(holder, record);
        }
        record.f3264a |= 1;
    }

    public void p(e2 holder) {
        x2 record = (x2) this.f3285a.get(holder);
        if (record != null) {
            record.f3264a &= -2;
        }
    }

    public void o(y2 callback) {
        for (int index = this.f3285a.size() - 1; index >= 0; index--) {
            e2 viewHolder = (e2) this.f3285a.i(index);
            x2 record = (x2) this.f3285a.j(index);
            int i2 = record.f3264a;
            if ((i2 & 3) == 3) {
                ((u0) callback).d(viewHolder);
            } else if ((i2 & 1) != 0) {
                e1 e1Var = record.f3265b;
                if (e1Var == null) {
                    ((u0) callback).d(viewHolder);
                } else {
                    ((u0) callback).b(viewHolder, e1Var, record.f3266c);
                }
            } else if ((i2 & 14) == 14) {
                ((u0) callback).a(viewHolder, record.f3265b, record.f3266c);
            } else if ((i2 & 12) == 12) {
                ((u0) callback).c(viewHolder, record.f3265b, record.f3266c);
            } else if ((i2 & 4) != 0) {
                ((u0) callback).b(viewHolder, record.f3265b, null);
            } else if ((i2 & 8) != 0) {
                ((u0) callback).a(viewHolder, record.f3265b, record.f3266c);
            }
            x2.c(record);
        }
    }

    public void q(e2 holder) {
        int i2 = this.f3286b.j() - 1;
        while (true) {
            if (i2 < 0) {
                break;
            } else if (holder == this.f3286b.k(i2)) {
                this.f3286b.i(i2);
                break;
            } else {
                i2--;
            }
        }
        x2 info = (x2) this.f3285a.remove(holder);
        if (info != null) {
            x2.c(info);
        }
    }

    public void j() {
        x2.a();
    }

    public void k(e2 viewHolder) {
        p(viewHolder);
    }
}
