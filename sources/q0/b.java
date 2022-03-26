package q0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f2961a;

    /* renamed from: b  reason: collision with root package name */
    public int f2962b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2963c;

    /* renamed from: d  reason: collision with root package name */
    public int f2964d;

    public b(int cmd, int positionStart, int itemCount, Object payload) {
        this.f2961a = cmd;
        this.f2962b = positionStart;
        this.f2964d = itemCount;
        this.f2963c = payload;
    }

    public String a() {
        switch (this.f2961a) {
            case 1:
                return "add";
            case 2:
                return "rm";
            case 4:
                return "up";
            case 8:
                return "mv";
            default:
                return "??";
        }
    }

    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f2962b + "c:" + this.f2964d + ",p:" + this.f2963c + "]";
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        b op = (b) o2;
        int i2 = this.f2961a;
        if (i2 != op.f2961a) {
            return false;
        }
        if (i2 == 8 && Math.abs(this.f2964d - this.f2962b) == 1 && this.f2964d == op.f2962b && this.f2962b == op.f2964d) {
            return true;
        }
        if (this.f2964d != op.f2964d || this.f2962b != op.f2962b) {
            return false;
        }
        Object obj = this.f2963c;
        if (obj != null) {
            if (!obj.equals(op.f2963c)) {
                return false;
            }
        } else if (op.f2963c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = this.f2961a;
        return (((result * 31) + this.f2962b) * 31) + this.f2964d;
    }
}
