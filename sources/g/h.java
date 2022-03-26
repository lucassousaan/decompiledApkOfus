package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import h.h0;
import z.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class h extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1957a;

    /* renamed from: b  reason: collision with root package name */
    public final c f1958b;

    public h(Context context, c supportActionMode) {
        this.f1957a = context;
        this.f1958b = supportActionMode;
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1958b.h();
    }

    @Override // android.view.ActionMode
    public void setTag(Object tag) {
        this.f1958b.p(tag);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence title) {
        this.f1958b.r(title);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence subtitle) {
        this.f1958b.o(subtitle);
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1958b.k();
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1958b.c();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new h0(this.f1957a, (a) this.f1958b.e());
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1958b.i();
    }

    @Override // android.view.ActionMode
    public void setTitle(int resId) {
        this.f1958b.q(resId);
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1958b.g();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int resId) {
        this.f1958b.n(resId);
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1958b.d();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1958b.m(view);
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1958b.f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1958b.j();
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean titleOptional) {
        this.f1958b.s(titleOptional);
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1958b.l();
    }
}
