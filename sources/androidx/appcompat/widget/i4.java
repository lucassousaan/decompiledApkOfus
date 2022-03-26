package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f368a;

    /* renamed from: b  reason: collision with root package name */
    public final View f369b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f370c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f371d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f372e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f373f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f374g = new int[2];

    public i4(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f371d = layoutParams;
        this.f368a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f369b = inflate;
        this.f370c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755013;
        layoutParams.flags = 24;
    }

    public void e(View anchorView, int anchorX, int anchorY, boolean fromTouch, CharSequence tooltipText) {
        if (d()) {
            c();
        }
        this.f370c.setText(tooltipText);
        a(anchorView, anchorX, anchorY, fromTouch, this.f371d);
        WindowManager wm = (WindowManager) this.f368a.getSystemService("window");
        wm.addView(this.f369b, this.f371d);
    }

    public void c() {
        if (d()) {
            WindowManager wm = (WindowManager) this.f368a.getSystemService("window");
            wm.removeView(this.f369b);
        }
    }

    public boolean d() {
        return this.f369b.getParent() != null;
    }

    public final void a(View anchorView, int anchorX, int anchorY, boolean fromTouch, WindowManager.LayoutParams outParams) {
        int offsetX;
        int offsetBelow;
        int offsetExtra;
        int statusBarHeight;
        outParams.token = anchorView.getApplicationWindowToken();
        int tooltipPreciseAnchorThreshold = this.f368a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        } else {
            int offsetX2 = anchorView.getWidth();
            offsetX = offsetX2 / 2;
        }
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            int offsetExtra2 = this.f368a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra2;
            offsetExtra = anchorY - offsetExtra2;
        } else {
            offsetBelow = anchorView.getHeight();
            offsetExtra = 0;
        }
        outParams.gravity = 49;
        int tooltipOffset = this.f368a.getResources().getDimensionPixelOffset(fromTouch ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        View appView = b(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.f372e);
        Rect rect = this.f372e;
        if (rect.left < 0 && rect.top < 0) {
            Resources res = this.f368a.getResources();
            int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } else {
                statusBarHeight = 0;
            }
            DisplayMetrics metrics = res.getDisplayMetrics();
            this.f372e.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.f374g);
        anchorView.getLocationOnScreen(this.f373f);
        int[] iArr = this.f373f;
        int i2 = iArr[0];
        int[] iArr2 = this.f374g;
        iArr[0] = i2 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        outParams.x = (iArr[0] + offsetX) - (appView.getWidth() / 2);
        int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f369b.measure(spec, spec);
        int tooltipHeight = this.f369b.getMeasuredHeight();
        int[] iArr3 = this.f373f;
        int yAbove = ((iArr3[1] + offsetExtra) - tooltipOffset) - tooltipHeight;
        int yBelow = iArr3[1] + offsetBelow + tooltipOffset;
        if (fromTouch) {
            if (yAbove >= 0) {
                outParams.y = yAbove;
            } else {
                outParams.y = yBelow;
            }
        } else if (yBelow + tooltipHeight <= this.f372e.height()) {
            outParams.y = yBelow;
        } else {
            outParams.y = yAbove;
        }
    }

    public static View b(View anchorView) {
        View rootView = anchorView.getRootView();
        ViewGroup.LayoutParams lp = rootView.getLayoutParams();
        if ((lp instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) lp).type == 2) {
            return rootView;
        }
        for (Context context = anchorView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
