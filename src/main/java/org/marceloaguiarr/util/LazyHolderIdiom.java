package org.marceloaguiarr.util;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class LazyHolderIdiom {

    private static class LazyHolder {
        static final LazyHolderIdiom INSTANCE = new LazyHolderIdiom();
    }

    public static LazyHolderIdiom getInstance() {
        return LazyHolder.INSTANCE;
    }
}
