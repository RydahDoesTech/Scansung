package com.idm.fotaagent.restapi.restclient.exception;

import com.idm.fotaagent.restapi.response.Result;

/* loaded from: classes.dex */
public class ParseFailedException extends Exception {
    private final Result result;

    public ParseFailedException(Throwable th, boolean z4) {
        super(th);
        this.result = getResult(z4);
    }

    private Result getResult(boolean z4) {
        return z4 ? new Result(501) : new Result(Result.FAIL_UNKNOWN);
    }

    public Result getResult() {
        return this.result;
    }

    public ParseFailedException(Throwable th) {
        this(th, false);
    }
}
