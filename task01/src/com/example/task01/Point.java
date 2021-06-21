package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    // Поля
    private int x;
    private int y;

    // Конструктор
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Методы
    void flip() {
        int t = x;
        x = -y;
        y = -t;
    }

    double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    public String toString(){
        return String.format("(%d,%d)", x, y);
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
