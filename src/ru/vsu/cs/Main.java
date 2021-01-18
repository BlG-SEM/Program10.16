package ru.vsu.cs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Point point11 = new Point(0, 0);
        Point point12 = new Point(8, 0);
        Point point13 = new Point(0, 8);
        Triangle triangle1 = new Triangle(point11, point12, point13);

        Point point21 = new Point(1.1, 1.2);
        Point point22 = new Point(11, 11);
        Point point23 = new Point(-5, 12);
        Triangle triangle2 = new Triangle(point21, point22, point23);

        Point point31 = new Point(-1, -1);
        Point point32 = new Point(-5, -5);
        Point point33 = new Point(-12, 12);
        Triangle triangle3 = new Triangle(point31, point32, point33);

        Point point41 = new Point(1, 1);
        Point point42 = new Point(-1, 10);
        Point point43 = new Point(-5, -10);
        Triangle triangle4 = new Triangle(point41, point42, point43);

        Point point51 = new Point(1, 1);
        Point point52 = new Point(-10, -10);
        Point point53 = new Point(12, -12);
        Triangle triangle5 = new Triangle(point51, point52, point53);

        Point point61 = new Point(-1, 1);
        Point point62 = new Point(-10, 12);
        Point point63 = new Point(12, -12);
        Triangle triangle6 = new Triangle(point61, point62, point63);

        Point point71 = new Point(1, 1);
        Point point72 = new Point(2, 2);
        Point point73 = new Point(-3, -12);
        Triangle triangle7 = new Triangle(point71, point72, point73);

        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(triangle1);
        triangleList.add(triangle2);
        triangleList.add(triangle3);
        triangleList.add(triangle4);
        triangleList.add(triangle5);
        triangleList.add(triangle6);
        triangleList.add(triangle7);

        System.out.println("List of unordered triangles:");
        TriangleUtils.printTriangleList(triangleList);

        System.out.println();

        Collections.sort(triangleList);

        System.out.println("List of triangles ordered by area:");
        TriangleUtils.printTriangleList(triangleList);
    }
}
