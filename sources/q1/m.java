package q1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class m extends d {

    /* renamed from: a  reason: collision with root package name */
    public float f3351a = -1.0f;

    @Override // q1.d
    public void a(c0 shapePath, float angle, float interpolation, float radius) {
        shapePath.o(0.0f, radius * interpolation, 180.0f, 180.0f - angle);
        shapePath.a(0.0f, 0.0f, radius * 2.0f * interpolation, 2.0f * radius * interpolation, 180.0f, angle);
    }
}
