package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import c.a;
import f0.c1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n1 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f441l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap f442m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap f443n = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f444a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f445b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f446c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f447d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f448e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f449f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f450g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f451h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f452i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f453j;

    /* renamed from: k  reason: collision with root package name */
    public final m1 f454k;

    public n1(TextView textView) {
        this.f452i = textView;
        this.f453j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f454k = new l1();
        } else {
            this.f454k = new k1();
        }
    }

    public void p(AttributeSet attrs, int defStyleAttr) {
        int autoSizeStepSizeArrayResId;
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        Context context = this.f453j;
        int[] iArr = a.f1175i;
        TypedArray a2 = context.obtainStyledAttributes(attrs, iArr, defStyleAttr, 0);
        TextView textView = this.f452i;
        c1.j0(textView, textView.getContext(), iArr, attrs, a2, defStyleAttr, 0);
        int[] iArr2 = a.f1167a;
        if (a2.hasValue(5)) {
            this.f444a = a2.getInt(5, 0);
        }
        if (a2.hasValue(4)) {
            autoSizeStepGranularityInPx = a2.getDimension(4, -1.0f);
        }
        if (a2.hasValue(2)) {
            autoSizeMinTextSizeInPx = a2.getDimension(2, -1.0f);
        }
        if (a2.hasValue(1)) {
            autoSizeMaxTextSizeInPx = a2.getDimension(1, -1.0f);
        }
        if (a2.hasValue(3) && (autoSizeStepSizeArrayResId = a2.getResourceId(3, 0)) > 0) {
            TypedArray autoSizePreDefTextSizes = a2.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
            w(autoSizePreDefTextSizes);
            autoSizePreDefTextSizes.recycle();
        }
        a2.recycle();
        if (!z()) {
            this.f444a = 0;
        } else if (this.f444a == 1) {
            if (!this.f450g) {
                DisplayMetrics displayMetrics = this.f453j.getResources().getDisplayMetrics();
                if (autoSizeMinTextSizeInPx == -1.0f) {
                    autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (autoSizeMaxTextSizeInPx == -1.0f) {
                    autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (autoSizeStepGranularityInPx == -1.0f) {
                    autoSizeStepGranularityInPx = 1.0f;
                }
                A(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            }
            v();
        }
    }

    public void s(int autoSizeTextType) {
        if (z()) {
            switch (autoSizeTextType) {
                case 0:
                    c();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f453j.getResources().getDisplayMetrics();
                    float autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    float autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    A(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, 1.0f);
                    if (v()) {
                        a();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
            }
        }
    }

    public void q(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f453j.getResources().getDisplayMetrics();
            float autoSizeMinTextSizeInPx = TypedValue.applyDimension(unit, autoSizeMinTextSize, displayMetrics);
            float autoSizeMaxTextSizeInPx = TypedValue.applyDimension(unit, autoSizeMaxTextSize, displayMetrics);
            float autoSizeStepGranularityInPx = TypedValue.applyDimension(unit, autoSizeStepGranularity, displayMetrics);
            A(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            if (v()) {
                a();
            }
        }
    }

    public void r(int[] presetSizes, int unit) {
        if (z()) {
            int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                } else {
                    DisplayMetrics displayMetrics = this.f453j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < presetSizesLength; i2++) {
                        presetSizesInPx[i2] = Math.round(TypedValue.applyDimension(unit, presetSizes[i2], displayMetrics));
                    }
                }
                this.f449f = b(presetSizesInPx);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            } else {
                this.f450g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    public int k() {
        return this.f444a;
    }

    public int i() {
        return Math.round(this.f446c);
    }

    public int h() {
        return Math.round(this.f447d);
    }

    public int g() {
        return Math.round(this.f448e);
    }

    public int[] j() {
        return this.f449f;
    }

    public final void w(TypedArray textSizes) {
        int textSizesLength = textSizes.length();
        int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i2 = 0; i2 < textSizesLength; i2++) {
                parsedSizes[i2] = textSizes.getDimensionPixelSize(i2, -1);
            }
            this.f449f = b(parsedSizes);
            x();
        }
    }

    public final boolean x() {
        int[] iArr = this.f449f;
        int sizesLength = iArr.length;
        boolean z2 = sizesLength > 0;
        this.f450g = z2;
        if (z2) {
            this.f444a = 1;
            this.f447d = iArr[0];
            this.f448e = iArr[sizesLength - 1];
            this.f446c = -1.0f;
        }
        return z2;
    }

    public final int[] b(int[] presetValues) {
        int presetValuesLength = presetValues.length;
        if (presetValuesLength == 0) {
            return presetValues;
        }
        Arrays.sort(presetValues);
        List<Integer> uniqueValidSizes = new ArrayList<>();
        for (int currentPresetValue : presetValues) {
            if (currentPresetValue > 0 && Collections.binarySearch(uniqueValidSizes, Integer.valueOf(currentPresetValue)) < 0) {
                uniqueValidSizes.add(Integer.valueOf(currentPresetValue));
            }
        }
        int i2 = uniqueValidSizes.size();
        if (presetValuesLength == i2) {
            return presetValues;
        }
        int uniqueValidSizesLength = uniqueValidSizes.size();
        int[] cleanedUpSizes = new int[uniqueValidSizesLength];
        for (int i3 = 0; i3 < uniqueValidSizesLength; i3++) {
            cleanedUpSizes[i3] = uniqueValidSizes.get(i3).intValue();
        }
        return cleanedUpSizes;
    }

    public final void A(float autoSizeMinTextSizeInPx, float autoSizeMaxTextSizeInPx, float autoSizeStepGranularityInPx) {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        } else if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px)");
        } else if (autoSizeStepGranularityInPx > 0.0f) {
            this.f444a = 1;
            this.f447d = autoSizeMinTextSizeInPx;
            this.f448e = autoSizeMaxTextSizeInPx;
            this.f446c = autoSizeStepGranularityInPx;
            this.f450g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
    }

    public final boolean v() {
        if (!z() || this.f444a != 1) {
            this.f445b = false;
        } else {
            if (!this.f450g || this.f449f.length == 0) {
                int autoSizeValuesLength = ((int) Math.floor((this.f448e - this.f447d) / this.f446c)) + 1;
                int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                for (int i2 = 0; i2 < autoSizeValuesLength; i2++) {
                    autoSizeTextSizesInPx[i2] = Math.round(this.f447d + (i2 * this.f446c));
                }
                this.f449f = b(autoSizeTextSizesInPx);
            }
            this.f445b = true;
        }
        return this.f445b;
    }

    public void a() {
        int availableWidth;
        if (o()) {
            if (this.f445b) {
                if (this.f452i.getMeasuredHeight() > 0 && this.f452i.getMeasuredWidth() > 0) {
                    boolean horizontallyScrolling = this.f454k.b(this.f452i);
                    if (horizontallyScrolling) {
                        availableWidth = 1048576;
                    } else {
                        availableWidth = (this.f452i.getMeasuredWidth() - this.f452i.getTotalPaddingLeft()) - this.f452i.getTotalPaddingRight();
                    }
                    int availableHeight = (this.f452i.getHeight() - this.f452i.getCompoundPaddingBottom()) - this.f452i.getCompoundPaddingTop();
                    if (availableWidth > 0 && availableHeight > 0) {
                        RectF rectF = f441l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = availableWidth;
                            rectF.bottom = availableHeight;
                            float optimalTextSize = f(rectF);
                            if (optimalTextSize != this.f452i.getTextSize()) {
                                u(0, optimalTextSize);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f445b = true;
        }
    }

    public final void c() {
        this.f444a = 0;
        this.f447d = -1.0f;
        this.f448e = -1.0f;
        this.f446c = -1.0f;
        this.f449f = new int[0];
        this.f445b = false;
    }

    public void u(int unit, float size) {
        Resources res;
        Context context = this.f453j;
        if (context == null) {
            res = Resources.getSystem();
        } else {
            res = context.getResources();
        }
        t(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }

    public final void t(float size) {
        if (size != this.f452i.getPaint().getTextSize()) {
            this.f452i.getPaint().setTextSize(size);
            boolean isInLayout = this.f452i.isInLayout();
            if (this.f452i.getLayout() != null) {
                this.f445b = false;
                try {
                    Method method = l("nullLayouts");
                    if (method != null) {
                        method.invoke(this.f452i, new Object[0]);
                    }
                } catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ex);
                }
                if (!isInLayout) {
                    this.f452i.requestLayout();
                } else {
                    this.f452i.forceLayout();
                }
                this.f452i.invalidate();
            }
        }
    }

    public final int f(RectF availableSpace) {
        int sizesCount = this.f449f.length;
        if (sizesCount != 0) {
            int bestSizeIndex = 0;
            int lowIndex = 0 + 1;
            int highIndex = sizesCount - 1;
            while (lowIndex <= highIndex) {
                int sizeToTryIndex = (lowIndex + highIndex) / 2;
                if (y(this.f449f[sizeToTryIndex], availableSpace)) {
                    bestSizeIndex = lowIndex;
                    lowIndex = sizeToTryIndex + 1;
                } else {
                    highIndex = sizeToTryIndex - 1;
                    bestSizeIndex = highIndex;
                }
            }
            return this.f449f[bestSizeIndex];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public void m(int suggestedSizeInPx) {
        TextPaint textPaint = this.f451h;
        if (textPaint == null) {
            this.f451h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f451h.set(this.f452i.getPaint());
        this.f451h.setTextSize(suggestedSizeInPx);
    }

    public StaticLayout d(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        return e(text, alignment, availableWidth, maxLines);
    }

    public final boolean y(int suggestedSizeInPx, RectF availableSpace) {
        CharSequence transformedText;
        CharSequence text = this.f452i.getText();
        TransformationMethod transformationMethod = this.f452i.getTransformationMethod();
        if (!(transformationMethod == null || (transformedText = transformationMethod.getTransformation(text, this.f452i)) == null)) {
            text = transformedText;
        }
        int maxLines = this.f452i.getMaxLines();
        m(suggestedSizeInPx);
        Layout.Alignment alignment = (Layout.Alignment) n(this.f452i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout layout = d(text, alignment, Math.round(availableSpace.right), maxLines);
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && ((float) layout.getHeight()) <= availableSpace.bottom;
    }

    public final StaticLayout e(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        StaticLayout.Builder layoutBuilder = StaticLayout.Builder.obtain(text, 0, text.length(), this.f451h, availableWidth);
        layoutBuilder.setAlignment(alignment).setLineSpacing(this.f452i.getLineSpacingExtra(), this.f452i.getLineSpacingMultiplier()).setIncludePad(this.f452i.getIncludeFontPadding()).setBreakStrategy(this.f452i.getBreakStrategy()).setHyphenationFrequency(this.f452i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
        try {
            this.f454k.a(layoutBuilder, this.f452i);
        } catch (ClassCastException e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return layoutBuilder.build();
    }

    public static Object n(Object object, String methodName, Object obj) {
        Object obj2 = null;
        try {
            try {
                Method method = l(methodName);
                obj2 = method.invoke(object, new Object[0]);
                if (obj2 != null || !exceptionThrown) {
                    return obj2;
                }
            } catch (Exception ex) {
                Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + methodName + "() method", ex);
                if (obj2 != null) {
                    return obj2;
                }
            }
            return obj;
        } finally {
            if (!(obj2 == null && 0 == 0)) {
            }
        }
    }

    public static Method l(String methodName) {
        try {
            Method method = (Method) f442m.get(methodName);
            if (method == null && (method = TextView.class.getDeclaredMethod(methodName, new Class[0])) != null) {
                method.setAccessible(true);
                f442m.put(methodName, method);
            }
            return method;
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", ex);
            return null;
        }
    }

    public boolean o() {
        return z() && this.f444a != 0;
    }

    public final boolean z() {
        return !(this.f452i instanceof e0);
    }
}
