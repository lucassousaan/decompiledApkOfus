package k;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends m {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f2296d;

    public a(b this$0) {
        this.f2296d = this$0;
    }

    @Override // k.m
    public int d() {
        return this.f2296d.f2346d;
    }

    @Override // k.m
    public Object b(int index, int offset) {
        return this.f2296d.f2345c[(index << 1) + offset];
    }

    @Override // k.m
    public int e(Object key) {
        return this.f2296d.f(key);
    }

    @Override // k.m
    public int f(Object value) {
        return this.f2296d.h(value);
    }

    @Override // k.m
    public Map c() {
        return this.f2296d;
    }

    @Override // k.m
    public void g(Object obj, Object obj2) {
        this.f2296d.put(obj, obj2);
    }

    @Override // k.m
    public Object i(int index, Object obj) {
        return this.f2296d.k(index, obj);
    }

    @Override // k.m
    public void h(int index) {
        this.f2296d.j(index);
    }

    @Override // k.m
    public void a() {
        this.f2296d.clear();
    }
}
