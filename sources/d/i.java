package d;

import android.content.Context;
import android.widget.ArrayAdapter;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i extends ArrayAdapter {
    public i(Context context, int resource, int textViewResourceId, CharSequence[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }
}
