package b1;

import android.view.View;
import l1.w;
import q1.a;
import q1.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: e  reason: collision with root package name */
    public static final c f1161e = new a(0.0f);

    /* renamed from: a  reason: collision with root package name */
    public c f1162a;

    /* renamed from: b  reason: collision with root package name */
    public c f1163b;

    /* renamed from: c  reason: collision with root package name */
    public c f1164c;

    /* renamed from: d  reason: collision with root package name */
    public c f1165d;

    public i(c topLeft, c bottomLeft, c topRight, c bottomRight) {
        this.f1162a = topLeft;
        this.f1163b = topRight;
        this.f1164c = bottomRight;
        this.f1165d = bottomLeft;
    }

    public static i e(i orig, View view) {
        return w.d(view) ? d(orig) : c(orig);
    }

    public static i b(i orig, View view) {
        return w.d(view) ? c(orig) : d(orig);
    }

    public static i c(i orig) {
        c cVar = orig.f1162a;
        c cVar2 = orig.f1165d;
        c cVar3 = f1161e;
        return new i(cVar, cVar2, cVar3, cVar3);
    }

    public static i d(i orig) {
        c cVar = f1161e;
        return new i(cVar, cVar, orig.f1163b, orig.f1164c);
    }

    public static i f(i orig) {
        c cVar = orig.f1162a;
        c cVar2 = f1161e;
        return new i(cVar, cVar2, orig.f1163b, cVar2);
    }

    public static i a(i orig) {
        c cVar = f1161e;
        return new i(cVar, orig.f1165d, cVar, orig.f1164c);
    }
}
