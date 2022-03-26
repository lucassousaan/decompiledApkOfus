package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f659k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public Object f661b;

    /* renamed from: j  reason: collision with root package name */
    public String f669j;

    /* renamed from: a  reason: collision with root package name */
    public int f660a = -1;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f662c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f663d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f664e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f665f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f666g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f667h = f659k;

    /* renamed from: i  reason: collision with root package name */
    public String f668i = null;

    public int a() {
        int i2 = this.f660a;
        if (i2 == -1) {
            return b((Icon) this.f661b);
        }
        if (i2 == 2) {
            return this.f664e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String toString() {
        if (this.f660a == -1) {
            return String.valueOf(this.f661b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=").append(e(this.f660a));
        switch (this.f660a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f661b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f661b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f669j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f664e);
                if (this.f665f != 0) {
                    sb.append(" off=");
                    sb.append(this.f665f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f661b);
                break;
        }
        if (this.f666g != null) {
            sb.append(" tint=");
            sb.append(this.f666g);
        }
        if (this.f667h != f659k) {
            sb.append(" mode=");
            sb.append(this.f667h);
        }
        sb.append(")");
        return sb.toString();
    }

    public void d(boolean isStream) {
        this.f668i = this.f667h.name();
        switch (this.f660a) {
            case -1:
                if (!isStream) {
                    this.f663d = (Parcelable) this.f661b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (isStream) {
                    Bitmap bitmap = (Bitmap) this.f661b;
                    ByteArrayOutputStream data = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, data);
                    this.f662c = data.toByteArray();
                    return;
                }
                this.f663d = (Parcelable) this.f661b;
                return;
            case 2:
                this.f662c = ((String) this.f661b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f662c = (byte[]) this.f661b;
                return;
            case 4:
            case 6:
                this.f662c = this.f661b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public void c() {
        this.f667h = PorterDuff.Mode.valueOf(this.f668i);
        switch (this.f660a) {
            case -1:
                Parcelable parcelable = this.f663d;
                if (parcelable != null) {
                    this.f661b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f663d;
                if (parcelable2 != null) {
                    this.f661b = parcelable2;
                    return;
                }
                byte[] bArr = this.f662c;
                this.f661b = bArr;
                this.f660a = 3;
                this.f664e = 0;
                this.f665f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f662c, Charset.forName("UTF-16"));
                this.f661b = str;
                if (this.f660a == 2 && this.f669j == null) {
                    this.f669j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f661b = this.f662c;
                return;
        }
    }

    public static String e(int x2) {
        switch (x2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static int b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }
}
