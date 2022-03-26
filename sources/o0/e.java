package o0;

import androidx.lifecycle.g0;
import androidx.lifecycle.m;
import e0.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public final m f2692a;

    /* renamed from: b  reason: collision with root package name */
    public final d f2693b;

    public e(m lifecycleOwner, g0 viewModelStore) {
        this.f2692a = lifecycleOwner;
        this.f2693b = d.f(viewModelStore);
    }

    @Override // o0.a
    public void c() {
        this.f2693b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.a(this.f2692a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // o0.a
    public void a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        this.f2693b.e(prefix, fd, writer, args);
    }
}
