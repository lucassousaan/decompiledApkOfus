package w0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(AnimatorSet animatorSet, List list) {
        long totalDuration = 0;
        int count = list.size();
        for (int i2 = 0; i2 < count; i2++) {
            Animator animator = (Animator) list.get(i2);
            totalDuration = Math.max(totalDuration, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(totalDuration);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
