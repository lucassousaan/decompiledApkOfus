package p;

import java.util.ArrayList;
import java.util.Iterator;
import n.f;
import o.b;
import o.g;
import o.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class s {

    /* renamed from: f  reason: collision with root package name */
    public static int f2752f = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2754b;

    /* renamed from: c  reason: collision with root package name */
    public int f2755c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f2753a = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f2756d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2757e = -1;

    public s(int orientation) {
        this.f2754b = -1;
        this.f2755c = 0;
        int i2 = f2752f;
        f2752f = i2 + 1;
        this.f2754b = i2;
        this.f2755c = orientation;
    }

    public int d() {
        return this.f2755c;
    }

    public int c() {
        return this.f2754b;
    }

    public boolean a(g widget) {
        if (this.f2753a.contains(widget)) {
            return false;
        }
        this.f2753a.add(widget);
        return true;
    }

    public void h(boolean isAuthoritative) {
    }

    public final String e() {
        int i2 = this.f2755c;
        if (i2 == 0) {
            return "Horizontal";
        }
        if (i2 == 1) {
            return "Vertical";
        }
        if (i2 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    public String toString() {
        String ret = e() + " [" + this.f2754b + "] <";
        Iterator it = this.f2753a.iterator();
        while (it.hasNext()) {
            g widget = (g) it.next();
            ret = ret + " " + widget.o();
        }
        return ret + " >";
    }

    public void g(int orientation, s widgetGroup) {
        Iterator it = this.f2753a.iterator();
        while (it.hasNext()) {
            g widget = (g) it.next();
            widgetGroup.a(widget);
            if (orientation == 0) {
                widget.f2655m0 = widgetGroup.c();
            } else {
                widget.f2657n0 = widgetGroup.c();
            }
        }
        this.f2757e = widgetGroup.f2754b;
    }

    public int f(f system, int orientation) {
        int count = this.f2753a.size();
        if (count == 0) {
            return 0;
        }
        return j(system, this.f2753a, orientation);
    }

    public final int j(f system, ArrayList arrayList, int orientation) {
        h container = (h) ((g) arrayList.get(0)).F();
        system.D();
        container.d(system, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g widget = (g) arrayList.get(i2);
            widget.d(system, false);
        }
        if (orientation == 0 && container.f2677x0 > 0) {
            b.b(container, system, arrayList, 0);
        }
        if (orientation == 1 && container.f2678y0 > 0) {
            b.b(container, system, arrayList, 1);
        }
        try {
            system.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f2756d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            g widget2 = (g) arrayList.get(i3);
            r result = new r(this, widget2, system, orientation);
            this.f2756d.add(result);
        }
        if (orientation == 0) {
            int left = system.x(container.F);
            int right = system.x(container.H);
            system.D();
            return right - left;
        }
        int top = system.x(container.G);
        int bottom = system.x(container.I);
        system.D();
        return bottom - top;
    }

    public void i(int orientation) {
        this.f2755c = orientation;
    }

    public void b(ArrayList arrayList) {
        int count = this.f2753a.size();
        if (this.f2757e != -1 && count > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                s group = (s) arrayList.get(i2);
                if (this.f2757e == group.f2754b) {
                    g(this.f2755c, group);
                }
            }
        }
        if (count == 0) {
            arrayList.remove(this);
        }
    }
}
