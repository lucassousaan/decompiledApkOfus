package q;

import android.os.Build;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    public int f2869a;

    /* renamed from: b */
    public final m f2870b = new m();

    /* renamed from: c */
    public final l f2871c = new l();

    /* renamed from: d */
    public final k f2872d = new k();

    /* renamed from: e */
    public final n f2873e = new n();

    /* renamed from: f */
    public HashMap f2874f = new HashMap();

    /* renamed from: c */
    public j clone() {
        j clone = new j();
        clone.f2872d.a(this.f2872d);
        clone.f2871c.a(this.f2871c);
        clone.f2870b.a(this.f2870b);
        clone.f2873e.a(this.f2873e);
        clone.f2869a = this.f2869a;
        return clone;
    }

    public final void d(int viewId, e param) {
        this.f2869a = viewId;
        k kVar = this.f2872d;
        kVar.f2890h = param.f2816d;
        kVar.f2892i = param.f2818e;
        kVar.f2894j = param.f2820f;
        kVar.f2896k = param.f2822g;
        kVar.f2897l = param.f2824h;
        kVar.f2898m = param.f2826i;
        kVar.f2899n = param.f2828j;
        kVar.f2900o = param.f2830k;
        kVar.f2901p = param.f2832l;
        kVar.f2902q = param.f2838p;
        kVar.f2903r = param.f2839q;
        kVar.f2904s = param.f2840r;
        kVar.f2905t = param.f2841s;
        kVar.f2906u = param.f2848z;
        kVar.f2907v = param.A;
        kVar.f2908w = param.B;
        kVar.f2909x = param.f2834m;
        kVar.f2910y = param.f2836n;
        kVar.f2911z = param.f2837o;
        kVar.A = param.P;
        kVar.B = param.Q;
        kVar.C = param.R;
        kVar.f2888g = param.f2814c;
        kVar.f2884e = param.f2810a;
        kVar.f2886f = param.f2812b;
        kVar.f2880c = ((ViewGroup.MarginLayoutParams) param).width;
        kVar.f2882d = ((ViewGroup.MarginLayoutParams) param).height;
        kVar.D = ((ViewGroup.MarginLayoutParams) param).leftMargin;
        kVar.E = ((ViewGroup.MarginLayoutParams) param).rightMargin;
        kVar.F = ((ViewGroup.MarginLayoutParams) param).topMargin;
        kVar.G = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
        kVar.P = param.E;
        kVar.Q = param.D;
        kVar.S = param.G;
        kVar.R = param.F;
        kVar.f2891h0 = param.S;
        kVar.f2893i0 = param.T;
        kVar.T = param.H;
        kVar.U = param.I;
        kVar.V = param.L;
        kVar.W = param.M;
        kVar.X = param.J;
        kVar.Y = param.K;
        kVar.Z = param.N;
        kVar.f2877a0 = param.O;
        kVar.f2889g0 = param.U;
        kVar.K = param.f2843u;
        kVar.M = param.f2845w;
        kVar.J = param.f2842t;
        kVar.L = param.f2844v;
        kVar.O = param.f2846x;
        kVar.N = param.f2847y;
        int i2 = Build.VERSION.SDK_INT;
        kVar.H = param.getMarginEnd();
        this.f2872d.I = param.getMarginStart();
    }

    public void b(e param) {
        k kVar = this.f2872d;
        param.f2816d = kVar.f2890h;
        param.f2818e = kVar.f2892i;
        param.f2820f = kVar.f2894j;
        param.f2822g = kVar.f2896k;
        param.f2824h = kVar.f2897l;
        param.f2826i = kVar.f2898m;
        param.f2828j = kVar.f2899n;
        param.f2830k = kVar.f2900o;
        param.f2832l = kVar.f2901p;
        param.f2838p = kVar.f2902q;
        param.f2839q = kVar.f2903r;
        param.f2840r = kVar.f2904s;
        param.f2841s = kVar.f2905t;
        ((ViewGroup.MarginLayoutParams) param).leftMargin = kVar.D;
        ((ViewGroup.MarginLayoutParams) param).rightMargin = kVar.E;
        ((ViewGroup.MarginLayoutParams) param).topMargin = kVar.F;
        ((ViewGroup.MarginLayoutParams) param).bottomMargin = kVar.G;
        param.f2846x = kVar.O;
        param.f2847y = kVar.N;
        param.f2843u = kVar.K;
        param.f2845w = kVar.M;
        param.f2848z = kVar.f2906u;
        param.A = kVar.f2907v;
        param.f2834m = kVar.f2909x;
        param.f2836n = kVar.f2910y;
        param.f2837o = kVar.f2911z;
        param.B = kVar.f2908w;
        param.P = kVar.A;
        param.Q = kVar.B;
        param.E = kVar.P;
        param.D = kVar.Q;
        param.G = kVar.S;
        param.F = kVar.R;
        param.S = kVar.f2891h0;
        param.T = kVar.f2893i0;
        param.H = kVar.T;
        param.I = kVar.U;
        param.L = kVar.V;
        param.M = kVar.W;
        param.J = kVar.X;
        param.K = kVar.Y;
        param.N = kVar.Z;
        param.O = kVar.f2877a0;
        param.R = kVar.C;
        param.f2814c = kVar.f2888g;
        param.f2810a = kVar.f2884e;
        param.f2812b = kVar.f2886f;
        ((ViewGroup.MarginLayoutParams) param).width = kVar.f2880c;
        ((ViewGroup.MarginLayoutParams) param).height = kVar.f2882d;
        String str = kVar.f2889g0;
        if (str != null) {
            param.U = str;
        }
        param.setMarginStart(kVar.I);
        param.setMarginEnd(this.f2872d.H);
        param.a();
    }
}
