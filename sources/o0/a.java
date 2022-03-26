package o0;

import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();

    public static a b(m mVar) {
        return new e(mVar, ((h0) mVar).d());
    }
}
