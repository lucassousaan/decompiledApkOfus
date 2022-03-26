package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import e0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ClipData f1884a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1885b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1886c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f1887d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f1888e;

    public l(i b2) {
        ClipData clipData = b2.f1873a;
        h.e(clipData);
        this.f1884a = clipData;
        int i2 = b2.f1874b;
        h.b(i2, 0, 5, "source");
        this.f1885b = i2;
        int i3 = b2.f1875c;
        h.d(i3, 1);
        this.f1886c = i3;
        this.f1887d = b2.f1876d;
        this.f1888e = b2.f1877e;
    }

    @Override // f0.k
    public ContentInfo d() {
        return null;
    }

    @Override // f0.k
    public ClipData b() {
        return this.f1884a;
    }

    @Override // f0.k
    public int a() {
        return this.f1885b;
    }

    @Override // f0.k
    public int c() {
        return this.f1886c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.f1884a.getDescription());
        sb.append(", source=");
        sb.append(m.e(this.f1885b));
        sb.append(", flags=");
        sb.append(m.a(this.f1886c));
        String str2 = "";
        if (this.f1887d == null) {
            str = str2;
        } else {
            str = ", hasLinkUri(" + this.f1887d.toString().length() + ")";
        }
        sb.append(str);
        if (this.f1888e != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
