package k;

import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f2298d;

    public c(d this$0) {
        this.f2298d = this$0;
    }

    @Override // k.m
    public int d() {
        return this.f2298d.f2307d;
    }

    @Override // k.m
    public Object b(int index, int offset) {
        return this.f2298d.f2306c[index];
    }

    @Override // k.m
    public int e(Object key) {
        return this.f2298d.e(key);
    }

    @Override // k.m
    public int f(Object value) {
        return this.f2298d.e(value);
    }

    @Override // k.m
    public Map c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // k.m
    public void g(Object obj, Object obj2) {
        this.f2298d.add(obj);
    }

    @Override // k.m
    public Object i(int index, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // k.m
    public void h(int index) {
        this.f2298d.h(index);
    }

    @Override // k.m
    public void a() {
        this.f2298d.clear();
    }
}
