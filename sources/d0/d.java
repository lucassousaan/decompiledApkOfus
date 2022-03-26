package d0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1780a;

    /* renamed from: c  reason: collision with root package name */
    public int f1782c = 1;

    /* renamed from: d  reason: collision with root package name */
    public int f1783d = 1;

    /* renamed from: b  reason: collision with root package name */
    public TextDirectionHeuristic f1781b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

    public d(TextPaint paint) {
        this.f1780a = paint;
    }

    public d b(int strategy) {
        this.f1782c = strategy;
        return this;
    }

    public d c(int frequency) {
        this.f1783d = frequency;
        return this;
    }

    public d d(TextDirectionHeuristic textDir) {
        this.f1781b = textDir;
        return this;
    }

    public e a() {
        return new e(this.f1780a, this.f1781b, this.f1782c, this.f1783d);
    }
}
