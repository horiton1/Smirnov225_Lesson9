package tasks.second;

public abstract class Parallelogram implements Figure {
    private final double firstSide;
    private final double secondSide;

    protected Parallelogram(double firstSide, double secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
       return firstSide * secondSide;
    }
}