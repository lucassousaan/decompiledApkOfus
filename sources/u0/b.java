package u0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final k.b f3580a;

    /* renamed from: b  reason: collision with root package name */
    public final k.b f3581b;

    /* renamed from: c  reason: collision with root package name */
    public final k.b f3582c;

    public abstract void A(byte[] bArr);

    public abstract void C(CharSequence charSequence);

    public abstract void E(int i2);

    public abstract void G(Parcelable parcelable);

    public abstract void I(String str);

    public abstract void a();

    public abstract b b();

    public abstract boolean g();

    public abstract byte[] i();

    public abstract CharSequence k();

    public abstract boolean m(int i2);

    public abstract int o();

    public abstract Parcelable q();

    public abstract String s();

    public abstract void w(int i2);

    public abstract void y(boolean z2);

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.Class> */
    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> */
    public b(k.b bVar, k.b bVar2, k.b bVar3) {
        this.f3580a = bVar;
        this.f3581b = bVar2;
        this.f3582c = bVar3;
    }

    public boolean f() {
        return false;
    }

    public void x() {
    }

    public void z(boolean val, int fieldId) {
        w(fieldId);
        y(val);
    }

    public void B(byte[] b2, int fieldId) {
        w(fieldId);
        A(b2);
    }

    public void D(CharSequence val, int fieldId) {
        w(fieldId);
        C(val);
    }

    public void F(int val, int fieldId) {
        w(fieldId);
        E(val);
    }

    public void J(String val, int fieldId) {
        w(fieldId);
        I(val);
    }

    public void H(Parcelable p2, int fieldId) {
        w(fieldId);
        G(p2);
    }

    public boolean h(boolean def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return g();
    }

    public int p(int def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return o();
    }

    public String t(String def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return s();
    }

    public byte[] j(byte[] def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return i();
    }

    public Parcelable r(Parcelable parcelable, int fieldId) {
        if (!m(fieldId)) {
            return parcelable;
        }
        return q();
    }

    public CharSequence l(CharSequence def, int fieldId) {
        if (!m(fieldId)) {
            return def;
        }
        return k();
    }

    public void M(d p2, int fieldId) {
        w(fieldId);
        L(p2);
    }

    public void L(d p2) {
        if (p2 == null) {
            I(null);
            return;
        }
        N(p2);
        b subParcel = b();
        K(p2, subParcel);
        subParcel.a();
    }

    public final void N(d p2) {
        try {
            Class name = c(p2.getClass());
            I(name.getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(p2.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    public d v(d dVar, int fieldId) {
        if (!m(fieldId)) {
            return dVar;
        }
        return u();
    }

    public d u() {
        String name = s();
        if (name == null) {
            return null;
        }
        return n(name, b());
    }

    public d n(String parcelCls, b versionedParcel) {
        try {
            Method m2 = d(parcelCls);
            return (d) m2.invoke(null, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public void K(d dVar, b versionedParcel) {
        try {
            Method m2 = e(dVar.getClass());
            m2.invoke(null, dVar, versionedParcel);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public final Method d(String parcelCls) {
        Method m2 = (Method) this.f3580a.get(parcelCls);
        if (m2 != null) {
            return m2;
        }
        System.currentTimeMillis();
        Class cls = Class.forName(parcelCls, true, b.class.getClassLoader());
        Method m3 = cls.getDeclaredMethod("read", b.class);
        this.f3580a.put(parcelCls, m3);
        return m3;
    }

    public final Method e(Class baseCls) {
        Method m2 = (Method) this.f3581b.get(baseCls.getName());
        if (m2 != null) {
            return m2;
        }
        Class cls = c(baseCls);
        System.currentTimeMillis();
        Method m3 = cls.getDeclaredMethod("write", baseCls, b.class);
        this.f3581b.put(baseCls.getName(), m3);
        return m3;
    }

    public final Class c(Class cls) {
        Class ret = (Class) this.f3582c.get(cls.getName());
        if (ret != null) {
            return ret;
        }
        String pkg = cls.getPackage().getName();
        String c2 = String.format("%s.%sParcelizer", pkg, cls.getSimpleName());
        Class ret2 = Class.forName(c2, false, cls.getClassLoader());
        this.f3582c.put(cls.getName(), ret2);
        return ret2;
    }
}
