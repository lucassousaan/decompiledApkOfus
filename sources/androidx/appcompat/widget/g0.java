package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g0 extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public final x f324b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f325c;

    public g0(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        p3.b(context);
        o3.a(this, getContext());
        x xVar = new x(this);
        this.f324b = xVar;
        xVar.e(attrs, defStyleAttr);
        h0 h0Var = new h0(this);
        this.f325c = h0Var;
        h0Var.e(attrs, defStyleAttr);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int resId) {
        this.f325c.f(resId);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        x xVar = this.f324b;
        if (xVar != null) {
            xVar.g(resId);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        x xVar = this.f324b;
        if (xVar != null) {
            xVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        x xVar = this.f324b;
        if (xVar != null) {
            xVar.i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        x xVar = this.f324b;
        if (xVar != null) {
            return xVar.c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        x xVar = this.f324b;
        if (xVar != null) {
            xVar.j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        x xVar = this.f324b;
        if (xVar != null) {
            return xVar.d();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList tint) {
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            h0Var.g(tint);
        }
    }

    public ColorStateList getSupportImageTintList() {
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            return h0Var.b();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            h0Var.h(tintMode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            return h0Var.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f324b;
        if (xVar != null) {
            xVar.b();
        }
        h0 h0Var = this.f325c;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f325c.d() && super.hasOverlappingRendering();
    }
}
