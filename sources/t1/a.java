package t1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.helloworld.R;
import g.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3556a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3557b = {R.attr.materialThemeOverlay};

    public static Context c(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int materialThemeOverlayId = b(context, attrs, defStyleAttr, defStyleRes);
        boolean contextHasOverlay = (context instanceof e) && ((e) context).c() == materialThemeOverlayId;
        if (materialThemeOverlayId == 0 || contextHasOverlay) {
            return context;
        }
        Context contextThemeWrapper = new e(context, materialThemeOverlayId);
        int androidThemeOverlayId = a(context, attrs);
        if (androidThemeOverlayId != 0) {
            contextThemeWrapper.getTheme().applyStyle(androidThemeOverlayId, true);
        }
        return contextThemeWrapper;
    }

    public static int a(Context context, AttributeSet attrs) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, f3556a);
        int androidThemeId = a2.getResourceId(0, 0);
        int appThemeId = a2.getResourceId(1, 0);
        a2.recycle();
        return androidThemeId != 0 ? androidThemeId : appThemeId;
    }

    public static int b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a2 = context.obtainStyledAttributes(attrs, f3557b, defStyleAttr, defStyleRes);
        int materialThemeOverlayId = a2.getResourceId(0, 0);
        a2.recycle();
        return materialThemeOverlayId;
    }
}
