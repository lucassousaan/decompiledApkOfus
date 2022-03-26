package h0;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import e0.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, d onCommitContentListener) {
        c.c(inputConnection, "inputConnection must be non-null");
        c.c(editorInfo, "editorInfo must be non-null");
        c.c(onCommitContentListener, "onCommitContentListener must be non-null");
        return new c(inputConnection, false, onCommitContentListener);
    }
}
