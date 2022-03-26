package androidx.appcompat.widget;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import f0.c1;
import f0.f;
import f0.m;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class p0 {
    /* JADX WARN: Finally extract failed */
    public static boolean a(DragEvent event, TextView view, Activity activity) {
        activity.requestDragAndDropPermissions(event);
        int offset = view.getOffsetForPosition(event.getX(), event.getY());
        view.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) view.getText(), offset);
            m payload = new f(event.getClipData(), 3).a();
            c1.b0(view, payload);
            view.endBatchEdit();
            return true;
        } catch (Throwable th) {
            view.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent event, View view, Activity activity) {
        activity.requestDragAndDropPermissions(event);
        m payload = new f(event.getClipData(), 3).a();
        c1.b0(view, payload);
        return true;
    }
}
