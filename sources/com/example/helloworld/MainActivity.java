package com.example.helloworld;

import android.os.Bundle;
import android.widget.TextView;
import d.o;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public final class MainActivity extends o {
    @Override // androidx.fragment.app.j0, androidx.activity.e, u.i, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textHello);
        if (textView != null) {
            textView.setText("Trabalho de ASI");
        }
    }
}
