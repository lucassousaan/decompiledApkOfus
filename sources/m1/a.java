package m1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.m0;
import com.example.helloworld.R;
import i0.e;
import l1.q;
import n1.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a extends m0 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f2472g = 2131755655;

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f2473h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f2474e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2475f;

    public a(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.radioButtonStyle);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(t1.a.c(context, attrs, defStyleAttr, 2131755655), attrs, defStyleAttr);
        Context context2 = getContext();
        TypedArray attributes = q.h(context2, attrs, v0.a.f3619p, defStyleAttr, 2131755655, new int[0]);
        int[] iArr = v0.a.f3604a;
        if (attributes.hasValue(0)) {
            e.c(this, d.a(context2, attributes, 0));
        }
        this.f2475f = attributes.getBoolean(1, false);
        attributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2475f && e.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean useMaterialThemeColors) {
        this.f2475f = useMaterialThemeColors;
        if (useMaterialThemeColors) {
            e.c(this, getMaterialThemeColorsTintList());
        } else {
            e.c(this, null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2474e == null) {
            int colorControlActivated = f1.a.c(this, R.attr.colorControlActivated);
            int colorOnSurface = f1.a.c(this, R.attr.colorOnSurface);
            int colorSurface = f1.a.c(this, R.attr.colorSurface);
            int[][] iArr = f2473h;
            int[] radioButtonColorList = new int[iArr.length];
            radioButtonColorList[0] = f1.a.f(colorSurface, colorControlActivated, 1.0f);
            radioButtonColorList[1] = f1.a.f(colorSurface, colorOnSurface, 0.54f);
            radioButtonColorList[2] = f1.a.f(colorSurface, colorOnSurface, 0.38f);
            radioButtonColorList[3] = f1.a.f(colorSurface, colorOnSurface, 0.38f);
            this.f2474e = new ColorStateList(iArr, radioButtonColorList);
        }
        return this.f2474e;
    }
}
