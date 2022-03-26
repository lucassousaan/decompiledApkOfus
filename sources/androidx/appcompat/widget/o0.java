package androidx.appcompat.widget;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import f0.c1;
import f0.f;
import f0.m;
import h0.d;
import h0.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class o0 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f470a;

    public o0(View view) {
        this.f470a = view;
    }

    public boolean a(h inputContentInfo, int flags, Bundle opts) {
        Bundle extras = opts;
        if ((flags & 1) != 0) {
            try {
                inputContentInfo.d();
                InputContentInfo inputContentInfoFmk = (InputContentInfo) inputContentInfo.e();
                if (opts == null) {
                    new Bundle();
                } else {
                    extras = new Bundle(opts);
                }
                extras.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfoFmk);
            } catch (Exception e2) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipData clip = new ClipData(inputContentInfo.b(), new ClipData.Item(inputContentInfo.a()));
        f fVar = new f(clip, 2);
        fVar.d(inputContentInfo.c());
        fVar.b(extras);
        m payload = fVar.a();
        return c1.b0(this.f470a, payload) == null;
    }
}
