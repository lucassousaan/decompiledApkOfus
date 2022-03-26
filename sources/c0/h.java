package c0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f1207b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1208c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1209d;

    public h(String str, Context context, g gVar, int i2) {
        this.f1206a = str;
        this.f1207b = context;
        this.f1208c = gVar;
        this.f1209d = i2;
    }

    /* renamed from: a */
    public l call() {
        return m.c(this.f1206a, this.f1207b, this.f1208c, this.f1209d);
    }
}
