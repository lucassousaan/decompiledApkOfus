package b;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b extends a {
    /* renamed from: b */
    public Map a(int resultCode, Intent intent) {
        if (resultCode == -1 && intent != null) {
            String[] permissions = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] grantResults = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (grantResults == null || permissions == null) {
                return Collections.emptyMap();
            }
            Map<String, Boolean> result = new HashMap<>();
            int size = permissions.length;
            for (int i2 = 0; i2 < size; i2++) {
                result.put(permissions[i2], Boolean.valueOf(grantResults[i2] == 0));
            }
            return result;
        }
        return Collections.emptyMap();
    }
}
