package org.marceloaguiarr.util;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class EagerHolder {

    private static final EagerHolder INSTANCE = new EagerHolder();

    public static EagerHolder getInstance() {
        return INSTANCE;
    }
}
