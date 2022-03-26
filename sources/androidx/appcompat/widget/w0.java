package androidx.appcompat.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class w0 implements ListAdapter, SpinnerAdapter {

    /* renamed from: b  reason: collision with root package name */
    public SpinnerAdapter f570b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f571c;

    public w0(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
        this.f570b = adapter;
        if (adapter instanceof ListAdapter) {
            this.f571c = (ListAdapter) adapter;
        }
        if (dropDownTheme != null && (adapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
            if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                themedAdapter.setDropDownViewTheme(dropDownTheme);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        SpinnerAdapter spinnerAdapter = this.f570b;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        SpinnerAdapter spinnerAdapter = this.f570b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        SpinnerAdapter spinnerAdapter = this.f570b;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(position);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        return getDropDownView(position, convertView, parent);
    }

    @Override // android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        SpinnerAdapter spinnerAdapter = this.f570b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(position, convertView, parent);
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f570b;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver observer) {
        SpinnerAdapter spinnerAdapter = this.f570b;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(observer);
        }
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver observer) {
        SpinnerAdapter spinnerAdapter = this.f570b;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(observer);
        }
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        ListAdapter adapter = this.f571c;
        if (adapter != null) {
            return adapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int position) {
        ListAdapter adapter = this.f571c;
        if (adapter != null) {
            return adapter.isEnabled(position);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int position) {
        return 0;
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return getCount() == 0;
    }
}
