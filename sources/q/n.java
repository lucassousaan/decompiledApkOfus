package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n {

    /* renamed from: n  reason: collision with root package name */
    public static SparseIntArray f2925n;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2926a = false;

    /* renamed from: b  reason: collision with root package name */
    public float f2927b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f2928c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f2929d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f2930e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f2931f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f2932g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f2933h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f2934i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f2935j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f2936k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2937l = false;

    /* renamed from: m  reason: collision with root package name */
    public float f2938m = 0.0f;

    public void a(n src) {
        this.f2926a = src.f2926a;
        this.f2927b = src.f2927b;
        this.f2928c = src.f2928c;
        this.f2929d = src.f2929d;
        this.f2930e = src.f2930e;
        this.f2931f = src.f2931f;
        this.f2932g = src.f2932g;
        this.f2933h = src.f2933h;
        this.f2934i = src.f2934i;
        this.f2935j = src.f2935j;
        this.f2936k = src.f2936k;
        this.f2937l = src.f2937l;
        this.f2938m = src.f2938m;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2925n = sparseIntArray;
        int[] iArr = r.f2944a;
        sparseIntArray.append(6, 1);
        f2925n.append(7, 2);
        f2925n.append(8, 3);
        f2925n.append(4, 4);
        f2925n.append(5, 5);
        f2925n.append(0, 6);
        f2925n.append(1, 7);
        f2925n.append(2, 8);
        f2925n.append(3, 9);
        f2925n.append(9, 10);
        f2925n.append(10, 11);
    }

    public void b(Context context, AttributeSet attrs) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2951h);
        this.f2926a = true;
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            switch (f2925n.get(attr)) {
                case 1:
                    this.f2927b = a2.getFloat(attr, this.f2927b);
                    break;
                case 2:
                    this.f2928c = a2.getFloat(attr, this.f2928c);
                    break;
                case 3:
                    this.f2929d = a2.getFloat(attr, this.f2929d);
                    break;
                case 4:
                    this.f2930e = a2.getFloat(attr, this.f2930e);
                    break;
                case 5:
                    this.f2931f = a2.getFloat(attr, this.f2931f);
                    break;
                case 6:
                    this.f2932g = a2.getDimension(attr, this.f2932g);
                    break;
                case 7:
                    this.f2933h = a2.getDimension(attr, this.f2933h);
                    break;
                case 8:
                    this.f2934i = a2.getDimension(attr, this.f2934i);
                    break;
                case 9:
                    this.f2935j = a2.getDimension(attr, this.f2935j);
                    break;
                case 10:
                    this.f2936k = a2.getDimension(attr, this.f2936k);
                    break;
                case 11:
                    this.f2937l = true;
                    this.f2938m = a2.getDimension(attr, this.f2938m);
                    break;
            }
        }
        a2.recycle();
    }
}
