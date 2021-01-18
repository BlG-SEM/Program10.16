package ru.vsu.cs;

public class Triangle implements Comparable<Triangle> {

    private Point point1;
    private Point point2;
    private Point point3;
    private double square;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        square = TriangleUtils.calculateSquare(point1, point2, point3);
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square +
                ", point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }


    @Override
    public int compareTo(Triangle o) {
        if (getSquare() < o.getSquare()) return -1;
        if (getSquare() > o.getSquare()) return 1;
        return 0;
    }
}
