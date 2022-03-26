package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import d.k;
import d.l;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class v0 implements d1, DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public l f547b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f548c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f549d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e1 f550e;

    public v0(e1 this$0) {
        this.f550e = this$0;
    }

    @Override // androidx.appcompat.widget.d1
    public void dismiss() {
        l lVar = this.f547b;
        if (lVar != null) {
            lVar.dismiss();
            this.f547b = null;
        }
    }

    @Override // androidx.appcompat.widget.d1
    public boolean a() {
        l lVar = this.f547b;
        if (lVar != null) {
            return lVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.d1
    public void o(ListAdapter adapter) {
        this.f548c = adapter;
    }

    @Override // androidx.appcompat.widget.d1
    public void h(CharSequence hintText) {
        this.f549d = hintText;
    }

    @Override // androidx.appcompat.widget.d1
    public CharSequence b() {
        return this.f549d;
    }

    @Override // androidx.appcompat.widget.d1
    public void f(int textDirection, int textAlignment) {
        if (this.f548c != null) {
            k builder = new k(this.f550e.getPopupContext());
            CharSequence charSequence = this.f549d;
            if (charSequence != null) {
                builder.h(charSequence);
            }
            builder.g(this.f548c, this.f550e.getSelectedItemPosition(), this);
            l a2 = builder.a();
            this.f547b = a2;
            ListView listView = a2.g();
            listView.setTextDirection(textDirection);
            listView.setTextAlignment(textAlignment);
            this.f547b.show();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        this.f550e.setSelection(which);
        if (this.f550e.getOnItemClickListener() != null) {
            this.f550e.performItemClick(null, which, this.f548c.getItemId(which));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.d1
    public void l(Drawable bg) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.d1
    public void m(int px) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.d1
    public void c(int px) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.d1
    public Drawable n() {
        return null;
    }

    @Override // androidx.appcompat.widget.d1
    public int j() {
        return 0;
    }

    @Override // androidx.appcompat.widget.d1
    public int d() {
        return 0;
    }

    @Override // androidx.appcompat.widget.d1
    public void p(int px) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
