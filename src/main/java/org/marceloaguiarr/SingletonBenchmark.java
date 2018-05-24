package org.marceloaguiarr;

import org.marceloaguiarr.util.EagerHolder;
import org.marceloaguiarr.util.LazyHolderIdiom;
import org.marceloaguiarr.util.Synchronized;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 3)
@Measurement(iterations = 10)
public class SingletonBenchmark {

    @Benchmark
    @Threads(1000)
    public void SynchronizedBench() {
        Synchronized.getInstance();
    }

    @Benchmark
    @Threads(1000)
    public void LazyHolderBench() {
        LazyHolderIdiom.getInstance();
    }

    @Benchmark
    @Threads(1000)
    public void EagerHolderBench() {
        EagerHolder.getInstance();
    }
}
