package q1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import p1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f3394b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f3395c;

    public v(c0 this$0, List list, Matrix matrix) {
        this.f3394b = list;
        this.f3395c = matrix;
    }

    @Override // q1.b0
    public void a(Matrix matrix, a shadowRenderer, int shadowElevation, Canvas canvas) {
        for (b0 op : this.f3394b) {
            op.a(this.f3395c, shadowRenderer, shadowElevation, canvas);
        }
    }
}
