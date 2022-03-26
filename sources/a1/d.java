package a1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import q1.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f7a;

    public d(BottomSheetBehavior this$0) {
        this.f7a = this$0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        j jVar;
        j jVar2;
        float value = ((Float) animation.getAnimatedValue()).floatValue();
        jVar = this.f7a.f1269j;
        if (jVar != null) {
            jVar2 = this.f7a.f1269j;
            jVar2.U(value);
        }
    }
}
