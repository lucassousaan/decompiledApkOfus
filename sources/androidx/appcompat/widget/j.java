package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import com.example.helloworld.R;
import h.c0;
import h.g0;
import h.m0;
import h.t;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j extends c0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q f375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Context context, m0 subMenu, View anchorView) {
        super(context, subMenu, anchorView, false, R.attr.actionOverflowMenuStyle);
        g0 g0Var;
        this.f375m = qVar;
        t item = (t) subMenu.getItem();
        if (!item.l()) {
            View view = qVar.f482j;
            if (view == null) {
                g0Var = qVar.f2072i;
                view = (View) g0Var;
            }
            f(view);
        }
        j(qVar.f497y);
    }

    @Override // h.c0
    public void e() {
        q qVar = this.f375m;
        qVar.f494v = null;
        Objects.requireNonNull(qVar);
        super.e();
    }
}
