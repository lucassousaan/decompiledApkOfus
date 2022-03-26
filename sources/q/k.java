package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k {

    /* renamed from: k0  reason: collision with root package name */
    public static SparseIntArray f2875k0;

    /* renamed from: c  reason: collision with root package name */
    public int f2880c;

    /* renamed from: d  reason: collision with root package name */
    public int f2882d;

    /* renamed from: e0  reason: collision with root package name */
    public int[] f2885e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f2887f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f2889g0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2876a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2878b = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2884e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f2886f = -1;

    /* renamed from: g  reason: collision with root package name */
    public float f2888g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public int f2890h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2892i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f2894j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f2896k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f2897l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f2898m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f2899n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f2900o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f2901p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f2902q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f2903r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f2904s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f2905t = -1;

    /* renamed from: u  reason: collision with root package name */
    public float f2906u = 0.5f;

    /* renamed from: v  reason: collision with root package name */
    public float f2907v = 0.5f;

    /* renamed from: w  reason: collision with root package name */
    public String f2908w = null;

    /* renamed from: x  reason: collision with root package name */
    public int f2909x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f2910y = 0;

    /* renamed from: z  reason: collision with root package name */
    public float f2911z = 0.0f;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public float P = -1.0f;
    public float Q = -1.0f;
    public int R = 0;
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public float Z = 1.0f;

    /* renamed from: a0  reason: collision with root package name */
    public float f2877a0 = 1.0f;

    /* renamed from: b0  reason: collision with root package name */
    public int f2879b0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    public int f2881c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2883d0 = -1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f2891h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2893i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f2895j0 = true;

    public void a(k src) {
        this.f2876a = src.f2876a;
        this.f2880c = src.f2880c;
        this.f2878b = src.f2878b;
        this.f2882d = src.f2882d;
        this.f2884e = src.f2884e;
        this.f2886f = src.f2886f;
        this.f2888g = src.f2888g;
        this.f2890h = src.f2890h;
        this.f2892i = src.f2892i;
        this.f2894j = src.f2894j;
        this.f2896k = src.f2896k;
        this.f2897l = src.f2897l;
        this.f2898m = src.f2898m;
        this.f2899n = src.f2899n;
        this.f2900o = src.f2900o;
        this.f2901p = src.f2901p;
        this.f2902q = src.f2902q;
        this.f2903r = src.f2903r;
        this.f2904s = src.f2904s;
        this.f2905t = src.f2905t;
        this.f2906u = src.f2906u;
        this.f2907v = src.f2907v;
        this.f2908w = src.f2908w;
        this.f2909x = src.f2909x;
        this.f2910y = src.f2910y;
        this.f2911z = src.f2911z;
        this.A = src.A;
        this.B = src.B;
        this.C = src.C;
        this.D = src.D;
        this.E = src.E;
        this.F = src.F;
        this.G = src.G;
        this.H = src.H;
        this.I = src.I;
        this.J = src.J;
        this.K = src.K;
        this.L = src.L;
        this.M = src.M;
        this.N = src.N;
        this.O = src.O;
        this.P = src.P;
        this.Q = src.Q;
        this.R = src.R;
        this.S = src.S;
        this.T = src.T;
        this.U = src.U;
        this.V = src.V;
        this.W = src.W;
        this.X = src.X;
        this.Y = src.Y;
        this.Z = src.Z;
        this.f2877a0 = src.f2877a0;
        this.f2879b0 = src.f2879b0;
        this.f2881c0 = src.f2881c0;
        this.f2883d0 = src.f2883d0;
        this.f2889g0 = src.f2889g0;
        int[] iArr = src.f2885e0;
        if (iArr != null) {
            this.f2885e0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.f2885e0 = null;
        }
        this.f2887f0 = src.f2887f0;
        this.f2891h0 = src.f2891h0;
        this.f2893i0 = src.f2893i0;
        this.f2895j0 = src.f2895j0;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2875k0 = sparseIntArray;
        int[] iArr = r.f2944a;
        sparseIntArray.append(39, 24);
        f2875k0.append(40, 25);
        f2875k0.append(42, 28);
        f2875k0.append(43, 29);
        f2875k0.append(48, 35);
        f2875k0.append(47, 34);
        f2875k0.append(21, 4);
        f2875k0.append(20, 3);
        f2875k0.append(18, 1);
        f2875k0.append(56, 6);
        f2875k0.append(57, 7);
        f2875k0.append(28, 17);
        f2875k0.append(29, 18);
        f2875k0.append(30, 19);
        f2875k0.append(0, 26);
        f2875k0.append(44, 31);
        f2875k0.append(45, 32);
        f2875k0.append(27, 10);
        f2875k0.append(26, 9);
        f2875k0.append(60, 13);
        f2875k0.append(63, 16);
        f2875k0.append(61, 14);
        f2875k0.append(58, 11);
        f2875k0.append(62, 15);
        f2875k0.append(59, 12);
        f2875k0.append(51, 38);
        f2875k0.append(37, 37);
        f2875k0.append(36, 39);
        f2875k0.append(50, 40);
        f2875k0.append(35, 20);
        f2875k0.append(49, 36);
        f2875k0.append(25, 5);
        f2875k0.append(38, 76);
        f2875k0.append(46, 76);
        f2875k0.append(41, 76);
        f2875k0.append(19, 76);
        f2875k0.append(17, 76);
        f2875k0.append(3, 23);
        f2875k0.append(5, 27);
        f2875k0.append(7, 30);
        f2875k0.append(8, 8);
        f2875k0.append(4, 33);
        f2875k0.append(6, 2);
        f2875k0.append(1, 22);
        f2875k0.append(2, 21);
        f2875k0.append(22, 61);
        f2875k0.append(24, 62);
        f2875k0.append(23, 63);
        f2875k0.append(55, 69);
        f2875k0.append(34, 70);
        f2875k0.append(12, 71);
        f2875k0.append(10, 72);
        f2875k0.append(11, 73);
        f2875k0.append(13, 74);
        f2875k0.append(9, 75);
    }

    public void b(Context context, AttributeSet attrs) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2947d);
        this.f2878b = true;
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            switch (f2875k0.get(attr)) {
                case 1:
                    n2 = o.n(a2, attr, this.f2901p);
                    this.f2901p = n2;
                    break;
                case 2:
                    this.G = a2.getDimensionPixelSize(attr, this.G);
                    break;
                case 3:
                    n3 = o.n(a2, attr, this.f2900o);
                    this.f2900o = n3;
                    break;
                case 4:
                    n4 = o.n(a2, attr, this.f2899n);
                    this.f2899n = n4;
                    break;
                case 5:
                    this.f2908w = a2.getString(attr);
                    break;
                case 6:
                    this.A = a2.getDimensionPixelOffset(attr, this.A);
                    break;
                case 7:
                    this.B = a2.getDimensionPixelOffset(attr, this.B);
                    break;
                case 8:
                    this.H = a2.getDimensionPixelSize(attr, this.H);
                    break;
                case 9:
                    n5 = o.n(a2, attr, this.f2905t);
                    this.f2905t = n5;
                    break;
                case 10:
                    n6 = o.n(a2, attr, this.f2904s);
                    this.f2904s = n6;
                    break;
                case 11:
                    this.M = a2.getDimensionPixelSize(attr, this.M);
                    break;
                case 12:
                    this.N = a2.getDimensionPixelSize(attr, this.N);
                    break;
                case 13:
                    this.J = a2.getDimensionPixelSize(attr, this.J);
                    break;
                case 14:
                    this.L = a2.getDimensionPixelSize(attr, this.L);
                    break;
                case 15:
                    this.O = a2.getDimensionPixelSize(attr, this.O);
                    break;
                case 16:
                    this.K = a2.getDimensionPixelSize(attr, this.K);
                    break;
                case 17:
                    this.f2884e = a2.getDimensionPixelOffset(attr, this.f2884e);
                    break;
                case 18:
                    this.f2886f = a2.getDimensionPixelOffset(attr, this.f2886f);
                    break;
                case 19:
                    this.f2888g = a2.getFloat(attr, this.f2888g);
                    break;
                case 20:
                    this.f2906u = a2.getFloat(attr, this.f2906u);
                    break;
                case 21:
                    this.f2882d = a2.getLayoutDimension(attr, this.f2882d);
                    break;
                case 22:
                    this.f2880c = a2.getLayoutDimension(attr, this.f2880c);
                    break;
                case 23:
                    this.D = a2.getDimensionPixelSize(attr, this.D);
                    break;
                case 24:
                    n7 = o.n(a2, attr, this.f2890h);
                    this.f2890h = n7;
                    break;
                case 25:
                    n8 = o.n(a2, attr, this.f2892i);
                    this.f2892i = n8;
                    break;
                case 26:
                    this.C = a2.getInt(attr, this.C);
                    break;
                case 27:
                    this.E = a2.getDimensionPixelSize(attr, this.E);
                    break;
                case 28:
                    n9 = o.n(a2, attr, this.f2894j);
                    this.f2894j = n9;
                    break;
                case 29:
                    n10 = o.n(a2, attr, this.f2896k);
                    this.f2896k = n10;
                    break;
                case 30:
                    this.I = a2.getDimensionPixelSize(attr, this.I);
                    break;
                case 31:
                    n11 = o.n(a2, attr, this.f2902q);
                    this.f2902q = n11;
                    break;
                case 32:
                    n12 = o.n(a2, attr, this.f2903r);
                    this.f2903r = n12;
                    break;
                case 33:
                    this.F = a2.getDimensionPixelSize(attr, this.F);
                    break;
                case 34:
                    n13 = o.n(a2, attr, this.f2898m);
                    this.f2898m = n13;
                    break;
                case 35:
                    n14 = o.n(a2, attr, this.f2897l);
                    this.f2897l = n14;
                    break;
                case 36:
                    this.f2907v = a2.getFloat(attr, this.f2907v);
                    break;
                case 37:
                    this.Q = a2.getFloat(attr, this.Q);
                    break;
                case 38:
                    this.P = a2.getFloat(attr, this.P);
                    break;
                case 39:
                    this.R = a2.getInt(attr, this.R);
                    break;
                case 40:
                    this.S = a2.getInt(attr, this.S);
                    break;
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 60:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 78:
                case 79:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f2875k0.get(attr));
                    break;
                case 54:
                    this.T = a2.getInt(attr, this.T);
                    break;
                case 55:
                    this.U = a2.getInt(attr, this.U);
                    break;
                case 56:
                    this.V = a2.getDimensionPixelSize(attr, this.V);
                    break;
                case 57:
                    this.W = a2.getDimensionPixelSize(attr, this.W);
                    break;
                case 58:
                    this.X = a2.getDimensionPixelSize(attr, this.X);
                    break;
                case 59:
                    this.Y = a2.getDimensionPixelSize(attr, this.Y);
                    break;
                case 61:
                    n15 = o.n(a2, attr, this.f2909x);
                    this.f2909x = n15;
                    break;
                case 62:
                    this.f2910y = a2.getDimensionPixelSize(attr, this.f2910y);
                    break;
                case 63:
                    this.f2911z = a2.getFloat(attr, this.f2911z);
                    break;
                case 69:
                    this.Z = a2.getFloat(attr, 1.0f);
                    break;
                case 70:
                    this.f2877a0 = a2.getFloat(attr, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    this.f2879b0 = a2.getInt(attr, this.f2879b0);
                    break;
                case 73:
                    this.f2881c0 = a2.getDimensionPixelSize(attr, this.f2881c0);
                    break;
                case 74:
                    this.f2887f0 = a2.getString(attr);
                    break;
                case 75:
                    this.f2895j0 = a2.getBoolean(attr, this.f2895j0);
                    break;
                case 76:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f2875k0.get(attr));
                    break;
                case 77:
                    this.f2889g0 = a2.getString(attr);
                    break;
                case 80:
                    this.f2891h0 = a2.getBoolean(attr, this.f2891h0);
                    break;
                case 81:
                    this.f2893i0 = a2.getBoolean(attr, this.f2893i0);
                    break;
            }
        }
        a2.recycle();
    }
}
