package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.a2;
import androidx.core.widget.NestedScrollView;
import c.a;
import com.example.helloworld.R;
import f0.c1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class j {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1632a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f1633b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f1634c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1635d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1636e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1637f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f1638g;

    /* renamed from: h  reason: collision with root package name */
    public View f1639h;

    /* renamed from: i  reason: collision with root package name */
    public int f1640i;

    /* renamed from: j  reason: collision with root package name */
    public int f1641j;

    /* renamed from: k  reason: collision with root package name */
    public int f1642k;

    /* renamed from: l  reason: collision with root package name */
    public int f1643l;

    /* renamed from: m  reason: collision with root package name */
    public int f1644m;

    /* renamed from: o  reason: collision with root package name */
    public Button f1646o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f1647p;

    /* renamed from: q  reason: collision with root package name */
    public Message f1648q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f1649r;

    /* renamed from: s  reason: collision with root package name */
    public Button f1650s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f1651t;

    /* renamed from: u  reason: collision with root package name */
    public Message f1652u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f1653v;

    /* renamed from: w  reason: collision with root package name */
    public Button f1654w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f1655x;

    /* renamed from: y  reason: collision with root package name */
    public Message f1656y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f1657z;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1645n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new d(this);

    public static boolean r(Context context) {
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, outValue, true);
        return outValue.data != 0;
    }

    public j(Context context, p0 di, Window window) {
        this.f1632a = context;
        this.f1633b = di;
        this.f1634c = window;
        this.R = new h(di);
        TypedArray a2 = context.obtainStyledAttributes(null, a.f1171e, R.attr.alertDialogStyle, 0);
        int[] iArr = a.f1167a;
        this.J = a2.getResourceId(0, 0);
        this.K = a2.getResourceId(2, 0);
        this.L = a2.getResourceId(4, 0);
        this.M = a2.getResourceId(5, 0);
        this.N = a2.getResourceId(7, 0);
        this.O = a2.getResourceId(3, 0);
        this.P = a2.getBoolean(6, true);
        this.f1635d = a2.getDimensionPixelSize(1, 0);
        a2.recycle();
        di.f(1);
    }

    public static boolean a(View v2) {
        if (v2.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v2 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup vg = (ViewGroup) v2;
        int i2 = vg.getChildCount();
        while (i2 > 0) {
            i2--;
            if (a(vg.getChildAt(i2))) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        int contentView = h();
        this.f1633b.setContentView(contentView);
        q();
    }

    public final int h() {
        if (this.K == 0) {
            return this.J;
        }
        return this.J;
    }

    public void l(CharSequence title) {
        this.f1636e = title;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public void i(View customTitleView) {
        this.G = customTitleView;
    }

    public void j(Drawable icon) {
        this.C = icon;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (icon != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(icon);
            return;
        }
        imageView.setVisibility(8);
    }

    public ListView c() {
        return this.f1638g;
    }

    public boolean e(KeyEvent event) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(event);
    }

    public boolean f(KeyEvent event) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(event);
    }

    public final ViewGroup g(View customPanel, View defaultPanel) {
        if (customPanel == null) {
            if (defaultPanel instanceof ViewStub) {
                defaultPanel = ((ViewStub) defaultPanel).inflate();
            }
            return (ViewGroup) defaultPanel;
        }
        if (defaultPanel != null) {
            ViewParent parent = defaultPanel.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(defaultPanel);
            }
        }
        if (customPanel instanceof ViewStub) {
            customPanel = ((ViewStub) customPanel).inflate();
        }
        return (ViewGroup) customPanel;
    }

    public final void q() {
        ListAdapter listAdapter;
        View spacer;
        View parentPanel = this.f1634c.findViewById(R.id.parentPanel);
        View defaultTopPanel = parentPanel.findViewById(R.id.topPanel);
        View defaultContentPanel = parentPanel.findViewById(R.id.contentPanel);
        View defaultButtonPanel = parentPanel.findViewById(R.id.buttonPanel);
        ViewGroup customPanel = (ViewGroup) parentPanel.findViewById(R.id.customPanel);
        o(customPanel);
        View customTopPanel = customPanel.findViewById(R.id.topPanel);
        View customContentPanel = customPanel.findViewById(R.id.contentPanel);
        View customButtonPanel = customPanel.findViewById(R.id.buttonPanel);
        ViewGroup topPanel = g(customTopPanel, defaultTopPanel);
        ViewGroup contentPanel = g(customContentPanel, defaultContentPanel);
        ViewGroup buttonPanel = g(customButtonPanel, defaultButtonPanel);
        n(contentPanel);
        m(buttonPanel);
        p(topPanel);
        boolean hasCustomPanel = customPanel.getVisibility() != 8;
        boolean hasTopPanel = (topPanel == null || topPanel.getVisibility() == 8) ? false : true;
        boolean hasButtonPanel = buttonPanel.getVisibility() != 8;
        if (!hasButtonPanel && (spacer = contentPanel.findViewById(R.id.textSpacerNoButtons)) != null) {
            spacer.setVisibility(0);
        }
        if (hasTopPanel) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (!(this.f1637f == null && this.f1638g == null)) {
                divider = topPanel.findViewById(R.id.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        } else {
            View spacer2 = contentPanel.findViewById(R.id.textSpacerNoTitle);
            if (spacer2 != null) {
                spacer2.setVisibility(0);
            }
        }
        View spacer3 = this.f1638g;
        if (spacer3 instanceof AlertController$RecycleListView) {
            ((AlertController$RecycleListView) spacer3).a(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            View content = this.f1638g;
            if (content == null) {
                content = this.A;
            }
            if (content != null) {
                int indicators = (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0);
                k(contentPanel, content, indicators, 3);
            }
        }
        ListView listView = this.f1638g;
        if (listView != null && (listAdapter = this.H) != null) {
            listView.setAdapter(listAdapter);
            int checkedItem = this.I;
            if (checkedItem > -1) {
                listView.setItemChecked(checkedItem, true);
                listView.setSelection(checkedItem);
            }
        }
    }

    public final void k(ViewGroup contentPanel, View content, int indicators, int mask) {
        View indicatorUp = this.f1634c.findViewById(R.id.scrollIndicatorUp);
        View indicatorDown = this.f1634c.findViewById(R.id.scrollIndicatorDown);
        c1.w0(content, indicators, mask);
        if (indicatorUp != null) {
            contentPanel.removeView(indicatorUp);
        }
        if (indicatorDown != null) {
            contentPanel.removeView(indicatorDown);
        }
    }

    public final void o(ViewGroup customPanel) {
        View customView;
        boolean hasCustomView = false;
        if (this.f1639h != null) {
            customView = this.f1639h;
        } else if (this.f1640i != 0) {
            LayoutInflater inflater = LayoutInflater.from(this.f1632a);
            customView = inflater.inflate(this.f1640i, customPanel, false);
        } else {
            customView = null;
        }
        if (customView != null) {
            hasCustomView = true;
        }
        if (!hasCustomView || !a(customView)) {
            this.f1634c.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            FrameLayout custom = (FrameLayout) this.f1634c.findViewById(R.id.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1645n) {
                custom.setPadding(this.f1641j, this.f1642k, this.f1643l, this.f1644m);
            }
            if (this.f1638g != null) {
                ((LinearLayout.LayoutParams) ((a2) customPanel.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        customPanel.setVisibility(8);
    }

    public final void p(ViewGroup topPanel) {
        if (this.G != null) {
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(-1, -2);
            topPanel.addView(this.G, 0, lp);
            View titleTemplate = this.f1634c.findViewById(R.id.title_template);
            titleTemplate.setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f1634c.findViewById(16908294);
        boolean hasTextTitle = !TextUtils.isEmpty(this.f1636e);
        if (!hasTextTitle || !this.P) {
            View titleTemplate2 = this.f1634c.findViewById(R.id.title_template);
            titleTemplate2.setVisibility(8);
            this.D.setVisibility(8);
            topPanel.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1634c.findViewById(R.id.alertTitle);
        this.E = textView;
        textView.setText(this.f1636e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    public final void n(ViewGroup contentPanel) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1634c.findViewById(R.id.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) contentPanel.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f1637f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f1638g != null) {
                ViewGroup scrollParent = (ViewGroup) this.A.getParent();
                int childIndex = scrollParent.indexOfChild(this.A);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView(this.f1638g, childIndex, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            contentPanel.setVisibility(8);
        }
    }

    public final void m(ViewGroup buttonPanel) {
        int whichButtons = 0;
        Button button = (Button) buttonPanel.findViewById(16908313);
        this.f1646o = button;
        button.setOnClickListener(this.S);
        boolean hasButtons = false;
        if (!TextUtils.isEmpty(this.f1647p) || this.f1649r != null) {
            this.f1646o.setText(this.f1647p);
            Drawable drawable = this.f1649r;
            if (drawable != null) {
                int i2 = this.f1635d;
                drawable.setBounds(0, 0, i2, i2);
                this.f1646o.setCompoundDrawables(this.f1649r, null, null, null);
            }
            this.f1646o.setVisibility(0);
            whichButtons = 0 | 1;
        } else {
            this.f1646o.setVisibility(8);
        }
        Button button2 = (Button) buttonPanel.findViewById(16908314);
        this.f1650s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f1651t) || this.f1653v != null) {
            this.f1650s.setText(this.f1651t);
            Drawable drawable2 = this.f1653v;
            if (drawable2 != null) {
                int i3 = this.f1635d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f1650s.setCompoundDrawables(this.f1653v, null, null, null);
            }
            this.f1650s.setVisibility(0);
            whichButtons |= 2;
        } else {
            this.f1650s.setVisibility(8);
        }
        Button button3 = (Button) buttonPanel.findViewById(16908315);
        this.f1654w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f1655x) || this.f1657z != null) {
            this.f1654w.setText(this.f1655x);
            Drawable drawable3 = this.f1657z;
            if (drawable3 != null) {
                int i4 = this.f1635d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f1654w.setCompoundDrawables(this.f1657z, null, null, null);
            }
            this.f1654w.setVisibility(0);
            whichButtons |= 4;
        } else {
            this.f1654w.setVisibility(8);
        }
        if (r(this.f1632a)) {
            if (whichButtons == 1) {
                b(this.f1646o);
            } else if (whichButtons == 2) {
                b(this.f1650s);
            } else if (whichButtons == 4) {
                b(this.f1654w);
            }
        }
        if (whichButtons != 0) {
            hasButtons = true;
        }
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams(params);
    }
}
