package h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public q f2143b;

    /* renamed from: c  reason: collision with root package name */
    public int f2144c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2145d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2146e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f2147f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2148g;

    public n(q menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f2146e = overflowOnly;
        this.f2147f = inflater;
        this.f2143b = menu;
        this.f2148g = itemLayoutRes;
        a();
    }

    public void d(boolean forceShow) {
        this.f2145d = forceShow;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> items = this.f2146e ? this.f2143b.z() : this.f2143b.E();
        if (this.f2144c < 0) {
            return items.size();
        }
        return items.size() - 1;
    }

    public q b() {
        return this.f2143b;
    }

    /* renamed from: c */
    public t getItem(int position) {
        ArrayList<MenuItemImpl> items = this.f2146e ? this.f2143b.z() : this.f2143b.E();
        int i2 = this.f2144c;
        if (i2 >= 0 && position >= i2) {
            position++;
        }
        return (t) items.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f2147f.inflate(this.f2148g, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        int prevGroupId = position + (-1) >= 0 ? getItem(position - 1).getGroupId() : currGroupId;
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f2143b.F() && currGroupId != prevGroupId);
        f0 itemView = (f0) convertView;
        if (this.f2145d) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.c(getItem(position), 0);
        return convertView;
    }

    public void a() {
        t expandedItem = this.f2143b.v();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> items = this.f2143b.z();
            int count = items.size();
            for (int i2 = 0; i2 < count; i2++) {
                t item = (t) items.get(i2);
                if (item == expandedItem) {
                    this.f2144c = i2;
                    return;
                }
            }
        }
        this.f2144c = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
