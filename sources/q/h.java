package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public float f2861a;

    /* renamed from: b  reason: collision with root package name */
    public float f2862b;

    /* renamed from: c  reason: collision with root package name */
    public float f2863c;

    /* renamed from: d  reason: collision with root package name */
    public float f2864d;

    /* renamed from: e  reason: collision with root package name */
    public int f2865e;

    /* renamed from: f  reason: collision with root package name */
    public o f2866f;

    public h(Context context, XmlPullParser parser) {
        this.f2861a = Float.NaN;
        this.f2862b = Float.NaN;
        this.f2863c = Float.NaN;
        this.f2864d = Float.NaN;
        this.f2865e = -1;
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2952i);
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            int[] iArr = r.f2944a;
            if (attr == 0) {
                this.f2865e = a2.getResourceId(attr, this.f2865e);
                String type = context.getResources().getResourceTypeName(this.f2865e);
                context.getResources().getResourceName(this.f2865e);
                if ("layout".equals(type)) {
                    o oVar = new o();
                    this.f2866f = oVar;
                    oVar.f(context, this.f2865e);
                }
            } else if (attr == 1) {
                this.f2864d = a2.getDimension(attr, this.f2864d);
            } else if (attr == 2) {
                this.f2862b = a2.getDimension(attr, this.f2862b);
            } else if (attr == 3) {
                this.f2863c = a2.getDimension(attr, this.f2863c);
            } else if (attr == 4) {
                this.f2861a = a2.getDimension(attr, this.f2861a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        a2.recycle();
    }
}
