package o1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2694a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2695b = {16842910, 16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final String f2696c = a.class.getSimpleName();

    static {
        new int[1][0] = 16842919;
        int[] iArr = {16843623, 16842908};
        new int[1][0] = 16842908;
        new int[1][0] = 16843623;
        int[] iArr2 = {16842913, 16842919};
        int[] iArr3 = {16842913, 16843623, 16842908};
        int[] iArr4 = {16842913, 16842908};
        int[] iArr5 = {16842913, 16843623};
        new int[1][0] = 16842913;
    }

    public static ColorStateList a(ColorStateList rippleColor) {
        if (rippleColor == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(rippleColor.getDefaultColor()) == 0 && Color.alpha(rippleColor.getColorForState(f2695b, 0)) != 0) {
            Log.w(f2696c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return rippleColor;
    }

    public static boolean b(int[] stateSet) {
        boolean enabled = false;
        boolean interactedState = false;
        for (int state : stateSet) {
            if (state == 16842910) {
                enabled = true;
            } else if (state == 16842908) {
                interactedState = true;
            } else if (state == 16842919) {
                interactedState = true;
            } else if (state == 16843623) {
                interactedState = true;
            }
        }
        return enabled && interactedState;
    }
}
