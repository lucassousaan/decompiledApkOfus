package j0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f extends c {

    /* renamed from: j  reason: collision with root package name */
    public int f2293j;

    /* renamed from: k  reason: collision with root package name */
    public int f2294k;

    /* renamed from: l  reason: collision with root package name */
    public LayoutInflater f2295l;

    public f(Context context, int layout, Cursor c2, boolean autoRequery) {
        super(context, c2, autoRequery);
        this.f2294k = layout;
        this.f2293j = layout;
        this.f2295l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // j0.c
    public View g(Context context, Cursor cursor, ViewGroup parent) {
        return this.f2295l.inflate(this.f2293j, parent, false);
    }

    @Override // j0.c
    public View f(Context context, Cursor cursor, ViewGroup parent) {
        return this.f2295l.inflate(this.f2294k, parent, false);
    }
}
