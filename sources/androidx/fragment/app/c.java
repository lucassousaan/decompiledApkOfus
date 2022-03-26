package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.i;
import java.util.ArrayList;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f723b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f724c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f725d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f726e;

    /* renamed from: f  reason: collision with root package name */
    public final int f727f;

    /* renamed from: g  reason: collision with root package name */
    public final String f728g;

    /* renamed from: h  reason: collision with root package name */
    public final int f729h;

    /* renamed from: i  reason: collision with root package name */
    public final int f730i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f731j;

    /* renamed from: k  reason: collision with root package name */
    public final int f732k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f733l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f734m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f735n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f736o;

    public c(a bse) {
        int numOps = bse.f981a.size();
        this.f723b = new int[numOps * 5];
        if (bse.f987g) {
            this.f724c = new ArrayList(numOps);
            this.f725d = new int[numOps];
            this.f726e = new int[numOps];
            int pos = 0;
            int opNum = 0;
            while (opNum < numOps) {
                y1 op = (y1) bse.f981a.get(opNum);
                int pos2 = pos + 1;
                this.f723b[pos] = op.f971a;
                ArrayList arrayList = this.f724c;
                f0 f0Var = op.f972b;
                arrayList.add(f0Var != null ? f0Var.f764g : null);
                int[] iArr = this.f723b;
                int pos3 = pos2 + 1;
                iArr[pos2] = op.f973c;
                int pos4 = pos3 + 1;
                iArr[pos3] = op.f974d;
                int pos5 = pos4 + 1;
                iArr[pos4] = op.f975e;
                iArr[pos5] = op.f976f;
                this.f725d[opNum] = op.f977g.ordinal();
                this.f726e[opNum] = op.f978h.ordinal();
                opNum++;
                pos = pos5 + 1;
            }
            int opNum2 = bse.f986f;
            this.f727f = opNum2;
            this.f728g = bse.f988h;
            this.f729h = bse.f698s;
            this.f730i = bse.f989i;
            this.f731j = bse.f990j;
            this.f732k = bse.f991k;
            this.f733l = bse.f992l;
            this.f734m = bse.f993m;
            this.f735n = bse.f994n;
            this.f736o = bse.f995o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public c(Parcel in) {
        this.f723b = in.createIntArray();
        this.f724c = in.createStringArrayList();
        this.f725d = in.createIntArray();
        this.f726e = in.createIntArray();
        this.f727f = in.readInt();
        this.f728g = in.readString();
        this.f729h = in.readInt();
        this.f730i = in.readInt();
        this.f731j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f732k = in.readInt();
        this.f733l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f734m = in.createStringArrayList();
        this.f735n = in.createStringArrayList();
        this.f736o = in.readInt() != 0;
    }

    public a i(m1 fm) {
        a bse = new a(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f723b.length) {
            y1 op = new y1();
            int pos2 = pos + 1;
            op.f971a = this.f723b[pos];
            if (m1.v0(2)) {
                Log.v("FragmentManager", "Instantiate " + bse + " op #" + num + " base fragment #" + this.f723b[pos2]);
            }
            String fWho = (String) this.f724c.get(num);
            if (fWho != null) {
                f0 f2 = fm.X(fWho);
                op.f972b = f2;
            } else {
                op.f972b = null;
            }
            op.f977g = i.values()[this.f725d[num]];
            op.f978h = i.values()[this.f726e[num]];
            int[] iArr = this.f723b;
            int pos3 = pos2 + 1;
            int pos4 = iArr[pos2];
            op.f973c = pos4;
            int pos5 = pos3 + 1;
            int pos6 = iArr[pos3];
            op.f974d = pos6;
            int pos7 = pos5 + 1;
            int pos8 = iArr[pos5];
            op.f975e = pos8;
            int i2 = iArr[pos7];
            op.f976f = i2;
            bse.f982b = pos4;
            bse.f983c = pos6;
            bse.f984d = pos8;
            bse.f985e = i2;
            bse.d(op);
            num++;
            pos = pos7 + 1;
        }
        bse.f986f = this.f727f;
        bse.f988h = this.f728g;
        bse.f698s = this.f729h;
        bse.f987g = true;
        bse.f989i = this.f730i;
        bse.f990j = this.f731j;
        bse.f991k = this.f732k;
        bse.f992l = this.f733l;
        bse.f993m = this.f734m;
        bse.f994n = this.f735n;
        bse.f995o = this.f736o;
        bse.o(1);
        return bse;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(this.f723b);
        dest.writeStringList(this.f724c);
        dest.writeIntArray(this.f725d);
        dest.writeIntArray(this.f726e);
        dest.writeInt(this.f727f);
        dest.writeString(this.f728g);
        dest.writeInt(this.f729h);
        dest.writeInt(this.f730i);
        TextUtils.writeToParcel(this.f731j, dest, 0);
        dest.writeInt(this.f732k);
        TextUtils.writeToParcel(this.f733l, dest, 0);
        dest.writeStringList(this.f734m);
        dest.writeStringList(this.f735n);
        dest.writeInt(this.f736o ? 1 : 0);
    }
}
