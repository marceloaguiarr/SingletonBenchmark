# SingletonBenchmark

There are multiple strategies to create a singleton in java in a threadsafe manner. In this project I will test the
performance of three idioms in a multithreaded environment. The idioms tested are:
  * Initialization-on-demand idiom (with a LazyHolder inner class)
  * EagerInitialization
  * Synchronized getInstance method

All benchmarks were made using [JHM Benchmark](http://openjdk.java.net/projects/code-tools/jmh/).

Tests setup:
 * Fork = 1
 * BenchmarkMode = Mode.AverageTime
 * OutputTimeUnit = TimeUnit.MICROSECONDS
 * Warmup iterations = 3
 * Measurement iterations = 10
 * Threads per test = 1000

Tests results:

|Benchmark                             |Mode | Cnt |  Score |   Error | Units
| :-                                   | :-: | :-: |   :-:  |   :-:   | :-:   
|SingletonBenchmark.EagerHolderBench   |avgt |  10 |  0.065 | ± 0.001 | us/op
|SingletonBenchmark.LazyHolderBench    |avgt |  10 |  0.064 | ± 0.001 | us/op
|SingletonBenchmark.SynchronizedBench  |avgt |  10 | 38.562 | ± 0.171 | us/op
 
 * [Formated Log](formatedlog.md)
 * [Raw log](rawlog.log)

## Synchronized getInstance method

```java
public class Synchronized {

    private static Synchronized INSTANCE;

    public static synchronized Synchronized getInstance(){
        if (INSTANCE == null)
            INSTANCE = new Synchronized();

        return INSTANCE;
    }
}
```
This approach uses the `synchronized` key word in the method signature to create or return a instance of the class.
That means every call to this method will be thread safe, and that is the problem.
Every single call to this method will create a synchronization overhead, even if the instance is already created.
Although this is a simple way to implement a threadsafe singleton, its not the most performatic.

## Eager Initialization

```java
public class EagerHolder {

    private static final EagerHolder INSTANCE = new EagerHolder();

    public static EagerHolder getInstance() {
        return INSTANCE;
    }
}
```
Uses a static constant that hold the instance of the class.
All class creations are thread safe in the JVM, that means the instance of will be created at the loading of the class.
That way all getInstance calls are as simple as a memory lookup, no synchronization envolved.

## Initialization-on-demand idiom

```java
public class LazyHolderIdiom {

    private static class LazyHolder {
        static final LazyHolderIdiom INSTANCE = new LazyHolderIdiom();
    }

    public static LazyHolderIdiom getInstance() {
        return LazyHolder.INSTANCE;
    }
}
```
This uses the same optimizations and thread safety of the JVM class creation. It achieves lazy initialization of the instance
with a inner class. Lazy initialization means that the instance of the class will only be created when the first call to the
getInstance method is made. As it is a inner class creation it is guarantied to be thread safe and the subsequent calls are,
as in the EagerInitialization, a memory lookup with no synchronization overhead.
