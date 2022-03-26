package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l2 extends Writer {

    /* renamed from: b  reason: collision with root package name */
    public final String f832b;

    /* renamed from: c  reason: collision with root package name */
    public StringBuilder f833c = new StringBuilder(128);

    public l2(String tag) {
        this.f832b = tag;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        for (int i2 = 0; i2 < count; i2++) {
            char c2 = buf[offset + i2];
            if (c2 == '\n') {
                a();
            } else {
                this.f833c.append(c2);
            }
        }
    }

    public final void a() {
        if (this.f833c.length() > 0) {
            Log.d(this.f832b, this.f833c.toString());
            StringBuilder sb = this.f833c;
            sb.delete(0, sb.length());
        }
    }
}
