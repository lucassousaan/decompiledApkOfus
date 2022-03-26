package c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k.g;
import k.n;
import x.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final g f1218a = new g(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f1219b = v.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1220c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final n f1221d = new n();

    public static Typeface e(Context context, g request, c callback, int style, int timeoutInMillis) {
        String id = a(request, style);
        Typeface cached = (Typeface) f1218a.c(id);
        if (cached != null) {
            callback.b(new l(cached));
            return cached;
        } else if (timeoutInMillis == -1) {
            l typefaceResult = c(id, context, request, style);
            callback.b(typefaceResult);
            return typefaceResult.f1216a;
        } else {
            Callable<FontRequestWorker.TypefaceResult> fetcher = new h(id, context, request, style);
            try {
                l typefaceResult2 = (l) v.c(f1219b, fetcher, timeoutInMillis);
                callback.b(typefaceResult2);
                return typefaceResult2.f1216a;
            } catch (InterruptedException e2) {
                callback.b(new l(-3));
                return null;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: e0.a != androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker$TypefaceResult> */
    public static Typeface d(Context context, g request, int style, Executor executor, c callback) {
        String id = a(request, style);
        Typeface cached = (Typeface) f1218a.c(id);
        if (cached != null) {
            callback.b(new l(cached));
            return cached;
        }
        i iVar = new i(callback);
        synchronized (f1220c) {
            n nVar = f1221d;
            ArrayList<Consumer<FontRequestWorker.TypefaceResult>> pendingReplies = (ArrayList) nVar.get(id);
            if (pendingReplies != null) {
                pendingReplies.add(iVar);
                return null;
            }
            ArrayList<Consumer<FontRequestWorker.TypefaceResult>> pendingReplies2 = new ArrayList<>();
            pendingReplies2.add(iVar);
            nVar.put(id, pendingReplies2);
            Callable<FontRequestWorker.TypefaceResult> fetcher = new j(id, context, request, style);
            Executor finalExecutor = executor == null ? f1219b : executor;
            v.b(finalExecutor, fetcher, new k(id));
            return null;
        }
    }

    public static String a(g request, int style) {
        return request.d() + "-" + style;
    }

    public static l c(String cacheId, Context context, g request, int style) {
        g gVar = f1218a;
        Typeface cached = (Typeface) gVar.c(cacheId);
        if (cached != null) {
            return new l(cached);
        }
        try {
            n result = f.d(context, request, null);
            int fontFamilyResultStatus = b(result);
            if (fontFamilyResultStatus != 0) {
                return new l(fontFamilyResultStatus);
            }
            Typeface typeface = d.b(context, null, result.b(), style);
            if (typeface == null) {
                return new l(-3);
            }
            gVar.d(cacheId, typeface);
            return new l(typeface);
        } catch (PackageManager.NameNotFoundException e2) {
            return new l(-1);
        }
    }

    public static int b(n fontFamilyResult) {
        if (fontFamilyResult.c() != 0) {
            switch (fontFamilyResult.c()) {
                case 1:
                    return -2;
                default:
                    return -3;
            }
        } else {
            o[] fonts = fontFamilyResult.b();
            if (fonts == null || fonts.length == 0) {
                return 1;
            }
            for (o font : fonts) {
                int resultCode = font.b();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    } else {
                        return resultCode;
                    }
                }
            }
            return 0;
        }
    }
}
