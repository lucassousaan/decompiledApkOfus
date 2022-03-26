package q;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import m.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2939d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f2940e;

    /* renamed from: a  reason: collision with root package name */
    public HashMap f2941a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2942b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap f2943c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2940e = sparseIntArray;
        int[] iArr = r.f2944a;
        sparseIntArray.append(77, 25);
        f2940e.append(78, 26);
        f2940e.append(80, 29);
        f2940e.append(81, 30);
        f2940e.append(87, 36);
        f2940e.append(86, 35);
        f2940e.append(59, 4);
        f2940e.append(58, 3);
        f2940e.append(56, 1);
        f2940e.append(95, 6);
        f2940e.append(96, 7);
        f2940e.append(66, 17);
        f2940e.append(67, 18);
        f2940e.append(68, 19);
        f2940e.append(0, 27);
        f2940e.append(82, 32);
        f2940e.append(83, 33);
        f2940e.append(65, 10);
        f2940e.append(64, 9);
        f2940e.append(99, 13);
        f2940e.append(102, 16);
        f2940e.append(100, 14);
        f2940e.append(97, 11);
        f2940e.append(101, 15);
        f2940e.append(98, 12);
        f2940e.append(90, 40);
        f2940e.append(75, 39);
        f2940e.append(74, 41);
        f2940e.append(89, 42);
        f2940e.append(73, 20);
        f2940e.append(88, 37);
        f2940e.append(63, 5);
        f2940e.append(76, 82);
        f2940e.append(85, 82);
        f2940e.append(79, 82);
        f2940e.append(57, 82);
        f2940e.append(55, 82);
        f2940e.append(5, 24);
        f2940e.append(7, 28);
        f2940e.append(23, 31);
        f2940e.append(24, 8);
        f2940e.append(6, 34);
        f2940e.append(8, 2);
        f2940e.append(3, 23);
        f2940e.append(4, 21);
        f2940e.append(2, 22);
        f2940e.append(13, 43);
        f2940e.append(26, 44);
        f2940e.append(21, 45);
        f2940e.append(22, 46);
        f2940e.append(20, 60);
        f2940e.append(18, 47);
        f2940e.append(19, 48);
        f2940e.append(14, 49);
        f2940e.append(15, 50);
        f2940e.append(16, 51);
        f2940e.append(17, 52);
        f2940e.append(25, 53);
        f2940e.append(91, 54);
        f2940e.append(69, 55);
        f2940e.append(92, 56);
        f2940e.append(70, 57);
        f2940e.append(93, 58);
        f2940e.append(71, 59);
        f2940e.append(60, 61);
        f2940e.append(62, 62);
        f2940e.append(61, 63);
        f2940e.append(27, 64);
        f2940e.append(107, 65);
        f2940e.append(34, 66);
        f2940e.append(108, 67);
        f2940e.append(104, 79);
        f2940e.append(1, 38);
        f2940e.append(103, 68);
        f2940e.append(94, 69);
        f2940e.append(72, 70);
        f2940e.append(31, 71);
        f2940e.append(29, 72);
        f2940e.append(30, 73);
        f2940e.append(32, 74);
        f2940e.append(28, 75);
        f2940e.append(105, 76);
        f2940e.append(84, 77);
        f2940e.append(109, 78);
        f2940e.append(54, 80);
        f2940e.append(53, 81);
    }

    public void f(Context context, int constraintLayoutId) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        this.f2943c.clear();
        for (int i2 = 0; i2 < count; i2++) {
            View view = constraintLayout.getChildAt(i2);
            e param = (e) view.getLayoutParams();
            int id = view.getId();
            if (!this.f2942b || id != -1) {
                if (!this.f2943c.containsKey(Integer.valueOf(id))) {
                    this.f2943c.put(Integer.valueOf(id), new j());
                }
                j constraint = (j) this.f2943c.get(Integer.valueOf(id));
                constraint.f2874f = b.a(this.f2941a, view);
                j.a(constraint, id, param);
                constraint.f2870b.f2921b = view.getVisibility();
                constraint.f2870b.f2923d = view.getAlpha();
                constraint.f2873e.f2927b = view.getRotation();
                constraint.f2873e.f2928c = view.getRotationX();
                constraint.f2873e.f2929d = view.getRotationY();
                constraint.f2873e.f2930e = view.getScaleX();
                constraint.f2873e.f2931f = view.getScaleY();
                float pivotX = view.getPivotX();
                float pivotY = view.getPivotY();
                if (!(pivotX == 0.0d && pivotY == 0.0d)) {
                    n nVar = constraint.f2873e;
                    nVar.f2932g = pivotX;
                    nVar.f2933h = pivotY;
                }
                constraint.f2873e.f2934i = view.getTranslationX();
                constraint.f2873e.f2935j = view.getTranslationY();
                constraint.f2873e.f2936k = view.getTranslationZ();
                n nVar2 = constraint.f2873e;
                if (nVar2.f2937l) {
                    nVar2.f2938m = view.getElevation();
                }
                if (view instanceof Barrier) {
                    Barrier barrier = (Barrier) view;
                    constraint.f2872d.f2895j0 = barrier.m();
                    constraint.f2872d.f2885e0 = barrier.getReferencedIds();
                    constraint.f2872d.f2879b0 = barrier.getType();
                    constraint.f2872d.f2881c0 = barrier.getMargin();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.f2943c.keySet());
        for (int i2 = 0; i2 < count; i2++) {
            View view = constraintLayout.getChildAt(i2);
            int id = view.getId();
            if (!this.f2943c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + a.a(view));
            } else if (this.f2942b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2943c.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    j constraint = (j) this.f2943c.get(Integer.valueOf(id));
                    if (view instanceof Barrier) {
                        constraint.f2872d.f2883d0 = 1;
                    }
                    int i3 = constraint.f2872d.f2883d0;
                    if (i3 != -1) {
                        switch (i3) {
                            case 1:
                                Barrier barrier = (Barrier) view;
                                barrier.setId(id);
                                barrier.setType(constraint.f2872d.f2879b0);
                                barrier.setMargin(constraint.f2872d.f2881c0);
                                barrier.setAllowsGoneWidget(constraint.f2872d.f2895j0);
                                k kVar = constraint.f2872d;
                                int[] iArr = kVar.f2885e0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                    break;
                                } else {
                                    String str = kVar.f2887f0;
                                    if (str != null) {
                                        kVar.f2885e0 = i(barrier, str);
                                        barrier.setReferencedIds(constraint.f2872d.f2885e0);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                    e param = (e) view.getLayoutParams();
                    param.a();
                    constraint.b(param);
                    if (applyPostLayout) {
                        b.c(view, constraint.f2874f);
                    }
                    view.setLayoutParams(param);
                    m mVar = constraint.f2870b;
                    if (mVar.f2922c == 0) {
                        view.setVisibility(mVar.f2921b);
                    }
                    view.setAlpha(constraint.f2870b.f2923d);
                    view.setRotation(constraint.f2873e.f2927b);
                    view.setRotationX(constraint.f2873e.f2928c);
                    view.setRotationY(constraint.f2873e.f2929d);
                    view.setScaleX(constraint.f2873e.f2930e);
                    view.setScaleY(constraint.f2873e.f2931f);
                    if (!Float.isNaN(constraint.f2873e.f2932g)) {
                        view.setPivotX(constraint.f2873e.f2932g);
                    }
                    if (!Float.isNaN(constraint.f2873e.f2933h)) {
                        view.setPivotY(constraint.f2873e.f2933h);
                    }
                    view.setTranslationX(constraint.f2873e.f2934i);
                    view.setTranslationY(constraint.f2873e.f2935j);
                    view.setTranslationZ(constraint.f2873e.f2936k);
                    n nVar = constraint.f2873e;
                    if (nVar.f2937l) {
                        view.setElevation(nVar.f2938m);
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator<Integer> it = used.iterator();
        while (it.hasNext()) {
            Integer id2 = it.next();
            j constraint2 = (j) this.f2943c.get(id2);
            int i4 = constraint2.f2872d.f2883d0;
            if (i4 != -1) {
                switch (i4) {
                    case 1:
                        Barrier barrier2 = new Barrier(constraintLayout.getContext());
                        barrier2.setId(id2.intValue());
                        k kVar2 = constraint2.f2872d;
                        int[] iArr2 = kVar2.f2885e0;
                        if (iArr2 != null) {
                            barrier2.setReferencedIds(iArr2);
                        } else {
                            String str2 = kVar2.f2887f0;
                            if (str2 != null) {
                                kVar2.f2885e0 = i(barrier2, str2);
                                barrier2.setReferencedIds(constraint2.f2872d.f2885e0);
                            }
                        }
                        barrier2.setType(constraint2.f2872d.f2879b0);
                        barrier2.setMargin(constraint2.f2872d.f2881c0);
                        e param2 = constraintLayout.generateDefaultLayoutParams();
                        barrier2.l();
                        constraint2.b(param2);
                        constraintLayout.addView(barrier2, param2);
                        break;
                }
            }
            if (constraint2.f2872d.f2876a) {
                Guideline g2 = new Guideline(constraintLayout.getContext());
                g2.setId(id2.intValue());
                e param3 = constraintLayout.generateDefaultLayoutParams();
                constraint2.b(param3);
                constraintLayout.addView(g2, param3);
            }
        }
    }

    public void e(int viewId, int anchor) {
        if (this.f2943c.containsKey(Integer.valueOf(viewId))) {
            j constraint = (j) this.f2943c.get(Integer.valueOf(viewId));
            switch (anchor) {
                case 1:
                    k kVar = constraint.f2872d;
                    kVar.f2892i = -1;
                    kVar.f2890h = -1;
                    kVar.D = -1;
                    kVar.J = -1;
                    return;
                case 2:
                    k kVar2 = constraint.f2872d;
                    kVar2.f2896k = -1;
                    kVar2.f2894j = -1;
                    kVar2.E = -1;
                    kVar2.L = -1;
                    return;
                case 3:
                    k kVar3 = constraint.f2872d;
                    kVar3.f2898m = -1;
                    kVar3.f2897l = -1;
                    kVar3.F = -1;
                    kVar3.K = -1;
                    return;
                case 4:
                    k kVar4 = constraint.f2872d;
                    kVar4.f2899n = -1;
                    kVar4.f2900o = -1;
                    kVar4.G = -1;
                    kVar4.M = -1;
                    return;
                case 5:
                    constraint.f2872d.f2901p = -1;
                    return;
                case 6:
                    k kVar5 = constraint.f2872d;
                    kVar5.f2902q = -1;
                    kVar5.f2903r = -1;
                    kVar5.I = -1;
                    kVar5.O = -1;
                    return;
                case 7:
                    k kVar6 = constraint.f2872d;
                    kVar6.f2904s = -1;
                    kVar6.f2905t = -1;
                    kVar6.H = -1;
                    kVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void h(int viewId, int id, int radius, float angle) {
        j constraint = k(viewId);
        k kVar = constraint.f2872d;
        kVar.f2909x = id;
        kVar.f2910y = radius;
        kVar.f2911z = angle;
    }

    public final j k(int id) {
        if (!this.f2943c.containsKey(Integer.valueOf(id))) {
            this.f2943c.put(Integer.valueOf(id), new j());
        }
        return (j) this.f2943c.get(Integer.valueOf(id));
    }

    public void l(Context context, int resourceId) {
        Resources res = context.getResources();
        XmlPullParser parser = res.getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                switch (eventType) {
                    case 0:
                        parser.getName();
                        break;
                    case 2:
                        String tagName = parser.getName();
                        j constraint = j(context, Xml.asAttributeSet(parser));
                        if (tagName.equalsIgnoreCase("Guideline")) {
                            constraint.f2872d.f2876a = true;
                        }
                        this.f2943c.put(Integer.valueOf(constraint.f2869a), constraint);
                        break;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void m(Context context, XmlPullParser parser) {
        j constraint = null;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                switch (eventType) {
                    case 0:
                        parser.getName();
                        break;
                    case 2:
                        String tagName = parser.getName();
                        char c2 = 65535;
                        switch (tagName.hashCode()) {
                            case -2025855158:
                                if (tagName.equals("Layout")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (tagName.equals("Motion")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (tagName.equals("PropertySet")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (tagName.equals("Transform")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (tagName.equals("Guideline")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (tagName.equals("Barrier")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (tagName.equals("CustomAttribute")) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (tagName.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                                constraint = j(context, Xml.asAttributeSet(parser));
                                break;
                            case 1:
                                constraint = j(context, Xml.asAttributeSet(parser));
                                k kVar = constraint.f2872d;
                                kVar.f2876a = true;
                                kVar.f2878b = true;
                                break;
                            case 2:
                                constraint = j(context, Xml.asAttributeSet(parser));
                                constraint.f2872d.f2883d0 = 1;
                                break;
                            case 3:
                                if (constraint != null) {
                                    constraint.f2870b.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 4:
                                if (constraint != null) {
                                    constraint.f2873e.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 5:
                                if (constraint != null) {
                                    constraint.f2872d.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 6:
                                if (constraint != null) {
                                    constraint.f2871c.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                            case 7:
                                if (constraint != null) {
                                    b.b(context, parser, constraint.f2874f);
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + parser.getLineNumber());
                                }
                        }
                        break;
                    case 3:
                        String tagName2 = parser.getName();
                        if (!"ConstraintSet".equals(tagName2)) {
                            if (tagName2.equalsIgnoreCase("Constraint")) {
                                this.f2943c.put(Integer.valueOf(constraint.f2869a), constraint);
                                constraint = null;
                            }
                            break;
                        } else {
                            return;
                        }
                }
                eventType = parser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public static int n(TypedArray a2, int index, int def) {
        int ret = a2.getResourceId(index, def);
        if (ret == -1) {
            return a2.getInt(index, -1);
        }
        return ret;
    }

    public final j j(Context context, AttributeSet attrs) {
        j c2 = new j();
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2944a);
        o(c2, a2);
        a2.recycle();
        return c2;
    }

    public final void o(j c2, TypedArray a2) {
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            int[] iArr = r.f2944a;
            if (!(attr == 1 || 23 == attr || 24 == attr)) {
                c2.f2871c.f2913a = true;
                c2.f2872d.f2878b = true;
                c2.f2870b.f2920a = true;
                c2.f2873e.f2926a = true;
            }
            switch (f2940e.get(attr)) {
                case 1:
                    k kVar = c2.f2872d;
                    kVar.f2901p = n(a2, attr, kVar.f2901p);
                    break;
                case 2:
                    k kVar2 = c2.f2872d;
                    kVar2.G = a2.getDimensionPixelSize(attr, kVar2.G);
                    break;
                case 3:
                    k kVar3 = c2.f2872d;
                    kVar3.f2900o = n(a2, attr, kVar3.f2900o);
                    break;
                case 4:
                    k kVar4 = c2.f2872d;
                    kVar4.f2899n = n(a2, attr, kVar4.f2899n);
                    break;
                case 5:
                    c2.f2872d.f2908w = a2.getString(attr);
                    break;
                case 6:
                    k kVar5 = c2.f2872d;
                    kVar5.A = a2.getDimensionPixelOffset(attr, kVar5.A);
                    break;
                case 7:
                    k kVar6 = c2.f2872d;
                    kVar6.B = a2.getDimensionPixelOffset(attr, kVar6.B);
                    break;
                case 8:
                    k kVar7 = c2.f2872d;
                    kVar7.H = a2.getDimensionPixelSize(attr, kVar7.H);
                    break;
                case 9:
                    k kVar8 = c2.f2872d;
                    kVar8.f2905t = n(a2, attr, kVar8.f2905t);
                    break;
                case 10:
                    k kVar9 = c2.f2872d;
                    kVar9.f2904s = n(a2, attr, kVar9.f2904s);
                    break;
                case 11:
                    k kVar10 = c2.f2872d;
                    kVar10.M = a2.getDimensionPixelSize(attr, kVar10.M);
                    break;
                case 12:
                    k kVar11 = c2.f2872d;
                    kVar11.N = a2.getDimensionPixelSize(attr, kVar11.N);
                    break;
                case 13:
                    k kVar12 = c2.f2872d;
                    kVar12.J = a2.getDimensionPixelSize(attr, kVar12.J);
                    break;
                case 14:
                    k kVar13 = c2.f2872d;
                    kVar13.L = a2.getDimensionPixelSize(attr, kVar13.L);
                    break;
                case 15:
                    k kVar14 = c2.f2872d;
                    kVar14.O = a2.getDimensionPixelSize(attr, kVar14.O);
                    break;
                case 16:
                    k kVar15 = c2.f2872d;
                    kVar15.K = a2.getDimensionPixelSize(attr, kVar15.K);
                    break;
                case 17:
                    k kVar16 = c2.f2872d;
                    kVar16.f2884e = a2.getDimensionPixelOffset(attr, kVar16.f2884e);
                    break;
                case 18:
                    k kVar17 = c2.f2872d;
                    kVar17.f2886f = a2.getDimensionPixelOffset(attr, kVar17.f2886f);
                    break;
                case 19:
                    k kVar18 = c2.f2872d;
                    kVar18.f2888g = a2.getFloat(attr, kVar18.f2888g);
                    break;
                case 20:
                    k kVar19 = c2.f2872d;
                    kVar19.f2906u = a2.getFloat(attr, kVar19.f2906u);
                    break;
                case 21:
                    k kVar20 = c2.f2872d;
                    kVar20.f2882d = a2.getLayoutDimension(attr, kVar20.f2882d);
                    break;
                case 22:
                    m mVar = c2.f2870b;
                    mVar.f2921b = a2.getInt(attr, mVar.f2921b);
                    m mVar2 = c2.f2870b;
                    mVar2.f2921b = f2939d[mVar2.f2921b];
                    break;
                case 23:
                    k kVar21 = c2.f2872d;
                    kVar21.f2880c = a2.getLayoutDimension(attr, kVar21.f2880c);
                    break;
                case 24:
                    k kVar22 = c2.f2872d;
                    kVar22.D = a2.getDimensionPixelSize(attr, kVar22.D);
                    break;
                case 25:
                    k kVar23 = c2.f2872d;
                    kVar23.f2890h = n(a2, attr, kVar23.f2890h);
                    break;
                case 26:
                    k kVar24 = c2.f2872d;
                    kVar24.f2892i = n(a2, attr, kVar24.f2892i);
                    break;
                case 27:
                    k kVar25 = c2.f2872d;
                    kVar25.C = a2.getInt(attr, kVar25.C);
                    break;
                case 28:
                    k kVar26 = c2.f2872d;
                    kVar26.E = a2.getDimensionPixelSize(attr, kVar26.E);
                    break;
                case 29:
                    k kVar27 = c2.f2872d;
                    kVar27.f2894j = n(a2, attr, kVar27.f2894j);
                    break;
                case 30:
                    k kVar28 = c2.f2872d;
                    kVar28.f2896k = n(a2, attr, kVar28.f2896k);
                    break;
                case 31:
                    k kVar29 = c2.f2872d;
                    kVar29.I = a2.getDimensionPixelSize(attr, kVar29.I);
                    break;
                case 32:
                    k kVar30 = c2.f2872d;
                    kVar30.f2902q = n(a2, attr, kVar30.f2902q);
                    break;
                case 33:
                    k kVar31 = c2.f2872d;
                    kVar31.f2903r = n(a2, attr, kVar31.f2903r);
                    break;
                case 34:
                    k kVar32 = c2.f2872d;
                    kVar32.F = a2.getDimensionPixelSize(attr, kVar32.F);
                    break;
                case 35:
                    k kVar33 = c2.f2872d;
                    kVar33.f2898m = n(a2, attr, kVar33.f2898m);
                    break;
                case 36:
                    k kVar34 = c2.f2872d;
                    kVar34.f2897l = n(a2, attr, kVar34.f2897l);
                    break;
                case 37:
                    k kVar35 = c2.f2872d;
                    kVar35.f2907v = a2.getFloat(attr, kVar35.f2907v);
                    break;
                case 38:
                    c2.f2869a = a2.getResourceId(attr, c2.f2869a);
                    break;
                case 39:
                    k kVar36 = c2.f2872d;
                    kVar36.Q = a2.getFloat(attr, kVar36.Q);
                    break;
                case 40:
                    k kVar37 = c2.f2872d;
                    kVar37.P = a2.getFloat(attr, kVar37.P);
                    break;
                case 41:
                    k kVar38 = c2.f2872d;
                    kVar38.R = a2.getInt(attr, kVar38.R);
                    break;
                case 42:
                    k kVar39 = c2.f2872d;
                    kVar39.S = a2.getInt(attr, kVar39.S);
                    break;
                case 43:
                    m mVar3 = c2.f2870b;
                    mVar3.f2923d = a2.getFloat(attr, mVar3.f2923d);
                    break;
                case 44:
                    n nVar = c2.f2873e;
                    nVar.f2937l = true;
                    nVar.f2938m = a2.getDimension(attr, nVar.f2938m);
                    break;
                case 45:
                    n nVar2 = c2.f2873e;
                    nVar2.f2928c = a2.getFloat(attr, nVar2.f2928c);
                    break;
                case 46:
                    n nVar3 = c2.f2873e;
                    nVar3.f2929d = a2.getFloat(attr, nVar3.f2929d);
                    break;
                case 47:
                    n nVar4 = c2.f2873e;
                    nVar4.f2930e = a2.getFloat(attr, nVar4.f2930e);
                    break;
                case 48:
                    n nVar5 = c2.f2873e;
                    nVar5.f2931f = a2.getFloat(attr, nVar5.f2931f);
                    break;
                case 49:
                    n nVar6 = c2.f2873e;
                    nVar6.f2932g = a2.getDimension(attr, nVar6.f2932g);
                    break;
                case 50:
                    n nVar7 = c2.f2873e;
                    nVar7.f2933h = a2.getDimension(attr, nVar7.f2933h);
                    break;
                case 51:
                    n nVar8 = c2.f2873e;
                    nVar8.f2934i = a2.getDimension(attr, nVar8.f2934i);
                    break;
                case 52:
                    n nVar9 = c2.f2873e;
                    nVar9.f2935j = a2.getDimension(attr, nVar9.f2935j);
                    break;
                case 53:
                    n nVar10 = c2.f2873e;
                    nVar10.f2936k = a2.getDimension(attr, nVar10.f2936k);
                    break;
                case 54:
                    k kVar40 = c2.f2872d;
                    kVar40.T = a2.getInt(attr, kVar40.T);
                    break;
                case 55:
                    k kVar41 = c2.f2872d;
                    kVar41.U = a2.getInt(attr, kVar41.U);
                    break;
                case 56:
                    k kVar42 = c2.f2872d;
                    kVar42.V = a2.getDimensionPixelSize(attr, kVar42.V);
                    break;
                case 57:
                    k kVar43 = c2.f2872d;
                    kVar43.W = a2.getDimensionPixelSize(attr, kVar43.W);
                    break;
                case 58:
                    k kVar44 = c2.f2872d;
                    kVar44.X = a2.getDimensionPixelSize(attr, kVar44.X);
                    break;
                case 59:
                    k kVar45 = c2.f2872d;
                    kVar45.Y = a2.getDimensionPixelSize(attr, kVar45.Y);
                    break;
                case 60:
                    n nVar11 = c2.f2873e;
                    nVar11.f2927b = a2.getFloat(attr, nVar11.f2927b);
                    break;
                case 61:
                    k kVar46 = c2.f2872d;
                    kVar46.f2909x = n(a2, attr, kVar46.f2909x);
                    break;
                case 62:
                    k kVar47 = c2.f2872d;
                    kVar47.f2910y = a2.getDimensionPixelSize(attr, kVar47.f2910y);
                    break;
                case 63:
                    k kVar48 = c2.f2872d;
                    kVar48.f2911z = a2.getFloat(attr, kVar48.f2911z);
                    break;
                case 64:
                    l lVar = c2.f2871c;
                    lVar.f2914b = n(a2, attr, lVar.f2914b);
                    break;
                case 65:
                    TypedValue type = a2.peekValue(attr);
                    if (type.type == 3) {
                        c2.f2871c.f2915c = a2.getString(attr);
                        break;
                    } else {
                        c2.f2871c.f2915c = l.a.f2354b[a2.getInteger(attr, 0)];
                        break;
                    }
                case 66:
                    c2.f2871c.f2917e = a2.getInt(attr, 0);
                    break;
                case 67:
                    l lVar2 = c2.f2871c;
                    lVar2.f2919g = a2.getFloat(attr, lVar2.f2919g);
                    break;
                case 68:
                    m mVar4 = c2.f2870b;
                    mVar4.f2924e = a2.getFloat(attr, mVar4.f2924e);
                    break;
                case 69:
                    c2.f2872d.Z = a2.getFloat(attr, 1.0f);
                    break;
                case 70:
                    c2.f2872d.f2877a0 = a2.getFloat(attr, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    k kVar49 = c2.f2872d;
                    kVar49.f2879b0 = a2.getInt(attr, kVar49.f2879b0);
                    break;
                case 73:
                    k kVar50 = c2.f2872d;
                    kVar50.f2881c0 = a2.getDimensionPixelSize(attr, kVar50.f2881c0);
                    break;
                case 74:
                    c2.f2872d.f2887f0 = a2.getString(attr);
                    break;
                case 75:
                    k kVar51 = c2.f2872d;
                    kVar51.f2895j0 = a2.getBoolean(attr, kVar51.f2895j0);
                    break;
                case 76:
                    l lVar3 = c2.f2871c;
                    lVar3.f2916d = a2.getInt(attr, lVar3.f2916d);
                    break;
                case 77:
                    c2.f2872d.f2889g0 = a2.getString(attr);
                    break;
                case 78:
                    m mVar5 = c2.f2870b;
                    mVar5.f2922c = a2.getInt(attr, mVar5.f2922c);
                    break;
                case 79:
                    l lVar4 = c2.f2871c;
                    lVar4.f2918f = a2.getFloat(attr, lVar4.f2918f);
                    break;
                case 80:
                    k kVar52 = c2.f2872d;
                    kVar52.f2891h0 = a2.getBoolean(attr, kVar52.f2891h0);
                    break;
                case 81:
                    k kVar53 = c2.f2872d;
                    kVar53.f2893i0 = a2.getBoolean(attr, kVar53.f2893i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f2940e.get(attr));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f2940e.get(attr));
                    break;
            }
        }
    }

    public final int[] i(View view, String referenceIdString) {
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] tags = new int[split.length];
        int count = 0;
        int i2 = 0;
        while (i2 < split.length) {
            String idString = split[i2].trim();
            int tag = 0;
            try {
                Field field = q.class.getField(idString);
                tag = field.getInt(null);
            } catch (Exception e2) {
            }
            if (tag == 0) {
                tag = context.getResources().getIdentifier(idString, "id", context.getPackageName());
            }
            if (tag == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                Object value = constraintLayout.f(0, idString);
                if (value != null && (value instanceof Integer)) {
                    tag = ((Integer) value).intValue();
                }
            }
            tags[count] = tag;
            i2++;
            count++;
        }
        int i3 = split.length;
        if (count != i3) {
            return Arrays.copyOf(tags, count);
        }
        return tags;
    }
}
