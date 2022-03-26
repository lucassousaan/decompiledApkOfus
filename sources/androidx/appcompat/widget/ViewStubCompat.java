package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.a;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f222b;

    /* renamed from: c  reason: collision with root package name */
    public int f223c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f224d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f225e;

    /* renamed from: f  reason: collision with root package name */
    public k4 f226f;

    public ViewStubCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f222b = 0;
        TypedArray a2 = context.obtainStyledAttributes(attrs, a.f1192z, defStyle, 0);
        int[] iArr = a.f1167a;
        this.f223c = a2.getResourceId(2, -1);
        this.f222b = a2.getResourceId(1, 0);
        setId(a2.getResourceId(0, -1));
        a2.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f223c;
    }

    public void setInflatedId(int inflatedId) {
        this.f223c = inflatedId;
    }

    public int getLayoutResource() {
        return this.f222b;
    }

    public void setLayoutResource(int layoutResource) {
        this.f222b = layoutResource;
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        this.f225e = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f225e;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        WeakReference weakReference = this.f224d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(visibility);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(visibility);
        if (visibility == 0 || visibility == 4) {
            a();
        }
    }

    public View a() {
        LayoutInflater factory;
        ViewParent viewParent = getParent();
        if (!(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f222b != 0) {
            ViewGroup parent = (ViewGroup) viewParent;
            if (this.f225e != null) {
                factory = this.f225e;
            } else {
                factory = LayoutInflater.from(getContext());
            }
            View view = factory.inflate(this.f222b, parent, false);
            int i2 = this.f223c;
            if (i2 != -1) {
                view.setId(i2);
            }
            int index = parent.indexOfChild(this);
            parent.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            } else {
                parent.addView(view, index);
            }
            this.f224d = new WeakReference(view);
            k4 k4Var = this.f226f;
            if (k4Var != null) {
                k4Var.a(this, view);
            }
            return view;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(k4 inflateListener) {
        this.f226f = inflateListener;
    }
}
