package q1;

import android.graphics.Matrix;
import java.util.BitSet;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f3302a;

    public g(j this$0) {
        this.f3302a = this$0;
    }

    public void a(c0 cornerPath, Matrix transform, int count) {
        BitSet a2 = j.a(this.f3302a);
        cornerPath.e();
        a2.set(count, false);
        j.b(this.f3302a)[count] = cornerPath.f(transform);
    }

    public void b(c0 edgePath, Matrix transform, int count) {
        edgePath.e();
        j.a(this.f3302a).set(count + 4, false);
        j.c(this.f3302a)[count] = edgePath.f(transform);
    }
}
