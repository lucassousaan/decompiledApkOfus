package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.helloworld.R;
import j0.f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import v.d;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class n3 extends f implements View.OnClickListener {

    /* renamed from: m  reason: collision with root package name */
    public final SearchView f455m;

    /* renamed from: n  reason: collision with root package name */
    public final SearchableInfo f456n;

    /* renamed from: o  reason: collision with root package name */
    public final Context f457o;

    /* renamed from: p  reason: collision with root package name */
    public final WeakHashMap f458p;

    /* renamed from: q  reason: collision with root package name */
    public final int f459q;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f462t;

    /* renamed from: r  reason: collision with root package name */
    public boolean f460r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f461s = 1;

    /* renamed from: u  reason: collision with root package name */
    public int f463u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f464v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f465w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f466x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f467y = -1;

    /* renamed from: z  reason: collision with root package name */
    public int f468z = -1;

    public n3(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f455m = searchView;
        this.f456n = searchable;
        this.f459q = searchView.getSuggestionCommitIconResId();
        this.f457o = context;
        this.f458p = weakHashMap;
    }

    public void x(int refineWhat) {
        this.f461s = refineWhat;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public Cursor w(CharSequence constraint) {
        String query = constraint == null ? "" : constraint.toString();
        if (this.f455m.getVisibility() != 0 || this.f455m.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = u(this.f456n, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // j0.c
    public void b(Cursor c2) {
        try {
            super.b(c2);
            if (c2 != null) {
                this.f463u = c2.getColumnIndex("suggest_text_1");
                this.f464v = c2.getColumnIndex("suggest_text_2");
                this.f465w = c2.getColumnIndex("suggest_text_2_url");
                this.f466x = c2.getColumnIndex("suggest_icon_1");
                this.f467y = c2.getColumnIndex("suggest_icon_2");
                this.f468z = c2.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // j0.f, j0.c
    public View g(Context context, Cursor cursor, ViewGroup parent) {
        View v2 = super.g(context, cursor, parent);
        v2.setTag(new m3(v2));
        ImageView iconRefine = (ImageView) v2.findViewById(R.id.edit_query);
        iconRefine.setImageResource(this.f459q);
        return v2;
    }

    @Override // j0.c
    public void a(View view, Context context, Cursor cursor) {
        CharSequence text2;
        m3 views = (m3) view.getTag();
        int flags = 0;
        int i2 = this.f468z;
        if (i2 != -1) {
            flags = cursor.getInt(i2);
        }
        if (views.f434a != null) {
            String text1 = v(cursor, this.f463u);
            z(views.f434a, text1);
        }
        if (views.f435b != null) {
            CharSequence text22 = v(cursor, this.f465w);
            if (text22 != null) {
                text2 = k(text22);
            } else {
                text2 = v(cursor, this.f464v);
            }
            if (TextUtils.isEmpty(text2)) {
                TextView textView = views.f434a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    views.f434a.setMaxLines(2);
                }
            } else {
                TextView textView2 = views.f434a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    views.f434a.setMaxLines(1);
                }
            }
            z(views.f435b, text2);
        }
        ImageView imageView = views.f436c;
        if (imageView != null) {
            y(imageView, s(cursor), 4);
        }
        ImageView imageView2 = views.f437d;
        if (imageView2 != null) {
            y(imageView2, t(cursor), 8);
        }
        int i3 = this.f461s;
        if (i3 == 2 || (i3 == 1 && (flags & 1) != 0)) {
            views.f438e.setVisibility(0);
            views.f438e.setTag(views.f434a.getText());
            views.f438e.setOnClickListener(this);
            return;
        }
        views.f438e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        Object tag = v2.getTag();
        if (tag instanceof CharSequence) {
            this.f455m.U((CharSequence) tag);
        }
    }

    public final CharSequence k(CharSequence url) {
        if (this.f462t == null) {
            TypedValue colorValue = new TypedValue();
            this.f457o.getTheme().resolveAttribute(R.attr.textColorSearchUrl, colorValue, true);
            this.f462t = this.f457o.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, this.f462t, null), 0, url.length(), 33);
        return text;
    }

    public final void z(TextView v2, CharSequence text) {
        v2.setText(text);
        if (TextUtils.isEmpty(text)) {
            v2.setVisibility(8);
        } else {
            v2.setVisibility(0);
        }
    }

    public final Drawable s(Cursor cursor) {
        int i2 = this.f466x;
        if (i2 == -1) {
            return null;
        }
        String value = cursor.getString(i2);
        Drawable drawable = r(value);
        if (drawable != null) {
            return drawable;
        }
        return o();
    }

    public final Drawable t(Cursor cursor) {
        int i2 = this.f467y;
        if (i2 == -1) {
            return null;
        }
        String value = cursor.getString(i2);
        return r(value);
    }

    public final void y(ImageView v2, Drawable drawable, int nullVisibility) {
        v2.setImageDrawable(drawable);
        if (drawable == null) {
            v2.setVisibility(nullVisibility);
            return;
        }
        v2.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // j0.c
    public CharSequence c(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = n(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.f456n.shouldRewriteQueryFromData() && (data = n(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.f456n.shouldRewriteQueryFromText() || (text1 = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    @Override // j0.c, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v2 = g(this.f457o, d(), parent);
            m3 views = (m3) v2.getTag();
            TextView tv = views.f434a;
            tv.setText(e2.toString());
            return v2;
        }
    }

    @Override // j0.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View v2 = f(this.f457o, d(), parent);
            if (v2 != null) {
                m3 views = (m3) v2.getTag();
                TextView tv = views.f434a;
                tv.setText(e2.toString());
            }
            return v2;
        }
    }

    public final Drawable r(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.f457o.getPackageName() + "/" + resourceId;
            Drawable drawable = j(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = d.b(this.f457o, resourceId);
            A(drawableUri, drawable2);
            return drawable2;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        } catch (NumberFormatException e3) {
            Drawable drawable3 = j(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Uri uri = Uri.parse(drawableId);
            Drawable drawable4 = p(uri);
            A(drawableId, drawable4);
            return drawable4;
        }
    }

    public final Drawable p(Uri uri) {
        try {
            String scheme = uri.getScheme();
            if ("android.resource".equals(scheme)) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException e2) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream stream = this.f457o.getContentResolver().openInputStream(uri);
                if (stream != null) {
                    Drawable createFromStream = Drawable.createFromStream(stream, null);
                    try {
                        stream.close();
                    } catch (IOException ex) {
                        Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex);
                    }
                    return createFromStream;
                }
                throw new FileNotFoundException("Failed to open " + uri);
            }
        } catch (FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
        return null;
    }

    public final Drawable j(String resourceUri) {
        Drawable.ConstantState cached = (Drawable.ConstantState) this.f458p.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    public final void A(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.f458p.put(resourceUri, drawable.getConstantState());
        }
    }

    public final Drawable o() {
        Drawable drawable = m(this.f456n.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.f457o.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable m(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        Drawable.ConstantState toCache = null;
        if (this.f458p.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = (Drawable.ConstantState) this.f458p.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.f457o.getResources());
        }
        Drawable drawable = l(component);
        if (drawable != null) {
            toCache = drawable.getConstantState();
        }
        this.f458p.put(componentIconKey, toCache);
        return drawable;
    }

    public final Drawable l(ComponentName component) {
        PackageManager pm = this.f457o.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(component, 128);
            int iconId = activityInfo.getIconResource();
            if (iconId == 0) {
                return null;
            }
            String pkg = component.getPackageName();
            Drawable drawable = pm.getDrawable(pkg, iconId, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
    }

    public static String n(Cursor cursor, String columnName) {
        int col = cursor.getColumnIndex(columnName);
        return v(cursor, col);
    }

    public static String v(Cursor cursor, int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    public Drawable q(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources r2 = this.f457o.getPackageManager().getResourcesForApplication(authority);
                List<String> path = uri.getPathSegments();
                if (path != null) {
                    int len = path.size();
                    if (len == 1) {
                        try {
                            id = Integer.parseInt(path.get(0));
                        } catch (NumberFormatException e2) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (len == 2) {
                        id = r2.getIdentifier(path.get(1), path.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (id != 0) {
                        return r2.getDrawable(id);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public Cursor u(SearchableInfo searchable, String query, int limit) {
        String authority;
        String[] selArgs;
        if (searchable == null || (authority = searchable.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder uriBuilder = new Uri.Builder().scheme("content").authority(authority).query("").fragment("");
        String contentPath = searchable.getSuggestPath();
        if (contentPath != null) {
            uriBuilder.appendEncodedPath(contentPath);
        }
        uriBuilder.appendPath("search_suggest_query");
        String selection = searchable.getSuggestSelection();
        if (selection != null) {
            String[] selArgs2 = {query};
            selArgs = selArgs2;
        } else {
            uriBuilder.appendPath(query);
            selArgs = null;
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        Uri uri = uriBuilder.build();
        return this.f457o.getContentResolver().query(uri, null, selection, selArgs, null);
    }
}
