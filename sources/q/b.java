package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f2794a;

    /* renamed from: b  reason: collision with root package name */
    public a f2795b;

    /* renamed from: c  reason: collision with root package name */
    public int f2796c;

    /* renamed from: d  reason: collision with root package name */
    public float f2797d;

    /* renamed from: e  reason: collision with root package name */
    public String f2798e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2799f;

    /* renamed from: g  reason: collision with root package name */
    public int f2800g;

    public b(String name, a attributeType, Object value) {
        this.f2794a = name;
        this.f2795b = attributeType;
        d(value);
    }

    public b(b source, Object value) {
        this.f2794a = source.f2794a;
        this.f2795b = source.f2795b;
        d(value);
    }

    public void d(Object value) {
        switch (this.f2795b.ordinal()) {
            case 0:
                this.f2796c = ((Integer) value).intValue();
                return;
            case 1:
                this.f2797d = ((Float) value).floatValue();
                return;
            case 2:
            case 3:
                this.f2800g = ((Integer) value).intValue();
                return;
            case 4:
                this.f2798e = (String) value;
                return;
            case 5:
                this.f2799f = ((Boolean) value).booleanValue();
                return;
            case 6:
                this.f2797d = ((Float) value).floatValue();
                return;
            default:
                return;
        }
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap<String, ConstraintAttribute> ret = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String name : hashMap.keySet()) {
            b constraintAttribute = (b) hashMap.get(name);
            try {
                if (name.equals("BackgroundColor")) {
                    ColorDrawable viewColor = (ColorDrawable) view.getBackground();
                    Object val = Integer.valueOf(viewColor.getColor());
                    ret.put(name, new b(constraintAttribute, val));
                } else {
                    Method method = cls.getMethod("getMap" + name, new Class[0]);
                    Object val2 = method.invoke(view, new Object[0]);
                    ret.put(name, new b(constraintAttribute, val2));
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return ret;
    }

    public static void c(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String name : hashMap.keySet()) {
            b constraintAttribute = (b) hashMap.get(name);
            String methodName = "set" + name;
            try {
                switch (constraintAttribute.f2795b.ordinal()) {
                    case 0:
                        Method method = cls.getMethod(methodName, Integer.TYPE);
                        method.invoke(view, Integer.valueOf(constraintAttribute.f2796c));
                        break;
                    case 1:
                        Method method2 = cls.getMethod(methodName, Float.TYPE);
                        method2.invoke(view, Float.valueOf(constraintAttribute.f2797d));
                        break;
                    case 2:
                        Method method3 = cls.getMethod(methodName, Integer.TYPE);
                        method3.invoke(view, Integer.valueOf(constraintAttribute.f2800g));
                        break;
                    case 3:
                        Method method4 = cls.getMethod(methodName, Drawable.class);
                        ColorDrawable drawable = new ColorDrawable();
                        drawable.setColor(constraintAttribute.f2800g);
                        method4.invoke(view, drawable);
                        break;
                    case 4:
                        Method method5 = cls.getMethod(methodName, CharSequence.class);
                        method5.invoke(view, constraintAttribute.f2798e);
                        break;
                    case 5:
                        Method method6 = cls.getMethod(methodName, Boolean.TYPE);
                        method6.invoke(view, Boolean.valueOf(constraintAttribute.f2799f));
                        break;
                    case 6:
                        Method method7 = cls.getMethod(methodName, Float.TYPE);
                        method7.invoke(view, Float.valueOf(constraintAttribute.f2797d));
                        break;
                }
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + name + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + name + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(methodName);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e4) {
                Log.e("TransitionLayout", " Custom Attribute \"" + name + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    public static void b(Context context, XmlPullParser parser, HashMap hashMap) {
        AttributeSet attributeSet = Xml.asAttributeSet(parser);
        TypedArray a2 = context.obtainStyledAttributes(attributeSet, r.f2946c);
        String name = null;
        Object value = null;
        a type = null;
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            int[] iArr = r.f2944a;
            if (attr == 0) {
                name = a2.getString(attr);
                if (name != null && name.length() > 0) {
                    name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
                }
            } else if (attr == 1) {
                value = Boolean.valueOf(a2.getBoolean(attr, false));
                type = a.BOOLEAN_TYPE;
            } else if (attr == 3) {
                type = a.COLOR_TYPE;
                value = Integer.valueOf(a2.getColor(attr, 0));
            } else if (attr == 2) {
                type = a.COLOR_DRAWABLE_TYPE;
                value = Integer.valueOf(a2.getColor(attr, 0));
            } else if (attr == 7) {
                type = a.DIMENSION_TYPE;
                value = Float.valueOf(TypedValue.applyDimension(1, a2.getDimension(attr, 0.0f), context.getResources().getDisplayMetrics()));
            } else if (attr == 4) {
                type = a.DIMENSION_TYPE;
                value = Float.valueOf(a2.getDimension(attr, 0.0f));
            } else if (attr == 5) {
                type = a.FLOAT_TYPE;
                value = Float.valueOf(a2.getFloat(attr, Float.NaN));
            } else if (attr == 6) {
                type = a.INT_TYPE;
                value = Integer.valueOf(a2.getInteger(attr, -1));
            } else if (attr == 8) {
                type = a.STRING_TYPE;
                value = a2.getString(attr);
            }
        }
        if (!(name == null || value == null)) {
            hashMap.put(name, new b(name, type, value));
        }
        a2.recycle();
    }
}
