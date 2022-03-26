package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import c0.o;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import w.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f3691a = new ConcurrentHashMap();

    public abstract Typeface a(Context context, b bVar, Resources resources, int i2);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, o[] oVarArr, int i2);

    /* JADX WARN: Generic types in debug info not equals: x.k != androidx.core.graphics.TypefaceCompatBaseImpl$StyleExtractor<T> */
    public static Object e(Object[] objArr, int style, k kVar) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        Object obj = null;
        int bestScore = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int score = (Math.abs(kVar.a(obj2) - targetWeight) * 2) + (kVar.b(obj2) == isTargetItalic ? 0 : 1);
            if (obj == null || bestScore > score) {
                obj = obj2;
                bestScore = score;
            }
        }
        return obj;
    }

    public o f(o[] fonts, int style) {
        return (o) e(fonts, style, new j(this));
    }

    public Typeface c(Context context, InputStream is) {
        File tmpFile = m.e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!m.d(tmpFile, is)) {
                return null;
            }
            return Typeface.createFromFile(tmpFile.getPath());
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = m.e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!m.c(tmpFile, resources, id)) {
                return null;
            }
            return Typeface.createFromFile(tmpFile.getPath());
        } catch (RuntimeException e2) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }
}
