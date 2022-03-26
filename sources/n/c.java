package n;

import java.util.ArrayList;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: d  reason: collision with root package name */
    public b f2491d;

    /* renamed from: a  reason: collision with root package name */
    public m f2488a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f2489b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f2490c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2492e = false;

    public c(d cache) {
        this.f2491d = new a(this, cache);
    }

    public boolean s() {
        m mVar = this.f2488a;
        return mVar != null && (mVar.f2547j == l.UNRESTRICTED || this.f2489b >= 0.0f);
    }

    public String toString() {
        return A();
    }

    public String A() {
        String s2 = (this.f2488a == null ? "0" : "" + this.f2488a) + " = ";
        boolean addedVariable = false;
        if (this.f2489b != 0.0f) {
            s2 = s2 + this.f2489b;
            addedVariable = true;
        }
        int count = this.f2491d.k();
        for (int i2 = 0; i2 < count; i2++) {
            m v2 = this.f2491d.b(i2);
            if (v2 != null) {
                float amount = this.f2491d.a(i2);
                if (amount != 0.0f) {
                    String name = v2.toString();
                    if (!addedVariable) {
                        if (amount < 0.0f) {
                            s2 = s2 + "- ";
                            amount *= -1.0f;
                        }
                    } else if (amount > 0.0f) {
                        s2 = s2 + " + ";
                    } else {
                        s2 = s2 + " - ";
                        amount *= -1.0f;
                    }
                    s2 = amount == 1.0f ? s2 + name : s2 + amount + " " + name;
                    addedVariable = true;
                }
            }
        }
        if (addedVariable) {
            return s2;
        }
        return s2 + "0.0";
    }

    public void z() {
        this.f2488a = null;
        this.f2491d.clear();
        this.f2489b = 0.0f;
        this.f2492e = false;
    }

    public boolean t(m v2) {
        return this.f2491d.i(v2);
    }

    public c h(m variable, int value) {
        this.f2488a = variable;
        variable.f2543f = value;
        this.f2489b = value;
        this.f2492e = true;
        return this;
    }

    public c l(m variable, int value) {
        if (value < 0) {
            this.f2489b = value * (-1);
            this.f2491d.e(variable, 1.0f);
        } else {
            this.f2489b = value;
            this.f2491d.e(variable, -1.0f);
        }
        return this;
    }

    public c m(m variableA, m variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m2 = margin;
            if (m2 < 0) {
                m2 *= -1;
                inverse = true;
            }
            this.f2489b = m2;
        }
        if (!inverse) {
            this.f2491d.e(variableA, -1.0f);
            this.f2491d.e(variableB, 1.0f);
        } else {
            this.f2491d.e(variableA, 1.0f);
            this.f2491d.e(variableB, -1.0f);
        }
        return this;
    }

    public c d(m error, int sign) {
        this.f2491d.e(error, sign);
        return this;
    }

    public c n(m variableA, m variableB, m slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m2 = margin;
            if (m2 < 0) {
                m2 *= -1;
                inverse = true;
            }
            this.f2489b = m2;
        }
        if (!inverse) {
            this.f2491d.e(variableA, -1.0f);
            this.f2491d.e(variableB, 1.0f);
            this.f2491d.e(slack, 1.0f);
        } else {
            this.f2491d.e(variableA, 1.0f);
            this.f2491d.e(variableB, -1.0f);
            this.f2491d.e(slack, -1.0f);
        }
        return this;
    }

    public c o(m variableA, m variableB, m slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m2 = margin;
            if (m2 < 0) {
                m2 *= -1;
                inverse = true;
            }
            this.f2489b = m2;
        }
        if (!inverse) {
            this.f2491d.e(variableA, -1.0f);
            this.f2491d.e(variableB, 1.0f);
            this.f2491d.e(slack, -1.0f);
        } else {
            this.f2491d.e(variableA, 1.0f);
            this.f2491d.e(variableB, -1.0f);
            this.f2491d.e(slack, 1.0f);
        }
        return this;
    }

    public c k(float currentWeight, float totalWeights, float nextWeight, m variableStartA, m variableEndA, m variableStartB, m variableEndB) {
        this.f2489b = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f2491d.e(variableStartA, 1.0f);
            this.f2491d.e(variableEndA, -1.0f);
            this.f2491d.e(variableEndB, 1.0f);
            this.f2491d.e(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f2491d.e(variableStartA, 1.0f);
            this.f2491d.e(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f2491d.e(variableStartB, 1.0f);
            this.f2491d.e(variableEndB, -1.0f);
        } else {
            float cw = currentWeight / totalWeights;
            float nw = nextWeight / totalWeights;
            float w2 = cw / nw;
            this.f2491d.e(variableStartA, 1.0f);
            this.f2491d.e(variableEndA, -1.0f);
            this.f2491d.e(variableEndB, w2);
            this.f2491d.e(variableStartB, -w2);
        }
        return this;
    }

    public c g(m variableA, m variableB, int marginA, float bias, m variableC, m variableD, int marginB) {
        if (variableB == variableC) {
            this.f2491d.e(variableA, 1.0f);
            this.f2491d.e(variableD, 1.0f);
            this.f2491d.e(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f2491d.e(variableA, 1.0f);
            this.f2491d.e(variableB, -1.0f);
            this.f2491d.e(variableC, -1.0f);
            this.f2491d.e(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f2489b = (-marginA) + marginB;
            }
        } else if (bias <= 0.0f) {
            this.f2491d.e(variableA, -1.0f);
            this.f2491d.e(variableB, 1.0f);
            this.f2489b = marginA;
        } else if (bias >= 1.0f) {
            this.f2491d.e(variableD, -1.0f);
            this.f2491d.e(variableC, 1.0f);
            this.f2489b = -marginB;
        } else {
            this.f2491d.e(variableA, (1.0f - bias) * 1.0f);
            this.f2491d.e(variableB, (1.0f - bias) * (-1.0f));
            this.f2491d.e(variableC, (-1.0f) * bias);
            this.f2491d.e(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f2489b = ((-marginA) * (1.0f - bias)) + (marginB * bias);
            }
        }
        return this;
    }

    public c c(f system, int strength) {
        this.f2491d.e(system.o(strength, "ep"), 1.0f);
        this.f2491d.e(system.o(strength, "em"), -1.0f);
        return this;
    }

    public c i(m variableA, m variableC, float percent) {
        this.f2491d.e(variableA, -1.0f);
        this.f2491d.e(variableC, percent);
        return this;
    }

    public c j(m variableA, m variableB, m variableC, m variableD, float ratio) {
        this.f2491d.e(variableA, -1.0f);
        this.f2491d.e(variableB, 1.0f);
        this.f2491d.e(variableC, ratio);
        this.f2491d.e(variableD, -ratio);
        return this;
    }

    public c p(m at, m ab, m bt, m bb, float angleComponent) {
        this.f2491d.e(bt, 0.5f);
        this.f2491d.e(bb, 0.5f);
        this.f2491d.e(at, -0.5f);
        this.f2491d.e(ab, -0.5f);
        this.f2489b = -angleComponent;
        return this;
    }

    public void q() {
        float f2 = this.f2489b;
        if (f2 < 0.0f) {
            this.f2489b = f2 * (-1.0f);
            this.f2491d.j();
        }
    }

    public boolean e(f system) {
        boolean addedExtra = false;
        m pivotCandidate = f(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            y(pivotCandidate);
        }
        if (this.f2491d.k() == 0) {
            this.f2492e = true;
        }
        return addedExtra;
    }

    public m f(f system) {
        m restrictedCandidate = null;
        m unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int currentSize = this.f2491d.k();
        for (int i2 = 0; i2 < currentSize; i2++) {
            float amount = this.f2491d.a(i2);
            m variable = this.f2491d.b(i2);
            if (variable.f2547j == l.UNRESTRICTED) {
                if (unrestrictedCandidate == null) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = v(variable);
                } else if (unrestrictedCandidateAmount > amount) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = v(variable);
                } else if (!unrestrictedCandidateIsNew && v(variable)) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = true;
                }
            } else if (unrestrictedCandidate == null && amount < 0.0f) {
                if (restrictedCandidate == null) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = v(variable);
                } else if (restrictedCandidateAmount > amount) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = v(variable);
                } else if (!restrictedCandidateIsNew && v(variable)) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = true;
                }
            }
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    public final boolean v(m variable) {
        return variable.f2550m <= 1;
    }

    public void y(m v2) {
        m mVar = this.f2488a;
        if (mVar != null) {
            this.f2491d.e(mVar, -1.0f);
            this.f2488a.f2541d = -1;
            this.f2488a = null;
        }
        float amount = this.f2491d.g(v2, true) * (-1.0f);
        this.f2488a = v2;
        if (amount != 1.0f) {
            this.f2489b /= amount;
            this.f2491d.f(amount);
        }
    }

    @Override // n.e
    public boolean isEmpty() {
        return this.f2488a == null && this.f2489b == 0.0f && this.f2491d.k() == 0;
    }

    public void C(f system, c definition, boolean removeFromDefinition) {
        float value = this.f2491d.h(definition, removeFromDefinition);
        this.f2489b += definition.f2489b * value;
        if (removeFromDefinition) {
            definition.f2488a.c(this);
        }
        if (this.f2488a != null && this.f2491d.k() == 0) {
            this.f2492e = true;
            system.f2505a = true;
        }
    }

    public void B(f system, m variable, boolean removeFromDefinition) {
        if (variable.f2544g) {
            float value = this.f2491d.c(variable);
            this.f2489b += variable.f2543f * value;
            this.f2491d.g(variable, removeFromDefinition);
            if (removeFromDefinition) {
                variable.c(this);
            }
            if (this.f2491d.k() == 0) {
                this.f2492e = true;
                system.f2505a = true;
            }
        }
    }

    public final m x(boolean[] avoid, m exclude) {
        l lVar;
        float value = 0.0f;
        m pivot = null;
        int currentSize = this.f2491d.k();
        for (int i2 = 0; i2 < currentSize; i2++) {
            float currentValue = this.f2491d.a(i2);
            if (currentValue < 0.0f) {
                m v2 = this.f2491d.b(i2);
                if ((avoid == null || !avoid[v2.f2540c]) && v2 != exclude && (((lVar = v2.f2547j) == l.SLACK || lVar == l.ERROR) && currentValue < value)) {
                    value = currentValue;
                    pivot = v2;
                }
            }
        }
        return pivot;
    }

    public m w(m exclude) {
        return x(null, exclude);
    }

    @Override // n.e
    public m a(f system, boolean[] avoid) {
        return x(avoid, null);
    }

    @Override // n.e
    public void clear() {
        this.f2491d.clear();
        this.f2488a = null;
        this.f2489b = 0.0f;
    }

    public void u(e row) {
        if (row instanceof c) {
            c copiedRow = (c) row;
            this.f2488a = null;
            this.f2491d.clear();
            for (int i2 = 0; i2 < copiedRow.f2491d.k(); i2++) {
                m var = copiedRow.f2491d.b(i2);
                float val = copiedRow.f2491d.a(i2);
                this.f2491d.d(var, val, true);
            }
        }
    }

    @Override // n.e
    public void b(m error) {
        float weight = 1.0f;
        int i2 = error.f2542e;
        if (i2 == 1) {
            weight = 1.0f;
        } else if (i2 == 2) {
            weight = 1000.0f;
        } else if (i2 == 3) {
            weight = 1000000.0f;
        } else if (i2 == 4) {
            weight = 1.0E9f;
        } else if (i2 == 5) {
            weight = 1.0E12f;
        }
        this.f2491d.e(error, weight);
    }

    public m r() {
        return this.f2488a;
    }

    public void D(f system) {
        if (system.f2511g.length != 0) {
            boolean done = false;
            while (!done) {
                int currentSize = this.f2491d.k();
                for (int i2 = 0; i2 < currentSize; i2++) {
                    m variable = this.f2491d.b(i2);
                    if (variable.f2541d != -1 || variable.f2544g) {
                        this.f2490c.add(variable);
                    } else {
                        Objects.requireNonNull(variable);
                    }
                }
                int size = this.f2490c.size();
                if (size > 0) {
                    for (int i3 = 0; i3 < size; i3++) {
                        m variable2 = (m) this.f2490c.get(i3);
                        if (variable2.f2544g) {
                            B(system, variable2, true);
                        } else {
                            Objects.requireNonNull(variable2);
                            C(system, system.f2511g[variable2.f2541d], true);
                        }
                    }
                    this.f2490c.clear();
                } else {
                    done = true;
                }
            }
            if (this.f2488a != null && this.f2491d.k() == 0) {
                this.f2492e = true;
                system.f2505a = true;
            }
        }
    }
}
