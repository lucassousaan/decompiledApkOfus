package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import f.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class t1 extends a {

    /* renamed from: c  reason: collision with root package name */
    public boolean f540c = true;

    public t1(Drawable drawable) {
        super(drawable);
    }

    public void c(boolean enabled) {
        this.f540c = enabled;
    }

    @Override // f.a, android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        if (this.f540c) {
            return super.setState(stateSet);
        }
        return false;
    }

    @Override // f.a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f540c) {
            super.draw(canvas);
        }
    }

    @Override // f.a, android.graphics.drawable.Drawable
    public void setHotspot(float x2, float y2) {
        if (this.f540c) {
            super.setHotspot(x2, y2);
        }
    }

    @Override // f.a, android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        if (this.f540c) {
            super.setHotspotBounds(left, top, right, bottom);
        }
    }

    @Override // f.a, android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        if (this.f540c) {
            return super.setVisible(visible, restart);
        }
        return false;
    }
}
