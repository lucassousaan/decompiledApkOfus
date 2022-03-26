package l1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: n  reason: collision with root package name */
    public static final int f2441n = 1;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f2442a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f2443b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2444c;

    /* renamed from: e  reason: collision with root package name */
    public int f2446e;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2453l;

    /* renamed from: d  reason: collision with root package name */
    public int f2445d = 0;

    /* renamed from: f  reason: collision with root package name */
    public Layout.Alignment f2447f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g  reason: collision with root package name */
    public int f2448g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public float f2449h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f2450i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public int f2451j = 1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2452k = true;

    /* renamed from: m  reason: collision with root package name */
    public TextUtils.TruncateAt f2454m = null;

    public l(CharSequence source, TextPaint paint, int width) {
        this.f2442a = source;
        this.f2443b = paint;
        this.f2444c = width;
        this.f2446e = source.length();
    }

    public static l b(CharSequence source, TextPaint paint, int width) {
        return new l(source, paint, width);
    }

    public l c(Layout.Alignment alignment) {
        this.f2447f = alignment;
        return this;
    }

    public l f(boolean includePad) {
        this.f2452k = includePad;
        return this;
    }

    public l i(int maxLines) {
        this.f2448g = maxLines;
        return this;
    }

    public l h(float spacingAdd, float lineSpacingMultiplier) {
        this.f2449h = spacingAdd;
        this.f2450i = lineSpacingMultiplier;
        return this;
    }

    public l e(int hyphenationFrequency) {
        this.f2451j = hyphenationFrequency;
        return this;
    }

    public l d(TextUtils.TruncateAt ellipsize) {
        this.f2454m = ellipsize;
        return this;
    }

    public StaticLayout a() {
        if (this.f2442a == null) {
            this.f2442a = "";
        }
        int availableWidth = Math.max(0, this.f2444c);
        CharSequence textToDraw = this.f2442a;
        if (this.f2448g == 1) {
            textToDraw = TextUtils.ellipsize(this.f2442a, this.f2443b, availableWidth, this.f2454m);
        }
        int min = Math.min(textToDraw.length(), this.f2446e);
        this.f2446e = min;
        if (this.f2453l && this.f2448g == 1) {
            this.f2447f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builder = StaticLayout.Builder.obtain(textToDraw, 0, min, this.f2443b, availableWidth);
        builder.setAlignment(this.f2447f);
        builder.setIncludePad(this.f2452k);
        TextDirectionHeuristic textDirectionHeuristic = this.f2453l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        builder.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f2454m;
        if (truncateAt != null) {
            builder.setEllipsize(truncateAt);
        }
        builder.setMaxLines(this.f2448g);
        float f2 = this.f2449h;
        if (!(f2 == 0.0f && this.f2450i == 1.0f)) {
            builder.setLineSpacing(f2, this.f2450i);
        }
        if (this.f2448g > 1) {
            builder.setHyphenationFrequency(this.f2451j);
        }
        return builder.build();
    }

    public l g(boolean isRtl) {
        this.f2453l = isRtl;
        return this;
    }
}
