package p;

import java.util.ArrayList;
import o.h;

/* JADX WARN: Classes with same name are omitted:
  
 */
/* loaded from: classes.dex */
public class p {

    /* renamed from: c  reason: collision with root package name */
    public static int f2747c;

    /* renamed from: a  reason: collision with root package name */
    public u f2748a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f2749b = new ArrayList();

    public p(u run, int dir) {
        this.f2748a = null;
        f2747c++;
        this.f2748a = run;
    }

    public void a(u run) {
        this.f2749b.add(run);
    }

    public final long d(i node, long startPosition) {
        u run = node.f2735d;
        if (run instanceof n) {
            return startPosition;
        }
        long position = startPosition;
        int count = node.f2742k.size();
        for (int i2 = 0; i2 < count; i2++) {
            f dependency = (f) node.f2742k.get(i2);
            if (dependency instanceof i) {
                i nextNode = (i) dependency;
                if (nextNode.f2735d != run) {
                    position = Math.max(position, d(nextNode, nextNode.f2737f + startPosition));
                }
            }
        }
        if (node != run.f2770h) {
            return position;
        }
        long dimension = run.j();
        return Math.max(Math.max(position, d(run.f2771i, startPosition + dimension)), (startPosition + dimension) - run.f2771i.f2737f);
    }

    public final long c(i node, long startPosition) {
        u run = node.f2735d;
        if (run instanceof n) {
            return startPosition;
        }
        long position = startPosition;
        int count = node.f2742k.size();
        for (int i2 = 0; i2 < count; i2++) {
            f dependency = (f) node.f2742k.get(i2);
            if (dependency instanceof i) {
                i nextNode = (i) dependency;
                if (nextNode.f2735d != run) {
                    position = Math.min(position, c(nextNode, nextNode.f2737f + startPosition));
                }
            }
        }
        if (node != run.f2771i) {
            return position;
        }
        long dimension = run.j();
        return Math.min(Math.min(position, c(run.f2770h, startPosition - dimension)), (startPosition - dimension) - run.f2770h.f2737f);
    }

    public long b(h container, int orientation) {
        u uVar;
        i iVar;
        i iVar2;
        u uVar2;
        u uVar3 = this.f2748a;
        if (uVar3 instanceof e) {
            e chainRun = (e) uVar3;
            if (chainRun.f2768f != orientation) {
                return 0L;
            }
        } else if (orientation == 0) {
            if (!(uVar3 instanceof o)) {
                return 0L;
            }
        } else if (!(uVar3 instanceof q)) {
            return 0L;
        }
        i containerStart = (orientation == 0 ? container.f2636d : container.f2638e).f2770h;
        i containerEnd = (orientation == 0 ? container.f2636d : container.f2638e).f2771i;
        boolean runWithStartTarget = uVar3.f2770h.f2743l.contains(containerStart);
        boolean runWithEndTarget = this.f2748a.f2771i.f2743l.contains(containerEnd);
        long dimension = this.f2748a.j();
        if (runWithStartTarget && runWithEndTarget) {
            long maxPosition = d(this.f2748a.f2770h, 0L);
            long minPosition = c(this.f2748a.f2771i, 0L);
            long endGap = maxPosition - dimension;
            u uVar4 = this.f2748a;
            int i2 = uVar4.f2771i.f2737f;
            long maxPosition2 = -i2;
            if (endGap >= maxPosition2) {
                endGap += i2;
            }
            int i3 = uVar4.f2770h.f2737f;
            long startGap = ((-minPosition) - dimension) - i3;
            if (startGap >= i3) {
                startGap -= i3;
            }
            float bias = uVar4.f2764b.l(orientation);
            long gap = 0;
            if (bias > 0.0f) {
                gap = (((float) startGap) / bias) + (((float) endGap) / (1.0f - bias));
            }
            long runDimension = (((float) gap) * bias) + 0.5f + dimension + (((float) gap) * (1.0f - bias)) + 0.5f;
            long gap2 = this.f2748a.f2770h.f2737f;
            return (gap2 + runDimension) - uVar2.f2771i.f2737f;
        } else if (runWithStartTarget) {
            long maxPosition3 = d(this.f2748a.f2770h, iVar2.f2737f);
            long runDimension2 = this.f2748a.f2770h.f2737f + dimension;
            return Math.max(maxPosition3, runDimension2);
        } else if (runWithEndTarget) {
            long minPosition2 = c(this.f2748a.f2771i, iVar.f2737f);
            long runDimension3 = (-this.f2748a.f2771i.f2737f) + dimension;
            return Math.max(-minPosition2, runDimension3);
        } else {
            return (uVar.f2770h.f2737f + this.f2748a.j()) - this.f2748a.f2771i.f2737f;
        }
    }
}
