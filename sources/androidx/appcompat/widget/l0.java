package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import y.b;
import y.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f416c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f417a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f418b;

    public l0(ProgressBar view) {
        this.f417a = view;
    }

    public void c(AttributeSet attrs, int defStyleAttr) {
        s3 a2 = s3.v(this.f417a.getContext(), attrs, f416c, defStyleAttr, 0);
        Drawable drawable = a2.h(0);
        if (drawable != null) {
            this.f417a.setIndeterminateDrawable(e(drawable));
        }
        Drawable drawable2 = a2.h(1);
        if (drawable2 != null) {
            this.f417a.setProgressDrawable(d(drawable2, false));
        }
        a2.w();
    }

    public final Drawable d(Drawable drawable, boolean clip) {
        if (drawable instanceof b) {
            Drawable inner = ((c) ((b) drawable)).a();
            if (inner != null) {
                ((c) ((b) drawable)).b(d(inner, clip));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable background = (LayerDrawable) drawable;
            int N = background.getNumberOfLayers();
            Drawable[] outDrawables = new Drawable[N];
            for (int i2 = 0; i2 < N; i2++) {
                int id = background.getId(i2);
                outDrawables[i2] = d(background.getDrawable(i2), id == 16908301 || id == 16908303);
            }
            LayerDrawable newBg = new LayerDrawable(outDrawables);
            for (int i3 = 0; i3 < N; i3++) {
                newBg.setId(i3, background.getId(i3));
            }
            return newBg;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap tileBitmap = bitmapDrawable.getBitmap();
            if (this.f418b == null) {
                this.f418b = tileBitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            BitmapShader bitmapShader = new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
            shapeDrawable.getPaint().setShader(bitmapShader);
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable background = (AnimationDrawable) drawable;
        int N = background.getNumberOfFrames();
        AnimationDrawable newBg = new AnimationDrawable();
        newBg.setOneShot(background.isOneShot());
        for (int i2 = 0; i2 < N; i2++) {
            Drawable frame = d(background.getFrame(i2), true);
            frame.setLevel(10000);
            newBg.addFrame(frame, background.getDuration(i2));
        }
        newBg.setLevel(10000);
        return newBg;
    }

    public final Shape a() {
        float[] roundedCorners = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
        return new RoundRectShape(roundedCorners, null, null);
    }

    public Bitmap b() {
        return this.f418b;
    }
}
