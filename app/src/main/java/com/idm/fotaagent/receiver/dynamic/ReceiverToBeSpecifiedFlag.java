package com.idm.fotaagent.receiver.dynamic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface ReceiverToBeSpecifiedFlag {

    public enum Property {
        EXPORT,
        NOT_EXPORT,
        NOT_SPECIFY_FOR_SYSTEM
    }

    Property property() default Property.NOT_SPECIFY_FOR_SYSTEM;
}
