package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle(3.75);
        System.out.println("The Circle radius is  :" + circle.getRadius());
        System.out.println("The Circle area is :" + circle.getArea());
        System.out.println("***********************");
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("The Cylinder radius is : "+ cylinder.getRadius());
        System.out.println("The Cylinder height is : " + cylinder.getHeight());
        System.out.println("The Cylinder volum is :" + cylinder.getVolume());

    }
}
