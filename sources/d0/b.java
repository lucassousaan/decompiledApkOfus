package d0;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f1766f = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1767a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1768b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1769c;

    /* renamed from: d  reason: collision with root package name */
    public int f1770d;

    /* renamed from: e  reason: collision with root package name */
    public char f1771e;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f1766f[i2] = Character.getDirectionality(i2);
        }
    }

    public b(CharSequence text, boolean isHtml) {
        this.f1767a = text;
        this.f1768b = isHtml;
        this.f1769c = text.length();
    }

    public int d() {
        this.f1770d = 0;
        int embeddingLevel = 0;
        int embeddingLevelDir = 0;
        int firstNonEmptyEmbeddingLevel = 0;
        while (this.f1770d < this.f1769c && firstNonEmptyEmbeddingLevel == 0) {
            switch (b()) {
                case 0:
                    if (embeddingLevel != 0) {
                        firstNonEmptyEmbeddingLevel = embeddingLevel;
                        break;
                    } else {
                        return -1;
                    }
                case 1:
                case 2:
                    if (embeddingLevel != 0) {
                        firstNonEmptyEmbeddingLevel = embeddingLevel;
                        break;
                    } else {
                        return 1;
                    }
                case 9:
                    break;
                case 14:
                case 15:
                    embeddingLevel++;
                    embeddingLevelDir = -1;
                    break;
                case 16:
                case 17:
                    embeddingLevel++;
                    embeddingLevelDir = 1;
                    break;
                case 18:
                    embeddingLevel--;
                    embeddingLevelDir = 0;
                    break;
                default:
                    firstNonEmptyEmbeddingLevel = embeddingLevel;
                    break;
            }
        }
        if (firstNonEmptyEmbeddingLevel == 0) {
            return 0;
        }
        if (embeddingLevelDir != 0) {
            return embeddingLevelDir;
        }
        while (this.f1770d > 0) {
            switch (a()) {
                case 14:
                case 15:
                    if (firstNonEmptyEmbeddingLevel != embeddingLevel) {
                        embeddingLevel--;
                        break;
                    } else {
                        return -1;
                    }
                case 16:
                case 17:
                    if (firstNonEmptyEmbeddingLevel != embeddingLevel) {
                        embeddingLevel--;
                        break;
                    } else {
                        return 1;
                    }
                case 18:
                    embeddingLevel++;
                    break;
            }
        }
        return 0;
    }

    public int e() {
        this.f1770d = this.f1769c;
        int embeddingLevel = 0;
        int lastNonEmptyEmbeddingLevel = 0;
        while (this.f1770d > 0) {
            switch (a()) {
                case 0:
                    if (embeddingLevel != 0) {
                        if (lastNonEmptyEmbeddingLevel != 0) {
                            break;
                        } else {
                            lastNonEmptyEmbeddingLevel = embeddingLevel;
                            break;
                        }
                    } else {
                        return -1;
                    }
                case 1:
                case 2:
                    if (embeddingLevel != 0) {
                        if (lastNonEmptyEmbeddingLevel != 0) {
                            break;
                        } else {
                            lastNonEmptyEmbeddingLevel = embeddingLevel;
                            break;
                        }
                    } else {
                        return 1;
                    }
                case 9:
                    break;
                case 14:
                case 15:
                    if (lastNonEmptyEmbeddingLevel != embeddingLevel) {
                        embeddingLevel--;
                        break;
                    } else {
                        return -1;
                    }
                case 16:
                case 17:
                    if (lastNonEmptyEmbeddingLevel != embeddingLevel) {
                        embeddingLevel--;
                        break;
                    } else {
                        return 1;
                    }
                case 18:
                    embeddingLevel++;
                    break;
                default:
                    if (lastNonEmptyEmbeddingLevel != 0) {
                        break;
                    } else {
                        lastNonEmptyEmbeddingLevel = embeddingLevel;
                        break;
                    }
            }
        }
        return 0;
    }

    public static byte c(char c2) {
        return c2 < 1792 ? f1766f[c2] : Character.getDirectionality(c2);
    }

    public byte b() {
        char charAt = this.f1767a.charAt(this.f1770d);
        this.f1771e = charAt;
        if (Character.isHighSurrogate(charAt)) {
            int codePoint = Character.codePointAt(this.f1767a, this.f1770d);
            this.f1770d += Character.charCount(codePoint);
            return Character.getDirectionality(codePoint);
        }
        this.f1770d++;
        byte dirType = c(this.f1771e);
        if (!this.f1768b) {
            return dirType;
        }
        char c2 = this.f1771e;
        if (c2 == '<') {
            return i();
        }
        if (c2 != '&') {
            return dirType;
        }
        g();
        return (byte) 12;
    }

    public byte a() {
        char charAt = this.f1767a.charAt(this.f1770d - 1);
        this.f1771e = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePoint = Character.codePointBefore(this.f1767a, this.f1770d);
            this.f1770d -= Character.charCount(codePoint);
            return Character.getDirectionality(codePoint);
        }
        this.f1770d--;
        byte dirType = c(this.f1771e);
        if (!this.f1768b) {
            return dirType;
        }
        char c2 = this.f1771e;
        if (c2 == '>') {
            return h();
        }
        if (c2 == ';') {
            return f();
        }
        return dirType;
    }

    public final byte i() {
        char charAt;
        int initialCharIndex = this.f1770d;
        while (true) {
            int i2 = this.f1770d;
            if (i2 < this.f1769c) {
                CharSequence charSequence = this.f1767a;
                this.f1770d = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.f1771e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    char quote = this.f1771e;
                    do {
                        int i3 = this.f1770d;
                        if (i3 < this.f1769c) {
                            CharSequence charSequence2 = this.f1767a;
                            this.f1770d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f1771e = charAt;
                        }
                    } while (charAt != quote);
                }
            } else {
                this.f1770d = initialCharIndex;
                this.f1771e = '<';
                return (byte) 13;
            }
        }
    }

    public final byte h() {
        char charAt;
        int initialCharIndex = this.f1770d;
        while (true) {
            int i2 = this.f1770d;
            if (i2 <= 0) {
                break;
            }
            CharSequence charSequence = this.f1767a;
            int i3 = i2 - 1;
            this.f1770d = i3;
            char charAt2 = charSequence.charAt(i3);
            this.f1771e = charAt2;
            if (charAt2 == '<') {
                return (byte) 12;
            }
            if (charAt2 == '>') {
                break;
            } else if (charAt2 == '\"' || charAt2 == '\'') {
                char quote = this.f1771e;
                do {
                    int i4 = this.f1770d;
                    if (i4 > 0) {
                        CharSequence charSequence2 = this.f1767a;
                        int i5 = i4 - 1;
                        this.f1770d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f1771e = charAt;
                    }
                } while (charAt != quote);
            }
        }
        this.f1770d = initialCharIndex;
        this.f1771e = '>';
        return (byte) 13;
    }

    public final byte g() {
        char charAt;
        do {
            int i2 = this.f1770d;
            if (i2 >= this.f1769c) {
                return (byte) 12;
            }
            CharSequence charSequence = this.f1767a;
            this.f1770d = i2 + 1;
            charAt = charSequence.charAt(i2);
            this.f1771e = charAt;
        } while (charAt != ';');
        return (byte) 12;
    }

    public final byte f() {
        char charAt;
        int initialCharIndex = this.f1770d;
        do {
            int i2 = this.f1770d;
            if (i2 <= 0) {
                break;
            }
            CharSequence charSequence = this.f1767a;
            int i3 = i2 - 1;
            this.f1770d = i3;
            charAt = charSequence.charAt(i3);
            this.f1771e = charAt;
            if (charAt == '&') {
                return (byte) 12;
            }
        } while (charAt != ';');
        this.f1770d = initialCharIndex;
        this.f1771e = ';';
        return (byte) 13;
    }
}
