package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a0 implements i0, e0, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Rect f2050b;

    public abstract void l(q qVar);

    public abstract void p(View view);

    public abstract void r(boolean z2);

    public abstract void s(int i2);

    public abstract void t(int i2);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z2);

    public abstract void w(int i2);

    public void q(Rect bounds) {
        this.f2050b = bounds;
    }

    public Rect n() {
        return this.f2050b;
    }

    @Override // h.e0
    public void f(Context context, q menu) {
    }

    @Override // h.e0
    public boolean c(q menu, t item) {
        return false;
    }

    @Override // h.e0
    public boolean j(q menu, t item) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) adapterView.getAdapter();
        n wrappedAdapter = y(outerAdapter);
        wrappedAdapter.f2143b.M((MenuItem) outerAdapter.getItem(position), this, m() ? 0 : 4);
    }

    public static int o(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            int positionType = adapter.getItemViewType(i2);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            if (parent == null) {
                parent = new FrameLayout(context);
            }
            itemView = adapter.getView(i2, itemView, parent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            int itemWidth = itemView.getMeasuredWidth();
            if (itemWidth >= maxAllowedWidth) {
                return maxAllowedWidth;
            }
            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }
        return maxWidth;
    }

    public static n y(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (n) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (n) adapter;
    }

    public static boolean x(q menu) {
        int count = menu.size();
        for (int i2 = 0; i2 < count; i2++) {
            MenuItem childItem = menu.getItem(i2);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        return true;
    }
}
