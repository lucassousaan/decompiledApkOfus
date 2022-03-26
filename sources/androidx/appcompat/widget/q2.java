package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.example.helloworld.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k.f;
import k.n;
import k.o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t0.b;
import v.d;
import y.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: i  reason: collision with root package name */
    public static q2 f499i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f501a;

    /* renamed from: b  reason: collision with root package name */
    public n f502b;

    /* renamed from: c  reason: collision with root package name */
    public o f503c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f504d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f505e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f506f;

    /* renamed from: g  reason: collision with root package name */
    public p2 f507g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f498h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final n2 f500j = new n2(6);

    public static synchronized q2 g() {
        q2 q2Var;
        synchronized (q2.class) {
            if (f499i == null) {
                q2 q2Var2 = new q2();
                f499i = q2Var2;
                o(q2Var2);
            }
            q2Var = f499i;
        }
        return q2Var;
    }

    public static void o(q2 manager) {
    }

    public synchronized void s(p2 hooks) {
        this.f507g = hooks;
    }

    public synchronized Drawable i(Context context, int resId) {
        return j(context, resId, false);
    }

    public synchronized Drawable j(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        c(context);
        drawable = q(context, resId);
        if (drawable == null) {
            drawable = e(context, resId);
        }
        if (drawable == null) {
            drawable = d.b(context, resId);
        }
        if (drawable != null) {
            drawable = t(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            s1.b(drawable);
        }
        return drawable;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>> */
    public synchronized void r(Context context) {
        f fVar = (f) this.f504d.get(context);
        if (fVar != null) {
            fVar.a();
        }
    }

    public static long d(TypedValue tv) {
        return (tv.assetCookie << 32) | tv.data;
    }

    public final Drawable e(Context context, int resId) {
        if (this.f505e == null) {
            this.f505e = new TypedValue();
        }
        TypedValue tv = this.f505e;
        context.getResources().getValue(resId, tv, true);
        long key = d(tv);
        Drawable dr = h(context, key);
        if (dr != null) {
            return dr;
        }
        p2 p2Var = this.f507g;
        Drawable dr2 = p2Var == null ? null : ((c0) p2Var).f(this, context, resId);
        if (dr2 != null) {
            dr2.setChangingConfigurations(tv.changingConfigurations);
            a(context, key, dr2);
        }
        return dr2;
    }

    public final Drawable t(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = l(context, resId);
        if (tintList != null) {
            if (s1.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = a.l(drawable);
            a.i(drawable2, tintList);
            PorterDuff.Mode tintMode = n(resId);
            if (tintMode == null) {
                return drawable2;
            }
            a.j(drawable2, tintMode);
            return drawable2;
        }
        p2 p2Var = this.f507g;
        if (p2Var != null && ((c0) p2Var).l(context, resId, drawable)) {
            return drawable;
        }
        boolean tinted = v(context, resId, drawable);
        if (tinted || !failIfNotKnown) {
            return drawable;
        }
        return null;
    }

    public final Drawable q(Context context, int resId) {
        int type;
        n nVar = this.f502b;
        if (nVar == null || nVar.isEmpty()) {
            return null;
        }
        o oVar = this.f503c;
        if (oVar != null) {
            String cachedTagName = (String) oVar.e(resId);
            if ("appcompat_skip_skip".equals(cachedTagName) || (cachedTagName != null && this.f502b.get(cachedTagName) == null)) {
                return null;
            }
        } else {
            this.f503c = new o();
        }
        if (this.f505e == null) {
            this.f505e = new TypedValue();
        }
        TypedValue tv = this.f505e;
        Resources res = context.getResources();
        res.getValue(resId, tv, true);
        long key = d(tv);
        Drawable dr = h(context, key);
        if (dr != null) {
            return dr;
        }
        CharSequence charSequence = tv.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlPullParser parser = res.getXml(resId);
                AttributeSet attrs = Xml.asAttributeSet(parser);
                while (true) {
                    type = parser.next();
                    if (type == 2 || type == 1) {
                        break;
                    }
                }
                if (type == 2) {
                    String tagName = parser.getName();
                    this.f503c.a(resId, tagName);
                    o2 delegate = (o2) this.f502b.get(tagName);
                    if (delegate != null) {
                        dr = delegate.a(context, parser, attrs, context.getTheme());
                    }
                    if (dr != null) {
                        dr.setChangingConfigurations(tv.changingConfigurations);
                        a(context, key, dr);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (dr == null) {
            this.f503c.a(resId, "appcompat_skip_skip");
        }
        return dr;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>> */
    public final synchronized Drawable h(Context context, long key) {
        f fVar = (f) this.f504d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> wr = (WeakReference) fVar.d(key);
        if (wr != null) {
            Drawable.ConstantState entry = wr.get();
            if (entry != null) {
                return entry.newDrawable(context.getResources());
            }
            fVar.h(key);
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: k.f != androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>> */
    public final synchronized boolean a(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        f fVar = (f) this.f504d.get(context);
        if (fVar == null) {
            fVar = new f();
            this.f504d.put(context, fVar);
        }
        fVar.g(key, new WeakReference(cs));
        return true;
    }

    public boolean v(Context context, int resId, Drawable drawable) {
        p2 p2Var = this.f507g;
        return p2Var != null && ((c0) p2Var).m(context, resId, drawable);
    }

    public PorterDuff.Mode n(int resId) {
        p2 p2Var = this.f507g;
        if (p2Var == null) {
            return null;
        }
        return ((c0) p2Var).j(resId);
    }

    public synchronized ColorStateList l(Context context, int resId) {
        ColorStateList tint;
        tint = m(context, resId);
        if (tint == null) {
            p2 p2Var = this.f507g;
            tint = p2Var == null ? null : ((c0) p2Var).i(context, resId);
            if (tint != null) {
                b(context, resId, tint);
            }
        }
        return tint;
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<android.content.res.ColorStateList> */
    public final ColorStateList m(Context context, int resId) {
        o oVar;
        WeakHashMap weakHashMap = this.f501a;
        if (weakHashMap == null || (oVar = (o) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) oVar.e(resId);
    }

    /* JADX WARN: Generic types in debug info not equals: k.o != androidx.collection.SparseArrayCompat<android.content.res.ColorStateList> */
    public final void b(Context context, int resId, ColorStateList tintList) {
        if (this.f501a == null) {
            this.f501a = new WeakHashMap();
        }
        o oVar = (o) this.f501a.get(context);
        if (oVar == null) {
            oVar = new o();
            this.f501a.put(context, oVar);
        }
        oVar.a(resId, tintList);
    }

    public static void u(Drawable drawable, q3 tint, int[] state) {
        if (!s1.a(drawable) || drawable.mutate() == drawable) {
            boolean z2 = tint.f511d;
            if (z2 || tint.f510c) {
                drawable.setColorFilter(f(z2 ? tint.f508a : null, tint.f510c ? tint.f509b : f498h, state));
            } else {
                drawable.clearColorFilter();
            }
        } else {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        }
    }

    public static PorterDuffColorFilter f(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        int color = tint.getColorForState(state, 0);
        return k(color, tintMode);
    }

    public static synchronized PorterDuffColorFilter k(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (q2.class) {
            n2 n2Var = f500j;
            filter = n2Var.i(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                n2Var.j(color, mode, filter);
            }
        }
        return filter;
    }

    public final void c(Context context) {
        if (!this.f506f) {
            this.f506f = true;
            Drawable d2 = i(context, R.drawable.abc_vector_test);
            if (d2 == null || !p(d2)) {
                this.f506f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    public static boolean p(Drawable d2) {
        return (d2 instanceof b) || "android.graphics.drawable.VectorDrawable".equals(d2.getClass().getName());
    }
}
