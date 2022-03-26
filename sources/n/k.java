package n;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class k extends c {

    /* renamed from: f  reason: collision with root package name */
    public int f2526f = 128;

    /* renamed from: g  reason: collision with root package name */
    public m[] f2527g = new m[128];

    /* renamed from: h  reason: collision with root package name */
    public m[] f2528h = new m[128];

    /* renamed from: i  reason: collision with root package name */
    public int f2529i = 0;

    /* renamed from: j  reason: collision with root package name */
    public j f2530j = new j(this, this);

    @Override // n.c, n.e
    public void clear() {
        this.f2529i = 0;
        this.f2489b = 0.0f;
    }

    public k(d cache) {
        super(cache);
    }

    @Override // n.c, n.e
    public boolean isEmpty() {
        return this.f2529i == 0;
    }

    @Override // n.c, n.e
    public m a(f system, boolean[] avoid) {
        int pivot = -1;
        for (int i2 = 0; i2 < this.f2529i; i2++) {
            m variable = this.f2527g[i2];
            if (!avoid[variable.f2540c]) {
                this.f2530j.b(variable);
                if (pivot == -1) {
                    if (this.f2530j.c()) {
                        pivot = i2;
                    }
                } else if (this.f2530j.d(this.f2527g[pivot])) {
                    pivot = i2;
                }
            }
        }
        if (pivot == -1) {
            return null;
        }
        return this.f2527g[pivot];
    }

    @Override // n.c, n.e
    public void b(m error) {
        this.f2530j.b(error);
        this.f2530j.e();
        error.f2546i[error.f2542e] = 1.0f;
        F(error);
    }

    public final void F(m variable) {
        int i2;
        int i3 = this.f2529i + 1;
        m[] mVarArr = this.f2527g;
        if (i3 > mVarArr.length) {
            m[] mVarArr2 = (m[]) Arrays.copyOf(mVarArr, mVarArr.length * 2);
            this.f2527g = mVarArr2;
            this.f2528h = (m[]) Arrays.copyOf(mVarArr2, mVarArr2.length * 2);
        }
        m[] mVarArr3 = this.f2527g;
        int i4 = this.f2529i;
        mVarArr3[i4] = variable;
        int i5 = i4 + 1;
        this.f2529i = i5;
        if (i5 > 1 && mVarArr3[i5 - 1].f2540c > variable.f2540c) {
            int i6 = 0;
            while (true) {
                i2 = this.f2529i;
                if (i6 >= i2) {
                    break;
                }
                this.f2528h[i6] = this.f2527g[i6];
                i6++;
            }
            Arrays.sort(this.f2528h, 0, i2, new i(this));
            for (int i7 = 0; i7 < this.f2529i; i7++) {
                this.f2527g[i7] = this.f2528h[i7];
            }
        }
        variable.f2538a = true;
        variable.a(this);
    }

    public final void G(m variable) {
        for (int i2 = 0; i2 < this.f2529i; i2++) {
            if (this.f2527g[i2] == variable) {
                int j2 = i2;
                while (true) {
                    int i3 = this.f2529i;
                    if (j2 < i3 - 1) {
                        m[] mVarArr = this.f2527g;
                        mVarArr[j2] = mVarArr[j2 + 1];
                        j2++;
                    } else {
                        this.f2529i = i3 - 1;
                        variable.f2538a = false;
                        return;
                    }
                }
            }
        }
    }

    @Override // n.c
    public void C(f system, c definition, boolean removeFromDefinition) {
        m goalVariable = definition.f2488a;
        if (goalVariable != null) {
            b rowVariables = definition.f2491d;
            int currentSize = rowVariables.k();
            for (int i2 = 0; i2 < currentSize; i2++) {
                m solverVariable = rowVariables.b(i2);
                float value = rowVariables.a(i2);
                this.f2530j.b(solverVariable);
                if (this.f2530j.a(goalVariable, value)) {
                    F(solverVariable);
                }
                this.f2489b += definition.f2489b * value;
            }
            G(goalVariable);
        }
    }

    @Override // n.c
    public String toString() {
        String result = " goal -> (" + this.f2489b + ") : ";
        for (int i2 = 0; i2 < this.f2529i; i2++) {
            m v2 = this.f2527g[i2];
            this.f2530j.b(v2);
            result = result + this.f2530j + " ";
        }
        return result;
    }
}
