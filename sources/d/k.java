package d;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final g f1658a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1659b;

    public k(Context context) {
        this(context, l.i(context, 0));
    }

    public k(Context context, int themeResId) {
        this.f1658a = new g(new ContextThemeWrapper(context, l.i(context, themeResId)));
        this.f1659b = themeResId;
    }

    public Context b() {
        return this.f1658a.f1612a;
    }

    public k h(CharSequence title) {
        this.f1658a.f1617f = title;
        return this;
    }

    public k d(View customTitleView) {
        this.f1658a.f1618g = customTitleView;
        return this;
    }

    public k e(Drawable icon) {
        this.f1658a.f1615d = icon;
        return this;
    }

    public k f(DialogInterface.OnKeyListener onKeyListener) {
        this.f1658a.f1620i = onKeyListener;
        return this;
    }

    public k c(ListAdapter adapter, DialogInterface.OnClickListener listener) {
        g gVar = this.f1658a;
        gVar.f1621j = adapter;
        gVar.f1622k = listener;
        return this;
    }

    public k g(ListAdapter adapter, int checkedItem, DialogInterface.OnClickListener listener) {
        g gVar = this.f1658a;
        gVar.f1621j = adapter;
        gVar.f1622k = listener;
        gVar.f1625n = checkedItem;
        gVar.f1624m = true;
        return this;
    }

    public l a() {
        l dialog = new l(this.f1658a.f1612a, this.f1659b);
        this.f1658a.a(dialog.f1661d);
        Objects.requireNonNull(this.f1658a);
        dialog.setCancelable(true);
        Objects.requireNonNull(this.f1658a);
        dialog.setCanceledOnTouchOutside(true);
        Objects.requireNonNull(this.f1658a);
        dialog.setOnCancelListener(null);
        Objects.requireNonNull(this.f1658a);
        dialog.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = this.f1658a.f1620i;
        if (onKeyListener != null) {
            dialog.setOnKeyListener(onKeyListener);
        }
        return dialog;
    }
}
