package org.marceloaguiarr.util;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class Synchronized {

    private static Synchronized INSTANCE;

    public static synchronized Synchronized getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Synchronized();

        return INSTANCE;
    }
}
