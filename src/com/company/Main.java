package com.company;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        String display = rectangle.toString();
        System.out.println("Your Rectangle"+ display);
        System.out.println("Diện tích hình chữ nhật : " + area);
        System.out.println("Chu vi hình chữ nhật : " + perimeter);
    }
}
