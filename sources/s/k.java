package s;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f3450a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f3451b = new ThreadLocal();

    public static void c(ViewGroup parent, View descendant, Rect rect) {
        ThreadLocal threadLocal = f3450a;
        Matrix m2 = (Matrix) threadLocal.get();
        if (m2 == null) {
            m2 = new Matrix();
            threadLocal.set(m2);
        } else {
            m2.reset();
        }
        b(parent, descendant, m2);
        ThreadLocal threadLocal2 = f3451b;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        m2.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void a(ViewGroup parent, View descendant, Rect out) {
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        c(parent, descendant, out);
    }

    public static void b(ViewParent target, View view, Matrix m2) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != target) {
            View vp = (View) parent;
            b(target, vp, m2);
            m2.preTranslate(-vp.getScrollX(), -vp.getScrollY());
        }
        m2.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            m2.preConcat(view.getMatrix());
        }
    }
}
