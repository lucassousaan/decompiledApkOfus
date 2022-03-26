package c0;

import android.util.Base64;
import e0.h;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f1200a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1201b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1202c;

    /* renamed from: d  reason: collision with root package name */
    public final List f1203d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1204e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final String f1205f;

    public g(String providerAuthority, String providerPackage, String query, List list) {
        h.e(providerAuthority);
        this.f1200a = providerAuthority;
        h.e(providerPackage);
        this.f1201b = providerPackage;
        h.e(query);
        this.f1202c = query;
        h.e(list);
        this.f1203d = list;
        this.f1205f = a(providerAuthority, providerPackage, query);
    }

    public final String a(String providerAuthority, String providerPackage, String query) {
        return providerAuthority + "-" + providerPackage + "-" + query;
    }

    public String e() {
        return this.f1200a;
    }

    public String f() {
        return this.f1201b;
    }

    public String g() {
        return this.f1202c;
    }

    public List b() {
        return this.f1203d;
    }

    public int c() {
        return 0;
    }

    public String d() {
        return this.f1205f;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.f1200a + ", mProviderPackage: " + this.f1201b + ", mQuery: " + this.f1202c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f1203d.size(); i2++) {
            builder.append(" [");
            List<byte[]> set = (List) this.f1203d.get(i2);
            for (int j2 = 0; j2 < set.size(); j2++) {
                builder.append(" \"");
                byte[] array = set.get(j2);
                builder.append(Base64.encodeToString(array, 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: 0");
        return builder.toString();
    }
}
