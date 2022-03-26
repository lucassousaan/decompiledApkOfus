package v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {
    public static Drawable b(Context obj, int id) {
        return obj.getDrawable(id);
    }

    public static File c(Context obj) {
        return obj.getNoBackupFilesDir();
    }

    public static File a(Context obj) {
        return obj.getCodeCacheDir();
    }
}
