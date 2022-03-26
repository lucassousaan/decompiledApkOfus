package c0;

import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import e0.a;
import java.util.ArrayList;
import k.n;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1215a;

    public k(String str) {
        this.f1215a = str;
    }

    /* renamed from: b */
    public void a(l typefaceResult) {
        synchronized (m.f1220c) {
            n nVar = m.f1221d;
            ArrayList<Consumer<FontRequestWorker.TypefaceResult>> replies = (ArrayList) nVar.get(this.f1215a);
            if (replies != null) {
                nVar.remove(this.f1215a);
                for (int i2 = 0; i2 < replies.size(); i2++) {
                    ((a) replies.get(i2)).a(typefaceResult);
                }
            }
        }
    }
}
