package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.savedstate.g;

/* loaded from: classes.dex */
public class w extends f0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler V;

    /* renamed from: e0 */
    public boolean f951e0;

    /* renamed from: g0 */
    public Dialog f953g0;

    /* renamed from: h0 */
    public boolean f954h0;

    /* renamed from: i0 */
    public boolean f955i0;

    /* renamed from: j0 */
    public boolean f956j0;
    public Runnable W = new r(this);
    public DialogInterface.OnCancelListener X = new s(this);
    public DialogInterface.OnDismissListener Y = new t(this);
    public int Z = 0;

    /* renamed from: a0 */
    public int f947a0 = 0;

    /* renamed from: b0 */
    public boolean f948b0 = true;

    /* renamed from: c0 */
    public boolean f949c0 = true;

    /* renamed from: d0 */
    public int f950d0 = -1;

    /* renamed from: f0 */
    public androidx.lifecycle.w f952f0 = new u(this);

    /* renamed from: k0 */
    public boolean f957k0 = false;

    public static /* synthetic */ Dialog o1(w x02) {
        return x02.f953g0;
    }

    public static /* synthetic */ boolean q1(w x02) {
        return x02.f949c0;
    }

    public void r1() {
        s1(false, false);
    }

    public final void s1(boolean allowStateLoss, boolean fromOnDismiss) {
        if (!this.f955i0) {
            this.f955i0 = true;
            this.f956j0 = false;
            Dialog dialog = this.f953g0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f953g0.dismiss();
                if (!fromOnDismiss) {
                    if (Looper.myLooper() == this.V.getLooper()) {
                        onDismiss(this.f953g0);
                    } else {
                        this.V.post(this.W);
                    }
                }
            }
            this.f954h0 = true;
            if (this.f950d0 >= 0) {
                B().F0(this.f950d0, 1);
                this.f950d0 = -1;
                return;
            }
            z1 ft = B().i();
            ft.k(this);
            if (allowStateLoss) {
                ft.f();
            } else {
                ft.e();
            }
        }
    }

    public Dialog t1() {
        return this.f953g0;
    }

    public final Dialog z1() {
        Dialog dialog = t1();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public int u1() {
        return this.f947a0;
    }

    @Override // androidx.fragment.app.f0
    public void c0(Context context) {
        super.c0(context);
        Q().e(this.f952f0);
        this.f955i0 = false;
    }

    @Override // androidx.fragment.app.f0
    public void m0() {
        super.m0();
        if (!this.f955i0) {
            this.f955i0 = true;
        }
        Q().h(this.f952f0);
    }

    @Override // androidx.fragment.app.f0
    public void f0(Bundle savedInstanceState) {
        super.f0(savedInstanceState);
        this.V = new Handler();
        this.f949c0 = this.f782y == 0;
        if (savedInstanceState != null) {
            this.Z = savedInstanceState.getInt("android:style", 0);
            this.f947a0 = savedInstanceState.getInt("android:theme", 0);
            this.f948b0 = savedInstanceState.getBoolean("android:cancelable", true);
            this.f949c0 = savedInstanceState.getBoolean("android:showsDialog", this.f949c0);
            this.f950d0 = savedInstanceState.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.f0
    public void I0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle dialogState;
        super.I0(inflater, container, savedInstanceState);
        if (this.H == null && this.f953g0 != null && savedInstanceState != null && (dialogState = savedInstanceState.getBundle("android:savedDialogState")) != null) {
            this.f953g0.onRestoreInstanceState(dialogState);
        }
    }

    @Override // androidx.fragment.app.f0
    public n0 e() {
        n0 fragmentContainer = super.e();
        return new v(this, fragmentContainer);
    }

    public View w1(int id) {
        Dialog dialog = this.f953g0;
        if (dialog != null) {
            return dialog.findViewById(id);
        }
        return null;
    }

    public boolean x1() {
        return this.f957k0;
    }

    @Override // androidx.fragment.app.f0
    public LayoutInflater n0(Bundle savedInstanceState) {
        LayoutInflater layoutInflater = super.n0(savedInstanceState);
        if (!this.f949c0 || this.f951e0) {
            if (m1.v0(2)) {
                String message = "getting layout inflater for DialogFragment " + this;
                if (!this.f949c0) {
                    Log.d("FragmentManager", "mShowsDialog = false: " + message);
                } else {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + message);
                }
            }
            return layoutInflater;
        }
        y1(savedInstanceState);
        if (m1.v0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f953g0;
        if (dialog != null) {
            return layoutInflater.cloneInContext(dialog.getContext());
        }
        return layoutInflater;
    }

    public void A1(Dialog dialog, int style) {
        switch (style) {
            case 1:
            case 2:
                break;
            default:
                return;
            case 3:
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                    break;
                }
                break;
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog v1(Bundle savedInstanceState) {
        if (m1.v0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(b1(), u1());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        if (!this.f954h0) {
            if (m1.v0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            s1(true, true);
        }
    }

    public final void y1(Bundle savedInstanceState) {
        if (this.f949c0 && !this.f957k0) {
            try {
                this.f951e0 = true;
                Dialog v1 = v1(savedInstanceState);
                this.f953g0 = v1;
                if (this.f949c0) {
                    A1(v1, this.Z);
                    Context context = p();
                    if (context instanceof Activity) {
                        this.f953g0.setOwnerActivity((Activity) context);
                    }
                    this.f953g0.setCancelable(this.f948b0);
                    this.f953g0.setOnCancelListener(this.X);
                    this.f953g0.setOnDismissListener(this.Y);
                    this.f957k0 = true;
                } else {
                    this.f953g0 = null;
                }
            } finally {
                this.f951e0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.f0
    public void B0(Bundle savedInstanceState) {
        Bundle dialogState;
        super.B0(savedInstanceState);
        if (this.f953g0 != null && savedInstanceState != null && (dialogState = savedInstanceState.getBundle("android:savedDialogState")) != null) {
            this.f953g0.onRestoreInstanceState(dialogState);
        }
    }

    @Override // androidx.fragment.app.f0
    public void y0() {
        super.y0();
        Dialog dialog = this.f953g0;
        if (dialog != null) {
            this.f954h0 = false;
            dialog.show();
            View decorView = this.f953g0.getWindow().getDecorView();
            i0.a(decorView, this);
            j0.a(decorView, this);
            g.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.f0
    public void x0(Bundle outState) {
        super.x0(outState);
        Dialog dialog = this.f953g0;
        if (dialog != null) {
            Bundle dialogState = dialog.onSaveInstanceState();
            dialogState.putBoolean("android:dialogShowing", false);
            outState.putBundle("android:savedDialogState", dialogState);
        }
        int i2 = this.Z;
        if (i2 != 0) {
            outState.putInt("android:style", i2);
        }
        int i3 = this.f947a0;
        if (i3 != 0) {
            outState.putInt("android:theme", i3);
        }
        boolean z2 = this.f948b0;
        if (!z2) {
            outState.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f949c0;
        if (!z3) {
            outState.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f950d0;
        if (i4 != -1) {
            outState.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.f0
    public void z0() {
        super.z0();
        Dialog dialog = this.f953g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.f0
    public void l0() {
        super.l0();
        Dialog dialog = this.f953g0;
        if (dialog != null) {
            this.f954h0 = true;
            dialog.setOnDismissListener(null);
            this.f953g0.dismiss();
            if (!this.f955i0) {
                onDismiss(this.f953g0);
            }
            this.f953g0 = null;
            this.f957k0 = false;
        }
    }
}
