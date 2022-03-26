package x;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import c0.o;
import java.io.IOException;
import java.io.InputStream;
import w.b;
import w.c;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i extends l {
    @Override // x.l
    public o f(o[] fonts, int style) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // x.l
    public Typeface c(Context context, InputStream is) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // x.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, o[] fonts, int style) {
        FontFamily.Builder familyBuilder = null;
        ContentResolver resolver = context.getContentResolver();
        try {
            int length = fonts.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 < length) {
                    o font = fonts[i3];
                    try {
                        ParcelFileDescriptor pfd = resolver.openFileDescriptor(font.d(), "r", cancellationSignal);
                        if (pfd != null) {
                            try {
                                Font.Builder weight = new Font.Builder(pfd).setWeight(font.e());
                                if (!font.f()) {
                                    i4 = 0;
                                }
                                Font platformFont = weight.setSlant(i4).setTtcIndex(font.c()).build();
                                if (familyBuilder == null) {
                                    familyBuilder = new FontFamily.Builder(platformFont);
                                } else {
                                    familyBuilder.addFont(platformFont);
                                }
                                pfd.close();
                            } catch (Throwable th) {
                                try {
                                    pfd.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                                break;
                            }
                        } else if (pfd != null) {
                            pfd.close();
                        }
                    } catch (IOException e2) {
                    }
                    i3++;
                } else if (familyBuilder == null) {
                    return null;
                } else {
                    int i5 = (style & 1) != 0 ? 700 : 400;
                    if ((style & 2) != 0) {
                        i2 = 1;
                    }
                    FontStyle defaultStyle = new FontStyle(i5, i2);
                    return new Typeface.CustomFallbackBuilder(familyBuilder.build()).setStyle(defaultStyle).build();
                }
            }
        } catch (Exception e3) {
            return null;
        }
    }

    @Override // x.l
    public Typeface a(Context context, b familyEntry, Resources resources, int style) {
        FontFamily.Builder familyBuilder = null;
        try {
            c[] a2 = familyEntry.a();
            int length = a2.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                c entry = a2[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, entry.b()).setWeight(entry.e());
                    if (!entry.f()) {
                        i4 = 0;
                    }
                    Font platformFont = weight.setSlant(i4).setTtcIndex(entry.c()).setFontVariationSettings(entry.d()).build();
                    if (familyBuilder == null) {
                        familyBuilder = new FontFamily.Builder(platformFont);
                    } else {
                        familyBuilder.addFont(platformFont);
                    }
                } catch (IOException e2) {
                }
                i3++;
            }
            if (familyBuilder == null) {
                return null;
            }
            int i5 = (style & 1) != 0 ? 700 : 400;
            if ((style & 2) != 0) {
                i2 = 1;
            }
            FontStyle defaultStyle = new FontStyle(i5, i2);
            return new Typeface.CustomFallbackBuilder(familyBuilder.build()).setStyle(defaultStyle).build();
        } catch (Exception e3) {
            return null;
        }
    }

    @Override // x.l
    public Typeface d(Context context, Resources resources, int id, String path, int style) {
        try {
            Font font = new Font.Builder(resources, id).build();
            FontFamily family = new FontFamily.Builder(font).build();
            return new Typeface.CustomFallbackBuilder(family).setStyle(font.getStyle()).build();
        } catch (Exception e2) {
            return null;
        }
    }
}
