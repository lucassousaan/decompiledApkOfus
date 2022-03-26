package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n0 extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final l0 f440b;

    public n0(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.ratingBarStyle);
    }

    public n0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        o3.a(this, getContext());
        l0 l0Var = new l0(this);
        this.f440b = l0Var;
        l0Var.c(attrs, defStyleAttr);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f440b.b();
        if (sampleTile != null) {
            int width = sampleTile.getWidth() * getNumStars();
            setMeasuredDimension(View.resolveSizeAndState(width, widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
