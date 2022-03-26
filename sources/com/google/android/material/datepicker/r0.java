package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f1428c = new r0(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final Long f1429a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeZone f1430b;

    public r0(Long fixedTimeMs, TimeZone fixedTimeZone) {
        this.f1429a = fixedTimeMs;
        this.f1430b = fixedTimeZone;
    }

    public static r0 c() {
        return f1428c;
    }

    public Calendar a() {
        return b(null);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = this.f1429a;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        return calendar;
    }
}
