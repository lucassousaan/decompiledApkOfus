package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class g0<S> extends o0 {
    public int W;
    public g X;
    public d Y;

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g != com.google.android.material.datepicker.DateSelector<T> */
    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g0 != com.google.android.material.datepicker.MaterialTextInputPicker<T> */
    public static g0 q1(g gVar, int themeResId, d calendarConstraints) {
        g0 g0Var = new g0();
        Bundle args = new Bundle();
        args.putInt("THEME_RES_ID_KEY", themeResId);
        args.putParcelable("DATE_SELECTOR_KEY", gVar);
        args.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        g0Var.h1(args);
        return g0Var;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g0 != com.google.android.material.datepicker.MaterialTextInputPicker<S> */
    @Override // androidx.fragment.app.f0
    public void x0(Bundle bundle) {
        super.x0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g0 != com.google.android.material.datepicker.MaterialTextInputPicker<S> */
    @Override // androidx.fragment.app.f0
    public void f0(Bundle bundle) {
        super.f0(bundle);
        Bundle activeBundle = bundle == null ? n() : bundle;
        this.W = activeBundle.getInt("THEME_RES_ID_KEY");
        this.X = (g) activeBundle.getParcelable("DATE_SELECTOR_KEY");
        this.Y = (d) activeBundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g0 != com.google.android.material.datepicker.MaterialTextInputPicker<S> */
    @Override // androidx.fragment.app.f0
    public View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper themedContext = new ContextThemeWrapper(p(), this.W);
        LayoutInflater themedInflater = layoutInflater.cloneInContext(themedContext);
        return this.X.e(themedInflater, viewGroup, bundle, this.Y, new f0(this));
    }
}
