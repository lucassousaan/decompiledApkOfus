package com.google.android.material.datepicker;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final long f1347e = s0.a(i0.j(1900, 0).f1396g);

    /* renamed from: f  reason: collision with root package name */
    public static final long f1348f = s0.a(i0.j(2100, 11).f1396g);

    /* renamed from: a  reason: collision with root package name */
    public long f1349a;

    /* renamed from: b  reason: collision with root package name */
    public long f1350b;

    /* renamed from: c  reason: collision with root package name */
    public Long f1351c;

    /* renamed from: d  reason: collision with root package name */
    public c f1352d;

    public b(d clone) {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        c cVar;
        this.f1349a = f1347e;
        this.f1350b = f1348f;
        this.f1352d = j.i(Long.MIN_VALUE);
        i0Var = clone.f1355b;
        this.f1349a = i0Var.f1396g;
        i0Var2 = clone.f1356c;
        this.f1350b = i0Var2.f1396g;
        i0Var3 = clone.f1358e;
        this.f1351c = Long.valueOf(i0Var3.f1396g);
        cVar = clone.f1357d;
        this.f1352d = cVar;
    }

    public b b(long month) {
        this.f1351c = Long.valueOf(month);
        return this;
    }

    public d a() {
        Bundle deepCopyBundle = new Bundle();
        deepCopyBundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f1352d);
        i0 k2 = i0.k(this.f1349a);
        i0 k3 = i0.k(this.f1350b);
        c cVar = (c) deepCopyBundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = this.f1351c;
        return new d(k2, k3, cVar, l2 == null ? null : i0.k(l2.longValue()), null);
    }
}
