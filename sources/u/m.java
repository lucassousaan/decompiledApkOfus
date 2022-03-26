package u;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import d.o;
import java.util.ArrayList;
import java.util.Iterator;
import v.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3578b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Context f3579c;

    public m(Context a2) {
        this.f3579c = a2;
    }

    public static m d(Context context) {
        return new m(context);
    }

    public m a(Intent nextIntent) {
        this.f3578b.add(nextIntent);
        return this;
    }

    public m b(Activity sourceActivity) {
        Intent parent = null;
        if (sourceActivity instanceof l) {
            parent = ((o) ((l) sourceActivity)).z();
        }
        if (parent == null) {
            parent = j.a(sourceActivity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f3579c.getPackageManager());
            }
            c(target);
            a(parent);
        }
        return this;
    }

    public m c(ComponentName sourceActivityName) {
        int insertAt = this.f3578b.size();
        try {
            Intent parent = j.b(this.f3579c, sourceActivityName);
            while (parent != null) {
                this.f3578b.add(insertAt, parent);
                parent = j.b(this.f3579c, parent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f3578b.iterator();
    }

    public void e() {
        f(null);
    }

    public void f(Bundle options) {
        if (!this.f3578b.isEmpty()) {
            ArrayList arrayList = this.f3578b;
            Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intents[0] = new Intent(intents[0]).addFlags(268484608);
            d.c(this.f3579c, intents, options);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
