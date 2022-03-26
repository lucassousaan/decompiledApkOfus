package i0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import f0.b0;
import f0.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class u implements b0 {
    public m b(View view, m payload) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + payload);
        }
        int source = payload.d();
        if (source == 2) {
            return payload;
        }
        ClipData clip = payload.b();
        int flags = payload.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean didFirst = false;
        for (int i2 = 0; i2 < clip.getItemCount(); i2++) {
            CharSequence itemText = a(context, clip.getItemAt(i2), flags);
            if (itemText != null) {
                if (!didFirst) {
                    c(editable, itemText);
                    didFirst = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), itemText);
                }
            }
        }
        return null;
    }

    public static CharSequence a(Context context, ClipData.Item item, int flags) {
        return t.a(context, item, flags);
    }

    public static void c(Editable editable, CharSequence replacement) {
        int selStart = Selection.getSelectionStart(editable);
        int selEnd = Selection.getSelectionEnd(editable);
        int start = Math.max(0, Math.min(selStart, selEnd));
        int end = Math.max(0, Math.max(selStart, selEnd));
        Selection.setSelection(editable, end);
        editable.replace(start, end, replacement);
    }
}
