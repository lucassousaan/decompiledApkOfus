package d0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final h f1788b = new h(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1789a;

    @Override // d0.j
    public int a(CharSequence cs, int start, int count) {
        boolean haveUnlookedFor = false;
        int e2 = start + count;
        for (int i2 = start; i2 < e2; i2++) {
            switch (n.a(Character.getDirectionality(cs.charAt(i2)))) {
                case 0:
                    return 0;
                case 1:
                    haveUnlookedFor = true;
                    break;
            }
        }
        if (haveUnlookedFor) {
            return 1;
        }
        return 2;
    }

    public h(boolean lookForRtl) {
        this.f1789a = lookForRtl;
    }
}
