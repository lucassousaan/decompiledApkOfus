package i0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f2258a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f2259b;

    /* renamed from: c  reason: collision with root package name */
    public Class f2260c;

    /* renamed from: d  reason: collision with root package name */
    public Method f2261d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2262e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2263f = false;

    public r(ActionMode.Callback callback, TextView textView) {
        this.f2258a = callback;
        this.f2259b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        return this.f2258a.onCreateActionMode(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        f(menu);
        return this.f2258a.onPrepareActionMode(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        return this.f2258a.onActionItemClicked(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
        this.f2258a.onDestroyActionMode(mode);
    }

    public final void f(Menu menu) {
        Method removeItemAtMethod;
        Context context = this.f2259b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f2263f) {
            this.f2263f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f2260c = cls;
                this.f2261d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f2262e = true;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                this.f2260c = null;
                this.f2261d = null;
                this.f2262e = false;
            }
        }
        try {
            if (!this.f2262e || !this.f2260c.isInstance(menu)) {
                removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            } else {
                removeItemAtMethod = this.f2261d;
            }
            for (int i2 = menu.size() - 1; i2 >= 0; i2--) {
                MenuItem item = menu.getItem(i2);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    removeItemAtMethod.invoke(menu, Integer.valueOf(i2));
                }
            }
            List<ResolveInfo> supportedActivities = c(context, packageManager);
            for (int i3 = 0; i3 < supportedActivities.size(); i3++) {
                ResolveInfo info = supportedActivities.get(i3);
                menu.add(0, 0, i3 + 100, info.loadLabel(packageManager)).setIntent(b(info, this.f2259b)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
        }
    }

    public final List c(Context context, PackageManager packageManager) {
        List<ResolveInfo> supportedActivities = new ArrayList<>();
        boolean canStartActivityForResult = context instanceof Activity;
        if (!canStartActivityForResult) {
            return supportedActivities;
        }
        List<ResolveInfo> unfiltered = packageManager.queryIntentActivities(a(), 0);
        for (ResolveInfo info : unfiltered) {
            if (e(info, context)) {
                supportedActivities.add(info);
            }
        }
        return supportedActivities;
    }

    public final boolean e(ResolveInfo info, Context context) {
        if (context.getPackageName().equals(info.activityInfo.packageName)) {
            return true;
        }
        ActivityInfo activityInfo = info.activityInfo;
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    public final Intent b(ResolveInfo info, TextView textView11) {
        Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView11));
        ActivityInfo activityInfo = info.activityInfo;
        return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    public final boolean d(TextView textView11) {
        return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
    }

    public final Intent a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
}
