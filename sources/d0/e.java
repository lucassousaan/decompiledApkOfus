package d0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import e0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1784a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f1785b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1786c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1787d;

    public e(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(paint).setBreakStrategy(strategy).setHyphenationFrequency(frequency).setTextDirection(textDir).build();
        }
        this.f1784a = paint;
        this.f1785b = textDir;
        this.f1786c = strategy;
        this.f1787d = frequency;
    }

    public e(PrecomputedText.Params wrapped) {
        this.f1784a = wrapped.getTextPaint();
        this.f1785b = wrapped.getTextDirection();
        this.f1786c = wrapped.getBreakStrategy();
        this.f1787d = wrapped.getHyphenationFrequency();
    }

    public TextPaint e() {
        return this.f1784a;
    }

    public TextDirectionHeuristic d() {
        return this.f1785b;
    }

    public int b() {
        return this.f1786c;
    }

    public int c() {
        return this.f1787d;
    }

    public boolean a(e other) {
        if (this.f1786c == other.b() && this.f1787d == other.c() && this.f1784a.getTextSize() == other.e().getTextSize() && this.f1784a.getTextScaleX() == other.e().getTextScaleX() && this.f1784a.getTextSkewX() == other.e().getTextSkewX() && this.f1784a.getLetterSpacing() == other.e().getLetterSpacing() && TextUtils.equals(this.f1784a.getFontFeatureSettings(), other.e().getFontFeatureSettings()) && this.f1784a.getFlags() == other.e().getFlags() && this.f1784a.getTextLocales().equals(other.e().getTextLocales())) {
            return this.f1784a.getTypeface() == null ? other.e().getTypeface() == null : this.f1784a.getTypeface().equals(other.e().getTypeface());
        }
        return false;
    }

    public boolean equals(Object o2) {
        if (o2 == this) {
            return true;
        }
        if (!(o2 instanceof e)) {
            return false;
        }
        e other = (e) o2;
        return a(other) && this.f1785b == other.d();
    }

    public int hashCode() {
        return c.b(Float.valueOf(this.f1784a.getTextSize()), Float.valueOf(this.f1784a.getTextScaleX()), Float.valueOf(this.f1784a.getTextSkewX()), Float.valueOf(this.f1784a.getLetterSpacing()), Integer.valueOf(this.f1784a.getFlags()), this.f1784a.getTextLocales(), this.f1784a.getTypeface(), Boolean.valueOf(this.f1784a.isElegantTextHeight()), this.f1785b, Integer.valueOf(this.f1786c), Integer.valueOf(this.f1787d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("textSize=" + this.f1784a.getTextSize());
        sb.append(", textScaleX=" + this.f1784a.getTextScaleX());
        sb.append(", textSkewX=" + this.f1784a.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + this.f1784a.getLetterSpacing());
        sb.append(", elegantTextHeight=" + this.f1784a.isElegantTextHeight());
        sb.append(", textLocale=" + this.f1784a.getTextLocales());
        sb.append(", typeface=" + this.f1784a.getTypeface());
        if (i2 >= 26) {
            sb.append(", variationSettings=" + this.f1784a.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f1785b);
        sb.append(", breakStrategy=" + this.f1786c);
        sb.append(", hyphenationFrequency=" + this.f1787d);
        sb.append("}");
        return sb.toString();
    }
}
