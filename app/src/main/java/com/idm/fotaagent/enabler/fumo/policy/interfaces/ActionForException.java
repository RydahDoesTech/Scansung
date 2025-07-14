package com.idm.fotaagent.enabler.fumo.policy.interfaces;

import java.lang.Exception;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public interface ActionForException<T extends Exception> {
    Consumer<T> act();

    Class<T> getExceptionClass();
}
