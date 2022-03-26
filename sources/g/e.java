package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class e extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f1942a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f1943b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f1944c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f1945d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f1946e;

    public e(Context base, int themeResId) {
        super(base);
        this.f1942a = themeResId;
    }

    public e(Context base, Resources.Theme theme) {
        super(base);
        this.f1943b = theme;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    public void a(Configuration overrideConfiguration) {
        if (this.f1946e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f1945d == null) {
            this.f1945d = new Configuration(overrideConfiguration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    public final Resources b() {
        if (this.f1946e == null) {
            Configuration configuration = this.f1945d;
            if (configuration == null) {
                this.f1946e = super.getResources();
            } else {
                Context resContext = createConfigurationContext(configuration);
                this.f1946e = resContext.getResources();
            }
        }
        return this.f1946e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int resid) {
        if (this.f1942a != resid) {
            this.f1942a = resid;
            d();
        }
    }

    public int c() {
        return this.f1942a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1943b;
        if (theme != null) {
            return theme;
        }
        if (this.f1942a == 0) {
            this.f1942a = 2131755411;
        }
        d();
        return this.f1943b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.f1944c == null) {
            this.f1944c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1944c;
    }

    public void e(Resources.Theme theme, int resid) {
        theme.applyStyle(resid, true);
    }

    public final void d() {
        boolean first = this.f1943b == null;
        if (first) {
            this.f1943b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1943b.setTo(theme);
            }
        }
        e(this.f1943b, this.f1942a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
