package i1;

import android.content.Context;
import android.graphics.Color;
import com.example.helloworld.R;
import n1.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2264a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2265b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2266c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2267d;

    public a(Context context) {
        this.f2264a = c.b(context, R.attr.elevationOverlayEnabled, false);
        this.f2265b = f1.a.a(context, R.attr.elevationOverlayColor, 0);
        this.f2266c = f1.a.a(context, R.attr.colorSurface, 0);
        this.f2267d = context.getResources().getDisplayMetrics().density;
    }

    public int c(int backgroundColor, float elevation) {
        if (!this.f2264a || !e(backgroundColor)) {
            return backgroundColor;
        }
        return b(backgroundColor, elevation);
    }

    public int b(int backgroundColor, float elevation) {
        float overlayAlphaFraction = a(elevation);
        int backgroundAlpha = Color.alpha(backgroundColor);
        int backgroundColorOpaque = x.a.d(backgroundColor, 255);
        int overlayColorOpaque = f1.a.f(backgroundColorOpaque, this.f2265b, overlayAlphaFraction);
        return x.a.d(overlayColorOpaque, backgroundAlpha);
    }

    public float a(float elevation) {
        float f2 = this.f2267d;
        if (f2 <= 0.0f || elevation <= 0.0f) {
            return 0.0f;
        }
        float elevationDp = elevation / f2;
        float alphaFraction = ((((float) Math.log1p(elevationDp)) * 4.5f) + 2.0f) / 100.0f;
        return Math.min(alphaFraction, 1.0f);
    }

    public boolean d() {
        return this.f2264a;
    }

    public final boolean e(int color) {
        return x.a.d(color, 255) == this.f2266c;
    }
}
