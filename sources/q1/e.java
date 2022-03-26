package q1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    public float f3301a = -1.0f;

    @Override // q1.d
    public void a(c0 shapePath, float angle, float interpolation, float radius) {
        shapePath.o(0.0f, radius * interpolation, 180.0f, 180.0f - angle);
        shapePath.m((float) (Math.sin(Math.toRadians(angle)) * radius * interpolation), (float) (Math.sin(Math.toRadians(90.0f - angle)) * radius * interpolation));
    }
}
