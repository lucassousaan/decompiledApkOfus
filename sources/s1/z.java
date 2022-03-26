package s1;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.example.helloworld.R;
import com.google.android.material.textfield.TextInputLayout;
import e.a;
import f0.c1;
import q1.j;
import q1.o;
import q1.q;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class z extends a0 {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f3537q = true;

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f3538d = new p(this);

    /* renamed from: e  reason: collision with root package name */
    public final View.OnFocusChangeListener f3539e = new q(this);

    /* renamed from: f  reason: collision with root package name */
    public final q0 f3540f = new r(this, this.f3453a);

    /* renamed from: g  reason: collision with root package name */
    public final r0 f3541g = new s(this);

    /* renamed from: h  reason: collision with root package name */
    public final s0 f3542h = new u(this);

    /* renamed from: i  reason: collision with root package name */
    public boolean f3543i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3544j = false;

    /* renamed from: k  reason: collision with root package name */
    public long f3545k = Long.MAX_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public StateListDrawable f3546l;

    /* renamed from: m  reason: collision with root package name */
    public j f3547m;

    /* renamed from: n  reason: collision with root package name */
    public AccessibilityManager f3548n;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f3549o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f3550p;

    public static /* synthetic */ boolean i() {
        return true;
    }

    public z(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // s1.a0
    public void a() {
        float popupCornerRadius = this.f3454b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float exposedDropdownPopupElevation = this.f3454b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int exposedDropdownPopupVerticalPadding = this.f3454b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        j roundedCornersPopupBackground = A(popupCornerRadius, popupCornerRadius, exposedDropdownPopupElevation, exposedDropdownPopupVerticalPadding);
        j roundedBottomCornersPopupBackground = A(0.0f, popupCornerRadius, exposedDropdownPopupElevation, exposedDropdownPopupVerticalPadding);
        this.f3547m = roundedCornersPopupBackground;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f3546l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, roundedCornersPopupBackground);
        this.f3546l.addState(new int[0], roundedBottomCornersPopupBackground);
        this.f3453a.setEndIconDrawable(a.b(this.f3454b, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f3453a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f3453a.setEndIconOnClickListener(new v(this));
        this.f3453a.e(this.f3541g);
        this.f3453a.f(this.f3542h);
        B();
        this.f3548n = (AccessibilityManager) this.f3454b.getSystemService("accessibility");
    }

    @Override // s1.a0
    public boolean d() {
        return true;
    }

    @Override // s1.a0
    public boolean b(int boxBackgroundMode) {
        return boxBackgroundMode != 0;
    }

    public final void H(AutoCompleteTextView editText) {
        if (editText != null) {
            if (C()) {
                this.f3543i = false;
            }
            if (!this.f3543i) {
                E(!this.f3544j);
                if (this.f3544j) {
                    editText.requestFocus();
                    editText.showDropDown();
                    return;
                }
                editText.dismissDropDown();
                return;
            }
            this.f3543i = false;
        }
    }

    public final void F(AutoCompleteTextView editText) {
        int boxBackgroundMode = this.f3453a.getBoxBackgroundMode();
        if (boxBackgroundMode == 2) {
            editText.setDropDownBackgroundDrawable(this.f3547m);
        } else if (boxBackgroundMode == 1) {
            editText.setDropDownBackgroundDrawable(this.f3546l);
        }
    }

    public final void v(AutoCompleteTextView editText) {
        if (!D(editText)) {
            int boxBackgroundMode = this.f3453a.getBoxBackgroundMode();
            j boxBackground = this.f3453a.getBoxBackground();
            int rippleColor = f1.a.c(editText, R.attr.colorControlHighlight);
            int[][] states = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                x(editText, rippleColor, states, boxBackground);
            } else if (boxBackgroundMode == 1) {
                w(editText, rippleColor, states, boxBackground);
            }
        }
    }

    public final void x(AutoCompleteTextView editText, int rippleColor, int[][] states, j boxBackground) {
        int surfaceColor = f1.a.c(editText, R.attr.colorSurface);
        j rippleBackground = new j(boxBackground.A());
        int pressedBackgroundColor = f1.a.f(rippleColor, surfaceColor, 0.1f);
        int[] rippleBackgroundColors = {pressedBackgroundColor, 0};
        rippleBackground.T(new ColorStateList(states, rippleBackgroundColors));
        rippleBackground.setTint(surfaceColor);
        int[] colors = {pressedBackgroundColor, surfaceColor};
        ColorStateList rippleColorStateList = new ColorStateList(states, colors);
        j mask = new j(boxBackground.A());
        mask.setTint(-1);
        Drawable rippleDrawable = new RippleDrawable(rippleColorStateList, rippleBackground, mask);
        Drawable[] layers = {rippleDrawable, boxBackground};
        LayerDrawable editTextBackground = new LayerDrawable(layers);
        c1.o0(editText, editTextBackground);
    }

    public final void w(AutoCompleteTextView editText, int rippleColor, int[][] states, j boxBackground) {
        int boxBackgroundColor = this.f3453a.getBoxBackgroundColor();
        int pressedBackgroundColor = f1.a.f(rippleColor, boxBackgroundColor, 0.1f);
        int[] colors = {pressedBackgroundColor, boxBackgroundColor};
        ColorStateList rippleColorStateList = new ColorStateList(states, colors);
        Drawable editTextBackground = new RippleDrawable(rippleColorStateList, boxBackground, boxBackground);
        c1.o0(editText, editTextBackground);
    }

    public final void G(AutoCompleteTextView editText) {
        editText.setOnTouchListener(new w(this, editText));
        editText.setOnFocusChangeListener(this.f3539e);
        editText.setOnDismissListener(new x(this));
    }

    public final j A(float topCornerRadius, float bottomCornerRadius, float elevation, int verticalPadding) {
        o a2 = q.a();
        a2.A(topCornerRadius);
        a2.E(topCornerRadius);
        a2.s(bottomCornerRadius);
        a2.w(bottomCornerRadius);
        q shapeAppearanceModel = a2.m();
        j popupDrawable = j.l(this.f3454b, elevation);
        popupDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        popupDrawable.V(0, verticalPadding, 0, verticalPadding);
        return popupDrawable;
    }

    public final boolean C() {
        long activeFor = System.currentTimeMillis() - this.f3545k;
        return activeFor < 0 || activeFor > 300;
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public final void E(boolean checked) {
        if (this.f3544j != checked) {
            this.f3544j = checked;
            this.f3550p.cancel();
            this.f3549o.start();
        }
    }

    public final void B() {
        this.f3550p = z(67, 0.0f, 1.0f);
        ValueAnimator z2 = z(50, 1.0f, 0.0f);
        this.f3549o = z2;
        z2.addListener(new y(this));
    }

    public final ValueAnimator z(int duration, float... values) {
        ValueAnimator animator = ValueAnimator.ofFloat(values);
        animator.setInterpolator(w0.a.f3651a);
        animator.setDuration(duration);
        animator.addUpdateListener(new o(this));
        return animator;
    }
}
