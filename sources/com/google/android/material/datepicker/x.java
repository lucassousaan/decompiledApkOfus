package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.helloworld.R;
import com.google.android.material.button.MaterialButton;
import f0.c1;
import q0.h1;
import q0.q0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class x<S> extends o0 {

    /* renamed from: g0  reason: collision with root package name */
    public static final Object f1444g0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: h0  reason: collision with root package name */
    public static final Object f1445h0 = "NAVIGATION_PREV_TAG";

    /* renamed from: i0  reason: collision with root package name */
    public static final Object f1446i0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: j0  reason: collision with root package name */
    public static final Object f1447j0 = "SELECTOR_TOGGLE_TAG";
    public int W;
    public g X;
    public d Y;
    public i0 Z;

    /* renamed from: a0  reason: collision with root package name */
    public v f1448a0;

    /* renamed from: b0  reason: collision with root package name */
    public f f1449b0;

    /* renamed from: c0  reason: collision with root package name */
    public RecyclerView f1450c0;

    /* renamed from: d0  reason: collision with root package name */
    public RecyclerView f1451d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1452e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f1453f0;

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.g != com.google.android.material.datepicker.DateSelector<T> */
    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<T> */
    public static x E1(g gVar, int themeResId, d calendarConstraints) {
        x xVar = new x();
        Bundle args = new Bundle();
        args.putInt("THEME_RES_ID_KEY", themeResId);
        args.putParcelable("GRID_SELECTOR_KEY", gVar);
        args.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        args.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.q());
        xVar.h1(args);
        return xVar;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    @Override // androidx.fragment.app.f0
    public void x0(Bundle bundle) {
        super.x0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Z);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    @Override // androidx.fragment.app.f0
    public void f0(Bundle bundle) {
        super.f0(bundle);
        Bundle activeBundle = bundle == null ? n() : bundle;
        this.W = activeBundle.getInt("THEME_RES_ID_KEY");
        this.X = (g) activeBundle.getParcelable("GRID_SELECTOR_KEY");
        this.Y = (d) activeBundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.Z = (i0) activeBundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    @Override // androidx.fragment.app.f0
    public View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int orientation;
        int layout;
        ContextThemeWrapper themedContext = new ContextThemeWrapper(p(), this.W);
        this.f1449b0 = new f(themedContext);
        LayoutInflater themedInflater = layoutInflater.cloneInContext(themedContext);
        i0 earliestMonth = this.Y.r();
        if (d0.Q1(themedContext)) {
            layout = R.layout.mtrl_calendar_vertical;
            orientation = 1;
        } else {
            layout = R.layout.mtrl_calendar_horizontal;
            orientation = 0;
        }
        View root = themedInflater.inflate(layout, viewGroup, false);
        GridView daysHeader = (GridView) root.findViewById(R.id.mtrl_calendar_days_of_week);
        c1.l0(daysHeader, new m(this));
        daysHeader.setAdapter((ListAdapter) new k());
        daysHeader.setNumColumns(earliestMonth.f1394e);
        daysHeader.setEnabled(false);
        this.f1451d0 = (RecyclerView) root.findViewById(R.id.mtrl_calendar_months);
        q0 layoutManager = new n(this, p(), orientation, false, orientation);
        this.f1451d0.setLayoutManager(layoutManager);
        this.f1451d0.setTag("MONTHS_VIEW_GROUP_TAG");
        m0 monthsPagerAdapter = new m0(themedContext, this.X, this.Y, new o(this));
        this.f1451d0.setAdapter(monthsPagerAdapter);
        int columns = themedContext.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f1450c0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f1450c0.setLayoutManager(new GridLayoutManager((Context) themedContext, columns, 1, false));
            this.f1450c0.setAdapter(new v0(this));
            this.f1450c0.h(x1());
        }
        if (root.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            w1(root, monthsPagerAdapter);
        }
        if (!d0.Q1(themedContext)) {
            new q0().b(this.f1451d0);
        }
        this.f1451d0.g1(monthsPagerAdapter.x(this.Z));
        return root;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public final h1 x1() {
        return new p(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public i0 A1() {
        return this.Z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public d y1() {
        return this.Y;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public void G1(i0 moveTo) {
        m0 adapter = (m0) this.f1451d0.getAdapter();
        int moveToPosition = adapter.x(moveTo);
        int distance = moveToPosition - adapter.x(this.Z);
        boolean isForward = true;
        boolean jump = Math.abs(distance) > 3;
        if (distance <= 0) {
            isForward = false;
        }
        this.Z = moveTo;
        if (jump && isForward) {
            this.f1451d0.g1(moveToPosition - 3);
            F1(moveToPosition);
        } else if (jump) {
            this.f1451d0.g1(moveToPosition + 3);
            F1(moveToPosition);
        } else {
            F1(moveToPosition);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public g B1() {
        return this.X;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public f z1() {
        return this.f1449b0;
    }

    public static int C1(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public void H1(v selector) {
        this.f1448a0 = selector;
        if (selector == v.YEAR) {
            this.f1450c0.getLayoutManager().x1(((v0) this.f1450c0.getAdapter()).w(this.Z.f1393d));
            this.f1452e0.setVisibility(0);
            this.f1453f0.setVisibility(8);
        } else if (selector == v.DAY) {
            this.f1452e0.setVisibility(8);
            this.f1453f0.setVisibility(0);
            G1(this.Z);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public void I1() {
        v vVar = this.f1448a0;
        v vVar2 = v.YEAR;
        if (vVar == vVar2) {
            H1(v.DAY);
        } else if (vVar == v.DAY) {
            H1(vVar2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public final void w1(View root, m0 monthsPagerAdapter) {
        MaterialButton monthDropSelect = (MaterialButton) root.findViewById(R.id.month_navigation_fragment_toggle);
        monthDropSelect.setTag("SELECTOR_TOGGLE_TAG");
        c1.l0(monthDropSelect, new q(this));
        MaterialButton monthPrev = (MaterialButton) root.findViewById(R.id.month_navigation_previous);
        monthPrev.setTag("NAVIGATION_PREV_TAG");
        MaterialButton monthNext = (MaterialButton) root.findViewById(R.id.month_navigation_next);
        monthNext.setTag("NAVIGATION_NEXT_TAG");
        this.f1452e0 = root.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f1453f0 = root.findViewById(R.id.mtrl_calendar_day_selector_frame);
        H1(v.DAY);
        monthDropSelect.setText(this.Z.p(root.getContext()));
        this.f1451d0.k(new r(this, monthsPagerAdapter, monthDropSelect));
        monthDropSelect.setOnClickListener(new s(this));
        monthNext.setOnClickListener(new t(this, monthsPagerAdapter));
        monthPrev.setOnClickListener(new u(this, monthsPagerAdapter));
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public final void F1(int position) {
        this.f1451d0.post(new l(this, position));
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    public LinearLayoutManager D1() {
        return (LinearLayoutManager) this.f1451d0.getLayoutManager();
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.n0 != com.google.android.material.datepicker.OnSelectionChangedListener<S> */
    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.x != com.google.android.material.datepicker.MaterialCalendar<S> */
    @Override // com.google.android.material.datepicker.o0
    public boolean o1(n0 n0Var) {
        return super.o1(n0Var);
    }
}
