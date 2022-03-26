package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import o.g;
import o.i;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends ViewGroup.MarginLayoutParams {
    public float A;
    public String B;
    public int C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public int f2810a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2811a0;

    /* renamed from: b  reason: collision with root package name */
    public int f2812b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2813b0;

    /* renamed from: c  reason: collision with root package name */
    public float f2814c;

    /* renamed from: c0  reason: collision with root package name */
    public int f2815c0;

    /* renamed from: d  reason: collision with root package name */
    public int f2816d;

    /* renamed from: d0  reason: collision with root package name */
    public int f2817d0;

    /* renamed from: e  reason: collision with root package name */
    public int f2818e;

    /* renamed from: e0  reason: collision with root package name */
    public int f2819e0;

    /* renamed from: f  reason: collision with root package name */
    public int f2820f;

    /* renamed from: f0  reason: collision with root package name */
    public int f2821f0;

    /* renamed from: g  reason: collision with root package name */
    public int f2822g;

    /* renamed from: g0  reason: collision with root package name */
    public int f2823g0;

    /* renamed from: h  reason: collision with root package name */
    public int f2824h;

    /* renamed from: h0  reason: collision with root package name */
    public int f2825h0;

    /* renamed from: i  reason: collision with root package name */
    public int f2826i;

    /* renamed from: i0  reason: collision with root package name */
    public float f2827i0;

    /* renamed from: j  reason: collision with root package name */
    public int f2828j;

    /* renamed from: j0  reason: collision with root package name */
    public int f2829j0;

    /* renamed from: k  reason: collision with root package name */
    public int f2830k;

    /* renamed from: k0  reason: collision with root package name */
    public int f2831k0;

    /* renamed from: l  reason: collision with root package name */
    public int f2832l;

    /* renamed from: l0  reason: collision with root package name */
    public float f2833l0;

    /* renamed from: m  reason: collision with root package name */
    public int f2834m;

    /* renamed from: m0  reason: collision with root package name */
    public g f2835m0;

    /* renamed from: n  reason: collision with root package name */
    public int f2836n;

    /* renamed from: o  reason: collision with root package name */
    public float f2837o;

    /* renamed from: p  reason: collision with root package name */
    public int f2838p;

    /* renamed from: q  reason: collision with root package name */
    public int f2839q;

    /* renamed from: r  reason: collision with root package name */
    public int f2840r;

    /* renamed from: s  reason: collision with root package name */
    public int f2841s;

    /* renamed from: t  reason: collision with root package name */
    public int f2842t;

    /* renamed from: u  reason: collision with root package name */
    public int f2843u;

    /* renamed from: v  reason: collision with root package name */
    public int f2844v;

    /* renamed from: w  reason: collision with root package name */
    public int f2845w;

    /* renamed from: x  reason: collision with root package name */
    public int f2846x;

    /* renamed from: y  reason: collision with root package name */
    public int f2847y;

    /* renamed from: z  reason: collision with root package name */
    public float f2848z;

    public e(Context c2, AttributeSet attrs) {
        super(c2, attrs);
        int commaIndex;
        int i2 = -1;
        this.f2810a = -1;
        this.f2812b = -1;
        this.f2814c = -1.0f;
        this.f2816d = -1;
        this.f2818e = -1;
        this.f2820f = -1;
        this.f2822g = -1;
        this.f2824h = -1;
        this.f2826i = -1;
        this.f2828j = -1;
        this.f2830k = -1;
        this.f2832l = -1;
        this.f2834m = -1;
        int value = 0;
        this.f2836n = 0;
        this.f2837o = 0.0f;
        this.f2838p = -1;
        this.f2839q = -1;
        this.f2840r = -1;
        this.f2841s = -1;
        this.f2842t = -1;
        this.f2843u = -1;
        this.f2844v = -1;
        this.f2845w = -1;
        this.f2846x = -1;
        this.f2847y = -1;
        this.f2848z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f2811a0 = false;
        this.f2813b0 = false;
        this.f2815c0 = -1;
        this.f2817d0 = -1;
        this.f2819e0 = -1;
        this.f2821f0 = -1;
        this.f2823g0 = -1;
        this.f2825h0 = -1;
        this.f2827i0 = 0.5f;
        this.f2835m0 = new g();
        TypedArray a2 = c2.obtainStyledAttributes(attrs, r.f2945b);
        int N = a2.getIndexCount();
        for (int i3 = 0; i3 < N; i3++) {
            int attr = a2.getIndex(i3);
            int look = d.f2809a.get(attr);
            switch (look) {
                case 0:
                    i2 = i2;
                    value = value;
                    break;
                case 1:
                    i2 = i2;
                    value = value;
                    this.R = a2.getInt(attr, this.R);
                    break;
                case 2:
                    value = value;
                    int resourceId = a2.getResourceId(attr, this.f2834m);
                    this.f2834m = resourceId;
                    i2 = -1;
                    if (resourceId == -1) {
                        this.f2834m = a2.getInt(attr, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    value = value;
                    this.f2836n = a2.getDimensionPixelSize(attr, this.f2836n);
                    i2 = -1;
                    break;
                case 4:
                    value = value;
                    float f2 = a2.getFloat(attr, this.f2837o) % 360.0f;
                    this.f2837o = f2;
                    if (f2 < 0.0f) {
                        this.f2837o = (360.0f - f2) % 360.0f;
                        i2 = -1;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                case 5:
                    value = value;
                    this.f2810a = a2.getDimensionPixelOffset(attr, this.f2810a);
                    i2 = -1;
                    break;
                case 6:
                    value = value;
                    this.f2812b = a2.getDimensionPixelOffset(attr, this.f2812b);
                    i2 = -1;
                    break;
                case 7:
                    value = value;
                    this.f2814c = a2.getFloat(attr, this.f2814c);
                    i2 = -1;
                    break;
                case 8:
                    value = value;
                    int resourceId2 = a2.getResourceId(attr, this.f2816d);
                    this.f2816d = resourceId2;
                    if (resourceId2 == i2) {
                        this.f2816d = a2.getInt(attr, i2);
                        i2 = -1;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                case 9:
                    i2 = i2;
                    value = value;
                    int resourceId3 = a2.getResourceId(attr, this.f2818e);
                    this.f2818e = resourceId3;
                    if (resourceId3 == i2) {
                        this.f2818e = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i2 = i2;
                    value = value;
                    int resourceId4 = a2.getResourceId(attr, this.f2820f);
                    this.f2820f = resourceId4;
                    if (resourceId4 == i2) {
                        this.f2820f = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = i2;
                    value = value;
                    int resourceId5 = a2.getResourceId(attr, this.f2822g);
                    this.f2822g = resourceId5;
                    if (resourceId5 == i2) {
                        this.f2822g = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i2 = i2;
                    value = value;
                    int resourceId6 = a2.getResourceId(attr, this.f2824h);
                    this.f2824h = resourceId6;
                    if (resourceId6 == i2) {
                        this.f2824h = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i2 = i2;
                    value = value;
                    int resourceId7 = a2.getResourceId(attr, this.f2826i);
                    this.f2826i = resourceId7;
                    if (resourceId7 == i2) {
                        this.f2826i = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i2 = i2;
                    value = value;
                    int resourceId8 = a2.getResourceId(attr, this.f2828j);
                    this.f2828j = resourceId8;
                    if (resourceId8 == i2) {
                        this.f2828j = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i2 = i2;
                    value = value;
                    int resourceId9 = a2.getResourceId(attr, this.f2830k);
                    this.f2830k = resourceId9;
                    if (resourceId9 == i2) {
                        this.f2830k = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i2 = i2;
                    value = value;
                    int resourceId10 = a2.getResourceId(attr, this.f2832l);
                    this.f2832l = resourceId10;
                    if (resourceId10 == i2) {
                        this.f2832l = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i2 = i2;
                    value = value;
                    int resourceId11 = a2.getResourceId(attr, this.f2838p);
                    this.f2838p = resourceId11;
                    if (resourceId11 == i2) {
                        this.f2838p = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = i2;
                    value = value;
                    int resourceId12 = a2.getResourceId(attr, this.f2839q);
                    this.f2839q = resourceId12;
                    if (resourceId12 == i2) {
                        this.f2839q = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    i2 = i2;
                    value = value;
                    int resourceId13 = a2.getResourceId(attr, this.f2840r);
                    this.f2840r = resourceId13;
                    if (resourceId13 == i2) {
                        this.f2840r = a2.getInt(attr, i2);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    value = value;
                    int resourceId14 = a2.getResourceId(attr, this.f2841s);
                    this.f2841s = resourceId14;
                    i2 = -1;
                    if (resourceId14 == -1) {
                        this.f2841s = a2.getInt(attr, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    value = value;
                    this.f2842t = a2.getDimensionPixelSize(attr, this.f2842t);
                    i2 = -1;
                    break;
                case 22:
                    value = value;
                    this.f2843u = a2.getDimensionPixelSize(attr, this.f2843u);
                    i2 = -1;
                    break;
                case 23:
                    value = value;
                    this.f2844v = a2.getDimensionPixelSize(attr, this.f2844v);
                    i2 = -1;
                    break;
                case 24:
                    value = value;
                    this.f2845w = a2.getDimensionPixelSize(attr, this.f2845w);
                    i2 = -1;
                    break;
                case 25:
                    value = value;
                    this.f2846x = a2.getDimensionPixelSize(attr, this.f2846x);
                    i2 = -1;
                    break;
                case 26:
                    value = value;
                    this.f2847y = a2.getDimensionPixelSize(attr, this.f2847y);
                    i2 = -1;
                    break;
                case 27:
                    value = value;
                    this.S = a2.getBoolean(attr, this.S);
                    i2 = -1;
                    break;
                case 28:
                    value = value;
                    this.T = a2.getBoolean(attr, this.T);
                    i2 = -1;
                    break;
                case 29:
                    value = value;
                    this.f2848z = a2.getFloat(attr, this.f2848z);
                    i2 = -1;
                    break;
                case 30:
                    value = value;
                    this.A = a2.getFloat(attr, this.A);
                    i2 = -1;
                    break;
                case 31:
                    value = value;
                    int i4 = a2.getInt(attr, value);
                    this.H = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        i2 = -1;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                case 32:
                    value = 0;
                    int i5 = a2.getInt(attr, 0);
                    this.I = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        i2 = -1;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                case 33:
                    try {
                        this.J = a2.getDimensionPixelSize(attr, this.J);
                        value = 0;
                        i2 = -1;
                        break;
                    } catch (Exception e2) {
                        int value2 = a2.getInt(attr, this.J);
                        if (value2 == -2) {
                            this.J = -2;
                        }
                        value = 0;
                        i2 = -1;
                        break;
                    }
                case 34:
                    try {
                        this.L = a2.getDimensionPixelSize(attr, this.L);
                        value = 0;
                        i2 = -1;
                        break;
                    } catch (Exception e3) {
                        int value3 = a2.getInt(attr, this.L);
                        if (value3 == -2) {
                            this.L = -2;
                        }
                        value = 0;
                        i2 = -1;
                        break;
                    }
                case 35:
                    this.N = Math.max(0.0f, a2.getFloat(attr, this.N));
                    this.H = 2;
                    value = 0;
                    i2 = -1;
                    break;
                case 36:
                    try {
                        this.K = a2.getDimensionPixelSize(attr, this.K);
                        value = 0;
                        i2 = -1;
                        break;
                    } catch (Exception e4) {
                        int value4 = a2.getInt(attr, this.K);
                        if (value4 == -2) {
                            this.K = -2;
                        }
                        value = 0;
                        i2 = -1;
                        break;
                    }
                case 37:
                    try {
                        this.M = a2.getDimensionPixelSize(attr, this.M);
                        value = 0;
                        i2 = -1;
                        break;
                    } catch (Exception e5) {
                        int value5 = a2.getInt(attr, this.M);
                        if (value5 == -2) {
                            this.M = -2;
                        }
                        value = 0;
                        i2 = -1;
                        break;
                    }
                case 38:
                    this.O = Math.max(0.0f, a2.getFloat(attr, this.O));
                    this.I = 2;
                    value = 0;
                    i2 = -1;
                    break;
                case 39:
                    value = 0;
                    i2 = -1;
                    break;
                case 40:
                    value = 0;
                    i2 = -1;
                    break;
                case 41:
                    value = 0;
                    i2 = -1;
                    break;
                case 42:
                    value = 0;
                    i2 = -1;
                    break;
                case 43:
                default:
                    i2 = i2;
                    value = value;
                    break;
                case 44:
                    String string = a2.getString(attr);
                    this.B = string;
                    this.C = i2;
                    if (string != null) {
                        int len = string.length();
                        int commaIndex2 = this.B.indexOf(44);
                        if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
                            commaIndex = 0;
                        } else {
                            String dimension = this.B.substring(value, commaIndex2);
                            if (dimension.equalsIgnoreCase("W")) {
                                this.C = value;
                            } else if (dimension.equalsIgnoreCase("H")) {
                                this.C = 1;
                            }
                            commaIndex = commaIndex2 + 1;
                        }
                        int colonIndex = this.B.indexOf(58);
                        if (colonIndex < 0 || colonIndex >= len - 1) {
                            String r2 = this.B.substring(commaIndex);
                            if (r2.length() > 0) {
                                try {
                                    Float.parseFloat(r2);
                                } catch (NumberFormatException e6) {
                                }
                            }
                        } else {
                            String nominator = this.B.substring(commaIndex, colonIndex);
                            String denominator = this.B.substring(colonIndex + 1);
                            if (nominator.length() > 0 && denominator.length() > 0) {
                                try {
                                    float nominatorValue = Float.parseFloat(nominator);
                                    float denominatorValue = Float.parseFloat(denominator);
                                    if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                                        if (this.C == 1) {
                                            Math.abs(denominatorValue / nominatorValue);
                                        } else {
                                            Math.abs(nominatorValue / denominatorValue);
                                        }
                                    }
                                } catch (NumberFormatException e7) {
                                }
                            }
                        }
                        value = 0;
                        i2 = -1;
                        break;
                    } else {
                        value = 0;
                        i2 = -1;
                        break;
                    }
                    break;
                case 45:
                    this.D = a2.getFloat(attr, this.D);
                    i2 = i2;
                    value = value;
                    break;
                case 46:
                    this.E = a2.getFloat(attr, this.E);
                    i2 = i2;
                    value = value;
                    break;
                case 47:
                    this.F = a2.getInt(attr, value);
                    i2 = i2;
                    value = value;
                    break;
                case 48:
                    this.G = a2.getInt(attr, value);
                    i2 = i2;
                    value = value;
                    break;
                case 49:
                    this.P = a2.getDimensionPixelOffset(attr, this.P);
                    i2 = i2;
                    value = value;
                    break;
                case 50:
                    this.Q = a2.getDimensionPixelOffset(attr, this.Q);
                    i2 = i2;
                    value = value;
                    break;
                case 51:
                    this.U = a2.getString(attr);
                    i2 = i2;
                    value = value;
                    break;
            }
        }
        a2.recycle();
        a();
    }

    public void a() {
        this.Y = false;
        this.V = true;
        this.W = true;
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.S) {
            this.V = false;
            if (this.H == 0) {
                this.H = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.T) {
            this.W = false;
            if (this.I == 0) {
                this.I = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.V = false;
            if (i2 == 0 && this.H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.S = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.W = false;
            if (i3 == 0 && this.I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.T = true;
            }
        }
        if (this.f2814c != -1.0f || this.f2810a != -1 || this.f2812b != -1) {
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.f2835m0 instanceof i)) {
                this.f2835m0 = new i();
            }
            ((i) this.f2835m0).e1(this.R);
        }
    }

    public e(int width, int height) {
        super(width, height);
        this.f2810a = -1;
        this.f2812b = -1;
        this.f2814c = -1.0f;
        this.f2816d = -1;
        this.f2818e = -1;
        this.f2820f = -1;
        this.f2822g = -1;
        this.f2824h = -1;
        this.f2826i = -1;
        this.f2828j = -1;
        this.f2830k = -1;
        this.f2832l = -1;
        this.f2834m = -1;
        this.f2836n = 0;
        this.f2837o = 0.0f;
        this.f2838p = -1;
        this.f2839q = -1;
        this.f2840r = -1;
        this.f2841s = -1;
        this.f2842t = -1;
        this.f2843u = -1;
        this.f2844v = -1;
        this.f2845w = -1;
        this.f2846x = -1;
        this.f2847y = -1;
        this.f2848z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f2811a0 = false;
        this.f2813b0 = false;
        this.f2815c0 = -1;
        this.f2817d0 = -1;
        this.f2819e0 = -1;
        this.f2821f0 = -1;
        this.f2823g0 = -1;
        this.f2825h0 = -1;
        this.f2827i0 = 0.5f;
        this.f2835m0 = new g();
    }

    public e(ViewGroup.LayoutParams source) {
        super(source);
        this.f2810a = -1;
        this.f2812b = -1;
        this.f2814c = -1.0f;
        this.f2816d = -1;
        this.f2818e = -1;
        this.f2820f = -1;
        this.f2822g = -1;
        this.f2824h = -1;
        this.f2826i = -1;
        this.f2828j = -1;
        this.f2830k = -1;
        this.f2832l = -1;
        this.f2834m = -1;
        this.f2836n = 0;
        this.f2837o = 0.0f;
        this.f2838p = -1;
        this.f2839q = -1;
        this.f2840r = -1;
        this.f2841s = -1;
        this.f2842t = -1;
        this.f2843u = -1;
        this.f2844v = -1;
        this.f2845w = -1;
        this.f2846x = -1;
        this.f2847y = -1;
        this.f2848z = 0.5f;
        this.A = 0.5f;
        this.B = null;
        this.C = 1;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = false;
        this.T = false;
        this.U = null;
        this.V = true;
        this.W = true;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f2811a0 = false;
        this.f2813b0 = false;
        this.f2815c0 = -1;
        this.f2817d0 = -1;
        this.f2819e0 = -1;
        this.f2821f0 = -1;
        this.f2823g0 = -1;
        this.f2825h0 = -1;
        this.f2827i0 = 0.5f;
        this.f2835m0 = new g();
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public void resolveLayoutDirection(int layoutDirection) {
        int preLeftMargin = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int preRightMargin = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(layoutDirection);
        boolean isRtl = 1 == getLayoutDirection();
        this.f2819e0 = -1;
        this.f2821f0 = -1;
        this.f2815c0 = -1;
        this.f2817d0 = -1;
        this.f2823g0 = -1;
        this.f2825h0 = -1;
        this.f2823g0 = this.f2842t;
        this.f2825h0 = this.f2844v;
        float f2 = this.f2848z;
        this.f2827i0 = f2;
        int i2 = this.f2810a;
        this.f2829j0 = i2;
        int i3 = this.f2812b;
        this.f2831k0 = i3;
        float f3 = this.f2814c;
        this.f2833l0 = f3;
        if (isRtl) {
            boolean startEndDefined = false;
            int i4 = this.f2838p;
            if (i4 != -1) {
                this.f2819e0 = i4;
                startEndDefined = true;
            } else {
                int i5 = this.f2839q;
                if (i5 != -1) {
                    this.f2821f0 = i5;
                    startEndDefined = true;
                }
            }
            int i6 = this.f2840r;
            if (i6 != -1) {
                this.f2817d0 = i6;
                startEndDefined = true;
            }
            int i7 = this.f2841s;
            if (i7 != -1) {
                this.f2815c0 = i7;
                startEndDefined = true;
            }
            int i8 = this.f2846x;
            if (i8 != -1) {
                this.f2825h0 = i8;
            }
            int i9 = this.f2847y;
            if (i9 != -1) {
                this.f2823g0 = i9;
            }
            if (startEndDefined) {
                this.f2827i0 = 1.0f - f2;
            }
            if (this.Y && this.R == 1) {
                if (f3 != -1.0f) {
                    this.f2833l0 = 1.0f - f3;
                    this.f2829j0 = -1;
                    this.f2831k0 = -1;
                } else if (i2 != -1) {
                    this.f2831k0 = i2;
                    this.f2829j0 = -1;
                    this.f2833l0 = -1.0f;
                } else if (i3 != -1) {
                    this.f2829j0 = i3;
                    this.f2831k0 = -1;
                    this.f2833l0 = -1.0f;
                }
            }
        } else {
            int i10 = this.f2838p;
            if (i10 != -1) {
                this.f2817d0 = i10;
            }
            int i11 = this.f2839q;
            if (i11 != -1) {
                this.f2815c0 = i11;
            }
            int i12 = this.f2840r;
            if (i12 != -1) {
                this.f2819e0 = i12;
            }
            int i13 = this.f2841s;
            if (i13 != -1) {
                this.f2821f0 = i13;
            }
            int i14 = this.f2846x;
            if (i14 != -1) {
                this.f2823g0 = i14;
            }
            int i15 = this.f2847y;
            if (i15 != -1) {
                this.f2825h0 = i15;
            }
        }
        if (this.f2840r == -1 && this.f2841s == -1 && this.f2839q == -1 && this.f2838p == -1) {
            int i16 = this.f2820f;
            if (i16 != -1) {
                this.f2819e0 = i16;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                }
            } else {
                int i17 = this.f2822g;
                if (i17 != -1) {
                    this.f2821f0 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                    }
                }
            }
            int i18 = this.f2816d;
            if (i18 != -1) {
                this.f2815c0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                    return;
                }
                return;
            }
            int i19 = this.f2818e;
            if (i19 != -1) {
                this.f2817d0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                }
            }
        }
    }
}
