package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference f1432a = new AtomicReference();

    public static r0 e() {
        r0 timeSource = (r0) f1432a.get();
        return timeSource == null ? r0.c() : timeSource;
    }

    public static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    public static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar g() {
        Calendar today = e().a();
        today.set(11, 0);
        today.set(12, 0);
        today.set(13, 0);
        today.set(14, 0);
        today.setTimeZone(f());
        return today;
    }

    public static Calendar i() {
        return j(null);
    }

    public static Calendar j(Calendar rawCalendar) {
        Calendar utc = Calendar.getInstance(f());
        if (rawCalendar == null) {
            utc.clear();
        } else {
            utc.setTimeInMillis(rawCalendar.getTimeInMillis());
        }
        return utc;
    }

    public static Calendar d(Calendar rawCalendar) {
        Calendar rawCalendarInUtc = j(rawCalendar);
        Calendar utcCalendar = i();
        utcCalendar.set(rawCalendarInUtc.get(1), rawCalendarInUtc.get(2), rawCalendarInUtc.get(5));
        return utcCalendar;
    }

    public static long a(long rawDate) {
        Calendar rawCalendar = i();
        rawCalendar.setTimeInMillis(rawDate);
        Calendar sanitizedStartItem = d(rawCalendar);
        return sanitizedStartItem.getTimeInMillis();
    }

    public static DateFormat c(String pattern, Locale locale) {
        DateFormat format = DateFormat.getInstanceForSkeleton(pattern, locale);
        format.setTimeZone(h());
        return format;
    }

    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    public static DateFormat k(Locale locale) {
        return c("yMMMEd", locale);
    }
}
