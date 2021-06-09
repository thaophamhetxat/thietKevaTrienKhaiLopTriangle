package com.codegym;

public class Main {

    public static void main(String[] args) {
	Shape shape = new Shape("origin");
        System.out.println("color: "+shape.getColor());
        Triangle triangle = new Triangle(4.5,6.2,8.8,"origin");
        System.out.println(triangle);
    }
}
