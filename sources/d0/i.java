package d0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1790a = new i();

    @Override // d0.j
    public int a(CharSequence cs, int start, int count) {
        int result = 2;
        int e2 = start + count;
        for (int i2 = start; i2 < e2 && result == 2; i2++) {
            result = n.b(Character.getDirectionality(cs.charAt(i2)));
        }
        return result;
    }
}
