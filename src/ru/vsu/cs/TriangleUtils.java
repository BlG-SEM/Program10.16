package ru.vsu.cs;

import java.util.List;

public class TriangleUtils {

    public static double calculateSquare(Point point1, Point point2, Point point3) {

        double a = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2)
                + Math.pow(point2.getY() - point1.getY(), 2));
        double b = Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2)
                + Math.pow(point3.getY() - point2.getY(), 2));
        double c = Math.sqrt(Math.pow(point1.getX() - point3.getX(), 2)
                + Math.pow(point1.getY() - point3.getY(), 2));

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void printTriangleList(List<Triangle> triangleList) {
        for (int i = 0; i < triangleList.size(); i++) {
            System.out.println((i + 1) + ". " + triangleList.get(i));
        }
    }
}
