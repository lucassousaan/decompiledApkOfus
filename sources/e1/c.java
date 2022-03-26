package e1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.example.helloworld.R;
import com.google.android.material.chip.Chip;
import g0.f;
import java.util.List;
import l0.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Chip f1811q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip view) {
        super(view);
        this.f1811q = chip;
    }

    @Override // l0.d
    public int B(float x2, float y2) {
        boolean l2;
        RectF closeIconTouchBounds;
        l2 = this.f1811q.l();
        if (l2) {
            closeIconTouchBounds = this.f1811q.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(x2, y2)) {
                return 1;
            }
        }
        return 0;
    }

    @Override // l0.d
    public void C(List list) {
        boolean l2;
        View.OnClickListener onClickListener;
        list.add(0);
        l2 = this.f1811q.l();
        if (l2 && this.f1811q.q()) {
            onClickListener = this.f1811q.f1321h;
            if (onClickListener != null) {
                list.add(1);
            }
        }
    }

    @Override // l0.d
    public void O(int virtualViewId, boolean hasFocus) {
        if (virtualViewId == 1) {
            this.f1811q.f1326m = hasFocus;
            this.f1811q.refreshDrawableState();
        }
    }

    @Override // l0.d
    public void N(int virtualViewId, f node) {
        Rect rect;
        Rect closeIconTouchBoundsInt;
        CharSequence charSequence = "";
        if (virtualViewId == 1) {
            CharSequence closeIconContentDescription = this.f1811q.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                node.a0(closeIconContentDescription);
            } else {
                CharSequence chipText = this.f1811q.getText();
                Context context = this.f1811q.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(chipText)) {
                    charSequence = chipText;
                }
                objArr[0] = charSequence;
                node.a0(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            closeIconTouchBoundsInt = this.f1811q.getCloseIconTouchBoundsInt();
            node.S(closeIconTouchBoundsInt);
            node.b(g0.c.f2007e);
            node.b0(this.f1811q.isEnabled());
            return;
        }
        node.a0(charSequence);
        rect = Chip.f1315v;
        node.S(rect);
    }

    @Override // l0.d
    public void M(f node) {
        node.U(this.f1811q.p());
        node.X(this.f1811q.isClickable());
        if (this.f1811q.p() || this.f1811q.isClickable()) {
            node.W(this.f1811q.p() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            node.W("android.view.View");
        }
        CharSequence chipText = this.f1811q.getText();
        node.r0(chipText);
    }

    @Override // l0.d
    public boolean J(int virtualViewId, int action, Bundle arguments) {
        if (action != 16) {
            return false;
        }
        if (virtualViewId == 0) {
            return this.f1811q.performClick();
        }
        if (virtualViewId == 1) {
            return this.f1811q.s();
        }
        return false;
    }
}
