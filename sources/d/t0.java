package d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: d  reason: collision with root package name */
    public static t0 f1738d;

    /* renamed from: a  reason: collision with root package name */
    public long f1739a;

    /* renamed from: b  reason: collision with root package name */
    public long f1740b;

    /* renamed from: c  reason: collision with root package name */
    public int f1741c;

    public static t0 b() {
        if (f1738d == null) {
            f1738d = new t0();
        }
        return f1738d;
    }

    public void a(long time, double latitude, double longitude) {
        float daysSince2000 = ((float) (time - 946728000000L)) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double trueAnomaly = meanAnomaly + (Math.sin(meanAnomaly) * 0.03341960161924362d) + (Math.sin(2.0f * meanAnomaly) * 3.4906598739326E-4d) + (Math.sin(3.0f * meanAnomaly) * 5.236000106378924E-6d);
        double solarLng = 1.796593063d + trueAnomaly + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        float n2 = (float) Math.round((daysSince2000 - 9.0E-4f) - arcLongitude);
        double trueAnomaly2 = meanAnomaly;
        double solarTransitJ2000 = 9.0E-4f + n2 + arcLongitude + (Math.sin(trueAnomaly2) * 0.0053d) + (Math.sin(2.0d * solarLng) * (-0.0069d));
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0d) {
            this.f1741c = 1;
            this.f1739a = -1L;
            this.f1740b = -1L;
        } else if (cosHourAngle <= -1.0d) {
            this.f1741c = 0;
            this.f1739a = -1L;
            this.f1740b = -1L;
        } else {
            float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
            this.f1739a = Math.round((hourAngle + solarTransitJ2000) * 8.64E7d) + 946728000000L;
            long round = Math.round((solarTransitJ2000 - hourAngle) * 8.64E7d) + 946728000000L;
            this.f1740b = round;
            if (round >= time || this.f1739a <= time) {
                this.f1741c = 1;
            } else {
                this.f1741c = 0;
            }
        }
    }
}
