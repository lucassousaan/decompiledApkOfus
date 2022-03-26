package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import k.b;
import s0.a;
import u.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b2 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f720a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final j2 f721b = new h2();

    /* renamed from: c  reason: collision with root package name */
    public static final j2 f722c = c();

    public static j2 c() {
        try {
            return (j2) a.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.String> */
    public static String b(b bVar, String value) {
        int numElements = bVar.size();
        for (int i2 = 0; i2 < numElements; i2++) {
            if (value.equals(bVar.l(i2))) {
                return (String) bVar.i(i2);
            }
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, android.view.View> */
    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.String> */
    public static void d(b bVar, b bVar2) {
        for (int i2 = bVar.size() - 1; i2 >= 0; i2--) {
            String targetName = (String) bVar.l(i2);
            if (!bVar2.containsKey(targetName)) {
                bVar.j(i2);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, android.view.View> */
    public static void a(f0 inFragment, f0 outFragment, boolean isPop, b bVar, boolean isStart) {
        if (isPop) {
            outFragment.s();
        } else {
            inFragment.s();
        }
        k sharedElementCallback = null;
        if (0 != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int count = bVar == null ? 0 : bVar.size();
            for (int i2 = 0; i2 < count; i2++) {
                arrayList2.add(bVar.i(i2));
                arrayList.add(bVar.l(i2));
            }
            if (isStart) {
                sharedElementCallback.c(arrayList2, arrayList, null);
            } else {
                sharedElementCallback.b(arrayList2, arrayList, null);
            }
        }
    }

    public static void e(ArrayList arrayList, int visibility) {
        if (arrayList != null) {
            for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                View view = (View) arrayList.get(i2);
                view.setVisibility(visibility);
            }
        }
    }
}
