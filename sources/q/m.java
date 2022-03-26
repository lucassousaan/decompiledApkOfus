package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2920a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f2921b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2922c = 0;

    /* renamed from: d  reason: collision with root package name */
    public float f2923d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f2924e = Float.NaN;

    public void a(m src) {
        this.f2920a = src.f2920a;
        this.f2921b = src.f2921b;
        this.f2923d = src.f2923d;
        this.f2924e = src.f2924e;
        this.f2922c = src.f2922c;
    }

    public void b(Context context, AttributeSet attrs) {
        int[] unused;
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2949f);
        this.f2920a = true;
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            int[] iArr = r.f2944a;
            if (attr == 1) {
                this.f2923d = a2.getFloat(attr, this.f2923d);
            } else if (attr == 0) {
                this.f2921b = a2.getInt(attr, this.f2921b);
                unused = o.f2939d;
                this.f2921b = o.f2939d[this.f2921b];
            } else if (attr == 4) {
                this.f2922c = a2.getInt(attr, this.f2922c);
            } else if (attr == 3) {
                this.f2924e = a2.getFloat(attr, this.f2924e);
            }
        }
        a2.recycle();
    }
}
