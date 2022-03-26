package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class d2 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j2 f284b;

    public d2(j2 this$0) {
        this.f284b = this$0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int position, long id) {
        v1 dropDownList;
        if (position != -1 && (dropDownList = this.f284b.f386d) != null) {
            dropDownList.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
