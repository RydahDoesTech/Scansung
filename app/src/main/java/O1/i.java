package O1;

/* loaded from: classes.dex */
public final class i extends V1.a {
    @Override // V1.a
    public final void B(t tVar, float f, float f5) {
        tVar.d(f5 * f, 180.0f, 90.0f);
        float f6 = f5 * 2.0f * f;
        p pVar = new p(0.0f, 0.0f, f6, f6);
        pVar.f = 180.0f;
        pVar.f1992g = 90.0f;
        tVar.f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f2001g.add(nVar);
        tVar.f1999d = 270.0f;
        float f7 = (0.0f + f6) * 0.5f;
        float f8 = (f6 - 0.0f) / 2.0f;
        double d5 = 270.0f;
        tVar.f1997b = (((float) Math.cos(Math.toRadians(d5))) * f8) + f7;
        tVar.f1998c = (f8 * ((float) Math.sin(Math.toRadians(d5)))) + f7;
    }
}
