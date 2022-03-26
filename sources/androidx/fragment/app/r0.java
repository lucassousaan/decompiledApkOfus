package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import e0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class r0 extends n0 {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f894b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f895c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f896d;

    /* renamed from: e  reason: collision with root package name */
    public final m1 f897e;

    public abstract Object m();

    public abstract LayoutInflater n();

    public abstract void o();

    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<E> */
    public r0(j0 activity) {
        this(activity, activity, new Handler(), 0);
    }

    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<E> */
    public r0(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f897e = new n1();
        this.f894b = activity;
        h.f(context, "context == null");
        this.f895c = context;
        h.f(handler, "handler == null");
        this.f896d = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<E> */
    public Activity j() {
        return this.f894b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<E> */
    public Context k() {
        return this.f895c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Generic types in debug info not equals: androidx.fragment.app.r0 != androidx.fragment.app.FragmentHostCallback<E> */
    public Handler l() {
        return this.f896d;
    }
}
