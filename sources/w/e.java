package w;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import androidx.core.content.res.FontResourcesParserCompat;
import c0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public abstract class e {
    public static a b(XmlPullParser parser, Resources resources) {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            return d(parser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static a d(XmlPullParser parser, Resources resources) {
        parser.require(2, null, "font-family");
        String tag = parser.getName();
        if (tag.equals("font-family")) {
            return e(parser, resources);
        }
        g(parser);
        return null;
    }

    public static a e(XmlPullParser parser, Resources resources) {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray array = resources.obtainAttributes(attrs, a.f3552b);
        int[] iArr = a.f3551a;
        String authority = array.getString(0);
        String providerPackage = array.getString(4);
        String query = array.getString(5);
        int certsId = array.getResourceId(1, 0);
        int strategy = array.getInteger(2, 1);
        int timeoutMs = array.getInteger(3, 500);
        String systemFontFamilyName = array.getString(6);
        array.recycle();
        if (authority == null || providerPackage == null || query == null) {
            List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    String tag = parser.getName();
                    if (tag.equals("font")) {
                        fonts.add(f(parser, resources));
                    } else {
                        g(parser);
                    }
                }
            }
            if (fonts.isEmpty()) {
                return null;
            }
            return new b((c[]) fonts.toArray(new c[fonts.size()]));
        }
        while (parser.next() != 3) {
            g(parser);
        }
        List<List<byte[]>> certs = c(resources, certsId);
        return new d(new g(authority, providerPackage, query, certs), strategy, timeoutMs, systemFontFamilyName);
    }

    public static int a(TypedArray typedArray, int index) {
        return typedArray.getType(index);
    }

    public static List c(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (a(typedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArray.length(); i2++) {
                    int certId = typedArray.getResourceId(i2, 0);
                    if (certId != 0) {
                        result.add(h(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(h(resources.getStringArray(certsId)));
            }
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    public static List h(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    public static c f(XmlPullParser parser, Resources resources) {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray array = resources.obtainAttributes(attrs, a.f3553c);
        int[] iArr = a.f3551a;
        int weightAttr = 8;
        if (!array.hasValue(8)) {
            weightAttr = 1;
        }
        int weight = array.getInt(weightAttr, 400);
        int styleAttr = 6;
        if (!array.hasValue(6)) {
            styleAttr = 2;
        }
        boolean isItalic = 1 == array.getInt(styleAttr, 0);
        int ttcIndexAttr = 9;
        if (!array.hasValue(9)) {
            ttcIndexAttr = 3;
        }
        int variationSettingsAttr = 7;
        if (!array.hasValue(7)) {
            variationSettingsAttr = 4;
        }
        String variationSettings = array.getString(variationSettingsAttr);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        int resourceAttr = 5;
        if (!array.hasValue(5)) {
            resourceAttr = 0;
        }
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            g(parser);
        }
        return new c(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    public static void g(XmlPullParser parser) {
        int depth = 1;
        while (depth > 0) {
            switch (parser.next()) {
                case 2:
                    depth++;
                    break;
                case 3:
                    depth--;
                    break;
            }
        }
    }
}
