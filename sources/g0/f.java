package g0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b0.a;
import com.example.helloworld.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: d  reason: collision with root package name */
    public static int f2021d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f2022a;

    /* renamed from: b  reason: collision with root package name */
    public int f2023b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2024c = -1;

    public f(AccessibilityNodeInfo info) {
        this.f2022a = info;
    }

    public static f v0(AccessibilityNodeInfo info) {
        return new f(info);
    }

    public AccessibilityNodeInfo u0() {
        return this.f2022a;
    }

    public static f L(View source) {
        return v0(AccessibilityNodeInfo.obtain(source));
    }

    public static f K() {
        return v0(AccessibilityNodeInfo.obtain());
    }

    public static f M(f info) {
        return v0(AccessibilityNodeInfo.obtain(info.f2022a));
    }

    public void p0(View root, int virtualDescendantId) {
        this.f2024c = virtualDescendantId;
        this.f2022a.setSource(root, virtualDescendantId);
    }

    public int n() {
        return this.f2022a.getChildCount();
    }

    public void c(View root, int virtualDescendantId) {
        this.f2022a.addChild(root, virtualDescendantId);
    }

    public int j() {
        return this.f2022a.getActions();
    }

    public void a(int action) {
        this.f2022a.addAction(action);
    }

    public final List g(String key) {
        ArrayList<Integer> list = this.f2022a.getExtras().getIntegerArrayList(key);
        if (list != null) {
            return list;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        this.f2022a.getExtras().putIntegerArrayList(key, list2);
        return list2;
    }

    public void b(c action) {
        this.f2022a.addAction((AccessibilityNodeInfo.AccessibilityAction) action.f2015a);
    }

    public boolean N(int action, Bundle arguments) {
        return this.f2022a.performAction(action, arguments);
    }

    public void k0(View parent) {
        this.f2023b = -1;
        this.f2022a.setParent(parent);
    }

    public void l0(View root, int virtualDescendantId) {
        this.f2023b = virtualDescendantId;
        this.f2022a.setParent(root, virtualDescendantId);
    }

    public void l(Rect outBounds) {
        this.f2022a.getBoundsInParent(outBounds);
    }

    public void S(Rect bounds) {
        this.f2022a.setBoundsInParent(bounds);
    }

    public void m(Rect outBounds) {
        this.f2022a.getBoundsInScreen(outBounds);
    }

    public void T(Rect bounds) {
        this.f2022a.setBoundsInScreen(bounds);
    }

    public boolean z() {
        return this.f2022a.isCheckable();
    }

    public void U(boolean checkable) {
        this.f2022a.setCheckable(checkable);
    }

    public boolean A() {
        return this.f2022a.isChecked();
    }

    public void V(boolean checked) {
        this.f2022a.setChecked(checked);
    }

    public boolean D() {
        return this.f2022a.isFocusable();
    }

    public void d0(boolean focusable) {
        this.f2022a.setFocusable(focusable);
    }

    public boolean E() {
        return this.f2022a.isFocused();
    }

    public void e0(boolean focused) {
        this.f2022a.setFocused(focused);
    }

    public void t0(boolean visibleToUser) {
        this.f2022a.setVisibleToUser(visibleToUser);
    }

    public void Q(boolean focused) {
        this.f2022a.setAccessibilityFocused(focused);
    }

    public boolean I() {
        return this.f2022a.isSelected();
    }

    public boolean B() {
        return this.f2022a.isClickable();
    }

    public void X(boolean clickable) {
        this.f2022a.setClickable(clickable);
    }

    public boolean F() {
        return this.f2022a.isLongClickable();
    }

    public boolean C() {
        return this.f2022a.isEnabled();
    }

    public void b0(boolean enabled) {
        this.f2022a.setEnabled(enabled);
    }

    public boolean G() {
        return this.f2022a.isPassword();
    }

    public boolean H() {
        return this.f2022a.isScrollable();
    }

    public void n0(boolean scrollable) {
        this.f2022a.setScrollable(scrollable);
    }

    public CharSequence t() {
        return this.f2022a.getPackageName();
    }

    public void i0(CharSequence packageName) {
        this.f2022a.setPackageName(packageName);
    }

    public CharSequence o() {
        return this.f2022a.getClassName();
    }

    public void W(CharSequence className) {
        this.f2022a.setClassName(className);
    }

    public CharSequence v() {
        if (!x()) {
            return this.f2022a.getText();
        }
        List<Integer> starts = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> ends = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> flags = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> ids = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        Spannable spannable = new SpannableString(TextUtils.substring(this.f2022a.getText(), 0, this.f2022a.getText().length()));
        for (int i2 = 0; i2 < starts.size(); i2++) {
            spannable.setSpan(new a(ids.get(i2).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), starts.get(i2).intValue(), ends.get(i2).intValue(), flags.get(i2).intValue());
        }
        return spannable;
    }

    public void r0(CharSequence text) {
        this.f2022a.setText(text);
    }

    public void e(CharSequence text, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            P(view);
            ClickableSpan[] spans = p(text);
            if (spans != null && spans.length > 0) {
                r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> tagSpans = s(view);
                for (int i2 = 0; i2 < spans.length; i2++) {
                    int id = y(spans[i2], tagSpans);
                    tagSpans.put(id, new WeakReference<>(spans[i2]));
                    d(spans[i2], (Spanned) text, id);
                }
            }
        }
    }

    public final SparseArray s(View host) {
        SparseArray<WeakReference<ClickableSpan>> spans = u(host);
        if (spans != null) {
            return spans;
        }
        SparseArray<WeakReference<ClickableSpan>> spans2 = new SparseArray<>();
        host.setTag(R.id.tag_accessibility_clickable_spans, spans2);
        return spans2;
    }

    public final SparseArray u(View host) {
        return (SparseArray) host.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] p(CharSequence text) {
        if (!(text instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) text;
        return (ClickableSpan[]) spanned.getSpans(0, text.length(), ClickableSpan.class);
    }

    public final int y(ClickableSpan span, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                ClickableSpan aSpan = (ClickableSpan) ((WeakReference) sparseArray.valueAt(i2)).get();
                if (span.equals(aSpan)) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f2021d;
        f2021d = i3 + 1;
        return i3;
    }

    public final boolean x() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public final void f() {
        this.f2022a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f2022a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f2022a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f2022a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public final void d(ClickableSpan span, Spanned spanned, int id) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(span)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(span)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(span)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(id));
    }

    public final void P(View view) {
        SparseArray<WeakReference<ClickableSpan>> spans = u(view);
        if (spans != null) {
            List<Integer> toBeRemovedIndices = new ArrayList<>();
            for (int i2 = 0; i2 < spans.size(); i2++) {
                if (spans.valueAt(i2).get() == null) {
                    toBeRemovedIndices.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < toBeRemovedIndices.size(); i3++) {
                spans.remove(toBeRemovedIndices.get(i3).intValue());
            }
        }
    }

    public CharSequence q() {
        return this.f2022a.getContentDescription();
    }

    public void a0(CharSequence contentDescription) {
        this.f2022a.setContentDescription(contentDescription);
    }

    public void q0(CharSequence stateDescription) {
        if (a.b()) {
            this.f2022a.setStateDescription(stateDescription);
        } else {
            this.f2022a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", stateDescription);
        }
    }

    public void O() {
        this.f2022a.recycle();
    }

    public String w() {
        return this.f2022a.getViewIdResourceName();
    }

    public void Y(Object collectionInfo) {
        this.f2022a.setCollectionInfo(collectionInfo == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((d) collectionInfo).f2019a);
    }

    public void Z(Object collectionItemInfo) {
        this.f2022a.setCollectionItemInfo(collectionItemInfo == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((e) collectionItemInfo).f2020a);
    }

    public List h() {
        List<Object> actions = this.f2022a.getActionList();
        if (actions == null) {
            return Collections.emptyList();
        }
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> result = new ArrayList<>();
        int actionCount = actions.size();
        for (int i2 = 0; i2 < actionCount; i2++) {
            Object action = actions.get(i2);
            result.add(new c(action));
        }
        return result;
    }

    public void g0(CharSequence hintText) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2022a.setHintText(hintText);
        } else {
            this.f2022a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hintText);
        }
    }

    public void c0(CharSequence error) {
        this.f2022a.setError(error);
    }

    public Bundle r() {
        return this.f2022a.getExtras();
    }

    public void h0(int max) {
        this.f2022a.setMaxTextLength(max);
    }

    public void s0(View view) {
        this.f2022a.setTraversalAfter(view);
    }

    public void j0(CharSequence paneTitle) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2022a.setPaneTitle(paneTitle);
        } else {
            this.f2022a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paneTitle);
        }
    }

    public void m0(boolean screenReaderFocusable) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2022a.setScreenReaderFocusable(screenReaderFocusable);
        } else {
            R(1, screenReaderFocusable);
        }
    }

    public boolean J() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f2022a.isShowingHintText();
        }
        return k(4);
    }

    public void o0(boolean showingHintText) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2022a.setShowingHintText(showingHintText);
        } else {
            R(4, showingHintText);
        }
    }

    public void f0(boolean isHeading) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2022a.setHeading(isHeading);
        } else {
            R(2, isHeading);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2022a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f other = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2022a;
        if (accessibilityNodeInfo == null) {
            if (other.f2022a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(other.f2022a)) {
            return false;
        }
        if (this.f2024c == other.f2024c && this.f2023b == other.f2023b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        Rect bounds = new Rect();
        l(bounds);
        builder.append("; boundsInParent: " + bounds);
        m(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(t());
        builder.append("; className: ");
        builder.append(o());
        builder.append("; text: ");
        builder.append(v());
        builder.append("; contentDescription: ");
        builder.append(q());
        builder.append("; viewId: ");
        builder.append(w());
        builder.append("; checkable: ");
        builder.append(z());
        builder.append("; checked: ");
        builder.append(A());
        builder.append("; focusable: ");
        builder.append(D());
        builder.append("; focused: ");
        builder.append(E());
        builder.append("; selected: ");
        builder.append(I());
        builder.append("; clickable: ");
        builder.append(B());
        builder.append("; longClickable: ");
        builder.append(F());
        builder.append("; enabled: ");
        builder.append(C());
        builder.append("; password: ");
        builder.append(G());
        builder.append("; scrollable: " + H());
        builder.append("; [");
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actions = h();
        for (int i2 = 0; i2 < actions.size(); i2++) {
            c action = (c) actions.get(i2);
            String actionName = i(action.b());
            if (actionName.equals("ACTION_UNKNOWN") && action.c() != null) {
                actionName = action.c().toString();
            }
            builder.append(actionName);
            if (i2 != actions.size() - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    public final void R(int property, boolean value) {
        Bundle extras = r();
        if (extras != null) {
            int i2 = 0;
            int booleanProperties = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int booleanProperties2 = booleanProperties & (~property);
            if (value) {
                i2 = property;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | booleanProperties2);
        }
    }

    public final boolean k(int property) {
        Bundle extras = r();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & property) == property;
    }

    public static String i(int action) {
        switch (action) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908342:
                return "ACTION_SHOW_ON_SCREEN";
            case 16908343:
                return "ACTION_SCROLL_TO_POSITION";
            case 16908344:
                return "ACTION_SCROLL_UP";
            case 16908345:
                return "ACTION_SCROLL_LEFT";
            case 16908346:
                return "ACTION_SCROLL_DOWN";
            case 16908347:
                return "ACTION_SCROLL_RIGHT";
            case 16908348:
                return "ACTION_CONTEXT_CLICK";
            case 16908349:
                return "ACTION_SET_PROGRESS";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908356:
                return "ACTION_SHOW_TOOLTIP";
            case 16908357:
                return "ACTION_HIDE_TOOLTIP";
            case 16908358:
                return "ACTION_PAGE_UP";
            case 16908359:
                return "ACTION_PAGE_DOWN";
            case 16908360:
                return "ACTION_PAGE_LEFT";
            case 16908361:
                return "ACTION_PAGE_RIGHT";
            case 16908362:
                return "ACTION_PRESS_AND_HOLD";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
