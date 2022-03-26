package b0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class d {
    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Field traceTagAppField = Trace.class.getField("TRACE_TAG_APP");
                traceTagAppField.getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void a(String sectionName) {
        Trace.beginSection(sectionName);
    }

    public static void b() {
        Trace.endSection();
    }
}
