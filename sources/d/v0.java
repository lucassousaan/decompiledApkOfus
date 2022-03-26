package d;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import java.util.Objects;
import v.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: d  reason: collision with root package name */
    public static v0 f1746d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1747a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f1748b;

    /* renamed from: c  reason: collision with root package name */
    public final u0 f1749c = new u0();

    public static v0 a(Context context) {
        if (f1746d == null) {
            Context context2 = context.getApplicationContext();
            f1746d = new v0(context2, (LocationManager) context2.getSystemService("location"));
        }
        return f1746d;
    }

    public v0(Context context, LocationManager locationManager) {
        this.f1747a = context;
        this.f1748b = locationManager;
    }

    public boolean d() {
        u0 state = this.f1749c;
        if (e()) {
            return state.f1743a;
        }
        Location location = b();
        if (location != null) {
            f(location);
            return state.f1743a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(11);
        return hour < 6 || hour >= 22;
    }

    public final Location b() {
        Location coarseLoc = null;
        Location fineLoc = null;
        int permission = e.b(this.f1747a, "android.permission.ACCESS_COARSE_LOCATION");
        if (permission == 0) {
            coarseLoc = c("network");
        }
        int permission2 = e.b(this.f1747a, "android.permission.ACCESS_FINE_LOCATION");
        if (permission2 == 0) {
            fineLoc = c("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    public final Location c(String provider) {
        try {
            if (this.f1748b.isProviderEnabled(provider)) {
                return this.f1748b.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public final boolean e() {
        return this.f1749c.f1744b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long nextUpdate;
        long nextUpdate2;
        u0 state = this.f1749c;
        long now = System.currentTimeMillis();
        t0 calculator = t0.b();
        calculator.a(now - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = calculator.f1739a;
        calculator.a(now, location.getLatitude(), location.getLongitude());
        boolean isNight = true;
        if (calculator.f1741c != 1) {
            isNight = false;
        }
        long todaySunrise = calculator.f1740b;
        long todaySunset = calculator.f1739a;
        calculator.a(86400000 + now, location.getLatitude(), location.getLongitude());
        long tomorrowSunrise = calculator.f1740b;
        if (todaySunrise == -1 || todaySunset == -1) {
            nextUpdate = now + 43200000;
        } else {
            if (now > todaySunset) {
                nextUpdate2 = 0 + tomorrowSunrise;
            } else if (now > todaySunrise) {
                nextUpdate2 = 0 + todaySunset;
            } else {
                nextUpdate2 = 0 + todaySunrise;
            }
            nextUpdate = nextUpdate2 + 60000;
        }
        state.f1743a = isNight;
        Objects.requireNonNull(state);
        Objects.requireNonNull(state);
        Objects.requireNonNull(state);
        Objects.requireNonNull(state);
        state.f1744b = nextUpdate;
    }
}
