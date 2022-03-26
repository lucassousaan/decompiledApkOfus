package c0;

import android.net.Uri;
import e0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f1224a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1225b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1226c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1227d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1228e;

    public o(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
        h.e(uri);
        this.f1224a = uri;
        this.f1225b = ttcIndex;
        this.f1226c = weight;
        this.f1227d = italic;
        this.f1228e = resultCode;
    }

    public static o a(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
        return new o(uri, ttcIndex, weight, italic, resultCode);
    }

    public Uri d() {
        return this.f1224a;
    }

    public int c() {
        return this.f1225b;
    }

    public int e() {
        return this.f1226c;
    }

    public boolean f() {
        return this.f1227d;
    }

    public int b() {
        return this.f1228e;
    }
}
