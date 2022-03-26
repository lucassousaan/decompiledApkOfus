package q0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import f0.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q extends i2 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f3166s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f3167h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f3168i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f3169j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f3170k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f3171l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f3172m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f3173n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f3174o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f3175p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f3176q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f3177r = new ArrayList();

    @Override // q0.f1
    public void u() {
        boolean removalsPending = !this.f3167h.isEmpty();
        boolean movesPending = !this.f3169j.isEmpty();
        boolean changesPending = !this.f3170k.isEmpty();
        boolean additionsPending = !this.f3168i.isEmpty();
        if (removalsPending || movesPending || additionsPending || changesPending) {
            Iterator it = this.f3167h.iterator();
            while (it.hasNext()) {
                e2 holder = (e2) it.next();
                T(holder);
            }
            this.f3167h.clear();
            if (movesPending) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = new ArrayList<>();
                moves.addAll(this.f3169j);
                this.f3172m.add(moves);
                this.f3169j.clear();
                Runnable mover = new g(this, moves);
                if (removalsPending) {
                    View view = ((p) moves.get(0)).f3156a.f3018a;
                    c1.e0(view, mover, o());
                } else {
                    mover.run();
                }
            }
            if (changesPending) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = new ArrayList<>();
                changes.addAll(this.f3170k);
                this.f3173n.add(changes);
                this.f3170k.clear();
                Runnable changer = new h(this, changes);
                if (removalsPending) {
                    e2 holder2 = ((o) changes.get(0)).f3147a;
                    c1.e0(holder2.f3018a, changer, o());
                } else {
                    changer.run();
                }
            }
            if (additionsPending) {
                ArrayList<RecyclerView.ViewHolder> additions = new ArrayList<>();
                additions.addAll(this.f3168i);
                this.f3171l.add(additions);
                this.f3168i.clear();
                Runnable adder = new i(this, additions);
                if (removalsPending || movesPending || changesPending) {
                    long changeDuration = 0;
                    long removeDuration = removalsPending ? o() : 0L;
                    long moveDuration = movesPending ? n() : 0L;
                    if (changesPending) {
                        changeDuration = m();
                    }
                    long totalDelay = Math.max(moveDuration, changeDuration) + removeDuration;
                    View view2 = ((e2) additions.get(0)).f3018a;
                    c1.e0(view2, adder, totalDelay);
                    return;
                }
                adder.run();
            }
        }
    }

    @Override // q0.i2
    public boolean z(e2 holder) {
        Z(holder);
        this.f3167h.add(holder);
        return true;
    }

    public final void T(e2 holder) {
        View view = holder.f3018a;
        ViewPropertyAnimator animation = view.animate();
        this.f3176q.add(holder);
        animation.setDuration(o()).alpha(0.0f).setListener(new j(this, holder, animation, view)).start();
    }

    @Override // q0.i2
    public boolean w(e2 holder) {
        Z(holder);
        holder.f3018a.setAlpha(0.0f);
        this.f3168i.add(holder);
        return true;
    }

    public void Q(e2 holder) {
        View view = holder.f3018a;
        ViewPropertyAnimator animation = view.animate();
        this.f3174o.add(holder);
        animation.alpha(1.0f).setDuration(l()).setListener(new k(this, holder, view, animation)).start();
    }

    @Override // q0.i2
    public boolean y(e2 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f3018a;
        int fromX2 = fromX + ((int) holder.f3018a.getTranslationX());
        int fromY2 = fromY + ((int) holder.f3018a.getTranslationY());
        Z(holder);
        int deltaX = toX - fromX2;
        int deltaY = toY - fromY2;
        if (deltaX == 0 && deltaY == 0) {
            E(holder);
            return false;
        }
        if (deltaX != 0) {
            view.setTranslationX(-deltaX);
        }
        if (deltaY != 0) {
            view.setTranslationY(-deltaY);
        }
        this.f3169j.add(new p(holder, fromX2, fromY2, toX, toY));
        return true;
    }

    public void S(e2 holder, int fromX, int fromY, int toX, int toY) {
        View view = holder.f3018a;
        int deltaX = toX - fromX;
        int deltaY = toY - fromY;
        if (deltaX != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaY != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animation = view.animate();
        this.f3175p.add(holder);
        animation.setDuration(n()).setListener(new l(this, holder, deltaX, view, deltaY, animation)).start();
    }

    @Override // q0.i2
    public boolean x(e2 oldHolder, e2 newHolder, int fromX, int fromY, int toX, int toY) {
        if (oldHolder == newHolder) {
            return y(oldHolder, fromX, fromY, toX, toY);
        }
        float prevTranslationX = oldHolder.f3018a.getTranslationX();
        float prevTranslationY = oldHolder.f3018a.getTranslationY();
        float prevAlpha = oldHolder.f3018a.getAlpha();
        Z(oldHolder);
        int deltaX = (int) ((toX - fromX) - prevTranslationX);
        int deltaY = (int) ((toY - fromY) - prevTranslationY);
        oldHolder.f3018a.setTranslationX(prevTranslationX);
        oldHolder.f3018a.setTranslationY(prevTranslationY);
        oldHolder.f3018a.setAlpha(prevAlpha);
        if (newHolder != null) {
            Z(newHolder);
            newHolder.f3018a.setTranslationX(-deltaX);
            newHolder.f3018a.setTranslationY(-deltaY);
            newHolder.f3018a.setAlpha(0.0f);
        }
        this.f3170k.add(new o(oldHolder, newHolder, fromX, fromY, toX, toY));
        return true;
    }

    public void R(o changeInfo) {
        e2 holder = changeInfo.f3147a;
        View newView = null;
        View view = holder == null ? null : holder.f3018a;
        e2 newHolder = changeInfo.f3148b;
        if (newHolder != null) {
            newView = newHolder.f3018a;
        }
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(m());
            this.f3177r.add(changeInfo.f3147a);
            oldViewAnim.translationX(changeInfo.f3151e - changeInfo.f3149c);
            oldViewAnim.translationY(changeInfo.f3152f - changeInfo.f3150d);
            oldViewAnim.alpha(0.0f).setListener(new m(this, changeInfo, oldViewAnim, view)).start();
        }
        if (newView != null) {
            ViewPropertyAnimator newViewAnimation = newView.animate();
            this.f3177r.add(changeInfo.f3148b);
            newViewAnimation.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new n(this, changeInfo, newViewAnimation, newView)).start();
        }
    }

    public final void W(List list, e2 item) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            o changeInfo = (o) list.get(i2);
            if (Y(changeInfo, item) && changeInfo.f3147a == null && changeInfo.f3148b == null) {
                list.remove(changeInfo);
            }
        }
    }

    public final void X(o changeInfo) {
        e2 e2Var = changeInfo.f3147a;
        if (e2Var != null) {
            Y(changeInfo, e2Var);
        }
        e2 e2Var2 = changeInfo.f3148b;
        if (e2Var2 != null) {
            Y(changeInfo, e2Var2);
        }
    }

    public final boolean Y(o changeInfo, e2 item) {
        boolean oldItem = false;
        if (changeInfo.f3148b == item) {
            changeInfo.f3148b = null;
        } else if (changeInfo.f3147a != item) {
            return false;
        } else {
            changeInfo.f3147a = null;
            oldItem = true;
        }
        item.f3018a.setAlpha(1.0f);
        item.f3018a.setTranslationX(0.0f);
        item.f3018a.setTranslationY(0.0f);
        C(item, oldItem);
        return true;
    }

    @Override // q0.f1
    public void j(e2 item) {
        View view = item.f3018a;
        view.animate().cancel();
        int i2 = this.f3169j.size();
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            p moveInfo = (p) this.f3169j.get(i2);
            if (moveInfo.f3156a == item) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(item);
                this.f3169j.remove(i2);
            }
        }
        W(this.f3170k, item);
        if (this.f3167h.remove(item)) {
            view.setAlpha(1.0f);
            G(item);
        }
        if (this.f3168i.remove(item)) {
            view.setAlpha(1.0f);
            A(item);
        }
        for (int i3 = this.f3173n.size() - 1; i3 >= 0; i3--) {
            ArrayList<DefaultItemAnimator.ChangeInfo> changes = (ArrayList) this.f3173n.get(i3);
            W(changes, item);
            if (changes.isEmpty()) {
                this.f3173n.remove(i3);
            }
        }
        for (int i4 = this.f3172m.size() - 1; i4 >= 0; i4--) {
            ArrayList<DefaultItemAnimator.MoveInfo> moves = (ArrayList) this.f3172m.get(i4);
            int j2 = moves.size() - 1;
            while (true) {
                if (j2 >= 0) {
                    p moveInfo2 = (p) moves.get(j2);
                    if (moveInfo2.f3156a == item) {
                        view.setTranslationY(0.0f);
                        view.setTranslationX(0.0f);
                        E(item);
                        moves.remove(j2);
                        if (moves.isEmpty()) {
                            this.f3172m.remove(i4);
                        }
                    } else {
                        j2--;
                    }
                }
            }
        }
        for (int i5 = this.f3171l.size() - 1; i5 >= 0; i5--) {
            ArrayList<RecyclerView.ViewHolder> additions = (ArrayList) this.f3171l.get(i5);
            if (additions.remove(item)) {
                view.setAlpha(1.0f);
                A(item);
                if (additions.isEmpty()) {
                    this.f3171l.remove(i5);
                }
            }
        }
        this.f3176q.remove(item);
        this.f3174o.remove(item);
        this.f3177r.remove(item);
        this.f3175p.remove(item);
        V();
    }

    public final void Z(e2 holder) {
        if (f3166s == null) {
            f3166s = new ValueAnimator().getInterpolator();
        }
        holder.f3018a.animate().setInterpolator(f3166s);
        j(holder);
    }

    @Override // q0.f1
    public boolean p() {
        return !this.f3168i.isEmpty() || !this.f3170k.isEmpty() || !this.f3169j.isEmpty() || !this.f3167h.isEmpty() || !this.f3175p.isEmpty() || !this.f3176q.isEmpty() || !this.f3174o.isEmpty() || !this.f3177r.isEmpty() || !this.f3172m.isEmpty() || !this.f3171l.isEmpty() || !this.f3173n.isEmpty();
    }

    public void V() {
        if (!p()) {
            i();
        }
    }

    @Override // q0.f1
    public void k() {
        int count = this.f3169j.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            p item = (p) this.f3169j.get(i2);
            View view = item.f3156a.f3018a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(item.f3156a);
            this.f3169j.remove(i2);
        }
        int count2 = this.f3167h.size();
        for (int i3 = count2 - 1; i3 >= 0; i3--) {
            G((e2) this.f3167h.get(i3));
            this.f3167h.remove(i3);
        }
        int count3 = this.f3168i.size();
        for (int i4 = count3 - 1; i4 >= 0; i4--) {
            e2 item2 = (e2) this.f3168i.get(i4);
            item2.f3018a.setAlpha(1.0f);
            A(item2);
            this.f3168i.remove(i4);
        }
        int count4 = this.f3170k.size();
        for (int i5 = count4 - 1; i5 >= 0; i5--) {
            X((o) this.f3170k.get(i5));
        }
        this.f3170k.clear();
        if (p()) {
            int listCount = this.f3172m.size();
            for (int i6 = listCount - 1; i6 >= 0; i6--) {
                ArrayList<DefaultItemAnimator.MoveInfo> moves = (ArrayList) this.f3172m.get(i6);
                int count5 = moves.size();
                for (int j2 = count5 - 1; j2 >= 0; j2--) {
                    p moveInfo = (p) moves.get(j2);
                    View view2 = moveInfo.f3156a.f3018a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(moveInfo.f3156a);
                    moves.remove(j2);
                    if (moves.isEmpty()) {
                        this.f3172m.remove(moves);
                    }
                }
            }
            int listCount2 = this.f3171l.size();
            for (int i7 = listCount2 - 1; i7 >= 0; i7--) {
                ArrayList<RecyclerView.ViewHolder> additions = (ArrayList) this.f3171l.get(i7);
                int count6 = additions.size();
                for (int j3 = count6 - 1; j3 >= 0; j3--) {
                    e2 item3 = (e2) additions.get(j3);
                    item3.f3018a.setAlpha(1.0f);
                    A(item3);
                    additions.remove(j3);
                    if (additions.isEmpty()) {
                        this.f3171l.remove(additions);
                    }
                }
            }
            int listCount3 = this.f3173n.size();
            for (int i8 = listCount3 - 1; i8 >= 0; i8--) {
                ArrayList<DefaultItemAnimator.ChangeInfo> changes = (ArrayList) this.f3173n.get(i8);
                int count7 = changes.size();
                for (int j4 = count7 - 1; j4 >= 0; j4--) {
                    X((o) changes.get(j4));
                    if (changes.isEmpty()) {
                        this.f3173n.remove(changes);
                    }
                }
            }
            U(this.f3176q);
            U(this.f3175p);
            U(this.f3174o);
            U(this.f3177r);
            i();
        }
    }

    public void U(List list) {
        for (int i2 = list.size() - 1; i2 >= 0; i2--) {
            ((e2) list.get(i2)).f3018a.animate().cancel();
        }
    }

    @Override // q0.f1
    public boolean g(e2 viewHolder, List list) {
        return !list.isEmpty() || super.g(viewHolder, list);
    }
}
