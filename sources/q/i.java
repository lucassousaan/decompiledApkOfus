package q;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f2867a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f2868b = new SparseArray();

    public i(Context context, ConstraintLayout layout, int resourceID) {
        a(context, resourceID);
    }

    public void c(p constraintsChangedListener) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Context context, int resourceId) {
        Resources res = context.getResources();
        XmlPullParser parser = res.getXml(resourceId);
        g state = null;
        try {
            int eventType = parser.getEventType();
            while (true) {
                char c2 = 1;
                if (eventType != 1) {
                    switch (eventType) {
                        case 0:
                            parser.getName();
                            break;
                        case 2:
                            String tagName = parser.getName();
                            switch (tagName.hashCode()) {
                                case -1349929691:
                                    if (tagName.equals("ConstraintSet")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 80204913:
                                    if (tagName.equals("State")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1382829617:
                                    if (tagName.equals("StateSet")) {
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1657696882:
                                    if (tagName.equals("layoutDescription")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1901439077:
                                    if (tagName.equals("Variant")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    state = new g(context, parser);
                                    this.f2867a.put(state.f2857a, state);
                                    break;
                                case 3:
                                    h match = new h(context, parser);
                                    if (state != null) {
                                        state.a(match);
                                        break;
                                    }
                                    break;
                                case 4:
                                    b(context, parser);
                                    break;
                                default:
                                    Log.v("ConstraintLayoutStates", "unknown tag " + tagName);
                                    break;
                            }
                            break;
                    }
                    eventType = parser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser parser) {
        o set = new o();
        int count = parser.getAttributeCount();
        for (int i2 = 0; i2 < count; i2++) {
            if ("id".equals(parser.getAttributeName(i2))) {
                String s2 = parser.getAttributeValue(i2);
                int id = -1;
                if (s2.contains("/")) {
                    String tmp = s2.substring(s2.indexOf(47) + 1);
                    id = context.getResources().getIdentifier(tmp, "id", context.getPackageName());
                }
                if (id == -1) {
                    if (s2.length() > 1) {
                        id = Integer.parseInt(s2.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                set.m(context, parser);
                this.f2868b.put(id, set);
                return;
            }
        }
    }
}
