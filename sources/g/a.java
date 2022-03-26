package g;

import android.content.Context;
import android.content.res.Configuration;
import com.example.helloworld.R;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f1939a;

    public static a b(Context context) {
        return new a(context);
    }

    public a(Context context) {
        this.f1939a = context;
    }

    public int d() {
        Configuration configuration = this.f1939a.getResources().getConfiguration();
        int widthDp = configuration.screenWidthDp;
        int heightDp = configuration.screenHeightDp;
        int smallest = configuration.smallestScreenWidthDp;
        if (smallest > 600 || widthDp > 600) {
            return 5;
        }
        if (widthDp > 960 && heightDp > 720) {
            return 5;
        }
        if (widthDp > 720 && heightDp > 960) {
            return 5;
        }
        if (widthDp >= 500) {
            return 4;
        }
        if (widthDp > 640 && heightDp > 480) {
            return 4;
        }
        if (widthDp > 480 && heightDp > 640) {
            return 4;
        }
        if (widthDp >= 360) {
            return 3;
        }
        return 2;
    }

    public boolean f() {
        return true;
    }

    public int c() {
        return this.f1939a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean e() {
        return this.f1939a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public boolean a() {
        return this.f1939a.getApplicationInfo().targetSdkVersion < 14;
    }
}
