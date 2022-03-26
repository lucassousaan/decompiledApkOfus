package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h {
    public static String c(Context context, long timeInMillis) {
        long offsetMillis = TimeZone.getDefault().getOffset(timeInMillis);
        return DateUtils.formatDateTime(context, timeInMillis - offsetMillis, 36);
    }

    public static String a(long timeInMillis) {
        return b(timeInMillis, Locale.getDefault());
    }

    public static String b(long timeInMillis, Locale locale) {
        return s0.b(locale).format(new Date(timeInMillis));
    }

    public static String d(long timeInMillis) {
        return e(timeInMillis, Locale.getDefault());
    }

    public static String e(long timeInMillis, Locale locale) {
        return s0.k(locale).format(new Date(timeInMillis));
    }
}
