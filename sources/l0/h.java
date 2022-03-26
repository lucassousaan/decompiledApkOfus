package l0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Generic types in debug info not equals: l0.e != androidx.customview.widget.FocusStrategy$BoundsAdapter<T> */
    /* JADX WARN: Generic types in debug info not equals: l0.f != androidx.customview.widget.FocusStrategy$CollectionAdapter<L, T> */
    /* JADX WARN: Generic types in debug info not equals: l0.g != androidx.customview.widget.FocusStrategy$SequentialComparator<T> */
    public static Object d(Object obj, f fVar, e eVar, Object obj2, int direction, boolean isLayoutRtl, boolean wrap) {
        int count = ((b) fVar).c(obj);
        ArrayList arrayList = new ArrayList(count);
        for (int i2 = 0; i2 < count; i2++) {
            arrayList.add(((b) fVar).b(obj, i2));
        }
        Collections.sort(arrayList, new g(isLayoutRtl, eVar));
        switch (direction) {
            case 1:
                return f(obj2, arrayList, wrap);
            case 2:
                return e(obj2, arrayList, wrap);
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
    }

    public static Object e(Object obj, ArrayList arrayList, boolean wrap) {
        int count = arrayList.size();
        int position = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (position < count) {
            return arrayList.get(position);
        }
        if (!wrap || count <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static Object f(Object obj, ArrayList arrayList, boolean wrap) {
        int count = arrayList.size();
        int position = (obj == null ? count : arrayList.indexOf(obj)) - 1;
        if (position >= 0) {
            return arrayList.get(position);
        }
        if (!wrap || count <= 0) {
            return null;
        }
        return arrayList.get(count - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: l0.e != androidx.customview.widget.FocusStrategy$BoundsAdapter<T> */
    /* JADX WARN: Generic types in debug info not equals: l0.f != androidx.customview.widget.FocusStrategy$CollectionAdapter<L, T> */
    public static Object c(Object obj, f fVar, e eVar, Object obj2, Rect focusedRect, int direction) {
        Rect bestCandidateRect = new Rect(focusedRect);
        switch (direction) {
            case 17:
                bestCandidateRect.offset(focusedRect.width() + 1, 0);
                break;
            case 33:
                bestCandidateRect.offset(0, focusedRect.height() + 1);
                break;
            case 66:
                bestCandidateRect.offset(-(focusedRect.width() + 1), 0);
                break;
            case 130:
                bestCandidateRect.offset(0, -(focusedRect.height() + 1));
                break;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        Object obj3 = null;
        int count = ((b) fVar).c(obj);
        Rect focusableRect = new Rect();
        for (int i2 = 0; i2 < count; i2++) {
            Object b2 = ((b) fVar).b(obj, i2);
            if (b2 != obj2) {
                ((a) eVar).b(b2, focusableRect);
                if (h(direction, focusedRect, focusableRect, bestCandidateRect)) {
                    bestCandidateRect.set(focusableRect);
                    obj3 = b2;
                }
            }
        }
        return obj3;
    }

    public static boolean h(int direction, Rect source, Rect candidate, Rect currentBest) {
        if (!i(source, candidate, direction)) {
            return false;
        }
        if (!i(source, currentBest, direction) || a(direction, source, candidate, currentBest)) {
            return true;
        }
        if (a(direction, source, currentBest, candidate)) {
            return false;
        }
        int candidateDist = g(k(direction, source, candidate), o(direction, source, candidate));
        int currentBestDist = g(k(direction, source, currentBest), o(direction, source, currentBest));
        return candidateDist < currentBestDist;
    }

    public static boolean a(int direction, Rect source, Rect rect1, Rect rect2) {
        boolean rect1InSrcBeam = b(direction, source, rect1);
        boolean rect2InSrcBeam = b(direction, source, rect2);
        if (rect2InSrcBeam || !rect1InSrcBeam) {
            return false;
        }
        return !j(direction, source, rect2) || direction == 17 || direction == 66 || k(direction, source, rect1) < m(direction, source, rect2);
    }

    public static int g(int majorAxisDistance, int minorAxisDistance) {
        return (majorAxisDistance * 13 * majorAxisDistance) + (minorAxisDistance * minorAxisDistance);
    }

    public static boolean i(Rect srcRect, Rect destRect, int direction) {
        switch (direction) {
            case 17:
                int i2 = srcRect.right;
                int i3 = destRect.right;
                return (i2 > i3 || srcRect.left >= i3) && srcRect.left > destRect.left;
            case 33:
                int i4 = srcRect.bottom;
                int i5 = destRect.bottom;
                return (i4 > i5 || srcRect.top >= i5) && srcRect.top > destRect.top;
            case 66:
                int i6 = srcRect.left;
                int i7 = destRect.left;
                return (i6 < i7 || srcRect.right <= i7) && srcRect.right < destRect.right;
            case 130:
                int i8 = srcRect.top;
                int i9 = destRect.top;
                return (i8 < i9 || srcRect.bottom <= i9) && srcRect.bottom < destRect.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean b(int direction, Rect rect1, Rect rect2) {
        switch (direction) {
            case 17:
            case 66:
                return rect2.bottom >= rect1.top && rect2.top <= rect1.bottom;
            case 33:
            case 130:
                return rect2.right >= rect1.left && rect2.left <= rect1.right;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean j(int direction, Rect src, Rect dest) {
        switch (direction) {
            case 17:
                return src.left >= dest.right;
            case 33:
                return src.top >= dest.bottom;
            case 66:
                return src.right <= dest.left;
            case 130:
                return src.bottom <= dest.top;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int k(int direction, Rect source, Rect dest) {
        return Math.max(0, l(direction, source, dest));
    }

    public static int l(int direction, Rect source, Rect dest) {
        switch (direction) {
            case 17:
                return source.left - dest.right;
            case 33:
                return source.top - dest.bottom;
            case 66:
                return dest.left - source.right;
            case 130:
                return dest.top - source.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int m(int direction, Rect source, Rect dest) {
        return Math.max(1, n(direction, source, dest));
    }

    public static int n(int direction, Rect source, Rect dest) {
        switch (direction) {
            case 17:
                return source.left - dest.left;
            case 33:
                return source.top - dest.top;
            case 66:
                return dest.right - source.right;
            case 130:
                return dest.bottom - source.bottom;
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int o(int direction, Rect source, Rect dest) {
        switch (direction) {
            case 17:
            case 66:
                return Math.abs((source.top + (source.height() / 2)) - (dest.top + (dest.height() / 2)));
            case 33:
            case 130:
                return Math.abs((source.left + (source.width() / 2)) - (dest.left + (dest.width() / 2)));
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }
}
