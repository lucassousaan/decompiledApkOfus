package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.helloworld.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b  reason: collision with root package name */
    public final Chip f1525b;

    /* renamed from: c  reason: collision with root package name */
    public final TextInputLayout f1526c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f1527d;

    /* renamed from: e  reason: collision with root package name */
    public TextWatcher f1528e;

    public ChipTextInputComboView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater inflater = LayoutInflater.from(context);
        Chip chip = (Chip) inflater.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f1525b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) inflater.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f1526c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f1527d = editText;
        editText.setVisibility(4);
        b bVar = new b(this, null);
        this.f1528e = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public final void d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        LocaleList locales = configuration.getLocales();
        this.f1527d.setImeHintLocales(locales);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1525b.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        this.f1525b.setChecked(checked);
        int i2 = 0;
        this.f1527d.setVisibility(checked ? 0 : 4);
        Chip chip = this.f1525b;
        if (checked) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            this.f1527d.requestFocus();
            if (!TextUtils.isEmpty(this.f1527d.getText())) {
                EditText editText = this.f1527d;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f1525b.toggle();
    }

    public final String c(CharSequence text) {
        return l.i(getResources(), text);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l2) {
        this.f1525b.setOnClickListener(l2);
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        this.f1525b.setTag(key, tag);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        d();
    }
}
