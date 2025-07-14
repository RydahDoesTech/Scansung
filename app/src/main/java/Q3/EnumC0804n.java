package q3;

import P2.z;
import g3.y;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: q3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0804n {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);


    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f8495e = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8515d;

    static {
        for (EnumC0804n enumC0804n : values()) {
            f8495e.put(enumC0804n.name(), enumC0804n);
        }
        EnumC0804n[] enumC0804nArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC0804n enumC0804n2 : enumC0804nArrValues) {
            if (enumC0804n2.f8515d) {
                arrayList.add(enumC0804n2);
            }
        }
        P2.m.R0(arrayList);
        P2.i.x0(values());
        EnumC0804n enumC0804n3 = ANNOTATION_CLASS;
        EnumC0804n enumC0804n4 = CLASS;
        P2.n.h0(enumC0804n3, enumC0804n4);
        P2.n.h0(LOCAL_CLASS, enumC0804n4);
        P2.n.h0(CLASS_ONLY, enumC0804n4);
        EnumC0804n enumC0804n5 = COMPANION_OBJECT;
        EnumC0804n enumC0804n6 = OBJECT;
        P2.n.h0(enumC0804n5, enumC0804n6, enumC0804n4);
        P2.n.h0(STANDALONE_OBJECT, enumC0804n6, enumC0804n4);
        P2.n.h0(INTERFACE, enumC0804n4);
        P2.n.h0(ENUM_CLASS, enumC0804n4);
        EnumC0804n enumC0804n7 = ENUM_ENTRY;
        EnumC0804n enumC0804n8 = PROPERTY;
        EnumC0804n enumC0804n9 = FIELD;
        P2.n.h0(enumC0804n7, enumC0804n8, enumC0804n9);
        EnumC0804n enumC0804n10 = PROPERTY_SETTER;
        y.N(enumC0804n10);
        EnumC0804n enumC0804n11 = PROPERTY_GETTER;
        y.N(enumC0804n11);
        y.N(FUNCTION);
        EnumC0804n enumC0804n12 = FILE;
        y.N(enumC0804n12);
        EnumC0794d enumC0794d = EnumC0794d.CONSTRUCTOR_PARAMETER;
        EnumC0804n enumC0804n13 = VALUE_PARAMETER;
        z.i0(new O2.f(enumC0794d, enumC0804n13), new O2.f(EnumC0794d.FIELD, enumC0804n9), new O2.f(EnumC0794d.PROPERTY, enumC0804n8), new O2.f(EnumC0794d.FILE, enumC0804n12), new O2.f(EnumC0794d.PROPERTY_GETTER, enumC0804n11), new O2.f(EnumC0794d.PROPERTY_SETTER, enumC0804n10), new O2.f(EnumC0794d.RECEIVER, enumC0804n13), new O2.f(EnumC0794d.SETTER_PARAMETER, enumC0804n13), new O2.f(EnumC0794d.PROPERTY_DELEGATE_FIELD, enumC0804n9));
    }

    EnumC0804n(boolean z4) {
        this.f8515d = z4;
    }
}
