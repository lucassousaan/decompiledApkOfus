package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public TextView f319a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f320b;

    public f1(TextView textView) {
        h.e(textView);
        this.f319a = textView;
    }

    public void b(TextClassifier textClassifier) {
        this.f320b = textClassifier;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f320b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager tcm = (TextClassificationManager) this.f319a.getContext().getSystemService(TextClassificationManager.class);
        if (tcm != null) {
            return tcm.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
