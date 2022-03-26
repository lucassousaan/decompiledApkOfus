package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class m0 {
    public static k0 b(Context context, f0 fragment, boolean enter, boolean isPop) {
        int transit = fragment.A();
        int nextAnim = a(fragment, enter, isPop);
        fragment.g1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.G;
        if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            fragment.G.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.G;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        fragment.g0(transit, enter, nextAnim);
        if (0 != 0) {
            return new k0((Animation) null);
        }
        fragment.h0(transit, enter, nextAnim);
        if (0 != 0) {
            return new k0((Animator) null);
        }
        if (nextAnim == 0 && transit != 0) {
            nextAnim = c(transit, enter);
        }
        if (nextAnim != 0) {
            String dir = context.getResources().getResourceTypeName(nextAnim);
            boolean isAnim = "anim".equals(dir);
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (animation != null) {
                        return new k0(animation);
                    }
                    successfulLoad = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                }
            }
            if (!successfulLoad) {
                try {
                    Animator animator = AnimatorInflater.loadAnimator(context, nextAnim);
                    if (animator != null) {
                        return new k0(animator);
                    }
                } catch (RuntimeException e4) {
                    if (!isAnim) {
                        Animation animation2 = AnimationUtils.loadAnimation(context, nextAnim);
                        if (animation2 != null) {
                            return new k0(animation2);
                        }
                    } else {
                        throw e4;
                    }
                }
            }
        }
        return null;
    }

    public static int a(f0 fragment, boolean enter, boolean isPop) {
        if (isPop) {
            if (enter) {
                return fragment.D();
            }
            return fragment.E();
        } else if (enter) {
            return fragment.q();
        } else {
            return fragment.t();
        }
    }

    public static int c(int transit, boolean enter) {
        switch (transit) {
            case 4097:
                int animAttr = enter ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                return animAttr;
            case 4099:
                int animAttr2 = enter ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                return animAttr2;
            case 8194:
                int animAttr3 = enter ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                return animAttr3;
            default:
                return -1;
        }
    }
}
