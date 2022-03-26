package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import l.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: h  reason: collision with root package name */
    public static SparseIntArray f2912h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2913a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f2914b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f2915c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f2916d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f2917e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f2918f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f2919g = Float.NaN;

    public void a(l src) {
        this.f2913a = src.f2913a;
        this.f2914b = src.f2914b;
        this.f2915c = src.f2915c;
        this.f2916d = src.f2916d;
        this.f2917e = src.f2917e;
        this.f2919g = src.f2919g;
        this.f2918f = src.f2918f;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2912h = sparseIntArray;
        int[] iArr = r.f2944a;
        sparseIntArray.append(2, 1);
        f2912h.append(4, 2);
        f2912h.append(5, 3);
        f2912h.append(1, 4);
        f2912h.append(0, 5);
        f2912h.append(3, 6);
    }

    public void b(Context context, AttributeSet attrs) {
        int n2;
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2948e);
        this.f2913a = true;
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            switch (f2912h.get(attr)) {
                case 1:
                    this.f2919g = a2.getFloat(attr, this.f2919g);
                    break;
                case 2:
                    this.f2916d = a2.getInt(attr, this.f2916d);
                    break;
                case 3:
                    TypedValue type = a2.peekValue(attr);
                    if (type.type == 3) {
                        this.f2915c = a2.getString(attr);
                        break;
                    } else {
                        this.f2915c = a.f2354b[a2.getInteger(attr, 0)];
                        break;
                    }
                case 4:
                    this.f2917e = a2.getInt(attr, 0);
                    break;
                case 5:
                    n2 = o.n(a2, attr, this.f2914b);
                    this.f2914b = n2;
                    break;
                case 6:
                    this.f2918f = a2.getFloat(attr, this.f2918f);
                    break;
            }
        }
        a2.recycle();
    }
}
