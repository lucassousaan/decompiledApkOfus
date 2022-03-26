package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import c.a;
import com.example.helloworld.R;
import f0.c1;
import g.d;
import j0.c;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class SearchView extends b2 implements d {

    /* renamed from: r0  reason: collision with root package name */
    public static final h3 f165r0;
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public f3 L;
    public e3 M;
    public View.OnFocusChangeListener N;
    public g3 O;
    public View.OnClickListener P;
    public boolean Q;
    public boolean R;
    public c S;
    public boolean T;
    public CharSequence U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f166a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f167b0;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f168c0;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f169d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f170e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f171f0;

    /* renamed from: g0  reason: collision with root package name */
    public SearchableInfo f172g0;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f173h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Runnable f174i0;

    /* renamed from: j0  reason: collision with root package name */
    public Runnable f175j0;

    /* renamed from: k0  reason: collision with root package name */
    public final WeakHashMap f176k0;

    /* renamed from: l0  reason: collision with root package name */
    public final View.OnClickListener f177l0;

    /* renamed from: m0  reason: collision with root package name */
    public View.OnKeyListener f178m0;

    /* renamed from: n0  reason: collision with root package name */
    public final TextView.OnEditorActionListener f179n0;

    /* renamed from: o0  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f180o0;

    /* renamed from: p0  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f181p0;

    /* renamed from: q  reason: collision with root package name */
    public final SearchAutoComplete f182q;

    /* renamed from: q0  reason: collision with root package name */
    public TextWatcher f183q0;

    /* renamed from: r  reason: collision with root package name */
    public final View f184r;

    /* renamed from: s  reason: collision with root package name */
    public final View f185s;

    /* renamed from: t  reason: collision with root package name */
    public final View f186t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f187u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f188v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f189w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f190x;

    /* renamed from: y  reason: collision with root package name */
    public final View f191y;

    /* renamed from: z  reason: collision with root package name */
    public l3 f192z;

    static {
        f165r0 = Build.VERSION.SDK_INT < 29 ? new h3() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f174i0 = new v2(this);
        this.f175j0 = new w2(this);
        this.f176k0 = new WeakHashMap();
        z2 z2Var = new z2(this);
        this.f177l0 = z2Var;
        this.f178m0 = new a3(this);
        b3 b3Var = new b3(this);
        this.f179n0 = b3Var;
        c3 c3Var = new c3(this);
        this.f180o0 = c3Var;
        d3 d3Var = new d3(this);
        this.f181p0 = d3Var;
        this.f183q0 = new u2(this);
        s3 a2 = s3.v(context, attrs, a.f1186t, defStyleAttr, 0);
        LayoutInflater inflater = LayoutInflater.from(context);
        int[] iArr = a.f1167a;
        int layoutResId = a2.n(9, R.layout.abc_search_view);
        inflater.inflate(layoutResId, (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f182q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f184r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f185s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f186t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f187u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f188v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f189w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f190x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        c1.o0(findViewById, a2.g(10));
        c1.o0(findViewById2, a2.g(14));
        imageView.setImageDrawable(a2.g(13));
        imageView2.setImageDrawable(a2.g(7));
        imageView3.setImageDrawable(a2.g(4));
        imageView4.setImageDrawable(a2.g(16));
        imageView5.setImageDrawable(a2.g(13));
        this.F = a2.g(12);
        e4.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = a2.n(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = a2.n(5, 0);
        imageView.setOnClickListener(z2Var);
        imageView3.setOnClickListener(z2Var);
        imageView2.setOnClickListener(z2Var);
        imageView4.setOnClickListener(z2Var);
        searchAutoComplete.setOnClickListener(z2Var);
        searchAutoComplete.addTextChangedListener(this.f183q0);
        searchAutoComplete.setOnEditorActionListener(b3Var);
        searchAutoComplete.setOnItemClickListener(c3Var);
        searchAutoComplete.setOnItemSelectedListener(d3Var);
        searchAutoComplete.setOnKeyListener(this.f178m0);
        searchAutoComplete.setOnFocusChangeListener(new x2(this));
        setIconifiedByDefault(a2.a(8, true));
        int maxWidth = a2.f(1, -1);
        if (maxWidth != -1) {
            setMaxWidth(maxWidth);
        }
        this.K = a2.p(6);
        this.U = a2.p(11);
        int imeOptions = a2.k(3, -1);
        if (imeOptions != -1) {
            setImeOptions(imeOptions);
        }
        int inputType = a2.k(2, -1);
        if (inputType != -1) {
            setInputType(inputType);
        }
        boolean focusable = a2.a(0, true);
        setFocusable(focusable);
        a2.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f191y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new y2(this));
        }
        k0(this.Q);
        g0();
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public void setSearchableInfo(SearchableInfo searchable) {
        this.f172g0 = searchable;
        if (searchable != null) {
            h0();
            g0();
        }
        boolean K = K();
        this.f167b0 = K;
        if (K) {
            this.f182q.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setAppSearchData(Bundle appSearchData) {
        this.f173h0 = appSearchData;
    }

    public void setImeOptions(int imeOptions) {
        this.f182q.setImeOptions(imeOptions);
    }

    public int getImeOptions() {
        return this.f182q.getImeOptions();
    }

    public void setInputType(int inputType) {
        this.f182q.setInputType(inputType);
    }

    public int getInputType() {
        return this.f182q.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        boolean result = this.f182q.requestFocus(direction, previouslyFocusedRect);
        if (result) {
            k0(false);
        }
        return result;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f182q.clearFocus();
        this.f182q.setImeVisibility(false);
        this.W = false;
    }

    public void setOnQueryTextListener(f3 listener) {
        this.L = listener;
    }

    public void setOnCloseListener(e3 listener) {
        this.M = listener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
        this.N = listener;
    }

    public void setOnSuggestionListener(g3 listener) {
        this.O = listener;
    }

    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.P = listener;
    }

    public CharSequence getQuery() {
        return this.f182q.getText();
    }

    public void d0(CharSequence query, boolean submit) {
        this.f182q.setText(query);
        if (query != null) {
            SearchAutoComplete searchAutoComplete = this.f182q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f169d0 = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            W();
        }
    }

    public void setQueryHint(CharSequence hint) {
        this.U = hint;
        g0();
    }

    public CharSequence getQueryHint() {
        if (this.U != null) {
            CharSequence hint = this.U;
            return hint;
        }
        SearchableInfo searchableInfo = this.f172g0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            CharSequence hint2 = this.K;
            return hint2;
        }
        CharSequence hint3 = getContext().getText(this.f172g0.getHintId());
        return hint3;
    }

    public void setIconifiedByDefault(boolean iconified) {
        if (this.Q != iconified) {
            this.Q = iconified;
            k0(iconified);
            g0();
        }
    }

    public void setIconified(boolean iconify) {
        if (iconify) {
            R();
        } else {
            V();
        }
    }

    public boolean L() {
        return this.R;
    }

    public void setSubmitButtonEnabled(boolean enabled) {
        this.T = enabled;
        k0(L());
    }

    public void setQueryRefinementEnabled(boolean enable) {
        this.V = enable;
        c cVar = this.S;
        if (cVar instanceof n3) {
            ((n3) cVar).x(enable ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(c adapter) {
        this.S = adapter;
        this.f182q.setAdapter(adapter);
    }

    public c getSuggestionsAdapter() {
        return this.S;
    }

    public void setMaxWidth(int maxpixels) {
        this.f166a0 = maxpixels;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f166a0;
    }

    @Override // androidx.appcompat.widget.b2, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (L()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        switch (widthMode) {
            case Integer.MIN_VALUE:
                int i2 = this.f166a0;
                if (i2 <= 0) {
                    width = Math.min(getPreferredWidth(), width);
                    break;
                } else {
                    width = Math.min(i2, width);
                    break;
                }
            case 0:
                width = this.f166a0;
                if (width <= 0) {
                    width = getPreferredWidth();
                }
                break;
            case 1073741824:
                int i3 = this.f166a0;
                if (i3 > 0) {
                    width = Math.min(i3, width);
                    break;
                }
                break;
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        switch (heightMode) {
            case Integer.MIN_VALUE:
                height = Math.min(getPreferredHeight(), height);
                break;
            case 0:
                height = getPreferredHeight();
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
    }

    @Override // androidx.appcompat.widget.b2, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            I(this.f182q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, bottom - top);
            l3 l3Var = this.f192z;
            if (l3Var == null) {
                l3 l3Var2 = new l3(this.B, this.A, this.f182q);
                this.f192z = l3Var2;
                setTouchDelegate(l3Var2);
                return;
            }
            l3Var.a(this.B, this.A);
        }
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i2 = iArr[1];
        int[] iArr2 = this.D;
        int top = i2 - iArr2[1];
        int left = iArr[0] - iArr2[0];
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    public final void k0(boolean collapsed) {
        int iconVisibility;
        this.R = collapsed;
        int i2 = 8;
        boolean z2 = false;
        int visCollapsed = collapsed ? 0 : 8;
        boolean hasText = !TextUtils.isEmpty(this.f182q.getText());
        this.f187u.setVisibility(visCollapsed);
        j0(hasText);
        View view = this.f184r;
        if (!collapsed) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.E.getDrawable() == null || this.Q) {
            iconVisibility = 8;
        } else {
            iconVisibility = 0;
        }
        this.E.setVisibility(iconVisibility);
        e0();
        if (!hasText) {
            z2 = true;
        }
        l0(z2);
        i0();
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.f172g0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.f172g0.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.I;
            } else if (this.f172g0.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.J;
            }
            if (testIntent != null) {
                ResolveInfo ri = getContext().getPackageManager().resolveActivity(testIntent, 65536);
                return ri != null;
            }
        }
        return false;
    }

    public final boolean N() {
        return (this.T || this.f167b0) && !L();
    }

    public final void j0(boolean hasText) {
        int visibility = 8;
        if (this.T && N() && hasFocus() && (hasText || !this.f167b0)) {
            visibility = 0;
        }
        this.f188v.setVisibility(visibility);
    }

    public final void i0() {
        int visibility = 8;
        if (N() && (this.f188v.getVisibility() == 0 || this.f190x.getVisibility() == 0)) {
            visibility = 0;
        }
        this.f186t.setVisibility(visibility);
    }

    public final void e0() {
        boolean showClose = true;
        boolean hasText = !TextUtils.isEmpty(this.f182q.getText());
        int i2 = 0;
        if (!hasText && (!this.Q || this.f170e0)) {
            showClose = false;
        }
        ImageView imageView = this.f189w;
        if (!showClose) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable closeButtonImg = this.f189w.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void b0() {
        post(this.f174i0);
    }

    public void f0() {
        boolean focused = this.f182q.hasFocus();
        int[] stateSet = focused ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable searchPlateBg = this.f185s.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        Drawable submitAreaBg = this.f186t.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f174i0);
        post(this.f175j0);
        super.onDetachedFromWindow();
    }

    public void U(CharSequence queryText) {
        setQuery(queryText);
    }

    public boolean X(int keyCode, KeyEvent event) {
        if (this.f172g0 != null && this.S != null && event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                int position = this.f182q.getListSelection();
                return S(position);
            } else if (keyCode == 21 || keyCode == 22) {
                int selPoint = keyCode == 21 ? 0 : this.f182q.length();
                this.f182q.setSelection(selPoint);
                this.f182q.setListSelection(0);
                this.f182q.clearListSelection();
                this.f182q.a();
                return true;
            } else if (keyCode == 19) {
                this.f182q.getListSelection();
                return false;
            }
        }
        return false;
    }

    public final CharSequence J(CharSequence hintText) {
        if (!this.Q || this.F == null) {
            return hintText;
        }
        int textSize = (int) (this.f182q.getTextSize() * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        ssb.setSpan(new ImageSpan(this.F), 1, 2, 33);
        ssb.append(hintText);
        return ssb;
    }

    public final void g0() {
        CharSequence hint = getQueryHint();
        this.f182q.setHint(J(hint == null ? "" : hint));
    }

    public final void h0() {
        this.f182q.setThreshold(this.f172g0.getSuggestThreshold());
        this.f182q.setImeOptions(this.f172g0.getImeOptions());
        int inputType = this.f172g0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f172g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f182q.setInputType(inputType);
        c cVar = this.S;
        if (cVar != null) {
            cVar.b(null);
        }
        if (this.f172g0.getSuggestAuthority() != null) {
            n3 n3Var = new n3(getContext(), this, this.f172g0, this.f176k0);
            this.S = n3Var;
            this.f182q.setAdapter(n3Var);
            n3 n3Var2 = (n3) this.S;
            if (this.V) {
                i2 = 2;
            }
            n3Var2.x(i2);
        }
    }

    public final void l0(boolean empty) {
        int visibility = 8;
        if (this.f167b0 && !L() && empty) {
            visibility = 0;
            this.f188v.setVisibility(8);
        }
        this.f190x.setVisibility(visibility);
    }

    public void Y(CharSequence newText) {
        CharSequence text = this.f182q.getText();
        this.f169d0 = text;
        boolean z2 = true;
        boolean hasText = !TextUtils.isEmpty(text);
        j0(hasText);
        if (hasText) {
            z2 = false;
        }
        l0(z2);
        e0();
        i0();
        if (this.L != null && !TextUtils.equals(newText, this.f168c0)) {
            this.L.b(newText.toString());
        }
        this.f168c0 = newText.toString();
    }

    public void W() {
        CharSequence query = this.f182q.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            f3 f3Var = this.L;
            if (f3Var == null || !f3Var.a(query.toString())) {
                if (this.f172g0 != null) {
                    P(0, null, query.toString());
                }
                this.f182q.setImeVisibility(false);
                G();
            }
        }
    }

    public final void G() {
        this.f182q.dismissDropDown();
    }

    public void R() {
        CharSequence text = this.f182q.getText();
        if (!TextUtils.isEmpty(text)) {
            this.f182q.setText("");
            this.f182q.requestFocus();
            this.f182q.setImeVisibility(true);
        } else if (this.Q) {
            e3 e3Var = this.M;
            if (e3Var == null || !e3Var.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    public void V() {
        k0(false);
        this.f182q.requestFocus();
        this.f182q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void a0() {
        if (this.f172g0 != null) {
            SearchableInfo searchable = this.f172g0;
            try {
                if (searchable.getVoiceSearchLaunchWebSearch()) {
                    Intent webSearchIntent = F(this.I, searchable);
                    getContext().startActivity(webSearchIntent);
                } else if (searchable.getVoiceSearchLaunchRecognizer()) {
                    Intent appSearchIntent = E(this.J, searchable);
                    getContext().startActivity(appSearchIntent);
                }
            } catch (ActivityNotFoundException e2) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void Z() {
        k0(L());
        b0();
        if (this.f182q.hasFocus()) {
            H();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        b0();
    }

    @Override // g.d
    public void e() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f182q.setImeOptions(this.f171f0);
        this.f170e0 = false;
    }

    @Override // g.d
    public void a() {
        if (!this.f170e0) {
            this.f170e0 = true;
            int imeOptions = this.f182q.getImeOptions();
            this.f171f0 = imeOptions;
            this.f182q.setImeOptions(imeOptions | 33554432);
            this.f182q.setText("");
            setIconified(false);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        j3 ss = new j3(superState);
        ss.f409d = L();
        return ss;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof j3)) {
            super.onRestoreInstanceState(state);
            return;
        }
        j3 ss = (j3) state;
        super.onRestoreInstanceState(ss.i());
        k0(ss.f409d);
        requestLayout();
    }

    public void B() {
        int iconOffset;
        int offset;
        if (this.f191y.getWidth() > 1) {
            Resources res = getContext().getResources();
            int anchorPadding = this.f185s.getPaddingLeft();
            Rect dropDownPadding = new Rect();
            boolean isLayoutRtl = l4.b(this);
            if (this.Q) {
                iconOffset = res.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
            } else {
                iconOffset = 0;
            }
            this.f182q.getDropDownBackground().getPadding(dropDownPadding);
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            } else {
                int offset2 = dropDownPadding.left;
                offset = anchorPadding - (offset2 + iconOffset);
            }
            this.f182q.setDropDownHorizontalOffset(offset);
            int width = (((this.f191y.getWidth() + dropDownPadding.left) + dropDownPadding.right) + iconOffset) - anchorPadding;
            this.f182q.setDropDownWidth(width);
        }
    }

    public boolean S(int position) {
        g3 g3Var = this.O;
        if (g3Var != null && g3Var.b(position)) {
            return false;
        }
        Q(position, 0, null);
        this.f182q.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int position) {
        g3 g3Var = this.O;
        if (g3Var != null && g3Var.a(position)) {
            return false;
        }
        c0(position);
        return true;
    }

    public final void c0(int position) {
        CharSequence oldQuery = this.f182q.getText();
        Cursor c2 = this.S.d();
        if (c2 != null) {
            if (c2.moveToPosition(position)) {
                CharSequence newQuery = this.S.c(c2);
                if (newQuery != null) {
                    setQuery(newQuery);
                } else {
                    setQuery(oldQuery);
                }
            } else {
                setQuery(oldQuery);
            }
        }
    }

    public final boolean Q(int position, int actionKey, String actionMsg) {
        Cursor c2 = this.S.d();
        if (c2 == null || !c2.moveToPosition(position)) {
            return false;
        }
        Intent intent = D(c2, actionKey, actionMsg);
        O(intent);
        return true;
    }

    public final void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException ex) {
                Log.e("SearchView", "Failed launch activity: " + intent, ex);
            }
        }
    }

    private void setQuery(CharSequence query) {
        this.f182q.setText(query);
        this.f182q.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    public void P(int actionKey, String actionMsg, String query) {
        Intent intent = C("android.intent.action.SEARCH", null, null, query, actionKey, actionMsg);
        getContext().startActivity(intent);
    }

    public final Intent C(String action, Uri data, String extraData, String query, int actionKey, String actionMsg) {
        Intent intent = new Intent(action);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.f169d0);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        Bundle bundle = this.f173h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.f172g0.getSearchActivity());
        return intent;
    }

    public final Intent F(Intent baseIntent, SearchableInfo searchable) {
        Intent voiceIntent = new Intent(baseIntent);
        ComponentName searchActivity = searchable.getSearchActivity();
        voiceIntent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return voiceIntent;
    }

    public final Intent E(Intent baseIntent, SearchableInfo searchable) {
        ComponentName searchActivity = searchable.getSearchActivity();
        Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        PendingIntent pending = PendingIntent.getActivity(getContext(), 0, queryIntent, 1073741824);
        Bundle queryExtras = new Bundle();
        Bundle bundle = this.f173h0;
        if (bundle != null) {
            queryExtras.putParcelable("app_data", bundle);
        }
        Intent voiceIntent = new Intent(baseIntent);
        String languageModel = "free_form";
        String prompt = null;
        String language = null;
        int maxResults = 1;
        Resources resources = getResources();
        if (searchable.getVoiceLanguageModeId() != 0) {
            languageModel = resources.getString(searchable.getVoiceLanguageModeId());
        }
        if (searchable.getVoicePromptTextId() != 0) {
            prompt = resources.getString(searchable.getVoicePromptTextId());
        }
        if (searchable.getVoiceLanguageId() != 0) {
            language = resources.getString(searchable.getVoiceLanguageId());
        }
        if (searchable.getVoiceMaxResults() != 0) {
            maxResults = searchable.getVoiceMaxResults();
        }
        voiceIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", languageModel);
        voiceIntent.putExtra("android.speech.extra.PROMPT", prompt);
        voiceIntent.putExtra("android.speech.extra.LANGUAGE", language);
        voiceIntent.putExtra("android.speech.extra.MAX_RESULTS", maxResults);
        voiceIntent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pending);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", queryExtras);
        return voiceIntent;
    }

    public final Intent D(Cursor c2, int actionKey, String actionMsg) {
        int rowNum;
        String data;
        String id;
        try {
            String action = n3.n(c2, "suggest_intent_action");
            if (action == null) {
                action = this.f172g0.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data2 = n3.n(c2, "suggest_intent_data");
            if (data2 == null) {
                data2 = this.f172g0.getSuggestIntentData();
            }
            if (data2 == null || (id = n3.n(c2, "suggest_intent_data_id")) == null) {
                data = data2;
            } else {
                data = data2 + "/" + Uri.encode(id);
            }
            Uri dataUri = data == null ? null : Uri.parse(data);
            String query = n3.n(c2, "suggest_intent_query");
            String extraData = n3.n(c2, "suggest_intent_extra_data");
            return C(action, dataUri, extraData, query, actionKey, actionMsg);
        } catch (RuntimeException e2) {
            try {
                rowNum = c2.getPosition();
            } catch (RuntimeException e3) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", e2);
            return null;
        }
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f182q.refreshAutoCompleteResults();
            return;
        }
        h3 h3Var = f165r0;
        h3Var.b(this.f182q);
        h3Var.a(this.f182q);
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* JADX WARN: Classes with same name are omitted:
  
 */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends w {

        /* renamed from: e  reason: collision with root package name */
        public int f193e;

        /* renamed from: f  reason: collision with root package name */
        public SearchView f194f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f195g;

        /* renamed from: h  reason: collision with root package name */
        public final Runnable f196h;

        public SearchAutoComplete(Context context, AttributeSet attrs) {
            this(context, attrs, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.f196h = new k3(this);
            this.f193e = getThreshold();
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics metrics = getResources().getDisplayMetrics();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), metrics));
        }

        public void setSearchView(SearchView searchView) {
            this.f194f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            this.f193e = threshold;
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence text) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.f194f.hasFocus() && getVisibility() == 0) {
                this.f195g = true;
                if (SearchView.M(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.f194f.Z();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f193e <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            if (keyCode == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState state = getKeyDispatcherState();
                    if (state != null) {
                        state.startTracking(event, this);
                    }
                    return true;
                } else if (event.getAction() == 1) {
                    KeyEvent.DispatcherState state2 = getKeyDispatcherState();
                    if (state2 != null) {
                        state2.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        this.f194f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(keyCode, event);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration config = getResources().getConfiguration();
            int widthDp = config.screenWidthDp;
            int heightDp = config.screenHeightDp;
            if (widthDp >= 960 && heightDp >= 720 && config.orientation == 2) {
                return 256;
            }
            if (widthDp >= 600) {
                return 192;
            }
            if (widthDp < 640 || heightDp < 480) {
                return 160;
            }
            return 192;
        }

        @Override // androidx.appcompat.widget.w, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.f195g) {
                removeCallbacks(this.f196h);
                post(this.f196h);
            }
            return ic;
        }

        public void c() {
            if (this.f195g) {
                InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
                imm.showSoftInput(this, 0);
                this.f195g = false;
            }
        }

        public void setImeVisibility(boolean visible) {
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
            if (!visible) {
                this.f195g = false;
                removeCallbacks(this.f196h);
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (imm.isActive(this)) {
                this.f195g = false;
                removeCallbacks(this.f196h);
                imm.showSoftInput(this, 0);
            } else {
                this.f195g = true;
            }
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f165r0.c(this);
        }
    }
}
