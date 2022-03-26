package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public int f2857a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f2858b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f2859c;

    /* renamed from: d  reason: collision with root package name */
    public o f2860d;

    public g(Context context, XmlPullParser parser) {
        this.f2859c = -1;
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray a2 = context.obtainStyledAttributes(attrs, r.f2950g);
        int N = a2.getIndexCount();
        for (int i2 = 0; i2 < N; i2++) {
            int attr = a2.getIndex(i2);
            int[] iArr = r.f2944a;
            if (attr == 0) {
                this.f2857a = a2.getResourceId(attr, this.f2857a);
            } else if (attr == 1) {
                this.f2859c = a2.getResourceId(attr, this.f2859c);
                String type = context.getResources().getResourceTypeName(this.f2859c);
                context.getResources().getResourceName(this.f2859c);
                if ("layout".equals(type)) {
                    o oVar = new o();
                    this.f2860d = oVar;
                    oVar.f(context, this.f2859c);
                }
            }
        }
        a2.recycle();
    }

    public void a(h size) {
        this.f2858b.add(size);
    }
}
