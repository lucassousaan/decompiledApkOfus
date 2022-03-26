package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import f0.c1;
import f0.f;
import f0.m;
import h0.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class q0 {
    public static boolean c(TextView view, int menuItemId) {
        int i2 = 0;
        if ((menuItemId != 16908322 && menuItemId != 16908337) || c1.D(view) == null) {
            return false;
        }
        ClipboardManager cm = (ClipboardManager) view.getContext().getSystemService("clipboard");
        ClipData clip = cm == null ? null : cm.getPrimaryClip();
        if (clip != null && clip.getItemCount() > 0) {
            f fVar = new f(clip, 1);
            if (menuItemId != 16908322) {
                i2 = 1;
            }
            fVar.c(i2);
            m payload = fVar.a();
            c1.b0(view, payload);
        }
        return true;
    }

    public static boolean b(View view, DragEvent event) {
        if (event.getLocalState() != null || c1.D(view) == null) {
            return false;
        }
        Activity activity = d(view);
        if (activity == null) {
            Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
            return false;
        } else if (event.getAction() == 1) {
            return !(view instanceof TextView);
        } else {
            if (event.getAction() != 3) {
                return false;
            }
            if (view instanceof TextView) {
                p0.a(event, (TextView) view, activity);
            } else {
                p0.b(event, view, activity);
            }
            return true;
        }
    }

    public static Activity d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static d a(View view) {
        return new o0(view);
    }
}
