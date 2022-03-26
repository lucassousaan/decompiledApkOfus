package androidx.lifecycle;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Map f1006a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f1007b;

    public a(Map map) {
        this.f1007b = map;
        for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : map.entrySet()) {
            h event = (h) entry.getValue();
            List<ClassesInfoCache.MethodReference> methodReferences = (List) this.f1006a.get(event);
            if (methodReferences == null) {
                methodReferences = new ArrayList<>();
                this.f1006a.put(event, methodReferences);
            }
            methodReferences.add(entry.getKey());
        }
    }

    public void a(m source, h event, Object target) {
        b((List) this.f1006a.get(event), source, event, target);
        b((List) this.f1006a.get(h.ON_ANY), source, event, target);
    }

    public static void b(List list, m source, h event, Object mWrapped) {
        if (list != null) {
            for (int i2 = list.size() - 1; i2 >= 0; i2--) {
                ((b) list.get(i2)).a(source, event, mWrapped);
            }
        }
    }
}
