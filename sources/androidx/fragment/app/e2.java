package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e2 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f751a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f752b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f753c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f754d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f755e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f756f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h2 f757g;

    public e2(h2 this$0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f757g = this$0;
        this.f751a = obj;
        this.f752b = arrayList;
        this.f753c = obj2;
        this.f754d = arrayList2;
        this.f755e = obj3;
        this.f756f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        Object obj = this.f751a;
        if (obj != null) {
            this.f757g.w(obj, this.f752b, null);
        }
        Object obj2 = this.f753c;
        if (obj2 != null) {
            this.f757g.w(obj2, this.f754d, null);
        }
        Object obj3 = this.f755e;
        if (obj3 != null) {
            this.f757g.w(obj3, this.f756f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }
}
