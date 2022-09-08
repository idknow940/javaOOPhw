package model;

public class SimpleCounter {
    private Long startTime;

    public Long timeIt(Tester t) {
        SimpleCounter sc = new SimpleCounter();
        sc.start();
        t.test();
        return sc.end();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public Long end() {
        Long endTime = System.currentTimeMillis() - startTime;
        startTime = 0L;
        return endTime;
    }
}