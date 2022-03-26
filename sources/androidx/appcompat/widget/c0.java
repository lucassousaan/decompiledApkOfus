package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.example.helloworld.R;
import x.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c0 implements p2 {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f268a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b  reason: collision with root package name */
    public final int[] f269b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c  reason: collision with root package name */
    public final int[] f270c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

    /* renamed from: d  reason: collision with root package name */
    public final int[] f271d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e  reason: collision with root package name */
    public final int[] f272e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f  reason: collision with root package name */
    public final int[] f273f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public final ColorStateList e(Context context) {
        return c(context, o3.c(context, R.attr.colorButtonNormal));
    }

    public final ColorStateList b(Context context) {
        return c(context, 0);
    }

    public final ColorStateList d(Context context) {
        return c(context, o3.c(context, R.attr.colorAccent));
    }

    public final ColorStateList c(Context context, int baseColor) {
        int[][] states = new int[4];
        int[] colors = new int[4];
        int colorControlHighlight = o3.c(context, R.attr.colorControlHighlight);
        int disabledColor = o3.b(context, R.attr.colorButtonNormal);
        states[0] = o3.f474b;
        colors[0] = disabledColor;
        int i2 = 0 + 1;
        states[i2] = o3.f476d;
        colors[i2] = a.b(colorControlHighlight, baseColor);
        int i3 = i2 + 1;
        states[i3] = o3.f475c;
        colors[i3] = a.b(colorControlHighlight, baseColor);
        int i4 = i3 + 1;
        states[i4] = o3.f478f;
        colors[i4] = baseColor;
        int i5 = i4 + 1;
        return new ColorStateList(states, colors);
    }

    public final ColorStateList g(Context context) {
        int[][] states = new int[3];
        int[] colors = new int[3];
        ColorStateList thumbColor = o3.e(context, R.attr.colorSwitchThumbNormal);
        if (thumbColor == null || !thumbColor.isStateful()) {
            states[0] = o3.f474b;
            colors[0] = o3.b(context, R.attr.colorSwitchThumbNormal);
            int i2 = 0 + 1;
            states[i2] = o3.f477e;
            colors[i2] = o3.c(context, R.attr.colorControlActivated);
            int i3 = i2 + 1;
            states[i3] = o3.f478f;
            colors[i3] = o3.c(context, R.attr.colorSwitchThumbNormal);
            int i4 = i3 + 1;
        } else {
            states[0] = o3.f474b;
            colors[0] = thumbColor.getColorForState(states[0], 0);
            int i5 = 0 + 1;
            states[i5] = o3.f477e;
            colors[i5] = o3.c(context, R.attr.colorControlActivated);
            int i6 = i5 + 1;
            states[i6] = o3.f478f;
            colors[i6] = thumbColor.getDefaultColor();
            int i7 = i6 + 1;
        }
        return new ColorStateList(states, colors);
    }

    public Drawable f(q2 resourceManager, Context context, int resId) {
        if (resId == R.drawable.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{resourceManager.i(context, R.drawable.abc_cab_background_internal_bg), resourceManager.i(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (resId == R.drawable.abc_ratingbar_material) {
            return h(resourceManager, context, R.dimen.abc_star_big);
        }
        if (resId == R.drawable.abc_ratingbar_indicator_material) {
            return h(resourceManager, context, R.dimen.abc_star_medium);
        }
        if (resId == R.drawable.abc_ratingbar_small_material) {
            return h(resourceManager, context, R.dimen.abc_star_small);
        }
        return null;
    }

    public final LayerDrawable h(q2 resourceManager, Context context, int dimenResId) {
        BitmapDrawable tiledStarBitmapDrawable;
        BitmapDrawable starBitmapDrawable;
        BitmapDrawable halfStarBitmapDrawable;
        int starSize = context.getResources().getDimensionPixelSize(dimenResId);
        Drawable star = resourceManager.i(context, R.drawable.abc_star_black_48dp);
        Drawable halfStar = resourceManager.i(context, R.drawable.abc_star_half_black_48dp);
        if ((star instanceof BitmapDrawable) && star.getIntrinsicWidth() == starSize && star.getIntrinsicHeight() == starSize) {
            starBitmapDrawable = (BitmapDrawable) star;
            tiledStarBitmapDrawable = new BitmapDrawable(starBitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapStar = Bitmap.createBitmap(starSize, starSize, Bitmap.Config.ARGB_8888);
            Canvas canvasStar = new Canvas(bitmapStar);
            star.setBounds(0, 0, starSize, starSize);
            star.draw(canvasStar);
            BitmapDrawable starBitmapDrawable2 = new BitmapDrawable(bitmapStar);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapStar);
            starBitmapDrawable = starBitmapDrawable2;
            tiledStarBitmapDrawable = bitmapDrawable;
        }
        tiledStarBitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((halfStar instanceof BitmapDrawable) && halfStar.getIntrinsicWidth() == starSize && halfStar.getIntrinsicHeight() == starSize) {
            halfStarBitmapDrawable = (BitmapDrawable) halfStar;
        } else {
            Bitmap bitmapHalfStar = Bitmap.createBitmap(starSize, starSize, Bitmap.Config.ARGB_8888);
            Canvas canvasHalfStar = new Canvas(bitmapHalfStar);
            halfStar.setBounds(0, 0, starSize, starSize);
            halfStar.draw(canvasHalfStar);
            halfStarBitmapDrawable = new BitmapDrawable(bitmapHalfStar);
        }
        LayerDrawable result = new LayerDrawable(new Drawable[]{starBitmapDrawable, halfStarBitmapDrawable, tiledStarBitmapDrawable});
        result.setId(0, 16908288);
        result.setId(1, 16908303);
        result.setId(2, 16908301);
        return result;
    }

    public final void k(Drawable d2, int color, PorterDuff.Mode mode) {
        PorterDuff.Mode mode2;
        if (s1.a(d2)) {
            d2 = d2.mutate();
        }
        if (mode == null) {
            mode2 = d0.f281b;
        } else {
            mode2 = mode;
        }
        d2.setColorFilter(d0.e(color, mode2));
    }

    public boolean l(Context context, int resId, Drawable drawable) {
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2;
        PorterDuff.Mode mode3;
        PorterDuff.Mode mode4;
        PorterDuff.Mode mode5;
        PorterDuff.Mode mode6;
        if (resId == R.drawable.abc_seekbar_track_material) {
            LayerDrawable ld = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = ld.findDrawableByLayerId(16908288);
            int c2 = o3.c(context, R.attr.colorControlNormal);
            mode4 = d0.f281b;
            k(findDrawableByLayerId, c2, mode4);
            Drawable findDrawableByLayerId2 = ld.findDrawableByLayerId(16908303);
            int c3 = o3.c(context, R.attr.colorControlNormal);
            mode5 = d0.f281b;
            k(findDrawableByLayerId2, c3, mode5);
            Drawable findDrawableByLayerId3 = ld.findDrawableByLayerId(16908301);
            int c4 = o3.c(context, R.attr.colorControlActivated);
            mode6 = d0.f281b;
            k(findDrawableByLayerId3, c4, mode6);
            return true;
        } else if (resId != R.drawable.abc_ratingbar_material && resId != R.drawable.abc_ratingbar_indicator_material && resId != R.drawable.abc_ratingbar_small_material) {
            return false;
        } else {
            LayerDrawable ld2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId4 = ld2.findDrawableByLayerId(16908288);
            int b2 = o3.b(context, R.attr.colorControlNormal);
            mode = d0.f281b;
            k(findDrawableByLayerId4, b2, mode);
            Drawable findDrawableByLayerId5 = ld2.findDrawableByLayerId(16908303);
            int c5 = o3.c(context, R.attr.colorControlActivated);
            mode2 = d0.f281b;
            k(findDrawableByLayerId5, c5, mode2);
            Drawable findDrawableByLayerId6 = ld2.findDrawableByLayerId(16908301);
            int c6 = o3.c(context, R.attr.colorControlActivated);
            mode3 = d0.f281b;
            k(findDrawableByLayerId6, c6, mode3);
            return true;
        }
    }

    public final boolean a(int[] array, int value) {
        for (int id : array) {
            if (id == value) {
                return true;
            }
        }
        return false;
    }

    public ColorStateList i(Context context, int resId) {
        if (resId == R.drawable.abc_edit_text_material) {
            return e.a.a(context, R.color.abc_tint_edittext);
        }
        if (resId == R.drawable.abc_switch_track_mtrl_alpha) {
            return e.a.a(context, R.color.abc_tint_switch_track);
        }
        if (resId == R.drawable.abc_switch_thumb_material) {
            return g(context);
        }
        if (resId == R.drawable.abc_btn_default_mtrl_shape) {
            return e(context);
        }
        if (resId == R.drawable.abc_btn_borderless_material) {
            return b(context);
        }
        if (resId == R.drawable.abc_btn_colored_material) {
            return d(context);
        }
        if (resId == R.drawable.abc_spinner_mtrl_am_alpha || resId == R.drawable.abc_spinner_textfield_background_material) {
            return e.a.a(context, R.color.abc_tint_spinner);
        }
        if (a(this.f269b, resId)) {
            return o3.e(context, R.attr.colorControlNormal);
        }
        if (a(this.f272e, resId)) {
            return e.a.a(context, R.color.abc_tint_default);
        }
        if (a(this.f273f, resId)) {
            return e.a.a(context, R.color.abc_tint_btn_checkable);
        }
        if (resId == R.drawable.abc_seekbar_thumb_material) {
            return e.a.a(context, R.color.abc_tint_seek_thumb);
        }
        return null;
    }

    public boolean m(Context context, int resId, Drawable drawable) {
        PorterDuff.Mode tintMode;
        tintMode = d0.f281b;
        boolean colorAttrSet = false;
        int colorAttr = 0;
        int alpha = -1;
        if (a(this.f268a, resId)) {
            colorAttr = R.attr.colorControlNormal;
            colorAttrSet = true;
        } else if (a(this.f270c, resId)) {
            colorAttr = R.attr.colorControlActivated;
            colorAttrSet = true;
        } else if (a(this.f271d, resId)) {
            colorAttr = 16842801;
            colorAttrSet = true;
            tintMode = PorterDuff.Mode.MULTIPLY;
        } else if (resId == R.drawable.abc_list_divider_mtrl_alpha) {
            colorAttr = 16842800;
            colorAttrSet = true;
            alpha = Math.round(40.8f);
        } else if (resId == R.drawable.abc_dialog_material_background) {
            colorAttr = 16842801;
            colorAttrSet = true;
        }
        if (!colorAttrSet) {
            return false;
        }
        if (s1.a(drawable)) {
            drawable = drawable.mutate();
        }
        int color = o3.c(context, colorAttr);
        drawable.setColorFilter(d0.e(color, tintMode));
        if (alpha == -1) {
            return true;
        }
        drawable.setAlpha(alpha);
        return true;
    }

    public PorterDuff.Mode j(int resId) {
        if (resId != R.drawable.abc_switch_thumb_material) {
            return null;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        return mode;
    }
}
