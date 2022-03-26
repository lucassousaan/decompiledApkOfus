package c0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f1212b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1213c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1214d;

    public j(String str, Context context, g gVar, int i2) {
        this.f1211a = str;
        this.f1212b = context;
        this.f1213c = gVar;
        this.f1214d = i2;
    }

    /* renamed from: a */
    public l call() {
        try {
            return m.c(this.f1211a, this.f1212b, this.f1213c, this.f1214d);
        } catch (Throwable th) {
            return new l(-3);
        }
    }
}
