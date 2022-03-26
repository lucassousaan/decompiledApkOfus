package c0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import w.e;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator f1199a = new e();

    public static n d(Context context, g request, CancellationSignal cancellationSignal) {
        ProviderInfo providerInfo = e(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return n.a(1, null);
        }
        o[] fonts = f(context, request, providerInfo.authority, cancellationSignal);
        return n.a(0, fonts);
    }

    public static ProviderInfo e(PackageManager packageManager, g request, Resources resources) {
        String providerAuthority = request.e();
        ProviderInfo info = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (info.packageName.equals(request.f())) {
            PackageInfo packageInfo = packageManager.getPackageInfo(info.packageName, 64);
            List<byte[]> signatures = a(packageInfo.signatures);
            Collections.sort(signatures, f1199a);
            List<List<byte[]>> requestCertificatesList = c(request, resources);
            for (int i2 = 0; i2 < requestCertificatesList.size(); i2++) {
                List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i2));
                Collections.sort(requestSignatures, f1199a);
                if (b(signatures, requestSignatures)) {
                    return info;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c0.o[] f(android.content.Context r22, c0.g r23, java.lang.String r24, android.os.CancellationSignal r25) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.f.f(android.content.Context, c0.g, java.lang.String, android.os.CancellationSignal):c0.o[]");
    }

    public static List c(g request, Resources resources) {
        if (request.b() != null) {
            return request.b();
        }
        request.c();
        return e.c(resources, 0);
    }

    public static boolean b(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static List a(Signature[] signatures) {
        List<byte[]> shaList = new ArrayList<>();
        for (Signature signature : signatures) {
            shaList.add(signature.toByteArray());
        }
        return shaList;
    }
}
