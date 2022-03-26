package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.s3;
import h.g0;
import h.p;
import h.q;
import h.t;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements p, g0, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f75c = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    public q f76b;

    public ExpandedMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        setOnItemClickListener(this);
        s3 a2 = s3.v(context, attrs, f75c, defStyleAttr, 0);
        if (a2.s(0)) {
            setBackgroundDrawable(a2.g(0));
        }
        if (a2.s(1)) {
            setDivider(a2.g(1));
        }
        a2.w();
    }

    @Override // h.g0
    public void b(q menu) {
        this.f76b = menu;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // h.p
    public boolean f(t item) {
        return this.f76b.L(item, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView parent, View v2, int position, long id) {
        f((t) getAdapter().getItem(position));
    }

    public int getWindowAnimations() {
        return 0;
    }
}
