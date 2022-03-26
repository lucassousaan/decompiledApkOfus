package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.y;
import androidx.appcompat.widget.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import d.r0;
import d1.a;
import s1.e0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends r0 {
    @Override // d.r0
    public y c(Context context, AttributeSet attrs) {
        return new MaterialButton(context, attrs);
    }

    @Override // d.r0
    public z d(Context context, AttributeSet attrs) {
        return new a(context, attrs);
    }

    @Override // d.r0
    public m0 j(Context context, AttributeSet attrs) {
        return new m1.a(context, attrs);
    }

    @Override // d.r0
    public j1 n(Context context, AttributeSet attrs) {
        return new MaterialTextView(context, attrs);
    }

    @Override // d.r0
    public w b(Context context, AttributeSet attrs) {
        return new e0(context, attrs);
    }
}
