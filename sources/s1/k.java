package s1;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.example.helloworld.R;
import com.google.android.material.textfield.TextInputLayout;
import e.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k extends a0 {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3501d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f3502e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    public final r0 f3503f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    public final s0 f3504g = new e(this);

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f3505h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f3506i;

    public k(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // s1.a0
    public void a() {
        this.f3453a.setEndIconDrawable(a.b(this.f3454b, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f3453a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f3453a.setEndIconOnClickListener(new f(this));
        this.f3453a.e(this.f3503f);
        this.f3453a.f(this.f3504g);
        m();
    }

    @Override // s1.a0
    public void c(boolean visible) {
        if (this.f3453a.getSuffixText() != null) {
            i(visible);
        }
    }

    public final void i(boolean show) {
        boolean shouldSkipAnimation = this.f3453a.K() == show;
        if (show && !this.f3505h.isRunning()) {
            this.f3506i.cancel();
            this.f3505h.start();
            if (shouldSkipAnimation) {
                this.f3505h.end();
            }
        } else if (!show) {
            this.f3505h.cancel();
            this.f3506i.start();
            if (shouldSkipAnimation) {
                this.f3506i.end();
            }
        }
    }

    public final void m() {
        ValueAnimator scaleAnimator = k();
        ValueAnimator fadeAnimator = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3505h = animatorSet;
        animatorSet.playTogether(scaleAnimator, fadeAnimator);
        this.f3505h.addListener(new g(this));
        ValueAnimator j2 = j(1.0f, 0.0f);
        this.f3506i = j2;
        j2.addListener(new h(this));
    }

    public final ValueAnimator j(float... values) {
        ValueAnimator animator = ValueAnimator.ofFloat(values);
        animator.setInterpolator(w0.a.f3651a);
        animator.setDuration(100L);
        animator.addUpdateListener(new i(this));
        return animator;
    }

    public final ValueAnimator k() {
        ValueAnimator animator = ValueAnimator.ofFloat(0.8f, 1.0f);
        animator.setInterpolator(w0.a.f3654d);
        animator.setDuration(150L);
        animator.addUpdateListener(new j(this));
        return animator;
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }
}
