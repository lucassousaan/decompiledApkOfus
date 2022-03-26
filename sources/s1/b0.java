package s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f3458b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3459c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f3460d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c0 f3461e;

    public b0(c0 this$0, int i2, TextView textView, int i3, TextView textView2) {
        this.f3461e = this$0;
        this.f3457a = i2;
        this.f3458b = textView;
        this.f3459c = i3;
        this.f3460d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        TextView textView;
        TextView textView2;
        this.f3461e.f3470h = this.f3457a;
        this.f3461e.f3468f = null;
        TextView textView3 = this.f3458b;
        if (textView3 != null) {
            textView3.setVisibility(4);
            if (this.f3459c == 1) {
                textView = this.f3461e.f3474l;
                if (textView != null) {
                    textView2 = this.f3461e.f3474l;
                    textView2.setText((CharSequence) null);
                }
            }
        }
        TextView textView4 = this.f3460d;
        if (textView4 != null) {
            textView4.setTranslationY(0.0f);
            this.f3460d.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        TextView textView = this.f3460d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
