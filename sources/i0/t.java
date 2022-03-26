package i0;

import android.content.ClipData;
import android.content.Context;
import android.text.Spanned;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class t {
    public static CharSequence a(Context context, ClipData.Item item, int flags) {
        if ((flags & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence text = item.coerceToText(context);
        return text instanceof Spanned ? text.toString() : text;
    }
}
