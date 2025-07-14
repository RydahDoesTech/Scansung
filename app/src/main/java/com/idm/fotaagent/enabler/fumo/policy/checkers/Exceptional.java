package com.idm.fotaagent.enabler.fumo.policy.checkers;

import com.samsung.android.fotaagent.common.log.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class Exceptional {
    protected List<Checker> checkers;
    private State state = State.UNCHECKED;

    /* renamed from: com.idm.fotaagent.enabler.fumo.policy.checkers.Exceptional$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State = iArr;
            try {
                iArr[State.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[State.HANDLED_AS_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[State.HANDLED_AS_THROWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[State.UNCHECKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[State.THROWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum State {
        UNCHECKED,
        THROWN,
        HANDLED_AS_THROWN,
        NORMAL,
        HANDLED_AS_NORMAL
    }

    private Exceptional(Checker... checkerArr) {
        this.checkers = Arrays.asList(checkerArr);
    }

    public static Exceptional of(Checker... checkerArr) {
        return new Exceptional(checkerArr);
    }

    public State getState() {
        return this.state;
    }

    public <T extends Exception> Exceptional ifThrown(Consumer<? super T> consumer, Class<T> cls) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[this.state.ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            if (i5 != 4 && i5 != 5) {
                Log.W("unexpected state - " + this.state);
            }
            try {
                Iterator<Checker> it = this.checkers.iterator();
                while (it.hasNext()) {
                    it.next().check();
                }
                this.state = State.NORMAL;
            } catch (Exception e5) {
                Log.printStackTrace(e5);
                this.state = State.THROWN;
                if (cls.isInstance(e5)) {
                    Log.E("actionForException");
                    this.state = State.HANDLED_AS_THROWN;
                    consumer.accept(cls.cast(e5));
                }
            }
        }
        return this;
    }

    public void orElse(Runnable runnable) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[this.state.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 || i5 == 3) {
                return;
            }
            if (i5 != 4) {
                if (i5 == 5) {
                    return;
                }
                Log.W("unexpected state - " + this.state);
            }
            try {
                Iterator<Checker> it = this.checkers.iterator();
                while (it.hasNext()) {
                    it.next().check();
                }
            } catch (Exception e5) {
                Log.printStackTrace(e5);
                this.state = State.THROWN;
                return;
            }
        }
        runnable.run();
        this.state = State.HANDLED_AS_NORMAL;
    }

    public <V> Optional<V> orElse(Callable<V> callable) {
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$fumo$policy$checkers$Exceptional$State[this.state.ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                if (i5 != 4) {
                    if (i5 != 5) {
                        Log.W("unexpected state - " + this.state);
                    }
                }
                try {
                    Iterator<Checker> it = this.checkers.iterator();
                    while (it.hasNext()) {
                        it.next().check();
                    }
                } catch (Exception e5) {
                    Log.printStackTrace(e5);
                    this.state = State.THROWN;
                    return Optional.empty();
                }
            }
            return Optional.empty();
        }
        this.state = State.HANDLED_AS_NORMAL;
        return Optional.ofNullable(callable.call());
    }
}
