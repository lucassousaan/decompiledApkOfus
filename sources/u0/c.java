package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import k.b;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f3583d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f3584e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3585f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3586g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3587h;

    /* renamed from: i  reason: collision with root package name */
    public int f3588i;

    /* renamed from: j  reason: collision with root package name */
    public int f3589j;

    /* renamed from: k  reason: collision with root package name */
    public int f3590k;

    public c(Parcel p2) {
        this(p2, p2.dataPosition(), p2.dataSize(), "", new b(), new b(), new b());
    }

    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.Class> */
    /* JADX WARN: Generic types in debug info not equals: k.b != androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> */
    public c(Parcel p2, int offset, int end, String prefix, b bVar, b bVar2, b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f3583d = new SparseIntArray();
        this.f3588i = -1;
        this.f3589j = 0;
        this.f3590k = -1;
        this.f3584e = p2;
        this.f3585f = offset;
        this.f3586g = end;
        this.f3589j = offset;
        this.f3587h = prefix;
    }

    @Override // u0.b
    public boolean m(int fieldId) {
        while (this.f3589j < this.f3586g) {
            int i2 = this.f3590k;
            if (i2 == fieldId) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(fieldId)) > 0) {
                return false;
            }
            this.f3584e.setDataPosition(this.f3589j);
            int size = this.f3584e.readInt();
            this.f3590k = this.f3584e.readInt();
            this.f3589j += size;
        }
        return this.f3590k == fieldId;
    }

    @Override // u0.b
    public void w(int fieldId) {
        a();
        this.f3588i = fieldId;
        this.f3583d.put(fieldId, this.f3584e.dataPosition());
        E(0);
        E(fieldId);
    }

    @Override // u0.b
    public void a() {
        int i2 = this.f3588i;
        if (i2 >= 0) {
            int currentFieldPosition = this.f3583d.get(i2);
            int position = this.f3584e.dataPosition();
            int size = position - currentFieldPosition;
            this.f3584e.setDataPosition(currentFieldPosition);
            this.f3584e.writeInt(size);
            this.f3584e.setDataPosition(position);
        }
    }

    @Override // u0.b
    public b b() {
        Parcel parcel = this.f3584e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f3589j;
        if (i2 == this.f3585f) {
            i2 = this.f3586g;
        }
        return new c(parcel, dataPosition, i2, this.f3587h + "  ", this.f3580a, this.f3581b, this.f3582c);
    }

    @Override // u0.b
    public void A(byte[] b2) {
        if (b2 != null) {
            this.f3584e.writeInt(b2.length);
            this.f3584e.writeByteArray(b2);
            return;
        }
        this.f3584e.writeInt(-1);
    }

    @Override // u0.b
    public void E(int val) {
        this.f3584e.writeInt(val);
    }

    @Override // u0.b
    public void I(String val) {
        this.f3584e.writeString(val);
    }

    @Override // u0.b
    public void G(Parcelable p2) {
        this.f3584e.writeParcelable(p2, 0);
    }

    @Override // u0.b
    public void y(boolean val) {
        this.f3584e.writeInt(val ? 1 : 0);
    }

    @Override // u0.b
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3584e, 0);
    }

    @Override // u0.b
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3584e);
    }

    @Override // u0.b
    public int o() {
        return this.f3584e.readInt();
    }

    @Override // u0.b
    public String s() {
        return this.f3584e.readString();
    }

    @Override // u0.b
    public byte[] i() {
        int len = this.f3584e.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.f3584e.readByteArray(bytes);
        return bytes;
    }

    @Override // u0.b
    public Parcelable q() {
        return this.f3584e.readParcelable(getClass().getClassLoader());
    }

    @Override // u0.b
    public boolean g() {
        return this.f3584e.readInt() != 0;
    }
}
