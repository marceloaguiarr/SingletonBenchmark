# Eager
JMH version: 1.21  
VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11  
VM invoker: C:\Program Files\Java\jdk-9.0.4\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA   2017.3.4\lib\idea_rt.jar=50795:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.4\bin -Dfile.encoding=UTF-8
Warmup: 3 iterations, 10 s each  
Measurement: 10 iterations, 10 s each  
Timeout: 10 min per iteration  
Threads: 1000 threads, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: org.marceloaguiarr.SingletonBenchmark.EagerHolderBench  

* Run progress: 0.00% complete, ETA 00:06:30
* Fork: 1 of 1
* Warmup Iteration   1: 0.065 ±(99.9%) 0.001 us/op
* Warmup Iteration   2: 0.069 ±(99.9%) 0.007 us/op
* Warmup Iteration   3: 0.064 ±(99.9%) 0.001 us/op  
  * Iteration   1: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   2: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   3: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   4: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   5: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   6: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   7: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   8: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   9: 0.064 ±(99.9%) 0.001 us/op
  * Iteration  10: 0.064 ±(99.9%) 0.001 us/op


Result "org.marceloaguiarr.SingletonBenchmark.EagerHolderBench":
  * 0.065 ±(99.9%) 0.001 us/op [Average]
  * (min, avg, max) = (0.064, 0.065, 0.065), stdev = 0.001
  * CI (99.9%): [0.064, 0.065] (assumes normal distribution)

# LazyHolder
JMH version: 1.21  
VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11  
VM invoker: C:\Program Files\Java\jdk-9.0.4\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA   2017.3.4\lib\idea_rt.jar=50795:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.4\bin -Dfile.encoding=UTF-8
Warmup: 3 iterations, 10 s each  
Measurement: 10 iterations, 10 s each  
Timeout: 10 min per iteration  
Threads: 1000 threads, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: org.marceloaguiarr.SingletonBenchmark.LazyHolderBench  

* Run progress: 33.33% complete, ETA 00:19:35
* Fork: 1 of 1
* Warmup Iteration   1: 0.061 ±(99.9%) 0.002 us/op
* Warmup Iteration   2: 0.064 ±(99.9%) 0.001 us/op
* Warmup Iteration   3: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   1: 0.064 ±(99.9%) 0.001 us/op
  * Iteration   2: 0.064 ±(99.9%) 0.001 us/op
  * Iteration   3: 0.064 ±(99.9%) 0.001 us/op
  * Iteration   4: 0.064 ±(99.9%) 0.001 us/op
  * Iteration   5: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   6: 0.063 ±(99.9%) 0.001 us/op
  * Iteration   7: 0.065 ±(99.9%) 0.001 us/op
  * Iteration   8: 0.064 ±(99.9%) 0.001 us/op
  * Iteration   9: 0.064 ±(99.9%) 0.001 us/op
  * Iteration  10: 0.065 ±(99.9%) 0.001 us/op


Result "org.marceloaguiarr.SingletonBenchmark.LazyHolderBench":
  * 0.064 ±(99.9%) 0.001 us/op [Average]
  * (min, avg, max) = (0.063, 0.064, 0.065), stdev = 0.001
  * CI (99.9%): [0.064, 0.065] (assumes normal distribution)

# Synchronized
JMH version: 1.21  
VM version: JDK 9.0.4, Java HotSpot(TM) 64-Bit Server VM, 9.0.4+11  
VM invoker: C:\Program Files\Java\jdk-9.0.4\bin\java.exe  
VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA   2017.3.4\lib\idea_rt.jar=50795:C:\Program Files\JetBrains\IntelliJ IDEA 2017.3.4\bin -Dfile.encoding=UTF-8
Warmup: 3 iterations, 10 s each  
Measurement: 10 iterations, 10 s each  
Timeout: 10 min per iteration  
Threads: 1000 threads, will synchronize iterations  
Benchmark mode: Average time, time/op  
Benchmark: org.marceloaguiarr.SingletonBenchmark.SynchronizedBench  

* Run progress: 66.67% complete, ETA 00:09:44
* Fork: 1 of 1
* Warmup Iteration   1: 67.972 ±(99.9%) 10.021 us/op
* Warmup Iteration   2: 59.683 ±(99.9%) 8.017 us/op
* Warmup Iteration   3: 38.556 ±(99.9%) 1.086 us/op
  * Iteration   1: 38.504 ±(99.9%) 1.096 us/op
  * Iteration   2: 38.443 ±(99.9%) 1.067 us/op
  * Iteration   3: 38.596 ±(99.9%) 1.101 us/op
  * Iteration   4: 38.484 ±(99.9%) 1.075 us/op
  * Iteration   5: 38.340 ±(99.9%) 1.043 us/op
  * Iteration   6: 38.651 ±(99.9%) 1.112 us/op
  * Iteration   7: 38.621 ±(99.9%) 1.098 us/op
  * Iteration   8: 38.680 ±(99.9%) 1.115 us/op
  * Iteration   9: 38.665 ±(99.9%) 1.107 us/op
  * Iteration  10: 38.633 ±(99.9%) 1.094 us/op


Result "org.marceloaguiarr.SingletonBenchmark.SynchronizedBench":
  * 38.562 ±(99.9%) 0.171 us/op [Average]
  * (min, avg, max) = (38.340, 38.562, 38.680), stdev = 0.113
  * CI (99.9%): [38.391, 38.733] (assumes normal distribution)


# Run complete. Total time: 00:21:40

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

|Benchmark                             |Mode | Cnt |  Score |   Error | Units
| :-                                   | :-: | :-: |   :-:  |   :-:   | :-:   
|SingletonBenchmark.EagerHolderBench   |avgt |  10 |  0.065 | ± 0.001 | us/op
|SingletonBenchmark.LazyHolderBench    |avgt |  10 |  0.064 | ± 0.001 | us/op
|SingletonBenchmark.SynchronizedBench  |avgt |  10 | 38.562 | ± 0.171 | us/op


Process finished with exit code 0
