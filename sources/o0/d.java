package o0;

import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k.o;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d extends d0 {

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f2690c = new c();

    /* renamed from: b  reason: collision with root package name */
    public o f2691b = new o();

    public static d f(g0 viewModelStore) {
        return (d) new f0(viewModelStore, f2690c).a(d.class);
    }

    public void g() {
        int size = this.f2691b.j();
        for (int index = 0; index < size; index++) {
            b info = (b) this.f2691b.k(index);
            info.l();
        }
    }

    @Override // androidx.lifecycle.d0
    public void d() {
        super.d();
        int size = this.f2691b.j();
        for (int index = 0; index < size; index++) {
            b info = (b) this.f2691b.k(index);
            info.j(true);
        }
        this.f2691b.b();
    }

    public void e(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        if (this.f2691b.j() > 0) {
            writer.print(prefix);
            writer.println("Loaders:");
            String innerPrefix = prefix + "    ";
            for (int i2 = 0; i2 < this.f2691b.j(); i2++) {
                b info = (b) this.f2691b.k(i2);
                writer.print(prefix);
                writer.print("  #");
                writer.print(this.f2691b.h(i2));
                writer.print(": ");
                writer.println(info.toString());
                info.k(innerPrefix, fd, writer, args);
            }
        }
    }
}
