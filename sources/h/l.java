package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class l extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public int f2112b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f2113c;

    public l(m mVar) {
        this.f2113c = mVar;
        a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<MenuItemImpl> items = this.f2113c.f2137d.z();
        int size = items.size();
        Objects.requireNonNull(this.f2113c);
        int count = size + 0;
        if (this.f2112b < 0) {
            return count;
        }
        return count - 1;
    }

    /* renamed from: b */
    public t getItem(int position) {
        ArrayList<MenuItemImpl> items = this.f2113c.f2137d.z();
        Objects.requireNonNull(this.f2113c);
        int position2 = position + 0;
        int i2 = this.f2112b;
        if (i2 >= 0 && position2 >= i2) {
            position2++;
        }
        return (t) items.get(position2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            m mVar = this.f2113c;
            convertView = mVar.f2136c.inflate(mVar.f2140g, parent, false);
        }
        f0 itemView = (f0) convertView;
        itemView.c(getItem(position), 0);
        return convertView;
    }

    public void a() {
        t expandedItem = this.f2113c.f2137d.v();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> items = this.f2113c.f2137d.z();
            int count = items.size();
            for (int i2 = 0; i2 < count; i2++) {
                t item = (t) items.get(i2);
                if (item == expandedItem) {
                    this.f2112b = i2;
                    return;
                }
            }
        }
        this.f2112b = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
