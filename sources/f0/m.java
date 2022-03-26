package f0;

import android.content.ClipData;
import android.view.ContentInfo;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final k f1893a;

    public static String e(int source) {
        switch (source) {
            case 0:
                return "SOURCE_APP";
            case 1:
                return "SOURCE_CLIPBOARD";
            case 2:
                return "SOURCE_INPUT_METHOD";
            case 3:
                return "SOURCE_DRAG_AND_DROP";
            case 4:
                return "SOURCE_AUTOFILL";
            case 5:
                return "SOURCE_PROCESS_TEXT";
            default:
                return String.valueOf(source);
        }
    }

    public static String a(int flags) {
        if ((flags & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(flags);
    }

    public m(k compat) {
        this.f1893a = compat;
    }

    public static m g(ContentInfo platContentInfo) {
        return new m(new j(platContentInfo));
    }

    public ContentInfo f() {
        return this.f1893a.d();
    }

    public String toString() {
        return this.f1893a.toString();
    }

    public ClipData b() {
        return this.f1893a.b();
    }

    public int d() {
        return this.f1893a.a();
    }

    public int c() {
        return this.f1893a.c();
    }
}
