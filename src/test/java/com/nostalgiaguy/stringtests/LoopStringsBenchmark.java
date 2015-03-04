package com.nostalgiaguy.stringtests;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Thread)
public class LoopStringsBenchmark {

    private String[] strings;

    @Setup
    public void setupTest(){
        strings = new String[100];
        for(int i = 0; i<100; i++) {
            strings[i] = UUID.randomUUID().toString().substring(0, 10);
        }
    }

    @Benchmark
    public void testPlus(Blackhole bh) {
        String combined = "";
        for(String s : strings) {
            combined = combined + s;
        }
        bh.consume(combined);
    }

    @Benchmark
    public void testStringBuilder(Blackhole bh) {
        StringBuilder sb = new StringBuilder();
        for(String s : strings) {
            sb.append(s);
        }
        bh.consume(sb.toString());
    }

    @Benchmark
    public void testStringBuffer(Blackhole bh) {
        StringBuffer sb = new StringBuffer();
        for(String s : strings) {
            sb.append(s);
        }
        bh.consume(sb.toString());
    }

   /*
     @Benchmark
    public void testStringJoiner(Blackhole bh) {
        bh.consume(String.join("", strings));
    }
    */

    @Benchmark
    public void testStringConcat(Blackhole bh) {
        String combined = "";
        for(String s : strings) {
            combined.concat(s);
        }
        bh.consume(combined);
    }
}

