package h0;

import android.view.inputmethod.EditorInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(EditorInfo editorInfo, CharSequence sourceText, int subTextStart) {
        editorInfo.setInitialSurroundingSubText(sourceText, subTextStart);
    }
}
