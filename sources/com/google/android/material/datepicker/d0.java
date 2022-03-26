package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.w;
import androidx.fragment.app.z1;
import com.example.helloworld.R;
import com.google.android.material.internal.CheckableImageButton;
import f0.c1;
import g1.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.c;
import q1.j;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class d0<S> extends w {
    public static final Object C0 = "CONFIRM_BUTTON_TAG";
    public static final Object D0 = "CANCEL_BUTTON_TAG";
    public static final Object E0 = "TOGGLE_BUTTON_TAG";
    public j A0;
    public Button B0;

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet f1361l0 = new LinkedHashSet();

    /* renamed from: m0  reason: collision with root package name */
    public final LinkedHashSet f1362m0 = new LinkedHashSet();

    /* renamed from: n0  reason: collision with root package name */
    public final LinkedHashSet f1363n0 = new LinkedHashSet();

    /* renamed from: o0  reason: collision with root package name */
    public final LinkedHashSet f1364o0 = new LinkedHashSet();

    /* renamed from: p0  reason: collision with root package name */
    public int f1365p0;

    /* renamed from: q0  reason: collision with root package name */
    public g f1366q0;

    /* renamed from: r0  reason: collision with root package name */
    public o0 f1367r0;

    /* renamed from: s0  reason: collision with root package name */
    public d f1368s0;

    /* renamed from: t0  reason: collision with root package name */
    public x f1369t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1370u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f1371v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1372w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f1373x0;

    /* renamed from: y0  reason: collision with root package name */
    public TextView f1374y0;

    /* renamed from: z0  reason: collision with root package name */
    public CheckableImageButton f1375z0;

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public String L1() {
        return this.f1366q0.d(p());
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w, androidx.fragment.app.f0
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1365p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f1366q0);
        b constraintsBuilder = new b(this.f1368s0);
        if (this.f1369t0.A1() != null) {
            constraintsBuilder.b(this.f1369t0.A1().f1396g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", constraintsBuilder.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1370u0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1371v0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w, androidx.fragment.app.f0
    public final void f0(Bundle bundle) {
        super.f0(bundle);
        Bundle activeBundle = bundle == null ? n() : bundle;
        this.f1365p0 = activeBundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f1366q0 = (g) activeBundle.getParcelable("DATE_SELECTOR_KEY");
        this.f1368s0 = (d) activeBundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f1370u0 = activeBundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f1371v0 = activeBundle.getCharSequence("TITLE_TEXT_KEY");
        this.f1373x0 = activeBundle.getInt("INPUT_MODE_KEY");
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public final int O1(Context context) {
        int i2 = this.f1365p0;
        if (i2 != 0) {
            return i2;
        }
        return this.f1366q0.f(context);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w
    public final Dialog v1(Bundle bundle) {
        Dialog dialog = new Dialog(b1(), O1(b1()));
        Context context = dialog.getContext();
        this.f1372w0 = Q1(context);
        int surfaceColor = c.c(context, R.attr.colorSurface, d0.class.getCanonicalName());
        j jVar = new j(context, null, R.attr.materialCalendarStyle, 2131755663);
        this.A0 = jVar;
        jVar.J(context);
        this.A0.T(ColorStateList.valueOf(surfaceColor));
        this.A0.S(c1.v(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.f0
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int layout = this.f1372w0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog;
        View root = layoutInflater.inflate(layout, viewGroup);
        Context context = root.getContext();
        if (this.f1372w0) {
            View frame = root.findViewById(R.id.mtrl_calendar_frame);
            frame.setLayoutParams(new LinearLayout.LayoutParams(M1(context), -2));
        } else {
            View pane = root.findViewById(R.id.mtrl_calendar_main_pane);
            View frame2 = root.findViewById(R.id.mtrl_calendar_frame);
            pane.setLayoutParams(new LinearLayout.LayoutParams(M1(context), -1));
            frame2.setMinimumHeight(K1(b1()));
        }
        TextView textView = (TextView) root.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f1374y0 = textView;
        c1.n0(textView, 1);
        this.f1375z0 = (CheckableImageButton) root.findViewById(R.id.mtrl_picker_header_toggle);
        TextView titleTextView = (TextView) root.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f1371v0;
        if (charSequence != null) {
            titleTextView.setText(charSequence);
        } else {
            titleTextView.setText(this.f1370u0);
        }
        P1(context);
        this.B0 = (Button) root.findViewById(R.id.confirm_button);
        if (this.f1366q0.b()) {
            this.B0.setEnabled(true);
        } else {
            this.B0.setEnabled(false);
        }
        this.B0.setTag("CONFIRM_BUTTON_TAG");
        this.B0.setOnClickListener(new z(this));
        Button cancelButton = (Button) root.findViewById(R.id.cancel_button);
        cancelButton.setTag("CANCEL_BUTTON_TAG");
        cancelButton.setOnClickListener(new a0(this));
        return root;
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w, androidx.fragment.app.f0
    public void y0() {
        super.y0();
        Window window = z1().getWindow();
        if (this.f1372w0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A0);
        } else {
            window.setLayout(-2, -2);
            int inset = H().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect insets = new Rect(inset, inset, inset, inset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A0, inset, inset, inset, inset));
            window.getDecorView().setOnTouchListener(new a(z1(), insets));
        }
        T1();
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w, androidx.fragment.app.f0
    public void z0() {
        this.f1367r0.p1();
        super.z0();
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1363n0.iterator();
        while (it.hasNext()) {
            DialogInterface.OnCancelListener listener = (DialogInterface.OnCancelListener) it.next();
            listener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    @Override // androidx.fragment.app.w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1364o0.iterator();
        while (it.hasNext()) {
            DialogInterface.OnDismissListener listener = (DialogInterface.OnDismissListener) it.next();
            listener.onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) P();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public final Object N1() {
        return this.f1366q0.a();
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public final void U1() {
        String headerText = L1();
        this.f1374y0.setContentDescription(String.format(N(R.string.mtrl_picker_announce_current_selection), headerText));
        this.f1374y0.setText(headerText);
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public final void T1() {
        int themeResId = O1(b1());
        this.f1369t0 = x.E1(this.f1366q0, themeResId, this.f1368s0);
        this.f1367r0 = this.f1375z0.isChecked() ? g0.q1(this.f1366q0, themeResId, this.f1368s0) : this.f1369t0;
        U1();
        z1 fragmentTransaction = o().i();
        fragmentTransaction.l(R.id.mtrl_calendar_frame, this.f1367r0);
        fragmentTransaction.g();
        this.f1367r0.o1(new b0(this));
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public final void P1(Context context) {
        this.f1375z0.setTag("TOGGLE_BUTTON_TAG");
        this.f1375z0.setImageDrawable(J1(context));
        this.f1375z0.setChecked(this.f1373x0 != 0);
        c1.l0(this.f1375z0, null);
        V1(this.f1375z0);
        this.f1375z0.setOnClickListener(new c0(this));
    }

    /* JADX WARN: Generic types in debug info not equals: com.google.android.material.datepicker.d0 != com.google.android.material.datepicker.MaterialDatePicker<S> */
    public final void V1(CheckableImageButton toggle) {
        String contentDescription;
        if (this.f1375z0.isChecked()) {
            contentDescription = toggle.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            contentDescription = toggle.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f1375z0.setContentDescription(contentDescription);
    }

    public static Drawable J1(Context context) {
        StateListDrawable toggleDrawable = new StateListDrawable();
        toggleDrawable.addState(new int[]{16842912}, e.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        toggleDrawable.addState(new int[0], e.a.b(context, R.drawable.material_ic_edit_black_24dp));
        return toggleDrawable;
    }

    public static boolean Q1(Context context) {
        return S1(context, 16843277);
    }

    public static boolean R1(Context context) {
        return S1(context, R.attr.nestedScrollable);
    }

    public static boolean S1(Context context, int attributeResId) {
        int calendarStyle = c.c(context, R.attr.materialCalendarStyle, x.class.getCanonicalName());
        int[] attrs = {attributeResId};
        TypedArray a2 = context.obtainStyledAttributes(calendarStyle, attrs);
        boolean attributeValue = a2.getBoolean(0, false);
        a2.recycle();
        return attributeValue;
    }

    public static int K1(Context context) {
        Resources resources = context.getResources();
        int navigationHeight = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int daysOfWeekHeight = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i2 = j0.f1399g;
        int calendarHeight = (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding));
        int calendarPadding = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
        return navigationHeight + daysOfWeekHeight + calendarHeight + calendarPadding;
    }

    public static int M1(Context context) {
        Resources resources = context.getResources();
        int padding = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int daysInWeek = i0.l().f1394e;
        int dayWidth = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int horizontalSpace = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        return (padding * 2) + (daysInWeek * dayWidth) + ((daysInWeek - 1) * horizontalSpace);
    }
}
