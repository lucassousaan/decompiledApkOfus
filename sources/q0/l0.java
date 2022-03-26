package q0;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f3104a;

    public l0(k0 callback) {
        this.f3104a = callback;
    }

    public void b(List list) {
        while (true) {
            int badMove = a(list);
            if (badMove != -1) {
                d(list, badMove, badMove + 1);
            } else {
                return;
            }
        }
    }

    public final void d(List list, int badMove, int next) {
        b moveOp = (b) list.get(badMove);
        b nextOp = (b) list.get(next);
        switch (nextOp.f2961a) {
            case 1:
                c(list, badMove, moveOp, next, nextOp);
                return;
            case 2:
                e(list, badMove, moveOp, next, nextOp);
                return;
            case 3:
            default:
                return;
            case 4:
                f(list, badMove, moveOp, next, nextOp);
                return;
        }
    }

    public void e(List list, int movePos, b moveOp, int removePos, b removeOp) {
        boolean moveIsBackwards;
        b extraRm = null;
        boolean revertedMove = false;
        int i2 = moveOp.f2962b;
        int i3 = moveOp.f2964d;
        if (i2 < i3) {
            moveIsBackwards = false;
            if (removeOp.f2962b == i2 && removeOp.f2964d == i3 - i2) {
                revertedMove = true;
            }
        } else {
            moveIsBackwards = true;
            if (removeOp.f2962b == i3 + 1 && removeOp.f2964d == i2 - i3) {
                revertedMove = true;
            }
        }
        int i4 = removeOp.f2962b;
        if (i3 < i4) {
            removeOp.f2962b = i4 - 1;
        } else {
            int i5 = removeOp.f2964d;
            if (i3 < i4 + i5) {
                removeOp.f2964d = i5 - 1;
                moveOp.f2961a = 2;
                moveOp.f2964d = 1;
                if (removeOp.f2964d == 0) {
                    list.remove(removePos);
                    ((c) this.f3104a).s(removeOp);
                    return;
                }
                return;
            }
        }
        int i6 = moveOp.f2962b;
        int i7 = removeOp.f2962b;
        if (i6 <= i7) {
            removeOp.f2962b = i7 + 1;
        } else {
            int i8 = removeOp.f2964d;
            if (i6 < i7 + i8) {
                int remaining = (i7 + i8) - i6;
                extraRm = ((c) this.f3104a).p(2, i6 + 1, remaining, null);
                removeOp.f2964d = moveOp.f2962b - removeOp.f2962b;
            }
        }
        if (revertedMove) {
            list.set(movePos, removeOp);
            list.remove(removePos);
            ((c) this.f3104a).s(moveOp);
            return;
        }
        if (moveIsBackwards) {
            if (extraRm != null) {
                int i9 = moveOp.f2962b;
                if (i9 > extraRm.f2962b) {
                    moveOp.f2962b = i9 - extraRm.f2964d;
                }
                int i10 = moveOp.f2964d;
                if (i10 > extraRm.f2962b) {
                    moveOp.f2964d = i10 - extraRm.f2964d;
                }
            }
            int i11 = moveOp.f2962b;
            if (i11 > removeOp.f2962b) {
                moveOp.f2962b = i11 - removeOp.f2964d;
            }
            int i12 = moveOp.f2964d;
            if (i12 > removeOp.f2962b) {
                moveOp.f2964d = i12 - removeOp.f2964d;
            }
        } else {
            if (extraRm != null) {
                int i13 = moveOp.f2962b;
                if (i13 >= extraRm.f2962b) {
                    moveOp.f2962b = i13 - extraRm.f2964d;
                }
                int i14 = moveOp.f2964d;
                if (i14 >= extraRm.f2962b) {
                    moveOp.f2964d = i14 - extraRm.f2964d;
                }
            }
            int i15 = moveOp.f2962b;
            if (i15 >= removeOp.f2962b) {
                moveOp.f2962b = i15 - removeOp.f2964d;
            }
            int i16 = moveOp.f2964d;
            if (i16 >= removeOp.f2962b) {
                moveOp.f2964d = i16 - removeOp.f2964d;
            }
        }
        list.set(movePos, removeOp);
        if (moveOp.f2962b != moveOp.f2964d) {
            list.set(removePos, moveOp);
        } else {
            list.remove(removePos);
        }
        if (extraRm != null) {
            list.add(movePos, extraRm);
        }
    }

    public final void c(List list, int move, b moveOp, int add, b addOp) {
        int offset = 0;
        int i2 = moveOp.f2964d;
        int i3 = addOp.f2962b;
        if (i2 < i3) {
            offset = 0 - 1;
        }
        int i4 = moveOp.f2962b;
        if (i4 < i3) {
            offset++;
        }
        if (i3 <= i4) {
            moveOp.f2962b = i4 + addOp.f2964d;
        }
        int i5 = addOp.f2962b;
        if (i5 <= i2) {
            moveOp.f2964d = i2 + addOp.f2964d;
        }
        addOp.f2962b = i5 + offset;
        list.set(move, addOp);
        list.set(add, moveOp);
    }

    public void f(List list, int move, b moveOp, int update, b updateOp) {
        b extraUp1 = null;
        b extraUp2 = null;
        int i2 = moveOp.f2964d;
        int i3 = updateOp.f2962b;
        if (i2 < i3) {
            updateOp.f2962b = i3 - 1;
        } else {
            int i4 = updateOp.f2964d;
            if (i2 < i3 + i4) {
                updateOp.f2964d = i4 - 1;
                extraUp1 = ((c) this.f3104a).p(4, moveOp.f2962b, 1, updateOp.f2963c);
            }
        }
        int i5 = moveOp.f2962b;
        int i6 = updateOp.f2962b;
        if (i5 <= i6) {
            updateOp.f2962b = i6 + 1;
        } else {
            int i7 = updateOp.f2964d;
            if (i5 < i6 + i7) {
                int remaining = (i6 + i7) - i5;
                extraUp2 = ((c) this.f3104a).p(4, i5 + 1, remaining, updateOp.f2963c);
                updateOp.f2964d -= remaining;
            }
        }
        list.set(update, moveOp);
        if (updateOp.f2964d > 0) {
            list.set(move, updateOp);
        } else {
            list.remove(move);
            ((c) this.f3104a).s(updateOp);
        }
        if (extraUp1 != null) {
            list.add(move, extraUp1);
        }
        if (extraUp2 != null) {
            list.add(move, extraUp2);
        }
    }

    public final int a(List list) {
        boolean foundNonMove = false;
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            b op1 = (b) list.get(i2);
            if (op1.f2961a != 8) {
                foundNonMove = true;
            } else if (foundNonMove) {
                return i2;
            }
        }
        return -1;
    }
}
