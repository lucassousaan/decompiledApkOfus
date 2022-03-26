package androidx.appcompat.widget;

import androidx.appcompat.widget.SearchView;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k3 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f413b;

    public k3(SearchView.SearchAutoComplete this$0) {
        this.f413b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f413b.c();
    }
}
