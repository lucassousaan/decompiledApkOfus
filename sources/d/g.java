package d;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1612a;

    /* renamed from: b  reason: collision with root package name */
    public final LayoutInflater f1613b;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f1615d;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1617f;

    /* renamed from: g  reason: collision with root package name */
    public View f1618g;

    /* renamed from: i  reason: collision with root package name */
    public DialogInterface.OnKeyListener f1620i;

    /* renamed from: j  reason: collision with root package name */
    public ListAdapter f1621j;

    /* renamed from: k  reason: collision with root package name */
    public DialogInterface.OnClickListener f1622k;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1624m;

    /* renamed from: c  reason: collision with root package name */
    public int f1614c = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1616e = 0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1623l = false;

    /* renamed from: n  reason: collision with root package name */
    public int f1625n = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1619h = true;

    public g(Context context) {
        this.f1612a = context;
        this.f1613b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void a(j dialog) {
        View view = this.f1618g;
        if (view != null) {
            dialog.i(view);
        } else {
            CharSequence charSequence = this.f1617f;
            if (charSequence != null) {
                dialog.l(charSequence);
            }
            Drawable drawable = this.f1615d;
            if (drawable != null) {
                dialog.j(drawable);
            }
        }
        if (this.f1621j != null) {
            b(dialog);
        }
    }

    public final void b(j dialog) {
        int layout;
        ListAdapter adapter;
        AlertController$RecycleListView listView = (AlertController$RecycleListView) this.f1613b.inflate(dialog.L, (ViewGroup) null);
        if (this.f1624m) {
            layout = dialog.N;
        } else {
            layout = dialog.O;
        }
        if (this.f1621j != null) {
            adapter = this.f1621j;
        } else {
            adapter = new i(this.f1612a, layout, 16908308, null);
        }
        dialog.H = adapter;
        dialog.I = this.f1625n;
        if (this.f1622k != null) {
            listView.setOnItemClickListener(new f(this, dialog));
        }
        if (this.f1624m) {
            listView.setChoiceMode(1);
        }
        dialog.f1638g = listView;
    }
}
