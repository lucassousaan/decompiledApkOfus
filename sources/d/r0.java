package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.p3;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.y;
import androidx.appcompat.widget.z;
import c.a;
import f0.c1;
import g.e;
import java.lang.reflect.Constructor;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f1723b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1724c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f1725d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    public static final n f1726e = new n();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f1727a = new Object[2];

    public final View q(View parent, String name, Context context, AttributeSet attrs, boolean inheritContext, boolean readAndroidTheme, boolean readAppTheme, boolean wrapContext) {
        View view;
        if (inheritContext && parent != null) {
            context = parent.getContext();
        }
        if (readAndroidTheme || readAppTheme) {
            context = t(context, attrs, readAndroidTheme, readAppTheme);
        }
        if (wrapContext) {
            context = p3.b(context);
        }
        char c2 = 65535;
        switch (name.hashCode()) {
            case -1946472170:
                if (name.equals("RatingBar")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1455429095:
                if (name.equals("CheckedTextView")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (name.equals("MultiAutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -938935918:
                if (name.equals("TextView")) {
                    c2 = 0;
                    break;
                }
                break;
            case -937446323:
                if (name.equals("ImageButton")) {
                    c2 = 5;
                    break;
                }
                break;
            case -658531749:
                if (name.equals("SeekBar")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -339785223:
                if (name.equals("Spinner")) {
                    c2 = 4;
                    break;
                }
                break;
            case 776382189:
                if (name.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (name.equals("ToggleButton")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 1125864064:
                if (name.equals("ImageView")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1413872058:
                if (name.equals("AutoCompleteTextView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (name.equals("CheckBox")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1666676343:
                if (name.equals("EditText")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2001146706:
                if (name.equals("Button")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view = n(context, attrs);
                u(view, name);
                break;
            case 1:
                view = h(context, attrs);
                u(view, name);
                break;
            case 2:
                view = c(context, attrs);
                u(view, name);
                break;
            case 3:
                view = f(context, attrs);
                u(view, name);
                break;
            case 4:
                view = m(context, attrs);
                u(view, name);
                break;
            case 5:
                view = g(context, attrs);
                u(view, name);
                break;
            case 6:
                view = d(context, attrs);
                u(view, name);
                break;
            case 7:
                view = j(context, attrs);
                u(view, name);
                break;
            case '\b':
                view = e(context, attrs);
                u(view, name);
                break;
            case '\t':
                view = b(context, attrs);
                u(view, name);
                break;
            case '\n':
                view = i(context, attrs);
                u(view, name);
                break;
            case 11:
                view = k(context, attrs);
                u(view, name);
                break;
            case '\f':
                view = l(context, attrs);
                u(view, name);
                break;
            case '\r':
                view = o(context, attrs);
                u(view, name);
                break;
            default:
                p();
                view = null;
                break;
        }
        if (view == null && context != context) {
            view = s(context, name, attrs);
        }
        if (view != null) {
            a(view, attrs);
        }
        return view;
    }

    public j1 n(Context context, AttributeSet attrs) {
        return new j1(context, attrs);
    }

    public i0 h(Context context, AttributeSet attrs) {
        return new i0(context, attrs);
    }

    public y c(Context context, AttributeSet attrs) {
        return new y(context, attrs);
    }

    public e0 f(Context context, AttributeSet attrs) {
        return new e0(context, attrs);
    }

    public e1 m(Context context, AttributeSet attrs) {
        return new e1(context, attrs);
    }

    public g0 g(Context context, AttributeSet attrs) {
        return new g0(context, attrs);
    }

    public z d(Context context, AttributeSet attrs) {
        return new z(context, attrs);
    }

    public m0 j(Context context, AttributeSet attrs) {
        return new m0(context, attrs);
    }

    public a0 e(Context context, AttributeSet attrs) {
        return new a0(context, attrs);
    }

    public w b(Context context, AttributeSet attrs) {
        return new w(context, attrs);
    }

    public j0 i(Context context, AttributeSet attrs) {
        return new j0(context, attrs);
    }

    public n0 k(Context context, AttributeSet attrs) {
        return new n0(context, attrs);
    }

    public androidx.appcompat.widget.r0 l(Context context, AttributeSet attrs) {
        return new androidx.appcompat.widget.r0(context, attrs);
    }

    public o1 o(Context context, AttributeSet attrs) {
        return new o1(context, attrs);
    }

    public final void u(View view, String name) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + name + ">, but returned null");
        }
    }

    public View p() {
        return null;
    }

    public final View s(Context context, String name, AttributeSet attrs) {
        if (name.equals("view")) {
            name = attrs.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f1727a;
            objArr[0] = context;
            objArr[1] = attrs;
            if (-1 != name.indexOf(46)) {
                return r(context, name, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f1725d;
                if (i2 >= strArr.length) {
                    return null;
                }
                View view = r(context, name, strArr[i2]);
                if (view != null) {
                    return view;
                }
                i2++;
            }
        } catch (Exception e2) {
            return null;
        } finally {
            Object[] objArr2 = this.f1727a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void a(View view, AttributeSet attrs) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && c1.L(view)) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, f1724c);
            String handlerName = a2.getString(0);
            if (handlerName != null) {
                view.setOnClickListener(new q0(view, handlerName));
            }
            a2.recycle();
        }
    }

    public final View r(Context context, String name, String prefix) {
        String str;
        n nVar = f1726e;
        Constructor constructor = (Constructor) nVar.get(name);
        if (constructor == null) {
            if (prefix != null) {
                try {
                    str = prefix + name;
                } catch (Exception e2) {
                    return null;
                }
            } else {
                str = name;
            }
            constructor = Class.forName(str, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1723b);
            nVar.put(name, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1727a);
    }

    public static Context t(Context context, AttributeSet attrs, boolean useAndroidTheme, boolean useAppTheme) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f1190x, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            int[] iArr = a.f1167a;
            themeId = a2.getResourceId(0, 0);
        }
        if (useAppTheme && themeId == 0) {
            int[] iArr2 = a.f1167a;
            themeId = a2.getResourceId(4, 0);
            if (themeId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        a2.recycle();
        if (themeId == 0) {
            return context;
        }
        if (!(context instanceof e) || ((e) context).c() != themeId) {
            return new e(context, themeId);
        }
        return context;
    }
}
