package androidx.appcompat.widget;

import android.view.View;
import f0.h1;
import f0.i1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements i1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f227a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f228b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f229c;

    public a(b this$0) {
        this.f229c = this$0;
    }

    public a d(h1 animation, int visibility) {
        this.f229c.f240g = animation;
        this.f228b = visibility;
        return this;
    }

    @Override // f0.i1
    public void b(View view) {
        a.super.setVisibility(0);
        this.f227a = false;
    }

    @Override // f0.i1
    public void a(View view) {
        if (!this.f227a) {
            b bVar = this.f229c;
            bVar.f240g = null;
            a.super.setVisibility(this.f228b);
        }
    }

    @Override // f0.i1
    public void c(View view) {
        this.f227a = true;
    }
}
