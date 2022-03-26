package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import f0.e;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.a;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f1988e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f1989f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f1990a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1991b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1992c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1993d;

    static {
        Class[] clsArr = {Context.class};
        f1988e = clsArr;
        f1989f = clsArr;
    }

    public k(Context context) {
        super(context);
        this.f1992c = context;
        Object[] objArr = {context};
        this.f1990a = objArr;
        this.f1991b = objArr;
    }

    @Override // android.view.MenuInflater
    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof a)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            try {
                parser = this.f1992c.getResources().getLayout(menuRes);
                AttributeSet attrs = Xml.asAttributeSet(parser);
                c(parser, attrs, menu);
                parser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    public final void c(XmlPullParser parser, AttributeSet attrs, Menu menu) {
        j menuState = new j(this, menu);
        int eventType = parser.getEventType();
        boolean lookingForEndOfUnknownTag = false;
        String unknownTagName = null;
        while (true) {
            if (eventType != 2) {
                eventType = parser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String tagName = parser.getName();
                if (tagName.equals("menu")) {
                    eventType = parser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + tagName);
                }
            }
        }
        boolean reachedEndOfMenu = false;
        while (!reachedEndOfMenu) {
            switch (eventType) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!lookingForEndOfUnknownTag) {
                        String tagName2 = parser.getName();
                        if (!tagName2.equals("group")) {
                            if (!tagName2.equals("item")) {
                                if (!tagName2.equals("menu")) {
                                    lookingForEndOfUnknownTag = true;
                                    unknownTagName = tagName2;
                                    break;
                                } else {
                                    SubMenu subMenu = menuState.b();
                                    c(parser, attrs, subMenu);
                                    break;
                                }
                            } else {
                                menuState.g(attrs);
                                break;
                            }
                        } else {
                            menuState.f(attrs);
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    String tagName3 = parser.getName();
                    if (!lookingForEndOfUnknownTag || !tagName3.equals(unknownTagName)) {
                        if (!tagName3.equals("group")) {
                            if (!tagName3.equals("item")) {
                                if (!tagName3.equals("menu")) {
                                    break;
                                } else {
                                    reachedEndOfMenu = true;
                                    break;
                                }
                            } else if (!menuState.d()) {
                                e eVar = menuState.A;
                                if (eVar != null && eVar.a()) {
                                    menuState.b();
                                    break;
                                } else {
                                    menuState.a();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            menuState.h();
                            break;
                        }
                    } else {
                        lookingForEndOfUnknownTag = false;
                        unknownTagName = null;
                        break;
                    }
                    break;
            }
            eventType = parser.next();
        }
    }

    public Object b() {
        if (this.f1993d == null) {
            this.f1993d = a(this.f1992c);
        }
        return this.f1993d;
    }

    public final Object a(Object owner) {
        if (owner instanceof Activity) {
            return owner;
        }
        if (owner instanceof ContextWrapper) {
            return a(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }
}
