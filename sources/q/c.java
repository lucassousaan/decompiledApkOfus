package q;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import o.g;
import o.j;
import o.k;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f2801b;

    /* renamed from: c  reason: collision with root package name */
    public int f2802c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2803d;

    /* renamed from: e  reason: collision with root package name */
    public j f2804e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2805f;

    /* renamed from: g  reason: collision with root package name */
    public String f2806g;

    /* renamed from: h  reason: collision with root package name */
    public String f2807h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap f2808i;

    public abstract void g(g gVar, boolean z2);

    public c(Context context) {
        super(context);
        this.f2801b = new int[32];
        this.f2805f = false;
        this.f2808i = new HashMap();
        this.f2803d = context;
        f(null);
    }

    public c(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2801b = new int[32];
        this.f2805f = false;
        this.f2808i = new HashMap();
        this.f2803d = context;
        f(attrs);
    }

    public void f(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a2 = getContext().obtainStyledAttributes(attrs, r.f2945b);
            int N = a2.getIndexCount();
            for (int i2 = 0; i2 < N; i2++) {
                int attr = a2.getIndex(i2);
                int[] iArr = r.f2944a;
                if (attr == 19) {
                    String string = a2.getString(attr);
                    this.f2806g = string;
                    setIds(string);
                } else if (attr == 20) {
                    String string2 = a2.getString(attr);
                    this.f2807h = string2;
                    setReferenceTags(string2);
                }
            }
            a2.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2806g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2807h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2801b, this.f2802c);
    }

    public void setReferencedIds(int[] ids) {
        this.f2806g = null;
        this.f2802c = 0;
        for (int i2 : ids) {
            b(i2);
        }
    }

    public final void b(int id) {
        if (id != getId()) {
            int i2 = this.f2802c + 1;
            int[] iArr = this.f2801b;
            if (i2 > iArr.length) {
                this.f2801b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f2801b;
            int i3 = this.f2802c;
            iArr2[i3] = id;
            this.f2802c = i3 + 1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f2805f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void l() {
        if (this.f2804e != null) {
            ViewGroup.LayoutParams params = getLayoutParams();
            if (params instanceof e) {
                e layoutParams = (e) params;
                layoutParams.f2835m0 = (g) this.f2804e;
            }
        }
    }

    public final void a(String idString) {
        if (idString != null && idString.length() != 0 && this.f2803d != null) {
            String idString2 = idString.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int rscId = e(idString2);
            if (rscId != 0) {
                this.f2808i.put(Integer.valueOf(rscId), idString2);
                b(rscId);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + idString2 + "\"");
        }
    }

    public final void c(String tagString) {
        if (!(tagString == null || tagString.length() == 0 || this.f2803d == null)) {
            String tagString2 = tagString.trim();
            ConstraintLayout parent = null;
            if (getParent() instanceof ConstraintLayout) {
                parent = (ConstraintLayout) getParent();
            }
            if (parent == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int count = parent.getChildCount();
            for (int i2 = 0; i2 < count; i2++) {
                View v2 = parent.getChildAt(i2);
                ViewGroup.LayoutParams params = v2.getLayoutParams();
                if (params instanceof e) {
                    e lp = (e) params;
                    if (tagString2.equals(lp.U)) {
                        if (v2.getId() == -1) {
                            Log.w("ConstraintHelper", "to use ConstraintTag view " + v2.getClass().getSimpleName() + " must have an ID");
                        } else {
                            b(v2.getId());
                        }
                    }
                }
            }
        }
    }

    public final int e(String referenceId) {
        ConstraintLayout parent = null;
        if (getParent() instanceof ConstraintLayout) {
            parent = (ConstraintLayout) getParent();
        }
        int rscId = 0;
        if (isInEditMode() && parent != null) {
            Object value = parent.f(0, referenceId);
            if (value instanceof Integer) {
                rscId = ((Integer) value).intValue();
            }
        }
        if (rscId == 0 && parent != null) {
            rscId = d(parent, referenceId);
        }
        if (rscId == 0) {
            try {
                Field field = q.class.getField(referenceId);
                rscId = field.getInt(null);
            } catch (Exception e2) {
            }
        }
        if (rscId == 0) {
            return this.f2803d.getResources().getIdentifier(referenceId, "id", this.f2803d.getPackageName());
        }
        return rscId;
    }

    public final int d(ConstraintLayout container, String idString) {
        Resources resources;
        if (idString == null || container == null || (resources = this.f2803d.getResources()) == null) {
            return 0;
        }
        int count = container.getChildCount();
        for (int j2 = 0; j2 < count; j2++) {
            View child = container.getChildAt(j2);
            if (child.getId() != -1) {
                String res = null;
                try {
                    res = resources.getResourceEntryName(child.getId());
                } catch (Resources.NotFoundException e2) {
                }
                if (idString.equals(res)) {
                    return child.getId();
                }
            }
        }
        return 0;
    }

    public void setIds(String idList) {
        this.f2806g = idList;
        if (idList != null) {
            int begin = 0;
            this.f2802c = 0;
            while (true) {
                int end = idList.indexOf(44, begin);
                if (end == -1) {
                    a(idList.substring(begin));
                    return;
                } else {
                    a(idList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    public void setReferenceTags(String tagList) {
        this.f2807h = tagList;
        if (tagList != null) {
            int begin = 0;
            this.f2802c = 0;
            while (true) {
                int end = tagList.indexOf(44, begin);
                if (end == -1) {
                    c(tagList.substring(begin));
                    return;
                } else {
                    c(tagList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    public void k(ConstraintLayout container) {
        String candidate;
        int foundId;
        if (isInEditMode()) {
            setIds(this.f2806g);
        }
        j jVar = this.f2804e;
        if (jVar != null) {
            ((k) jVar).Y0();
            for (int i2 = 0; i2 < this.f2802c; i2++) {
                int id = this.f2801b[i2];
                View view = container.h(id);
                if (view == null && (foundId = d(container, (candidate = (String) this.f2808i.get(Integer.valueOf(id))))) != 0) {
                    this.f2801b[i2] = foundId;
                    this.f2808i.put(Integer.valueOf(foundId), candidate);
                    view = container.h(foundId);
                }
                if (view != null) {
                    ((k) this.f2804e).V0(container.i(view));
                }
            }
            ((k) this.f2804e).Z0(container.f611d);
        }
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.f2806g == null) {
            b(key);
        }
    }
}
