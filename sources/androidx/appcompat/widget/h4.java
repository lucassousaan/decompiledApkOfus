package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import f0.c1;
import f0.d1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public static h4 f341k;

    /* renamed from: l  reason: collision with root package name */
    public static h4 f342l;

    /* renamed from: b  reason: collision with root package name */
    public final View f343b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f344c;

    /* renamed from: d  reason: collision with root package name */
    public final int f345d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f346e = new f4(this);

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f347f = new g4(this);

    /* renamed from: g  reason: collision with root package name */
    public int f348g;

    /* renamed from: h  reason: collision with root package name */
    public int f349h;

    /* renamed from: i  reason: collision with root package name */
    public i4 f350i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f351j;

    public static void f(View view, CharSequence tooltipText) {
        h4 h4Var = f341k;
        if (h4Var != null && h4Var.f343b == view) {
            e(null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            h4 h4Var2 = f342l;
            if (h4Var2 != null && h4Var2.f343b == view) {
                h4Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new h4(view, tooltipText);
    }

    public h4(View anchor, CharSequence tooltipText) {
        this.f343b = anchor;
        this.f344c = tooltipText;
        this.f345d = d1.c(ViewConfiguration.get(anchor.getContext()));
        b();
        anchor.setOnLongClickListener(this);
        anchor.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v2) {
        this.f348g = v2.getWidth() / 2;
        this.f349h = v2.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View v2, MotionEvent event) {
        if (this.f350i != null && this.f351j) {
            return false;
        }
        AccessibilityManager manager = (AccessibilityManager) this.f343b.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        switch (event.getAction()) {
            case 7:
                if (this.f343b.isEnabled() && this.f350i == null && h(event)) {
                    e(this);
                    break;
                }
                break;
            case 10:
                b();
                c();
                break;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        c();
    }

    public void g(boolean fromTouch) {
        long timeout;
        if (c1.O(this.f343b)) {
            e(null);
            h4 h4Var = f342l;
            if (h4Var != null) {
                h4Var.c();
            }
            f342l = this;
            this.f351j = fromTouch;
            i4 i4Var = new i4(this.f343b.getContext());
            this.f350i = i4Var;
            i4Var.e(this.f343b, this.f348g, this.f349h, this.f351j, this.f344c);
            this.f343b.addOnAttachStateChangeListener(this);
            if (this.f351j) {
                timeout = 2500;
            } else if ((c1.J(this.f343b) & 1) == 1) {
                timeout = 3000 - ViewConfiguration.getLongPressTimeout();
            } else {
                timeout = 15000 - ViewConfiguration.getLongPressTimeout();
            }
            this.f343b.removeCallbacks(this.f347f);
            this.f343b.postDelayed(this.f347f, timeout);
        }
    }

    public void c() {
        if (f342l == this) {
            f342l = null;
            i4 i4Var = this.f350i;
            if (i4Var != null) {
                i4Var.c();
                this.f350i = null;
                b();
                this.f343b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f341k == this) {
            e(null);
        }
        this.f343b.removeCallbacks(this.f347f);
    }

    public static void e(h4 handler) {
        h4 h4Var = f341k;
        if (h4Var != null) {
            h4Var.a();
        }
        f341k = handler;
        if (handler != null) {
            handler.d();
        }
    }

    public final void d() {
        this.f343b.postDelayed(this.f346e, ViewConfiguration.getLongPressTimeout());
    }

    public final void a() {
        this.f343b.removeCallbacks(this.f346e);
    }

    public final boolean h(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f348g) <= this.f345d && Math.abs(newAnchorY - this.f349h) <= this.f345d) {
            return false;
        }
        this.f348g = newAnchorX;
        this.f349h = newAnchorY;
        return true;
    }

    public final void b() {
        this.f348g = Integer.MAX_VALUE;
        this.f349h = Integer.MAX_VALUE;
    }
}
