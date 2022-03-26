package l0;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f2370a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2371b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2372c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2373d;

    /* JADX WARN: Generic types in debug info not equals: l0.e != androidx.customview.widget.FocusStrategy$BoundsAdapter<T> */
    /* JADX WARN: Generic types in debug info not equals: l0.g != androidx.customview.widget.FocusStrategy$SequentialComparator<T> */
    public g(boolean isLayoutRtl, e eVar) {
        this.f2372c = isLayoutRtl;
        this.f2373d = eVar;
    }

    /* JADX WARN: Generic types in debug info not equals: l0.g != androidx.customview.widget.FocusStrategy$SequentialComparator<T> */
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Rect firstRect = this.f2370a;
        Rect secondRect = this.f2371b;
        ((a) this.f2373d).b(obj, firstRect);
        ((a) this.f2373d).b(obj2, secondRect);
        int i2 = firstRect.top;
        int i3 = secondRect.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = firstRect.left;
        int i5 = secondRect.left;
        if (i4 < i5) {
            return this.f2372c ? 1 : -1;
        }
        if (i4 > i5) {
            return this.f2372c ? -1 : 1;
        }
        int i6 = firstRect.bottom;
        int i7 = secondRect.bottom;
        if (i6 < i7) {
            return -1;
        }
        if (i6 > i7) {
            return 1;
        }
        int i8 = firstRect.right;
        int i9 = secondRect.right;
        if (i8 < i9) {
            return this.f2372c ? 1 : -1;
        }
        if (i8 > i9) {
            return this.f2372c ? -1 : 1;
        }
        return 0;
    }
}
