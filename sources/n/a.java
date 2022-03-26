package n;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: l  reason: collision with root package name */
    public static float f2476l = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    public final c f2478b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2479c;

    /* renamed from: a  reason: collision with root package name */
    public int f2477a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2480d = 8;

    /* renamed from: e  reason: collision with root package name */
    public m f2481e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f2482f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f2483g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f2484h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    public int f2485i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f2486j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2487k = false;

    public a(c arrayRow, d cache) {
        this.f2478b = arrayRow;
        this.f2479c = cache;
    }

    @Override // n.b
    public final void e(m variable, float value) {
        if (value == 0.0f) {
            g(variable, true);
        } else if (this.f2485i == -1) {
            this.f2485i = 0;
            this.f2484h[0] = value;
            this.f2482f[0] = variable.f2540c;
            this.f2483g[0] = -1;
            variable.f2550m++;
            variable.a(this.f2478b);
            this.f2477a++;
            if (!this.f2487k) {
                int i2 = this.f2486j + 1;
                this.f2486j = i2;
                int[] iArr = this.f2482f;
                if (i2 >= iArr.length) {
                    this.f2487k = true;
                    this.f2486j = iArr.length - 1;
                }
            }
        } else {
            int current = this.f2485i;
            int previous = -1;
            for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
                int[] iArr2 = this.f2482f;
                int i3 = iArr2[current];
                int i4 = variable.f2540c;
                if (i3 == i4) {
                    this.f2484h[current] = value;
                    return;
                }
                if (iArr2[current] < i4) {
                    previous = current;
                }
                current = this.f2483g[current];
            }
            int i5 = this.f2486j;
            int availableIndice = i5 + 1;
            if (this.f2487k) {
                int[] iArr3 = this.f2482f;
                if (iArr3[i5] == -1) {
                    availableIndice = this.f2486j;
                } else {
                    availableIndice = iArr3.length;
                }
            }
            int[] iArr4 = this.f2482f;
            if (availableIndice >= iArr4.length && this.f2477a < iArr4.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = this.f2482f;
                    if (i6 >= iArr5.length) {
                        break;
                    } else if (iArr5[i6] == -1) {
                        availableIndice = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            int[] iArr6 = this.f2482f;
            if (availableIndice >= iArr6.length) {
                availableIndice = iArr6.length;
                int i7 = this.f2480d * 2;
                this.f2480d = i7;
                this.f2487k = false;
                this.f2486j = availableIndice - 1;
                this.f2484h = Arrays.copyOf(this.f2484h, i7);
                this.f2482f = Arrays.copyOf(this.f2482f, this.f2480d);
                this.f2483g = Arrays.copyOf(this.f2483g, this.f2480d);
            }
            this.f2482f[availableIndice] = variable.f2540c;
            this.f2484h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr7 = this.f2483g;
                iArr7[availableIndice] = iArr7[previous];
                iArr7[previous] = availableIndice;
            } else {
                this.f2483g[availableIndice] = this.f2485i;
                this.f2485i = availableIndice;
            }
            variable.f2550m++;
            variable.a(this.f2478b);
            int i8 = this.f2477a + 1;
            this.f2477a = i8;
            if (!this.f2487k) {
                this.f2486j++;
            }
            int[] iArr8 = this.f2482f;
            if (i8 >= iArr8.length) {
                this.f2487k = true;
            }
            if (this.f2486j >= iArr8.length) {
                this.f2487k = true;
                this.f2486j = iArr8.length - 1;
            }
        }
    }

    @Override // n.b
    public void d(m variable, float value, boolean removeFromDefinition) {
        if (value > -0.001f && value < 0.001f) {
            return;
        }
        if (this.f2485i == -1) {
            this.f2485i = 0;
            this.f2484h[0] = value;
            this.f2482f[0] = variable.f2540c;
            this.f2483g[0] = -1;
            variable.f2550m++;
            variable.a(this.f2478b);
            this.f2477a++;
            if (!this.f2487k) {
                int i2 = this.f2486j + 1;
                this.f2486j = i2;
                int[] iArr = this.f2482f;
                if (i2 >= iArr.length) {
                    this.f2487k = true;
                    this.f2486j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int current = this.f2485i;
        int previous = -1;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            int[] iArr2 = this.f2482f;
            int idx = iArr2[current];
            int i3 = variable.f2540c;
            if (idx == i3) {
                float[] fArr = this.f2484h;
                float v2 = fArr[current] + value;
                if (v2 > -0.001f && v2 < 0.001f) {
                    v2 = 0.0f;
                }
                fArr[current] = v2;
                if (v2 == 0.0f) {
                    if (current == this.f2485i) {
                        this.f2485i = this.f2483g[current];
                    } else {
                        int[] iArr3 = this.f2483g;
                        iArr3[previous] = iArr3[current];
                    }
                    if (removeFromDefinition) {
                        variable.c(this.f2478b);
                    }
                    if (this.f2487k) {
                        this.f2486j = current;
                    }
                    variable.f2550m--;
                    this.f2477a--;
                    return;
                }
                return;
            }
            if (iArr2[current] < i3) {
                previous = current;
            }
            current = this.f2483g[current];
        }
        int i4 = this.f2486j;
        int availableIndice = i4 + 1;
        if (this.f2487k) {
            int[] iArr4 = this.f2482f;
            if (iArr4[i4] == -1) {
                availableIndice = this.f2486j;
            } else {
                availableIndice = iArr4.length;
            }
        }
        int[] iArr5 = this.f2482f;
        if (availableIndice >= iArr5.length && this.f2477a < iArr5.length) {
            int i5 = 0;
            while (true) {
                int[] iArr6 = this.f2482f;
                if (i5 >= iArr6.length) {
                    break;
                } else if (iArr6[i5] == -1) {
                    availableIndice = i5;
                    break;
                } else {
                    i5++;
                }
            }
        }
        int[] iArr7 = this.f2482f;
        if (availableIndice >= iArr7.length) {
            availableIndice = iArr7.length;
            int i6 = this.f2480d * 2;
            this.f2480d = i6;
            this.f2487k = false;
            this.f2486j = availableIndice - 1;
            this.f2484h = Arrays.copyOf(this.f2484h, i6);
            this.f2482f = Arrays.copyOf(this.f2482f, this.f2480d);
            this.f2483g = Arrays.copyOf(this.f2483g, this.f2480d);
        }
        this.f2482f[availableIndice] = variable.f2540c;
        this.f2484h[availableIndice] = value;
        if (previous != -1) {
            int[] iArr8 = this.f2483g;
            iArr8[availableIndice] = iArr8[previous];
            iArr8[previous] = availableIndice;
        } else {
            this.f2483g[availableIndice] = this.f2485i;
            this.f2485i = availableIndice;
        }
        variable.f2550m++;
        variable.a(this.f2478b);
        this.f2477a++;
        if (!this.f2487k) {
            this.f2486j++;
        }
        int i7 = this.f2486j;
        int[] iArr9 = this.f2482f;
        if (i7 >= iArr9.length) {
            this.f2487k = true;
            this.f2486j = iArr9.length - 1;
        }
    }

    @Override // n.b
    public float h(c definition, boolean removeFromDefinition) {
        float value = c(definition.f2488a);
        g(definition.f2488a, removeFromDefinition);
        b definitionVariables = definition.f2491d;
        int definitionSize = definitionVariables.k();
        for (int i2 = 0; i2 < definitionSize; i2++) {
            m definitionVariable = definitionVariables.b(i2);
            float definitionValue = definitionVariables.c(definitionVariable);
            d(definitionVariable, definitionValue * value, removeFromDefinition);
        }
        return value;
    }

    @Override // n.b
    public final float g(m variable, boolean removeFromDefinition) {
        if (this.f2481e == variable) {
            this.f2481e = null;
        }
        if (this.f2485i == -1) {
            return 0.0f;
        }
        int current = this.f2485i;
        int previous = -1;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            int idx = this.f2482f[current];
            if (idx == variable.f2540c) {
                if (current == this.f2485i) {
                    this.f2485i = this.f2483g[current];
                } else {
                    int[] iArr = this.f2483g;
                    iArr[previous] = iArr[current];
                }
                if (removeFromDefinition) {
                    variable.c(this.f2478b);
                }
                variable.f2550m--;
                this.f2477a--;
                this.f2482f[current] = -1;
                if (this.f2487k) {
                    this.f2486j = current;
                }
                return this.f2484h[current];
            }
            previous = current;
            current = this.f2483g[current];
        }
        return 0.0f;
    }

    @Override // n.b
    public final void clear() {
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            m variable = this.f2479c.f2496d[this.f2482f[current]];
            if (variable != null) {
                variable.c(this.f2478b);
            }
            current = this.f2483g[current];
        }
        this.f2485i = -1;
        this.f2486j = -1;
        this.f2487k = false;
        this.f2477a = 0;
    }

    @Override // n.b
    public boolean i(m variable) {
        if (this.f2485i == -1) {
            return false;
        }
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            if (this.f2482f[current] == variable.f2540c) {
                return true;
            }
            current = this.f2483g[current];
        }
        return false;
    }

    @Override // n.b
    public void j() {
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            float[] fArr = this.f2484h;
            fArr[current] = fArr[current] * (-1.0f);
            current = this.f2483g[current];
        }
    }

    @Override // n.b
    public void f(float amount) {
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            float[] fArr = this.f2484h;
            fArr[current] = fArr[current] / amount;
            current = this.f2483g[current];
        }
    }

    @Override // n.b
    public int k() {
        return this.f2477a;
    }

    @Override // n.b
    public m b(int index) {
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            if (counter == index) {
                return this.f2479c.f2496d[this.f2482f[current]];
            }
            current = this.f2483g[current];
        }
        return null;
    }

    @Override // n.b
    public float a(int index) {
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            if (counter == index) {
                return this.f2484h[current];
            }
            current = this.f2483g[current];
        }
        return 0.0f;
    }

    @Override // n.b
    public final float c(m v2) {
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            if (this.f2482f[current] == v2.f2540c) {
                return this.f2484h[current];
            }
            current = this.f2483g[current];
        }
        return 0.0f;
    }

    public String toString() {
        String result = "";
        int current = this.f2485i;
        for (int counter = 0; current != -1 && counter < this.f2477a; counter++) {
            result = ((result + " -> ") + this.f2484h[current] + " : ") + this.f2479c.f2496d[this.f2482f[current]];
            current = this.f2483g[current];
        }
        return result;
    }
}
