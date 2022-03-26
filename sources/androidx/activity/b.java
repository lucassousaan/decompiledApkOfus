package androidx.activity;

import android.text.TextUtils;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f34b;

    public b(e this$0) {
        this.f34b = this$0;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b.super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        }
    }
}
