package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public int f1555a;

    public h(int max) {
        this.f1555a = max;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            StringBuilder builder = new StringBuilder(dest);
            builder.replace(dstart, dend, source.subSequence(start, end).toString());
            String newVal = builder.toString();
            int input = Integer.parseInt(newVal);
            if (input <= this.f1555a) {
                return null;
            }
            return "";
        } catch (NumberFormatException e2) {
            return "";
        }
    }
}
