package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.j1;
import com.example.helloworld.R;
import n1.c;
import n1.d;
import t1.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class MaterialTextView extends j1 {
    public MaterialTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public MaterialTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(a.c(context, attrs, defStyleAttr, defStyleRes), attrs, defStyleAttr);
        int resId;
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!j(context2, theme, attrs, defStyleAttr, defStyleRes) && (resId = h(theme, attrs, defStyleAttr, defStyleRes)) != -1) {
                f(theme, resId);
            }
        }
    }

    @Override // androidx.appcompat.widget.j1, android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        if (g(context)) {
            f(context.getTheme(), resId);
        }
    }

    public final void f(Resources.Theme theme, int resId) {
        TypedArray attributes = theme.obtainStyledAttributes(resId, v0.a.f3621r);
        int[] iArr = v0.a.f3604a;
        int lineHeight = i(getContext(), attributes, 1, 2);
        attributes.recycle();
        if (lineHeight >= 0) {
            setLineHeight(lineHeight);
        }
    }

    public static boolean g(Context context) {
        return c.b(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    public static int i(Context context, TypedArray attributes, int... indices) {
        int lineHeight = -1;
        for (int index = 0; index < indices.length && lineHeight < 0; index++) {
            lineHeight = d.c(context, attributes, indices[index], -1);
        }
        return lineHeight;
    }

    public static boolean j(Context context, Resources.Theme theme, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray attributes = theme.obtainStyledAttributes(attrs, v0.a.f3622s, defStyleAttr, defStyleRes);
        int[] iArr = v0.a.f3604a;
        int lineHeight = i(context, attributes, 1, 2);
        attributes.recycle();
        return lineHeight != -1;
    }

    public static int h(Resources.Theme theme, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray attributes = theme.obtainStyledAttributes(attrs, v0.a.f3622s, defStyleAttr, defStyleRes);
        int[] iArr = v0.a.f3604a;
        int appearanceAttrId = attributes.getResourceId(0, -1);
        attributes.recycle();
        return appearanceAttrId;
    }
}
