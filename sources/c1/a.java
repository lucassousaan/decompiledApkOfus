package c1;

import android.graphics.Canvas;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public static int a(Canvas canvas, float left, float top, float right, float bottom, int alpha) {
        return canvas.saveLayerAlpha(left, top, right, bottom, alpha);
    }
}
