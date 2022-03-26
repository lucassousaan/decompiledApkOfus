package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import q0.q1;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class r extends q1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f1425a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1426b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f1427c;

    public r(x this$0, m0 m0Var, MaterialButton materialButton) {
        this.f1427c = this$0;
        this.f1425a = m0Var;
        this.f1426b = materialButton;
    }

    @Override // q0.q1
    public void b(RecyclerView recyclerView, int dx, int dy) {
        int currentItem;
        if (dx < 0) {
            currentItem = this.f1427c.D1().Z1();
        } else {
            currentItem = this.f1427c.D1().c2();
        }
        this.f1427c.Z = this.f1425a.v(currentItem);
        this.f1426b.setText(this.f1425a.w(currentItem));
    }

    @Override // q0.q1
    public void a(RecyclerView recyclerView, int newState) {
        if (newState == 0) {
            CharSequence announcementText = this.f1426b.getText();
            recyclerView.announceForAccessibility(announcementText);
        }
    }
}
