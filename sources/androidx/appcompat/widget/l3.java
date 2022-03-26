package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l3 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f423a;

    /* renamed from: e  reason: collision with root package name */
    public final int f427e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f428f;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f424b = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f426d = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final Rect f425c = new Rect();

    public l3(Rect targetBounds, Rect actualBounds, View delegateView) {
        super(targetBounds, delegateView);
        this.f427e = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
        a(targetBounds, actualBounds);
        this.f423a = delegateView;
    }

    public void a(Rect desiredBounds, Rect actualBounds) {
        this.f424b.set(desiredBounds);
        this.f426d.set(desiredBounds);
        Rect rect = this.f426d;
        int i2 = this.f427e;
        rect.inset(-i2, -i2);
        this.f425c.set(actualBounds);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent event) {
        int x2 = (int) event.getX();
        int y2 = (int) event.getY();
        boolean sendToDelegate = false;
        boolean hit = true;
        switch (event.getAction()) {
            case 0:
                if (this.f424b.contains(x2, y2)) {
                    this.f428f = true;
                    sendToDelegate = true;
                    break;
                }
                break;
            case 1:
            case 2:
                sendToDelegate = this.f428f;
                if (sendToDelegate && !this.f426d.contains(x2, y2)) {
                    hit = false;
                    break;
                }
                break;
            case 3:
                sendToDelegate = this.f428f;
                this.f428f = false;
                break;
        }
        if (!sendToDelegate) {
            return false;
        }
        if (!hit || this.f425c.contains(x2, y2)) {
            Rect rect = this.f425c;
            event.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            event.setLocation(this.f423a.getWidth() / 2, this.f423a.getHeight() / 2);
        }
        boolean handled = this.f423a.dispatchTouchEvent(event);
        return handled;
    }
}
