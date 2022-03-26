package j0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.n3;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public d f2292a;

    public e(d client) {
        this.f2292a = client;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object resultValue) {
        return ((n3) this.f2292a).c((Cursor) resultValue);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = ((n3) this.f2292a).w(constraint);
        Filter.FilterResults results = new Filter.FilterResults();
        if (cursor != null) {
            results.count = cursor.getCount();
            results.values = cursor;
        } else {
            results.count = 0;
            results.values = null;
        }
        return results;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence constraint, Filter.FilterResults results) {
        Cursor oldCursor = ((c) this.f2292a).d();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            ((n3) this.f2292a).b((Cursor) obj);
        }
    }
}
