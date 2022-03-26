package q1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public d f3352a;

    /* renamed from: b */
    public d f3353b;

    /* renamed from: c */
    public d f3354c;

    /* renamed from: d */
    public d f3355d;

    /* renamed from: e */
    public c f3356e;

    /* renamed from: f */
    public c f3357f;

    /* renamed from: g */
    public c f3358g;

    /* renamed from: h */
    public c f3359h;

    /* renamed from: i */
    public f f3360i;

    /* renamed from: j */
    public f f3361j;

    /* renamed from: k */
    public f f3362k;

    /* renamed from: l */
    public f f3363l;

    public o() {
        this.f3352a = k.b();
        this.f3353b = k.b();
        this.f3354c = k.b();
        this.f3355d = k.b();
        this.f3356e = new a(0.0f);
        this.f3357f = new a(0.0f);
        this.f3358g = new a(0.0f);
        this.f3359h = new a(0.0f);
        this.f3360i = k.c();
        this.f3361j = k.c();
        this.f3362k = k.c();
        this.f3363l = k.c();
    }

    public o(q other) {
        this.f3352a = k.b();
        this.f3353b = k.b();
        this.f3354c = k.b();
        this.f3355d = k.b();
        this.f3356e = new a(0.0f);
        this.f3357f = new a(0.0f);
        this.f3358g = new a(0.0f);
        this.f3359h = new a(0.0f);
        this.f3360i = k.c();
        this.f3361j = k.c();
        this.f3362k = k.c();
        this.f3363l = k.c();
        this.f3352a = other.f3364a;
        this.f3353b = other.f3365b;
        this.f3354c = other.f3366c;
        this.f3355d = other.f3367d;
        this.f3356e = other.f3368e;
        this.f3357f = other.f3369f;
        this.f3358g = other.f3370g;
        this.f3359h = other.f3371h;
        this.f3360i = other.f3372i;
        this.f3361j = other.f3373j;
        this.f3362k = other.f3374k;
        this.f3363l = other.f3375l;
    }

    public o p(c cornerSize) {
        B(cornerSize);
        F(cornerSize);
        x(cornerSize);
        t(cornerSize);
        return this;
    }

    public o o(float cornerSize) {
        A(cornerSize);
        E(cornerSize);
        w(cornerSize);
        s(cornerSize);
        return this;
    }

    public o A(float cornerSize) {
        this.f3356e = new a(cornerSize);
        return this;
    }

    public o B(c cornerSize) {
        this.f3356e = cornerSize;
        return this;
    }

    public o E(float cornerSize) {
        this.f3357f = new a(cornerSize);
        return this;
    }

    public o F(c cornerSize) {
        this.f3357f = cornerSize;
        return this;
    }

    public o w(float cornerSize) {
        this.f3358g = new a(cornerSize);
        return this;
    }

    public o x(c cornerSize) {
        this.f3358g = cornerSize;
        return this;
    }

    public o s(float cornerSize) {
        this.f3359h = new a(cornerSize);
        return this;
    }

    public o t(c cornerSize) {
        this.f3359h = cornerSize;
        return this;
    }

    public o y(int cornerFamily, c cornerSize) {
        z(k.a(cornerFamily));
        B(cornerSize);
        return this;
    }

    public o z(d topLeftCorner) {
        this.f3352a = topLeftCorner;
        float size = n(topLeftCorner);
        if (size != -1.0f) {
            A(size);
        }
        return this;
    }

    public o C(int cornerFamily, c cornerSize) {
        D(k.a(cornerFamily));
        F(cornerSize);
        return this;
    }

    public o D(d topRightCorner) {
        this.f3353b = topRightCorner;
        float size = n(topRightCorner);
        if (size != -1.0f) {
            E(size);
        }
        return this;
    }

    public o u(int cornerFamily, c cornerSize) {
        v(k.a(cornerFamily));
        x(cornerSize);
        return this;
    }

    public o v(d bottomRightCorner) {
        this.f3354c = bottomRightCorner;
        float size = n(bottomRightCorner);
        if (size != -1.0f) {
            w(size);
        }
        return this;
    }

    public o q(int cornerFamily, c cornerSize) {
        r(k.a(cornerFamily));
        t(cornerSize);
        return this;
    }

    public o r(d bottomLeftCorner) {
        this.f3355d = bottomLeftCorner;
        float size = n(bottomLeftCorner);
        if (size != -1.0f) {
            s(size);
        }
        return this;
    }

    public static float n(d treatment) {
        if (treatment instanceof m) {
            return ((m) treatment).f3351a;
        }
        if (treatment instanceof e) {
            return ((e) treatment).f3301a;
        }
        return -1.0f;
    }

    public q m() {
        return new q(this);
    }
}
