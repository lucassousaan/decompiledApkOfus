package j0;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable, d {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2284b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2285c;

    /* renamed from: d  reason: collision with root package name */
    public Cursor f2286d;

    /* renamed from: e  reason: collision with root package name */
    public Context f2287e;

    /* renamed from: f  reason: collision with root package name */
    public int f2288f;

    /* renamed from: g  reason: collision with root package name */
    public a f2289g;

    /* renamed from: h  reason: collision with root package name */
    public DataSetObserver f2290h;

    /* renamed from: i  reason: collision with root package name */
    public e f2291i;

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract CharSequence c(Cursor cursor);

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public c(Context context, Cursor c2, boolean autoRequery) {
        e(context, c2, autoRequery ? 1 : 2);
    }

    public void e(Context context, Cursor c2, int flags) {
        boolean cursorPresent = false;
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f2285c = true;
        } else {
            this.f2285c = false;
        }
        if (c2 != null) {
            cursorPresent = true;
        }
        this.f2286d = c2;
        this.f2284b = cursorPresent;
        this.f2287e = context;
        this.f2288f = cursorPresent ? c2.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f2289g = new a(this);
            this.f2290h = new b(this);
        } else {
            this.f2289g = null;
            this.f2290h = null;
        }
        if (cursorPresent) {
            a aVar = this.f2289g;
            if (aVar != null) {
                c2.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2290h;
            if (dataSetObserver != null) {
                c2.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public Cursor d() {
        return this.f2286d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2284b || (cursor = this.f2286d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        Cursor cursor;
        if (!this.f2284b || (cursor = this.f2286d) == null) {
            return null;
        }
        cursor.moveToPosition(position);
        return this.f2286d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        Cursor cursor;
        if (!this.f2284b || (cursor = this.f2286d) == null || !cursor.moveToPosition(position)) {
            return 0L;
        }
        return this.f2286d.getLong(this.f2288f);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View v2;
        if (!this.f2284b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2286d.moveToPosition(position)) {
            if (convertView == null) {
                v2 = g(this.f2287e, this.f2286d, parent);
            } else {
                v2 = convertView;
            }
            a(v2, this.f2287e, this.f2286d);
            return v2;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v2;
        if (!this.f2284b) {
            return null;
        }
        this.f2286d.moveToPosition(position);
        if (convertView == null) {
            v2 = f(this.f2287e, this.f2286d, parent);
        } else {
            v2 = convertView;
        }
        a(v2, this.f2287e, this.f2286d);
        return v2;
    }

    public void b(Cursor cursor) {
        Cursor old = i(cursor);
        if (old != null) {
            old.close();
        }
    }

    public Cursor i(Cursor newCursor) {
        if (newCursor == this.f2286d) {
            return null;
        }
        Cursor oldCursor = this.f2286d;
        if (oldCursor != null) {
            a aVar = this.f2289g;
            if (aVar != null) {
                oldCursor.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2290h;
            if (dataSetObserver != null) {
                oldCursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2286d = newCursor;
        if (newCursor != null) {
            a aVar2 = this.f2289g;
            if (aVar2 != null) {
                newCursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2290h;
            if (dataSetObserver2 != null) {
                newCursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2288f = newCursor.getColumnIndexOrThrow("_id");
            this.f2284b = true;
            notifyDataSetChanged();
        } else {
            this.f2288f = -1;
            this.f2284b = false;
            notifyDataSetInvalidated();
        }
        return oldCursor;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2291i == null) {
            this.f2291i = new e(this);
        }
        return this.f2291i;
    }

    public void h() {
        Cursor cursor;
        if (this.f2285c && (cursor = this.f2286d) != null && !cursor.isClosed()) {
            this.f2284b = this.f2286d.requery();
        }
    }
}
