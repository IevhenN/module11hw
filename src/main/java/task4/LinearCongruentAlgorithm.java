package task4;

public class LinearCongruentAlgorithm {
    private long x, a, c, m;

    public LinearCongruentAlgorithm(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;

        this.x = 0;
    }

    public LinearCongruentAlgorithm setSeed(long seed) {
        this.x = seed;
        return this;
    }

    public long next() {
//        x[n + 1] = (a x[n] + c) % m
        x = (a * x + c) % m;
        return x;
    }
}
