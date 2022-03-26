package d;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(Configuration base, Configuration change, Configuration delta) {
        LocaleList baseLocales = base.getLocales();
        LocaleList changeLocales = change.getLocales();
        if (!baseLocales.equals(changeLocales)) {
            delta.setLocales(changeLocales);
            delta.locale = change.locale;
        }
    }
}
