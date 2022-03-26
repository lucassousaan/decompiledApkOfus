package i;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        c.d().a(command);
    }
}
