package q;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public ConstraintLayout f2849a;

    /* renamed from: b  reason: collision with root package name */
    public int f2850b;

    /* renamed from: c  reason: collision with root package name */
    public int f2851c;

    /* renamed from: d  reason: collision with root package name */
    public int f2852d;

    /* renamed from: e  reason: collision with root package name */
    public int f2853e;

    /* renamed from: f  reason: collision with root package name */
    public int f2854f;

    /* renamed from: g  reason: collision with root package name */
    public int f2855g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f2856h;

    public void a(int widthSpec, int heightSpec, int top, int bottom, int width, int height) {
        this.f2850b = top;
        this.f2851c = bottom;
        this.f2852d = width;
        this.f2853e = height;
        this.f2854f = widthSpec;
        this.f2855g = heightSpec;
    }

    public f(ConstraintLayout this$0, ConstraintLayout l2) {
        this.f2856h = this$0;
        this.f2849a = l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(o.g r30, p.b r31) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.d(o.g, p.b):void");
    }

    public final boolean c(int lastMeasureSpec, int spec, int widgetSize) {
        if (lastMeasureSpec == spec) {
            return true;
        }
        int lastMode = View.MeasureSpec.getMode(lastMeasureSpec);
        View.MeasureSpec.getSize(lastMeasureSpec);
        int mode = View.MeasureSpec.getMode(spec);
        int size = View.MeasureSpec.getSize(spec);
        if (mode != 1073741824) {
            return false;
        }
        if ((lastMode == Integer.MIN_VALUE || lastMode == 0) && widgetSize == size) {
            return true;
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int widgetsCount = this.f2849a.getChildCount();
        for (int i2 = 0; i2 < widgetsCount; i2++) {
            this.f2849a.getChildAt(i2);
        }
        arrayList = this.f2849a.f610c;
        int helperCount = arrayList.size();
        if (helperCount > 0) {
            for (int i3 = 0; i3 < helperCount; i3++) {
                arrayList2 = this.f2849a.f610c;
                c helper = (c) arrayList2.get(i3);
                helper.i();
            }
        }
    }
}
