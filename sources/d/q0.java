package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class q0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f1718b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1719c;

    /* renamed from: d  reason: collision with root package name */
    public Method f1720d;

    /* renamed from: e  reason: collision with root package name */
    public Context f1721e;

    public q0(View hostView, String methodName) {
        this.f1718b = hostView;
        this.f1719c = methodName;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (this.f1720d == null) {
            a(this.f1718b.getContext());
        }
        try {
            this.f1720d.invoke(this.f1721e, v2);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }

    public final void a(Context context) {
        String idText;
        Method method;
        while (context != null) {
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1719c, View.class)) != null) {
                    this.f1720d = method;
                    this.f1721e = context;
                    return;
                }
            } catch (NoSuchMethodException e2) {
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                context = null;
            }
        }
        int id = this.f1718b.getId();
        if (id == -1) {
            idText = "";
        } else {
            idText = " with id '" + this.f1718b.getContext().getResources().getResourceEntryName(id) + "'";
        }
        throw new IllegalStateException("Could not find method " + this.f1719c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1718b.getClass() + idText);
    }
}
