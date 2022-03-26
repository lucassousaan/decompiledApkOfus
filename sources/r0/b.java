package r0;

import android.os.Trace;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(String label) {
        Trace.beginSection(label);
    }

    public static void b() {
        Trace.endSection();
    }
}
