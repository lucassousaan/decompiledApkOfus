package x0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h extends b {

    /* renamed from: a  reason: collision with root package name */
    public i f3707a;

    /* renamed from: b  reason: collision with root package name */
    public int f3708b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3709c = 0;

    /* JADX WARN: Generic types in debug info not equals: x0.h != com.google.android.material.appbar.ViewOffsetBehavior<V> */
    public h() {
    }

    /* JADX WARN: Generic types in debug info not equals: x0.h != com.google.android.material.appbar.ViewOffsetBehavior<V> */
    public h(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX WARN: Generic types in debug info not equals: x0.h != com.google.android.material.appbar.ViewOffsetBehavior<V> */
    @Override // s.b
    public boolean l(CoordinatorLayout parent, View view, int layoutDirection) {
        F(parent, view, layoutDirection);
        if (this.f3707a == null) {
            this.f3707a = new i(view);
        }
        this.f3707a.c();
        this.f3707a.a();
        int i2 = this.f3708b;
        if (i2 != 0) {
            this.f3707a.e(i2);
            this.f3708b = 0;
        }
        int i3 = this.f3709c;
        if (i3 == 0) {
            return true;
        }
        this.f3707a.d(i3);
        this.f3709c = 0;
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: x0.h != com.google.android.material.appbar.ViewOffsetBehavior<V> */
    public void F(CoordinatorLayout parent, View view, int layoutDirection) {
        parent.I(view, layoutDirection);
    }

    /* JADX WARN: Generic types in debug info not equals: x0.h != com.google.android.material.appbar.ViewOffsetBehavior<V> */
    public boolean G(int offset) {
        i iVar = this.f3707a;
        if (iVar != null) {
            return iVar.e(offset);
        }
        this.f3708b = offset;
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: x0.h != com.google.android.material.appbar.ViewOffsetBehavior<V> */
    public int E() {
        i iVar = this.f3707a;
        if (iVar != null) {
            return iVar.b();
        }
        return 0;
    }
}
