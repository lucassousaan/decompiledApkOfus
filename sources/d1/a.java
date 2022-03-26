package d1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import com.example.helloworld.R;
import i0.e;
import l1.q;
import n1.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends z {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1799g = 2131755654;

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f1800h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f1801e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1802f;

    public a(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.checkboxStyle);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(t1.a.c(context, attrs, defStyleAttr, 2131755654), attrs, defStyleAttr);
        Context context2 = getContext();
        TypedArray attributes = q.h(context2, attrs, v0.a.f3618o, defStyleAttr, 2131755654, new int[0]);
        int[] iArr = v0.a.f3604a;
        if (attributes.hasValue(0)) {
            e.c(this, d.a(context2, attributes, 0));
        }
        this.f1802f = attributes.getBoolean(1, false);
        attributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1802f && e.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean useMaterialThemeColors) {
        this.f1802f = useMaterialThemeColors;
        if (useMaterialThemeColors) {
            e.c(this, getMaterialThemeColorsTintList());
        } else {
            e.c(this, null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1801e == null) {
            int[][] iArr = f1800h;
            int[] checkBoxColorsList = new int[iArr.length];
            int colorControlActivated = f1.a.c(this, R.attr.colorControlActivated);
            int colorSurface = f1.a.c(this, R.attr.colorSurface);
            int colorOnSurface = f1.a.c(this, R.attr.colorOnSurface);
            checkBoxColorsList[0] = f1.a.f(colorSurface, colorControlActivated, 1.0f);
            checkBoxColorsList[1] = f1.a.f(colorSurface, colorOnSurface, 0.54f);
            checkBoxColorsList[2] = f1.a.f(colorSurface, colorOnSurface, 0.38f);
            checkBoxColorsList[3] = f1.a.f(colorSurface, colorOnSurface, 0.38f);
            this.f1801e = new ColorStateList(iArr, checkBoxColorsList);
        }
        return this.f1801e;
    }
}
