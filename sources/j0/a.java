package j0;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f2282a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(new Handler());
        this.f2282a = cVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        this.f2282a.h();
    }
}
