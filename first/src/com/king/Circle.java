package com.king;

public class Circle {
	private double radius;
	public Circle() {
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return  Math.PI * radius * radius;
	}
}
